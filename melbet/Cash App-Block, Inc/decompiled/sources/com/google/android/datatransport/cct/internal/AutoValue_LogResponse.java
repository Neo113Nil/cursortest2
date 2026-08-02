package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class AutoValue_LogResponse {
    public final long nextRequestWaitMillis;

    public AutoValue_LogResponse(long j) {
        this.nextRequestWaitMillis = j;
    }

    public static AutoValue_LogResponse fromJson(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new AutoValue_LogResponse(Long.parseLong(jsonReader.nextString())) : new AutoValue_LogResponse(jsonReader.nextLong());
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
        return (obj instanceof AutoValue_LogResponse) && this.nextRequestWaitMillis == ((AutoValue_LogResponse) obj).nextRequestWaitMillis;
    }

    public final int hashCode() {
        long j = this.nextRequestWaitMillis;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.nextRequestWaitMillis, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
