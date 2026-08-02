package defpackage;

/* loaded from: classes.dex */
public final class idp {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final cds f;

    public idp(long j, int i, int i2, int i3, int i4, cds cdsVar) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = cdsVar;
    }

    public final xdp a(int i) {
        return new xdp(ldg.w(this.f, i), i, this.a);
    }

    public final iu6 b() {
        int i = this.c;
        int i2 = this.d;
        return i < i2 ? iu6.b : i > i2 ? iu6.a : iu6.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.a);
        sb.append(", range=(");
        int i = this.c;
        sb.append(i);
        sb.append('-');
        cds cdsVar = this.f;
        sb.append(ldg.w(cdsVar, i));
        sb.append(',');
        int i2 = this.d;
        sb.append(i2);
        sb.append('-');
        sb.append(ldg.w(cdsVar, i2));
        sb.append("), prevOffset=");
        return vz1.r(sb, this.e, ')');
    }
}
