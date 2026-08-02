package com.google.android.gms.internal.ads;

import android.graphics.drawable.AnimationDrawable;
import android.widget.RelativeLayout;

/* renamed from: com.google.android.gms.internal.ads.hb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3325hb extends RelativeLayout {

    /* renamed from: u, reason: collision with root package name */
    public static final float[] f31578u = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: n, reason: collision with root package name */
    public AnimationDrawable f31579n;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f31579n;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
