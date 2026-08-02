package defpackage;

/* loaded from: classes.dex */
public final class oum {
    public static final oum d = new oum(0.0f, new fq4(0.0f, 0.0f), 0);
    public final float a;
    public final gq4 b;
    public final int c;

    public oum(float f, gq4 gq4Var, int i) {
        this.a = f;
        this.b = gq4Var;
        this.c = i;
        if (Float.isNaN(f)) {
            xq0.x("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oum)) {
            return false;
        }
        oum oumVar = (oum) obj;
        return this.a == oumVar.a && this.b.equals(oumVar.b) && this.c == oumVar.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append(this.b);
        sb.append(", steps=");
        return vz1.r(sb, this.c, ')');
    }
}
