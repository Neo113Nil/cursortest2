package defpackage;

/* loaded from: classes12.dex */
public abstract class zr9 {
    public static final byk0 a = cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12);
    public static final byk0 b = cyk0.c(24.0f);

    public static final void a(sr9 sr9Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-289937555);
        int i2 = (btsVar.k(sr9Var) ? 4 : 2) | i;
        if (!btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.Y();
        } else if (sr9Var instanceof pna) {
            btsVar.e0(542887793);
            jjb1.b((pna) sr9Var, btsVar, (i2 & 14) | 8);
            btsVar.t(false);
        } else if (sr9Var instanceof kna) {
            btsVar.e0(542890332);
            gjb1.a((kna) sr9Var, btsVar, (i2 & 14) | 8);
            btsVar.t(false);
        } else {
            if (!(sr9Var instanceof mya)) {
                throw unr0.y(542886481, btsVar, false);
            }
            btsVar.e0(542893080);
            ikb1.a((mya) sr9Var, btsVar, (i2 & 14) | 8);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hh8(sr9Var, i, 13);
        }
    }
}
