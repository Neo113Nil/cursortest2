package coil3.size;

import coil3.size.Dimension;

/* loaded from: classes.dex */
public final class Size {
    public static final Size ORIGINAL;
    public final Dimension height;
    public final Dimension width;

    static {
        Dimension.Undefined undefined = Dimension.Undefined.INSTANCE;
        ORIGINAL = new Size(undefined, undefined);
    }

    public Size(Dimension dimension, Dimension dimension2) {
        this.width = dimension;
        this.height = dimension2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return this.width.equals(size.width) && this.height.equals(size.height);
    }

    public final int hashCode() {
        return this.height.hashCode() + (this.width.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.width + ", height=" + this.height + ")";
    }
}
