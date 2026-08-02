package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vmg {
    public final xtz0 a;
    public final jmg b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final boolean g;
    public final kao h;
    public final lzz0 i;
    public final boolean j;
    public final yon k;
    public final boolean l;

    public vmg(xtz0 xtz0Var, jmg jmgVar, boolean z, boolean z2, boolean z3, List list, boolean z4, kao kaoVar, lzz0 lzz0Var, boolean z5, yon yonVar, boolean z6) {
        this.a = xtz0Var;
        this.b = jmgVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = list;
        this.g = z4;
        this.h = kaoVar;
        this.i = lzz0Var;
        this.j = z5;
        this.k = yonVar;
        this.l = z6;
    }

    public final yon a() {
        return this.k;
    }

    public final kao b() {
        return this.h;
    }

    public final List c() {
        return this.f;
    }

    public final jmg d() {
        return this.b;
    }

    public final xtz0 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmg)) {
            return false;
        }
        vmg vmgVar = (vmg) obj;
        return this.a.equals(vmgVar.a) && this.b.equals(vmgVar.b) && this.c == vmgVar.c && this.d == vmgVar.d && this.e == vmgVar.e && jl40.l(this.f, vmgVar.f) && this.g == vmgVar.g && jl40.l(this.h, vmgVar.h) && jl40.l(this.i, vmgVar.i) && this.j == vmgVar.j && jl40.l(this.k, vmgVar.k) && this.l == vmgVar.l;
    }

    public final lzz0 f() {
        return this.i;
    }

    public final boolean g() {
        return this.e;
    }

    public final boolean h() {
        return this.j;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.c(unr0.e(unr0.e(unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        kao kaoVar = this.h;
        int hashCode = (e + (kaoVar == null ? 0 : kaoVar.hashCode())) * 31;
        lzz0 lzz0Var = this.i;
        int e2 = unr0.e((hashCode + (lzz0Var == null ? 0 : lzz0Var.a.hashCode())) * 31, 31, this.j);
        yon yonVar = this.k;
        return Boolean.hashCode(this.l) + ((e2 + (yonVar != null ? yonVar.hashCode() : 0)) * 31);
    }

    public final boolean i() {
        return this.l;
    }

    public final boolean j() {
        return this.c;
    }

    public final boolean k() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DashboardV3ViewState(toolbarState=");
        sb.append(this.a);
        sb.append(", nfcType=");
        sb.append(this.b);
        sb.append(", isPullToRefreshVisible=");
        nnm.v(", isWidgetListClickable=", ", isDataContentState=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", listItems=");
        sb.append(this.f);
        sb.append(", widgetsError=");
        sb.append(this.g);
        sb.append(", errorState=");
        sb.append(this.h);
        sb.append(", traceIdViewState=");
        sb.append(this.i);
        sb.append(", isPartialLoadingEnabled=");
        sb.append(this.j);
        sb.append(", educationV2State=");
        sb.append(this.k);
        sb.append(", isPullToRefreshEnabled=");
        sb.append(this.l);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
