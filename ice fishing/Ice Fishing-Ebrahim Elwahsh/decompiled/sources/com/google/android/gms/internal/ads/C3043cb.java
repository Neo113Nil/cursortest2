package com.google.android.gms.internal.ads;

import android.graphics.drawable.AnimationDrawable;
import android.widget.RelativeLayout;

/* renamed from: com.google.android.gms.internal.ads.cb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3043cb extends RelativeLayout {

    /* renamed from: u, reason: collision with root package name */
    public static final float[] f29714u = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: n, reason: collision with root package name */
    public AnimationDrawable f29715n;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f29715n;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
