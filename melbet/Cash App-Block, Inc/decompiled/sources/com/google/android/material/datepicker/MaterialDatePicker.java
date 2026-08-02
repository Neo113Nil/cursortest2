package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.TooltipCompat$Api26Impl;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.common.util.LongArrayQueue;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.MemoryCacheService;
import coil3.size.DimensionKt;
import com.google.android.material.R$styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment;
import com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda2;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.selfie.SelfieUtilsKt;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class MaterialDatePicker<S> extends DialogFragment {
    public MaterialShapeDrawable background;
    public MaterialCalendar calendar;
    public CalendarConstraints calendarConstraints;
    public Button confirmButton;
    public SingleDateSelector dateSelector;
    public boolean edgeToEdgeEnabled;
    public CharSequence fullTitleText;
    public boolean fullscreen;
    public TextView headerSelectionText;
    public TextView headerTitleTextView;
    public CheckableImageButton headerToggleButton;
    public int inputMode;
    public CharSequence negativeButtonContentDescription;
    public int negativeButtonContentDescriptionResId;
    public CharSequence negativeButtonText;
    public int negativeButtonTextResId;
    public int overrideThemeResId;
    public PickerFragment pickerFragment;
    public CharSequence positiveButtonContentDescription;
    public int positiveButtonContentDescriptionResId;
    public CharSequence positiveButtonText;
    public int positiveButtonTextResId;
    public CharSequence singleLineTitleText;
    public CharSequence titleText;
    public int titleTextResId;
    public final LinkedHashSet onPositiveButtonClickListeners = new LinkedHashSet();
    public final LinkedHashSet onNegativeButtonClickListeners = new LinkedHashSet();
    public final LinkedHashSet onCancelListeners = new LinkedHashSet();
    public final LinkedHashSet onDismissListeners = new LinkedHashSet();

    /* renamed from: com.google.android.material.datepicker.MaterialDatePicker$2, reason: invalid class name */
    public final class AnonymousClass2 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Fragment this$0;

        public /* synthetic */ AnonymousClass2(Fragment fragment, int i) {
            this.$r8$classId = i;
            this.this$0 = fragment;
        }

        public final void onIncompleteSelectionChanged() {
            int i = this.$r8$classId;
            Fragment fragment = this.this$0;
            switch (i) {
                case 0:
                    ((MaterialDatePicker) fragment).confirmButton.setEnabled(false);
                    break;
                default:
                    Iterator it = ((MaterialTextInputPicker) fragment).onSelectionChangedListeners.iterator();
                    while (it.hasNext()) {
                        ((AnonymousClass2) it.next()).onIncompleteSelectionChanged();
                    }
                    break;
            }
        }

        public final void onSelectionChanged(Object obj) {
            int i = this.$r8$classId;
            Fragment fragment = this.this$0;
            switch (i) {
                case 0:
                    MaterialDatePicker materialDatePicker = (MaterialDatePicker) fragment;
                    materialDatePicker.updateHeader(materialDatePicker.getHeaderText());
                    materialDatePicker.confirmButton.setEnabled(materialDatePicker.getDateSelector().selectedItem != null);
                    break;
                default:
                    Iterator it = ((MaterialTextInputPicker) fragment).onSelectionChangedListeners.iterator();
                    while (it.hasNext()) {
                        ((AnonymousClass2) it.next()).onSelectionChanged(obj);
                    }
                    break;
            }
        }
    }

    public static int getPaddedPickerWidth(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        todayCalendar.set(5, 1);
        Calendar dayCopy = UtcDates.getDayCopy(todayCalendar);
        dayCopy.get(2);
        dayCopy.get(1);
        int maximum = dayCopy.getMaximum(7);
        dayCopy.getActualMaximum(5);
        dayCopy.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean readMaterialCalendarStyleBoolean(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.resolveTypedValueOrThrow(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public final SingleDateSelector getDateSelector() {
        if (this.dateSelector == null) {
            this.dateSelector = (SingleDateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.dateSelector;
    }

    public final String getHeaderText() {
        SingleDateSelector dateSelector = getDateSelector();
        Context context = getContext();
        dateSelector.getClass();
        Resources resources = context.getResources();
        Long l = dateSelector.selectedItem;
        return l == null ? resources.getString(R.string.mtrl_picker_date_header_unselected) : resources.getString(R.string.mtrl_picker_date_header_selected, DateStrings.getYearMonthDay(l.longValue()));
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.onCancelListeners.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.overrideThemeResId = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.dateSelector = (SingleDateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.calendarConstraints = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            a$$ExternalSyntheticBUOutline0.m$1();
            return;
        }
        this.titleTextResId = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.titleText = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.inputMode = bundle.getInt("INPUT_MODE_KEY");
        this.positiveButtonTextResId = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.positiveButtonText = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.positiveButtonContentDescriptionResId = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.positiveButtonContentDescription = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.negativeButtonTextResId = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.negativeButtonText = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.negativeButtonContentDescriptionResId = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.negativeButtonContentDescription = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.titleText;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.titleTextResId);
        }
        this.fullTitleText = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.singleLineTitleText = charSequence;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        Context requireContext2 = requireContext();
        int i = this.overrideThemeResId;
        if (i == 0) {
            getDateSelector().getClass();
            i = MaterialAttributes.resolveTypedValueOrThrow(requireContext2, R.attr.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName()).data;
        }
        Dialog dialog = new Dialog(requireContext, i);
        Context context = dialog.getContext();
        this.fullscreen = readMaterialCalendarStyleBoolean(context, android.R.attr.windowFullscreen);
        this.background = new MaterialShapeDrawable(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.MaterialCalendar, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.background.initializeElevationOverlay(context);
        this.background.setFillColor(ColorStateList.valueOf(color));
        this.background.setElevation(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.fullscreen ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.fullscreen) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(getPaddedPickerWidth(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(getPaddedPickerWidth(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.headerSelectionText = textView;
        final int i = 1;
        textView.setAccessibilityLiveRegion(1);
        this.headerToggleButton = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.headerTitleTextView = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.headerToggleButton.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.headerToggleButton;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, DimensionKt.getDrawable(context, R.drawable.material_ic_calendar_black_24dp));
        final int i2 = 0;
        stateListDrawable.addState(new int[0], DimensionKt.getDrawable(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.headerToggleButton.setChecked(this.inputMode != 0);
        ViewCompat.setAccessibilityDelegate(this.headerToggleButton, null);
        CheckableImageButton checkableImageButton2 = this.headerToggleButton;
        this.headerToggleButton.setContentDescription(this.inputMode == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        CheckableImageButton checkableImageButton3 = this.headerToggleButton;
        TooltipCompat$Api26Impl.setTooltipText(this.headerToggleButton, this.inputMode == 1 ? checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
        final int i3 = 2;
        this.headerToggleButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.MaterialDatePicker$$ExternalSyntheticLambda0
            public final /* synthetic */ MaterialDatePicker f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                MaterialDatePicker materialDatePicker = this.f$0;
                switch (i4) {
                    case 0:
                        Iterator it = materialDatePicker.onPositiveButtonClickListeners.iterator();
                        while (it.hasNext()) {
                            NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda2 nfcMrzDataManualEntryFragment$$ExternalSyntheticLambda2 = (NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda2) it.next();
                            Long l = materialDatePicker.getDateSelector().selectedItem;
                            int i5 = nfcMrzDataManualEntryFragment$$ExternalSyntheticLambda2.$r8$classId;
                            NfcMrzDataManualEntryFragment.d dVar = (NfcMrzDataManualEntryFragment.d) nfcMrzDataManualEntryFragment$$ExternalSyntheticLambda2.f$0;
                            switch (i5) {
                                case 0:
                                    NfcMrzDataManualEntryFragment.Companion companion = NfcMrzDataManualEntryFragment.Companion;
                                    dVar.invoke(l);
                                    break;
                                default:
                                    NfcMrzDataManualEntryFragment.Companion companion2 = NfcMrzDataManualEntryFragment.Companion;
                                    dVar.invoke(l);
                                    break;
                            }
                        }
                        materialDatePicker.dismiss();
                        break;
                    case 1:
                        Iterator it2 = materialDatePicker.onNegativeButtonClickListeners.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        materialDatePicker.dismiss();
                        break;
                    default:
                        materialDatePicker.confirmButton.setEnabled(materialDatePicker.getDateSelector().selectedItem != null);
                        materialDatePicker.headerToggleButton.toggle();
                        int i6 = materialDatePicker.inputMode != 1 ? 1 : 0;
                        materialDatePicker.inputMode = i6;
                        CheckableImageButton checkableImageButton4 = materialDatePicker.headerToggleButton;
                        materialDatePicker.headerToggleButton.setContentDescription(i6 == 1 ? checkableImageButton4.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton4.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
                        CheckableImageButton checkableImageButton5 = materialDatePicker.headerToggleButton;
                        TooltipCompat$Api26Impl.setTooltipText(materialDatePicker.headerToggleButton, materialDatePicker.inputMode == 1 ? checkableImageButton5.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton5.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
                        materialDatePicker.startPickerFragment();
                        break;
                }
            }
        });
        this.confirmButton = (Button) inflate.findViewById(R.id.confirm_button);
        boolean z = getDateSelector().selectedItem != null;
        Button button = this.confirmButton;
        if (z) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
        this.confirmButton.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.positiveButtonText;
        if (charSequence != null) {
            this.confirmButton.setText(charSequence);
        } else {
            int i4 = this.positiveButtonTextResId;
            if (i4 != 0) {
                this.confirmButton.setText(i4);
            }
        }
        CharSequence charSequence2 = this.positiveButtonContentDescription;
        if (charSequence2 != null) {
            this.confirmButton.setContentDescription(charSequence2);
        } else if (this.positiveButtonContentDescriptionResId != 0) {
            this.confirmButton.setContentDescription(getContext().getResources().getText(this.positiveButtonContentDescriptionResId));
        }
        this.confirmButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.MaterialDatePicker$$ExternalSyntheticLambda0
            public final /* synthetic */ MaterialDatePicker f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i2;
                MaterialDatePicker materialDatePicker = this.f$0;
                switch (i42) {
                    case 0:
                        Iterator it = materialDatePicker.onPositiveButtonClickListeners.iterator();
                        while (it.hasNext()) {
                            NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda2 nfcMrzDataManualEntryFragment$$ExternalSyntheticLambda2 = (NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda2) it.next();
                            Long l = materialDatePicker.getDateSelector().selectedItem;
                            int i5 = nfcMrzDataManualEntryFragment$$ExternalSyntheticLambda2.$r8$classId;
                            NfcMrzDataManualEntryFragment.d dVar = (NfcMrzDataManualEntryFragment.d) nfcMrzDataManualEntryFragment$$ExternalSyntheticLambda2.f$0;
                            switch (i5) {
                                case 0:
                                    NfcMrzDataManualEntryFragment.Companion companion = NfcMrzDataManualEntryFragment.Companion;
                                    dVar.invoke(l);
                                    break;
                                default:
                                    NfcMrzDataManualEntryFragment.Companion companion2 = NfcMrzDataManualEntryFragment.Companion;
                                    dVar.invoke(l);
                                    break;
                            }
                        }
                        materialDatePicker.dismiss();
                        break;
                    case 1:
                        Iterator it2 = materialDatePicker.onNegativeButtonClickListeners.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        materialDatePicker.dismiss();
                        break;
                    default:
                        materialDatePicker.confirmButton.setEnabled(materialDatePicker.getDateSelector().selectedItem != null);
                        materialDatePicker.headerToggleButton.toggle();
                        int i6 = materialDatePicker.inputMode != 1 ? 1 : 0;
                        materialDatePicker.inputMode = i6;
                        CheckableImageButton checkableImageButton4 = materialDatePicker.headerToggleButton;
                        materialDatePicker.headerToggleButton.setContentDescription(i6 == 1 ? checkableImageButton4.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton4.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
                        CheckableImageButton checkableImageButton5 = materialDatePicker.headerToggleButton;
                        TooltipCompat$Api26Impl.setTooltipText(materialDatePicker.headerToggleButton, materialDatePicker.inputMode == 1 ? checkableImageButton5.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton5.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
                        materialDatePicker.startPickerFragment();
                        break;
                }
            }
        });
        Button button2 = (Button) inflate.findViewById(R.id.cancel_button);
        button2.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.negativeButtonText;
        if (charSequence3 != null) {
            button2.setText(charSequence3);
        } else {
            int i5 = this.negativeButtonTextResId;
            if (i5 != 0) {
                button2.setText(i5);
            }
        }
        CharSequence charSequence4 = this.negativeButtonContentDescription;
        if (charSequence4 != null) {
            button2.setContentDescription(charSequence4);
        } else if (this.negativeButtonContentDescriptionResId != 0) {
            button2.setContentDescription(getContext().getResources().getText(this.negativeButtonContentDescriptionResId));
        }
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.MaterialDatePicker$$ExternalSyntheticLambda0
            public final /* synthetic */ MaterialDatePicker f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i;
                MaterialDatePicker materialDatePicker = this.f$0;
                switch (i42) {
                    case 0:
                        Iterator it = materialDatePicker.onPositiveButtonClickListeners.iterator();
                        while (it.hasNext()) {
                            NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda2 nfcMrzDataManualEntryFragment$$ExternalSyntheticLambda2 = (NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda2) it.next();
                            Long l = materialDatePicker.getDateSelector().selectedItem;
                            int i52 = nfcMrzDataManualEntryFragment$$ExternalSyntheticLambda2.$r8$classId;
                            NfcMrzDataManualEntryFragment.d dVar = (NfcMrzDataManualEntryFragment.d) nfcMrzDataManualEntryFragment$$ExternalSyntheticLambda2.f$0;
                            switch (i52) {
                                case 0:
                                    NfcMrzDataManualEntryFragment.Companion companion = NfcMrzDataManualEntryFragment.Companion;
                                    dVar.invoke(l);
                                    break;
                                default:
                                    NfcMrzDataManualEntryFragment.Companion companion2 = NfcMrzDataManualEntryFragment.Companion;
                                    dVar.invoke(l);
                                    break;
                            }
                        }
                        materialDatePicker.dismiss();
                        break;
                    case 1:
                        Iterator it2 = materialDatePicker.onNegativeButtonClickListeners.iterator();
                        while (it2.hasNext()) {
                            ((View.OnClickListener) it2.next()).onClick(view);
                        }
                        materialDatePicker.dismiss();
                        break;
                    default:
                        materialDatePicker.confirmButton.setEnabled(materialDatePicker.getDateSelector().selectedItem != null);
                        materialDatePicker.headerToggleButton.toggle();
                        int i6 = materialDatePicker.inputMode != 1 ? 1 : 0;
                        materialDatePicker.inputMode = i6;
                        CheckableImageButton checkableImageButton4 = materialDatePicker.headerToggleButton;
                        materialDatePicker.headerToggleButton.setContentDescription(i6 == 1 ? checkableImageButton4.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton4.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
                        CheckableImageButton checkableImageButton5 = materialDatePicker.headerToggleButton;
                        TooltipCompat$Api26Impl.setTooltipText(materialDatePicker.headerToggleButton, materialDatePicker.inputMode == 1 ? checkableImageButton5.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton5.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
                        materialDatePicker.startPickerFragment();
                        break;
                }
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.onDismissListeners.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.overrideThemeResId);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.dateSelector);
        CalendarConstraints calendarConstraints = this.calendarConstraints;
        CalendarConstraints.Builder builder = new CalendarConstraints.Builder();
        builder.start = CalendarConstraints.Builder.DEFAULT_START;
        builder.end = CalendarConstraints.Builder.DEFAULT_END;
        builder.validator = new DateValidatorPointForward(Long.MIN_VALUE);
        builder.start = calendarConstraints.start.timeInMillis;
        builder.end = calendarConstraints.end.timeInMillis;
        builder.openAt = Long.valueOf(calendarConstraints.openAt.timeInMillis);
        builder.firstDayOfWeek = calendarConstraints.firstDayOfWeek;
        builder.validator = calendarConstraints.validator;
        MaterialCalendar materialCalendar = this.calendar;
        Month month = materialCalendar == null ? null : materialCalendar.current;
        if (month != null) {
            builder.openAt = Long.valueOf(month.timeInMillis);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", builder.build());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.titleTextResId);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.titleText);
        bundle.putInt("INPUT_MODE_KEY", this.inputMode);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.positiveButtonTextResId);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.positiveButtonText);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.positiveButtonContentDescriptionResId);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.positiveButtonContentDescription);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.negativeButtonTextResId);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.negativeButtonText);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.negativeButtonContentDescriptionResId);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.negativeButtonContentDescription);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.fullscreen) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.background);
            if (!this.edgeToEdgeEnabled) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListOrNull = SelfieUtilsKt.getColorStateListOrNull(findViewById.getBackground());
                Integer valueOf = colorStateListOrNull != null ? Integer.valueOf(colorStateListOrNull.getDefaultColor()) : null;
                boolean z = valueOf == null || valueOf.intValue() == 0;
                Integer colorOrNull = MaterialColors.getColorOrNull(window.getContext(), android.R.attr.colorBackground);
                int intValue = colorOrNull != null ? colorOrNull.intValue() : -16777216;
                if (z) {
                    valueOf = Integer.valueOf(intValue);
                }
                Trace.setDecorFitsSystemWindows(window, false);
                window.getContext();
                window.getContext();
                int i = Build.VERSION.SDK_INT;
                if (i < 35) {
                    window.setStatusBarColor(0);
                }
                if (i < 35) {
                    window.setNavigationBarColor(0);
                }
                boolean z2 = MaterialColors.isColorLight(0) || MaterialColors.isColorLight(valueOf.intValue());
                MemoryCacheService memoryCacheService = new MemoryCacheService(window.getDecorView());
                (i >= 35 ? new WindowInsetsControllerCompat.Impl35(window, memoryCacheService) : i >= 30 ? new WindowInsetsControllerCompat.Impl30(window, memoryCacheService) : new WindowInsetsControllerCompat.Impl26(window, memoryCacheService)).setAppearanceLightStatusBars(z2);
                boolean z3 = MaterialColors.isColorLight(0) || MaterialColors.isColorLight(intValue);
                MemoryCacheService memoryCacheService2 = new MemoryCacheService(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new WindowInsetsControllerCompat.Impl35(window, memoryCacheService2) : i2 >= 30 ? new WindowInsetsControllerCompat.Impl30(window, memoryCacheService2) : new WindowInsetsControllerCompat.Impl26(window, memoryCacheService2)).setAppearanceLightNavigationBars(z3);
                LongArrayQueue longArrayQueue = new LongArrayQueue(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight());
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(findViewById, longArrayQueue);
                this.edgeToEdgeEnabled = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.background, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(requireDialog(), rect));
        }
        startPickerFragment();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.pickerFragment.onSelectionChangedListeners.clear();
        super.onStop();
    }

    public final void startPickerFragment() {
        Context requireContext = requireContext();
        int i = this.overrideThemeResId;
        if (i == 0) {
            getDateSelector().getClass();
            i = MaterialAttributes.resolveTypedValueOrThrow(requireContext, R.attr.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName()).data;
        }
        String str = this.inputMode == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG";
        Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag(str);
        PickerFragment pickerFragment = findFragmentByTag instanceof PickerFragment ? (PickerFragment) findFragmentByTag : null;
        if (pickerFragment == null) {
            if (this.inputMode == 1) {
                SingleDateSelector dateSelector = getDateSelector();
                CalendarConstraints calendarConstraints = this.calendarConstraints;
                MaterialTextInputPicker materialTextInputPicker = new MaterialTextInputPicker();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i);
                bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
                materialTextInputPicker.setArguments(bundle);
                pickerFragment = materialTextInputPicker;
            } else {
                SingleDateSelector dateSelector2 = getDateSelector();
                CalendarConstraints calendarConstraints2 = this.calendarConstraints;
                MaterialCalendar materialCalendar = new MaterialCalendar();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i);
                bundle2.putParcelable("GRID_SELECTOR_KEY", dateSelector2);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle2.putParcelable("CURRENT_MONTH_KEY", calendarConstraints2.openAt);
                materialCalendar.setArguments(bundle2);
                this.calendar = materialCalendar;
                pickerFragment = materialCalendar;
            }
        }
        this.pickerFragment = pickerFragment;
        pickerFragment.addOnSelectionChangedListener(new AnonymousClass2(this, 0));
        this.headerTitleTextView.setText((this.inputMode == 1 && getResources().getConfiguration().orientation == 2) ? this.singleLineTitleText : this.fullTitleText);
        updateHeader(getHeaderText());
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        BackStackRecord backStackRecord = new BackStackRecord(childFragmentManager);
        backStackRecord.replace(R.id.mtrl_calendar_frame, str, this.pickerFragment);
        backStackRecord.commitNow();
    }

    public final void updateHeader(String str) {
        TextView textView = this.headerSelectionText;
        SingleDateSelector dateSelector = getDateSelector();
        Context requireContext = requireContext();
        dateSelector.getClass();
        Resources resources = requireContext.getResources();
        Long l = dateSelector.selectedItem;
        textView.setContentDescription(resources.getString(R.string.mtrl_picker_announce_current_selection, l == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : DateStrings.getYearMonthDay(l.longValue())));
        this.headerSelectionText.setText(str);
    }
}
