package com.anythink.core.common.n.b;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;

/* loaded from: classes.dex */
public abstract /* synthetic */ class A {
    public static /* synthetic */ NotificationChannel g(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* synthetic */ AudioFocusRequest.Builder i() {
        return new AudioFocusRequest.Builder(1);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest l(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* synthetic */ void w() {
    }
}
