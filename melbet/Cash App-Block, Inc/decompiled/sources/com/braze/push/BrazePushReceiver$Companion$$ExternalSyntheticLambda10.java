package com.braze.push;

import android.os.Bundle;
import com.braze.push.BrazePushReceiver;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BrazePushReceiver$Companion$$ExternalSyntheticLambda10 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Bundle f$0;

    public /* synthetic */ BrazePushReceiver$Companion$$ExternalSyntheticLambda10(Bundle bundle, int i) {
        this.$r8$classId = i;
        this.f$0 = bundle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String handlePushNotificationPayload$lambda$2;
        String addNotificationAction$lambda$3;
        int i = this.$r8$classId;
        Bundle bundle = this.f$0;
        switch (i) {
            case 0:
                handlePushNotificationPayload$lambda$2 = BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$2(bundle);
                return handlePushNotificationPayload$lambda$2;
            default:
                addNotificationAction$lambda$3 = BrazeNotificationActionUtils.addNotificationAction$lambda$3(bundle);
                return addNotificationAction$lambda$3;
        }
    }
}
