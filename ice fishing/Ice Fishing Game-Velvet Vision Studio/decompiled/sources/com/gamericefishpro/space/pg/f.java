package com.gamericefishpro.space.pg;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    private final String outcomeId;
    private final m outcomeSource;
    private long sessionTime;
    private long timestamp;
    private float weight;

    public f(String outcomeId, m mVar, float f, long j, long j2) {
        Intrinsics.checkNotNullParameter(outcomeId, "outcomeId");
        this.outcomeId = outcomeId;
        this.outcomeSource = mVar;
        this.weight = f;
        this.sessionTime = j;
        this.timestamp = j2;
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

    public final void setSessionTime(long j) {
        this.sessionTime = j;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("id", this.outcomeId);
        m mVar = this.outcomeSource;
        if (mVar != null) {
            jSONObjectPut.put("sources", mVar.toJSONObject());
        }
        float f = this.weight;
        if (f > 0.0f) {
            jSONObjectPut.put("weight", Float.valueOf(f));
        }
        long j = this.timestamp;
        if (j > 0) {
            jSONObjectPut.put("timestamp", j);
        }
        long j2 = this.sessionTime;
        if (j2 > 0) {
            jSONObjectPut.put("session_time", j2);
        }
        Intrinsics.b(jSONObjectPut);
        return jSONObjectPut;
    }

    public String toString() {
        return "OutcomeEventParams{outcomeId='" + this.outcomeId + "', outcomeSource=" + this.outcomeSource + ", weight=" + this.weight + ", timestamp=" + this.timestamp + ", sessionTime=" + this.sessionTime + '}';
    }
}
