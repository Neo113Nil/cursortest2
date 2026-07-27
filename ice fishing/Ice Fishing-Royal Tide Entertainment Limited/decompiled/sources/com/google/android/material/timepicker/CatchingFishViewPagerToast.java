package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class CatchingFishViewPagerToast implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView CatchingFishReduxKtor;

    public CatchingFishViewPagerToast(ClockFaceView clockFaceView) {
        this.CatchingFishReduxKtor = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.CatchingFishReduxKtor;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.CatchingFishSpannableWidget.CatchingFishViewModelScope) - clockFaceView.CatchingFishFragmentFactory;
        if (height != clockFaceView.CatchingFishCoroutineFlow) {
            clockFaceView.CatchingFishCoroutineFlow = height;
            clockFaceView.CatchingFishOkHttp();
            ClockHandView clockHandView = clockFaceView.CatchingFishSpannableWidget;
            clockHandView.CatchingFishAnimationMockk = clockFaceView.CatchingFishCoroutineFlow;
            clockHandView.invalidate();
        }
        return true;
    }
}
