package ru.yandex.taxi.masstransit.ui.route.modal.collapsed;

import android.content.Context;
import defpackage.ad5;
import defpackage.ag31;
import defpackage.b540;
import defpackage.b611;
import defpackage.b64;
import defpackage.c040;
import defpackage.cd30;
import defpackage.cta1;
import defpackage.dd30;
import defpackage.dj30;
import defpackage.e040;
import defpackage.ed30;
import defpackage.ezy;
import defpackage.fl10;
import defpackage.g610;
import defpackage.igl0;
import defpackage.jl40;
import defpackage.mb11;
import defpackage.me30;
import defpackage.nc30;
import defpackage.nq30;
import defpackage.nv20;
import defpackage.ny61;
import defpackage.ob31;
import defpackage.oq30;
import defpackage.pj40;
import defpackage.pq30;
import defpackage.pzt0;
import defpackage.qq30;
import defpackage.rq30;
import defpackage.s111;
import defpackage.sk91;
import defpackage.sq30;
import defpackage.su30;
import defpackage.sy00;
import defpackage.tj60;
import defpackage.tu30;
import defpackage.v011;
import defpackage.w511;
import defpackage.wtb1;
import defpackage.wu30;
import defpackage.xcv0;
import defpackage.yw30;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.address.repository.f;
import ru.yandex.taxi.masstransit.analytic.MtDetailRouteCardOpenReason;
import ru.yandex.taxi.masstransit.analytic.TransportVerticalAnalytics$TransportVerticalOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportVerticalAnalytics$TransportVerticalOriginV3;
import ru.yandex.taxi.masstransit.domain.h0;
import ru.yandex.taxi.masstransit.domain.y;
import ru.yandex.taxi.preorder.summary.selector.analytics.VerticalSelectorAnalytics$SelectionChangeReason;

/* loaded from: classes6.dex */
public final class d extends ad5 {
    public final ru.yandex.taxi.masstransit.holder.c A;
    public final yw30 B;
    public final sy00 C;
    public final dj30 D;
    public final f E;
    public final tu30 F;
    public final sq30 G;
    public final ag31 H;
    public final xcv0 I;
    public final nv20 J;
    public final y K;
    public final v011 L;
    public final s111 M;
    public final mb11 N;
    public final ru.yandex.taxi.masstransit.paymentcards.c O;
    public final com.yandex.go.payments.transport.domain.a P;
    public final b540 Q;
    public final tj60 R;
    public final zuj0 S;
    public final g610 T;
    public final Context U;
    public final wu30 V;
    public ob31 W;
    public pzt0 Z;
    public final fl10 x;
    public final nc30 y;
    public final h0 z;

