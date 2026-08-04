package com.gamericefishpro.space.pg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.gamericefishpro.space.og.a {
    public static final a Companion = new a(null);
    private static final String NOTIFICATION_IDS = "notification_ids";
    private static final String OUTCOME_ID = "id";
    private static final String SESSION = "session";
    private static final String SESSION_TIME = "session_time";
    private static final String TIMESTAMP = "timestamp";
    private static final String WEIGHT = "weight";
    private final String name;
    private final JSONArray notificationIds;
    private final com.gamericefishpro.space.mg.d session;
    private final long sessionTime;
    private final long timestamp;
    private final float weight;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0048  */
        /* JADX WARN: Code duplicated, block: B:14:0x004e  */
        /* JADX WARN: Code duplicated, block: B:16:0x005b  */
        /* JADX WARN: Code duplicated, block: B:18:0x006f  */
        /* JADX WARN: Code duplicated, block: B:19:0x007d  */
        public final e fromOutcomeEventParamstoOutcomeEvent(f outcomeEventParams) {
            JSONArray notificationIds;
            n indirectBody;
            JSONArray notificationIds2;
            Intrinsics.checkNotNullParameter(outcomeEventParams, "outcomeEventParams");
            com.gamericefishpro.space.mg.d dVar = com.gamericefishpro.space.mg.d.UNATTRIBUTED;
            if (outcomeEventParams.getOutcomeSource() != null) {
                m outcomeSource = outcomeEventParams.getOutcomeSource();
                if (outcomeSource.getDirectBody() != null) {
                    n directBody = outcomeSource.getDirectBody();
                    Intrinsics.b(directBody);
                    if (directBody.getNotificationIds() != null) {
                        n directBody2 = outcomeSource.getDirectBody();
                        Intrinsics.b(directBody2);
                        JSONArray notificationIds3 = directBody2.getNotificationIds();
                        Intrinsics.b(notificationIds3);
                        if (notificationIds3.length() > 0) {
                            dVar = com.gamericefishpro.space.mg.d.DIRECT;
                            n directBody3 = outcomeSource.getDirectBody();
                            Intrinsics.b(directBody3);
                            notificationIds = directBody3.getNotificationIds();
                        } else if (outcomeSource.getIndirectBody() != null) {
                            indirectBody = outcomeSource.getIndirectBody();
                            Intrinsics.b(indirectBody);
                            if (indirectBody.getNotificationIds() != null) {
                                n indirectBody2 = outcomeSource.getIndirectBody();
                                Intrinsics.b(indirectBody2);
                                notificationIds2 = indirectBody2.getNotificationIds();
                                Intrinsics.b(notificationIds2);
                                if (notificationIds2.length() > 0) {
                                    dVar = com.gamericefishpro.space.mg.d.INDIRECT;
                                    n indirectBody3 = outcomeSource.getIndirectBody();
                                    Intrinsics.b(indirectBody3);
                                    notificationIds = indirectBody3.getNotificationIds();
                                } else {
                                    notificationIds = null;
                                }
                            } else {
                                notificationIds = null;
                            }
                        } else {
                            notificationIds = null;
                        }
                    } else if (outcomeSource.getIndirectBody() != null) {
                        indirectBody = outcomeSource.getIndirectBody();
                        Intrinsics.b(indirectBody);
                        if (indirectBody.getNotificationIds() != null) {
                            n indirectBody4 = outcomeSource.getIndirectBody();
                            Intrinsics.b(indirectBody4);
                            notificationIds2 = indirectBody4.getNotificationIds();
                            Intrinsics.b(notificationIds2);
                            if (notificationIds2.length() > 0) {
                                dVar = com.gamericefishpro.space.mg.d.INDIRECT;
                                n indirectBody5 = outcomeSource.getIndirectBody();
                                Intrinsics.b(indirectBody5);
                                notificationIds = indirectBody5.getNotificationIds();
                            } else {
                                notificationIds = null;
                            }
                        } else {
                            notificationIds = null;
                        }
                    } else {
                        notificationIds = null;
                    }
                } else if (outcomeSource.getIndirectBody() != null) {
                    indirectBody = outcomeSource.getIndirectBody();
                    Intrinsics.b(indirectBody);
                    if (indirectBody.getNotificationIds() != null) {
                        n indirectBody6 = outcomeSource.getIndirectBody();
                        Intrinsics.b(indirectBody6);
                        notificationIds2 = indirectBody6.getNotificationIds();
                        Intrinsics.b(notificationIds2);
                        if (notificationIds2.length() > 0) {
                            dVar = com.gamericefishpro.space.mg.d.INDIRECT;
                            n indirectBody7 = outcomeSource.getIndirectBody();
                            Intrinsics.b(indirectBody7);
                            notificationIds = indirectBody7.getNotificationIds();
                        } else {
                            notificationIds = null;
                        }
                    } else {
                        notificationIds = null;
                    }
                } else {
                    notificationIds = null;
                }
            } else {
                notificationIds = null;
            }
            return new e(dVar, notificationIds, outcomeEventParams.getOutcomeId(), outcomeEventParams.getTimestamp(), outcomeEventParams.getSessionTime(), outcomeEventParams.getWeight());
        }

        private a() {
        }
    }

    public e(com.gamericefishpro.space.mg.d session, JSONArray jSONArray, String name, long j, long j2, float f) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(name, "name");
        this.session = session;
        this.notificationIds = jSONArray;
        this.name = name;
        this.timestamp = j;
        this.sessionTime = j2;
        this.weight = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class.equals(obj.getClass())) {
            e eVar = (e) obj;
            if (getSession() == eVar.getSession() && Intrinsics.a(getNotificationIds(), eVar.getNotificationIds()) && Intrinsics.a(getName(), eVar.getName()) && getTimestamp() == eVar.getTimestamp() && getSessionTime() == eVar.getSessionTime() && getWeight() == eVar.getWeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.gamericefishpro.space.og.a
    public String getName() {
        return this.name;
    }

    @Override // com.gamericefishpro.space.og.a
    public JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    @Override // com.gamericefishpro.space.og.a
    public com.gamericefishpro.space.mg.d getSession() {
        return this.session;
    }

    @Override // com.gamericefishpro.space.og.a
    public long getSessionTime() {
        return this.sessionTime;
    }

    @Override // com.gamericefishpro.space.og.a
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.gamericefishpro.space.og.a
    public float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        Object[] objArr = {getSession(), getNotificationIds(), getName(), Long.valueOf(getTimestamp()), Long.valueOf(getSessionTime()), Float.valueOf(getWeight())};
        int iHashCode = 1;
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SESSION, getSession());
        jSONObject.put("notification_ids", getNotificationIds());
        jSONObject.put(OUTCOME_ID, getName());
        jSONObject.put(TIMESTAMP, getTimestamp());
        jSONObject.put(SESSION_TIME, getSessionTime());
        jSONObject.put(WEIGHT, Float.valueOf(getWeight()));
        return jSONObject;
    }

    public String toString() {
        return "OutcomeEvent{session=" + getSession() + ", notificationIds=" + getNotificationIds() + ", name='" + getName() + "', timestamp=" + getTimestamp() + ", sessionTime=" + getSessionTime() + ", weight=" + getWeight() + '}';
    }
}
