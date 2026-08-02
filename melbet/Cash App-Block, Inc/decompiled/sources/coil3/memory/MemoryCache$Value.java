package coil3.memory;

import androidx.core.os.BundleKt;
import coil3.Image;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MemoryCache$Value {
    public final Map extras;
    public final Image image;

    public MemoryCache$Value(Image image, Map map) {
        this.image = image;
        this.extras = BundleKt.toImmutableMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemoryCache$Value)) {
            return false;
        }
        MemoryCache$Value memoryCache$Value = (MemoryCache$Value) obj;
        return Intrinsics.areEqual(this.image, memoryCache$Value.image) && Intrinsics.areEqual(this.extras, memoryCache$Value.extras);
    }

    public final Map getExtras() {
        return this.extras;
    }

    public final Image getImage() {
        return this.image;
    }

    public final int hashCode() {
        return this.extras.hashCode() + (this.image.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.image + ", extras=" + this.extras + ")";
    }
}
