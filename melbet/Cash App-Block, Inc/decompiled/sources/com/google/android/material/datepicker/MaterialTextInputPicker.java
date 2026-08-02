package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.TtsSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.SingleDateSelector.AnonymousClass1;
import com.google.android.material.internal.ViewUtils$$ExternalSyntheticLambda0;
import com.google.android.material.textfield.TextInputLayout;
import com.squareup.cash.R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import sqip.internal.GiftCardEditor$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public final class MaterialTextInputPicker<S> extends PickerFragment {
    public CalendarConstraints calendarConstraints;
    public SingleDateSelector dateSelector;
    public int themeResId;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.themeResId = bundle.getInt("THEME_RES_ID_KEY");
        this.dateSelector = (SingleDateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.calendarConstraints = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
    
        if ((r2 != null ? r2.toLowerCase(java.util.Locale.ENGLISH) : "").equals("samsung") != false) goto L16;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.themeResId));
        SingleDateSelector singleDateSelector = this.dateSelector;
        CalendarConstraints calendarConstraints = this.calendarConstraints;
        MaterialDatePicker.AnonymousClass2 anonymousClass2 = new MaterialDatePicker.AnonymousClass2(this, 1);
        singleDateSelector.getClass();
        View inflate = cloneInContext.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.editText;
        Integer colorOrNull = MaterialColors.getColorOrNull(inflate.getContext(), R.attr.colorOnSurfaceVariant);
        if (colorOrNull != null) {
            editText.setHintTextColor(colorOrNull.intValue());
        }
        String str = Build.MANUFACTURER;
        if (!(str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("lge")) {
        }
        editText.setInputType(17);
        AtomicReference atomicReference = UtcDates.timeSourceRef;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y"), Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        simpleDateFormat.setLenient(false);
        Resources resources = inflate.getResources();
        String pattern = simpleDateFormat.toPattern();
        String string2 = resources.getString(R.string.mtrl_picker_text_input_year_abbr);
        String string3 = resources.getString(R.string.mtrl_picker_text_input_month_abbr);
        String string4 = resources.getString(R.string.mtrl_picker_text_input_day_abbr);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", "d").replaceAll("M+", "M").replaceAll("y+", "y");
        }
        String replace = pattern.replace("d", string4).replace("M", string3).replace("y", string2);
        SpannableString spannableString = new SpannableString(replace);
        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), 0, spannableString.length(), 33);
        textInputLayout.setPlaceholderText(spannableString);
        Long l = singleDateSelector.selectedItem;
        if (l != null) {
            editText.setText(simpleDateFormat.format(l));
            Editable text = editText.getText();
            if (text != null) {
                editText.setSelection(text.length());
            }
        }
        editText.addTextChangedListener(singleDateSelector.new AnonymousClass1(replace, simpleDateFormat, textInputLayout, calendarConstraints, anonymousClass2, textInputLayout));
        AccessibilityManager accessibilityManager = (AccessibilityManager) inflate.getContext().getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return inflate;
        }
        EditText[] editTextArr = {editText};
        editTextArr[0].setOnFocusChangeListener(new GiftCardEditor$$ExternalSyntheticLambda0(editTextArr, 1));
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new ViewUtils$$ExternalSyntheticLambda0(editText2, 3), 100L);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.themeResId);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.calendarConstraints);
    }
}
