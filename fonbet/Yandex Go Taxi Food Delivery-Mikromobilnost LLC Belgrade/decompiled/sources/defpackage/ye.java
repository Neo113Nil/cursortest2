package defpackage;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import androidx.compose.animation.core.e;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.go.superapp.discovery.map.impl.domain.entities.SuperAppDiscoveryMapOverlayUiState;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.y;
import com.yandex.go.taxi.order.details.v2.domain.a;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.io.File;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.care.ui.n;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$ModalType;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$RideOpenReason;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.favorites.rides.delete_modal.b;
import ru.yandex.taxi.favorites.rides.save_modal.dto.ResponseState;
import ru.yandex.taxi.logistics.care.impl.router.f;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticSource;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticType;
import ru.yandex.taxi.masstransit.detailedroute.router.c;
import ru.yandex.taxi.masstransit.overlay.onmap.i;
import ru.yandex.taxi.masstransit.stoproute.interactor.m;
import ru.yandex.taxi.masstransit.stoproute.interactor.o;
import ru.yandex.taxi.masstransit.stoproute.interactor.p;
import ru.yandex.taxi.masstransit.threads.ThreadsCardMode;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.settings.main.NativeMenuState;
import ru.yandex.taxi.summary.requirements.list.interactors.d;

/* loaded from: classes12.dex */
public final class ye implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public ye(tls tlsVar, nvi0 nvi0Var, oz40 oz40Var) {
        this.a = 10;
        this.b = tlsVar;
        this.c = nvi0Var;
        this.w = oz40Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x063b, code lost:
    
