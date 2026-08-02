package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes4.dex */
public final class dg4 extends m18 {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dg4(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // defpackage.ag5
    public final void b(mqs mqsVar) {
        int i = this.b;
        mqsVar.getClass();
        switch (i) {
            case 0:
                eg4 eg4Var = (eg4) this.d;
                iht ihtVar = (iht) eg4Var.i.getValue();
                if (ihtVar instanceof vgt) {
                    kkp kkpVar = eg4Var.b;
                    ((ljf) kkpVar.c).b(mqsVar, ((vgt) ihtVar).b, d.p((nrf) kkpVar.d));
                    break;
                }
                break;
            case 1:
                kea keaVar = ((tea) this.d).b;
                keaVar.getClass();
                zus zusVar = zus.b;
                b6v B0 = y5g.B0(mqsVar, cyt.a);
                ve veVar = new ve(muo.MY_DOWNLOADED, zqt.d);
                t tVar = keaVar.a;
                y supportFragmentManager = tVar.getSupportFragmentManager();
                supportFragmentManager.getClass();
                rre.Z(mqsVar, zusVar, B0, veVar, tVar, supportFragmentManager, keaVar.b, d.k(), null, null, null, 1792);
                break;
            case 2:
                efa efaVar = ((rfa) this.d).b;
                efaVar.getClass();
                zus zusVar2 = zus.b;
                b6v B02 = y5g.B0(mqsVar, cyt.a);
                ve veVar2 = new ve(muo.MY_DOWNLOADED, zqt.d);
                t tVar2 = efaVar.a;
                y supportFragmentManager2 = tVar2.getSupportFragmentManager();
                supportFragmentManager2.getClass();
                rre.Z(mqsVar, zusVar2, B02, veVar2, tVar2, supportFragmentManager2, efaVar.b, d.l(), null, null, null, 1792);
                break;
            case 3:
                mha mhaVar = ((xha) this.d).b;
                mhaVar.getClass();
                zus zusVar3 = zus.b;
                b6v B03 = y5g.B0(mqsVar, cyt.a);
                ve veVar3 = new ve(muo.MY_DOWNLOADED, zqt.d);
                t tVar3 = mhaVar.a;
                y supportFragmentManager3 = tVar3.getSupportFragmentManager();
                supportFragmentManager3.getClass();
                rre.Z(mqsVar, zusVar3, B03, veVar3, tVar3, supportFragmentManager3, mhaVar.b, d.m(), null, null, null, 1792);
                break;
            default:
                uy4 uy4Var = ((r5h) this.d).b;
                uy4Var.getClass();
                zus zusVar4 = zus.b;
                b6v B04 = y5g.B0(mqsVar, syt.a);
                ve veVar4 = new ve(muo.MY_KIDS, zqt.d);
                t tVar4 = uy4Var.a;
                y supportFragmentManager4 = tVar4.getSupportFragmentManager();
                supportFragmentManager4.getClass();
                rre.Z(mqsVar, zusVar4, B04, veVar4, tVar4, supportFragmentManager4, uy4Var.b, d.w(), null, null, null, 1792);
                break;
        }
    }

    @Override // defpackage.ag5
    public final void d(mqs mqsVar) {
        switch (this.b) {
            case 0:
                int i = this.c;
                mqsVar.getClass();
                eg4 eg4Var = (eg4) this.d;
                iht ihtVar = (iht) eg4Var.i.getValue();
                if (ihtVar instanceof vgt) {
                    if (!((Boolean) eg4Var.h.invoke()).booleanValue()) {
                        kkp kkpVar = eg4Var.b;
                        ((ljf) kkpVar.c).c(mqsVar, ((vgt) ihtVar).b, d.p((nrf) kkpVar.d), new ja4(kkpVar, null, 2), new v50(eg4Var, mqsVar, i, 5));
                        break;
                    } else {
                        eg4Var.g.invoke(mqsVar, new h00(eg4Var, mqsVar, (vgt) ihtVar, i, 5));
                        break;
                    }
                }
                break;
            case 1:
                int i2 = this.c;
                mqsVar.getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                boolean h = ((x35) ((byb) qdcVar.C(I)).c(ern.a(x35.class))).h();
                tea teaVar = (tea) this.d;
                if (!h) {
                    kea keaVar = teaVar.b;
                    o57 o57Var = new o57(1, teaVar.a, yea.class, "getAllChaptersSafely", "getAllChaptersSafely(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 6);
                    v50 v50Var = new v50(teaVar, mqsVar, i2, 6);
                    keaVar.getClass();
                    a0g.G(keaVar.a, mqsVar, new ye(keaVar, mqsVar, o57Var, v50Var, 13));
                    break;
                } else {
                    kea keaVar2 = teaVar.b;
                    de deVar = new de(teaVar, i2, mqsVar, 11);
                    keaVar2.getClass();
                    a0g.G(keaVar2.a, mqsVar, deVar);
                    break;
                }
            case 2:
                int i3 = this.c;
                mqsVar.getClass();
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                boolean h2 = ((x35) ((byb) qdcVar2.C(I2)).c(ern.a(x35.class))).h();
                rfa rfaVar = (rfa) this.d;
                if (!h2) {
                    efa efaVar = rfaVar.b;
                    o57 o57Var2 = new o57(1, rfaVar.a, ufa.class, "getAllTracksSafely", "getAllTracksSafely(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 7);
                    v50 v50Var2 = new v50(rfaVar, mqsVar, i3, 7);
                    efaVar.getClass();
                    a0g.G(efaVar.a, mqsVar, new ye(efaVar, mqsVar, o57Var2, v50Var2, 14));
                    break;
                } else {
                    efa efaVar2 = rfaVar.b;
                    de deVar2 = new de(rfaVar, i3, mqsVar, 12);
                    efaVar2.getClass();
                    a0g.G(efaVar2.a, mqsVar, deVar2);
                    break;
                }
            case 3:
                int i4 = this.c;
                mqsVar.getClass();
                l18 l18Var3 = l18.b;
                bdt I3 = hag.I(byb.class);
                qdc qdcVar3 = l18Var3.a;
                qdcVar3.getClass();
                boolean h3 = ((x35) ((byb) qdcVar3.C(I3)).c(ern.a(x35.class))).h();
                xha xhaVar = (xha) this.d;
                if (!h3) {
                    mha mhaVar = xhaVar.b;
                    o57 o57Var3 = new o57(1, xhaVar.a, zha.class, "getAllEpisodesSafely", "getAllEpisodesSafely(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 10);
                    v50 v50Var3 = new v50(xhaVar, mqsVar, i4, 8);
                    mhaVar.getClass();
                    a0g.G(mhaVar.a, mqsVar, new ye(mhaVar, mqsVar, o57Var3, v50Var3, 15));
                    break;
                } else {
                    mha mhaVar2 = xhaVar.b;
                    de deVar3 = new de(xhaVar, i4, mqsVar, 13);
                    mhaVar2.getClass();
                    a0g.G(mhaVar2.a, mqsVar, deVar3);
                    break;
                }
            default:
                int i5 = this.c;
                mqsVar.getClass();
                l18 l18Var4 = l18.b;
                bdt I4 = hag.I(byb.class);
                qdc qdcVar4 = l18Var4.a;
                qdcVar4.getClass();
                boolean h4 = ((x35) ((byb) qdcVar4.C(I4)).c(ern.a(x35.class))).h();
                r5h r5hVar = (r5h) this.d;
                if (!h4) {
                    uy4 uy4Var = r5hVar.b;
                    kef kefVar = new kef(1, r5hVar.a, t5h.class, "getAllTracksSafely", "getAllTracksSafely(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 11);
                    v50 v50Var4 = new v50(r5hVar, mqsVar, i5, 13);
                    uy4Var.getClass();
                    a0g.G(uy4Var.a, mqsVar, new ye(uy4Var, mqsVar, kefVar, v50Var4, 10));
                    break;
                } else {
                    uy4 uy4Var2 = r5hVar.b;
                    de deVar4 = new de(r5hVar, i5, mqsVar, 27);
                    uy4Var2.getClass();
                    a0g.G(uy4Var2.a, mqsVar, deVar4);
                    break;
                }
        }
    }
}
