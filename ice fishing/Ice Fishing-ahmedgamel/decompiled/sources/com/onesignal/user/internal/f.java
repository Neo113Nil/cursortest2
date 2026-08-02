package com.onesignal.user.internal;

/* loaded from: classes2.dex */
public abstract class f {
    public static final boolean switchUserIv(l userSwitcher, Z5.e subscriptionModelStore, com.onesignal.core.internal.config.b configModel, boolean z6) {
        Z5.d dVar;
        kotlin.jvm.internal.h.e(userSwitcher, "userSwitcher");
        kotlin.jvm.internal.h.e(subscriptionModelStore, "subscriptionModelStore");
        kotlin.jvm.internal.h.e(configModel, "configModel");
        if (!z6) {
            return false;
        }
        String pushSubscriptionId = configModel.getPushSubscriptionId();
        if (pushSubscriptionId != null && (dVar = (Z5.d) subscriptionModelStore.get(pushSubscriptionId)) != null) {
            dVar.setDisabledInternally(true);
        }
        l.createAndSwitchToNewUser$default(userSwitcher, true, null, 2, null);
        return true;
    }
}
