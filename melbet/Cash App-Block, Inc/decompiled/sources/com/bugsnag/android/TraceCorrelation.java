package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class TraceCorrelation implements JsonStream.Streamable {
    public final long spanId;
    public final UUID traceId;

    public TraceCorrelation(UUID uuid, long j) {
        this.traceId = uuid;
        this.spanId = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraceCorrelation)) {
            return false;
        }
        TraceCorrelation traceCorrelation = (TraceCorrelation) obj;
        return this.traceId.equals(traceCorrelation.traceId) && this.spanId == traceCorrelation.spanId;
    }

    public final int hashCode() {
        return Long.hashCode(this.spanId) + (this.traceId.hashCode() * 31);
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        jsonStream.beginObject();
        jsonStream.name("traceId");
        UUID uuid = this.traceId;
        jsonStream.value(String.format("%016x%016x", Arrays.copyOf(new Object[]{Long.valueOf(uuid.getMostSignificantBits()), Long.valueOf(uuid.getLeastSignificantBits())}, 2)));
        jsonStream.name("spanId");
        jsonStream.value(String.format("%016x", Arrays.copyOf(new Object[]{Long.valueOf(this.spanId)}, 1)));
        jsonStream.endObject();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TraceCorrelation(traceId=");
        sb.append(this.traceId);
        sb.append(", spanId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.spanId, ')');
    }
}
