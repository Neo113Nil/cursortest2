package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.settings.PushMessageTracker;

/* loaded from: classes4.dex */
public final class Z1 implements U0 {
    public final PushMessageTracker a;

    public Z1(PushMessageTracker pushMessageTracker) {
        this.a = pushMessageTracker;
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void a(String str, String str2, String str3, String str4) {
        this.a.onPushOpened(str, str2, str3);
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onMessageReceived(String str, String str2, String str3) {
        this.a.onMessageReceived(str, str2, str3);
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onNotificationCleared(String str, String str2, String str3) {
        this.a.onNotificationCleared(str, str2, str3);
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onNotificationExpired(String str, String str2, String str3, String str4) {
        this.a.onNotificationExpired(str, str2, str3, str4);
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onNotificationIgnored(String str, String str2, String str3, String str4, String str5) {
        this.a.onNotificationIgnored(str, str2, str3, str4, str5);
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onNotificationReplace(String str, String str2, String str3) {
        this.a.onNotificationReplace(str, str2, str3);
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onNotificationShown(String str, String str2, String str3) {
        this.a.onNotificationShown(str, str2, str3);
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onPushTokenInited(String str, String str2) {
        this.a.onPushTokenInited(str, str2);
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onPushTokenUpdated(String str, String str2) {
        this.a.onPushTokenUpdated(str, str2);
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onRemovingSilentPushProcessed(String str, String str2, String str3, String str4, String str5) {
        this.a.onRemovingSilentPushProcessed(str, str2, str3, str4, str5);
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onSilentPushProcessed(String str, String str2, String str3) {
        this.a.onSilentPushProcessed(str, str2, str3);
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void a(String str) {
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void a(String str, String str2, String str3, String str4, String str5) {
        this.a.onNotificationAdditionalAction(str, str2, str3, str4);
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a.onNotificationInlineAdditionalAction(str, str2, str3, str4, str5);
    }
}
