package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.video.Recorder;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.window.PopupLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.arcade.protocol.host.arcade.AccessibilityRoleImpl;
import com.google.android.material.R$styleable;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.TextBlock;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public class ClockFaceView extends RadialViewGroup {
    public final int clockHandPadding;
    public final ClockHandView clockHandView;
    public final int clockSize;
    public float currentHandRotation;
    public final int[] gradientColors;
    public final float[] gradientPositions;
    public final int minimumHeight;
    public final int minimumWidth;
    public OnEnterKeyPressedListener onEnterKeyPressedListener;
    public final RectF scratch;
    public final Rect scratchLineBounds;
    public final ColorStateList textColor;
    public final SparseArray textViewPool;
    public final Rect textViewRect;
    public final AnonymousClass2 valueAccessibilityDelegate;
    public String[] values;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$2, reason: invalid class name */
    public final class AnonymousClass2 extends AccessibilityDelegateCompat {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass2(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            switch (this.$r8$classId) {
                case 4:
                    super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                    accessibilityEvent.setChecked(((CheckableImageButton) this.this$0).checked);
                    break;
                default:
                    super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                    break;
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            String str;
            int i = this.$r8$classId;
            Object obj = this.this$0;
            View.AccessibilityDelegate accessibilityDelegate = this.mOriginalDelegate;
            switch (i) {
                case 0:
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                    int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
                    if (intValue > 0) {
                        accessibilityNodeInfoCompat.setTraversalAfter((View) ((ClockFaceView) obj).textViewPool.get(intValue - 1));
                    }
                    accessibilityNodeInfoCompat.setCollectionItemInfo(Recorder.AnonymousClass6.obtain(view.isSelected(), 0, 1, intValue, 1));
                    accessibilityNodeInfoCompat.setClickable(true);
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                    break;
                case 1:
                    AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.mInfo;
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                    if (!((BottomSheetDialog) obj).cancelable) {
                        accessibilityNodeInfo.setDismissable(false);
                        break;
                    } else {
                        accessibilityNodeInfoCompat.addAction(PKIFailureInfo.badCertTemplate);
                        accessibilityNodeInfo.setDismissable(true);
                        break;
                    }
                case 2:
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                    MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                    int i2 = MaterialButtonToggleGroup.$r8$clinit;
                    int i3 = -1;
                    if (view instanceof MaterialButton) {
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            if (i4 < materialButtonToggleGroup.getChildCount()) {
                                if (materialButtonToggleGroup.getChildAt(i4) == view) {
                                    i3 = i5;
                                } else {
                                    if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i4).getVisibility() != 8) {
                                        i5++;
                                    }
                                    i4++;
                                }
                            }
                        }
                    }
                    accessibilityNodeInfoCompat.setCollectionItemInfo(Recorder.AnonymousClass6.obtain(((MaterialButton) view).checked, 0, 1, i3, 1));
                    break;
                case 3:
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                    MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, materialCalendar.dayFrame.getVisibility() == 0 ? materialCalendar.getString(R.string.mtrl_picker_toggle_to_year_selection) : materialCalendar.getString(R.string.mtrl_picker_toggle_to_day_selection)));
                    break;
                case 4:
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                    CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                    accessibilityNodeInfoCompat.setCheckable(checkableImageButton.checkable);
                    accessibilityNodeInfoCompat.setChecked(checkableImageButton.checked);
                    break;
                case 5:
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                    NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) obj;
                    accessibilityNodeInfoCompat.setCheckable(navigationMenuItemView.checkable);
                    accessibilityNodeInfoCompat.setRoleDescription(navigationMenuItemView.getResources().getString(R.string.item_view_role_description));
                    break;
                case 6:
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                    accessibilityNodeInfoCompat.addAction(PKIFailureInfo.badCertTemplate);
                    accessibilityNodeInfoCompat.mInfo.setDismissable(true);
                    break;
                case 7:
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                    accessibilityNodeInfoCompat.setText(((EditText) view).getText());
                    accessibilityNodeInfoCompat.mInfo.setHintText(((ChipTextInputComboView) obj).label.getText());
                    accessibilityNodeInfoCompat.setMaxTextLength(2);
                    break;
                case 8:
                    view.getClass();
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                    switch (((AccessibilityRoleImpl) obj).role.ordinal()) {
                        case 0:
                            str = "Adjustable";
                            break;
                        case 1:
                            str = "Alert";
                            break;
                        case 2:
                        case 7:
                            str = Role.m946toStringimpl(0);
                            break;
                        case 3:
                            str = Role.m946toStringimpl(1);
                            break;
                        case 4:
                            str = "Combo box";
                            break;
                        case 5:
                            str = "Header";
                            break;
                        case 6:
                            str = Role.m946toStringimpl(5);
                            break;
                        case 8:
                            str = "Keyboard key";
                            break;
                        case 9:
                            str = "Link";
                            break;
                        case 10:
                            str = "Menu";
                            break;
                        case 11:
                            str = "Menu bar";
                            break;
                        case 12:
                            str = "Menu item";
                            break;
                        case 13:
                            str = null;
                            break;
                        case 14:
                            str = "Progress bar";
                            break;
                        case 15:
                            str = Role.m946toStringimpl(3);
                            break;
                        case 16:
                            str = "Radio group";
                            break;
                        case 17:
                            str = "Scrollbar";
                            break;
                        case 18:
                            str = "Search";
                            break;
                        case 19:
                            str = Role.m946toStringimpl(6);
                            break;
                        case 20:
                            str = "Summary";
                            break;
                        case 21:
                        case 26:
                            str = Role.m946toStringimpl(2);
                            break;
                        case 22:
                            str = Role.m946toStringimpl(4);
                            break;
                        case 23:
                            str = "Tab list";
                            break;
                        case 24:
                            str = "Text";
                            break;
                        case 25:
                            str = "Timer";
                            break;
                        case 27:
                            str = "Toolbar";
                            break;
                        case 28:
                            str = "Grid";
                            break;
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                    }
                    accessibilityNodeInfoCompat.setRoleDescription(str);
                    break;
                case 9:
                    view.getClass();
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                    accessibilityNodeInfoCompat.setRoleDescription(((View) obj).getContext().getString(R.string.pi2_accessibility_role_button));
                    break;
                case 10:
                    view.getClass();
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                    accessibilityNodeInfoCompat.mInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(((TextBlock.ListTextBlock) obj).textBlocks.size(), 1, false));
                    break;
                default:
                    view.getClass();
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
                    accessibilityNodeInfoCompat.mInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((Integer) obj).intValue(), 1, 0, 1, false));
                    break;
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            int i2 = this.$r8$classId;
            Object obj = this.this$0;
            switch (i2) {
                case 0:
                    ClockFaceView clockFaceView = (ClockFaceView) obj;
                    ClockHandView clockHandView = clockFaceView.clockHandView;
                    Rect rect = clockFaceView.textViewRect;
                    if (i != 16) {
                        break;
                    } else {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        view.getHitRect(rect);
                        float centerX = rect.centerX();
                        float centerY = rect.centerY();
                        clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
                        clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
                        break;
                    }
                case 1:
                    if (i == 1048576) {
                        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) obj;
                        if (bottomSheetDialog.cancelable) {
                            bottomSheetDialog.cancel();
                            break;
                        }
                    }
                    break;
                case 6:
                    if (i != 1048576) {
                        break;
                    } else {
                        ((Snackbar) ((BaseTransientBottomBar) obj)).dispatchDismiss(3);
                        break;
                    }
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    public interface OnEnterKeyPressedListener {
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.textViewRect = new Rect();
        this.scratch = new RectF();
        this.scratchLineBounds = new Rect();
        this.textViewPool = new SparseArray();
        this.gradientPositions = new float[]{RecyclerView.DECELERATION_RATE, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClockFaceView, i, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateList = ContextUtilsKt.getColorStateList(context, obtainStyledAttributes, 1);
        this.textColor = colorStateList;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.clockHandView = clockHandView;
        this.clockHandPadding = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateList.getColorForState(new int[]{android.R.attr.state_selected}, colorStateList.getDefaultColor());
        this.gradientColors = new int[]{colorForState, colorForState, colorStateList.getDefaultColor()};
        clockHandView.listeners.add(this);
        int defaultColor = ResourcesCompat.getColorStateList(context.getResources(), R.color.material_timepicker_clockface, context.getTheme()).getDefaultColor();
        int i2 = 0;
        ColorStateList colorStateList2 = ContextUtilsKt.getColorStateList(context, obtainStyledAttributes, 0);
        setBackgroundColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : defaultColor);
        obtainStyledAttributes.recycle();
        setOutlineProvider(new PopupLayout.AnonymousClass2(2));
        setFocusable(true);
        setClipToOutline(true);
        this.valueAccessibilityDelegate = new AnonymousClass2(this, i2);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        setValues(strArr, 0);
        this.minimumHeight = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.minimumWidth = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.clockSize = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    public final void findIntersectingTextView() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.clockHandView.selectorBox;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.textViewPool;
            int size = sparseArray.size();
            rect = this.textViewRect;
            rectF = this.scratch;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f) {
                    textView = textView2;
                    f = height;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.scratchLineBounds);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.gradientColors, this.gradientPositions, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) Toolbar.AnonymousClass1.obtain(1, this.values.length, 1).this$0);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2;
        int length;
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.textViewPool;
            if (i3 >= sparseArray.size()) {
                i2 = -1;
                break;
            }
            TextView textView = (TextView) sparseArray.valueAt(i3);
            if (textView.isSelected()) {
                i2 = ((Integer) textView.getTag(R.id.material_value_index)).intValue();
                break;
            }
            i3++;
        }
        if (!isShown() || i2 == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i != 66) {
            switch (i) {
                case 19:
                case 22:
                    length = (i2 + 1) % this.values.length;
                    break;
                case 20:
                case 21:
                    String[] strArr = this.values;
                    length = ((i2 - 1) + strArr.length) % strArr.length;
                    break;
                case 23:
                    break;
                default:
                    return super.onKeyDown(i, keyEvent);
            }
            if (length == i2) {
                return super.onKeyDown(i, keyEvent);
            }
            int i4 = (length / 12) + 1;
            ClockHandView clockHandView = this.clockHandView;
            if (i4 != clockHandView.currentLevel) {
                clockHandView.currentLevel = i4;
                clockHandView.invalidate();
            }
            setHandRotation((length % 12) * 30.0f);
            return true;
        }
        OnEnterKeyPressedListener onEnterKeyPressedListener = this.onEnterKeyPressedListener;
        if (onEnterKeyPressedListener != null) {
            ((TimePickerView) ((MaterialButton$$ExternalSyntheticLambda3) onEnterKeyPressedListener).f$0).hourView.isChecked();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        findIntersectingTextView();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.clockSize / Math.max(Math.max(this.minimumHeight / displayMetrics.heightPixels, this.minimumWidth / displayMetrics.widthPixels), 1.0f));
        if (View.MeasureSpec.getMode(i) != 0) {
            max = Math.min(max, View.MeasureSpec.getSize(i));
        }
        if (View.MeasureSpec.getMode(i2) != 0) {
            max = Math.min(max, View.MeasureSpec.getSize(i2));
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int i3 = ((max / 2) - this.clockHandView.selectorRadius) - this.clockHandPadding;
        if (i3 != this.radius) {
            setRadius(i3);
        }
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setHandRotation(float f) {
        this.clockHandView.setHandRotation(f);
        findIntersectingTextView();
    }

    public void setOnEnterKeyPressedListener(OnEnterKeyPressedListener onEnterKeyPressedListener) {
        this.onEnterKeyPressedListener = onEnterKeyPressedListener;
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void setRadius(int i) {
        if (i != this.radius) {
            super.setRadius(i);
            this.clockHandView.setCircleRadius(this.radius);
        }
    }

    public void setValues(String[] strArr, int i) {
        this.values = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        SparseArray sparseArray = this.textViewPool;
        int size = sparseArray.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.values.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.values.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.values[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i3));
                if (i3 > 1) {
                    z = true;
                }
                ViewCompat.setAccessibilityDelegate(textView, this.valueAccessibilityDelegate);
                textView.setTextColor(this.textColor);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.values[i2]));
                }
            }
        }
        ClockHandView clockHandView = this.clockHandView;
        if (clockHandView.isMultiLevel && !z) {
            clockHandView.currentLevel = 1;
        }
        clockHandView.isMultiLevel = z;
        clockHandView.invalidate();
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public final void updateLayoutParams() {
        super.updateLayoutParams();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.textViewPool;
            if (i >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i)).setVisibility(0);
            i++;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockFaceView(Context context) {
        this(context, null);
    }
}