    public d(fl10 fl10Var, nc30 nc30Var, h0 h0Var, ru.yandex.taxi.masstransit.holder.c cVar, yw30 yw30Var, sy00 sy00Var, dj30 dj30Var, f fVar, tu30 tu30Var, sq30 sq30Var, ag31 ag31Var, xcv0 xcv0Var, nv20 nv20Var, y yVar, v011 v011Var, s111 s111Var, mb11 mb11Var, ru.yandex.taxi.masstransit.paymentcards.c cVar2, com.yandex.go.payments.transport.domain.a aVar, b540 b540Var, tj60 tj60Var, zuj0 zuj0Var, g610 g610Var, Context context, wu30 wu30Var) {
        super(me30.class);
        this.x = fl10Var;
        this.y = nc30Var;
        this.z = h0Var;
        this.A = cVar;
        this.B = yw30Var;
        this.C = sy00Var;
        this.D = dj30Var;
        this.E = fVar;
        this.F = tu30Var;
        this.G = sq30Var;
        this.H = ag31Var;
        this.I = xcv0Var;
        this.J = nv20Var;
        this.K = yVar;
        this.L = v011Var;
        this.M = s111Var;
        this.N = mb11Var;
        this.O = cVar2;
        this.P = aVar;
        this.Q = b540Var;
        this.R = tj60Var;
        this.S = zuj0Var;
        this.T = g610Var;
        this.U = context;
        this.V = wu30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(d dVar, ContinuationImpl continuationImpl) {
        MtCollapsedRoutesPresenter$reportVerticalShown$1 mtCollapsedRoutesPresenter$reportVerticalShown$1;
        int i;
        igl0 igl0Var;
        Integer num;
        Integer num2;
        Object obj;
        TransportVerticalAnalytics$TransportVerticalOrigin transportVerticalAnalytics$TransportVerticalOrigin;
        pj40 pj40Var;
        TransportVerticalAnalytics$TransportVerticalOriginV3 transportVerticalAnalytics$TransportVerticalOriginV3;
        yw30 yw30Var = dVar.B;
        sq30 sq30Var = dVar.G;
        if (continuationImpl instanceof MtCollapsedRoutesPresenter$reportVerticalShown$1) {
            mtCollapsedRoutesPresenter$reportVerticalShown$1 = (MtCollapsedRoutesPresenter$reportVerticalShown$1) continuationImpl;
            int i2 = mtCollapsedRoutesPresenter$reportVerticalShown$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtCollapsedRoutesPresenter$reportVerticalShown$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtCollapsedRoutesPresenter$reportVerticalShown$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtCollapsedRoutesPresenter$reportVerticalShown$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    c cVar = new c(dVar.A.b());
                    mtCollapsedRoutesPresenter$reportVerticalShown$1.label = 1;
                    obj2 = e.A(cVar, mtCollapsedRoutesPresenter$reportVerticalShown$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                igl0Var = (igl0) obj2;
                zy11 zy11Var = zy11.a;
                if (igl0Var != null) {
                    return zy11Var;
                }
                ArrayList arrayList = igl0Var.a;
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    num = new Integer(((c040) it.next()).e.c.a);
                    while (it.hasNext()) {
                        Integer num3 = new Integer(((c040) it.next()).e.c.a);
                        if (num.compareTo(num3) > 0) {
                            num = num3;
                        }
                    }
                } else {
                    num = null;
                }
                int intValue = num != null ? num.intValue() : 0;
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    num2 = new Integer(((c040) it2.next()).e.c.a);
                    while (it2.hasNext()) {
                        Integer num4 = new Integer(((c040) it2.next()).e.c.a);
                        if (num2.compareTo(num4) < 0) {
                            num2 = num4;
                        }
                    }
                } else {
                    num2 = null;
                }
                int intValue2 = num2 != null ? num2.intValue() : 0;
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (((c040) obj).f) {
                        break;
                    }
                }
                c040 c040Var = (c040) obj;
                rq30 rq30Var = rq30.a;
                oq30 oq30Var = oq30.a;
                if (sq30Var == null) {
                    transportVerticalAnalytics$TransportVerticalOrigin = null;
                } else if (sq30Var instanceof nq30) {
                    transportVerticalAnalytics$TransportVerticalOrigin = TransportVerticalAnalytics$TransportVerticalOrigin.Deeplink;
                } else if (sq30Var.equals(oq30Var) || (sq30Var instanceof pq30)) {
                    transportVerticalAnalytics$TransportVerticalOrigin = TransportVerticalAnalytics$TransportVerticalOrigin.RouteInput;
                } else if (sq30Var.equals(rq30Var)) {
                    transportVerticalAnalytics$TransportVerticalOrigin = TransportVerticalAnalytics$TransportVerticalOrigin.SuperAppDiscoveryMap;
                } else {
                    if (!(sq30Var instanceof qq30)) {
                        w511.b();
                        return null;
                    }
                    transportVerticalAnalytics$TransportVerticalOrigin = jl40.l(((qq30) sq30Var).a, "hub") ? TransportVerticalAnalytics$TransportVerticalOrigin.Hub : TransportVerticalAnalytics$TransportVerticalOrigin.VerticalTap;
                }
                boolean z = sq30Var instanceof nq30;
                nq30 nq30Var = z ? (nq30) sq30Var : null;
                if (nq30Var == null || (pj40Var = nq30Var.a) == null) {
                    pj40Var = pj40.c;
                }
                mb11 mb11Var = yw30Var.b;
                if (jl40.l(sq30Var, oq30Var)) {
                    transportVerticalAnalytics$TransportVerticalOriginV3 = TransportVerticalAnalytics$TransportVerticalOriginV3.RouteInput;
                } else if (jl40.l(sq30Var, rq30Var)) {
                    transportVerticalAnalytics$TransportVerticalOriginV3 = TransportVerticalAnalytics$TransportVerticalOriginV3.SuperappDiscoveryMap;
                } else if (sq30Var instanceof qq30) {
                    transportVerticalAnalytics$TransportVerticalOriginV3 = TransportVerticalAnalytics$TransportVerticalOriginV3.VerticalTap;
                } else if (z) {
                    transportVerticalAnalytics$TransportVerticalOriginV3 = TransportVerticalAnalytics$TransportVerticalOriginV3.Deeplink;
                } else if (sq30Var instanceof pq30) {
                    transportVerticalAnalytics$TransportVerticalOriginV3 = TransportVerticalAnalytics$TransportVerticalOriginV3.StopModal;
                } else {
                    if (sq30Var != null) {
                        w511.b();
                        return null;
                    }
                    transportVerticalAnalytics$TransportVerticalOriginV3 = null;
                }
                boolean z2 = sq30Var instanceof qq30;
                qq30 qq30Var = z2 ? (qq30) sq30Var : null;
                String str = qq30Var != null ? qq30Var.a : null;
                mb11Var.getClass();
                HashMap hashMap = new HashMap();
                b64.B(intValue, hashMap, "min_time", intValue2, "max_time");
                TransportVerticalAnalytics$TransportVerticalOriginV3 transportVerticalAnalytics$TransportVerticalOriginV32 = transportVerticalAnalytics$TransportVerticalOriginV3;
                if (transportVerticalAnalytics$TransportVerticalOriginV32 != null) {
                    hashMap.put("origin", transportVerticalAnalytics$TransportVerticalOriginV32.getEventValue());
                }
                if (str != null) {
                    hashMap.put("previous_vertical", str);
                }
                mb11Var.a.a("TransportVertical.Shown", hashMap, 3, new HashMap());
                if (c040Var == null || transportVerticalAnalytics$TransportVerticalOrigin == null) {
                    return zy11Var;
                }
                mb11 mb11Var2 = dVar.N;
                Integer num5 = new Integer(intValue);
                Integer num6 = new Integer(intValue2);
                String str2 = z2 ? ((qq30) sq30Var).a : null;
                String str3 = pj40Var.a;
                String str4 = pj40Var.b;
                mb11Var2.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("origin", transportVerticalAnalytics$TransportVerticalOrigin.getEventValue());
                hashMap2.put("min_time", num5);
                hashMap2.put("max_time", num6);
                if (str2 != null) {
                    hashMap2.put("previous_vertical", str2);
                }
                if (str3 != null) {
                    hashMap2.put("utm_source", str3);
                }
                if (str4 != null) {
                    hashMap2.put("utm_medium", str4);
                }
                mb11Var2.a.a("TransportVertical.Shown", hashMap2, 2, new HashMap());
                dVar.C.a();
                su30 su30Var = c040Var.e;
                b611 b611Var = yw30Var.a;
                int i3 = su30Var.c.a;
                int i4 = su30Var.d.a;
                String str5 = su30Var.e;
                Boolean valueOf = Boolean.valueOf(sk91.a(su30Var));
                Integer valueOf2 = Integer.valueOf(i3);
                Integer valueOf3 = Integer.valueOf(i4);
                b611Var.getClass();
                HashMap hashMap3 = new HashMap();
                hashMap3.put("is_only_walking_route", valueOf);
                if (str5 != null) {
                    hashMap3.put("route_id", str5);
                }
                hashMap3.put(RemoteBioParameters.TIME, valueOf2);
                hashMap3.put("time_on_foot", valueOf3);
                b611Var.a.a("TransportRoute.Preselected", hashMap3, 1, new HashMap());
                return zy11Var;
            }
        }
        mtCollapsedRoutesPresenter$reportVerticalShown$1 = new MtCollapsedRoutesPresenter$reportVerticalShown$1(dVar, continuationImpl);
        Object obj22 = mtCollapsedRoutesPresenter$reportVerticalShown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtCollapsedRoutesPresenter$reportVerticalShown$1.label;
        if (i != 0) {
        }
        igl0Var = (igl0) obj22;
        zy11 zy11Var2 = zy11.a;
        if (igl0Var != null) {
        }
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.E.d = false;
    }

    public final void Lg(List list, e040 e040Var, su30 su30Var) {
        Object obj;
        ed30 ed30Var = cd30.a;
        if (!(e040Var instanceof igl0)) {
            if (e040Var instanceof ezy) {
                ((me30) Dg()).k2(cd30.b);
                return;
            } else {
                ((me30) Dg()).k2(ed30Var);
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof dd30) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((dd30) next).a, su30Var != null ? su30Var.e : null)) {
                obj = next;
                break;
            }
        }
        ed30 ed30Var2 = (dd30) obj;
        if (ed30Var2 != null) {
            ed30Var = ed30Var2;
        }
        ((me30) Dg()).k2(ed30Var);
    }

    public final void Mg(su30 su30Var, MtDetailRouteCardOpenReason mtDetailRouteCardOpenReason) {
        if (this.A.a.d() != null) {
            this.D.a(cta1.e(su30Var), wtb1.e(mtDetailRouteCardOpenReason), wtb1.f(mtDetailRouteCardOpenReason), wtb1.d(su30Var.a));
        }
    }

    public final void Ng(ob31 ob31Var, VerticalSelectorAnalytics$SelectionChangeReason verticalSelectorAnalytics$SelectionChangeReason) {
        String str = ob31Var.a;
        String str2 = ob31Var.b;
        ob31 ob31Var2 = this.W;
        String str3 = ob31Var2 != null ? ob31Var2.a : null;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = ob31Var2 != null ? ob31Var2.b : null;
        this.H.a(str, str2, str3, str4 != null ? str4 : "", verticalSelectorAnalytics$SelectionChangeReason);
    }
}
