package com.gamericefishpro.space.dh;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends com.gamericefishpro.space.bd.g {
    private final com.gamericefishpro.space.bd.c groupComparisonType;

    public q() {
        super(com.gamericefishpro.space.eh.l.UPDATE_SUBSCRIPTION);
        this.groupComparisonType = com.gamericefishpro.space.bd.c.ALTER;
    }

    private final void setAddress(String str) {
        com.gamericefishpro.space.fc.i.setStringProperty$default(this, "address", str, null, false, 12, null);
    }

    private final void setAppId(String str) {
        com.gamericefishpro.space.fc.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setEnabled(boolean z) {
        com.gamericefishpro.space.fc.i.setBooleanProperty$default(this, "enabled", z, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.gamericefishpro.space.fc.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setStatus(com.gamericefishpro.space.jh.f fVar) {
        setOptAnyProperty("status", fVar != null ? fVar.toString() : null, "NORMAL", false);
    }

    private final void setSubscriptionId(String str) {
        com.gamericefishpro.space.fc.i.setStringProperty$default(this, "subscriptionId", str, null, false, 12, null);
    }

    private final void setType(com.gamericefishpro.space.jh.g gVar) {
        setOptAnyProperty(com.gamericefishpro.space.vd.m.EVENT_TYPE_KEY, gVar != null ? gVar.toString() : null, "NORMAL", false);
    }

    public final String getAddress() {
        return com.gamericefishpro.space.fc.i.getStringProperty$default(this, "address", null, 2, null);
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

    public final boolean getEnabled() {
        return com.gamericefishpro.space.fc.i.getBooleanProperty$default(this, "enabled", null, 2, null);
    }

    @Override // com.gamericefishpro.space.bd.g
    public com.gamericefishpro.space.bd.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // com.gamericefishpro.space.bd.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".Subscription." + getSubscriptionId();
    }

    public final String getOnesignalId() {
        return com.gamericefishpro.space.fc.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final com.gamericefishpro.space.jh.f getStatus() {
        Enum enumValueOf = null;
        Object optAnyProperty$default = com.gamericefishpro.space.fc.i.getOptAnyProperty$default(this, "status", null, 2, null);
        if (optAnyProperty$default != null) {
            if (optAnyProperty$default instanceof com.gamericefishpro.space.jh.f) {
                enumValueOf = (Enum) optAnyProperty$default;
            } else {
                enumValueOf = optAnyProperty$default instanceof String ? com.gamericefishpro.space.jh.f.valueOf((String) optAnyProperty$default) : (com.gamericefishpro.space.jh.f) optAnyProperty$default;
            }
        }
        if (enumValueOf != null) {
            return (com.gamericefishpro.space.jh.f) enumValueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionStatus");
    }

    public final String getSubscriptionId() {
        return com.gamericefishpro.space.fc.i.getStringProperty$default(this, "subscriptionId", null, 2, null);
    }

    public final com.gamericefishpro.space.jh.g getType() {
        Enum enumValueOf = null;
        Object optAnyProperty$default = com.gamericefishpro.space.fc.i.getOptAnyProperty$default(this, com.gamericefishpro.space.vd.m.EVENT_TYPE_KEY, null, 2, null);
        if (optAnyProperty$default != null) {
            if (optAnyProperty$default instanceof com.gamericefishpro.space.jh.g) {
                enumValueOf = (Enum) optAnyProperty$default;
            } else {
                enumValueOf = optAnyProperty$default instanceof String ? com.gamericefishpro.space.jh.g.valueOf((String) optAnyProperty$default) : (com.gamericefishpro.space.jh.g) optAnyProperty$default;
            }
        }
        if (enumValueOf != null) {
            return (com.gamericefishpro.space.jh.g) enumValueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionType");
    }

    @Override // com.gamericefishpro.space.bd.g
    public void translateIds(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            Intrinsics.b(str);
            setOnesignalId(str);
        }
        if (map.containsKey(getSubscriptionId())) {
            String str2 = map.get(getSubscriptionId());
            Intrinsics.b(str2);
            setSubscriptionId(str2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(String appId, String onesignalId, String subscriptionId, com.gamericefishpro.space.jh.g type, boolean z, String address, com.gamericefishpro.space.jh.f status) {
        this();
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(status, "status");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setSubscriptionId(subscriptionId);
        setType(type);
        setEnabled(z);
        setAddress(address);
        setStatus(status);
    }
}
