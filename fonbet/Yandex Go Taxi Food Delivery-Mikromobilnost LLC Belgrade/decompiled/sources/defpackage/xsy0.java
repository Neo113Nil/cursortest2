package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxsy0;", "Lj530;", "Laty0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class xsy0 extends j530 {
    public final xfc A;
    public final String a;
    public final ety0 b;
    public final dyr c;
    public final int w;
    public final boolean x;
    public final int y;
    public final int z;

    public xsy0(String str, ety0 ety0Var, dyr dyrVar, int i, boolean z, int i2, int i3, xfc xfcVar) {
        this.a = str;
        this.b = ety0Var;
        this.c = dyrVar;
        this.w = i;
        this.x = z;
        this.y = i2;
        this.z = i3;
        this.A = xfcVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        aty0 aty0Var = new aty0();
        aty0Var.a = this.a;
        aty0Var.b = this.b;
        aty0Var.c = this.c;
        aty0Var.w = this.w;
        aty0Var.x = this.x;
        aty0Var.y = this.y;
        aty0Var.z = this.z;
        aty0Var.A = this.A;
        return aty0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsy0)) {
            return false;
        }
        xsy0 xsy0Var = (xsy0) obj;
        return jl40.l(this.A, xsy0Var.A) && jl40.l(this.a, xsy0Var.a) && jl40.l(this.b, xsy0Var.b) && jl40.l(this.c, xsy0Var.c) && this.w == xsy0Var.w && this.x == xsy0Var.x && this.y == xsy0Var.y && this.z == xsy0Var.z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r5.a.c(r2.a) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0075  */
    @Override // defpackage.j530
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(e530 e530Var) {
        boolean z;
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        dyr dyrVar;
        dyr dyrVar2;
        int i5;
        int i6;
        aty0 aty0Var = (aty0) e530Var;
        xfc xfcVar = aty0Var.A;
        xfc xfcVar2 = this.A;
        boolean l = jl40.l(xfcVar2, xfcVar);
        aty0Var.A = xfcVar2;
        boolean z4 = false;
        boolean z5 = true;
        ety0 ety0Var = this.b;
        if (l) {
            ety0 ety0Var2 = aty0Var.b;
            if (ety0Var == ety0Var2) {
                ety0Var.getClass();
            }
            z = false;
            str = aty0Var.a;
            str2 = this.a;
            if (!jl40.l(str, str2)) {
                aty0Var.a = str2;
                aty0Var.F = null;
                z4 = true;
            }
            boolean z6 = !aty0Var.b.c(ety0Var);
            aty0Var.b = ety0Var;
            i = aty0Var.z;
            i2 = this.z;
            if (i != i2) {
                aty0Var.z = i2;
                z6 = true;
            }
            i3 = aty0Var.y;
            i4 = this.y;
            if (i3 != i4) {
                aty0Var.y = i4;
                z6 = true;
            }
            z2 = aty0Var.x;
            z3 = this.x;
            if (z2 != z3) {
                aty0Var.x = z3;
                z6 = true;
            }
            dyrVar = aty0Var.c;
            dyrVar2 = this.c;
            if (!jl40.l(dyrVar, dyrVar2)) {
                aty0Var.c = dyrVar2;
                z6 = true;
            }
            i5 = aty0Var.w;
            i6 = this.w;
            if (i5 != i6) {
                z5 = z6;
            } else {
                aty0Var.w = i6;
            }
            if (!z || z4 || z5) {
                aty0Var.D = null;
            }
            if (!z4 || z5) {
                aty0Var.E0().f(aty0Var.a, aty0Var.b, aty0Var.c, aty0Var.w, aty0Var.x, aty0Var.y, aty0Var.z);
            }
            if (aty0Var.isAttached()) {
                return;
            }
            if (z4 || (z && aty0Var.E != null)) {
                qje.P(aty0Var).D();
            }
            if (z4 || z5) {
                qje.P(aty0Var).C();
                rzo.D(aty0Var);
            }
            if (z) {
                rzo.D(aty0Var);
                return;
            }
            return;
        }
        z = true;
        str = aty0Var.a;
        str2 = this.a;
        if (!jl40.l(str, str2)) {
        }
        boolean z62 = !aty0Var.b.c(ety0Var);
        aty0Var.b = ety0Var;
        i = aty0Var.z;
        i2 = this.z;
        if (i != i2) {
        }
        i3 = aty0Var.y;
        i4 = this.y;
        if (i3 != i4) {
        }
        z2 = aty0Var.x;
        z3 = this.x;
        if (z2 != z3) {
        }
        dyrVar = aty0Var.c;
        dyrVar2 = this.c;
        if (!jl40.l(dyrVar, dyrVar2)) {
        }
        i5 = aty0Var.w;
        i6 = this.w;
        if (i5 != i6) {
        }
        if (!z) {
        }
        aty0Var.D = null;
        if (!z4) {
        }
        aty0Var.E0().f(aty0Var.a, aty0Var.b, aty0Var.c, aty0Var.w, aty0Var.x, aty0Var.y, aty0Var.z);
        if (aty0Var.isAttached()) {
        }
    }

    public final int hashCode() {
        int e = (((unr0.e(oyr.b(this.w, (this.c.hashCode() + tse0.b(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31, this.x) + this.y) * 31) + this.z) * 31;
        xfc xfcVar = this.A;
        return e + (xfcVar != null ? xfcVar.hashCode() : 0);
    }
}
