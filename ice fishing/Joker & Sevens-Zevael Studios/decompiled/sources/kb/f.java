package kb;

import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends z8.g {
    private final z8.c groupComparisonType;
    private final String modifyComparisonKey;

    public f() {
        super(com.onesignal.user.internal.operations.impl.executors.e.LOGIN_USER);
        this.modifyComparisonKey = "";
        this.groupComparisonType = z8.c.CREATE;
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setExistingOnesignalId(String str) {
        com.onesignal.common.modeling.i.setOptStringProperty$default(this, "existingOnesignalId", str, null, false, 12, null);
    }

    private final void setExternalId(String str) {
        com.onesignal.common.modeling.i.setOptStringProperty$default(this, "externalId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    public final String getAppId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "appId", null, 2, null);
    }

    @Override // z8.g
    public String getApplyToRecordId() {
        String existingOnesignalId = getExistingOnesignalId();
        return existingOnesignalId == null ? getOnesignalId() : existingOnesignalId;
    }

    @Override // z8.g
    public boolean getCanStartExecute() {
        if (getExistingOnesignalId() == null) {
            return true;
        }
        com.onesignal.common.e eVar = com.onesignal.common.e.INSTANCE;
        String existingOnesignalId = getExistingOnesignalId();
        pc.j.b(existingOnesignalId);
        return !eVar.isLocalId(existingOnesignalId);
    }

    @Override // z8.g
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final String getExistingOnesignalId() {
        return com.onesignal.common.modeling.i.getOptStringProperty$default(this, "existingOnesignalId", null, 2, null);
    }

    public final String getExternalId() {
        return com.onesignal.common.modeling.i.getOptStringProperty$default(this, "externalId", null, 2, null);
    }

    @Override // z8.g
    public z8.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // z8.g
    public String getModifyComparisonKey() {
        return this.modifyComparisonKey;
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    @Override // z8.g
    public void translateIds(Map<String, String> map) {
        pc.j.e(map, "map");
        if (map.containsKey(getExistingOnesignalId())) {
            String str = map.get(getExistingOnesignalId());
            pc.j.b(str);
            setExistingOnesignalId(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(String str, String str2, String str3, String str4) {
        this();
        pc.j.e(str, "appId");
        pc.j.e(str2, "onesignalId");
        setAppId(str);
        setOnesignalId(str2);
        setExternalId(str3);
        setExistingOnesignalId(str4);
    }

    public /* synthetic */ f(String str, String str2, String str3, String str4, int i10, pc.f fVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : str4);
    }
}
