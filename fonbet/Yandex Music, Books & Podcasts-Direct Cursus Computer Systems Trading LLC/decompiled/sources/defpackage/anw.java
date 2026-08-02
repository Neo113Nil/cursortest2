package defpackage;

import com.yandex.media.ynison.service.f;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class anw {
    public static final String l = f1d.g("YnisonShared:", "PlayerStateProvider");
    public final zzp a;
    public final gsw b;
    public final qsw c;
    public final qrw d;
    public final ykw e;
    public final kmw f;
    public final mlw g;
    public final hcw h;
    public final phw i;
    public final zfw j;
    public final xdr k = ydr.a(null);

    public anw(zzp zzpVar, gsw gswVar, qsw qswVar, qrw qrwVar, ykw ykwVar, kmw kmwVar, mlw mlwVar, hcw hcwVar, phw phwVar, zfw zfwVar) {
        this.a = zzpVar;
        this.b = gswVar;
        this.c = qswVar;
        this.d = qrwVar;
        this.e = ykwVar;
        this.f = kmwVar;
        this.g = mlwVar;
        this.h = hcwVar;
        this.i = phwVar;
        this.j = zfwVar;
    }

    public static final v81 a(anw anwVar, sqw sqwVar) {
        int i;
        Continuation continuation;
        clc clcVar;
        hcw hcwVar = anwVar.h;
        ldw ldwVar = hcwVar.c;
        ub7 ub7Var = hcwVar.b.b;
        sqwVar.getClass();
        boolean z = sqwVar instanceof rqw;
        int i2 = 3;
        int i3 = 2;
        pjc pjcVar = z4b.a;
        Continuation continuation2 = null;
        if (z) {
            rqw rqwVar = (rqw) sqwVar;
            String id = rqwVar.c().getId();
            String v = bfg.v(rqwVar.c());
            f s = uwf.s(rqwVar.d());
            String t = s != null ? s.t() : null;
            int r = rqwVar.d().r();
            id.getClass();
            i = 4;
            qm c = ldw.c(ldwVar.e, "player_state", new icw(t, r, v), id);
            ub7 d = ldwVar.d(rqwVar.d().z(), rqwVar.c().getId());
            String id2 = rqwVar.c().getId();
            id2.getClass();
            qm c2 = ldw.c(ldwVar.f, "player_state", null, id2);
            aaq c3 = rqwVar.c();
            if ((c3 instanceof z9q) || (c3 instanceof hbq)) {
                String id3 = rqwVar.c().getId();
                mse j = rqwVar.d().D().j();
                id3.getClass();
                mcw mcwVar = new mcw(ldw.c(ldwVar.i, "player_state", j, id3), id3, i2);
                String id4 = rqwVar.c().getId();
                nyn O = rvf.O(rqwVar.d().y().h());
                id4.getClass();
                pjcVar = zsd.u0(mcwVar, new mcw(ldw.c(ldwVar.j, "player_state", O, id4), id4, i3));
            } else if (!(c3 instanceof uaq) && !(c3 instanceof caq) && !(c3 instanceof paq)) {
                b6e.s();
                return null;
            }
            clcVar = new clc(zsd.u0(c, d, c2, pjcVar, new e7v(ub7Var, 15)), new y6v(hcwVar, rqwVar, continuation2, 26));
            continuation = null;
        } else {
            i = 4;
            if (!(sqwVar instanceof pqw)) {
                b6e.s();
                return null;
            }
            pqw pqwVar = (pqw) sqwVar;
            maq maqVar = pqwVar.b;
            String id5 = maqVar.k().getId().getId();
            String v2 = bfg.v(maqVar.k().getId());
            String e = itk.e(maqVar.b());
            int K = euk.K(maqVar);
            id5.getClass();
            qm c4 = ldw.c(ldwVar.e, "player_state", new icw(e, K, v2), id5);
            ub7 d2 = ldwVar.d(maqVar.j().size(), maqVar.k().getId().getId());
            String id6 = maqVar.k().getId().getId();
            id6.getClass();
            qm c5 = ldw.c(ldwVar.f, "player_state", null, id6);
            if (maqVar instanceof jbq) {
                jbq jbqVar = (jbq) maqVar;
                bbq bbqVar = jbqVar.b;
                String id7 = bbqVar.getId().getId();
                List r2 = jbqVar.r();
                id7.getClass();
                mcw mcwVar2 = new mcw(ldw.c(ldwVar.i, "player_state", r2, id7), id7, i2);
                String id8 = bbqVar.getId().getId();
                nyn nynVar = jbqVar.e;
                id8.getClass();
                pjcVar = zsd.u0(mcwVar2, new mcw(ldw.c(ldwVar.j, "player_state", nynVar, id8), id8, i3));
            } else if (!(maqVar instanceof eaq) && !(maqVar instanceof vaq) && !(maqVar instanceof raq)) {
                b6e.s();
                return null;
            }
            pjc[] pjcVarArr = {c4, d2, pjcVar, c5, new e7v(ub7Var, 14)};
            continuation = null;
            clcVar = new clc(zsd.u0(pjcVarArr), new y6v(hcwVar, pqwVar, continuation, 25));
        }
        return new v81(new ub7(12, new l8v(zsd.s0(clcVar, new k5u(i3, i, continuation)), anwVar, 16), new d4t(i3, 5, continuation)), 8);
    }
}
