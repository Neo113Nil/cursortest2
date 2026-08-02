package V5;

import java.util.Map;

/* loaded from: classes2.dex */
public final class a extends H4.g {
    private final H4.c groupComparisonType;

    public a() {
        super(com.onesignal.user.internal.operations.impl.executors.n.CREATE_SUBSCRIPTION);
        this.groupComparisonType = H4.c.ALTER;
    }

    private final void setAddress(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "address", str, null, false, 12, null);
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, com.anythink.expressad.videocommon.e.b.f23194u, str, null, false, 12, null);
    }

    private final void setEnabled(boolean z6) {
        com.onesignal.common.modeling.i.setBooleanProperty$default(this, "enabled", z6, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setStatus(Z5.f fVar) {
        setOptAnyProperty("status", fVar != null ? fVar.toString() : null, "NORMAL", false);
    }

    private final void setSubscriptionId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "subscriptionId", str, null, false, 12, null);
    }

    private final void setType(Z5.g gVar) {
        setOptAnyProperty("type", gVar != null ? gVar.toString() : null, "NORMAL", false);
    }

    public final String getAddress() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "address", null, 2, null);
    }

    public final String getAppId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, com.anythink.expressad.videocommon.e.b.f23194u, null, 2, null);
    }

    @Override // H4.g
    public String getApplyToRecordId() {
        return getOnesignalId();
    }

    @Override // H4.g
    public boolean getCanStartExecute() {
        return !com.onesignal.common.d.INSTANCE.isLocalId(getOnesignalId());
    }

    @Override // H4.g
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final boolean getEnabled() {
        return com.onesignal.common.modeling.i.getBooleanProperty$default(this, "enabled", null, 2, null);
    }

    @Override // H4.g
    public H4.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // H4.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".Subscription." + getSubscriptionId();
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final Z5.f getStatus() {
        Object optAnyProperty$default = com.onesignal.common.modeling.i.getOptAnyProperty$default(this, "status", null, 2, null);
        Enum valueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof Z5.f ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? Z5.f.valueOf((String) optAnyProperty$default) : (Z5.f) optAnyProperty$default : null;
        if (valueOf != null) {
            return (Z5.f) valueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionStatus");
    }

    public final String getSubscriptionId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "subscriptionId", null, 2, null);
    }

    public final Z5.g getType() {
        Object optAnyProperty$default = com.onesignal.common.modeling.i.getOptAnyProperty$default(this, "type", null, 2, null);
        Enum valueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof Z5.g ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? Z5.g.valueOf((String) optAnyProperty$default) : (Z5.g) optAnyProperty$default : null;
        if (valueOf != null) {
            return (Z5.g) valueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionType");
    }

    @Override // H4.g
    public void translateIds(Map<String, String> map) {
        kotlin.jvm.internal.h.e(map, "map");
        String str = map.get(getOnesignalId());
        if (str != null) {
            setOnesignalId(str);
        }
        String str2 = map.get(getSubscriptionId());
        if (str2 != null) {
            setSubscriptionId(str2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String appId, String onesignalId, String str, String subscriptionId, Z5.g type, boolean z6, String address, Z5.f status) {
        this();
        kotlin.jvm.internal.h.e(appId, "appId");
        kotlin.jvm.internal.h.e(onesignalId, "onesignalId");
        kotlin.jvm.internal.h.e(subscriptionId, "subscriptionId");
        kotlin.jvm.internal.h.e(type, "type");
        kotlin.jvm.internal.h.e(address, "address");
        kotlin.jvm.internal.h.e(status, "status");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
        setSubscriptionId(subscriptionId);
        setType(type);
        setEnabled(z6);
        setAddress(address);
        setStatus(status);
    }
}
