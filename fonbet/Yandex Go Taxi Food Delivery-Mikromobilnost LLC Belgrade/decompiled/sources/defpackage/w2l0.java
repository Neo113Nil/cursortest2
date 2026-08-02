package defpackage;

import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class w2l0 {
    public static final w2l0 e;
    public final i0l0 a;
    public final vxq0 b;
    public final f2z0 c;
    public final boolean d;

    static {
        long j = zp2.d;
        e = new w2l0(new i0l0(q2h0.ic_aeroexpress_16, j, j), new vxq0(new txq0()), new f2z0(), false);
    }

    public w2l0(i0l0 i0l0Var, vxq0 vxq0Var, f2z0 f2z0Var, boolean z) {
        this.a = i0l0Var;
        this.b = vxq0Var;
        this.c = f2z0Var;
        this.d = z;
    }

    public static w2l0 a(w2l0 w2l0Var, boolean z) {
        i0l0 i0l0Var = w2l0Var.a;
        w2l0Var.getClass();
        w2l0Var.getClass();
        vxq0 vxq0Var = w2l0Var.b;
        w2l0Var.getClass();
        w2l0Var.getClass();
        w2l0Var.getClass();
        w2l0Var.getClass();
        w2l0Var.getClass();
        w2l0Var.getClass();
        w2l0Var.getClass();
        w2l0Var.getClass();
        f2z0 f2z0Var = w2l0Var.c;
        w2l0Var.getClass();
        w2l0Var.getClass();
        w2l0Var.getClass();
        w2l0Var.getClass();
        return new w2l0(i0l0Var, vxq0Var, f2z0Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2l0)) {
            return false;
        }
        w2l0 w2l0Var = (w2l0) obj;
        if (!this.a.equals(w2l0Var.a) || !this.b.equals(w2l0Var.b)) {
            return false;
        }
        EmptyList emptyList = EmptyList.a;
        return emptyList.equals(emptyList) && this.c.equals(w2l0Var.c) && this.d == w2l0Var.d;
    }

    public final int hashCode() {
        return unr0.e(unr0.e(unr0.e(((((this.a.hashCode() * 29791) + 962) * (-1807454463)) + 1) * 961, 31, false), 31, this.d), 31, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteDetailsUiState(badge=");
        sb.append(this.a);
        sb.append(", routeTitle=, routeSubtitle=, servicesSection=");
        sb.append(this.b);
        sb.append(", routeSectionTitle=, routeSectionDescription=, departureTime=, departureStation=, arrivalTime=, arrivalStation=, totalStops=, stops=");
        sb.append(EmptyList.a);
        sb.append(", ticketInfo=");
        sb.append(this.c);
        sb.append(", isLoading=false, isDescriptionExpanded=");
        return x4e.i(sb, this.d, ", areAllServiceIconsLoaded=true, errorContentState=null)");
    }
}
