package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;

/* renamed from: io.appmetrica.analytics.push.impl.u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1077u extends C1089y {
    public C1077u(M1 m1) {
        super(m1);
    }

    @Override // io.appmetrica.analytics.push.impl.C1089y, io.appmetrica.analytics.push.impl.U0
    public final void a(String str, String str2, String str3, String str4, String str5) {
        try {
            super.a(str, str2, str3, str4, str5);
        } catch (Exception e) {
            TrackersHub.getInstance().reportError("Try to send NotificationAdditionalAction message before appmetrica activation", e);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.C1089y, io.appmetrica.analytics.push.impl.U0
    public final void onMessageReceived(String str, String str2, String str3) {
        try {
            super.onMessageReceived(str, str2, str3);
        } catch (Exception e) {
            TrackersHub.getInstance().reportError("Try to send MessageReceived message before appmetrica activation", e);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.C1089y, io.appmetrica.analytics.push.impl.U0
    public final void onNotificationCleared(String str, String str2, String str3) {
        try {
            super.onNotificationCleared(str, str2, str3);
        } catch (Exception e) {
            TrackersHub.getInstance().reportError("Try to send NotificationCleared message before appmetrica activation", e);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.C1089y, io.appmetrica.analytics.push.impl.U0
    public final void onNotificationExpired(String str, String str2, String str3, String str4) {
        try {
            super.onNotificationExpired(str, str2, str3, str4);
        } catch (Exception e) {
            TrackersHub.getInstance().reportError("Try to send NotificationTtl message before appmetrica activation", e);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.C1089y, io.appmetrica.analytics.push.impl.U0
    public final void onNotificationIgnored(String str, String str2, String str3, String str4, String str5) {
        try {
            super.onNotificationIgnored(str, str2, str3, str4, str5);
        } catch (Exception e) {
            TrackersHub.getInstance().reportError("Try to send NotificationIgnored message before appmetrica activation", e);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.C1089y, io.appmetrica.analytics.push.impl.U0
    public final void onNotificationReplace(String str, String str2, String str3) {
        try {
            super.onNotificationReplace(str, str2, str3);
        } catch (Exception e) {
            TrackersHub.getInstance().reportError("Try to send NotificationHide message before appmetrica activation", e);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.C1089y, io.appmetrica.analytics.push.impl.U0
    public final void onNotificationShown(String str, String str2, String str3) {
        try {
            super.onNotificationShown(str, str2, str3);
        } catch (Exception e) {
            TrackersHub.getInstance().reportError("Try to send NotificationShown message before appmetrica activation", e);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.C1089y, io.appmetrica.analytics.push.impl.U0
    public final void onPushTokenInited(String str, String str2) {
        try {
            super.onPushTokenInited(str, str2);
        } catch (Exception e) {
            TrackersHub.getInstance().reportError("Try to send PushTokenInited message before appmetrica activation", e);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.C1089y, io.appmetrica.analytics.push.impl.U0
    public final void onPushTokenUpdated(String str, String str2) {
        try {
            super.onPushTokenUpdated(str, str2);
        } catch (Exception e) {
            TrackersHub.getInstance().reportError("Try to send PushTokenUpdated message before appmetrica activation", e);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.C1089y, io.appmetrica.analytics.push.impl.U0
    public final void onRemovingSilentPushProcessed(String str, String str2, String str3, String str4, String str5) {
        try {
            super.onRemovingSilentPushProcessed(str, str2, str3, str4, str5);
        } catch (Exception e) {
            TrackersHub.getInstance().reportError("Try to send RemovingSilentPushProcessed message before appmetrica activation", e);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.C1089y, io.appmetrica.analytics.push.impl.U0
    public final void onSilentPushProcessed(String str, String str2, String str3) {
        try {
            super.onSilentPushProcessed(str, str2, str3);
        } catch (Exception e) {
            TrackersHub.getInstance().reportError("Try to send SilentPushProcessed message before appmetrica activation", e);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.C1089y, io.appmetrica.analytics.push.impl.U0
    public final void a(String str, String str2, String str3, String str4) {
        try {
            super.a(str, str2, str3, str4);
        } catch (Exception e) {
            TrackersHub.getInstance().reportError("Try to send PushOpened message before appmetrica activation", e);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.C1089y, io.appmetrica.analytics.push.impl.U0
    public final void a(String str) {
        try {
            super.a(str);
        } catch (Exception e) {
            TrackersHub.getInstance().reportError("Try to send SystemInfoUpdated message before appmetrica activation", e);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.C1089y, io.appmetrica.analytics.push.impl.U0
    public final void a(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            super.a(str, str2, str3, str4, str5, str6);
        } catch (Exception e) {
            TrackersHub.getInstance().reportError("Try to send NotificationInlineAdditionalAction message before appmetrica activation", e);
        }
    }
}
