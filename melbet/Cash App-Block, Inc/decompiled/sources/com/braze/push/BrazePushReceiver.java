package com.braze.push;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.app.NotificationManagerCompat;
import bo.app.j1$$ExternalSyntheticLambda7;
import bo.app.jg$$ExternalSyntheticLambda1;
import bo.app.t7$$ExternalSyntheticLambda4;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.random.Random;
import kotlinx.coroutines.JobKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/braze/push/BrazePushReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public class BrazePushReceiver extends BroadcastReceiver {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        Companion.handleReceivedIntent$default(INSTANCE, context, intent, false, 4, null);
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\"\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J(\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0007J\u001d\u0010#\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001fH\u0001¢\u0006\u0002\b%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/braze/push/BrazePushReceiver$Companion;", "", "<init>", "()V", "MESSAGE_TYPE_KEY", "", "DELETED_MESSAGES_KEY", "NUMBER_OF_MESSAGES_DELETED_KEY", "ADM_RECEIVE_INTENT_ACTION", "ADM_REGISTRATION_INTENT_ACTION", "ADM_ERROR_KEY", "ADM_ERROR_DESCRIPTION_KEY", "ADM_REGISTRATION_ID_KEY", "ADM_UNREGISTERED_KEY", "FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION", "HMS_PUSH_SERVICE_ROUTING_ACTION", "handlePush", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "handleReceivedIntent", "runOnThread", "", "handleAdmRegistrationEventIfEnabled", "appConfigurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "handleAdmRegistrationIntent", "handlePushNotificationPayload", "createPayload", "Lcom/braze/models/push/BrazeNotificationPayload;", "notificationExtras", "Landroid/os/Bundle;", "brazeExtras", "logNotificationMetadata", "payload", "logNotificationMetadata$android_sdk_ui_release", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$0(Intent intent) {
            return "Received ADM registration. Message: " + intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$1() {
            return "ADM enabled in braze.xml. Continuing to process ADM registration intent.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$2() {
            return "ADM not enabled in braze.xml. Ignoring ADM registration intent. Note: you must set com_braze_push_adm_messaging_registration_enabled to true in your braze.xml to enable ADM.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$0(String str, String str2) {
            return CameraSelector$$ExternalSyntheticOutline0.m("Error during ADM registration: ", str, " description: ", str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$1(String str) {
            return Recorder$$ExternalSyntheticOutline2.m("Registering for ADM messages with registrationId: ", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$2(String str) {
            return Recorder$$ExternalSyntheticOutline2.m("The device was un-registered from ADM: ", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$3() {
            return "The ADM registration intent is missing error information, registration id, and unregistration confirmation. Ignoring.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handlePush(Context context, Intent intent) {
            Context applicationContext = context.getApplicationContext();
            String action = intent.getAction();
            try {
                handlePush$performWork(action, applicationContext, intent, context);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new t7$$ExternalSyntheticLambda4(13, action, intent), 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$lambda$3(String str, Intent intent) {
            return "Caught exception while performing the push notification handling work. Action: " + str + " Intent: " + intent;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r8.equals("com.amazon.device.messaging.intent.RECEIVE") == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        
            if (r8.equals("com.braze.action.STORY_TRAVERSE") == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
        
            if (r8.equals("firebase_messaging_service_routing_action") == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
        
            if (r8.equals("hms_push_service_routing_action") == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x008a, code lost:
        
            r1.handlePushNotificationPayload(r9, r10);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final void handlePush$performWork(String str, Context context, Intent intent, Context context2) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            Companion companion = BrazePushReceiver.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda28(3, intent), 6, (Object) null);
            if (str == null || str.length() == 0) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda28(4, intent), 6, (Object) null);
                return;
            }
            context.getClass();
            BrazeInternal.applyPendingRuntimeConfiguration(context);
            switch (str.hashCode()) {
                case -2147185193:
                    if (str.equals("com.braze.action.CANCEL_NOTIFICATION")) {
                        BrazeNotificationUtils.handleCancelNotificationAction(context, intent);
                        break;
                    }
                    BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(26), 6, (Object) null);
                    break;
                case -1799205286:
                    if (str.equals("com.braze.action.BRAZE_ACTION_CLICKED")) {
                        BrazeNotificationActionUtils.handleNotificationActionClicked(context2, intent);
                        break;
                    }
                    BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(26), 6, (Object) null);
                    break;
                case -1584985748:
                    break;
                case -1249868226:
                    if (str.equals("com.braze.action.BRAZE_PUSH_CLICKED")) {
                        BrazeNotificationUtils.handleNotificationOpened(context2, intent);
                        break;
                    }
                    BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(26), 6, (Object) null);
                    break;
                case -743092218:
                    if (str.equals("com.amazon.device.messaging.intent.REGISTRATION")) {
                        companion.handleAdmRegistrationEventIfEnabled(new BrazeConfigurationProvider(context), context, intent);
                        break;
                    }
                    BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(26), 6, (Object) null);
                    break;
                case -711830027:
                    break;
                case -559929808:
                    if (str.equals("com.braze.action.BRAZE_PUSH_DELETED")) {
                        BrazeNotificationUtils.handleNotificationDeleted(context, intent);
                        break;
                    }
                    BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(26), 6, (Object) null);
                    break;
                case 34673601:
                    if (str.equals("com.braze.action.BRAZE_STORY_CLICKED")) {
                        BrazeNotificationUtils.handlePushStoryPageClicked(context2, intent);
                        break;
                    }
                    BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(26), 6, (Object) null);
                    break;
                case 1060266838:
                    break;
                case 1740454061:
                    break;
                default:
                    BrazeLogger.brazelog$default(brazeLogger, (Object) companion, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(26), 6, (Object) null);
                    break;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$performWork$lambda$0(Intent intent) {
            return "Received broadcast message. Message: " + intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$performWork$lambda$1(Intent intent) {
            return "Push action is null. Not handling intent: " + intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$performWork$lambda$2() {
            return "Received a message not sent from Braze. Ignoring the message.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$0() {
            return "Not handling non-Braze push message.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$1(int i) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Firebase messaging 'total_deleted' reports ", " messages.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$10() {
            return "Notification created by notification factory was null. Not displaying notification.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$11(NotificationManagerCompat notificationManagerCompat) {
            return "Value of notificationManager.areNotificationsEnabled() = " + notificationManagerCompat.areNotificationsEnabled();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$12() {
            return "POST_NOTIFICATIONS permission has not been granted. Not posting notification.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$14() {
            return "Received silent push notification";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$2(Bundle bundle) {
            return "Push message payload received: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$3() {
            return "Push message is uninstall tracking push. Doing nothing. Not forwarding this notification to broadcast receivers.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$4$0(String str) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Push with identifier '", str, "' has already been seen. Not displaying or forwarding push.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$5() {
            return "Bypassing push display due to test in-app message presence and eager test in-app message display configuration setting.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$6() {
            return "Received visible push notification";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$7() {
            return "Push stories not supported on Amazon devices.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$8() {
            return "Received the initial Push Story notification.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$9(BrazeNotificationPayload brazeNotificationPayload) {
            return "Creating notification with payload:\n" + brazeNotificationPayload;
        }

        public static /* synthetic */ void handleReceivedIntent$default(Companion companion, Context context, Intent intent, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            companion.handleReceivedIntent(context, intent, z);
        }

        public final BrazeNotificationPayload createPayload(Context context, BrazeConfigurationProvider appConfigurationProvider, Bundle notificationExtras, Bundle brazeExtras) {
            context.getClass();
            appConfigurationProvider.getClass();
            notificationExtras.getClass();
            brazeExtras.getClass();
            return Constants.isAmazonDevice() ? new BrazeNotificationPayload(notificationExtras, BrazeNotificationPayload.INSTANCE.getAttachedBrazeExtras(notificationExtras), context, appConfigurationProvider) : new BrazeNotificationPayload(notificationExtras, brazeExtras, context, appConfigurationProvider);
        }

        public final boolean handleAdmRegistrationEventIfEnabled(BrazeConfigurationProvider appConfigurationProvider, Context context, Intent intent) {
            appConfigurationProvider.getClass();
            context.getClass();
            intent.getClass();
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda28(2, intent), 6, (Object) null);
            if (!Constants.isAmazonDevice() || !appConfigurationProvider.isAdmMessagingRegistrationEnabled()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(24), 6, (Object) null);
                return false;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(23), 7, (Object) null);
            handleAdmRegistrationIntent(context, intent);
            return true;
        }

        public final boolean handleAdmRegistrationIntent(Context context, Intent intent) {
            context.getClass();
            intent.getClass();
            String stringExtra = intent.getStringExtra(BreadcrumbHelper.Category.ERROR);
            String stringExtra2 = intent.getStringExtra("error_description");
            String stringExtra3 = intent.getStringExtra("registration_id");
            String stringExtra4 = intent.getStringExtra("unregistered");
            if (stringExtra != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new j1$$ExternalSyntheticLambda7(stringExtra, stringExtra2, 27), 6, (Object) null);
                return true;
            }
            if (stringExtra3 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(stringExtra3, 17), 6, (Object) null);
                Braze.INSTANCE.getInstance(context).setRegisteredPushToken(stringExtra3);
                return true;
            }
            if (stringExtra4 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(stringExtra4, 18), 6, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(25), 6, (Object) null);
            return false;
        }

        public final boolean handlePushNotificationPayload(Context context, Intent intent) {
            Companion companion;
            context.getClass();
            intent.getClass();
            int i = 0;
            if (!BrazeNotificationUtils.isBrazePushMessage(intent)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(27), 7, (Object) null);
                return false;
            }
            if ("deleted_messages".equals(intent.getStringExtra("message_type"))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(intent.getIntExtra("total_deleted", -1), 13), 6, (Object) null);
                return false;
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return false;
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.I;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new BrazePushReceiver$Companion$$ExternalSyntheticLambda10(extras, i), 6, (Object) null);
            Bundle attachedBrazeExtras = BrazeNotificationPayload.INSTANCE.getAttachedBrazeExtras(extras);
            extras.putBundle("extra", attachedBrazeExtras);
            if (!extras.containsKey("braze_push_received_timestamp")) {
                extras.putLong("braze_push_received_timestamp", DateTimeUtils.nowInMilliseconds());
            }
            BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
            BrazeConfigurationProvider configurationProvider = brazeInternal.getConfigurationProvider(context);
            BrazeNotificationPayload createPayload = createPayload(context, configurationProvider, extras, attachedBrazeExtras);
            if (createPayload.getIsUninstallTrackingPush()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(18), 6, (Object) null);
                return false;
            }
            String pushUniqueId = createPayload.getPushUniqueId();
            if (pushUniqueId != null && !brazeInternal.validateAndStorePushId(context, pushUniqueId)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) BrazePushReceiver.INSTANCE, priority, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(pushUniqueId, 16), 6, (Object) null);
                return false;
            }
            BrazeNotificationUtils.handleContentCardsSerializedCardIfPresent(createPayload);
            BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate(createPayload);
            BrazeNotificationUtils.refreshBannersIfAppropriate(createPayload);
            if (createPayload.getShouldFetchTestTriggers() && configurationProvider.isInAppMessageTestPushEagerDisplayEnabled() && BrazeInAppMessageManager.INSTANCE.getInstance().getActivity() != null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(19), 7, (Object) null);
                BrazeInternal.handleInAppMessageTestPush(context, intent);
                return false;
            }
            if (!BrazeNotificationUtils.isNotificationMessage(intent)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazePushReceiver$Companion$$ExternalSyntheticLambda8(i), 7, (Object) null);
                BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, createPayload);
                return false;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(20), 7, (Object) null);
            int notificationId = BrazeNotificationUtils.getNotificationId(createPayload);
            extras.putInt("nid", notificationId);
            if (createPayload.getIsPushStory()) {
                if (Constants.isAmazonDevice()) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(21), 7, (Object) null);
                    return false;
                }
                if (!extras.containsKey("braze_story_newly_received")) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(22), 7, (Object) null);
                    extras.putBoolean("braze_story_newly_received", true);
                }
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda42(createPayload, 2), 6, (Object) null);
            Notification createNotification = BrazeNotificationUtils.getActiveNotificationFactory().createNotification(createPayload);
            if (createNotification == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(28), 7, (Object) null);
                return false;
            }
            NotificationManagerCompat from = NotificationManagerCompat.from(context);
            from.getClass();
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda19(from, 6), 7, (Object) null);
            if (Strings.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0) {
                from.notify("appboy_notification", notificationId, createNotification);
                companion = this;
            } else {
                companion = this;
                BrazeLogger.brazelog$default(brazeLogger, (Object) companion, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(29), 7, (Object) null);
            }
            BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, createPayload);
            BrazeNotificationUtils.wakeScreenIfAppropriate(context, configurationProvider, extras);
            Integer pushDuration = createPayload.getPushDuration();
            if (pushDuration != null) {
                BrazeNotificationUtils.setNotificationDurationAlarm(context, BrazePushReceiver.class, notificationId, pushDuration.intValue());
            }
            companion.logNotificationMetadata$android_sdk_ui_release(context, createPayload);
            return true;
        }

        public final void handleReceivedIntent(Context context, Intent intent, boolean runOnThread) {
            context.getClass();
            intent.getClass();
            if (runOnThread) {
                JobKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new BrazePushReceiver$Companion$handleReceivedIntent$1(context, intent, null), 3);
            } else {
                handlePush(context, intent);
            }
        }

        public final void logNotificationMetadata$android_sdk_ui_release(Context context, BrazeNotificationPayload payload) {
            String campaignId;
            context.getClass();
            payload.getClass();
            if (payload.getIsPushDeliveryEnabled() && (campaignId = payload.getCampaignId()) != null) {
                long flushMinMinutes = payload.getFlushMinMinutes();
                if (flushMinMinutes < 0) {
                    flushMinMinutes = 0;
                }
                long flushMaxMinutes = payload.getFlushMaxMinutes();
                if (flushMaxMinutes < flushMinMinutes) {
                    flushMaxMinutes = flushMinMinutes;
                }
                TimeUnit timeUnit = TimeUnit.MINUTES;
                long millis = timeUnit.toMillis(flushMinMinutes);
                if (flushMaxMinutes > flushMinMinutes) {
                    Random.Default r0 = Random.Default;
                    long millis2 = timeUnit.toMillis(flushMaxMinutes);
                    r0.getClass();
                    millis = Random.defaultRandom.nextLong(millis, millis2);
                }
                BrazeInternal.INSTANCE.logPushDelivery(context, campaignId, millis);
            }
            String campaignId2 = payload.getCampaignId();
            if (campaignId2 != null) {
                BrazeInternal.INSTANCE.logPushCampaign(context, campaignId2);
            }
        }

        private Companion() {
        }
    }
}
