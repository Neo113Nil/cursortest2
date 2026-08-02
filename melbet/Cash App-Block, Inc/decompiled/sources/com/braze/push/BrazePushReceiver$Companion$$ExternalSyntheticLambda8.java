package com.braze.push;

import com.braze.push.BrazePushReceiver;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BrazePushReceiver$Companion$$ExternalSyntheticLambda8 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BrazePushReceiver$Companion$$ExternalSyntheticLambda8(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String handlePushNotificationPayload$lambda$14;
        switch (this.$r8$classId) {
            case 0:
                handlePushNotificationPayload$lambda$14 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$14();
                return handlePushNotificationPayload$lambda$14;
            case 1:
                return NotificationTrampolineActivity.onResume$lambda$0();
            case 2:
                return NotificationTrampolineActivity.onResume$lambda$1();
            case 3:
                return NotificationTrampolineActivity.onResume$lambda$4();
            case 4:
                return NotificationTrampolineActivity.onResume$lambda$5();
            case 5:
                return NotificationTrampolineActivity.onCreate$lambda$0();
            default:
                return NotificationTrampolineActivity.onPause$lambda$0();
        }
    }
}
