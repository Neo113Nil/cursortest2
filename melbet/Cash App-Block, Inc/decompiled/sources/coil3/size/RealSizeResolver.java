package coil3.size;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class RealSizeResolver implements SizeResolver {
    public final Size size;

    public RealSizeResolver(Size size) {
        this.size = size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RealSizeResolver) && this.size.equals(((RealSizeResolver) obj).size);
    }

    public final int hashCode() {
        return this.size.hashCode();
    }

    @Override // coil3.size.SizeResolver
    public final Object size(Continuation continuation) {
        return this.size;
    }

    public final String toString() {
        return "RealSizeResolver(size=" + this.size + ")";
    }
}
