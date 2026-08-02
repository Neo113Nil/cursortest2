package androidx.media3.exoplayer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class CodecParameters {
    public static final CodecParameters EMPTY = new CodecParameters(new HashMap());
    public final Map params;

    public CodecParameters(HashMap hashMap) {
        this.params = Collections.unmodifiableMap(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CodecParameters) {
            return this.params.equals(((CodecParameters) obj).params);
        }
        return false;
    }

    public final int hashCode() {
        return this.params.hashCode();
    }
}
