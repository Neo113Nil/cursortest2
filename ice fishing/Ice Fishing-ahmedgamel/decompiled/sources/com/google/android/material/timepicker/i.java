package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* loaded from: classes2.dex */
public final class i implements View.OnTouchListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f36179n;

    public i(GestureDetector gestureDetector) {
        this.f36179n = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f36179n.onTouchEvent(motionEvent);
        }
        return false;
    }
}
