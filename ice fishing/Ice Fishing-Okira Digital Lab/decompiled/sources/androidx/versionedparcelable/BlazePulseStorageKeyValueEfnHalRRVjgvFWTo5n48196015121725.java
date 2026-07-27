package androidx.versionedparcelable;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class BlazePulseStorageKeyValueEfnHalRRVjgvFWTo5n48196015121725 {
    public final long ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public BlazePulseStorageKeyValueEfnHalRRVjgvFWTo5n48196015121725(long j) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = j;
    }

    public static BlazePulseStorageKeyValueEfnHalRRVjgvFWTo5n48196015121725 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new BlazePulseStorageKeyValueEfnHalRRVjgvFWTo5n48196015121725(Long.parseLong(jsonReader.nextString())) : new BlazePulseStorageKeyValueEfnHalRRVjgvFWTo5n48196015121725(jsonReader.nextLong());
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
        return (obj instanceof BlazePulseStorageKeyValueEfnHalRRVjgvFWTo5n48196015121725) && this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 == ((BlazePulseStorageKeyValueEfnHalRRVjgvFWTo5n48196015121725) obj).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    }

    public final int hashCode() {
        long j = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 + "}";
    }
}
