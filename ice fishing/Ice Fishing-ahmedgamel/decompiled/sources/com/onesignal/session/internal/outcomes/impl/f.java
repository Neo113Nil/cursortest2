package com.onesignal.session.internal.outcomes.impl;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f {
    private final String outcomeId;
    private final m outcomeSource;
    private long sessionTime;
    private long timestamp;
    private float weight;

    public f(String outcomeId, m mVar, float f2, long j6, long j9) {
        kotlin.jvm.internal.h.e(outcomeId, "outcomeId");
        this.outcomeId = outcomeId;
        this.outcomeSource = mVar;
        this.weight = f2;
        this.sessionTime = j6;
        this.timestamp = j9;
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

    public final void setSessionTime(long j6) {
        this.sessionTime = j6;
    }

    public final void setTimestamp(long j6) {
        this.timestamp = j6;
    }

    public final void setWeight(float f2) {
        this.weight = f2;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("id", this.outcomeId);
        m mVar = this.outcomeSource;
        if (mVar != null) {
            put.put("sources", mVar.toJSONObject());
        }
        float f2 = this.weight;
        if (f2 > 0.0f) {
            put.put("weight", Float.valueOf(f2));
        }
        long j6 = this.timestamp;
        if (j6 > 0) {
            put.put(com.anythink.expressad.foundation.d.d.f19383u, j6);
        }
        long j9 = this.sessionTime;
        if (j9 > 0) {
            put.put("session_time", j9);
        }
        kotlin.jvm.internal.h.b(put);
        return put;
    }

    public String toString() {
        return "OutcomeEventParams{outcomeId='" + this.outcomeId + "', outcomeSource=" + this.outcomeSource + ", weight=" + this.weight + ", timestamp=" + this.timestamp + ", sessionTime=" + this.sessionTime + '}';
    }
}
