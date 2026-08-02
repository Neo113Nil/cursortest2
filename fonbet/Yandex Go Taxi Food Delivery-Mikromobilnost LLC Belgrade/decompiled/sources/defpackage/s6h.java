package defpackage;

/* loaded from: classes8.dex */
public final class s6h implements fw90 {
    @Override // defpackage.fw90
    public final bw90 b(u0k u0kVar) {
        xw91 xw91Var = xw91.C;
        if (u0kVar instanceof fl8) {
            return ((fl8) u0kVar).h ? l76.J : xw91Var;
        }
        if (u0kVar instanceof snr0) {
            return ((snr0) u0kVar).i() ? xw91Var : new zv90(0);
        }
        if (u0kVar instanceof yhi) {
            whi a = ((yhi) u0kVar).f().a();
            String a2 = a != null ? a.a() : null;
            return (a2 == null || a2.length() == 0) ? xw91Var : new zv90(a2);
        }
        if (u0kVar instanceof d111) {
            return r6h.a[((d111) u0kVar).i().ordinal()] == 1 ? new zv90("") : xw91Var;
        }
        return xw91Var;
    }
}
