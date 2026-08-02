package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class d7i extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d7i(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new d7i((j7i) this.k, continuation, 0);
            case 1:
                return new d7i((vgi) this.k, continuation, 1);
            case 2:
                return new d7i((qti) this.k, continuation, 2);
            case 3:
                return new d7i((bui) this.k, continuation, 3);
            case 4:
                return new d7i((l2j) this.k, continuation, 4);
            case 5:
                return new d7i((ebj) this.k, continuation, 5);
            case 6:
                return new d7i((tfj) this.k, continuation, 6);
            case 7:
                return new d7i((cwj) this.k, continuation, 7);
            case 8:
                return new d7i((yuk) this.k, continuation, 8);
            case 9:
                return new d7i((j9l) this.k, continuation, 9);
            case 10:
                return new d7i((tqn) this.k, continuation, 10);
            case 11:
                return new d7i((tll) this.k, continuation, 11);
            case 12:
                return new d7i((xpl) this.k, continuation, 12);
            case 13:
                return new d7i((PlaylistScreenActivity) this.k, continuation, 13);
            case 14:
                return new d7i((cvl) this.k, continuation, 14);
            case 15:
                return new d7i((kbn) this.k, continuation, 15);
            case 16:
                return new d7i((wln) this.k, continuation, 16);
            case 17:
                return new d7i((b6p) this.k, continuation, 17);
            case 18:
                return new d7i((pqp) this.k, continuation, 18);
            case 19:
                return new d7i((sfm) this.k, continuation, 19);
            case 20:
                return new d7i((cr) this.k, continuation, 20);
            case 21:
                return new d7i((q7r) this.k, continuation, 21);
            case 22:
                return new d7i((slr) this.k, continuation, 22);
            case 23:
                return new d7i((jur) this.k, continuation, 23);
            case 24:
                return new d7i((vxr) this.k, continuation, 24);
            case 25:
                return new d7i((hn5) this.k, continuation, 25);
            case 26:
                return new d7i((m5s) this.k, continuation, 26);
            case 27:
                return new d7i((e8s) this.k, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new d7i((r2f) this.k, continuation, 28);
            default:
                return new d7i((pvs) this.k, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((d7i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        List<i4p> list;
        HashSet u0;
        Object t7oVar;
        int i = 6;
        int i2 = 2;
        int i3 = 3;
        int i4 = 0;
        Continuation continuation = null;
        int i5 = 1;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ve5 ve5Var = ((j7i) this.k).G;
                if (ve5Var == null || (list = ve5Var.e) == null) {
                    return c5b.a;
                }
                ArrayList arrayList = new ArrayList();
                for (i4p i4pVar : list) {
                    mqs mqsVar = i4pVar instanceof f4p ? ((f4p) i4pVar).b : i4pVar instanceof c4p ? ((c4p) i4pVar).b : null;
                    if (mqsVar != null) {
                        arrayList.add(mqsVar);
                    }
                }
                return arrayList;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                ((vgi) this.k).getClass();
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                xdr xdrVar = ((qti) this.k).l;
                l18 l18Var = l18.b;
                bdt I = hag.I(z66.class);
                l18Var.a.getClass();
                v3w.n(!((z66) r2.C(I)).g(), xdrVar, null);
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                xdr xdrVar2 = ((bui) this.k).k;
                Boolean bool = Boolean.FALSE;
                xdrVar2.getClass();
                xdrVar2.m(null, bool);
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                l2j l2jVar = (l2j) this.k;
                yjj yjjVar = l2jVar.a;
                synchronized (yjjVar.a) {
                    u0 = CollectionsKt.u0(yjjVar.a);
                }
                Iterator it = u0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    try {
                        r7o r7oVar = z7o.b;
                        ((lzi) next).a(l2jVar.d());
                        t7oVar = Unit.a;
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    Throwable a = z7o.a(t7oVar);
                    if (a != null) {
                        Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                    }
                }
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                ((bbj) ((ebj) this.k).d.b).n.d();
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                Object value = ((tfj) this.k).a.getValue();
                value.getClass();
                return Boolean.valueOf(((SharedPreferences) value).getBoolean("key.allowed", true));
            case 7:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                cwj cwjVar = (cwj) this.k;
                cwjVar.w.l(null);
                x97.y(ot0.F(cwjVar), null, null, new yvj(cwjVar, continuation, 1), 3);
                cwjVar.G();
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                yuk yukVar = (yuk) this.k;
                ssg.a(4, yukVar.b, "external upload request", null);
                wot wotVar = (wot) yukVar.e.getValue();
                ssg.a(4, wotVar.a, "upload request", null);
                oi oiVar = wotVar.f;
                Unit unit = Unit.a;
                oiVar.c(unit);
                return unit;
            case 9:
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                j9l j9lVar = (j9l) this.k;
                ngh nghVar = (ngh) j9lVar.p.getValue();
                tf6 tf6Var = j9lVar.r;
                nghVar.getClass();
                tf6Var.getClass();
                rdk rdkVar = new rdk(nghVar.g, nghVar.h);
                kpm kpmVar = new kpm(tf6Var, new u1o[]{rdkVar});
                wgh wghVar = nghVar.f;
                wghVar.getClass();
                ime imeVar = new ime(wghVar.e);
                rn5 rn5Var = new rn5(tf6Var, wghVar.d);
                kpm kpmVar2 = new kpm(tf6Var, new u1o[]{imeVar, rn5Var});
                xdr xdrVar3 = wghVar.a;
                vdr vdrVar = wghVar.b;
                hk4 hk4Var = new hk4(i3, i, continuation);
                int i6 = 10;
                pjc C = zsd.C(zsd.M0(new clc(new u21(i6, xdrVar3, vdrVar, hk4Var), new jmd(wghVar, continuation, 27)), new ukc(null, kpmVar2, wghVar, imeVar, rn5Var)), 0);
                uol uolVar = nghVar.a;
                pjc C2 = zsd.C(zsd.P(C, uolVar.j, uolVar.k, zsd.M0(nghVar.e.a, new tn2(3, 1, continuation)), new mgh(kpmVar, nghVar, rdkVar, null)), -1);
                int i7 = 0;
                ox6.B(C2, tf6Var, new g9l(j9lVar, i7));
                int i8 = 1;
                ox6.B(zsd.b0(new f9l(i7, new a1l(j9lVar.h.c, i6))), tf6Var, new g9l(j9lVar, i8));
                x97.y(tf6Var, null, null, new b5l(j9lVar.f.i, continuation, j9lVar, i8), 3);
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                ((tqn) this.k).a = false;
                return Unit.a;
            case 11:
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                kcl kclVar = ((tll) this.k).b;
                if (kclVar.a().a(((Boolean) kclVar.a().g.getValue()).booleanValue()) && ((Boolean) kclVar.a().g.getValue()).booleanValue()) {
                    kclVar.b();
                }
                return Unit.a;
            case 12:
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                ((xpl) this.k).b.a();
                return Unit.a;
            case 13:
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                ((PlaylistScreenActivity) this.k).finish();
                return Unit.a;
            case 14:
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                return new n3m((cvl) this.k).e0();
            case 15:
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                aa2 aa2Var = ((wmg) ((kbn) this.k).i.getValue()).b;
                rjq rjqVar = aa2Var.a;
                if (!aa2Var.c.getAndSet(true)) {
                    rjqVar.g();
                    pjc pjcVar = (pjc) aa2Var.j.getValue();
                    um6 um6Var = aa2Var.b;
                    ox6.B(pjcVar, um6Var, new x92(aa2Var, 0));
                    aa2Var.g.a.a().getClass();
                    ox6.B(zsd.C(ox6.L(new cz(new sbn(aa2Var.e).a(), aa2Var, 8), 1000L), -1), um6Var, new x92(aa2Var, 1));
                }
                return Unit.a;
            case 16:
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                ((wln) this.k).a();
                return Unit.a;
            case 17:
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                ((b6p) this.k).z.d();
                return Unit.a;
            case 18:
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                pqp pqpVar = (pqp) this.k;
                pjc pjcVar2 = (pjc) pqpVar.K.getValue();
                pjc pjcVar3 = (pjc) pqpVar.L.getValue();
                pjc pjcVar4 = (pjc) pqpVar.X.getValue();
                pjc pjcVar5 = (pjc) pqpVar.Y.getValue();
                pjc pjcVar6 = (pjc) pqpVar.Z.getValue();
                pjc pjcVar7 = (pjc) pqpVar.v0.getValue();
                pjc pjcVar8 = (pjc) pqpVar.w0.getValue();
                gqp gqpVar = new gqp(null);
                pjcVar2.getClass();
                pjcVar3.getClass();
                pjcVar4.getClass();
                pjcVar5.getClass();
                pjcVar6.getClass();
                pjcVar7.getClass();
                pjcVar8.getClass();
                ox6.B(new ub7(16, new pjc[]{pjcVar2, pjcVar3, pjcVar4, pjcVar5, pjcVar6, pjcVar7, pjcVar8}, gqpVar), ot0.F(pqpVar), new hqp(pqpVar, i4));
                ox6.B(((n8q) pqpVar.o.getValue()).b, ot0.F(pqpVar), new hqp(pqpVar, i5));
                return Unit.a;
            case 19:
                nm6 nm6Var20 = nm6.a;
                qgg.h0(obj);
                sfm sfmVar = (sfm) this.k;
                Collection values = ((ConcurrentHashMap) sfmVar.b).values();
                values.getClass();
                Iterator it2 = values.iterator();
                while (it2.hasNext()) {
                    xdr xdrVar4 = (xdr) ((bqi) it2.next());
                    otq otqVar = (otq) xdrVar4.getValue();
                    if (otqVar instanceof mtq) {
                        ovn ovnVar = (ovn) sfmVar.c;
                        mtq mtqVar = (mtq) otqVar;
                        ns4 ns4Var = mtqVar.b;
                        kzp kzpVar = new kzp(15, sfmVar);
                        ovnVar.getClass();
                        xdrVar4.m(null, new mtq(ys4.a(mtqVar.a, 0, ovn.y(ns4Var, kzpVar), 1), ns4Var));
                    }
                }
                return Unit.a;
            case 20:
                nm6 nm6Var21 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(((s5d) ((cr) this.k).h) instanceof n5q);
            case 21:
                nm6 nm6Var22 = nm6.a;
                qgg.h0(obj);
                return ((q7r) this.k).a.a();
            case 22:
                nm6 nm6Var23 = nm6.a;
                qgg.h0(obj);
                slr slrVar = (slr) this.k;
                wqr wqrVar = slrVar.Y;
                Unit unit2 = Unit.a;
                wqrVar.U(unit2);
                wqrVar.g(null);
                slrVar.X.shutdownNow();
                if (slrVar.C) {
                    slrVar.q.shutdown();
                }
                return unit2;
            case 23:
                nm6 nm6Var24 = nm6.a;
                qgg.h0(obj);
                xdr xdrVar5 = saa.a;
                return ((jur) this.k).a.c();
            case 24:
                nm6 nm6Var25 = nm6.a;
                qgg.h0(obj);
                neg.A(dyr.a, null);
                qxr.a();
                return Unit.a;
            case 25:
                nm6 nm6Var26 = nm6.a;
                qgg.h0(obj);
                int i9 = m5s.f;
                hn5 hn5Var = (hn5) this.k;
                hn5Var.sendBroadcast(new Intent("TAKE_CHARGE_CLOSE_POPUP"));
                m5s m5sVar = new m5s(hn5Var);
                m5sVar.a();
                nt0.M(hn5Var, m5sVar.e, new wn5(new l5s(m5sVar), -838927972, true));
                return Unit.a;
            case 26:
                nm6 nm6Var27 = nm6.a;
                qgg.h0(obj);
                ((m5s) this.k).e.e();
                return Unit.a;
            case 27:
                nm6 nm6Var28 = nm6.a;
                qgg.h0(obj);
                e8s e8sVar = (e8s) this.k;
                e8sVar.v.l(null);
                x97.y(ot0.F(e8sVar), null, null, new b8s(e8sVar, continuation, i2), 3);
                e8sVar.G();
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var29 = nm6.a;
                qgg.h0(obj);
                x97.D(g.a, new glp((r2f) this.k, continuation, 26));
                return Unit.a;
            default:
                nm6 nm6Var30 = nm6.a;
                qgg.h0(obj);
                ((o) ((pvs) this.k).c).b();
                return Unit.a;
        }
    }
}
