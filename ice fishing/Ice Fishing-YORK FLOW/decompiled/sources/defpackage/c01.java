package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class c01 {
    public final long GE9mJIPrb8gP;
    public final boolean JhCgjQRTAOCT;
    public final float Ns0WNyEWdPsk;
    public final boolean P05cfTpS5W5L;
    public final long QiMR8OkAhezm;
    public boolean T1fB7bDYiVJQ;
    public final float WDYagTQQm9ns;
    public defpackage.c01 WmetiUbpKU9I;
    public boolean XntWc4eZSQ8j;
    public final long ZpBGe2uQfcn8;
    public final int e6mdH7fiFuta;
    public final long fNwYGHIYeJcR;
    public final long fWTAfUmVKrZq;
    public final long gUjdnLbkVAaA;
    public final long giKS3J6vZuNy;
    public final java.util.ArrayList h3m55N1URyyK;
    public final long oh71FJcDz6S2;

    public c01(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.ZpBGe2uQfcn8 = j;
        this.giKS3J6vZuNy = j2;
        this.fWTAfUmVKrZq = j3;
        this.JhCgjQRTAOCT = z;
        this.WDYagTQQm9ns = f;
        this.oh71FJcDz6S2 = j4;
        this.QiMR8OkAhezm = j5;
        this.P05cfTpS5W5L = z2;
        this.e6mdH7fiFuta = i;
        this.GE9mJIPrb8gP = j6;
        this.Ns0WNyEWdPsk = f2;
        this.fNwYGHIYeJcR = j7;
        this.gUjdnLbkVAaA = 0L;
        this.T1fB7bDYiVJQ = z3;
        this.XntWc4eZSQ8j = z3;
    }

    public final void ZpBGe2uQfcn8() {
        defpackage.c01 c01Var = this.WmetiUbpKU9I;
        if (c01Var == null) {
            this.T1fB7bDYiVJQ = true;
            this.XntWc4eZSQ8j = true;
        } else if (c01Var != null) {
            c01Var.ZpBGe2uQfcn8();
        }
    }

    public final boolean giKS3J6vZuNy() {
        defpackage.c01 c01Var = this.WmetiUbpKU9I;
        return c01Var != null ? c01Var.giKS3J6vZuNy() : this.T1fB7bDYiVJQ || this.XntWc4eZSQ8j;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PointerInputChange(id=");
        sb.append((java.lang.Object) defpackage.t80.OVwOqzUGHcCU(this.ZpBGe2uQfcn8));
        sb.append(", uptimeMillis=");
        sb.append(this.giKS3J6vZuNy);
        sb.append(", position=");
        sb.append((java.lang.Object) defpackage.ws0.QiMR8OkAhezm(this.fWTAfUmVKrZq));
        sb.append(", pressed=");
        sb.append(this.JhCgjQRTAOCT);
        sb.append(", pressure=");
        sb.append(this.WDYagTQQm9ns);
        sb.append(", previousUptimeMillis=");
        sb.append(this.oh71FJcDz6S2);
        sb.append(", previousPosition=");
        sb.append((java.lang.Object) defpackage.ws0.QiMR8OkAhezm(this.QiMR8OkAhezm));
        sb.append(", previousPressed=");
        sb.append(this.P05cfTpS5W5L);
        sb.append(", isConsumed=");
        sb.append(giKS3J6vZuNy());
        sb.append(", type=");
        sb.append((java.lang.Object) defpackage.i01.ZpBGe2uQfcn8(this.e6mdH7fiFuta));
        sb.append(", historical=");
        java.lang.Object obj = this.h3m55N1URyyK;
        if (obj == null) {
            obj = defpackage.av.WDYagTQQm9ns;
        }
        sb.append(obj);
        sb.append(", scrollDelta=");
        sb.append((java.lang.Object) defpackage.ws0.QiMR8OkAhezm(this.GE9mJIPrb8gP));
        sb.append(", scaleFactor=");
        sb.append(this.Ns0WNyEWdPsk);
        sb.append(", panOffset=");
        sb.append((java.lang.Object) defpackage.ws0.QiMR8OkAhezm(this.fNwYGHIYeJcR));
        sb.append(')');
        return sb.toString();
    }

    public c01(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, java.util.ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.h3m55N1URyyK = arrayList;
        this.gUjdnLbkVAaA = j8;
    }
}
