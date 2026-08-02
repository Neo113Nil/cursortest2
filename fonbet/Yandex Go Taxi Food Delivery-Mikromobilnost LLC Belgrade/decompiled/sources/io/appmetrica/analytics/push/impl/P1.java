package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.event.PushEvent;
import io.appmetrica.analytics.push.event.PushEventListener;

/* loaded from: classes4.dex */
public final class P1 implements U0 {
    public final PushEventListener a;

    public P1(PushEventListener pushEventListener) {
        this.a = pushEventListener;
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void a(String str, String str2, String str3, String str4) {
        this.a.onNotificationOpened(PushEvent.openEvent(str).withTransport(str3).withTargetActionUri(str4).withPayload(str2));
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onMessageReceived(String str, String str2, String str3) {
        this.a.onPushReceived(PushEvent.receiveEvent(str).withTransport(str3).withPayload(str2));
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onNotificationCleared(String str, String str2, String str3) {
        this.a.onNotificationDismissed(PushEvent.dismissEvent(str).withTransport(str3).withPayload(str2));
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onNotificationExpired(String str, String str2, String str3, String str4) {
        this.a.onNotificationExpired(PushEvent.expiredEvent(str).withTransport(str4).withPayload(str3).withCategory(str2));
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onNotificationIgnored(String str, String str2, String str3, String str4, String str5) {
        this.a.onNotificationIgnored(PushEvent.ignoredEvent(str, "", "").withTransport(str5).withPayload(str4).withCategory(str2).withDetails(str3));
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onNotificationReplace(String str, String str2, String str3) {
        this.a.onNotificationReplace(PushEvent.replaceEvent(str, str2).withTransport(str3));
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onNotificationShown(String str, String str2, String str3) {
        this.a.onNotificationShown(PushEvent.shownEvent(str).withTransport(str3).withPayload(str2));
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onPushTokenInited(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onPushTokenUpdated(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onRemovingSilentPushProcessed(String str, String str2, String str3, String str4, String str5) {
        this.a.onNotificationRemoved(PushEvent.removedEvent(str).withTransport(str5).withPayload(str4).withCategory(str2).withDetails(str3));
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onSilentPushProcessed(String str, String str2, String str3) {
        this.a.onSilentPushProcessed(PushEvent.processSilentEvent(str).withTransport(str3).withPayload(str2));
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void a(String str) {
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void a(String str, String str2, String str3, String str4, String str5) {
        this.a.onNotificationAdditionalAction(PushEvent.additionalActionEvent(str, str2).withTransport(str4).withTargetActionUri(str5).withPayload(str3));
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a.onNotificationInlineAdditionalAction(PushEvent.inlineAdditionalActionEvent(str, str2, str4).withTransport(str5).withTargetActionUri(str6).withPayload(str3));
    }
}
