package io.appmetrica.analytics.push.event;

import android.content.Intent;
import io.appmetrica.analytics.push.AppMetricaPush;
import io.appmetrica.analytics.push.impl.T0;
import io.appmetrica.analytics.push.intent.NotificationActionInfo;
import io.appmetrica.analytics.push.intent.NotificationActionType;

/* loaded from: classes4.dex */
public abstract class PushEvent {
    public static AdditionalActionPushEvent additionalActionEvent(String str, String str2) {
        return new AdditionalActionPushEvent(str).withActionId(str2);
    }

    public static DismissPushEvent dismissEvent(String str) {
        return new DismissPushEvent(str);
    }

    public static ExpiredPushEvent expiredEvent(String str) {
        return new ExpiredPushEvent(str);
    }

    public static PushEvent fromIntent(Intent intent) {
        NotificationActionInfo notificationActionInfo = (NotificationActionInfo) intent.getParcelableExtra(AppMetricaPush.EXTRA_ACTION_INFO);
        if ((notificationActionInfo != null ? notificationActionInfo.pushId : null) != null) {
            NotificationActionType notificationActionType = notificationActionInfo.actionType;
            int i = notificationActionType == null ? -1 : T0.a[notificationActionType.ordinal()];
            if (i == 1) {
                return dismissEvent(notificationActionInfo.pushId).withTransport(notificationActionInfo.transport).withPayload(notificationActionInfo.payload);
            }
            if (i == 2) {
                return openEvent(notificationActionInfo.pushId).withTransport(notificationActionInfo.transport).withTargetActionUri(notificationActionInfo.targetActionUri).withPayload(notificationActionInfo.payload);
            }
            if (i == 3) {
                return additionalActionEvent(notificationActionInfo.pushId, notificationActionInfo.actionId).withTransport(notificationActionInfo.transport).withTargetActionUri(notificationActionInfo.targetActionUri).withPayload(notificationActionInfo.payload);
            }
            if (i == 4) {
                return inlineAdditionalActionEvent(notificationActionInfo.pushId, notificationActionInfo.actionId, "").withTransport(notificationActionInfo.transport).withTargetActionUri(notificationActionInfo.targetActionUri).withPayload(notificationActionInfo.payload);
            }
        }
        return null;
    }

    public static IgnoredPushEvent ignoredEvent(String str, String str2, String str3) {
        return new IgnoredPushEvent(str).withCategory(str2).withDetails(str3);
    }

    public static InlineAdditionalActionPushEvent inlineAdditionalActionEvent(String str, String str2, String str3) {
        return new InlineAdditionalActionPushEvent(str, str3).withActionId(str2);
    }

    public static OpenPushEvent openEvent(String str) {
        return new OpenPushEvent(str);
    }

    public static ProcessSilentPushEvent processSilentEvent(String str) {
        return new ProcessSilentPushEvent(str);
    }

    public static ReceivePushEvent receiveEvent(String str) {
        return new ReceivePushEvent(str);
    }

    public static RemovedPushEvent removedEvent(String str) {
        return new RemovedPushEvent(str);
    }

    public static ReplacePushEvent replaceEvent(String str, String str2) {
        return new ReplacePushEvent(str).withNewPushId(str2);
    }

    public static ShownPushEvent shownEvent(String str) {
        return new ShownPushEvent(str);
    }
}
