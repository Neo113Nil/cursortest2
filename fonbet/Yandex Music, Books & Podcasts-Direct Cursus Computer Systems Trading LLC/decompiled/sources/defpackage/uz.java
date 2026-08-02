package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.catalog.album.screen.AlbumScreenActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class uz implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xz b;

    public /* synthetic */ uz(xz xzVar, int i) {
        this.a = i;
        this.b = xzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                xz xzVar = this.b;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-1347093801, new uz(xzVar, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                xz xzVar2 = this.b;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (K == kjnVar) {
                        K = gld.R(g.a, oq5Var2);
                        oq5Var2.k0(K);
                    }
                    mm6 mm6Var = (mm6) K;
                    Object K2 = oq5Var2.K();
                    if (K2 == kjnVar) {
                        cvo j = xzVar2.getJ();
                        e10 e10Var = (e10) xzVar2.m.getValue();
                        dy dyVar = (dy) xzVar2.o.getValue();
                        hy A = xzVar2.A();
                        kxi d = xzVar2.d();
                        f00 f00Var = (f00) xzVar2.n.getValue();
                        tmb tmbVar = (tmb) ((vy) xzVar2.l.getValue()).b.getValue();
                        l18 l18Var = l18.b;
                        bdt I = hag.I(oz.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        bdt I2 = hag.I(g0l.class);
                        qdc qdcVar2 = l18Var.a;
                        qdcVar2.getClass();
                        g0l g0lVar = (g0l) qdcVar2.C(I2);
                        bdt I3 = hag.I(oz.class);
                        qdc qdcVar3 = l18Var.a;
                        qdcVar3.getClass();
                        t requireActivity = xzVar2.requireActivity();
                        requireActivity.getClass();
                        y supportFragmentManager = ((AlbumScreenActivity) requireActivity).getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        supportFragmentManager.getClass();
                        pt0 pt0Var = new pt0();
                        pt0Var.a = requireActivity;
                        pt0Var.b = supportFragmentManager;
                        fz fzVar = new fz(j, e10Var, dyVar, d, A, mm6Var, f00Var, tmbVar, g0lVar, pt0Var, xzVar2.j);
                        oq5Var2.k0(fzVar);
                        K2 = fzVar;
                    }
                    i4w.a((fz) K2, xzVar2.x(), oq5Var2, 64);
                    rzf.j(((e10) xzVar2.m.getValue()).D0, null, oq5Var2, 0, 2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
