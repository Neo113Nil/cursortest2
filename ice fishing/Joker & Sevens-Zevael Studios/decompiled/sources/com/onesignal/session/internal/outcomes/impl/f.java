package com.onesignal.session.internal.outcomes.impl;

import org.json.JSONObject;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f {
    private final String outcomeId;
    private final m outcomeSource;
    private long sessionTime;
    private long timestamp;
    private float weight;

    public f(String str, m mVar, float f10, long j3, long j6) {
        pc.j.e(str, "outcomeId");
        this.outcomeId = str;
        this.outcomeSource = mVar;
        this.weight = f10;
        this.sessionTime = j3;
        this.timestamp = j6;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final m getOutcomeSource() {
        return this.outcomeSource;
    }

    public final long getSessionTime() {
        return this.sessionTime;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final boolean isUnattributed() {
        m mVar = this.outcomeSource;
        if (mVar != null) {
            return mVar.getDirectBody() == null && this.outcomeSource.getIndirectBody() == null;
        }
        return true;
    }

    public final void setSessionTime(long j3) {
        this.sessionTime = j3;
    }

    public final void setTimestamp(long j3) {
        this.timestamp = j3;
    }

    public final void setWeight(float f10) {
        this.weight = f10;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("id", this.outcomeId);
        m mVar = this.outcomeSource;
        if (mVar != null) {
            put.put("sources", mVar.toJSONObject());
        }
        float f10 = this.weight;
        if (f10 > 0.0f) {
            put.put("weight", Float.valueOf(f10));
        }
        long j3 = this.timestamp;
        if (j3 > 0) {
            put.put("timestamp", j3);
        }
        long j6 = this.sessionTime;
        if (j6 > 0) {
            put.put("session_time", j6);
        }
        pc.j.d(put, "json");
        return put;
    }

    public String toString() {
        return "OutcomeEventParams{outcomeId='" + this.outcomeId + "', outcomeSource=" + this.outcomeSource + ", weight=" + this.weight + ", timestamp=" + this.timestamp + ", sessionTime=" + this.sessionTime + '}';
    }
}
