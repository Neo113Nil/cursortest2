package kotlin.text;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes.dex */
public final class CatchingFishIntent {
    public final long CatchingFishParcelableFAB;

    public CatchingFishIntent(long j) {
        this.CatchingFishParcelableFAB = j;
    }

    public static CatchingFishIntent CatchingFishParcelableFAB(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new CatchingFishIntent(Long.parseLong(jsonReader.nextString())) : new CatchingFishIntent(jsonReader.nextLong());
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
        return (obj instanceof CatchingFishIntent) && this.CatchingFishParcelableFAB == ((CatchingFishIntent) obj).CatchingFishParcelableFAB;
    }

    public final int hashCode() {
        long j = this.CatchingFishParcelableFAB;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.CatchingFishParcelableFAB + "}";
    }
}
