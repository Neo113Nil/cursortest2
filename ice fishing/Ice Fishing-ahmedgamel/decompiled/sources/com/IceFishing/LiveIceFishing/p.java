package com.IceFishing.LiveIceFishing;

import android.os.Handler;
import android.view.View;

/* loaded from: classes.dex */
public final class p implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IntroActivity f6418a;

    public p(IntroActivity introActivity) {
        this.f6418a = introActivity;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        int i4 = IntroActivity.f6264y;
        new Handler().postDelayed(new G0.c(20, this), com.anythink.expressad.video.module.a.a.m.ai);
    }
}
