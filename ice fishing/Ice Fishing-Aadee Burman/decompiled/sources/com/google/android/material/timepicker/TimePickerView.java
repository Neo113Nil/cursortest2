package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.icefishing.icefishinglive2.C5275R;

/* loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ int f36171K = 0;
    public final Chip J;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        g gVar = new g(this);
        LayoutInflater.from(context).inflate(C5275R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C5275R.id.material_clock_period_toggle);
        materialButtonToggleGroup.f35904v.add(new f());
        Chip chip = (Chip) findViewById(C5275R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(C5275R.id.material_hour_tv);
        this.J = chip2;
        i iVar = new i(new GestureDetector(getContext(), new h(this)));
        chip.setOnTouchListener(iVar);
        chip2.setOnTouchListener(iVar);
        chip.setTag(C5275R.id.selection_type, 12);
        chip2.setTag(C5275R.id.selection_type, 10);
        chip.setOnClickListener(gVar);
        chip2.setOnClickListener(gVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.J.sendAccessibilityEvent(8);
        }
    }
}
