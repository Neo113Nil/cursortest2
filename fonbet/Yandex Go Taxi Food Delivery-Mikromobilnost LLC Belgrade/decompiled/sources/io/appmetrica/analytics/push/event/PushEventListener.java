package io.appmetrica.analytics.push.event;

/* loaded from: classes4.dex */
public abstract class PushEventListener {
    public void onNotificationAdditionalAction(AdditionalActionPushEvent additionalActionPushEvent) {
    }

    public void onNotificationDismissed(DismissPushEvent dismissPushEvent) {
    }

    public void onNotificationExpired(ExpiredPushEvent expiredPushEvent) {
    }

    public void onNotificationIgnored(IgnoredPushEvent ignoredPushEvent) {
    }

    public void onNotificationInlineAdditionalAction(InlineAdditionalActionPushEvent inlineAdditionalActionPushEvent) {
    }

    public void onNotificationOpened(OpenPushEvent openPushEvent) {
    }

    public void onNotificationRemoved(RemovedPushEvent removedPushEvent) {
    }

    public void onNotificationReplace(ReplacePushEvent replacePushEvent) {
    }

    public void onNotificationShown(ShownPushEvent shownPushEvent) {
    }

    public void onPushReceived(ReceivePushEvent receivePushEvent) {
    }

    public void onSilentPushProcessed(ProcessSilentPushEvent processSilentPushEvent) {
    }
}
