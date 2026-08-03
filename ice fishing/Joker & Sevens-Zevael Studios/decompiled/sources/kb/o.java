package kb;

import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o extends z8.g {
    private final z8.c groupComparisonType;

    public o() {
        super(com.onesignal.user.internal.operations.impl.executors.j.TRANSFER_SUBSCRIPTION);
        this.groupComparisonType = z8.c.NONE;
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setSubscriptionId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "subscriptionId", str, null, false, 12, null);
    }

    public final String getAppId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // z8.g
    public String getApplyToRecordId() {
        return getSubscriptionId();
    }

    @Override // z8.g
    public boolean getCanStartExecute() {
        com.onesignal.common.e eVar = com.onesignal.common.e.INSTANCE;
        return (eVar.isLocalId(getOnesignalId()) || eVar.isLocalId(getSubscriptionId())) ? false : true;
    }

    @Override // z8.g
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    @Override // z8.g
    public z8.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // z8.g
    public String getModifyComparisonKey() {
        return getAppId() + ".Subscription." + getSubscriptionId() + ".Transfer";
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final String getSubscriptionId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "subscriptionId", null, 2, null);
    }

    @Override // z8.g
    public void translateIds(Map<String, String> map) {
        pc.j.e(map, "map");
        if (map.containsKey(getSubscriptionId())) {
            String str = map.get(getSubscriptionId());
            pc.j.b(str);
            setSubscriptionId(str);
        }
        if (map.containsKey(getOnesignalId())) {
            String str2 = map.get(getOnesignalId());
            pc.j.b(str2);
            setOnesignalId(str2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(String str, String str2, String str3) {
        this();
        pc.j.e(str, "appId");
        pc.j.e(str2, "subscriptionId");
        pc.j.e(str3, "onesignalId");
        setAppId(str);
        setSubscriptionId(str2);
        setOnesignalId(str3);
    }
}
