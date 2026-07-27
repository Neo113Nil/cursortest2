package android.content.Context;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTypefaceDragonShadowFusion9374 {
    public final long FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterTypefaceDragonShadowFusion9374(long j) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = j;
    }

    public static FrostHunterTypefaceDragonShadowFusion9374 FrostHunterAlphaAnimationNeoCosmos5761(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new FrostHunterTypefaceDragonShadowFusion9374(Long.parseLong(jsonReader.nextString())) : new FrostHunterTypefaceDragonShadowFusion9374(jsonReader.nextLong());
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
        return (obj instanceof FrostHunterTypefaceDragonShadowFusion9374) && this.FrostHunterAlphaAnimationNeoCosmos5761 == ((FrostHunterTypefaceDragonShadowFusion9374) obj).FrostHunterAlphaAnimationNeoCosmos5761;
    }

    public final int hashCode() {
        long j = this.FrostHunterAlphaAnimationNeoCosmos5761;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + "}";
    }
}
