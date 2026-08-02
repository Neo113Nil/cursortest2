package io.flutter.embedding.android;

import defpackage.ctr;

/* loaded from: classes4.dex */
public final class d implements ctr {
    public final /* synthetic */ io.flutter.embedding.engine.renderer.f a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ FlutterView c;

    public d(FlutterView flutterView, io.flutter.embedding.engine.renderer.f fVar, Runnable runnable) {
        this.c = flutterView;
        this.a = fVar;
        this.b = runnable;
    }

    @Override // defpackage.ctr
    public final void onFlutterUiDisplayed() {
        FlutterImageView flutterImageView;
        FlutterImageView flutterImageView2;
        this.a.a.removeIsDisplayingFlutterUiListener(this);
        this.b.run();
        FlutterView flutterView = this.c;
        if (flutterView.renderSurface instanceof FlutterImageView) {
            return;
        }
        flutterImageView = flutterView.flutterImageView;
        if (flutterImageView != null) {
            flutterImageView2 = flutterView.flutterImageView;
            flutterImageView2.detachFromRenderer();
            flutterView.releaseImageView();
        }
    }

    @Override // defpackage.ctr
    public final void onFlutterUiNoLongerDisplayed() {
    }
}
