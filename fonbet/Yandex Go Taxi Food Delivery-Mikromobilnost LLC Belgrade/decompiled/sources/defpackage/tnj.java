package defpackage;

/* loaded from: classes13.dex */
public final class tnj implements fw90 {
    public final eq51 a;

    public tnj(eq51 eq51Var) {
        this.a = eq51Var;
    }

    @Override // defpackage.fw90
    public final bw90 b(u0k u0kVar) {
        xw91 xw91Var = xw91.C;
        if (!(u0kVar instanceof yy51)) {
            return xw91Var;
        }
        int i = snj.a[this.a.a((yy51) u0kVar).d.ordinal()];
        if (i == 1 || i == 2) {
            return xw91Var;
        }
        if (i == 3) {
            return aw90.a;
        }
        w511.b();
        return null;
    }
}
