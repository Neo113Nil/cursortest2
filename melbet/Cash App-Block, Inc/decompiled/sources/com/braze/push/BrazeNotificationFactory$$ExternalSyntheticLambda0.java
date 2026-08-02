package com.braze.push;

import com.braze.push.BrazeFirebaseMessagingService;
import com.braze.push.BrazeNotificationFactory;
import com.braze.push.BrazeNotificationStyleFactory;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BrazeNotificationFactory$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BrazeNotificationFactory$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String createNotification$lambda$0;
        String invokeSuspend$lambda$0;
        String handleBrazeRemoteMessage$lambda$2;
        String handleBrazeRemoteMessage$lambda$3;
        String invokeFallbackFirebaseService$lambda$3;
        String handleNotificationActionClicked$lambda$0;
        String handleNotificationActionClicked$lambda$1;
        String handleNotificationActionClicked$lambda$2;
        String handleNotificationActionClicked$lambda$3;
        String addNotificationActions$lambda$0;
        String addNotificationActions$lambda$1;
        String addNotificationAction$lambda$0;
        String populateNotificationBuilder$lambda$1;
        String populateNotificationBuilder$lambda$2;
        String styleIfSupported$lambda$0;
        String conversationalPushStyle$lambda$2;
        String inlineImageStyle$lambda$0;
        String inlineImageStyle$lambda$1;
        String inlineImageStyle$lambda$2;
        String inlineImageStyle$lambda$4;
        String storyStyle$lambda$0;
        String storyStyle$lambda$1;
        String populatePushStoryPage$lambda$0;
        String populatePushStoryPage$lambda$1;
        String notificationStyle$lambda$0;
        String populatePushStoryPage$lambda$2;
        String notificationStyle$lambda$1;
        String notificationStyle$lambda$2;
        String notificationStyle$lambda$3;
        String notificationStyle$lambda$4;
        switch (this.$r8$classId) {
            case 0:
                createNotification$lambda$0 = BrazeNotificationFactory.createNotification$lambda$0();
                return createNotification$lambda$0;
            case 1:
                invokeSuspend$lambda$0 = NotificationTrampolineActivity$onResume$7.invokeSuspend$lambda$0();
                return invokeSuspend$lambda$0;
            case 2:
                handleBrazeRemoteMessage$lambda$2 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$2();
                return handleBrazeRemoteMessage$lambda$2;
            case 3:
                handleBrazeRemoteMessage$lambda$3 = BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$3();
                return handleBrazeRemoteMessage$lambda$3;
            case 4:
                invokeFallbackFirebaseService$lambda$3 = BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$3();
                return invokeFallbackFirebaseService$lambda$3;
            case 5:
                handleNotificationActionClicked$lambda$0 = BrazeNotificationActionUtils.handleNotificationActionClicked$lambda$0();
                return handleNotificationActionClicked$lambda$0;
            case 6:
                handleNotificationActionClicked$lambda$1 = BrazeNotificationActionUtils.handleNotificationActionClicked$lambda$1();
                return handleNotificationActionClicked$lambda$1;
            case 7:
                handleNotificationActionClicked$lambda$2 = BrazeNotificationActionUtils.handleNotificationActionClicked$lambda$2();
                return handleNotificationActionClicked$lambda$2;
            case 8:
                handleNotificationActionClicked$lambda$3 = BrazeNotificationActionUtils.handleNotificationActionClicked$lambda$3();
                return handleNotificationActionClicked$lambda$3;
            case 9:
                addNotificationActions$lambda$0 = BrazeNotificationActionUtils.addNotificationActions$lambda$0();
                return addNotificationActions$lambda$0;
            case 10:
                addNotificationActions$lambda$1 = BrazeNotificationActionUtils.addNotificationActions$lambda$1();
                return addNotificationActions$lambda$1;
            case 11:
                addNotificationAction$lambda$0 = BrazeNotificationActionUtils.addNotificationAction$lambda$0();
                return addNotificationAction$lambda$0;
            case 12:
                populateNotificationBuilder$lambda$1 = BrazeNotificationFactory.Companion.populateNotificationBuilder$lambda$1();
                return populateNotificationBuilder$lambda$1;
            case 13:
                populateNotificationBuilder$lambda$2 = BrazeNotificationFactory.Companion.populateNotificationBuilder$lambda$2();
                return populateNotificationBuilder$lambda$2;
            case 14:
                styleIfSupported$lambda$0 = BrazeNotificationStyleFactory.Companion.setStyleIfSupported$lambda$0();
                return styleIfSupported$lambda$0;
            case 15:
                conversationalPushStyle$lambda$2 = BrazeNotificationStyleFactory.Companion.getConversationalPushStyle$lambda$2();
                return conversationalPushStyle$lambda$2;
            case 16:
                inlineImageStyle$lambda$0 = BrazeNotificationStyleFactory.Companion.getInlineImageStyle$lambda$0();
                return inlineImageStyle$lambda$0;
            case 17:
                inlineImageStyle$lambda$1 = BrazeNotificationStyleFactory.Companion.getInlineImageStyle$lambda$1();
                return inlineImageStyle$lambda$1;
            case 18:
                inlineImageStyle$lambda$2 = BrazeNotificationStyleFactory.Companion.getInlineImageStyle$lambda$2();
                return inlineImageStyle$lambda$2;
            case 19:
                inlineImageStyle$lambda$4 = BrazeNotificationStyleFactory.Companion.getInlineImageStyle$lambda$4();
                return inlineImageStyle$lambda$4;
            case 20:
                storyStyle$lambda$0 = BrazeNotificationStyleFactory.Companion.getStoryStyle$lambda$0();
                return storyStyle$lambda$0;
            case 21:
                storyStyle$lambda$1 = BrazeNotificationStyleFactory.Companion.getStoryStyle$lambda$1();
                return storyStyle$lambda$1;
            case 22:
                populatePushStoryPage$lambda$0 = BrazeNotificationStyleFactory.Companion.populatePushStoryPage$lambda$0();
                return populatePushStoryPage$lambda$0;
            case 23:
                populatePushStoryPage$lambda$1 = BrazeNotificationStyleFactory.Companion.populatePushStoryPage$lambda$1();
                return populatePushStoryPage$lambda$1;
            case 24:
                notificationStyle$lambda$0 = BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$0();
                return notificationStyle$lambda$0;
            case 25:
                populatePushStoryPage$lambda$2 = BrazeNotificationStyleFactory.Companion.populatePushStoryPage$lambda$2();
                return populatePushStoryPage$lambda$2;
            case 26:
                notificationStyle$lambda$1 = BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$1();
                return notificationStyle$lambda$1;
            case 27:
                notificationStyle$lambda$2 = BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$2();
                return notificationStyle$lambda$2;
            case 28:
                notificationStyle$lambda$3 = BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$3();
                return notificationStyle$lambda$3;
            default:
                notificationStyle$lambda$4 = BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$4();
                return notificationStyle$lambda$4;
        }
    }
}
