package com.braze.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.core.app.RemoteInput;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¨\u0006\u0015"}, d2 = {"Lcom/braze/push/BrazeNotificationActionUtils;", "", "<init>", "()V", "addNotificationActions", "", "notificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "payload", "Lcom/braze/models/push/BrazeNotificationPayload;", "handleNotificationActionClicked", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "addNotificationAction", "actionButton", "Lcom/braze/models/push/BrazeNotificationPayload$ActionButton;", "logNotificationActionClicked", "actionType", "", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BrazeNotificationActionUtils {
    public static final BrazeNotificationActionUtils INSTANCE = new BrazeNotificationActionUtils();

    private BrazeNotificationActionUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationAction$lambda$0() {
        return "Cannot add notification action with null context from payload";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationAction$lambda$1(String str) {
        return "Adding notification action with type: " + str + "Setting intent class to notification receiver: " + BrazeNotificationUtils.getNotificationReceiverClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationAction$lambda$2(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Adding notification action with type: ", str, " Setting intent class to trampoline activity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationAction$lambda$3(Bundle bundle) {
        return "Added action with bundle: " + bundle;
    }

    public static final void addNotificationActions(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        notificationBuilder.getClass();
        payload.getClass();
        if (payload.getContext() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(9), 7, (Object) null);
            return;
        }
        List<BrazeNotificationPayload.ActionButton> actionButtons = payload.getActionButtons();
        if (actionButtons.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(10), 7, (Object) null);
            return;
        }
        for (BrazeNotificationPayload.ActionButton actionButton : actionButtons) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationActionUtils brazeNotificationActionUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationActionUtils, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda19(actionButton, 3), 6, (Object) null);
            brazeNotificationActionUtils.addNotificationAction(notificationBuilder, payload, actionButton);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationActions$lambda$0() {
        return "Context cannot be null when adding notification buttons.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationActions$lambda$1() {
        return "No action buttons present. Not adding notification actions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationActions$lambda$2(BrazeNotificationPayload.ActionButton actionButton) {
        return "Adding action button: " + actionButton;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4 A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:3:0x000a, B:5:0x0012, B:8:0x001a, B:10:0x0028, B:17:0x003f, B:20:0x005c, B:23:0x0068, B:25:0x006e, B:27:0x0075, B:29:0x0082, B:31:0x0088, B:32:0x0095, B:34:0x00a4, B:37:0x00a8, B:39:0x0092, B:40:0x0048, B:43:0x0051, B:45:0x0055, B:48:0x00ba, B:50:0x00cc), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8 A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:3:0x000a, B:5:0x0012, B:8:0x001a, B:10:0x0028, B:17:0x003f, B:20:0x005c, B:23:0x0068, B:25:0x006e, B:27:0x0075, B:29:0x0082, B:31:0x0088, B:32:0x0095, B:34:0x00a4, B:37:0x00a8, B:39:0x0092, B:40:0x0048, B:43:0x0051, B:45:0x0055, B:48:0x00ba, B:50:0x00cc), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void handleNotificationActionClicked(Context context, Intent intent) {
        Bundle extras;
        context.getClass();
        intent.getClass();
        try {
            String stringExtra = intent.getStringExtra("braze_action_type");
            if (stringExtra != null && !StringsKt.isBlank(stringExtra)) {
                int intExtra = intent.getIntExtra("nid", -1);
                BrazeNotificationActionUtils brazeNotificationActionUtils = INSTANCE;
                brazeNotificationActionUtils.logNotificationActionClicked(context, intent, stringExtra);
                if (stringExtra != null) {
                    int hashCode = stringExtra.hashCode();
                    if (hashCode == -1424488370) {
                        if (!stringExtra.equals("ab_uri")) {
                        }
                        BrazeNotificationUtils.cancelNotification(context, intExtra);
                        if (stringExtra.equals("ab_uri")) {
                        }
                        intent.removeExtra("uri");
                        BrazeNotificationUtils.sendNotificationOpenedBroadcast(context, intent);
                        if (BrazeInternal.INSTANCE.getConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                        }
                    } else if (hashCode != -1209677674) {
                        if (hashCode == -1209647192 && stringExtra.equals("ab_open")) {
                            BrazeNotificationUtils.cancelNotification(context, intExtra);
                            if (stringExtra.equals("ab_uri") || (extras = intent.getExtras()) == null || !extras.containsKey("braze_action_uri")) {
                                intent.removeExtra("uri");
                            } else {
                                intent.putExtra("uri", intent.getStringExtra("braze_action_uri"));
                                Bundle extras2 = intent.getExtras();
                                if (extras2 != null && extras2.containsKey("braze_action_use_webview")) {
                                    intent.putExtra("ab_use_webview", intent.getStringExtra("braze_action_use_webview"));
                                }
                            }
                            BrazeNotificationUtils.sendNotificationOpenedBroadcast(context, intent);
                            if (BrazeInternal.INSTANCE.getConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeNotificationActionUtils, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(6), 6, (Object) null);
                                return;
                            } else {
                                BrazeNotificationUtils.routeUserWithNotificationOpenedIntent(context, intent);
                                return;
                            }
                        }
                    } else if (stringExtra.equals("ab_none")) {
                        BrazeNotificationUtils.cancelNotification(context, intExtra);
                        return;
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeNotificationActionUtils, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(7), 6, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(5), 6, (Object) null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(8), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationActionClicked$lambda$0() {
        return "Notification action button type was blank or null. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationActionClicked$lambda$1() {
        return "Not handling deep links automatically, skipping deep link handling";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationActionClicked$lambda$2() {
        return "Unknown notification action button clicked. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationActionClicked$lambda$3() {
        return "Caught exception while handling notification action button click.";
    }

    public final void addNotificationAction(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload, BrazeNotificationPayload.ActionButton actionButton) {
        PendingIntent activity;
        notificationBuilder.getClass();
        payload.getClass();
        actionButton.getClass();
        Context context = payload.getContext();
        if (context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationFactory$$ExternalSyntheticLambda0(11), 7, (Object) null);
            return;
        }
        Bundle bundle = new Bundle(payload.getNotificationExtras());
        actionButton.putIntoBundle(bundle);
        String type2 = actionButton.getType();
        int immutablePendingIntentFlags = 134217728 | IntentUtils.getImmutablePendingIntentFlags();
        if ("ab_none".equals(type2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(type2, 7), 6, (Object) null);
            Intent intent = new Intent("com.braze.action.BRAZE_ACTION_CLICKED").setClass(context, BrazeNotificationUtils.getNotificationReceiverClass());
            intent.getClass();
            intent.putExtras(bundle);
            activity = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, immutablePendingIntentFlags);
            activity.getClass();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(type2, 8), 6, (Object) null);
            Intent intent2 = new Intent("com.braze.action.BRAZE_ACTION_CLICKED").setClass(context, NotificationTrampolineActivity.class);
            intent2.getClass();
            intent2.setFlags(intent2.getFlags() | BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_ACTION_WITH_DEEPLINK));
            intent2.putExtras(bundle);
            activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent2, immutablePendingIntentFlags);
            activity.getClass();
        }
        PendingIntent pendingIntent = activity;
        String text = actionButton.getText();
        Bundle bundle2 = new Bundle();
        CharSequence limitCharSequenceLength = NotificationCompat.Builder.limitCharSequenceLength(text);
        bundle2.putAll(new Bundle(bundle));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty()) {
        }
        notificationBuilder.mActions.add(new NotificationCompat.Action(null, limitCharSequenceLength, pendingIntent, bundle2, arrayList2.isEmpty() ? null : (RemoteInput[]) arrayList2.toArray(new RemoteInput[arrayList2.size()])));
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazePushReceiver$Companion$$ExternalSyntheticLambda10(bundle, 1), 6, (Object) null);
    }

    public final void logNotificationActionClicked(Context context, Intent intent, String actionType) {
        context.getClass();
        intent.getClass();
        Braze.INSTANCE.getInstance(context).logPushNotificationActionClicked(intent.getStringExtra("cid"), intent.getStringExtra("braze_action_id"), actionType);
    }
}
