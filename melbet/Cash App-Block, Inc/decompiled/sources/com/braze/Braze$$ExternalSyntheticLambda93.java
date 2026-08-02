package com.braze;

import android.content.Intent;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda93 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Intent f$0;

    public /* synthetic */ Braze$$ExternalSyntheticLambda93(int i, Intent intent) {
        this.$r8$classId = i;
        this.f$0 = intent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String logPushNotificationOpened$lambda$2;
        String onReceive$lambda$0;
        int i = this.$r8$classId;
        Intent intent = this.f$0;
        switch (i) {
            case 0:
                logPushNotificationOpened$lambda$2 = Braze.logPushNotificationOpened$lambda$2(intent);
                return logPushNotificationOpened$lambda$2;
            default:
                onReceive$lambda$0 = BrazeFlushPushDeliveryReceiver.onReceive$lambda$0(intent);
                return onReceive$lambda$0;
        }
    }
}
