package com.google.android.play.core.hsdp.service;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class HsdpLoadingPanelContainer extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public Runnable f36947n;

    public HsdpLoadingPanelContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Runnable runnable = this.f36947n;
        if (runnable != null) {
            removeCallbacks(runnable);
            post(this.f36947n);
        }
    }

    public void setOnConfigurationChangedListener(Runnable runnable) {
        this.f36947n = runnable;
    }
}
