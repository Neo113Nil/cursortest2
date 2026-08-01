package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2729a;

    public b(ClockFaceView clockFaceView) {
        this.f2729a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2729a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f2674t.f2689k) - clockFaceView.f2667B;
        if (height != clockFaceView.f2738r) {
            clockFaceView.f2738r = height;
            clockFaceView.n();
            int i = clockFaceView.f2738r;
            ClockHandView clockHandView = clockFaceView.f2674t;
            clockHandView.f2698t = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
