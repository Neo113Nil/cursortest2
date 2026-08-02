package defpackage;

/* loaded from: classes3.dex */
public final class b1d implements a1a {
    public final int a;
    public final int b;

    public b1d(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1d)) {
            return false;
        }
        b1d b1dVar = (b1d) obj;
        return this.a == b1dVar.a && this.b == b1dVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GalleryState(visibleItemIndex=");
        sb.append(this.a);
        sb.append(", scrollOffset=");
        return vz1.r(sb, this.b, ')');
    }
}
