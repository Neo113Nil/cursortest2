package kb;

import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m extends z8.g {
    private final z8.c groupComparisonType;

    public m() {
        super(com.onesignal.user.internal.operations.impl.executors.l.TRACK_SESSION_END);
        this.groupComparisonType = z8.c.ALTER;
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setSessionTime(long j3) {
        com.onesignal.common.modeling.i.setLongProperty$default(this, "sessionTime", j3, null, false, 12, null);
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

    public final long getSessionTime() {
        return com.onesignal.common.modeling.i.getLongProperty$default(this, "sessionTime", null, 2, null);
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
    public m(String str, String str2, long j3) {
        this();
        pc.j.e(str, "appId");
        pc.j.e(str2, "onesignalId");
        setAppId(str);
        setOnesignalId(str2);
        setSessionTime(j3);
    }
}
