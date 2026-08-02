package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class y2m implements ryc {
    public final /* synthetic */ a3m a;
    public final /* synthetic */ int b;
    public final /* synthetic */ j1b c;
    public final /* synthetic */ lf5 d;

    public y2m(a3m a3mVar, int i, j1b j1bVar, lf5 lf5Var) {
        this.a = a3mVar;
        this.b = i;
        this.c = j1bVar;
        this.d = lf5Var;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        oxn oxnVar = (oxn) obj;
        ((Boolean) obj2).getClass();
        hq5 hq5Var = (hq5) obj3;
        int intValue = ((Number) obj4).intValue();
        oxnVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).f(oxnVar) ? 4 : 2;
        }
        if ((intValue & 131) == 130) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        String M = rvf.M(R.string.edit_playlist_move_to_top, hq5Var);
        oq5 oq5Var2 = (oq5) hq5Var;
        a3m a3mVar = this.a;
        boolean h = oq5Var2.h(a3mVar);
        int i = this.b;
        boolean d = h | oq5Var2.d(i);
        Object K = oq5Var2.K();
        kjn kjnVar = gq5.a;
        if (d || K == kjnVar) {
            K = new x2m(a3mVar, i, 0);
            oq5Var2.k0(K);
        }
        pfi pfiVar = new pfi(M, (Function0) K);
        String M2 = rvf.M(R.string.edit_playlist_move_to_bottom, oq5Var2);
        boolean h2 = oq5Var2.h(a3mVar) | oq5Var2.d(i);
        Object K2 = oq5Var2.K();
        if (h2 || K2 == kjnVar) {
            K2 = new x2m(a3mVar, i, 1);
            oq5Var2.k0(K2);
        }
        pfi pfiVar2 = new pfi(M2, (Function0) K2);
        String M3 = rvf.M(R.string.edit_playlist_move_up, oq5Var2);
        boolean h3 = oq5Var2.h(a3mVar) | oq5Var2.d(i);
        Object K3 = oq5Var2.K();
        if (h3 || K3 == kjnVar) {
            K3 = new x2m(a3mVar, i, 2);
            oq5Var2.k0(K3);
        }
        pfi pfiVar3 = new pfi(M3, (Function0) K3);
        String M4 = rvf.M(R.string.edit_playlist_move_down, oq5Var2);
        boolean h4 = oq5Var2.h(a3mVar) | oq5Var2.d(i);
        Object K4 = oq5Var2.K();
        if (h4 || K4 == kjnVar) {
            K4 = new x2m(a3mVar, i, 3);
            oq5Var2.k0(K4);
        }
        pfi pfiVar4 = new pfi(M4, (Function0) K4);
        String M5 = rvf.M(R.string.edit_playlist_remove, oq5Var2);
        boolean h5 = oq5Var2.h(a3mVar) | oq5Var2.d(i);
        Object K5 = oq5Var2.K();
        if (h5 || K5 == kjnVar) {
            K5 = new x2m(a3mVar, i, 4);
            oq5Var2.k0(K5);
        }
        gs4 gs4Var = new gs4(pfiVar, pfiVar2, pfiVar3, pfiVar4, new pfi(M5, (Function0) K5));
        a3m a3mVar2 = this.a;
        boolean h6 = oq5Var2.h(a3mVar2) | oq5Var2.d(i);
        Object K6 = oq5Var2.K();
        if (h6 || K6 == kjnVar) {
            K6 = new x2m(a3mVar, i, 5);
            oq5Var2.k0(K6);
        }
        y5g.i(oxnVar, this.c, this.d, a3mVar2, gs4Var, (Function0) K6, this.b, oq5Var2, (intValue & 14) | 64);
        return Unit.a;
    }
}
