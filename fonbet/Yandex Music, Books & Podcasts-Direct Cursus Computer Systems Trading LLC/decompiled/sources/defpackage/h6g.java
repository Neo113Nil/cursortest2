package defpackage;

/* loaded from: classes.dex */
public final class h6g {
    public static final h6g c = new h6g(17, e6g.c);
    public final float a;
    public final int b;

    public h6g(int i, float f) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6g)) {
            return false;
        }
        h6g h6gVar = (h6g) obj;
        float f = h6gVar.a;
        float f2 = e6g.b;
        return Float.compare(this.a, f) == 0 && this.b == h6gVar.b;
    }

    public final int hashCode() {
        float f = e6g.b;
        return Integer.hashCode(0) + f1d.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) e6g.b(this.a));
        sb.append(", trim=");
        int i = this.b;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=Mode(value=0))");
        return sb.toString();
    }
}