        if (r4.intValue() != r0) goto L258;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v57, types: [T, kotlinx.coroutines.flow.r0, pz40] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        kf70 kf70Var;
        Object value;
        urh urhVar;
        Object value2;
        urh urhVar2;
        Object obj6;
        g4u0 g4u0Var;
        int i = 18;
        int i2 = 11;
        boolean z = true;
        b580 b580Var = null;
        b580Var = null;
        b580Var = null;
        b580Var = null;
        switch (this.a) {
            case 0:
                cf cfVar = (cf) obj;
                a aVar = (a) this.c;
                if (cfVar instanceof af) {
                    if (aVar.c == null) {
                        de deVar = (de) aVar.b.get();
                        aVar.c = deVar;
                        ((tls) this.b).invoke(deVar);
                    }
                } else {
                    if (!(cfVar instanceof bf)) {
                        w511.b();
                        return null;
                    }
                    de deVar2 = aVar.c;
                    if (deVar2 != null) {
                        ((tls) this.w).invoke(deVar2);
                    }
                    aVar.c = null;
                }
                return zy11.a;
            case 1:
                w8v w8vVar = (w8v) this.c;
                ExecutorService executorService = (ExecutorService) this.w;
                a0 a0Var = new a0(25, (tls) this.b);
                File createTempFile = File.createTempFile("IMG_", ".jpg");
                w8vVar.O(new r1s(createTempFile, (OutputStream) null, (s8v) null), executorService, new md6(i, a0Var, createTempFile));
                return zy11.a;
            case 2:
                tls tlsVar = (tls) this.b;
                oz40 oz40Var = (oz40) this.w;
                if (((Boolean) oz40Var.getValue()).booleanValue()) {
                    oz40Var.setValue(Boolean.FALSE);
                } else {
                    rs8 rs8Var = (rs8) this.c;
                    if (rs8Var instanceof ms8) {
                        oz40Var.setValue(Boolean.TRUE);
                        tlsVar.invoke(vr8.a);
                    } else {
                        if (!(rs8Var instanceof os8)) {
                            w511.b();
                            return null;
                        }
                        tlsVar.invoke(ur8.a);
                    }
                }
                return zy11.a;
            case 3:
                dpb dpbVar = dpb.a;
                mt8 mt8Var = (mt8) obj;
                zy11 zy11Var = zy11.a;
                ajs ajsVar = (ajs) this.b;
                jt8 jt8Var = (jt8) this.c;
                if (mt8Var instanceof lt8) {
                    jt8Var.getClass();
                    lt8 lt8Var = (lt8) mt8Var;
                    n nVar = lt8Var.a;
                    qhb0 qhb0Var = lt8Var.b;
                    cx7 cx7Var = new cx7(i, (vt8) this.w);
                    ComposeView composeView = new ComposeView(jt8Var.c, null, 0, 6, null);
                    composeView.setBackground(new ColorDrawable(ModalContentViewContainer.BASE_SHADOW_COLOR));
                    composeView.setClickable(true);
                    composeView.setContent(new androidx.compose.runtime.internal.a(-1092638437, new it8(jt8Var, qhb0Var, composeView, nVar, cx7Var, 0), true));
                    qnh qnhVar = (qnh) ajsVar;
                    ((f) qnhVar.a).j(dpbVar);
                    f fVar = (f) qnhVar.a;
                    fVar.D(new ej1(7, fVar.Q, fVar.P, composeView), zy11Var, sy60.Q2);
                } else {
                    if (!jl40.l(mt8Var, kt8.a)) {
                        w511.b();
                        return null;
                    }
                    jt8Var.getClass();
                    ((f) ((qnh) ajsVar).a).j(dpbVar);
                }
                return zy11Var;
            case 4:
                zae zaeVar = (zae) obj;
                if (jl40.l(zaeVar, xae.a)) {
                    yur.b((yur) this.c);
                } else {
                    if (!jl40.l(zaeVar, yae.a)) {
                        w511.b();
                        return null;
                    }
                    ((yd00) this.b).a((Intent) this.w);
                }
                return zy11.a;
            case 5:
                Pair pair = (Pair) obj;
                zy11 zy11Var2 = zy11.a;
                d dVar = (d) this.b;
                h3y h3yVar = dVar.a;
                g580 g580Var = dVar.c;
                String str = (String) this.w;
                pex0 pex0Var = (pex0) pair.getFirst();
                Integer num = (Integer) pair.getSecond();
                if (num == null || !jl40.l(pex0Var.b, (String) this.c)) {
                    ((mwb) ((lwb) h3yVar.get())).a.a.l(null);
                    x8 x8Var = (x8) g580Var;
                    x8Var.d(str);
                    x8Var.a();
                } else {
                    Iterator it = pex0Var.f().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (jl40.l(((lmw0) obj2).getName(), str)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    if (((lmw0) obj2) == null) {
                        ((mwb) ((lwb) h3yVar.get())).a.a.l(null);
                        x8 x8Var2 = (x8) g580Var;
                        x8Var2.d(str);
                        x8Var2.a();
                    } else {
                        int intValue = num.intValue();
                        Iterator it2 = ((x8) g580Var).d.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj3 = it2.next();
                                if (jl40.l(((b580) obj3).a, str)) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        b580 b580Var2 = (b580) obj3;
                        if (b580Var2 != null) {
                            rf70 b = b580Var2.b();
                            of70 of70Var = b instanceof of70 ? (of70) b : null;
                            Integer valueOf = of70Var != null ? Integer.valueOf(of70Var.a) : null;
                            if (valueOf != null) {
                                break;
                            }
                        }
                        int intValue2 = num.intValue();
                        pex0 m = ((k) dVar.b).m();
                        if (m != null) {
                            Iterator it3 = m.f().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj4 = it3.next();
                                    if (jl40.l(((lmw0) obj4).getName(), str)) {
                                    }
                                } else {
                                    obj4 = null;
                                }
                            }
                            jmw0 jmw0Var = obj4 instanceof jmw0 ? (jmw0) obj4 : null;
                            if (jmw0Var != null) {
                                Iterator it4 = jmw0Var.s().c.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        obj5 = it4.next();
                                        kf70 kf70Var2 = ((ejj0) obj5).l;
                                        if (kf70Var2 != null) {
                                            if70 if70Var = kf70Var2 instanceof if70 ? (if70) kf70Var2 : null;
                                            Integer valueOf2 = if70Var != null ? Integer.valueOf(if70Var.a) : null;
                                            if (valueOf2 != null && valueOf2.intValue() == intValue2) {
                                            }
                                        }
                                    } else {
                                        obj5 = null;
                                    }
                                }
                                ejj0 ejj0Var = (ejj0) obj5;
                                if (ejj0Var != null && (kf70Var = ejj0Var.l) != null) {
                                    b580Var = new b580(jmw0Var.getName(), "select", jmw0Var.getLabel(), q5z.h0(kf70Var), Collections.singletonList(ejj0Var.a), 32);
                                }
                            }
                        }
                        if (b580Var != null) {
                            x8 x8Var3 = (x8) g580Var;
                            x8Var3.c(b580Var, true);
                            x8Var3.a();
                        }
                    }
                }
                return zy11Var2;
            case 6:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ListItemInputComponent listItemInputComponent = (ListItemInputComponent) this.c;
                Editable text = listItemInputComponent.getText();
                Object[] objArr = text != null && text.length() == 0;
                if (!booleanValue && objArr != false) {
                    z = false;
                }
                listItemInputComponent.setHint(!z ? (String) this.b : "");
                listItemInputComponent.setTitle(z ? (String) this.w : "");
                return zy11.a;
            case 7:
                ResponseState responseState = (ResponseState) obj;
                b bVar = (b) this.w;
                ru.yandex.taxi.favorites.rides.delete_modal.domain.a aVar2 = (ru.yandex.taxi.favorites.rides.delete_modal.domain.a) this.c;
                r0 r0Var = aVar2.d;
                int i3 = responseState == null ? -1 : orh.a[responseState.ordinal()];
                if (i3 != -1) {
                    if (i3 == 1) {
                        do {
                            value = r0Var.getValue();
                            urhVar = (urh) value;
                        } while (!r0Var.k(value, urhVar != null ? new urh(urhVar.a, urhVar.b, trh.a(urhVar.c, false, false, 11), trh.a(urhVar.d, false, true, 3)) : null));
                    } else if (i3 == 2) {
                        aip aipVar = aVar2.c;
                        String str2 = (String) this.b;
                        aipVar.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("id", str2);
                        aipVar.a.a("Favorites.Trip.Deleted", hashMap, 1, new HashMap());
                        bVar.a();
                    } else {
                        if (i3 != 3) {
                            w511.b();
                            return null;
                        }
                        bVar.b();
                        do {
                            value2 = r0Var.getValue();
                            urhVar2 = (urh) value2;
                        } while (!r0Var.k(value2, urhVar2 != null ? new urh(urhVar2.a, urhVar2.b, trh.a(urhVar2.c, true, false, 11), trh.a(urhVar2.d, true, false, 3)) : null));
                    }
                }
                return zy11.a;
            case 8:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                pz40 pz40Var = (pz40) ref$ObjectRef.element;
                if (pz40Var != null) {
                    ((r0) pz40Var).l(obj);
                } else {
                    tse tseVar = (tse) this.b;
                    eyc eycVar = (eyc) this.w;
                    ?? c = bvf0.c(obj);
                    ((fyc) eycVar).T(new Result(new gci0(c, kotlinx.coroutines.a.n(tseVar.getCoroutineContext()))));
                    ref$ObjectRef.element = c;
                }
                return zy11.a;
            case 9:
                zy11 zy11Var3 = zy11.a;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.c;
                Object obj7 = ref$ObjectRef2.element;
                if (obj7 != null && !((Boolean) ((wls) this.b).invoke(obj7, obj)).booleanValue()) {
                    return zy11Var3;
                }
                ref$ObjectRef2.element = obj;
                Object emit = ((vpr) this.w).emit(obj, continuation);
                return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11Var3;
            case 10:
                oz40 oz40Var2 = (oz40) this.w;
                ywy ywyVar = (ywy) obj;
                if (jl40.l(ywyVar, vwy.a)) {
                    ((tls) this.b).invoke(new xcu((nvi0) this.c));
                } else if (jl40.l(ywyVar, wwy.a)) {
                    oz40Var2.setValue(null);
                } else {
                    if (!(ywyVar instanceof xwy)) {
                        w511.b();
                        return null;
                    }
                    oz40Var2.setValue(((xwy) ywyVar).a);
                }
                return zy11.a;
            case 11:
                oz40 oz40Var3 = (oz40) this.c;
                oz40Var3.setValue(new zgq0((Integer) obj, (Integer) ((zgq0) oz40Var3.getValue()).b));
                return e.c(1.0f, 0.0f, (jj2) this.b, new rq5((tx40) this.w, 3), continuation, 4);
            case 12:
                if (((Boolean) obj).booleanValue()) {
                    sls slsVar = (sls) this.c;
                    if (slsVar != null) {
                        slsVar.invoke();
                    }
                } else {
                    sls slsVar2 = (sls) this.b;
                    if (slsVar2 != null) {
                        slsVar2.invoke();
                    }
                    sls slsVar3 = (sls) ((oz40) this.w).getValue();
                    if (slsVar3 != null) {
                        slsVar3.invoke();
                    }
                }
                return zy11.a;
            case 13:
                uz20 uz20Var = (uz20) obj;
                oz40 oz40Var4 = (oz40) this.b;
                rz20 rz20Var = (rz20) this.c;
                if (jl40.l(uz20Var, tz20.a)) {
                    sz40 sz40Var = rz20Var.a;
                    Boolean bool = Boolean.TRUE;
                    sz40Var.b(bool);
                    oz40Var4.setValue(bool);
                } else {
                    if (!(uz20Var instanceof sz20)) {
                        w511.b();
                        return null;
                    }
                    ((oz40) this.w).setValue(((sz20) uz20Var).a);
                    sz40 sz40Var2 = rz20Var.a;
                    Boolean bool2 = Boolean.FALSE;
                    sz40Var2.b(bool2);
                    oz40Var4.setValue(bool2);
                }
                return zy11.a;
            case 14:
                kf30 kf30Var = (kf30) this.w;
                jf30 jf30Var = (jf30) obj;
                c cVar = (c) this.c;
                cVar.W = jf30Var;
                pg30 pg30Var = cVar.T;
                if (jl40.l(jf30Var, gf30.a)) {
                    su30 su30Var = (su30) this.b;
                    qg30 qg30Var = new qg30(kf30Var, cVar);
                    if (cVar.R.a.isEnabled()) {
                        MtDetailedRouteAnalyticSource mtDetailedRouteAnalyticSource = ((ng30) cVar.n()).d;
                        MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType = ((ng30) cVar.n()).i;
                        lm30 lm30Var = ((ng30) cVar.n()).h;
                        cVar.A((m950) cVar.J.get(), new sg30(su30Var, mtDetailedRouteAnalyticSource, mtDetailedRouteAnalyticType, lm30Var), qg30Var);
                        cVar.Q((int) (ofp0.c / 2.0f));
                    } else {
                        cVar.A((m950) cVar.I.get(), new yf30(su30Var, ((ng30) cVar.n()).d, ((ng30) cVar.n()).i), qg30Var);
                        cVar.Q((int) (ofp0.c / 2.5f));
                    }
                } else if (jf30Var instanceof hf30) {
                    hf30 hf30Var = (hf30) jf30Var;
                    cVar.A((m950) cVar.H.get(), new w540(hf30Var.a, pg30Var, cVar.V), new cb0(i2, hf30Var, kf30Var));
                } else {
                    if (!(jf30Var instanceof if30)) {
                        w511.b();
                        return null;
                    }
                    bzy0 bzy0Var = ((if30) jf30Var).a;
                    ThreadsCardMode threadsCardMode = ThreadsCardMode.COLLAPSED;
                    MtDetailedRouteAnalyticSource mtDetailedRouteAnalyticSource2 = ((ng30) cVar.n()).d;
                    cVar.A((m950) cVar.L.get(), new o640(bzy0Var, threadsCardMode, pg30Var, mtDetailedRouteAnalyticSource2 != null ? mtDetailedRouteAnalyticSource2.getValue() : null), new rg30(r8, kf30Var));
                }
                return zy11.a;
            case 15:
                kp30 kp30Var = (kp30) this.c;
                qp30 qp30Var = new qp30((y830) obj);
                com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_auth_onboarding.b bVar2 = (com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_auth_onboarding.b) this.b;
                op30 op30Var = (op30) this.w;
                kp30Var.getClass();
                kp30.a(qp30Var, bVar2, op30Var);
                zy11 zy11Var4 = zy11.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return zy11Var4;
            case 16:
                i iVar = ((p) this.c).g;
                tse tseVar2 = (tse) this.b;
                tpr tprVar = (tpr) this.w;
                iVar.b(tseVar2, new m(tprVar), new o(tprVar));
                return zy11.a;
            case 17:
                zy11 zy11Var5 = zy11.a;
                com.yandex.go.taxi.order.promotions.router.c cVar2 = (com.yandex.go.taxi.order.promotions.router.c) this.c;
                a4y0 a4y0Var = (a4y0) this.w;
                Iterator it5 = ((List) obj).iterator();
                while (true) {
                    if (it5.hasNext()) {
                        obj6 = it5.next();
                        if (jl40.l(((o2y0) obj6).b().a, a4y0Var.a)) {
                        }
                    } else {
                        obj6 = null;
                    }
                }
                o2y0 o2y0Var = (o2y0) obj6;
                if (o2y0Var == null) {
                    cVar2.R();
                } else {
                    m950 m950Var = (m950) cVar2.F.get();
                    s2y0 s2y0Var = (s2y0) this.b;
                    cVar2.A(m950Var, new q5y0(null, false, s2y0Var, new usc(s2y0Var.a, CommunicationModalAnalyticsData$ModalType.SHARE_ORDER, o2y0Var.b().a, CommunicationModalAnalyticsData$RideOpenReason.AUTOMATIC)), new l580(cVar2, o2y0Var));
                }
                return zy11Var5;
            case 18:
                ic21 ic21Var = (ic21) obj;
                okb0 okb0Var = (okb0) this.w;
                String str3 = (String) this.b;
                ru.yandex.taxi.logistics.sdk.photocomments.domain.b bVar3 = (ru.yandex.taxi.logistics.sdk.photocomments.domain.b) this.c;
                if (ic21Var instanceof gc21) {
                    gc21 gc21Var = (gc21) ic21Var;
                    bVar3.a.b(new jkb0(str3, gc21Var.a, gc21Var.b, bVar3.d.b(str3)), okb0Var);
                } else if (ic21Var instanceof fc21) {
                    bVar3.a.b(new hkb0(str3, okb0Var, bVar3.d.b(str3)), okb0Var);
                } else {
                    if (!(ic21Var instanceof ec21)) {
                        w511.b();
                        return null;
                    }
                    ec21 ec21Var = (ec21) ic21Var;
                    bVar3.a.b(new ikb0(str3, bVar3.d.b(str3), ec21Var.a, ec21Var.b), okb0Var);
                }
                return zy11.a;
            case 19:
                c3d0 c3d0Var = (c3d0) obj;
                if (jl40.l(c3d0Var, a3d0.a)) {
                    fva0.b(((ru.yandex.taxi.plus.sdk.modal.b) this.c).k.a, "PlusWebHome", PerformanceAnalytics$Type.Loading, null, 4);
                    ru.yandex.taxi.plus.sdk.modal.b bVar4 = (ru.yandex.taxi.plus.sdk.modal.b) this.c;
                    a4d0 a4d0Var = bVar4.f;
                    znp0 znp0Var = bVar4.g.a.a;
                    if (znp0Var != null && (g4u0Var = znp0Var.c) != null) {
                        String str4 = g4u0Var.f;
                    }
                    String b2 = ((ru.yandex.taxi.plus.sdk.modal.b) this.c).h.b();
                    boolean z2 = ((b2 == null || evu0.J(b2)) ? 1 : 0) ^ 1;
                    k9y0 k9y0Var = a4d0Var.b;
                    if (k9y0Var != null) {
                        String str5 = a4d0Var.a.b;
                        ru.yandex.taxi.analytics.i d = ((j) k9y0Var.a).d("CashbackCard.Shown");
                        d.a.put("open_reason", str5);
                        d.m();
                        ru.yandex.taxi.analytics.i d2 = ((j) k9y0Var.a).d("CashbackCard.Authorized");
                        d2.a.put("open_reason", str5);
                        d2.g("has_credit_card", z2);
                        d2.m();
                    }
                } else if (jl40.l(c3d0Var, a3d0.c)) {
                    Runnable runnable = ((ru.yandex.taxi.plus.sdk.modal.b) this.c).j;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else if (jl40.l(c3d0Var, a3d0.b)) {
                    ((ru.yandex.taxi.plus.sdk.modal.b) this.c).m.a.remove((ru.yandex.taxi.plus.sdk.modal.b) this.b);
                    Runnable runnable2 = (Runnable) this.w;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    pzt0 pzt0Var = ((ru.yandex.taxi.plus.sdk.modal.b) this.c).p;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                } else if (!(c3d0Var instanceof b3d0)) {
                    w511.b();
                    return null;
                }
                return zy11.a;
            case 20:
                if (((Boolean) obj).booleanValue()) {
                    ((sls) this.c).invoke();
                } else if (((x0s0) this.b).c) {
                    ((sls) this.w).invoke();
                }
                return zy11.a;
            case 21:
                SuperAppDiscoveryMapOverlayUiState superAppDiscoveryMapOverlayUiState = (SuperAppDiscoveryMapOverlayUiState) obj;
                if (((y) this.c).i) {
                    if (superAppDiscoveryMapOverlayUiState == SuperAppDiscoveryMapOverlayUiState.SHOWED) {
                        ((sls) this.b).invoke();
                    } else {
                        ((sls) this.w).invoke();
                    }
                }
                return zy11.a;
            case 22:
                b1w0 b1w0Var = (b1w0) obj;
                zy11 zy11Var6 = zy11.a;
                if (b1w0Var != null) {
                    com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.domain.e eVar = ((y0w0) this.c).C;
                    z0w0 z0w0Var = eVar.b;
                    if (z0w0Var.c) {
                        z0w0Var.c = false;
                        if (eVar.c.g.a.getValue() != NativeMenuState.OPENED && !((Boolean) ((v2w0) eVar.e).a.getValue()).booleanValue() && !((c1w0) z0w0Var.e.getValue()).c) {
                            ((x0w0) this.w).v9(b1w0Var.b, b1w0Var.a);
                        }
                    }
                    bvf0.j((tse) this.b, null);
                } else if (b1w0Var != null) {
                    w511.b();
                    return null;
                }
                return zy11Var6;
            default:
                r40 r40Var = (r40) obj;
                if (r40Var.c == null || r40Var.a != -1) {
                    ((sls) this.c).invoke();
                } else {
                    ((sls) this.b).invoke();
                }
                ((ru.yandex.taxi.superapp.m) this.w).h.set(false);
                return zy11.a;
        }
    }

    public /* synthetic */ ye(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.w = obj3;
    }

    public ye(w8v w8vVar, ExecutorService executorService, tls tlsVar) {
        this.a = 1;
        this.c = w8vVar;
        this.w = executorService;
        this.b = tlsVar;
    }
}
