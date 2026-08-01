package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.lumenpath.harispro.hrnavigator.R;

/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f2719y = 0;

    /* renamed from: q, reason: collision with root package name */
    public final Chip f2720q;

    /* renamed from: r, reason: collision with root package name */
    public final Chip f2721r;

    /* renamed from: s, reason: collision with root package name */
    public final ClockHandView f2722s;

    /* renamed from: t, reason: collision with root package name */
    public final ClockFaceView f2723t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialButtonToggleGroup f2724u;

    /* renamed from: v, reason: collision with root package name */
    public m f2725v;

    /* renamed from: w, reason: collision with root package name */
    public m f2726w;

    /* renamed from: x, reason: collision with root package name */
    public MaterialTimePicker f2727x;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        t tVar = new t(0, this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        this.f2723t = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f2724u = materialButtonToggleGroup;
        materialButtonToggleGroup.f2435c.add(new s(0, this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.f2720q = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f2721r = chip2;
        this.f2722s = (ClockHandView) findViewById(R.id.material_clock_hand);
        v vVar = new v(new GestureDetector(getContext(), new u(this)));
        chip.setOnTouchListener(vVar);
        chip2.setOnTouchListener(vVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(tVar);
        chip2.setOnClickListener(tVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f2721r.sendAccessibilityEvent(8);
        }
    }
}
