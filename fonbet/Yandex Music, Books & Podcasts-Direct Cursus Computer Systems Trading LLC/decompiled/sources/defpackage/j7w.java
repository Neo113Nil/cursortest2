package defpackage;

import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.IParamsCallback;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.e;
import ru.yandex.music.YMApplication;

/* loaded from: classes3.dex */
public final /* synthetic */ class j7w implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ YMApplication b;

    public /* synthetic */ j7w(YMApplication yMApplication, int i) {
        this.a = i;
        this.b = yMApplication;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        boolean z;
        Object obj;
        Object value;
        n87 n87Var;
        switch (this.a) {
            case 0:
                YMApplication yMApplication = this.b;
                ju0 ju0Var = YMApplication.d;
                l18 l18Var = l18.b;
                bdt I = hag.I(dgj.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                dgj dgjVar = (dgj) qdcVar.C(I);
                mm6 mm6Var = dgjVar.b;
                int i2 = 19;
                int i3 = 2;
                Continuation continuation = null;
                clc clcVar = new clc(zsd.b0(new kvh(zsd.b0(new kvh((vdr) dgjVar.a.g.getValue(), 18)), 19)), new jud(i3, 9, continuation));
                CopyOnWriteArrayList copyOnWriteArrayList = dgjVar.h;
                jyr jyrVar = k3j.e;
                int i4 = 0;
                copyOnWriteArrayList.add(ox6.B(new kvh(ixf.x() ? ((oi5) dgjVar.d.getValue()).f : ((pi5) dgjVar.c.getValue()).f, 17), mm6Var, new xfj(dgjVar, 0)));
                int i5 = 1;
                char c = 1;
                char c2 = 1;
                char c3 = 1;
                char c4 = 1;
                char c5 = 1;
                copyOnWriteArrayList.add(ox6.B(new u21(10, new ub7(12, clcVar, new z0i(2, 5, null)), new ub7(12, dgjVar.g, new z0i(2, 6, null)), yfj.a), mm6Var, new xfj(dgjVar, 1)));
                bdt I2 = hag.I(wlw.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                rlw rlwVar = (rlw) ((wlw) qdcVar2.C(I2)).a().i.getValue();
                if (!rlwVar.e.d.a()) {
                    rlwVar.e.g();
                    ox6.B(new e7v((pjc) rlwVar.d.invoke(), 28), (mm6) rlwVar.f.getValue(), new qlw(rlwVar, 0));
                    ox6.B(new z50(zsd.d0(zsd.M0((pjc) rlwVar.d.invoke(), new j0v((Continuation) null, rlwVar, 7)), 1), 11), (mm6) rlwVar.f.getValue(), new qlw(rlwVar, 1));
                }
                bdt I3 = hag.I(t35.class);
                qdc qdcVar3 = l18Var.a;
                qdcVar3.getClass();
                t35 t35Var = (t35) qdcVar3.C(I3);
                if (!t35Var.f.d.a()) {
                    t35Var.f.g();
                    ox6.B(zsd.b0(new d64(((frt) t35Var.j.getValue()).g(), 5)), t35Var.g, new i64(10, t35Var));
                }
                bdt I4 = hag.I(odd.class);
                qdc qdcVar4 = l18Var.a;
                qdcVar4.getClass();
                odd oddVar = (odd) qdcVar4.C(I4);
                x97.y(oddVar.f, null, null, new ox1(oddVar, continuation, i2), 3);
                ked kedVar = oddVar.c;
                bdd bddVar = oddVar.i;
                bddVar.getClass();
                kedVar.e.add(bddVar);
                oddVar.g();
                bdt I5 = hag.I(g64.class);
                qdc qdcVar5 = l18Var.a;
                qdcVar5.getClass();
                g64 g64Var = (g64) qdcVar5.C(I5);
                mm6 mm6Var2 = g64Var.g;
                int i6 = 13;
                int i7 = 20;
                if (!g64Var.f) {
                    g64Var.f = true;
                    ox6.B(zsd.b0(new bca(zsd.Q(g64Var.b.e(), zsd.b0(new bca(g64Var.c.m, 28)), zsd.b0(new cz(g64Var.d.a(), g64Var, i2)), new b60(4, g64Var, g64.class, "selectCastMode", "selectCastMode(Lcom/yandex/music/shared/ynison/api/YnisonClient$Mode;ZZ)Lru/yandex/music/cast/CastMode;", 4, 1)), 18)), mm6Var2, new y54(g64Var, 0));
                    ox6.B(new cz(v3g.D(g64Var.a), g64Var, i7), mm6Var2, new y54(g64Var, 1));
                    ox6.B(zsd.b0(new xo2(zsd.M0(g64Var.h, new l1(continuation, g64Var, i6)), i5)), mm6Var2, new y54(g64Var, 2));
                    c74 c74Var = g64Var.e;
                    zsd.r0(mm6Var2, new ub7(12, ((frt) c74Var.b.getValue()).g(), new qi(c74Var, continuation, 21)));
                }
                wfq wfqVar = wfq.b;
                wfqVar.getClass();
                a40[] a40VarArr = a40.a;
                ot0.A(wfqVar.e(), "App_Signature", tah.b(new Pair("SHA-1", CollectionsKt.X(jo0.a(yMApplication), "; ", null, null, null, 62))));
                bdt I6 = hag.I(p4n.class);
                qdc qdcVar6 = l18Var.a;
                qdcVar6.getClass();
                p4n p4nVar = (p4n) qdcVar6.C(I6);
                n9k n9kVar = (n9k) p4nVar.c.getValue();
                x97.y(n9kVar.c, null, null, new m1i(n9kVar, null, 23), 3);
                boolean z2 = p4nVar.a.a.getBoolean("KEY_PUSH_TOKEN_SUCCESS_SENT", false);
                rjq rjqVar = p4nVar.f;
                if (z2) {
                    rjqVar.g();
                    x97.y(p4nVar.g, null, null, new o4n(p4nVar, continuation, i3), 3);
                } else {
                    rjqVar.g();
                    x97.y(p4nVar.g, null, null, new o4n(p4nVar, continuation, c == true ? 1 : 0), 3);
                }
                bdt I7 = hag.I(w87.class);
                qdc qdcVar7 = l18Var.a;
                qdcVar7.getClass();
                w87 w87Var = (w87) qdcVar7.C(I7);
                n4t n4tVar = w87Var.a;
                e2j e2jVar = e2j.a;
                if (n4tVar.a.getLong("pulse_job_traffic_timestamp:RECEIVED", 0L) == 0) {
                    w87Var.a(e2jVar);
                }
                e2j e2jVar2 = e2j.b;
                if (n4tVar.a.getLong("pulse_job_traffic_timestamp:TRANSMITTED", 0L) == 0) {
                    w87Var.a(e2jVar2);
                }
                bdt I8 = hag.I(ku0.class);
                qdc qdcVar8 = l18Var.a;
                qdcVar8.getClass();
                ku0 ku0Var = (ku0) qdcVar8.C(I8);
                pjc g = ku0Var.a.g();
                zs0 zs0Var = new zs0(1);
                rea reaVar = q6k.g;
                za8 m = q6k.m(g, zs0Var, reaVar);
                e eVar = ca8.b;
                g.a.getClass();
                eVar.getClass();
                ox6.B(m, new tf6(eVar), new ri(6, ku0Var));
                bdt I9 = hag.I(ein.class);
                qdc qdcVar9 = l18Var.a;
                qdcVar9.getClass();
                ein einVar = (ein) qdcVar9.C(I9);
                f7l f7lVar = ((oq7) einVar.f.getValue()).a;
                x0q x0qVar = f7lVar.e;
                tf6 tf6Var = einVar.i;
                mn7 mn7Var = dm6.b;
                ox6.B(x0qVar, gld.X(tf6Var, mn7Var), new tek(19, einVar, f7lVar));
                pjc k0 = zsd.k0(new qk3(ox6.R(zsd.u0(f7lVar.e, new h0m(((cjl) einVar.g.getValue()).b, 24)), null), 7), mn7Var);
                bsd b = dm6.b();
                b.getClass();
                ox6.B(k0, new tf6(b), new din(einVar, 0));
                ox6.B(new h0m(einVar.d.c, 25), gld.X(tf6Var, dm6.b()), new din(einVar, 1));
                bdt I10 = hag.I(tge.class);
                qdc qdcVar10 = l18Var.a;
                qdcVar10.getClass();
                tge tgeVar = (tge) qdcVar10.C(I10);
                ox6.B(ox6.K(new fs(19, new ub7(26, new cla(y1g.L(((oq7) tgeVar.a.getValue()).a), i3), tgeVar)), 7200000L), new tf6(mn7Var), new otd(5, tgeVar));
                bdt I11 = hag.I(s2u.class);
                qdc qdcVar11 = l18Var.a;
                qdcVar11.getClass();
                s2u s2uVar = (s2u) qdcVar11.C(I11);
                tf6 e = gld.e(mn7Var);
                f7l f7lVar2 = s2uVar.a;
                ox6.B(zsd.d0(q6k.m(new f9l(20, new cla(y1g.L(f7lVar2), 9)), new grt(26, s2uVar), reaVar), 1), e, new r2u(s2uVar, c5 == true ? 1 : 0));
                ox6.B(zsd.b0(new mpq(20, new f9l(18, new f9l(19, new cla(y1g.L(f7lVar2), 10))), s2uVar)), e, new r2u(s2uVar, i3));
                ox6.B(new y4s(s2uVar.b.f, 10), e, new r2u(s2uVar, i4));
                bdt I12 = hag.I(nee.class);
                qdc qdcVar12 = l18Var.a;
                qdcVar12.getClass();
                nee neeVar = (nee) qdcVar12.C(I12);
                r2f r2fVar = neeVar.e;
                Continuation continuation2 = null;
                if (r2fVar != null) {
                    r2fVar.g(null);
                }
                neeVar.e = x97.y(neeVar.b, null, null, new mee(neeVar, "restore_purchase_receiver_init", continuation2, c4 == true ? 1 : 0), 3);
                if (!neeVar.d.getAndSet(true)) {
                    ctm.i.f.a(new s3b(c3 == true ? 1 : 0, neeVar));
                }
                x97.y(gld.e(mn7Var), null, null, new wu0(yMApplication, null, i4), 3);
                bdt I13 = hag.I(wbo.class);
                qdc qdcVar13 = l18Var.a;
                qdcVar13.getClass();
                wbo wboVar = (wbo) qdcVar13.C(I13);
                x97.y(wboVar.e, null, null, new n5(wboVar, null), 3);
                bdt I14 = hag.I(d6m.class);
                qdc qdcVar14 = l18Var.a;
                qdcVar14.getClass();
                j6m j6mVar = (j6m) ((d6m) qdcVar14.C(I14));
                jyr jyrVar2 = p6m.f;
                if (((Boolean) p6m.g.getValue()).booleanValue()) {
                    ox6.B(new ail(5, new bca(new u21(10, ((frt) j6mVar.f.getValue()).g(), new h0m(((z66) j6mVar.g.getValue()).c(), 3), new hk4(3, 7, null)), 18), j6mVar), j6mVar.d, new gfl(7, j6mVar));
                }
                bdt I15 = hag.I(ofl.class);
                qdc qdcVar15 = l18Var.a;
                qdcVar15.getClass();
                ofl oflVar = (ofl) qdcVar15.C(I15);
                bdt I16 = hag.I(byb.class);
                qdc qdcVar16 = l18Var.a;
                qdcVar16.getClass();
                ox6.B(((ub1) ((byb) qdcVar16.C(I16)).b(ub1.class)).e, oflVar.c, new gfl(1, oflVar));
                bdt I17 = hag.I(llj.class);
                qdc qdcVar17 = l18Var.a;
                qdcVar17.getClass();
                llj lljVar = (llj) qdcVar17.C(I17);
                if (((plj) lljVar.a.c) != plj.c) {
                    i = 3;
                } else {
                    tqn tqnVar = new tqn();
                    tqnVar.a = true;
                    kvh kvhVar = new kvh(((frt) lljVar.d.getValue()).g(), 21);
                    mvu mvuVar = (mvu) lljVar.f.getValue();
                    yx4 yx4Var = mvuVar.a;
                    pjc[] pjcVarArr = {((e6q) yx4Var.a).e};
                    Continuation continuation3 = null;
                    i = 3;
                    x97.y(lljVar.c, null, null, new rlg(zsd.b0(new u21(10, kvhVar, new u21(10, yx4.y(pjcVarArr, new sx4(yx4Var, c2 == true ? 1 : 0, continuation3, i4)), ((ezb) mvuVar.b).d, new laq(i, 6, continuation3)), new t81(i, 14, continuation3))), (Continuation) null, tqnVar, lljVar), 3);
                }
                bdt I18 = hag.I(x87.class);
                qdc qdcVar18 = l18Var.a;
                qdcVar18.getClass();
                x87 x87Var = (x87) qdcVar18.C(I18);
                bdt I19 = hag.I(byb.class);
                qdc qdcVar19 = l18Var.a;
                qdcVar19.getClass();
                boolean h = ((c6m) ((byb) qdcVar19.C(I19)).c(ern.a(c6m.class))).h();
                ovn ovnVar = a87.a;
                ConcurrentHashMap concurrentHashMap = g5m.a;
                ReentrantLock reentrantLock = f5m.a;
                ConcurrentHashMap concurrentHashMap2 = h5m.a;
                u7m u7mVar = x87Var.a;
                b5m b5mVar = new b5m(u7mVar.c, null);
                z0i z0iVar = new z0i(2, 12, null);
                osl oslVar = new osl(16);
                c5m c5mVar = new c5m(yMApplication, oslVar, null);
                d5m d5mVar = new d5m(yMApplication, oslVar, null, 0);
                d5m d5mVar2 = new d5m(yMApplication, oslVar, null, 1);
                e5m e5mVar = new e5m(yMApplication, oslVar, null);
                fs fsVar = new fs(15, Boolean.valueOf(h));
                fs fsVar2 = new fs(15, "music");
                h0m h0mVar = new h0m(u7mVar.a.d, 5);
                int ordinal = u7mVar.b().ordinal();
                if (ordinal != 0) {
                    z = true;
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    obj = xdb.a;
                } else {
                    z = true;
                    obj = ydb.a;
                }
                Continuation continuation4 = null;
                jme jmeVar = new jme(yMApplication, j5h.a, ca8.a, mn7.d, fsVar, new fs(15, obj), h0mVar, fsVar2, z0iVar, b5mVar, c5mVar, d5mVar, d5mVar2, e5mVar);
                xdr xdrVar = a87.b;
                do {
                    value = xdrVar.getValue();
                    n87Var = (n87) value;
                    if (n87Var == null) {
                        n87Var = new n87(jmeVar);
                    }
                } while (!xdrVar.k(value, n87Var));
                bdt I20 = hag.I(wyq.class);
                qdc qdcVar20 = l18Var.a;
                qdcVar20.getClass();
                nyq nyqVar = (nyq) ((wyq) qdcVar20.C(I20)).b.getValue();
                int i8 = 12;
                x97.y(nyqVar.f, null, null, new glp(nyqVar, continuation4, i8), 3);
                bdt I21 = hag.I(nwd.class);
                qdc qdcVar21 = l18Var.a;
                qdcVar21.getClass();
                nwd nwdVar = (nwd) qdcVar21.C(I21);
                fkn fknVar = nwdVar.b.a;
                q5b q5bVar = q5b.a;
                int i9 = 18;
                zsd.r0(nwdVar.c, new ub7(12, new fs(18, new ckc(new u21(9, new Pair(q5bVar, q5bVar), fknVar, new t81(3, 7, continuation4)), 1)), new nz5(nwdVar, (Continuation) null, 20)));
                bdt I22 = hag.I(glk.class);
                qdc qdcVar22 = l18Var.a;
                qdcVar22.getClass();
                e00 e00Var = ((glk) qdcVar22.C(I22)).a;
                bdt I23 = hag.I(flk.class);
                qdc qdcVar23 = e00Var.a;
                qdcVar23.getClass();
                yMApplication.registerActivityLifecycleCallbacks(((flk) qdcVar23.C(I23)).a);
                List c6 = t75.c(dm6.b);
                c6.getClass();
                int i10 = 0;
                zdg.I("DeadlockDetector", new wfs(0, new n6p(c6, continuation4, 13)), 23);
                bdt I24 = hag.I(rw5.class);
                qdc qdcVar24 = l18Var.a;
                qdcVar24.getClass();
                rw5 rw5Var = (rw5) qdcVar24.C(I24);
                if (!rw5Var.g.getAndSet(true)) {
                    x97.y(rw5Var.e, null, null, new vv4(zsd.M0(rw5Var.b, new l1(continuation4, rw5Var, i9)), continuation4, rw5Var, i8), 3);
                }
                bdt I25 = hag.I(bku.class);
                qdc qdcVar25 = l18Var.a;
                qdcVar25.getClass();
                bku bkuVar = (bku) qdcVar25.C(I25);
                cmd cmdVar = cmd.a;
                ox6.B(new y4s(zsd.b0(bkuVar.b), 15), cmdVar, new lot(9, bkuVar));
                bdt I26 = hag.I(rk3.class);
                qdc qdcVar26 = l18Var.a;
                qdcVar26.getClass();
                rk3 rk3Var = (rk3) qdcVar26.C(I26);
                ox6.B(new qk3(ox6.R(zsd.b0((pjc) rk3Var.a.b.getValue()), fku.b), i10), cmdVar, new ri(26, rk3Var));
                bdt I27 = hag.I(lxf.class);
                qdc qdcVar27 = l18Var.a;
                qdcVar27.getClass();
                lxf lxfVar = (lxf) qdcVar27.C(I27);
                AppMetricaYandex.requestStartupParams(lxfVar.a, new kxf(lxfVar), IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED);
                return Unit.a;
            default:
                return Boolean.valueOf(YMApplication.a(this.b));
        }
    }
}
