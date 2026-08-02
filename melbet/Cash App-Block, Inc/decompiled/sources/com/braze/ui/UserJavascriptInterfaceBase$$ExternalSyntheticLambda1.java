package com.braze.ui;

import com.braze.BrazeUser;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.ui.actions.brazeactions.steps.SetEmailSubscriptionStep;
import com.braze.ui.actions.brazeactions.steps.SetPushNotificationSubscriptionStep;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class UserJavascriptInterfaceBase$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NotificationSubscriptionType f$0;

    public /* synthetic */ UserJavascriptInterfaceBase$$ExternalSyntheticLambda1(NotificationSubscriptionType notificationSubscriptionType, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationSubscriptionType;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit emailNotificationSubscriptionType$lambda$1;
        Unit pushNotificationSubscriptionType$lambda$1;
        Unit run$lambda$1;
        Unit run$lambda$12;
        int i = this.$r8$classId;
        NotificationSubscriptionType notificationSubscriptionType = this.f$0;
        BrazeUser brazeUser = (BrazeUser) obj;
        switch (i) {
            case 0:
                emailNotificationSubscriptionType$lambda$1 = UserJavascriptInterfaceBase.setEmailNotificationSubscriptionType$lambda$1(notificationSubscriptionType, brazeUser);
                return emailNotificationSubscriptionType$lambda$1;
            case 1:
                pushNotificationSubscriptionType$lambda$1 = UserJavascriptInterfaceBase.setPushNotificationSubscriptionType$lambda$1(notificationSubscriptionType, brazeUser);
                return pushNotificationSubscriptionType$lambda$1;
            case 2:
                run$lambda$1 = SetEmailSubscriptionStep.run$lambda$1(notificationSubscriptionType, brazeUser);
                return run$lambda$1;
            default:
                run$lambda$12 = SetPushNotificationSubscriptionStep.run$lambda$1(notificationSubscriptionType, brazeUser);
                return run$lambda$12;
        }
    }
}
