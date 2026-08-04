package com.gamericefishpro.space.dh;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends com.gamericefishpro.space.bd.g {
    private final com.gamericefishpro.space.bd.c groupComparisonType;

    public p() {
        super(com.gamericefishpro.space.eh.l.TRANSFER_SUBSCRIPTION);
        this.groupComparisonType = com.gamericefishpro.space.bd.c.NONE;
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
        com.gamericefishpro.space.yb.c cVar = com.gamericefishpro.space.yb.c.INSTANCE;
        return (cVar.isLocalId(getOnesignalId()) || cVar.isLocalId(getSubscriptionId())) ? false : true;
    }

    @Override // com.gamericefishpro.space.bd.g
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    @Override // com.gamericefishpro.space.bd.g
    public com.gamericefishpro.space.bd.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // com.gamericefishpro.space.bd.g
    public String getModifyComparisonKey() {
        return getAppId() + ".Subscription." + getSubscriptionId() + ".Transfer";
    }

    public final String getOnesignalId() {
        return com.gamericefishpro.space.fc.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final String getSubscriptionId() {
        return com.gamericefishpro.space.fc.i.getStringProperty$default(this, "subscriptionId", null, 2, null);
    }

    @Override // com.gamericefishpro.space.bd.g
    public void translateIds(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        if (map.containsKey(getSubscriptionId())) {
            String str = map.get(getSubscriptionId());
            Intrinsics.b(str);
            setSubscriptionId(str);
        }
        if (map.containsKey(getOnesignalId())) {
            String str2 = map.get(getOnesignalId());
            Intrinsics.b(str2);
            setOnesignalId(str2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(String appId, String subscriptionId, String onesignalId) {
        this();
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        setAppId(appId);
        setSubscriptionId(subscriptionId);
        setOnesignalId(onesignalId);
    }
}
