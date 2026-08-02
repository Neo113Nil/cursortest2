package coil3.memory;

import androidx.core.os.BundleKt;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MemoryCache$Key {
    public final Map extras;
    public final String key;

    public MemoryCache$Key(String str, Map map) {
        this.key = str;
        this.extras = BundleKt.toImmutableMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemoryCache$Key)) {
            return false;
        }
        MemoryCache$Key memoryCache$Key = (MemoryCache$Key) obj;
        return Intrinsics.areEqual(this.key, memoryCache$Key.key) && Intrinsics.areEqual(this.extras, memoryCache$Key.extras);
    }

    public final Map getExtras() {
        return this.extras;
    }

    public final int hashCode() {
        return this.extras.hashCode() + (this.key.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.key + ", extras=" + this.extras + ")";
    }
}
