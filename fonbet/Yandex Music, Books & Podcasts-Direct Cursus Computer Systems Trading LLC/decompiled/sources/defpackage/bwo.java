package defpackage;

/* loaded from: classes6.dex */
public final class bwo {
    public final float a;
    public final float b;

    public bwo(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwo)) {
            return false;
        }
        bwo bwoVar = (bwo) obj;
        return Float.compare(this.a, bwoVar.a) == 0 && Float.compare(this.b, bwoVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollAreaOffsets(start=");
        sb.append(this.a);
        sb.append(", end=");
        return ouj.p(sb, this.b, ')');
    }
}
