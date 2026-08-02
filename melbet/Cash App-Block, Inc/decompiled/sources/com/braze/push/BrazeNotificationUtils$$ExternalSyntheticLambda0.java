package com.braze.push;

import com.braze.push.BrazeFirebaseMessagingService;
import com.braze.push.BrazeNotificationStyleFactory;
import com.braze.push.BrazePushReceiver;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BrazeNotificationUtils$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ BrazeNotificationUtils$$ExternalSyntheticLambda0(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String invokeFallbackFirebaseService$lambda$4;
        String invokeFallbackFirebaseService$lambda$5;
        String handleBrazeRemoteMessage$lambda$1;
        String invokeFallbackFirebaseService$lambda$0;
        String invokeFallbackFirebaseService$lambda$1;
        String invokeFallbackFirebaseService$lambda$2;
        String addNotificationAction$lambda$1;
        String addNotificationAction$lambda$2;
        String bigPictureNotificationStyle$lambda$0;
        String handlePushNotificationPayload$lambda$4$0;
        String handleAdmRegistrationIntent$lambda$1;
        String handleAdmRegistrationIntent$lambda$2;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                return BrazeNotificationUtils.handlePushStoryPageClicked$lambda$0(str);
            case 1:
                invokeFallbackFirebaseService$lambda$4 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$4(str);
                return invokeFallbackFirebaseService$lambda$4;
            case 2:
                invokeFallbackFirebaseService$lambda$5 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$5(str);
                return invokeFallbackFirebaseService$lambda$5;
            case 3:
                handleBrazeRemoteMessage$lambda$1 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$1(str);
                return handleBrazeRemoteMessage$lambda$1;
            case 4:
                invokeFallbackFirebaseService$lambda$0 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$0(str);
                return invokeFallbackFirebaseService$lambda$0;
            case 5:
                invokeFallbackFirebaseService$lambda$1 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$1(str);
                return invokeFallbackFirebaseService$lambda$1;
            case 6:
                invokeFallbackFirebaseService$lambda$2 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$2(str);
                return invokeFallbackFirebaseService$lambda$2;
            case 7:
                addNotificationAction$lambda$1 = BrazeNotificationActionUtils.addNotificationAction$lambda$1(str);
                return addNotificationAction$lambda$1;
            case 8:
                addNotificationAction$lambda$2 = BrazeNotificationActionUtils.addNotificationAction$lambda$2(str);
                return addNotificationAction$lambda$2;
            case 9:
                bigPictureNotificationStyle$lambda$0 = BrazeNotificationStyleFactory.Companion.getBigPictureNotificationStyle$lambda$0(str);
                return bigPictureNotificationStyle$lambda$0;
            case 10:
                return BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$2(str);
            case 11:
                return BrazeNotificationUtils.getValidNotificationChannel$lambda$1(str);
            case 12:
                return BrazeNotificationUtils.getValidNotificationChannel$lambda$2(str);
            case 13:
                return BrazeNotificationUtils.prefetchBitmapsIfNewlyReceivedStoryPush$lambda$1$0(str);
            case 14:
                return BrazeNotificationUtils.getOrCreateNotificationChannelId$lambda$0(str);
            case 15:
                return BrazeNotificationUtils.getOrCreateNotificationChannelId$lambda$1(str);
            case 16:
                handlePushNotificationPayload$lambda$4$0 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$4$0(str);
                return handlePushNotificationPayload$lambda$4$0;
            case 17:
                handleAdmRegistrationIntent$lambda$1 = BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$1(str);
                return handleAdmRegistrationIntent$lambda$1;
            default:
                handleAdmRegistrationIntent$lambda$2 = BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$2(str);
                return handleAdmRegistrationIntent$lambda$2;
        }
    }
}
