package com.braze;

import com.braze.enums.NotificationSubscriptionType;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BrazeUser$$ExternalSyntheticLambda19 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NotificationSubscriptionType f$0;

    public /* synthetic */ BrazeUser$$ExternalSyntheticLambda19(NotificationSubscriptionType notificationSubscriptionType, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationSubscriptionType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String emailNotificationSubscriptionType$lambda$0;
        String pushNotificationSubscriptionType$lambda$0;
        int i = this.$r8$classId;
        NotificationSubscriptionType notificationSubscriptionType = this.f$0;
        switch (i) {
            case 0:
                emailNotificationSubscriptionType$lambda$0 = BrazeUser.setEmailNotificationSubscriptionType$lambda$0(notificationSubscriptionType);
                return emailNotificationSubscriptionType$lambda$0;
            default:
                pushNotificationSubscriptionType$lambda$0 = BrazeUser.setPushNotificationSubscriptionType$lambda$0(notificationSubscriptionType);
                return pushNotificationSubscriptionType$lambda$0;
        }
    }
}
