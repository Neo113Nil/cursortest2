package com.onesignal.session.internal.outcomes.impl;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e implements M5.a {
    public static final a Companion = new a(null);
    private static final String NOTIFICATION_IDS = "notification_ids";
    private static final String OUTCOME_ID = "id";
    private static final String SESSION = "session";
    private static final String SESSION_TIME = "session_time";
    private static final String TIMESTAMP = "timestamp";
    private static final String WEIGHT = "weight";
    private final String name;
    private final JSONArray notificationIds;
    private final K5.d session;
    private final long sessionTime;
    private final long timestamp;
    private final float weight;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final e fromOutcomeEventParamstoOutcomeEvent(f outcomeEventParams) {
            JSONArray jSONArray;
            kotlin.jvm.internal.h.e(outcomeEventParams, "outcomeEventParams");
            K5.d dVar = K5.d.UNATTRIBUTED;
            if (outcomeEventParams.getOutcomeSource() != null) {
                m outcomeSource = outcomeEventParams.getOutcomeSource();
                if (outcomeSource.getDirectBody() != null) {
                    n directBody = outcomeSource.getDirectBody();
                    kotlin.jvm.internal.h.b(directBody);
                    if (directBody.getNotificationIds() != null) {
                        n directBody2 = outcomeSource.getDirectBody();
                        kotlin.jvm.internal.h.b(directBody2);
                        JSONArray notificationIds = directBody2.getNotificationIds();
                        kotlin.jvm.internal.h.b(notificationIds);
                        if (notificationIds.length() > 0) {
                            dVar = K5.d.DIRECT;
                            n directBody3 = outcomeSource.getDirectBody();
                            kotlin.jvm.internal.h.b(directBody3);
                            jSONArray = directBody3.getNotificationIds();
                            return new e(dVar, jSONArray, outcomeEventParams.getOutcomeId(), outcomeEventParams.getTimestamp(), outcomeEventParams.getSessionTime(), outcomeEventParams.getWeight());
                        }
                    }
                }
                if (outcomeSource.getIndirectBody() != null) {
                    n indirectBody = outcomeSource.getIndirectBody();
                    kotlin.jvm.internal.h.b(indirectBody);
                    if (indirectBody.getNotificationIds() != null) {
                        n indirectBody2 = outcomeSource.getIndirectBody();
                        kotlin.jvm.internal.h.b(indirectBody2);
                        JSONArray notificationIds2 = indirectBody2.getNotificationIds();
                        kotlin.jvm.internal.h.b(notificationIds2);
                        if (notificationIds2.length() > 0) {
                            dVar = K5.d.INDIRECT;
                            n indirectBody3 = outcomeSource.getIndirectBody();
                            kotlin.jvm.internal.h.b(indirectBody3);
                            jSONArray = indirectBody3.getNotificationIds();
                            return new e(dVar, jSONArray, outcomeEventParams.getOutcomeId(), outcomeEventParams.getTimestamp(), outcomeEventParams.getSessionTime(), outcomeEventParams.getWeight());
                        }
                    }
                }
            }
            jSONArray = null;
            return new e(dVar, jSONArray, outcomeEventParams.getOutcomeId(), outcomeEventParams.getTimestamp(), outcomeEventParams.getSessionTime(), outcomeEventParams.getWeight());
        }

        private a() {
        }
    }

    public e(K5.d session, JSONArray jSONArray, String name, long j6, long j9, float f3) {
        kotlin.jvm.internal.h.e(session, "session");
        kotlin.jvm.internal.h.e(name, "name");
        this.session = session;
        this.notificationIds = jSONArray;
        this.name = name;
        this.timestamp = j6;
        this.sessionTime = j9;
        this.weight = f3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class.equals(obj.getClass())) {
            e eVar = (e) obj;
            if (getSession() == eVar.getSession() && kotlin.jvm.internal.h.a(getNotificationIds(), eVar.getNotificationIds()) && kotlin.jvm.internal.h.a(getName(), eVar.getName()) && getTimestamp() == eVar.getTimestamp() && getSessionTime() == eVar.getSessionTime() && getWeight() == eVar.getWeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // M5.a
    public String getName() {
        return this.name;
    }

    @Override // M5.a
    public JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    @Override // M5.a
    public K5.d getSession() {
        return this.session;
    }

    @Override // M5.a
    public long getSessionTime() {
        return this.sessionTime;
    }

    @Override // M5.a
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // M5.a
    public float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        Object[] objArr = {getSession(), getNotificationIds(), getName(), Long.valueOf(getTimestamp()), Long.valueOf(getSessionTime()), Float.valueOf(getWeight())};
        int i = 1;
        for (int i6 = 0; i6 < 6; i6++) {
            Object obj = objArr[i6];
            i = (i * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SESSION, getSession());
        jSONObject.put("notification_ids", getNotificationIds());
        jSONObject.put("id", getName());
        jSONObject.put("timestamp", getTimestamp());
        jSONObject.put(SESSION_TIME, getSessionTime());
        jSONObject.put(WEIGHT, Float.valueOf(getWeight()));
        return jSONObject;
    }

    public String toString() {
        return "OutcomeEvent{session=" + getSession() + ", notificationIds=" + getNotificationIds() + ", name='" + getName() + "', timestamp=" + getTimestamp() + ", sessionTime=" + getSessionTime() + ", weight=" + getWeight() + '}';
    }
}
