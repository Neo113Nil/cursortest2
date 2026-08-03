package kb;

import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends z8.g {
    private final z8.c groupComparisonType;

    public a() {
        super(com.onesignal.user.internal.operations.impl.executors.j.CREATE_SUBSCRIPTION);
        this.groupComparisonType = z8.c.ALTER;
    }

    private final void setAddress(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "address", str, null, false, 12, null);
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setEnabled(boolean z10) {
        com.onesignal.common.modeling.i.setBooleanProperty$default(this, "enabled", z10, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setStatus(ob.f fVar) {
        setOptAnyProperty("status", fVar != null ? fVar.toString() : null, "NORMAL", false);
    }

    private final void setSubscriptionId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "subscriptionId", str, null, false, 12, null);
    }

    private final void setType(ob.g gVar) {
        setOptAnyProperty(com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY, gVar != null ? gVar.toString() : null, "NORMAL", false);
    }

    public final String getAddress() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "address", null, 2, null);
    }

    public final String getAppId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // z8.g
    public String getApplyToRecordId() {
        return getOnesignalId();
    }

    @Override // z8.g
    public boolean getCanStartExecute() {
        return !com.onesignal.common.e.INSTANCE.isLocalId(getOnesignalId());
    }

    @Override // z8.g
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final boolean getEnabled() {
        return com.onesignal.common.modeling.i.getBooleanProperty$default(this, "enabled", null, 2, null);
    }

    @Override // z8.g
    public z8.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // z8.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".Subscription." + getSubscriptionId();
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final ob.f getStatus() {
        Object optAnyProperty$default = com.onesignal.common.modeling.i.getOptAnyProperty$default(this, "status", null, 2, null);
        Enum valueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof ob.f ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? ob.f.valueOf((String) optAnyProperty$default) : (ob.f) optAnyProperty$default : null;
        if (valueOf != null) {
            return (ob.f) valueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionStatus");
    }

    public final String getSubscriptionId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "subscriptionId", null, 2, null);
    }

    public final ob.g getType() {
        Object optAnyProperty$default = com.onesignal.common.modeling.i.getOptAnyProperty$default(this, com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY, null, 2, null);
        Enum valueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof ob.g ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? ob.g.valueOf((String) optAnyProperty$default) : (ob.g) optAnyProperty$default : null;
        if (valueOf != null) {
            return (ob.g) valueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionType");
    }

    @Override // z8.g
    public void translateIds(Map<String, String> map) {
        pc.j.e(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            pc.j.b(str);
            setOnesignalId(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3, ob.g gVar, boolean z10, String str4, ob.f fVar) {
        this();
        pc.j.e(str, "appId");
        pc.j.e(str2, "onesignalId");
        pc.j.e(str3, "subscriptionId");
        pc.j.e(gVar, com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY);
        pc.j.e(str4, "address");
        pc.j.e(fVar, "status");
        setAppId(str);
        setOnesignalId(str2);
        setSubscriptionId(str3);
        setType(gVar);
        setEnabled(z10);
        setAddress(str4);
        setStatus(fVar);
    }
}
