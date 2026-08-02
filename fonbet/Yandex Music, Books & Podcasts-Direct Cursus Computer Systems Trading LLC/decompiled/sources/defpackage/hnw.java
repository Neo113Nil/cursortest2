package defpackage;

import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.e0;

/* loaded from: classes4.dex */
public final class hnw {
    public static final String h = f1d.g("YnisonShared:", "PlayingStatusProvider");
    public final zzp a;
    public final gsw b;
    public final qrw c;
    public final ykw d;
    public final hcw e;
    public final mlw f;
    public final xdr g = ydr.a(null);

    public hnw(zzp zzpVar, gsw gswVar, qrw qrwVar, ykw ykwVar, ndw ndwVar, hcw hcwVar, mlw mlwVar, rgw rgwVar) {
        this.a = zzpVar;
        this.b = gswVar;
        this.c = qrwVar;
        this.d = ykwVar;
        this.e = hcwVar;
        this.f = mlwVar;
    }

    public static final v81 a(hnw hnwVar, sqw sqwVar) {
        int i;
        tc4 u0;
        hcw hcwVar = hnwVar.e;
        ldw ldwVar = hcwVar.c;
        xdr xdrVar = ldwVar.h;
        amw amwVar = ldwVar.a;
        sqwVar.getClass();
        int i2 = 25;
        int i3 = 7;
        int i4 = 18;
        if (sqwVar instanceof rqw) {
            rqw rqwVar = (rqw) sqwVar;
            e0 e0Var = rqwVar.a;
            c0 k = e0Var.n().k();
            k.getClass();
            boolean z = !k.m();
            String id = rqwVar.c().getId();
            id.getClass();
            mcw mcwVar = new mcw(ldw.c(xdrVar, "playing_status", Boolean.valueOf(z), id), id, 1);
            e7v e7vVar = new e7v(zsd.b0(new e7v(amwVar.a.c.i, 19)), 18);
            e7v e7vVar2 = new e7v(zsd.b0(new e7v(amwVar.a.c.i, 17)), 16);
            c0 k2 = e0Var.n().k();
            k2.getClass();
            u0 = zsd.u0(mcwVar, e7vVar2, e7vVar, new f9l(i2, new l8v(zsd.b0(new e7v(amwVar.a.c.i, 20)), new h4q((float) k2.n()), i3)));
            i = 25;
        } else {
            if (!(sqwVar instanceof pqw)) {
                b6e.s();
                return null;
            }
            pqw pqwVar = (pqw) sqwVar;
            String id2 = pqwVar.b.k().getId().getId();
            zzp zzpVar = hcwVar.a;
            boolean z2 = pqwVar.c(zzpVar).a;
            id2.getClass();
            mcw mcwVar2 = new mcw(ldw.c(xdrVar, "playing_status", Boolean.valueOf(z2), id2), id2, 1);
            e7v e7vVar3 = new e7v(zsd.b0(new e7v(amwVar.a.c.i, 19)), 18);
            e7v e7vVar4 = new e7v(zsd.b0(new e7v(amwVar.a.c.i, 17)), 16);
            l8v l8vVar = new l8v(zsd.b0(new e7v(amwVar.a.c.i, 20)), pqwVar.c(zzpVar).d, i3);
            i = 25;
            u0 = zsd.u0(mcwVar2, e7vVar4, e7vVar3, new f9l(i, l8vVar));
        }
        return new v81(new ub7(12, new u21(i, new l8v(u0, hnwVar, i4), hnwVar, sqwVar), new d4t(2, 7, null)), 10);
    }
}
