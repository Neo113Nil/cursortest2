package com.braze.push;

import android.app.NotificationChannel;
import androidx.core.app.NotificationManagerCompat;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.BrazeFirebaseMessagingService;
import com.braze.push.BrazeNotificationStyleFactory;
import com.braze.push.BrazeNotificationUtils;
import com.braze.push.BrazePushReceiver;
import com.google.firebase.messaging.RemoteMessage;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BrazeNotificationUtils$$ExternalSyntheticLambda19 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ BrazeNotificationUtils$$ExternalSyntheticLambda19(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String sendPushActionIntent$lambda$0;
        String handleBrazeRemoteMessage$lambda$0;
        String handleBrazeRemoteMessage$lambda$4;
        String addNotificationActions$lambda$2;
        String conversationalPushStyle$lambda$1;
        String wakeScreenIfAppropriate$lambda$3;
        String handlePushNotificationPayload$lambda$11;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                sendPushActionIntent$lambda$0 = BrazeNotificationUtils.sendPushActionIntent$lambda$0((BrazeNotificationUtils.BrazeNotificationBroadcastType) obj);
                return sendPushActionIntent$lambda$0;
            case 1:
                handleBrazeRemoteMessage$lambda$0 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$0((RemoteMessage) obj);
                return handleBrazeRemoteMessage$lambda$0;
            case 2:
                handleBrazeRemoteMessage$lambda$4 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$4((HashMap) obj);
                return handleBrazeRemoteMessage$lambda$4;
            case 3:
                addNotificationActions$lambda$2 = BrazeNotificationActionUtils.addNotificationActions$lambda$2((BrazeNotificationPayload.ActionButton) obj);
                return addNotificationActions$lambda$2;
            case 4:
                conversationalPushStyle$lambda$1 = BrazeNotificationStyleFactory.Companion.getConversationalPushStyle$lambda$1((BrazeNotificationPayload.ConversationMessage) obj);
                return conversationalPushStyle$lambda$1;
            case 5:
                wakeScreenIfAppropriate$lambda$3 = BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$3((NotificationChannel) obj);
                return wakeScreenIfAppropriate$lambda$3;
            default:
                handlePushNotificationPayload$lambda$11 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$11((NotificationManagerCompat) obj);
                return handlePushNotificationPayload$lambda$11;
        }
    }
}
