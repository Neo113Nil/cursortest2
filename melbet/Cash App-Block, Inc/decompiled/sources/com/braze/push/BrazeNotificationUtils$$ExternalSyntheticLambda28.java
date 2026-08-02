package com.braze.push;

import android.content.Intent;
import com.braze.push.BrazePushReceiver;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BrazeNotificationUtils$$ExternalSyntheticLambda28 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Intent f$0;

    public /* synthetic */ BrazeNotificationUtils$$ExternalSyntheticLambda28(int i, Intent intent) {
        this.$r8$classId = i;
        this.f$0 = intent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String routeUserWithNotificationOpenedIntent$lambda$3;
        String sendPushActionIntent$lambda$1;
        String handleAdmRegistrationEventIfEnabled$lambda$0;
        String handlePush$performWork$lambda$0;
        String handlePush$performWork$lambda$1;
        String onResume$lambda$2;
        int i = this.$r8$classId;
        Intent intent = this.f$0;
        switch (i) {
            case 0:
                routeUserWithNotificationOpenedIntent$lambda$3 = BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$3(intent);
                return routeUserWithNotificationOpenedIntent$lambda$3;
            case 1:
                sendPushActionIntent$lambda$1 = BrazeNotificationUtils.sendPushActionIntent$lambda$1(intent);
                return sendPushActionIntent$lambda$1;
            case 2:
                handleAdmRegistrationEventIfEnabled$lambda$0 = BrazePushReceiver.Companion.handleAdmRegistrationEventIfEnabled$lambda$0(intent);
                return handleAdmRegistrationEventIfEnabled$lambda$0;
            case 3:
                handlePush$performWork$lambda$0 = BrazePushReceiver.Companion.handlePush$performWork$lambda$0(intent);
                return handlePush$performWork$lambda$0;
            case 4:
                handlePush$performWork$lambda$1 = BrazePushReceiver.Companion.handlePush$performWork$lambda$1(intent);
                return handlePush$performWork$lambda$1;
            default:
                onResume$lambda$2 = NotificationTrampolineActivity.onResume$lambda$2(intent);
                return onResume$lambda$2;
        }
    }
}
