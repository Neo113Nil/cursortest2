package androidx.compose.material;

import androidx.compose.foundation.shape.CornerBasedShape;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Shapes {
    public final CornerBasedShape large;
    public final CornerBasedShape medium;
    public final CornerBasedShape small;

    public Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3) {
        this.small = cornerBasedShape;
        this.medium = cornerBasedShape2;
        this.large = cornerBasedShape3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) obj;
        return Intrinsics.areEqual(this.small, shapes.small) && Intrinsics.areEqual(this.medium, shapes.medium) && Intrinsics.areEqual(this.large, shapes.large);
    }

    public final int hashCode() {
        return this.large.hashCode() + ((this.medium.hashCode() + (this.small.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ')';
    }
}
