package defpackage;

/* loaded from: classes10.dex */
public final class qr90 extends tr90 {
    public final float c;
    public final float d;

    public qr90(float f, float f2) {
        super(1);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr90)) {
            return false;
        }
        qr90 qr90Var = (qr90) obj;
        return Float.compare(this.c, qr90Var.c) == 0 && Float.compare(this.d, qr90Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.c);
        sb.append(", dy=");
        return n.n(sb, this.d, ')');
    }
}
