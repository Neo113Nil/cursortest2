package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class btu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ftu b;

    public /* synthetic */ btu(ftu ftuVar, int i) {
        this.a = i;
        this.b = ftuVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        switch (this.a) {
            case 0:
                ftu ftuVar = this.b;
                ftuVar.B().getClass();
                return new c0v(ftuVar);
            case 1:
                d1v d1vVar = this.b.n;
                y3v y3vVar = (y3v) d1vVar.a.getValue();
                yks yksVar = ((f3v) d1vVar.d.getValue()).a;
                oq7 oq7Var = (oq7) yksVar.c;
                h3v h3vVar = (h3v) ((jyr) yksVar.d).getValue();
                tf6 tf6Var = (tf6) yksVar.b;
                h3vVar.getClass();
                rjp rjpVar = new rjp();
                rjpVar.a = h3vVar;
                rjpVar.b = zsd.F0(new y4s(zsd.b0(new mpq(29, oq7Var.a.c, rjpVar)), 24), tf6Var, lbq.a, null);
                return new d4v(y3vVar, rjpVar);
            case 2:
                ftu ftuVar2 = this.b;
                akf akfVar = (akf) ftuVar2.k.getValue();
                jfu viewModelStore = ftuVar2.requireActivity().getViewModelStore();
                akfVar.getClass();
                viewModelStore.getClass();
                bjt bjtVar = new bjt(viewModelStore);
                qyf F = wyf.F(ftuVar2.getLifecycle());
                l18 l18Var = l18.b;
                bdt I = hag.I(oq7.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                oq7 oq7Var2 = (oq7) qdcVar.C(I);
                bdt I2 = hag.I(xy1.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                return new l0v(F, bjtVar, oq7Var2, (xy1) qdcVar2.C(I2));
            case 3:
                ftu ftuVar3 = this.b;
                SharedPreferences.Editor edit = ((pst) ((i1v) ftuVar3.s.getValue()).c.getValue()).edit();
                edit.putBoolean("wave_screen_wizard_skipped", true);
                edit.apply();
                ftuVar3.y = false;
                return Unit.a;
            case 4:
                return new ekf(this.b.g.m());
            case 5:
                ftu ftuVar4 = this.b;
                qyf F2 = wyf.F(ftuVar4.getLifecycle());
                g9m g9mVar = (g9m) ftuVar4.z.getValue();
                c1v c1vVar = (c1v) ftuVar4.B().b.getValue();
                d4v d4vVar = (d4v) ftuVar4.A.getValue();
                i4v i4vVar = (i4v) ftuVar4.B().a().b.getValue();
                e4v e4vVar = (e4v) ftuVar4.B().a().c.getValue();
                q1v q1vVar = (q1v) ftuVar4.p.getValue();
                kxi d = ftuVar4.d();
                Context requireContext = ftuVar4.requireContext();
                requireContext.getClass();
                eii eiiVar = (eii) ftuVar4.r.getValue();
                l18 l18Var2 = l18.b;
                bdt I3 = hag.I(byb.class);
                qdc qdcVar3 = l18Var2.a;
                qdcVar3.getClass();
                boolean h = ((ghv) ((byb) qdcVar3.C(I3)).c(ern.a(ghv.class))).h();
                ftuVar4.B().getClass();
                jyr jyrVar = t5j.e;
                if (wyf.M()) {
                    bdt I4 = hag.I(byb.class);
                    qdc qdcVar4 = l18Var2.a;
                    qdcVar4.getClass();
                    if (((o5v) ((byb) qdcVar4.C(I4)).c(ern.a(o5v.class))).h()) {
                        z = true;
                        bdt I5 = hag.I(byb.class);
                        qdc qdcVar5 = l18Var2.a;
                        qdcVar5.getClass();
                        boolean h2 = ((psu) ((byb) qdcVar5.C(I5)).c(ern.a(psu.class))).h();
                        bdt I6 = hag.I(byb.class);
                        qdc qdcVar6 = l18Var2.a;
                        qdcVar6.getClass();
                        boolean h3 = ((vou) ((byb) qdcVar6.C(I6)).c(ern.a(vou.class))).h();
                        bdt I7 = hag.I(byb.class);
                        qdc qdcVar7 = l18Var2.a;
                        qdcVar7.getClass();
                        boolean h4 = ((b0v) ((byb) qdcVar7.C(I7)).c(ern.a(b0v.class))).h();
                        bdt I8 = hag.I(byb.class);
                        qdc qdcVar8 = l18Var2.a;
                        qdcVar8.getClass();
                        boolean h5 = ((l1v) ((byb) qdcVar8.C(I8)).c(ern.a(l1v.class))).h();
                        s3v s3vVar = (s3v) ftuVar4.B().a().e.getValue();
                        bdt I9 = hag.I(g0l.class);
                        qdc qdcVar9 = l18Var2.a;
                        qdcVar9.getClass();
                        g0l g0lVar = (g0l) qdcVar9.C(I9);
                        boolean d2 = ((e4v) ftuVar4.B().a().c.getValue()).a.d();
                        r3s r3sVar = new r3s(28, ftuVar4);
                        c1vVar.getClass();
                        i4vVar.getClass();
                        e4vVar.getClass();
                        s3vVar.getClass();
                        eiiVar.getClass();
                        q1vVar.getClass();
                        return new ltu(F2, g9mVar, c1vVar, new z6n(eiiVar.b), i4vVar, e4vVar, s3vVar, d4vVar, r3sVar, h, z, h2, h3, h4, h5, q1vVar, d, requireContext, g0lVar, d2);
                    }
                }
                z = false;
                bdt I52 = hag.I(byb.class);
                qdc qdcVar52 = l18Var2.a;
                qdcVar52.getClass();
                boolean h22 = ((psu) ((byb) qdcVar52.C(I52)).c(ern.a(psu.class))).h();
                bdt I62 = hag.I(byb.class);
                qdc qdcVar62 = l18Var2.a;
                qdcVar62.getClass();
                boolean h32 = ((vou) ((byb) qdcVar62.C(I62)).c(ern.a(vou.class))).h();
                bdt I72 = hag.I(byb.class);
                qdc qdcVar72 = l18Var2.a;
                qdcVar72.getClass();
                boolean h42 = ((b0v) ((byb) qdcVar72.C(I72)).c(ern.a(b0v.class))).h();
                bdt I82 = hag.I(byb.class);
                qdc qdcVar82 = l18Var2.a;
                qdcVar82.getClass();
                boolean h52 = ((l1v) ((byb) qdcVar82.C(I82)).c(ern.a(l1v.class))).h();
                s3v s3vVar2 = (s3v) ftuVar4.B().a().e.getValue();
                bdt I92 = hag.I(g0l.class);
                qdc qdcVar92 = l18Var2.a;
                qdcVar92.getClass();
                g0l g0lVar2 = (g0l) qdcVar92.C(I92);
                boolean d22 = ((e4v) ftuVar4.B().a().c.getValue()).a.d();
                r3s r3sVar2 = new r3s(28, ftuVar4);
                c1vVar.getClass();
                i4vVar.getClass();
                e4vVar.getClass();
                s3vVar2.getClass();
                eiiVar.getClass();
                q1vVar.getClass();
                return new ltu(F2, g9mVar, c1vVar, new z6n(eiiVar.b), i4vVar, e4vVar, s3vVar2, d4vVar, r3sVar2, h, z, h22, h32, h42, h52, q1vVar, d, requireContext, g0lVar2, d22);
            case 6:
                ftu ftuVar5 = this.b;
                j1v B = ftuVar5.B();
                t requireActivity = ftuVar5.requireActivity();
                requireActivity.getClass();
                y supportFragmentManager = ftuVar5.requireActivity().getSupportFragmentManager();
                supportFragmentManager.getClass();
                B.getClass();
                return new q1v(requireActivity, supportFragmentManager, B.a());
            case 7:
                ftu ftuVar6 = this.b;
                ro2 ro2Var = (ro2) ftuVar6.q.getValue();
                jfu viewModelStore2 = ftuVar6.getViewModelStore();
                viewModelStore2.getClass();
                l13 l13Var = ((kn2) ro2Var.a.b).a;
                return new eii(viewModelStore2, (no2) ((yn2) l13Var.a.D(hag.I(yn2.class), l13Var, l13Var.b)).a.getValue());
            case 8:
                return (i1v) ((akf) this.b.k.getValue()).a.getValue();
            case 9:
                ftu ftuVar7 = this.b;
                kuv kuvVar = (kuv) ftuVar7.v.getValue();
                t requireActivity2 = ftuVar7.requireActivity();
                requireActivity2.getClass();
                zh zhVar = ftuVar7.t;
                kuvVar.getClass();
                zhVar.getClass();
                return new muv(requireActivity2, zhVar);
            case 10:
                ftu ftuVar8 = this.b;
                return new ovv(ftuVar8.x().a(new jab(qkb.Wizard, 1, 1, 0), null), ((mvv) ftuVar8.u.getValue()).a);
            default:
                return new g9m((y8m) this.b.l.getValue());
        }
    }
}
