package kb;

import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j extends z8.g {
    private final z8.c groupComparisonType;

    public j() {
        super(com.onesignal.user.internal.operations.impl.executors.l.SET_PROPERTY);
        this.groupComparisonType = z8.c.ALTER;
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setProperty(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "property", str, null, false, 12, null);
    }

    private final void setValue(Object obj) {
        com.onesignal.common.modeling.i.setOptAnyProperty$default(this, "value", obj, null, false, 12, null);
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
        return "";
    }

    @Override // z8.g
    public z8.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // z8.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final String getProperty() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "property", null, 2, null);
    }

    public final Object getValue() {
        return com.onesignal.common.modeling.i.getOptAnyProperty$default(this, "value", null, 2, null);
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
    public j(String str, String str2, String str3, Object obj) {
        this();
        pc.j.e(str, "appId");
        pc.j.e(str2, "onesignalId");
        pc.j.e(str3, "property");
        setAppId(str);
        setOnesignalId(str2);
        setProperty(str3);
        setValue(obj);
    }
}
