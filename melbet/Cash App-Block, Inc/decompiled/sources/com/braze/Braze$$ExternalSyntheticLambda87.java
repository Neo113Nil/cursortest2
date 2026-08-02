package com.braze;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda87 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Intent f$0;
    public final /* synthetic */ Braze f$1;

    public /* synthetic */ Braze$$ExternalSyntheticLambda87(Intent intent, Braze braze, int i) {
        this.$r8$classId = i;
        this.f$0 = intent;
        this.f$1 = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit handleInAppMessageTestPush$lambda$1;
        Unit logPushNotificationOpened$lambda$3;
        int i = this.$r8$classId;
        Braze braze = this.f$1;
        Intent intent = this.f$0;
        switch (i) {
            case 0:
                handleInAppMessageTestPush$lambda$1 = Braze.handleInAppMessageTestPush$lambda$1(intent, braze);
                return handleInAppMessageTestPush$lambda$1;
            default:
                logPushNotificationOpened$lambda$3 = Braze.logPushNotificationOpened$lambda$3(intent, braze);
                return logPushNotificationOpened$lambda$3;
        }
    }
}
