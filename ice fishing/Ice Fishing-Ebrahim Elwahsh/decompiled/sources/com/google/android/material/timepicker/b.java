package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f36338n;

    public b(ClockFaceView clockFaceView) {
        this.f36338n = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f36338n;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f36308M.f36332w) - clockFaceView.f36316U;
        if (height != clockFaceView.f36340K) {
            clockFaceView.f36340K = height;
            clockFaceView.m();
            int i = clockFaceView.f36340K;
            ClockHandView clockHandView = clockFaceView.f36308M;
            clockHandView.f36327E = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
