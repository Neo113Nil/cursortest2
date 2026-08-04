package com.gamericefishpro.space.dh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.gamericefishpro.space.bd.g {
    private final boolean canStartExecute;
    private final com.gamericefishpro.space.bd.c groupComparisonType;

    public e() {
        super(com.gamericefishpro.space.eh.e.LOGIN_USER_FROM_SUBSCRIPTION_USER);
        this.groupComparisonType = com.gamericefishpro.space.bd.c.NONE;
        this.canStartExecute = true;
    }

    private final void setAppId(String str) {
        com.gamericefishpro.space.fc.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.gamericefishpro.space.fc.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setSubscriptionId(String str) {
        com.gamericefishpro.space.fc.i.setStringProperty$default(this, "subscriptionId", str, null, false, 12, null);
    }

    public final String getAppId() {
        return com.gamericefishpro.space.fc.i.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // com.gamericefishpro.space.bd.g
    public String getApplyToRecordId() {
        return getSubscriptionId();
    }

    @Override // com.gamericefishpro.space.bd.g
    public boolean getCanStartExecute() {
        return this.canStartExecute;
    }

    @Override // com.gamericefishpro.space.bd.g
    public String getCreateComparisonKey() {
        return getAppId() + ".Subscription." + getSubscriptionId() + ".Login";
    }

    @Override // com.gamericefishpro.space.bd.g
    public com.gamericefishpro.space.bd.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // com.gamericefishpro.space.bd.g
    public String getModifyComparisonKey() {
        return getAppId() + ".Subscription." + getSubscriptionId() + ".Login";
    }

    public final String getOnesignalId() {
        return com.gamericefishpro.space.fc.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final String getSubscriptionId() {
        return com.gamericefishpro.space.fc.i.getStringProperty$default(this, "subscriptionId", null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(String appId, String onesignalId, String subscriptionId) {
        this();
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setSubscriptionId(subscriptionId);
    }
}
