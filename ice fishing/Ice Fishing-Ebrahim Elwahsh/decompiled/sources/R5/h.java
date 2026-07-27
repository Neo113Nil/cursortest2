package R5;

import java.util.Map;

/* loaded from: classes2.dex */
public final class h extends D4.g {
    private final D4.c groupComparisonType;

    public h() {
        super(com.onesignal.user.internal.operations.impl.executors.l.REFRESH_USER);
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
        return getOnesignalId();
    }

    @Override // D4.g
    public boolean getCanStartExecute() {
        return !com.onesignal.common.d.INSTANCE.isLocalId(getOnesignalId());
    }

    @Override // D4.g
    public String getCreateComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".Refresh";
    }

    @Override // D4.g
    public D4.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // D4.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".Refresh";
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    @Override // D4.g
    public void translateIds(Map<String, String> map) {
        kotlin.jvm.internal.h.e(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            kotlin.jvm.internal.h.b(str);
            setOnesignalId(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(String appId, String onesignalId, String str) {
        this();
        kotlin.jvm.internal.h.e(appId, "appId");
        kotlin.jvm.internal.h.e(onesignalId, "onesignalId");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
    }
}
