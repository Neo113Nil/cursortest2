package io.appmetrica.analytics.push.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.i3y;
import io.appmetrica.analytics.push.AppMetricaPush;
import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import io.appmetrica.analytics.push.impl.AbstractC1035h;
import io.appmetrica.analytics.push.impl.AbstractC1038h2;
import io.appmetrica.analytics.push.impl.AbstractC1070r1;
import io.appmetrica.analytics.push.impl.C1011b;
import io.appmetrica.analytics.push.impl.F1;
import io.appmetrica.analytics.push.impl.S0;
import io.appmetrica.analytics.push.impl.r;
import io.appmetrica.analytics.push.intent.NotificationActionInfo;
import io.appmetrica.analytics.push.intent.NotificationActionType;
import io.appmetrica.analytics.push.internal.activity.AppMetricaPushDummyActivity;
import io.appmetrica.analytics.push.internal.receiver.AppMetricaPushBroadcastReceiver;
import io.appmetrica.analytics.push.model.AdditionalAction;
import io.appmetrica.analytics.push.model.AdditionalActionType;
import io.appmetrica.analytics.push.model.OpenType;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.notification.ExtraBundleProvider;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007J \u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\"\u0010\u0015\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\bH\u0007J \u0010\u0016\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bH\u0007¨\u0006\u0017"}, d2 = {"Lio/appmetrica/analytics/push/internal/IntentHelper;", "", "Lio/appmetrica/analytics/push/intent/NotificationActionType;", "actionType", "Lio/appmetrica/analytics/push/model/PushMessage;", "pushMessage", "", "actionUri", "Lio/appmetrica/analytics/push/intent/NotificationActionInfo;", "createNotificationActionInfo", "Lio/appmetrica/analytics/push/model/AdditionalAction;", "additionalAction", "Landroid/content/Context;", "context", "actionInfo", "", "autoTracking", "Landroid/app/PendingIntent;", "createWrappedAction", "Lio/appmetrica/analytics/push/model/PushNotification;", "pushNotification", "getPendingIntentForOpenAction", "getPendingIntentForAdditionalAction", "push_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class IntentHelper {
    public static final IntentHelper INSTANCE = new IntentHelper();
    private static final i3y a = a.a(S0.a);

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OpenType.values().length];
            iArr[OpenType.APPLICATION_ACTIVITY.ordinal()] = 1;
            iArr[OpenType.TRANSPARENT_ACTIVITY.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private IntentHelper() {
    }

    private static NotificationActionInfo a(NotificationActionType notificationActionType, PushMessage pushMessage, String str, AdditionalAction additionalAction) {
        Integer num;
        String channelId;
        PushNotification notification = pushMessage.getNotification();
        Boolean explicitIntent = notification != null ? notification.getExplicitIntent() : null;
        NotificationActionInfo.Builder withTargetActionUri = NotificationActionInfo.newBuilder(pushMessage.getTransport()).withPayload(pushMessage.getPayload()).withPushId(pushMessage.getNotificationId()).withActionType(notificationActionType).withTargetActionUri(str);
        PushNotification notification2 = pushMessage.getNotification();
        NotificationActionInfo.Builder withNotificationTag = withTargetActionUri.withNotificationTag(notification2 != null ? notification2.getNotificationTag() : null);
        PushNotification notification3 = pushMessage.getNotification();
        boolean z = false;
        if (notification3 == null || (num = notification3.getNotificationId()) == null) {
            num = 0;
        }
        NotificationActionInfo.Builder withNotificationId = withNotificationTag.withNotificationId(num.intValue());
        PushNotification notification4 = pushMessage.getNotification();
        if (CoreUtils.isEmpty(notification4 != null ? notification4.getChannelId() : null)) {
            channelId = "appmetrica_push";
        } else {
            PushNotification notification5 = pushMessage.getNotification();
            channelId = notification5 != null ? notification5.getChannelId() : null;
        }
        NotificationActionInfo.Builder withUseFlagActivityNewTask = withNotificationId.withChannelId(channelId).withUseFlagActivityNewTask(pushMessage.getNotification().getUseFlagActivityNewTask());
        ExtraBundleProvider extraBundleProvider = AbstractC1070r1.a.getExtraBundleProvider();
        if (extraBundleProvider != null) {
            withUseFlagActivityNewTask.withExtraBundle(extraBundleProvider.getExtraBundle(pushMessage));
        }
        if (additionalAction != null) {
            withUseFlagActivityNewTask.withActionId(additionalAction.getId());
            withUseFlagActivityNewTask.withUseFlagActivityNewTask(additionalAction.getUseFlagActivityNewTask());
            if (additionalAction.getHideAfterSecond() != null) {
                withUseFlagActivityNewTask.withHideAfterSeconds(additionalAction.getHideAfterSecond().longValue());
            }
            if (additionalAction.getHideQuickControlPanel() != null) {
                withUseFlagActivityNewTask.withHideQuickControlPanel(additionalAction.getHideQuickControlPanel().booleanValue());
            }
            if (additionalAction.getAutoCancel() != null) {
                withUseFlagActivityNewTask.withDismissOnAdditionalAction(additionalAction.getAutoCancel().booleanValue());
            }
            if (additionalAction.getType() != null) {
                if (additionalAction.getType() == AdditionalActionType.OPEN_APP_URI) {
                    explicitIntent = Boolean.TRUE;
                }
                if (additionalAction.getType() == AdditionalActionType.DO_NOTHING) {
                    withUseFlagActivityNewTask.withDoNothing(true);
                }
            } else {
                explicitIntent = additionalAction.getExplicitIntent();
            }
        }
        if (explicitIntent != null && explicitIntent.booleanValue()) {
            z = true;
        }
        withUseFlagActivityNewTask.withExplicitIntent(z);
        return withUseFlagActivityNewTask.build();
    }

    public static final NotificationActionInfo createNotificationActionInfo(PushMessage pushMessage, AdditionalAction additionalAction) {
        NotificationActionType notificationActionType = additionalAction.getType() == AdditionalActionType.INLINE ? NotificationActionType.INLINE_ACTION : NotificationActionType.ADDITIONAL_ACTION;
        IntentHelper intentHelper = INSTANCE;
        String actionUrl = additionalAction.getActionUrl();
        intentHelper.getClass();
        return a(notificationActionType, pushMessage, actionUrl, additionalAction);
    }

    public static final PendingIntent createWrappedAction(Context context, NotificationActionInfo actionInfo, boolean autoTracking) {
        Intent intent;
        if (autoTracking) {
            intent = null;
        } else {
            INSTANCE.getClass();
            C1011b c1011b = (C1011b) a.getValue();
            String str = actionInfo.targetActionUri;
            c1011b.getClass();
            intent = C1011b.a(context, str);
        }
        if (intent == null) {
            intent = new Intent(AppMetricaPushBroadcastReceiver.ACTION_BROADCAST_ACTION);
            intent.putExtra(AppMetricaPush.EXTRA_ACTION_INFO, actionInfo);
            intent.setPackage(context.getPackageName());
            if (actionInfo.useFlagActivityNewTask) {
                intent.addFlags(SelfTester_JCP.IMITA);
            }
        } else {
            intent.putExtra(AppMetricaPush.EXTRA_ACTION_INFO, actionInfo);
            Bundle bundle = actionInfo.extraBundle;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            if (actionInfo.explicitIntent) {
                intent.setPackage(context.getPackageName());
            }
            intent.putExtra(AppMetricaPush.EXTRA_PAYLOAD, actionInfo.payload);
        }
        int a2 = AbstractC1038h2.a(context);
        int a3 = F1.a(actionInfo.actionType == NotificationActionType.INLINE_ACTION);
        return autoTracking ? PendingIntent.getBroadcast(context, a2, intent, a3) : PendingIntent.getActivity(context, a2, intent, a3);
    }

    public static final PendingIntent getPendingIntentForAdditionalAction(Context context, AdditionalAction additionalAction, NotificationActionInfo actionInfo) {
        IntentHelper intentHelper = INSTANCE;
        OpenType openType = additionalAction.getOpenType();
        intentHelper.getClass();
        if (openType == OpenType.UNKNOWN) {
            openType = AbstractC1035h.a(31) ? actionInfo.doNothing ? OpenType.BROADCAST : OpenType.TRANSPARENT_ACTIVITY : OpenType.BROADCAST;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[openType.ordinal()];
        if (i == 1) {
            return createWrappedAction(context, actionInfo, false);
        }
        if (i != 2) {
            return createWrappedAction(context, actionInfo, r.a(context).f.a().isTrackingAdditionalAction(additionalAction.getId()));
        }
        Intent intent = new Intent(context, (Class<?>) AppMetricaPushDummyActivity.class);
        intent.putExtra(AppMetricaPush.EXTRA_ACTION_INFO, actionInfo);
        intent.setPackage(context.getPackageName());
        intent.addFlags(1073741824);
        intent.addFlags(SelfTester_JCP.IMITA);
        intent.addFlags(SelfTester_JCP.DECRYPT_CBC);
        return PendingIntent.getActivity(context, AbstractC1038h2.a(context), intent, F1.a(actionInfo.actionType == NotificationActionType.INLINE_ACTION));
    }

    public static final PendingIntent getPendingIntentForOpenAction(Context context, PushNotification pushNotification, NotificationActionInfo actionInfo) {
        OpenType openType;
        IntentHelper intentHelper = INSTANCE;
        if (pushNotification == null || (openType = pushNotification.getOpenType()) == null) {
            openType = OpenType.UNKNOWN;
        }
        intentHelper.getClass();
        if (openType == OpenType.UNKNOWN) {
            openType = AbstractC1035h.a(31) ? actionInfo.doNothing ? OpenType.BROADCAST : OpenType.TRANSPARENT_ACTIVITY : OpenType.BROADCAST;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[openType.ordinal()];
        if (i == 1) {
            return createWrappedAction(context, actionInfo, false);
        }
        if (i != 2) {
            return createWrappedAction(context, actionInfo, r.a(context).f.a().trackingOpenAction);
        }
        Intent intent = new Intent(context, (Class<?>) AppMetricaPushDummyActivity.class);
        intent.putExtra(AppMetricaPush.EXTRA_ACTION_INFO, actionInfo);
        intent.setPackage(context.getPackageName());
        intent.addFlags(1073741824);
        intent.addFlags(SelfTester_JCP.IMITA);
        intent.addFlags(SelfTester_JCP.DECRYPT_CBC);
        return PendingIntent.getActivity(context, AbstractC1038h2.a(context), intent, F1.a(actionInfo.actionType == NotificationActionType.INLINE_ACTION));
    }

    public static final NotificationActionInfo createNotificationActionInfo(NotificationActionType actionType, PushMessage pushMessage, String actionUri) {
        INSTANCE.getClass();
        return a(actionType, pushMessage, actionUri, null);
    }
}
