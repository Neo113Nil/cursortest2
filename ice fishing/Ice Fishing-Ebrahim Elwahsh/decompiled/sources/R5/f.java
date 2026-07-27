package R5;

import java.util.Map;

/* loaded from: classes2.dex */
public final class f extends D4.g {
    private final D4.c groupComparisonType;
    private final String modifyComparisonKey;

    public f() {
        super(com.onesignal.user.internal.operations.impl.executors.i.LOGIN_USER);
        this.modifyComparisonKey = "";
        this.groupComparisonType = D4.c.CREATE;
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, com.anythink.expressad.videocommon.e.b.f22565u, str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    public final String getAppId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, com.anythink.expressad.videocommon.e.b.f22565u, null, 2, null);
    }

    @Override // D4.g
    public String getApplyToRecordId() {
        String existingOnesignalId = getExistingOnesignalId();
        return existingOnesignalId == null ? getOnesignalId() : existingOnesignalId;
    }

    @Override // D4.g
    public boolean getCanStartExecute() {
        if (getExistingOnesignalId() == null) {
            return true;
        }
        com.onesignal.common.d dVar = com.onesignal.common.d.INSTANCE;
        String existingOnesignalId = getExistingOnesignalId();
        kotlin.jvm.internal.h.b(existingOnesignalId);
        return !dVar.isLocalId(existingOnesignalId);
    }

    @Override // D4.g
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final String getExistingOnesignalId() {
        return com.onesignal.common.modeling.i.getOptStringProperty$default(this, "existingOnesignalId", null, 2, null);
    }

    @Override // D4.g
    public D4.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // D4.g
    public String getModifyComparisonKey() {
        return this.modifyComparisonKey;
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final void setExistingOnesignalId$com_onesignal_core(String str) {
        com.onesignal.common.modeling.i.setOptStringProperty$default(this, "existingOnesignalId", str, null, false, 12, null);
    }

    @Override // D4.g
    public void translateIds(Map<String, String> map) {
        kotlin.jvm.internal.h.e(map, "map");
        if (map.containsKey(getExistingOnesignalId())) {
            String str = map.get(getExistingOnesignalId());
            kotlin.jvm.internal.h.b(str);
            setExistingOnesignalId$com_onesignal_core(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(String appId, String onesignalId, String str, String str2) {
        this();
        kotlin.jvm.internal.h.e(appId, "appId");
        kotlin.jvm.internal.h.e(onesignalId, "onesignalId");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
        setExistingOnesignalId$com_onesignal_core(str2);
    }

    public /* synthetic */ f(String str, String str2, String str3, String str4, int i, kotlin.jvm.internal.e eVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }
}
