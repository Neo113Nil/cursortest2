package com.icefishinggame.icefishinggamemultigames;

import android.os.Handler;
import android.view.View;

/* loaded from: classes2.dex */
public final class p implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IntroActivity f36929a;

    public p(IntroActivity introActivity) {
        this.f36929a = introActivity;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        int i6 = IntroActivity.f36774y;
        new Handler().postDelayed(new G0.c(22, this), com.anythink.expressad.video.module.a.a.m.ai);
    }
}
