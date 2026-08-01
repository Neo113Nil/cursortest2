package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f36173n;

    public b(ClockFaceView clockFaceView) {
        this.f36173n = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f36173n;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f36143M.f36167w) - clockFaceView.f36151U;
        if (height != clockFaceView.f36175K) {
            clockFaceView.f36175K = height;
            clockFaceView.m();
            int i = clockFaceView.f36175K;
            ClockHandView clockHandView = clockFaceView.f36143M;
            clockHandView.f36162E = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
