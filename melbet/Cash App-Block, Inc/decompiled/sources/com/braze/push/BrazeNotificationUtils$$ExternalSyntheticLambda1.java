package com.braze.push;

import com.braze.push.BrazeNotificationStyleFactory;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BrazeNotificationUtils$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BrazeNotificationUtils$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String handlePushStoryPageClicked$lambda$1;
        String bigPictureNotificationStyle$lambda$1;
        String bigPictureNotificationStyle$lambda$2;
        String conversationalPushStyle$lambda$0;
        String wakeScreenIfAppropriate$lambda$2;
        String wakeScreenIfAppropriate$lambda$4;
        String sendNotificationOpenedBroadcast$lambda$0;
        String refreshFeatureFlagsIfAppropriate$lambda$0;
        String refreshFeatureFlagsIfAppropriate$lambda$1;
        String refreshBannersIfAppropriate$lambda$0;
        String refreshBannersIfAppropriate$lambda$1;
        String sendPushMessageReceivedBroadcast$lambda$0;
        String cancelNotification$lambda$1;
        String routeUserWithNotificationOpenedIntent$lambda$0;
        String handleNotificationDeleted$lambda$0;
        String validNotificationChannel$lambda$0;
        String validNotificationChannel$lambda$3;
        String deleteIntent$lambda$0;
        String contentIfPresent$lambda$0;
        String smallIcon$lambda$0;
        String smallIcon$lambda$1;
        String setShowWhen$lambda$0;
        String handleNotificationDeleted$lambda$1;
        String soundIfPresentAndSupported$lambda$0;
        String soundIfPresentAndSupported$lambda$1;
        String priorityIfPresentAndSupported$lambda$0;
        String categoryIfPresentAndSupported$lambda$0;
        String categoryIfPresentAndSupported$lambda$1;
        String visibilityIfPresentAndSupported$lambda$0;
        String tickerIfPresent$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                handlePushStoryPageClicked$lambda$1 = BrazeNotificationUtils.handlePushStoryPageClicked$lambda$1();
                return handlePushStoryPageClicked$lambda$1;
            case 1:
                bigPictureNotificationStyle$lambda$1 = BrazeNotificationStyleFactory.Companion.getBigPictureNotificationStyle$lambda$1();
                return bigPictureNotificationStyle$lambda$1;
            case 2:
                bigPictureNotificationStyle$lambda$2 = BrazeNotificationStyleFactory.Companion.getBigPictureNotificationStyle$lambda$2();
                return bigPictureNotificationStyle$lambda$2;
            case 3:
                conversationalPushStyle$lambda$0 = BrazeNotificationStyleFactory.Companion.getConversationalPushStyle$lambda$0();
                return conversationalPushStyle$lambda$0;
            case 4:
                wakeScreenIfAppropriate$lambda$2 = BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$2();
                return wakeScreenIfAppropriate$lambda$2;
            case 5:
                wakeScreenIfAppropriate$lambda$4 = BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$4();
                return wakeScreenIfAppropriate$lambda$4;
            case 6:
                sendNotificationOpenedBroadcast$lambda$0 = BrazeNotificationUtils.sendNotificationOpenedBroadcast$lambda$0();
                return sendNotificationOpenedBroadcast$lambda$0;
            case 7:
                refreshFeatureFlagsIfAppropriate$lambda$0 = BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate$lambda$0();
                return refreshFeatureFlagsIfAppropriate$lambda$0;
            case 8:
                refreshFeatureFlagsIfAppropriate$lambda$1 = BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate$lambda$1();
                return refreshFeatureFlagsIfAppropriate$lambda$1;
            case 9:
                refreshBannersIfAppropriate$lambda$0 = BrazeNotificationUtils.refreshBannersIfAppropriate$lambda$0();
                return refreshBannersIfAppropriate$lambda$0;
            case 10:
                refreshBannersIfAppropriate$lambda$1 = BrazeNotificationUtils.refreshBannersIfAppropriate$lambda$1();
                return refreshBannersIfAppropriate$lambda$1;
            case 11:
                sendPushMessageReceivedBroadcast$lambda$0 = BrazeNotificationUtils.sendPushMessageReceivedBroadcast$lambda$0();
                return sendPushMessageReceivedBroadcast$lambda$0;
            case 12:
                cancelNotification$lambda$1 = BrazeNotificationUtils.cancelNotification$lambda$1();
                return cancelNotification$lambda$1;
            case 13:
                routeUserWithNotificationOpenedIntent$lambda$0 = BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$0();
                return routeUserWithNotificationOpenedIntent$lambda$0;
            case 14:
                handleNotificationDeleted$lambda$0 = BrazeNotificationUtils.handleNotificationDeleted$lambda$0();
                return handleNotificationDeleted$lambda$0;
            case 15:
                validNotificationChannel$lambda$0 = BrazeNotificationUtils.getValidNotificationChannel$lambda$0();
                return validNotificationChannel$lambda$0;
            case 16:
                validNotificationChannel$lambda$3 = BrazeNotificationUtils.getValidNotificationChannel$lambda$3();
                return validNotificationChannel$lambda$3;
            case 17:
                deleteIntent$lambda$0 = BrazeNotificationUtils.setDeleteIntent$lambda$0();
                return deleteIntent$lambda$0;
            case 18:
                contentIfPresent$lambda$0 = BrazeNotificationUtils.setContentIfPresent$lambda$0();
                return contentIfPresent$lambda$0;
            case 19:
                smallIcon$lambda$0 = BrazeNotificationUtils.setSmallIcon$lambda$0();
                return smallIcon$lambda$0;
            case 20:
                smallIcon$lambda$1 = BrazeNotificationUtils.setSmallIcon$lambda$1();
                return smallIcon$lambda$1;
            case 21:
                setShowWhen$lambda$0 = BrazeNotificationUtils.setSetShowWhen$lambda$0();
                return setShowWhen$lambda$0;
            case 22:
                handleNotificationDeleted$lambda$1 = BrazeNotificationUtils.handleNotificationDeleted$lambda$1();
                return handleNotificationDeleted$lambda$1;
            case 23:
                soundIfPresentAndSupported$lambda$0 = BrazeNotificationUtils.setSoundIfPresentAndSupported$lambda$0();
                return soundIfPresentAndSupported$lambda$0;
            case 24:
                soundIfPresentAndSupported$lambda$1 = BrazeNotificationUtils.setSoundIfPresentAndSupported$lambda$1();
                return soundIfPresentAndSupported$lambda$1;
            case 25:
                priorityIfPresentAndSupported$lambda$0 = BrazeNotificationUtils.setPriorityIfPresentAndSupported$lambda$0();
                return priorityIfPresentAndSupported$lambda$0;
            case 26:
                categoryIfPresentAndSupported$lambda$0 = BrazeNotificationUtils.setCategoryIfPresentAndSupported$lambda$0();
                return categoryIfPresentAndSupported$lambda$0;
            case 27:
                categoryIfPresentAndSupported$lambda$1 = BrazeNotificationUtils.setCategoryIfPresentAndSupported$lambda$1();
                return categoryIfPresentAndSupported$lambda$1;
            case 28:
                visibilityIfPresentAndSupported$lambda$0 = BrazeNotificationUtils.setVisibilityIfPresentAndSupported$lambda$0();
                return visibilityIfPresentAndSupported$lambda$0;
            default:
                tickerIfPresent$lambda$0 = BrazeNotificationUtils.setTickerIfPresent$lambda$0();
                return tickerIfPresent$lambda$0;
        }
    }
}
