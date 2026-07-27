package com.anythink.basead.exoplayer.k;

import android.app.NotificationChannel;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioFocusRequest;

/* loaded from: classes.dex */
public abstract /* synthetic */ class A {
    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ NotificationChannel h(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* synthetic */ AudioFocusRequest.Builder j() {
        return new AudioFocusRequest.Builder(1);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest m(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* synthetic */ void v() {
    }

    public static /* bridge */ /* synthetic */ boolean y(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }
}
