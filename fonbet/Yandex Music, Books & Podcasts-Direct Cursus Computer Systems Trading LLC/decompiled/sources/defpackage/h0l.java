package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import androidx.work.impl.foreground.SystemForegroundService;
import com.yandex.passport.common.core.f;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.passport.internal.entities.j;
import com.yandex.passport.internal.entities.n;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.passport.internal.report.reporters.i0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.h0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.o1;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.r0;
import com.yandex.plus.bdui.action.b;
import com.yandex.plus.bdui.action.d;
import com.yandex.plus.bdui.flex.action.c;
import com.yandex.plus.bdui.m;
import com.yandex.plus.bdui.plus.checkout.o;
import com.yandex.plus.bdui.plus.content.controller.l;
import com.yandex.plus.bdui.plus.content.controller.q;
import com.yandex.plus.bdui.plus.scaffold.utils.a;
import com.yandex.plus.bdui.s;
import com.yandex.plus.home.internal.di.u;
import com.yandex.plus.home.k;
import com.yandex.plus.home.plaque.repository.graphql.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class h0l implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h0l(jyr jyrVar, yyk yykVar, l13 l13Var, jyr jyrVar2) {
        this.a = 0;
        this.b = jyrVar;
        this.d = yykVar;
        this.e = l13Var;
        this.c = jyrVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [fvs] */
    /* JADX WARN: Type inference failed for: r3v22, types: [evs] */
    /* JADX WARN: Type inference failed for: r3v24, types: [dvs] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Continuation continuation;
        y supportFragmentManager;
        int i = 9;
        int i2 = 1;
        int i3 = 10;
        Continuation continuation2 = null;
        switch (this.a) {
            case 0:
                jyr jyrVar = (jyr) this.b;
                yyk yykVar = (yyk) this.d;
                l13 l13Var = (l13) this.e;
                jyr jyrVar2 = (jyr) this.c;
                xuk xukVar = (xuk) jyrVar.getValue();
                oq7 oq7Var = yykVar.c;
                rjp rjpVar = ((faw) ((gni) l13Var.a.D(hag.I(gni.class), l13Var, l13Var.b))).i0;
                dn9 dn9Var = new dn9((Context) l13Var.a.D(hag.I(Context.class), l13Var, l13Var.b), (qqs) l13Var.a.D(hag.I(qqs.class), l13Var, l13Var.b), (dv3) l13Var.a.D(hag.I(dv3.class), l13Var, l13Var.b), new s8i(15, rjpVar), new d1j(22, rjpVar));
                List c = t75.c(new nqj(jyrVar2));
                xukVar.getClass();
                c.getClass();
                f7l f7lVar = oq7Var.a;
                uol uolVar = oq7Var.c;
                t1f t1fVar = oq7Var.d;
                g4l g4lVar = oq7Var.b;
                cvk cvkVar = xukVar.a;
                bdt I = hag.I(suk.class);
                qdc qdcVar = cvkVar.a;
                qdcVar.getClass();
                suk sukVar = (suk) qdcVar.C(I);
                bdt I2 = hag.I(tuk.class);
                qdc qdcVar2 = cvkVar.a;
                qdcVar2.getClass();
                return new t0l(dn9Var, f7lVar, uolVar, t1fVar, g4lVar, sukVar, (tuk) qdcVar2.C(I2), c);
            case 1:
                cxl cxlVar = (cxl) this.b;
                se5 se5Var = (se5) this.c;
                ae5 ae5Var = (ae5) this.d;
                String str = (String) this.e;
                asq.t(((z5l) cxlVar.h.getValue()).d(se5Var, true, uyk.a), cxlVar.a, new p1n(8));
                ae5Var.invoke(Boolean.FALSE, str);
                return Unit.a;
            case 2:
                rbm rbmVar = (rbm) this.b;
                mxs mxsVar = (mxs) this.c;
                jab jabVar = (jab) this.d;
                u0s u0sVar = (u0s) this.e;
                mq mqVar = mxsVar.a;
                rbmVar.getClass();
                mqVar.getClass();
                rmb a = rbmVar.e.a(jabVar, u0sVar);
                rmb.j(a, wjb.SortConditionsScreen, null, null, 14);
                qbj qbjVar = rbmVar.c;
                avi aviVar = new avi(24, a, rbmVar);
                qbjVar.getClass();
                t tVar = (t) qbjVar.e.b;
                pu0 t = pd.t(new qzm[0]);
                List<mq> h = u75.h(mq.Desc, mq.Asc);
                ArrayList arrayList = new ArrayList(v75.o(h, 10));
                for (mq mqVar2 : h) {
                    boolean z = mqVar2 == mqVar;
                    mqVar2.getClass();
                    arrayList.add(s7g.l(mqVar2, null, mqVar2.a, z));
                }
                avi aviVar2 = new avi(4, mqVar, aviVar);
                tVar.getClass();
                cvo cvoVar = cvo.i;
                fxf.P(tVar, o6m.b(wjb.SortConditionsScreen, null, 6), null, t, null, new wn5(new fb1(i, arrayList, aviVar2, tVar), -240278974, true), 22);
                return Unit.a;
            case 3:
                irs irsVar = (irs) this.b;
                ovs ovsVar = (ovs) this.c;
                dda ddaVar = (dda) this.d;
                cvl cvlVar = (cvl) this.e;
                l18 l18Var = l18.b;
                bdt I3 = hag.I(byb.class);
                qdc qdcVar3 = l18Var.a;
                qdcVar3.getClass();
                boolean h2 = ((s5j) ((byb) qdcVar3.C(I3)).b(s5j.class)).h();
                mqs mqsVar = irsVar.a;
                if (!h2) {
                    return f8g.H(mqsVar, irsVar.b, irsVar.c, irsVar.d, ovsVar, irsVar.e, irsVar.f, irsVar.g, irsVar.h, irsVar.i, ddaVar, cvlVar);
                }
                gj gjVar = irsVar.b;
                if (ovsVar != null) {
                    if (ovsVar instanceof mvs) {
                        mvs mvsVar = (mvs) ovsVar;
                        continuation = new dvs(mvsVar.a, mvsVar.b);
                    } else {
                        if (!(ovsVar instanceof nvs)) {
                            b6e.s();
                            return null;
                        }
                        nvs nvsVar = (nvs) ovsVar;
                        continuation = new evs(nvsVar.a, nvsVar.b);
                    }
                    continuation2 = continuation;
                }
                ve veVar = irsVar.e;
                return hyf.z(mqsVar, gjVar, continuation2, o8g.V(veVar, irsVar.a, o8g.U(veVar.b)), irsVar.c.a, cvlVar, new jrs(irsVar.f, irsVar.g, irsVar.i, (qe3) irsVar.n.getValue(), ddaVar), irsVar, (qe3) irsVar.n.getValue());
            case 4:
                jvs jvsVar = (jvs) this.b;
                zvs zvsVar = (zvs) this.c;
                be6 be6Var = (be6) this.d;
                pxs pxsVar = (pxs) this.e;
                eps epsVar = new eps(jvsVar.a, maa.d, zvsVar, pxsVar != null ? o2g.k0(pxsVar) : null, gy1.c, be6Var);
                try {
                    ssg.a(3, "TrackDownloaderImpl", "download() - trying to download " + zvsVar, null);
                    epsVar.t(null);
                    ess essVar = (ess) epsVar.g;
                    if (essVar == null) {
                        Intrinsics.j("downloadRowId");
                        throw null;
                    }
                    ssg.a(3, "TrackDownloaderImpl", "download() - finish downloading " + zvsVar, null);
                    return essVar;
                } catch (IOException e) {
                    j66.h0(e);
                    throw eob.a(e, null);
                }
            case 5:
                msd msdVar = (msd) this.b;
                xjv xjvVar = (xjv) this.c;
                mjv mjvVar = (mjv) this.d;
                spd spdVar = (spd) this.e;
                msdVar.a(0);
                apo apoVar = xjvVar.b;
                Context context = (Context) apoVar.b;
                exa exaVar = xjvVar.e;
                kxi kxiVar = xjvVar.c;
                dxr dxrVar = xjvVar.f;
                spdVar.getClass();
                c1 c1Var = mjvVar.b;
                String str2 = c1Var.a;
                int i4 = c1Var.c;
                bjv bjvVar = mjvVar.c;
                iiv iivVar = new iiv(str2, i4, bjvVar);
                if (xjvVar.g) {
                    xjvVar.a.b(iivVar);
                } else {
                    xjvVar.d.a(ovk.p(iivVar, ejv.b));
                }
                if (bjvVar instanceof xiv) {
                    lt ltVar = ((xiv) bjvVar).d;
                    u5l z2 = hld.z(exaVar, irf.E(bjvVar, spdVar), c1Var.b);
                    String str3 = "mobile-wave_screen-wheel_item_album_" + ltVar.a + "-default";
                    dxrVar.getClass();
                    ((itu) dxrVar.b).invoke();
                    g0l.g((g0l) dxrVar.a, ltVar.a, hcr.a, kxiVar, z2, str3, null, null, null, null, null, 2016);
                } else if (bjvVar instanceof yiv) {
                    yiv yivVar = (yiv) bjvVar;
                    String str4 = yivVar.g.a;
                    thj I4 = y7g.I(spdVar.a, spdVar.b, yivVar.e);
                    int i5 = c1Var.b;
                    str4.getClass();
                    cvo cvoVar2 = (cvo) exaVar.b.getValue();
                    cvoVar2.getClass();
                    xmb xmbVar = exaVar.c;
                    nab nabVar = exaVar.a;
                    String str5 = (String) exaVar.e.get(I4.b);
                    if (str5 == null) {
                        str5 = "";
                    }
                    xmbVar.h(str4, nabVar, null, cvoVar2, i5, str5, I4, null, "");
                    str4.getClass();
                    w1g.y(context, str4, true);
                } else if (bjvVar instanceof ajv) {
                    dxrVar.e(((ajv) bjvVar).d.a.b, kxiVar, hld.z(exaVar, irf.E(bjvVar, spdVar), c1Var.b), hiv.a);
                } else {
                    if (!(bjvVar instanceof ziv)) {
                        b6e.s();
                        return null;
                    }
                    hld.D(exaVar, wjb.MyWaweSettingsScreen, new thj(pkb.Link, ((ziv) bjvVar).b, spdVar.a, spdVar.b, ""), c1Var.b);
                    t tVar2 = context instanceof t ? (t) context : null;
                    if (tVar2 == null || (supportFragmentManager = tVar2.getSupportFragmentManager()) == null) {
                        dfi.r("context as? FragmentActivity", "WheelActionsImpl");
                    } else {
                        r3s r3sVar = (r3s) apoVar.c;
                        Boolean bool = Boolean.TRUE;
                        r3sVar.invoke(bool);
                        tkf tkfVar = new tkf();
                        tkfVar.setArguments(cxb.K(new Pair("force_dark_theme", bool)));
                        x7f.B(tkfVar, supportFragmentManager, "NewRupSettingsDialog");
                    }
                }
                return Unit.a;
            case 6:
                z3w z3wVar = (z3w) this.b;
                UUID uuid = (UUID) this.c;
                hrc hrcVar = (hrc) this.d;
                Context context2 = (Context) this.e;
                String uuid2 = uuid.toString();
                t4w e2 = z3wVar.c.e(uuid2);
                if (e2 == null || e2.b.a()) {
                    xq0.q("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    htm htmVar = z3wVar.b;
                    synchronized (htmVar.k) {
                        try {
                            jsg.j().k(htm.l, "Moving WorkSpec (" + uuid2 + ") to the foreground");
                            n5w n5wVar = (n5w) htmVar.g.remove(uuid2);
                            if (n5wVar != null) {
                                if (htmVar.a == null) {
                                    PowerManager.WakeLock a2 = lku.a(htmVar.b);
                                    htmVar.a = a2;
                                    a2.acquire();
                                }
                                htmVar.f.put(uuid2, n5wVar);
                                etn.h0(htmVar.b, fzr.b(htmVar.b, bzf.A(n5wVar.a), hrcVar));
                            }
                        } finally {
                        }
                    }
                    a4w A = bzf.A(e2);
                    String str6 = fzr.j;
                    Intent intent = new Intent(context2, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", hrcVar.a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hrcVar.b);
                    intent.putExtra("KEY_NOTIFICATION", hrcVar.c);
                    intent.putExtra("KEY_WORKSPEC_ID", A.a);
                    intent.putExtra("KEY_GENERATION", A.b);
                    context2.startService(intent);
                }
                return null;
            case 7:
                h0 h0Var = (h0) this.b;
                Function1 function1 = (Function1) this.c;
                com.yandex.passport.internal.report.reporters.h0 h0Var2 = (com.yandex.passport.internal.report.reporters.h0) this.d;
                aqi aqiVar = (aqi) this.e;
                if (((o1) aqiVar.getValue()) == o1.b || !h0Var.e) {
                    function1.invoke(r0.d);
                    f fVar = h0Var.a;
                    f fVar2 = h0Var.b;
                    List list = h0Var.f;
                    ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((n) it.next()).a);
                    }
                    ((i0) h0Var2).u(fVar, fVar2, arrayList2);
                } else if (((o1) aqiVar.getValue()) == o1.a) {
                    function1.invoke(r0.c);
                    f fVar3 = h0Var.a;
                    f fVar4 = h0Var.b;
                    List list2 = h0Var.f;
                    ArrayList arrayList3 = new ArrayList(v75.o(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((n) it2.next()).a);
                    }
                    ((i0) h0Var2).v(fVar3, fVar4, arrayList3);
                }
                return Unit.a;
            case 8:
                return (d) ((b) this.b).d.invoke((s) this.c, (t0a) this.d, (com.yandex.plus.bdui.flex.action.b) this.e);
            case 9:
                return new c((com.yandex.plus.bdui.flex.utils.b) this.b, (ArrayList) this.c, (o) this.d, (com.yandex.plus.log.api.b) this.e);
            case 10:
                m mVar = (m) this.b;
                o oVar = (o) this.c;
                l lVar = (l) this.d;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
                com.yandex.plus.log.api.b bVar = lVar.i;
                p pVar = new p(mVar, oVar, bVar);
                h hVar = new h(mVar, oVar, linkedHashMap, bVar);
                com.yandex.plus.log.api.b bVar2 = lVar.i;
                mVar.getClass();
                bVar2.getClass();
                j jVar = new j();
                jVar.a = mVar;
                jVar.b = oVar;
                jVar.c = pVar;
                jVar.d = hVar;
                jVar.e = bVar2;
                return new com.yandex.plus.bdui.plus.content.controller.j(lVar, jVar);
            case 11:
                q qVar = (q) this.b;
                x97.y(qVar.h, null, null, new ocu(qVar, (com.yandex.plus.bdui.action.h) this.c, (com.yandex.plus.bdui.content.d) this.d, (com.yandex.plus.bdui.flex.ui.t) this.e, (Continuation) null, 24), 3);
                return Unit.a;
            case 12:
                return new a((s) this.b, (Function0) this.c, (List) this.d, (com.yandex.plus.log.api.b) this.e);
            default:
                com.yandex.plus.home.t tVar3 = (com.yandex.plus.home.t) this.b;
                com.yandex.plus.home.plaque.plugin.internal.di.d dVar = (com.yandex.plus.home.plaque.plugin.internal.di.d) this.c;
                com.yandex.plus.bdui.flex.ui.s sVar = (com.yandex.plus.bdui.flex.ui.s) this.d;
                com.yandex.plus.home.plaque.plugin.internal.di.c cVar = (com.yandex.plus.home.plaque.plugin.internal.di.c) this.e;
                com.yandex.plus.home.internal.di.p pVar2 = tVar3.e;
                dp0 b = pVar2.b();
                u uVar = tVar3.b;
                com.yandex.plus.core.graphql.target.d dVar2 = (com.yandex.plus.core.graphql.target.d) tVar3.f.p.getValue();
                List list3 = dVar.b;
                ArrayList arrayList4 = new ArrayList(v75.o(list3, 10));
                Iterator it3 = list3.iterator();
                if (it3.hasNext()) {
                    throw hrg.j(it3);
                }
                com.yandex.plus.core.imageloader.b bVar3 = uVar.e;
                com.yandex.plus.core.dispatcher.b bVar4 = uVar.w;
                Context context3 = uVar.a;
                ((com.yandex.plus.core.dispatcher.a) bVar4).getClass();
                mn7 mn7Var = com.yandex.plus.core.dispatcher.a.e;
                return new g(b, dVar2, arrayList4, sVar, bVar3, new com.yandex.plus.home.plaque.plugin.internal.defaults.c(context3, cVar.b(), mn7Var), new k(tVar3, i), new k(tVar3, i3), new com.yandex.plus.home.plaque.plugin.internal.di.b(tVar3, cVar, continuation2, i2), context3.getResources().getDisplayMetrics().densityDpi, new k(tVar3, 11), new k(tVar3, 12), new k(tVar3, 13), (com.yandex.plus.home.core.network.d) pVar2.p.getValue(), cVar.b(), tVar3.i, mn7Var);
        }
    }

    public /* synthetic */ h0l(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
