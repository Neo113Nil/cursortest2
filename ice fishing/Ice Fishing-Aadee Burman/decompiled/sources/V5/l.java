package V5;

import java.util.Map;

/* loaded from: classes2.dex */
public final class l extends H4.g {
    private final H4.c groupComparisonType;

    public l() {
        super(com.onesignal.user.internal.operations.impl.executors.a.CUSTOM_EVENT);
        this.groupComparisonType = H4.c.NONE;
    }

    private final void setAppId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, com.anythink.expressad.videocommon.e.b.f22407u, str, null, false, 12, null);
    }

    private final void setOnesignalId(String str) {
        com.onesignal.common.modeling.i.setStringProperty$default(this, "onesignalId", str, null, false, 12, null);
    }

    private final void setTimeStamp(long j6) {
        com.onesignal.common.modeling.i.setLongProperty$default(this, "timeStamp", j6, null, false, 12, null);
    }

    public final String getAppId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, com.anythink.expressad.videocommon.e.b.f22407u, null, 2, null);
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
        return getAppId() + ".User." + getOnesignalId() + ".CustomEvent." + getEventName();
    }

    public final String getEventName() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "eventName", null, 2, null);
    }

    public final String getEventProperties() {
        return com.onesignal.common.modeling.i.getOptStringProperty$default(this, "eventProperties", null, 2, null);
    }

    @Override // H4.g
    public H4.c getGroupComparisonType() {
        return this.groupComparisonType;
    }

    @Override // H4.g
    public String getModifyComparisonKey() {
        return getAppId() + ".User." + getOnesignalId() + ".CustomEvent." + getEventName();
    }

    public final String getOnesignalId() {
        return com.onesignal.common.modeling.i.getStringProperty$default(this, "onesignalId", null, 2, null);
    }

    public final long getTimeStamp() {
        return com.onesignal.common.modeling.i.getLongProperty$default(this, "timeStamp", null, 2, null);
    }

    public final void setEventName(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        com.onesignal.common.modeling.i.setAnyProperty$default(this, "eventName", value, null, false, 12, null);
    }

    public final void setEventProperties(String str) {
        com.onesignal.common.modeling.i.setOptStringProperty$default(this, "eventProperties", str, null, false, 12, null);
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
    public l(String appId, String onesignalId, String str, long j6, String eventName, String str2) {
        this();
        kotlin.jvm.internal.h.e(appId, "appId");
        kotlin.jvm.internal.h.e(onesignalId, "onesignalId");
        kotlin.jvm.internal.h.e(eventName, "eventName");
        setAppId(appId);
        setOnesignalId(onesignalId);
        setExternalId$com_onesignal_core(str);
        setTimeStamp(j6);
        setEventName(eventName);
        setEventProperties(str2);
    }
}
