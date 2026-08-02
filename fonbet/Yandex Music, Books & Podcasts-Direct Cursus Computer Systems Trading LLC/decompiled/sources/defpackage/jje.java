package defpackage;

/* loaded from: classes3.dex */
public final class jje implements kje {
    public final float a;
    public final int b;

    public jje(int i, float f) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jje)) {
            return false;
        }
        jje jjeVar = (jje) obj;
        return Float.compare(this.a, jjeVar.a) == 0 && this.b == jjeVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stretch(itemSpacing=");
        sb.append(this.a);
        sb.append(", maxVisibleItems=");
        return vz1.r(sb, this.b, ')');
    }
}
