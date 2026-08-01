package com.google.android.datatransport;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseRepository {
    public final long WinterFlowRouterStructure;

    public WinterFlowDatabaseRepository(long j) {
        this.WinterFlowRouterStructure = j;
    }

    public static WinterFlowDatabaseRepository WinterFlowRouterStructure(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new WinterFlowDatabaseRepository(Long.parseLong(jsonReader.nextString())) : new WinterFlowDatabaseRepository(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof WinterFlowDatabaseRepository) && this.WinterFlowRouterStructure == ((WinterFlowDatabaseRepository) obj).WinterFlowRouterStructure;
    }

    public final int hashCode() {
        long j = this.WinterFlowRouterStructure;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.WinterFlowRouterStructure + "}";
    }
}
