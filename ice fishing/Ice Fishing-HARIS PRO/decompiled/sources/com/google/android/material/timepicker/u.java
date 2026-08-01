package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class u extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TimePickerView f2772a;

    public u(TimePickerView timePickerView) {
        this.f2772a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        MaterialTimePicker materialTimePicker = this.f2772a.f2727x;
        if (materialTimePicker == null) {
            return false;
        }
        materialTimePicker.f2705F0 = 1;
        materialTimePicker.R(materialTimePicker.f2703D0);
        materialTimePicker.f2713t0.b();
        return true;
    }
}
