package defpackage;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvjy0;", "Lj530;", "Lyjy0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class vjy0 extends j530 {
    public final int A;
    public final List B;
    public final tls C;
    public final xfc D;
    public final xt3 E;
    public final tls F;
    public final kk2 a;
    public final ety0 b;
    public final dyr c;
    public final tls w;
    public final int x;
    public final boolean y;
    public final int z;

    public vjy0(kk2 kk2Var, ety0 ety0Var, dyr dyrVar, tls tlsVar, int i, boolean z, int i2, int i3, List list, tls tlsVar2, xfc xfcVar, xt3 xt3Var, tls tlsVar3) {
        this.a = kk2Var;
        this.b = ety0Var;
        this.c = dyrVar;
        this.w = tlsVar;
        this.x = i;
        this.y = z;
        this.z = i2;
        this.A = i3;
        this.B = list;
        this.C = tlsVar2;
        this.D = xfcVar;
        this.E = xt3Var;
        this.F = tlsVar3;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new yjy0(this.a, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C, null, this.D, this.E, this.F);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjy0)) {
            return false;
        }
        vjy0 vjy0Var = (vjy0) obj;
        return jl40.l(this.D, vjy0Var.D) && jl40.l(this.a, vjy0Var.a) && jl40.l(this.b, vjy0Var.b) && jl40.l(this.B, vjy0Var.B) && jl40.l(this.c, vjy0Var.c) && this.w == vjy0Var.w && this.F == vjy0Var.F && this.x == vjy0Var.x && this.y == vjy0Var.y && this.z == vjy0Var.z && this.A == vjy0Var.A && this.C == vjy0Var.C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r1.a.c(r11.a) != false) goto L10;
     */
    @Override // defpackage.j530
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(e530 e530Var) {
        boolean z;
        yjy0 yjy0Var = (yjy0) e530Var;
        xfc xfcVar = yjy0Var.E;
        xfc xfcVar2 = this.D;
        boolean l = jl40.l(xfcVar2, xfcVar);
        yjy0Var.E = xfcVar2;
        if (l) {
            ety0 ety0Var = yjy0Var.b;
            ety0 ety0Var2 = this.b;
            if (ety0Var2 == ety0Var) {
                ety0Var2.getClass();
            }
            z = false;
            yjy0Var.E0(z, yjy0Var.J0(this.a), yjy0Var.I0(this.b, this.B, this.A, this.z, this.y, this.c, this.x, this.E), yjy0Var.H0(this.w, this.C, null, this.F));
        }
        z = true;
        yjy0Var.E0(z, yjy0Var.J0(this.a), yjy0Var.I0(this.b, this.B, this.A, this.z, this.y, this.c, this.x, this.E), yjy0Var.H0(this.w, this.C, null, this.F));
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + tse0.b(this.b, this.a.hashCode() * 31, 31)) * 31;
        tls tlsVar = this.w;
        int e = (((unr0.e(oyr.b(this.x, (hashCode + (tlsVar != null ? tlsVar.hashCode() : 0)) * 31, 31), 31, this.y) + this.z) * 31) + this.A) * 31;
        List list = this.B;
        int hashCode2 = (e + (list != null ? list.hashCode() : 0)) * 31;
        tls tlsVar2 = this.C;
        int hashCode3 = (hashCode2 + (tlsVar2 != null ? tlsVar2.hashCode() : 0)) * 961;
        xfc xfcVar = this.D;
        int hashCode4 = (hashCode3 + (xfcVar != null ? xfcVar.hashCode() : 0)) * 31;
        tls tlsVar3 = this.F;
        return hashCode4 + (tlsVar3 != null ? tlsVar3.hashCode() : 0);
    }
}
