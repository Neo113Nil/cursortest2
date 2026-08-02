package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f36940n;

    public b(ClockFaceView clockFaceView) {
        this.f36940n = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f36940n;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f36910M.f36934w) - clockFaceView.f36918U;
        if (height != clockFaceView.f36942K) {
            clockFaceView.f36942K = height;
            clockFaceView.m();
            int i = clockFaceView.f36942K;
            ClockHandView clockHandView = clockFaceView.f36910M;
            clockHandView.f36929E = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
