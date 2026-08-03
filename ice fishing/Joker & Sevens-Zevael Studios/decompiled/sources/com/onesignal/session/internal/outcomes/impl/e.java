package com.onesignal.session.internal.outcomes.impl;

import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements cb.a {
    public static final a Companion = new a(null);
    private static final String NOTIFICATION_IDS = "notification_ids";
    private static final String OUTCOME_ID = "id";
    private static final String SESSION = "session";
    private static final String SESSION_TIME = "session_time";
    private static final String TIMESTAMP = "timestamp";
    private static final String WEIGHT = "weight";
    private final String name;
    private final JSONArray notificationIds;
    private final ab.d session;
    private final long sessionTime;
    private final long timestamp;
    private final float weight;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(pc.f fVar) {
            this();
        }

        public final e fromOutcomeEventParamstoOutcomeEvent(f fVar) {
            JSONArray jSONArray;
            pc.j.e(fVar, "outcomeEventParams");
            ab.d dVar = ab.d.UNATTRIBUTED;
            if (fVar.getOutcomeSource() != null) {
                m outcomeSource = fVar.getOutcomeSource();
                if (outcomeSource.getDirectBody() != null) {
                    n directBody = outcomeSource.getDirectBody();
                    pc.j.b(directBody);
                    if (directBody.getNotificationIds() != null) {
                        n directBody2 = outcomeSource.getDirectBody();
                        pc.j.b(directBody2);
                        JSONArray notificationIds = directBody2.getNotificationIds();
                        pc.j.b(notificationIds);
                        if (notificationIds.length() > 0) {
                            dVar = ab.d.DIRECT;
                            n directBody3 = outcomeSource.getDirectBody();
                            pc.j.b(directBody3);
                            jSONArray = directBody3.getNotificationIds();
                            return new e(dVar, jSONArray, fVar.getOutcomeId(), fVar.getTimestamp(), fVar.getSessionTime(), fVar.getWeight());
                        }
                    }
                }
                if (outcomeSource.getIndirectBody() != null) {
                    n indirectBody = outcomeSource.getIndirectBody();
                    pc.j.b(indirectBody);
                    if (indirectBody.getNotificationIds() != null) {
                        n indirectBody2 = outcomeSource.getIndirectBody();
                        pc.j.b(indirectBody2);
                        JSONArray notificationIds2 = indirectBody2.getNotificationIds();
                        pc.j.b(notificationIds2);
                        if (notificationIds2.length() > 0) {
                            dVar = ab.d.INDIRECT;
                            n indirectBody3 = outcomeSource.getIndirectBody();
                            pc.j.b(indirectBody3);
                            jSONArray = indirectBody3.getNotificationIds();
                            return new e(dVar, jSONArray, fVar.getOutcomeId(), fVar.getTimestamp(), fVar.getSessionTime(), fVar.getWeight());
                        }
                    }
                }
            }
            jSONArray = null;
            return new e(dVar, jSONArray, fVar.getOutcomeId(), fVar.getTimestamp(), fVar.getSessionTime(), fVar.getWeight());
        }

        private a() {
        }
    }

    public e(ab.d dVar, JSONArray jSONArray, String str, long j3, long j6, float f10) {
        pc.j.e(dVar, SESSION);
        pc.j.e(str, "name");
        this.session = dVar;
        this.notificationIds = jSONArray;
        this.name = str;
        this.timestamp = j3;
        this.sessionTime = j6;
        this.weight = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class.equals(obj.getClass())) {
            e eVar = (e) obj;
            if (getSession() == eVar.getSession() && pc.j.a(getNotificationIds(), eVar.getNotificationIds()) && pc.j.a(getName(), eVar.getName()) && getTimestamp() == eVar.getTimestamp() && getSessionTime() == eVar.getSessionTime() && getWeight() == eVar.getWeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // cb.a
    public String getName() {
        return this.name;
    }

    @Override // cb.a
    public JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    @Override // cb.a
    public ab.d getSession() {
        return this.session;
    }

    @Override // cb.a
    public long getSessionTime() {
        return this.sessionTime;
    }

    @Override // cb.a
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // cb.a
    public float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        Object[] objArr = {getSession(), getNotificationIds(), getName(), Long.valueOf(getTimestamp()), Long.valueOf(getSessionTime()), Float.valueOf(getWeight())};
        int i10 = 1;
        for (int i11 = 0; i11 < 6; i11++) {
            Object obj = objArr[i11];
            i10 = (i10 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i10;
    }

    public final JSONObject toJSONObject() {
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
