package com.google.android.material.timepicker;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatPopupWindow;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ClockFaceView clockFace;
    public final ClockHandView clockHandView;
    public final Chip hourView;
    public final Chip minuteView;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$1, reason: invalid class name */
    public final class AnonymousClass1 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = TimePickerView.$r8$clinit;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$2, reason: invalid class name */
    public final class AnonymousClass2 extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            int i = TimePickerView.$r8$clinit;
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$3, reason: invalid class name */
    public final class AnonymousClass3 implements View.OnTouchListener {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object val$gestureDetector;

        public /* synthetic */ AnonymousClass3(Object obj, int i) {
            this.$r8$classId = i;
            this.val$gestureDetector = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int i = this.$r8$classId;
            Object obj = this.val$gestureDetector;
            switch (i) {
                case 0:
                    if (((Checkable) view).isChecked()) {
                        return ((GestureDetector) obj).onTouchEvent(motionEvent);
                    }
                    return false;
                default:
                    ListPopupWindow listPopupWindow = (ListPopupWindow) obj;
                    ListPopupWindow.ListSelectorHider listSelectorHider = listPopupWindow.mResizePopupRunnable;
                    Handler handler = listPopupWindow.mHandler;
                    AppCompatPopupWindow appCompatPopupWindow = listPopupWindow.mPopup;
                    int action = motionEvent.getAction();
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (action == 0 && appCompatPopupWindow != null && appCompatPopupWindow.isShowing() && x >= 0 && x < appCompatPopupWindow.getWidth() && y >= 0 && y < appCompatPopupWindow.getHeight()) {
                        handler.postDelayed(listSelectorHider, 250L);
                    } else if (action == 1) {
                        handler.removeCallbacks(listSelectorHider);
                    }
                    return false;
            }
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        this.clockFace = clockFaceView;
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.onButtonCheckedListeners.add(new TimePickerView$$ExternalSyntheticLambda0(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.minuteView = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.hourView = chip2;
        this.clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        clockFaceView.setOnEnterKeyPressedListener(new MaterialButton$$ExternalSyntheticLambda3(this, 4));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(new GestureDetector(getContext(), new AnonymousClass2()), 0);
        chip.setOnTouchListener(anonymousClass3);
        chip2.setOnTouchListener(anonymousClass3);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(anonymousClass1);
        chip2.setOnClickListener(anonymousClass1);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.hourView.sendAccessibilityEvent(8);
        }
    }

    public void setActiveSelection(int i) {
        boolean z = i == 12;
        Chip chip = this.minuteView;
        chip.setChecked(z);
        chip.setAccessibilityLiveRegion(z ? 2 : 0);
        boolean z2 = i == 10;
        Chip chip2 = this.hourView;
        chip2.setChecked(z2);
        chip2.setAccessibilityLiveRegion(z2 ? 2 : 0);
    }

    public void setAnimateOnTouchUp(boolean z) {
        this.clockHandView.setAnimateOnTouchUp(z);
    }

    public void setHandRotation(float f) {
        this.clockHandView.setHandRotation(f);
    }

    public void setHourClickDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.minuteView, accessibilityDelegateCompat);
    }

    public void setMinuteHourDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.hourView, accessibilityDelegateCompat);
    }

    public void setOnActionUpListener(ClockHandView.OnActionUpListener onActionUpListener) {
        this.clockHandView.setOnActionUpListener(onActionUpListener);
    }

    public void setValues(String[] strArr, int i) {
        this.clockFace.setValues(strArr, i);
    }

    public void setHandRotation(float f, boolean z) {
        this.clockHandView.setHandRotation(f, z);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }
}
