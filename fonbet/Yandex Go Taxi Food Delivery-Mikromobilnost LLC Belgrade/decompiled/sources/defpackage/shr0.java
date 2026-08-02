package defpackage;

/* loaded from: classes2.dex */
public final class shr0 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public /* synthetic */ shr0(float f, float f2, float f3, int i, String str) {
        this(str, 0.0f, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? 0.0f : f2, (i & 16) != 0 ? 0.0f : f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shr0)) {
            return false;
        }
        shr0 shr0Var = (shr0) obj;
        return jl40.l(this.a, shr0Var.a) && Float.compare(this.b, shr0Var.b) == 0 && Float.compare(this.c, shr0Var.c) == 0 && Float.compare(this.d, shr0Var.d) == 0 && Float.compare(this.e, shr0Var.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + g8e.c(this.d, g8e.c(this.c, g8e.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeImageContent(url=");
        sb.append(this.a);
        sb.append(", topLeftCornerRadius=");
        sb.append(this.b);
        sb.append(", topRightCornerRadius=");
        sb.append(this.c);
        sb.append(", bottomLeftCornerRadius=");
        sb.append(this.d);
        sb.append(", bottomRightCornerRadius=");
        return n.n(sb, this.e, ')');
    }

    public shr0(String str, float f, float f2, float f3, float f4) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }
}
