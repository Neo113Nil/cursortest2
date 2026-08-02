package V5;

import java.util.Map;

/* loaded from: classes2.dex */
public final class p extends H4.g {
    private final H4.c groupComparisonType;

    public p() {
        super(com.onesignal.user.internal.operations.impl.executors.n.TRANSFER_SUBSCRIPTION);
        this.groupComparisonType = H4.c.NONE;
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, com.anythink.expressad.videocommon.e.b.f23194u, str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setSubscriptionId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "subscriptionId", str, null, false, 12, null);
    }

    public final String getAppId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, com.anythink.expressad.videocommon.e.b.f23194u, null, 2, null);
    }

    @Override // H4.g
    public String getApplyToRecordId() {
        return getSubscriptionId();
    }

    @Override // H4.g
    public boolean getCanStartExecute() {
        com.onesignal.common.d dVar = com.onesignal.common.d.INSTANCE;
        return (dVar.isLocalId(getOnesignalId()) || dVar.isLocalId(getSubscriptionId())) ? false : true;
    }

    @Override // H4.g
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    @Override // H4.g
    public H4.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // H4.g
    public String getModifyComparisonKey() {
        return getAppId() + ".Subscription." + getSubscriptionId() + ".Transfer";
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final String getSubscriptionId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "subscriptionId", null, 2, null);
    }

    @Override // H4.g
    public void translateIds(Map<String, String> map) {
        kotlin.jvm.internal.h.e(map, "map");
        if (map.containsKey(getSubscriptionId())) {
            String str = map.get(getSubscriptionId());
            kotlin.jvm.internal.h.b(str);
            setSubscriptionId(str);
        }
        if (map.containsKey(getOnesignalId())) {
            String str2 = map.get(getOnesignalId());
            kotlin.jvm.internal.h.b(str2);
            setOnesignalId(str2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(String appId, String subscriptionId, String onesignalId, String str) {
        this();
        kotlin.jvm.internal.h.e(appId, "appId");
        kotlin.jvm.internal.h.e(subscriptionId, "subscriptionId");
        kotlin.jvm.internal.h.e(onesignalId, "onesignalId");
        setAppId(appId);
        setSubscriptionId(subscriptionId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
    }
}
