package defpackage;

import android.net.Uri;
import android.text.TextWatcher;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.WorkManager;
import androidx.work.impl.WorkDatabase;
import com.yandex.go.design.compose.haptic.HapticEffect;
import com.yandex.go.navigator.experiment.NavigatorLanguageSettingAvailabilityExperiment;
import com.yandex.go.navigator.settings.voice_settings.c;
import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.f;
import com.yandex.mapkit.transport.masstransit.Route;
import com.ybsdk.feature.transfer.internal.screens.result.presentation.TransferResultFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.OkHttpClient;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.eatskit.WebContentView;
import ru.yandex.taxi.masstransit.TransportCardSourceScreen;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;
import ru.yandex.taxi.web.deeplink.l;
import ru.yandex.taxi.web.deeplink.m;

/* loaded from: classes14.dex */
public final /* synthetic */ class wp01 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ wp01(Ref$ObjectRef ref$ObjectRef, ph51 ph51Var, oh51 oh51Var) {
        this.a = 12;
        this.c = ref$ObjectRef;
        this.b = ph51Var;
        this.w = oh51Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0528  */
    @Override // defpackage.sls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        zy11 comment$lambda$13$lambda$12;
        wsj0 wsj0Var;
        ysj0 ysj0Var;
        boolean z;
        String str;
        ysj0 ysj0Var2;
        Object failure;
        cst0 init$lambda$0;
        boolean z2;
        boolean z3 = false;
        int i = 1;
        switch (this.a) {
            case 0:
                n70 n70Var = (n70) this.b;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.w;
                ((r961) n70Var.N).a.getEditText().removeTextChangedListener((TextWatcher) ref$ObjectRef.element);
                ((r961) n70Var.N).a.getEditText().removeTextChangedListener((TextWatcher) ref$ObjectRef2.element);
                ref$ObjectRef.element = null;
                ref$ObjectRef2.element = null;
                return zy11.a;
            case 1:
                comment$lambda$13$lambda$12 = TransferResultFragment.setComment$lambda$13$lambda$12((ca61) this.b, (String) this.c, (TransferResultFragment) this.w);
                return comment$lambda$13$lambda$12;
            case 2:
                ((s111) this.b).c((Uri) this.c, (TransportCardSourceScreen) this.w);
                return zy11.a;
            case 3:
                pzu pzuVar = (pzu) this.b;
                f fVar = (f) this.c;
                ad31 ad31Var = (ad31) this.w;
                vyu vyuVar = (vyu) pzuVar;
                List list = vyuVar.e;
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((z6l0) it.next()).b() instanceof xsj0) {
                                z3 = true;
                            }
                        }
                    }
                }
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        atj0 b = ((z6l0) it2.next()).b();
                        Route route = b instanceof wsj0 ? ((wsj0) b).a : null;
                        wsj0Var = route != null ? new wsj0(route) : null;
                        if (wsj0Var != null) {
                        }
                    } else {
                        wsj0Var = null;
                    }
                }
                Route route2 = wsj0Var != null ? wsj0Var.a : null;
                if (z3 || route2 == null) {
                    ad31Var.a.r(new wx11(25, vyuVar));
                } else {
                    lhq0 lhq0Var = fVar.j;
                    b bVar = fVar.p;
                    khq0 a = lhq0Var.a();
                    List list3 = a != null ? a.k : null;
                    if (list3 == null) {
                        list3 = EmptyList.a;
                    }
                    Iterator it3 = list3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            atj0 b2 = ((z6l0) it3.next()).b();
                            Route route3 = b2 instanceof ysj0 ? ((ysj0) b2).a : null;
                            ysj0Var = route3 != null ? new ysj0(route3) : null;
                            if (ysj0Var != null) {
                            }
                        } else {
                            ysj0Var = null;
                        }
                    }
                    Route route4 = ysj0Var != null ? ysj0Var.a : null;
                    if (route4 == null) {
                        Iterator it4 = list2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                atj0 b3 = ((z6l0) it4.next()).b();
                                Route route5 = b3 instanceof ysj0 ? ((ysj0) b3).a : null;
                                ysj0Var2 = route5 != null ? new ysj0(route5) : null;
                                if (ysj0Var2 != null) {
                                }
                            } else {
                                ysj0Var2 = null;
                            }
                        }
                        route4 = ysj0Var2 != null ? ysj0Var2.a : null;
                    }
                    String str2 = vyuVar.g;
                    if (str2 == null) {
                        str2 = a != null ? a.n : null;
                    }
                    c1v c1vVar = fVar.d.c;
                    h111 h111Var = c1vVar instanceof b1v ? ((b1v) c1vVar).a : c1vVar instanceof y0v ? ((y0v) c1vVar).a : null;
                    a1v a1vVar = c1vVar instanceof a1v ? (a1v) c1vVar : null;
                    m1a0 m1a0Var = a1vVar != null ? a1vVar.a : null;
                    boolean z4 = true;
                    fVar.y.a.l(new pr40(route2, route4 == null ? null : route4, bVar.c().a()));
                    List a2 = bVar.c().a();
                    if (route4 == null) {
                        route4 = null;
                    }
                    tpr a3 = fVar.k.a();
                    if (list3.isEmpty()) {
                        list3 = null;
                    }
                    if (list3 != null) {
                        list = list3;
                    }
                    List<z6l0> list4 = list;
                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                        for (z6l0 z6l0Var : list4) {
                            w6l0 w6l0Var = z6l0Var instanceof w6l0 ? (w6l0) z6l0Var : null;
                            if (w6l0Var == null || (str = w6l0Var.g) == null) {
                                z = z4;
                            } else {
                                z = z4;
                                if ((!evu0.J(str)) == z) {
                                    ArrayList e = rta1.e(list);
                                    kz6 kz6Var = vyuVar.d;
                                    kz6 a4 = kz6Var == null ? kz6.a(kz6Var, null, h111Var, m1a0Var, 79) : null;
                                    String str3 = vyuVar.c;
                                    dd31 dd31Var = ad31Var.a;
                                    dd31Var.r(new lf10(route4, route2, a2, a3, e, a4, str3, dd31Var, 5));
                                }
                            }
                            z4 = z;
                        }
                    }
                    if (str2 == null) {
                        Iterator it5 = list2.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                z6l0 z6l0Var2 = (z6l0) it5.next();
                                w6l0 w6l0Var2 = z6l0Var2 instanceof w6l0 ? (w6l0) z6l0Var2 : null;
                                str2 = w6l0Var2 != null ? w6l0Var2.g : null;
                                if (str2 != null) {
                                }
                            } else {
                                str2 = null;
                            }
                        }
                    }
                    list = rta1.g(str2, list);
                    ArrayList e2 = rta1.e(list);
                    kz6 kz6Var2 = vyuVar.d;
                    if (kz6Var2 == null) {
                    }
                    String str32 = vyuVar.c;
                    dd31 dd31Var2 = ad31Var.a;
                    dd31Var2.r(new lf10(route4, route2, a2, a3, e2, a4, str32, dd31Var2, 5));
                }
                return zy11.a;
            case 4:
                tls tlsVar = (tls) this.b;
                vj31 vj31Var = (vj31) this.c;
                fgd fgdVar = (fgd) this.w;
                tlsVar.invoke(new imq0(vj31Var));
                ua31 ua31Var = vj31Var.f;
                String str4 = ua31Var != null ? ua31Var.f : null;
                if (str4 != null) {
                    tlsVar.invoke(new hmq0(str4));
                }
                fgdVar.a(HapticEffect.ClickMedium);
                return zy11.a;
            case 5:
                c cVar = (c) this.b;
                NavigatorLanguageSettingAvailabilityExperiment.Voice voice = (NavigatorLanguageSettingAvailabilityExperiment.Voice) this.c;
                String str5 = (String) this.w;
                r6r0 r6r0Var = cVar.I;
                String str6 = voice.a;
                i650 i650Var = r6r0Var.a;
                HashMap u = n.u(i650Var);
                if (str6 != null) {
                    u.put("voice", str6);
                }
                i650Var.a.a("navigation.settings.language.voice.download", u, 1, new HashMap());
                bf50 bf50Var = cVar.B;
                bf50Var.c.r("navigator.language_assistance_key", str5);
                bf50Var.h.l(str5);
                cVar.H.d(str5, str6);
                return zy11.a;
            case 6:
                com.yandex.quark.webchat.auth.internal.b bVar2 = (com.yandex.quark.webchat.auth.internal.b) this.b;
                Uri uri = (Uri) this.c;
                List list5 = (List) this.w;
                try {
                    t4j0 t4j0Var = new t4j0();
                    t4j0Var.c();
                    t4j0Var.h(uri.toString());
                    bVar2.getClass();
                    if (!list5.isEmpty()) {
                        t4j0Var.a("Cookie", a.X(list5, Extension.SEMICOLON_SPACE, null, null, new r941(i), 30));
                    }
                    failure = ((nci0) ((OkHttpClient) bVar2.e.getValue()).newCall(new d5j0(t4j0Var))).execute();
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                return new Result(failure);
            case 7:
                init$lambda$0 = WebContentView.init$lambda$0((WebContentView) this.b, (fen) this.c, (ert0) this.w);
                return init$lambda$0;
            case 8:
                m mVar = (m) this.b;
                WebViewFromDeeplinkExperiment.a aVar = (WebViewFromDeeplinkExperiment.a) this.c;
                UiWebViewConfig uiWebViewConfig = (UiWebViewConfig) this.w;
                mVar.getClass();
                mVar.A(((scg) ((ff41) mVar.L.getValue())).b(), new dg41(uiWebViewConfig, new l(mVar, aVar), null, null, null, null, null, 252), new lq41(mVar, i));
                return zy11.a;
            case 9:
                oz40 oz40Var = (oz40) this.b;
                tls tlsVar2 = (tls) this.c;
                sls slsVar = (sls) this.w;
                if (((Boolean) oz40Var.getValue()).booleanValue()) {
                    tlsVar2.invoke(rz41.a);
                }
                slsVar.invoke();
                return zy11.a;
            case 10:
                y951 y951Var = (y951) this.b;
                UUID uuid = (UUID) this.c;
                ong ongVar = (ong) this.w;
                y951Var.getClass();
                String uuid2 = uuid.toString();
                hgz g = hgz.g();
                uuid.toString();
                Objects.toString(ongVar);
                g.getClass();
                WorkDatabase workDatabase = y951Var.a;
                workDatabase.v0();
                try {
                    fa51 d = workDatabase.X0().d(uuid2);
                    if (d == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (d.b == WorkInfo$State.RUNNING) {
                        w951 w951Var = new w951(uuid2, ongVar);
                        x951 W0 = workDatabase.W0();
                        androidx.room.util.a.b(W0.a, false, true, new e331(20, W0, w951Var));
                    } else {
                        hgz.g().getClass();
                    }
                    workDatabase.Q0();
                    return null;
                } catch (Throwable th2) {
                    try {
                        hgz.g().f(y951.c, "Error updating Worker progress", th2);
                        throw th2;
                    } finally {
                        workDatabase.B0();
                    }
                }
            case 11:
                androidx.work.impl.b bVar3 = (androidx.work.impl.b) this.b;
                String str7 = (String) this.c;
                rxa0 rxa0Var = (rxa0) this.w;
                ia51 X0 = bVar3.c.X0();
                List e3 = X0.e(str7);
                if (e3.size() > 1) {
                    w511.x("Can't apply UPDATE policy to the chains of work.");
                    return null;
                }
                da51 da51Var = (da51) a.R(e3);
                if (da51Var == null) {
                    l2o.a(new a951(bVar3, str7, ExistingWorkPolicy.KEEP, Collections.singletonList(rxa0Var), 0));
                } else {
                    String str8 = da51Var.a;
                    fa51 d2 = X0.d(str8);
                    if (d2 == null) {
                        ny61.r(unr0.p("WorkSpec with ", str8, ", that matches a name \"", str7, "\", wasn't found"));
                        return null;
                    }
                    if (!d2.c()) {
                        w511.x("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                        return null;
                    }
                    if (da51Var.b == WorkInfo$State.CANCELLED) {
                        androidx.room.util.a.b(X0.a, false, true, new brd(str8, 24));
                        l2o.a(new a951(bVar3, str7, ExistingWorkPolicy.KEEP, Collections.singletonList(rxa0Var), 0));
                    } else {
                        fa51 b4 = fa51.b(rxa0Var.b, da51Var.a, null, null, 0, 0L, 0, 0, 0L, 0, 33554430);
                        r6f0 r6f0Var = bVar3.f;
                        WorkDatabase workDatabase2 = bVar3.c;
                        u0e u0eVar = bVar3.b;
                        List list6 = bVar3.e;
                        Set set = rxa0Var.c;
                        String str9 = b4.a;
                        fa51 d3 = workDatabase2.X0().d(str9);
                        if (d3 == null) {
                            ny61.g(oyr.p("Worker with ", str9, " doesn't exist"));
                            return null;
                        }
                        if (d3.b.a()) {
                            WorkManager.UpdateResult updateResult = WorkManager.UpdateResult.NOT_APPLIED;
                        } else {
                            if (d3.c() ^ b4.c()) {
                                StringBuilder sb = new StringBuilder("Can't update ");
                                sb.append(d3.c() ? "Periodic" : "OneTime");
                                sb.append(" Worker to ");
                                throw new UnsupportedOperationException(oyr.t(sb, b4.c() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type."));
                            }
                            synchronized (r6f0Var.k) {
                                z2 = r6f0Var.c(str9) != null;
                            }
                            if (!z2) {
                                Iterator it6 = list6.iterator();
                                while (it6.hasNext()) {
                                    ((kom0) it6.next()).c(str9);
                                }
                            }
                            workDatabase2.P0(new gtg(5, new cg10(workDatabase2, d3, b4, list6, str9, set, z2)));
                            if (!z2) {
                                pom0.b(u0eVar, workDatabase2, list6);
                            }
                            WorkManager.UpdateResult updateResult2 = WorkManager.UpdateResult.NOT_APPLIED;
                        }
                    }
                }
                return zy11.a;
            case 12:
                Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) this.c;
                ph51 ph51Var = (ph51) this.b;
                oh51 oh51Var = (oh51) this.w;
                zva0 zva0Var = (zva0) ref$ObjectRef3.element;
                if (zva0Var != null) {
                    zva0Var.a();
                }
                ref$ObjectRef3.element = null;
                ph51Var.a.getSupportFragmentManager().r0(oh51Var);
                return zy11.a;
            default:
                lm51 lm51Var = (lm51) this.b;
                oep0 oep0Var = (oep0) this.c;
                w2d0 w2d0Var = (w2d0) this.w;
                lm51Var.d.b();
                ((pep0) oep0Var).f((m950) lm51Var.b.get(), new e0h(w2d0Var), hxx.a);
                return zy11.a;
        }
    }

    public /* synthetic */ wp01(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }
}
