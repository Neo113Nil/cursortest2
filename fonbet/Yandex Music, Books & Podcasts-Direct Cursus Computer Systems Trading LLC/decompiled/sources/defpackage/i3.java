package defpackage;

import android.content.res.Configuration;
import androidx.fragment.app.y;
import com.yandex.plus.home.dailyquests.plugin.internal.proxy.b;
import com.yandex.plus.home.dailyquests.plugin.internal.proxy.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class i3 implements knq {
    public final /* synthetic */ int a = 5;
    public final Object b;
    public final Object c;
    public final Object d;

    public i3(jnq jnqVar) {
        jnqVar.getClass();
        this.b = jnqVar;
        this.c = l18.b.b(hag.I(h8n.class), true);
        this.d = btf.b(new b6n(2, this));
    }

    @Override // defpackage.knq
    public final rrf a(rnq rnqVar, qnq qnqVar) {
        switch (this.a) {
            case 0:
                w3 w3Var = (w3) rnqVar;
                qnqVar.getClass();
                ((f3) this.b).getClass();
                ozw ozwVar = new ozw(2, qnqVar);
                vjg vjgVar = w3Var.d;
                g3 g3Var = new g3(0, w3Var, ozwVar, qnqVar);
                wn5 wn5Var = new wn5(new h3(0, this), 1692576992, true);
                vjgVar.getClass();
                nrf nrfVar = vjgVar.a;
                return new g73(nrfVar.a, nrfVar.b, new wn5(new sh1(9, g3Var, wn5Var, vjgVar), -11866607, true), (cma) null, 24);
            case 1:
                ge geVar = (ge) rnqVar;
                qnqVar.getClass();
                nrf nrfVar2 = geVar.c.c;
                ssg.a(3, "Skeleton:ActionBar", hrg.r("createBlockUi: type=", nrfVar2.b, " id=", nrfVar2.a), null);
                return new g73(nrfVar2.a, nrfVar2.b, new wn5(new x3(1, this, geVar, qnqVar), 813371994, true), new cma(28), new s2(28));
            case 2:
                z31 z31Var = (z31) rnqVar;
                qnqVar.getClass();
                nrf nrfVar3 = z31Var.g.a;
                ssg.a(3, "Skeleton:ArtistConcertsBlock", hrg.r("createBlockUi: type=", nrfVar3.b, " id=", nrfVar3.a), null);
                ((p31) this.b).getClass();
                return new g73(nrfVar3, new wn5(new wl(this, z31Var, new bnd(qnqVar, 4), qnqVar.b, 9), -427912906, true));
            case 3:
                bl1 bl1Var = (bl1) rnqVar;
                qnqVar.getClass();
                nrf nrfVar4 = bl1Var.g.a;
                ssg.a(3, "Skeleton:ArtistTracksBlock", hrg.r("createBlockUi: type=", nrfVar4.b, " id=", nrfVar4.a), null);
                ((pk1) this.b).getClass();
                return new g73(nrfVar4, new wn5(new wl(this, bl1Var, new rk1(qnqVar.b, 0), qnqVar, 16), -89723913, true));
            case 4:
                b22 b22Var = (b22) rnqVar;
                qnqVar.getClass();
                nrf nrfVar5 = b22Var.d.a;
                ssg.a(3, "Collection:Skeleton:COLLECTION_AUTO_CACHE_ONBOARDING", hrg.r("createBlockUi: type=", nrfVar5.b, " id=", nrfVar5.a), null);
                hn5 hn5Var = qnqVar.b;
                hn5Var.getClass();
                Configuration configuration = hn5Var.getResources().getConfiguration();
                configuration.getClass();
                boolean J = asq.J(configuration);
                xdr xdrVar = b22Var.h;
                Boolean valueOf = Boolean.valueOf(J);
                xdrVar.getClass();
                xdrVar.m(null, valueOf);
                g73 g73Var = new g73(nrfVar5.a, nrfVar5.b, new wn5(new sh1(6, new rk1(hn5Var, 1), b22Var, this), -1878020059, true), (cma) null, 24);
                fkn fknVar = b22Var.j;
                fknVar.getClass();
                return new cyd(g73Var, fknVar);
            case 5:
                l14 l14Var = (l14) rnqVar;
                qnqVar.getClass();
                r04 r04Var = l14Var.i;
                ssg.a(3, "Skeleton:CarouselBlock", hrg.r("createBlockUi: type=", r04Var.a().b, " id=", r04Var.a().a), null);
                kxi kxiVar = qnqVar.d;
                tmb tmbVar = new tmb(12, kxiVar.a, l14Var.f.b.b);
                s63 s63Var = l14Var.e;
                q5g.x(tmbVar, s63Var);
                return (rrf) ((q2) this.d).invoke(r04Var, new g14(l14Var, kxiVar, ((a14) this.b).a(qnqVar, s63Var)));
            case 6:
                jg4 jg4Var = (jg4) rnqVar;
                qnqVar.getClass();
                ag4 ag4Var = jg4Var.g;
                nrf nrfVar6 = ag4Var.a;
                s63 s63Var2 = jg4Var.d;
                hn5 hn5Var2 = qnqVar.b;
                kkp kkpVar = new kkp(hn5Var2, new ljf(hn5Var2, qnqVar.a, qnqVar.d), s63Var2);
                pg4 pg4Var = pg4.c;
                String scheme = ((qg4) new b30(pg4Var).a(pg4Var.b, true)).m().getScheme();
                if (scheme == null) {
                    su4.s(2, null, "deeplink for chart must be not null", null);
                }
                if (scheme == null) {
                    scheme = "";
                }
                l18 l18Var = l18.b;
                bdt I = hag.I(g0l.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                eg4 eg4Var = new eg4(jg4Var, kkpVar, scheme, (g0l) qdcVar.C(I), qnqVar.d, q5g.x((tmb) this.d, s63Var2), new q2(27, this), new uf3(23, this));
                ssg.a(3, "Skeleton:ChartTracksBlock", hrg.r("createBlockUi: type=", nrfVar6.b, " id=", nrfVar6.a), null);
                return rzf.Q(new g73(nrfVar6.a, nrfVar6.b, new wn5(new q2(26, eg4Var), 782367915, true), (cma) null, 24), ag4Var.c, ag4Var.d, new ub4(0, eg4Var, eg4.class, "onOpenChartClick", "onOpenChartClick()V", 0, 5), null, null, 56);
            case 7:
                m36 m36Var = (m36) rnqVar;
                u26 u26Var = (u26) this.b;
                qnqVar.getClass();
                t26 t26Var = m36Var.e;
                nrf nrfVar7 = t26Var.a;
                o43 o43Var = t26Var.e;
                String a = o43Var != null ? o43Var.a() : null;
                t36 c = u26Var.c(qnqVar.b);
                dqj Q = rzf.Q(new g73(nrfVar7.a, nrfVar7.b, new wn5(new av5(m36Var, c, this, u26Var.a(), 4), 1249342398, true), (cma) null, 24), t26Var.d, null, new aw5(5, a, c), szf.g0(Boolean.valueOf(a != null)), null, 50);
                xdr xdrVar2 = m36Var.d.c;
                xdrVar2.getClass();
                return new cyd(Q, xdrVar2);
            case 8:
                f2b f2bVar = (f2b) rnqVar;
                qnqVar.getClass();
                c2b c2bVar = f2bVar.g;
                nrf nrfVar8 = c2bVar.a;
                ssg.a(3, "Skeleton:EditorialWavesBlock", hrg.r("createBlockUi: type=", nrfVar8.b, " id=", nrfVar8.a), null);
                return (rrf) ((rea) this.d).invoke(c2bVar, new d2b(f2bVar, qnqVar.d));
            case 9:
                w4j w4jVar = (w4j) rnqVar;
                qnqVar.getClass();
                m4j m4jVar = w4jVar.j;
                nrf nrfVar9 = m4jVar.a;
                ssg.a(3, "Skeleton:NewReleasesBlock", hrg.r("createBlockUi: type=", nrfVar9.b, " id=", nrfVar9.a), null);
                s63 s63Var3 = w4jVar.e;
                s63Var3.getClass();
                cr crVar = new cr(qnqVar.b, qnqVar.a, qnqVar.d, qnqVar.c, s63Var3);
                d6h d6hVar = (d6h) this.d;
                qyf qyfVar = qnqVar.c;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(g0l.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return (rrf) d6hVar.invoke(m4jVar, new k5j(w4jVar, crVar, qyfVar, (g0l) qdcVar2.C(I2), qnqVar.d, q5g.x((tmb) this.c, s63Var3), new s8i(this, qnqVar, 4), new u5i(this, 21)));
            case 10:
                wsj wsjVar = (wsj) rnqVar;
                qnqVar.getClass();
                nrf nrfVar10 = wsjVar.j.a;
                ssg.a(3, "Skeleton:OpenPlaylistBlock", hrg.r("createBlockUi: type=", nrfVar10.b, " id=", nrfVar10.a), null);
                hn5 hn5Var3 = qnqVar.b;
                y yVar = qnqVar.a;
                s63 s63Var4 = wsjVar.e;
                kxi kxiVar2 = qnqVar.d;
                hn5Var3.getClass();
                yVar.getClass();
                s63Var4.getClass();
                kxiVar2.getClass();
                g73 g73Var2 = new g73(nrfVar10, new wn5(new av5(this, wsjVar, new ysj(hn5Var3, new ljf(hn5Var3, yVar, kxiVar2), yVar, s63Var4), qnqVar, 27), 205561744, true));
                xdr xdrVar3 = wsjVar.d.c;
                xdrVar3.getClass();
                return new cyd(g73Var2, xdrVar3);
            case 11:
                g8n g8nVar = (g8n) rnqVar;
                qnqVar.getClass();
                b8n b8nVar = g8nVar.d;
                nrf nrfVar11 = b8nVar.a;
                ssg.a(3, "Skeleton:QuestsBlock", hrg.r("createBlockUi: type=", nrfVar11.b, " id=", nrfVar11.a), null);
                h8n h8nVar = (h8n) ((jyr) this.c).getValue();
                hn5 hn5Var4 = qnqVar.b;
                h8nVar.getClass();
                hn5Var4.getClass();
                b bVar = (b) h8nVar.c.getValue();
                hn5Var4.getClass();
                bVar.getClass();
                sfm sfmVar = new sfm();
                jyr b = btf.b(new iik(27, bVar, hn5Var4));
                sfmVar.a = b;
                sfmVar.b = new h0m(((g) b.getValue()).c, 18);
                sfmVar.c = new h0m(((g) b.getValue()).d, 19);
                dqj Q2 = rzf.Q(new g73(nrfVar11.a, nrfVar11.b, new wn5(new wcj(29, g8nVar, sfmVar), 314496389, true), (cma) null, 24), b8nVar.d, null, null, null, null, 62);
                xdr xdrVar4 = g8nVar.k;
                xdrVar4.getClass();
                return new cyd(Q2, xdrVar4);
            case 12:
                kjq kjqVar = (kjq) rnqVar;
                qnqVar.getClass();
                djq djqVar = kjqVar.g;
                nrf nrfVar12 = djqVar.a;
                ssg.a(3, "Skeleton:SimplePlaylistBlock", hrg.r("createBlockUi: type=", nrfVar12.b, " id=", nrfVar12.a), null);
                j1p j1pVar = (j1p) this.d;
                s63 s63Var5 = kjqVar.d;
                hn5 hn5Var5 = qnqVar.b;
                hn5Var5.getClass();
                rjp rjpVar = new rjp();
                rjpVar.a = hn5Var5;
                rjpVar.b = s63Var5;
                return (rrf) j1pVar.invoke(djqVar, new ejq(kjqVar, rjpVar));
            case 13:
                vfr vfrVar = (vfr) rnqVar;
                qnqVar.getClass();
                return (rrf) ((aqp) this.d).invoke(vfrVar.d, new nfr(vfrVar), qnqVar);
            default:
                slu sluVar = (slu) rnqVar;
                qnqVar.getClass();
                nrf nrfVar13 = sluVar.e.a;
                ssg.a(3, "Skeleton:WaveAgentsBlock", hrg.r("createBlockUi: type=", nrfVar13.b, " id=", nrfVar13.a), null);
                g73 g73Var3 = new g73(nrfVar13.a, nrfVar13.b, new wn5(new kws(9, this, sluVar, qnqVar.d), 1205317664, true), (cma) null, 24);
                xdr xdrVar5 = sluVar.d.c;
                xdrVar5.getClass();
                return new cyd(g73Var3, xdrVar5);
        }
    }

    @Override // defpackage.knq
    public final rnq b(s63 s63Var) {
        switch (this.a) {
            case 0:
                vjg vjgVar = (vjg) s63Var.a;
                f3 f3Var = (f3) this.b;
                return new w3(vjgVar, (y2) ((jyr) this.c).getValue(), (pyc) this.d, (d3) f3Var.c.getValue(), (oq7) f3Var.a.getValue());
            case 1:
                sd sdVar = (sd) s63Var.a;
                ssg.a(3, "Skeleton:ActionBar", "createViewModel: block=" + sdVar.c, null);
                tmb tmbVar = (tmb) this.b;
                nrf nrfVar = sdVar.c;
                String str = nrfVar.b;
                String str2 = nrfVar.a;
                int i = s63Var.b;
                str.getClass();
                str2.getClass();
                rmb a = tmbVar.a(new lab(1, i, 1, str, str2), null);
                ud udVar = (ud) this.d;
                return new ge(s63Var, a, new ae(udVar.a, udVar.b));
            case 2:
                ssg.a(3, "Skeleton:ArtistConcertsBlock", "createViewModel: block=" + ((m31) s63Var.a).a, null);
                rmb x = q5g.x((tmb) this.c, s63Var);
                p31 p31Var = (p31) this.b;
                p31Var.getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(upq.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new z31(s63Var, x, new j4x((upq) qdcVar.C(I), wct.t()), new mvn(14), (rw5) p31Var.e.getValue());
            case 3:
                ssg.a(3, "Skeleton:ArtistTracksBlock", "createViewModel: block=" + ((ok1) s63Var.a).a, null);
                rmb x2 = q5g.x((tmb) this.c, s63Var);
                pk1 pk1Var = (pk1) this.b;
                return new bl1(s63Var, x2, pk1Var.d, new ix6((a2t) pk1Var.b.getValue()));
            case 4:
                r12 r12Var = (r12) s63Var.a;
                ssg.a(3, "Collection:Skeleton:COLLECTION_AUTO_CACHE_ONBOARDING", "createViewModel: block=" + r12Var.a, null);
                return new b22(r12Var, (w12) ((u12) this.b).c.getValue(), (c22) this.c, q5g.x((tmb) this.d, s63Var));
            case 5:
                ssg.a(3, "Skeleton:CarouselBlock", "createViewModel: block=" + ((r04) s63Var.a).a(), null);
                q43 q43Var = new q43(s63Var, (jnq) this.c);
                j14 c = ((a14) this.b).c();
                final int i2 = 0;
                jyr b = btf.b(new Function0(this) { // from class: c14
                    public final /* synthetic */ i3 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                return ((a14) this.b.b).d();
                            default:
                                return ((a14) this.b.b).b();
                        }
                    }
                });
                final int i3 = 1;
                return new l14(s63Var, q43Var, c, b, btf.b(new Function0(this) { // from class: c14
                    public final /* synthetic */ i3 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                return ((a14) this.b.b).d();
                            default:
                                return ((a14) this.b.b).b();
                        }
                    }
                }));
            case 6:
                ssg.a(3, "Skeleton:ChartTracksBlock", "createViewModel: block=" + ((ag4) s63Var.a).a, null);
                q43 q43Var2 = new q43(s63Var, (jnq) this.c);
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(gg4.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return new jg4(s63Var, q43Var2, (gg4) qdcVar2.C(I2));
            case 7:
                return new m36((t26) s63Var.a, q5g.x((tmb) this.d, s63Var), (i36) ((jyr) this.c).getValue(), ((u26) this.b).d());
            case 8:
                ssg.a(3, "Skeleton:EditorialWavesBlock", "createViewModel: block=" + ((c2b) s63Var.a).a, null);
                q43 q43Var3 = new q43(s63Var, (jnq) this.b);
                l13 l13Var = ((ioq) this.c).a;
                return new f2b(s63Var, q43Var3, (i2b) l13Var.a.D(hag.I(i2b.class), l13Var, l13Var.b), btf.b(new tka(12, this)));
            case 9:
                ssg.a(3, "Skeleton:NewReleasesBlock", "createViewModel: block=" + ((m4j) s63Var.a).a, null);
                q43 q43Var4 = new q43(s63Var, (jnq) this.b);
                l18 l18Var3 = l18.b;
                bdt I3 = hag.I(p4j.class);
                qdc qdcVar3 = l18Var3.a;
                qdcVar3.getClass();
                p4j p4jVar = (p4j) qdcVar3.C(I3);
                jyr b2 = btf.b(new u5i(this, 22));
                jyr b3 = btf.b(new u5i(this, 23));
                bdt I4 = hag.I(zb5.class);
                qdc qdcVar4 = l18Var3.a;
                qdcVar4.getClass();
                zb5 zb5Var = (zb5) qdcVar4.C(I4);
                bdt I5 = hag.I(cu.class);
                qdc qdcVar5 = l18Var3.a;
                qdcVar5.getClass();
                return new w4j(s63Var, q43Var4, p4jVar, b2, b3, zb5Var, (cu) qdcVar5.C(I5));
            case 10:
                ssg.a(3, "Skeleton:OpenPlaylistBlock", "createViewModel: block=" + ((fsj) s63Var.a).a, null);
                q43 q43Var5 = new q43(s63Var, (jnq) this.c);
                l18 l18Var4 = l18.b;
                bdt I6 = hag.I(tsj.class);
                qdc qdcVar6 = l18Var4.a;
                qdcVar6.getClass();
                tsj tsjVar = (tsj) qdcVar6.C(I6);
                bdt I7 = hag.I(a2t.class);
                qdc qdcVar7 = l18Var4.a;
                qdcVar7.getClass();
                a2t a2tVar = (a2t) qdcVar7.C(I7);
                bdt I8 = hag.I(cej.class);
                qdc qdcVar8 = l18Var4.a;
                qdcVar8.getClass();
                return new wsj(s63Var, q43Var5, tsjVar, a2tVar, (cej) qdcVar8.C(I8), btf.b(new s9j(this, 15)));
            case 11:
                b8n b8nVar = (b8n) s63Var.a;
                ssg.a(3, "Skeleton:QuestsBlock", "createViewModel: block=" + b8nVar.a, null);
                return new g8n(b8nVar, new q43(s63Var, (jnq) this.b), (Function1) ((jyr) this.d).getValue());
            case 12:
                ssg.a(3, "Skeleton:SimplePlaylistBlock", "createViewModel: block=" + ((djq) s63Var.a).a, null);
                q43 q43Var6 = new q43(s63Var, (jnq) this.c);
                l13 l13Var2 = ((foq) this.b).a;
                return new kjq(s63Var, new hjq((upq) l13Var2.a.D(hag.I(upq.class), l13Var2, l13Var2.b)), q43Var6);
            case 13:
                l13 l13Var3 = ((loq) this.b).a;
                aw8 aw8Var = (aw8) l13Var3.a.D(hag.I(aw8.class), l13Var3, l13Var3.b);
                ifr ifrVar = (ifr) l13Var3.a.D(hag.I(ifr.class), l13Var3, l13Var3.b);
                jnq jnqVar = (jnq) this.c;
                return new vfr(s63Var, aw8Var, jnqVar != null ? new q43(s63Var, jnqVar) : null, ifrVar);
            default:
                mlu mluVar = (mlu) s63Var.a;
                ssg.a(3, "Skeleton:WaveAgentsBlock", "createViewModel: block=" + mluVar.a, null);
                gs4 gs4Var = new gs4(s63Var, (jnq) this.b);
                l13 l13Var4 = ((hoq) this.c).d;
                return new slu(mluVar, gs4Var, (qlu) l13Var4.a.D(hag.I(qlu.class), l13Var4, l13Var4.b), btf.b(new hft(this)));
        }
    }

    public i3(foq foqVar, jnq jnqVar, j1p j1pVar) {
        jnqVar.getClass();
        this.b = foqVar;
        this.c = jnqVar;
        this.d = j1pVar;
    }

    public i3(f3 f3Var, jyr jyrVar, pyc pycVar) {
        f3Var.getClass();
        this.b = f3Var;
        this.c = jyrVar;
        this.d = pycVar;
    }

    public i3(u12 u12Var, c22 c22Var, tmb tmbVar) {
        c22Var.getClass();
        this.b = u12Var;
        this.c = c22Var;
        this.d = tmbVar;
    }

    public i3(u26 u26Var, tmb tmbVar) {
        tmbVar.getClass();
        this.b = u26Var;
        this.d = tmbVar;
        this.c = btf.b(new r25(21, this));
    }

    public i3(loq loqVar, jnq jnqVar, aqp aqpVar) {
        this.b = loqVar;
        this.c = jnqVar;
        this.d = aqpVar;
    }

    public i3(tmb tmbVar, wn5 wn5Var, ud udVar) {
        tmbVar.getClass();
        this.b = tmbVar;
        this.c = wn5Var;
        this.d = udVar;
    }

    public i3(p31 p31Var, tmb tmbVar, wn5 wn5Var) {
        p31Var.getClass();
        tmbVar.getClass();
        this.b = p31Var;
        this.c = tmbVar;
        this.d = wn5Var;
    }

    public i3(pk1 pk1Var, tmb tmbVar, wn5 wn5Var) {
        pk1Var.getClass();
        tmbVar.getClass();
        this.b = pk1Var;
        this.c = tmbVar;
        this.d = wn5Var;
    }

    public i3(n4j n4jVar, jnq jnqVar, tmb tmbVar, d6h d6hVar) {
        jnqVar.getClass();
        tmbVar.getClass();
        this.b = jnqVar;
        this.c = tmbVar;
        this.d = d6hVar;
    }

    public i3(bg4 bg4Var, jnq jnqVar, tmb tmbVar) {
        jnqVar.getClass();
        tmbVar.getClass();
        this.b = bg4Var;
        this.c = jnqVar;
        this.d = tmbVar;
    }

    public i3(jnq jnqVar, ioq ioqVar, rea reaVar) {
        jnqVar.getClass();
        this.b = jnqVar;
        this.c = ioqVar;
        this.d = reaVar;
    }

    public i3(hsj hsjVar, jnq jnqVar, tmb tmbVar) {
        jnqVar.getClass();
        tmbVar.getClass();
        this.b = hsjVar;
        this.c = jnqVar;
        this.d = tmbVar;
    }

    public i3(jnq jnqVar, hoq hoqVar, wn5 wn5Var) {
        jnqVar.getClass();
        this.b = jnqVar;
        this.c = hoqVar;
        this.d = wn5Var;
    }

    public i3(a14 a14Var, jnq jnqVar, q2 q2Var) {
        a14Var.getClass();
        jnqVar.getClass();
        this.b = a14Var;
        this.c = jnqVar;
        this.d = q2Var;
    }
}
