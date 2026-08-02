package V5;

import java.util.Map;

/* loaded from: classes2.dex */
public final class n extends H4.g {
    private final H4.c groupComparisonType;

    public n() {
        super(com.onesignal.user.internal.operations.impl.executors.p.TRACK_SESSION_END);
        this.groupComparisonType = H4.c.ALTER;
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, com.anythink.expressad.videocommon.e.b.f23194u, str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setSessionTime(long j6) {
        com.onesignal.common.modeling.i.setLongProperty$default(this, "sessionTime", j6, null, false, 12, null);
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
        return "";
    }

    @Override // H4.g
    public H4.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // H4.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId();
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final long getSessionTime() {
        return com.onesignal.common.modeling.i.getLongProperty$default(this, "sessionTime", null, 2, null);
    }

    @Override // H4.g
    public void translateIds(Map<String, String> map) {
        kotlin.jvm.internal.h.e(map, "map");
        if (map.containsKey(getOnesignalId())) {
            String str = map.get(getOnesignalId());
            kotlin.jvm.internal.h.b(str);
            setOnesignalId(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(String appId, String onesignalId, String str, long j6) {
        this();
        kotlin.jvm.internal.h.e(appId, "appId");
        kotlin.jvm.internal.h.e(onesignalId, "onesignalId");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
        setSessionTime(j6);
    }
}
