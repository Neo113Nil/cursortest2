package bo.app;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class h8 {
    public final JSONArray a;

    public h8(JSONArray jSONArray) {
        jSONArray.getClass();
        this.a = jSONArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8) && Intrinsics.areEqual(this.a, ((h8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FeatureFlagsReceivedEvent(featureFlagsData=" + this.a + ")";
    }
}
