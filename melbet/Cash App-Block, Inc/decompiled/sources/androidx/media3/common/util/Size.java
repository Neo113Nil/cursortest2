package androidx.media3.common.util;

import androidx.tracing.Trace;

/* loaded from: classes3.dex */
public final class Size {
    public static final Size UNKNOWN = new Size(-1, -1);
    public final int height;
    public final int width;

    static {
        new Size(0, 0);
        Util.intToStringMaxRadix(0);
        Util.intToStringMaxRadix(1);
    }

    public Size(int i, int i2) {
        Trace.checkArgument((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.width = i;
        this.height = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.width == size.width && this.height == size.height) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.width;
        int i2 = i << 16;
        return this.height ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.width + "x" + this.height;
    }
}
