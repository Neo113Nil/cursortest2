package ru.yandex.taxi.masstransit.detailedroute.ui.v2;

import android.net.Uri;
import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteButtonType;
import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteScreenStatus;
import com.yandex.mapkit.geometry.Point;
import defpackage.ah00;
import defpackage.azy0;
import defpackage.b3v0;
import defpackage.b611;
import defpackage.bf30;
import defpackage.bvu0;
import defpackage.bzy0;
import defpackage.ch30;
import defpackage.dh30;
import defpackage.ee01;
import defpackage.eh30;
import defpackage.es40;
import defpackage.evu0;
import defpackage.f611;
import defpackage.fh30;
import defpackage.fi6;
import defpackage.fj40;
import defpackage.fu30;
import defpackage.ge01;
import defpackage.gh00;
import defpackage.gh30;
import defpackage.h711;
import defpackage.hh30;
import defpackage.hj40;
import defpackage.hz30;
import defpackage.ib11;
import defpackage.ih30;
import defpackage.is30;
import defpackage.j4a;
import defpackage.jh30;
import defpackage.jm30;
import defpackage.js30;
import defpackage.jst;
import defpackage.kh30;
import defpackage.ks30;
import defpackage.lh30;
import defpackage.lm30;
import defpackage.ls30;
import defpackage.m950;
import defpackage.mh30;
import defpackage.nh30;
import defpackage.ny61;
import defpackage.of30;
import defpackage.oh30;
import defpackage.pf30;
import defpackage.ph30;
import defpackage.qf30;
import defpackage.qh30;
import defpackage.rh30;
import defpackage.s611;
import defpackage.sh30;
import defpackage.smw0;
import defpackage.su30;
import defpackage.sy60;
import defpackage.tcc;
import defpackage.th30;
import defpackage.tjv0;
import defpackage.tls;
import defpackage.tt2;
import defpackage.uh30;
import defpackage.uj30;
import defpackage.uk10;
import defpackage.ur30;
import defpackage.v4r0;
import defpackage.vh30;
import defpackage.w1u;
import defpackage.w211;
import defpackage.w511;
import defpackage.w6g0;
import defpackage.wh30;
import defpackage.wtb1;
import defpackage.xh30;
import defpackage.y110;
import defpackage.yw30;
import defpackage.zy11;
import defpackage.zyy0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.masstransit.TransportCardSourceScreen;
import ru.yandex.taxi.masstransit.analytic.MasstransitPurchaseAnalytics$PurchaseScenariosSource;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticSource;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardAppearanceState;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardTappedButtonV2;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$VehicleType;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public final class d {
    public final yw30 a;
    public final ls30 b;
    public final ah00 c;
    public final tt2 d;
    public final ru.yandex.taxi.masstransit.userlocation.a e;
    public final y110 f;
    public final uk10 g;
    public su30 h;
    public uj30 i;
    public o j;
    public MtDetailedRouteAnalyticSource k;
    public MtDetailedRouteAnalyticType l;
    public lm30 m;

    public d(yw30 yw30Var, ls30 ls30Var, ah00 ah00Var, tt2 tt2Var, ru.yandex.taxi.masstransit.userlocation.a aVar, y110 y110Var, uk10 uk10Var) {
        this.a = yw30Var;
        this.b = ls30Var;
        this.c = ah00Var;
        this.d = tt2Var;
        this.e = aVar;
        this.f = y110Var;
        this.g = uk10Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (ru.yandex.taxi.masstransit.overlay.onmap.j.b(r9.c, r9.d, r3, (com.yandex.mapkit.geometry.Point) r12, 200.0f, r6) != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (r12 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(hj40 hj40Var, String str, ContinuationImpl continuationImpl) {
        MtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$1 mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$1;
        int i;
        if (continuationImpl instanceof MtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$1) {
            mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$1 = (MtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$1) continuationImpl;
            int i2 = mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$1.label = i2 - Integer.MIN_VALUE;
                MtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$1 mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$12 = mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$1;
                Object obj = mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$12.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (hj40Var == null) {
                        return zy11Var;
                    }
                    mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$12.L$0 = hj40Var;
                    mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$12.L$1 = null;
                    mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$12.label = 1;
                    obj = ru.yandex.taxi.masstransit.overlay.onmap.j.a(this.f, str, mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        uj30 uj30Var = this.i;
                        (uj30Var != null ? uj30Var : null).b();
                        return zy11Var;
                    }
                    hj40Var = (hj40) mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$12.L$0;
                    kotlin.b.b(obj);
                }
                Point point = hj40Var.d;
                mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$12.L$0 = null;
                mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$12.L$1 = null;
                mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$12.L$2 = null;
                mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$12.label = 2;
            }
        }
        mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$1 = new MtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$1(this, continuationImpl);
        MtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$1 mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$122 = mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$1;
        Object obj2 = mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$122.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        Point point2 = hj40Var.d;
        mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$122.L$0 = null;
        mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$122.L$1 = null;
        mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$122.L$2 = null;
        mtDetailedRouteUiActionInteractor$focusOnStopAndVehicle$122.label = 2;
    }

    public final void b(h711 h711Var) {
        Object obj;
        String id = h711Var.getId();
        Set set = xh30.a;
        Integer l = bvu0.l(10, evu0.f0('_', id, id));
        if (l != null) {
            int intValue = l.intValue();
            su30 su30Var = this.h;
            if (su30Var == null) {
                su30Var = null;
            }
            Iterator it = su30Var.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                hz30 hz30Var = (hz30) obj;
                if ((hz30Var instanceof fj40) && hz30Var.b() == intValue) {
                    break;
                }
            }
            fj40 fj40Var = obj instanceof fj40 ? (fj40) obj : null;
            if (fj40Var == null || fj40Var.e().isEmpty()) {
                return;
            }
            fi6 fi6Var = new fi6();
            Iterator it2 = fj40Var.e().iterator();
            while (it2.hasNext()) {
                fi6Var.c(((hj40) it2.next()).d);
            }
            ((gh00) this.c).A(fi6Var.g(), null);
            uj30 uj30Var = this.i;
            (uj30Var != null ? uj30Var : null).b();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0346, code lost:
    
        if (r10.e.a(r0) == r1) goto L264;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x044c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(wh30 wh30Var, pf30 pf30Var, ContinuationImpl continuationImpl) {
        MtDetailedRouteUiActionInteractor$handleAction$1 mtDetailedRouteUiActionInteractor$handleAction$1;
        int i;
        TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource;
        int i2;
        TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType;
        TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType;
        String str;
        MtTransportType mtTransportType;
        Object value;
        Set set;
        w6g0 w6g0Var;
        String str2;
        TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource2;
        int i3;
        TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType2;
        if (continuationImpl instanceof MtDetailedRouteUiActionInteractor$handleAction$1) {
            mtDetailedRouteUiActionInteractor$handleAction$1 = (MtDetailedRouteUiActionInteractor$handleAction$1) continuationImpl;
            int i4 = mtDetailedRouteUiActionInteractor$handleAction$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mtDetailedRouteUiActionInteractor$handleAction$1.label = i4 - Integer.MIN_VALUE;
                Object obj = mtDetailedRouteUiActionInteractor$handleAction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtDetailedRouteUiActionInteractor$handleAction$1.label;
                Object obj3 = zy11.a;
                TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType2 = null;
                TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType3 = null;
                TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType4 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z = wh30Var instanceof eh30;
                    yw30 yw30Var = this.a;
                    if (z) {
                        MtDetailedRouteAnalyticSource mtDetailedRouteAnalyticSource = this.k;
                        int i5 = mtDetailedRouteAnalyticSource == null ? -1 : bf30.a[mtDetailedRouteAnalyticSource.ordinal()];
                        if (i5 != -1) {
                            if (i5 == 1) {
                                transportRouteAnalytics$DetailCardSource2 = TransportRouteAnalytics$DetailCardSource.Hub;
                                MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType = this.l;
                                i3 = mtDetailedRouteAnalyticType != null ? -1 : bf30.b[mtDetailedRouteAnalyticType.ordinal()];
                                if (i3 != -1) {
                                    if (i3 == 1) {
                                        transportRouteAnalytics$DetailCardType2 = TransportRouteAnalytics$DetailCardType.Vertical;
                                        yw30Var.a.c(transportRouteAnalytics$DetailCardSource2, transportRouteAnalytics$DetailCardType2);
                                        pf30Var.a();
                                        return obj3;
                                    }
                                    if (i3 != 2) {
                                        w511.b();
                                        return null;
                                    }
                                }
                                transportRouteAnalytics$DetailCardType2 = TransportRouteAnalytics$DetailCardType.Horizontal;
                                yw30Var.a.c(transportRouteAnalytics$DetailCardSource2, transportRouteAnalytics$DetailCardType2);
                                pf30Var.a();
                                return obj3;
                            }
                            if (i5 != 2) {
                                w511.b();
                                return null;
                            }
                        }
                        transportRouteAnalytics$DetailCardSource2 = TransportRouteAnalytics$DetailCardSource.Transport;
                        MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType2 = this.l;
                        if (mtDetailedRouteAnalyticType2 != null) {
                        }
                        if (i3 != -1) {
                        }
                        transportRouteAnalytics$DetailCardType2 = TransportRouteAnalytics$DetailCardType.Horizontal;
                        yw30Var.a.c(transportRouteAnalytics$DetailCardSource2, transportRouteAnalytics$DetailCardType2);
                        pf30Var.a();
                        return obj3;
                    }
                    if (wh30Var instanceof ch30) {
                        lm30 lm30Var = this.m;
                        if (lm30Var != null && (str2 = lm30Var.b) != null) {
                            pf30Var.g(str2);
                            return obj3;
                        }
                    } else if (wh30Var instanceof qh30) {
                        lm30 lm30Var2 = this.m;
                        if (lm30Var2 != null && (w6g0Var = lm30Var2.f) != null) {
                            String str3 = w6g0Var.a;
                            String str4 = w6g0Var.b;
                            if (str4 != null) {
                                ((es40) this.g.a).a(str4, str3, MultimodalRouteAnalytics$MultimodalRouteButtonType.QrButton, MultimodalRouteAnalytics$MultimodalRouteScreenStatus.Details);
                            }
                            pf30Var.g(str3);
                            return obj3;
                        }
                    } else if (wh30Var instanceof ih30) {
                        switch (pf30Var.a) {
                            case 0:
                                qf30 qf30Var = (qf30) pf30Var.b;
                                qf30Var.A((m950) qf30Var.P.get(), tjv0.c, sy60.Q2);
                            default:
                                return obj3;
                        }
                    } else {
                        boolean z2 = false;
                        Object[] objArr = 0;
                        if (wh30Var instanceof uh30) {
                            switch (pf30Var.a) {
                                case 0:
                                    qf30 qf30Var2 = (qf30) pf30Var.b;
                                    m950 m950Var = (m950) qf30Var2.Q.get();
                                    qf30Var2.R.a();
                                    qf30Var2.A(m950Var, new ur30(3), new of30(qf30Var2, objArr == true ? 1 : 0));
                                default:
                                    return obj3;
                            }
                        } else if (wh30Var instanceof th30) {
                            String str5 = ((th30) wh30Var).a;
                            switch (pf30Var.a) {
                                case 0:
                                    ((qf30) pf30Var.b).T.b(Uri.parse(str5), TransportCardSourceScreen.HUB);
                                default:
                                    return obj3;
                            }
                        } else {
                            boolean z3 = wh30Var instanceof nh30;
                            ls30 ls30Var = this.b;
                            if (z3) {
                                ArrayList arrayList = ((nh30) wh30Var).a;
                                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(((fu30) it.next()).c);
                                }
                                ls30Var.c(arrayList2, MasstransitPurchaseAnalytics$PurchaseScenariosSource.DetailCard);
                                return obj3;
                            }
                            if (wh30Var instanceof lh30) {
                                ls30Var.a(Collections.singletonList(((lh30) wh30Var).a.c), MasstransitPurchaseAnalytics$PurchaseScenariosSource.DetailCard);
                                return obj3;
                            }
                            if (wh30Var instanceof mh30) {
                                ls30Var.b(MasstransitPurchaseAnalytics$PurchaseScenariosSource.DetailCard);
                                return obj3;
                            }
                            if (wh30Var instanceof oh30) {
                                e(TransportRouteAnalytics$DetailCardTappedButtonV2.FooterBuyTicket, null);
                                ks30 ks30Var = ((oh30) wh30Var).a;
                                if (ks30Var instanceof is30) {
                                    pf30Var.g(((is30) ks30Var).a);
                                    return obj3;
                                }
                                if (ks30Var instanceof js30) {
                                    jst.e.getClass();
                                    return obj3;
                                }
                                w511.b();
                                return null;
                            }
                            if (wh30Var instanceof ph30) {
                                e(TransportRouteAnalytics$DetailCardTappedButtonV2.FooterMyTickets, null);
                                String str6 = ((ph30) wh30Var).a;
                                if (str6 != null) {
                                    pf30Var.g(str6);
                                    return obj3;
                                }
                            } else if (wh30Var instanceof gh30) {
                                h711 h711Var = ((gh30) wh30Var).a;
                                boolean z4 = h711Var instanceof s611;
                                if (z4) {
                                    o oVar = this.j;
                                    if (oVar == null) {
                                        oVar = null;
                                    }
                                    e(((Set) oVar.m.getValue()).contains(Integer.valueOf(((s611) h711Var).d)) ? TransportRouteAnalytics$DetailCardTappedButtonV2.TransportStopsCollapse : TransportRouteAnalytics$DetailCardTappedButtonV2.TransportStopsExpand, null);
                                }
                                o oVar2 = this.j;
                                o oVar3 = oVar2 != null ? oVar2 : null;
                                if (!z4) {
                                    oVar3.getClass();
                                    return obj3;
                                }
                                int i6 = ((s611) h711Var).d;
                                r0 r0Var = oVar3.m;
                                do {
                                    value = r0Var.getValue();
                                    set = (Set) value;
                                } while (!r0Var.k(value, set.contains(Integer.valueOf(i6)) ? v4r0.f(set, Integer.valueOf(i6)) : v4r0.i(set, Integer.valueOf(i6))));
                            } else {
                                if (wh30Var instanceof jh30) {
                                    TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV2 = TransportRouteAnalytics$DetailCardTappedButtonV2.Variants;
                                    bzy0 bzy0Var = ((jh30) wh30Var).a;
                                    if (bzy0Var instanceof zyy0) {
                                        w1u w1uVar = (w1u) kotlin.collections.a.R(((zyy0) bzy0Var).b);
                                        if (w1uVar != null) {
                                            mtTransportType = w1uVar.d.b;
                                        }
                                        mtTransportType = null;
                                    } else {
                                        if (!(bzy0Var instanceof azy0)) {
                                            w511.b();
                                            return null;
                                        }
                                        b3v0 b3v0Var = (b3v0) kotlin.collections.a.R(((azy0) bzy0Var).b);
                                        if (b3v0Var != null) {
                                            mtTransportType = b3v0Var.b;
                                        }
                                        mtTransportType = null;
                                    }
                                    switch (mtTransportType != null ? bf30.c[mtTransportType.ordinal()] : -1) {
                                        case -1:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                            break;
                                        case 0:
                                        default:
                                            w511.b();
                                            return null;
                                        case 1:
                                            transportRouteAnalytics$VehicleType2 = TransportRouteAnalytics$VehicleType.Aeroexpress;
                                            break;
                                        case 2:
                                            transportRouteAnalytics$VehicleType2 = TransportRouteAnalytics$VehicleType.Bus;
                                            break;
                                        case 3:
                                        case 4:
                                        case 5:
                                            transportRouteAnalytics$VehicleType2 = TransportRouteAnalytics$VehicleType.Suburban;
                                            break;
                                        case 6:
                                            transportRouteAnalytics$VehicleType2 = TransportRouteAnalytics$VehicleType.Underground;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                            transportRouteAnalytics$VehicleType2 = TransportRouteAnalytics$VehicleType.Ground;
                                            break;
                                    }
                                    e(transportRouteAnalytics$DetailCardTappedButtonV2, transportRouteAnalytics$VehicleType2);
                                    pf30Var.c(bzy0Var);
                                    return obj3;
                                }
                                if (wh30Var instanceof hh30) {
                                    TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV22 = TransportRouteAnalytics$DetailCardTappedButtonV2.ScheduleTickets;
                                    ee01 ee01Var = ((hh30) wh30Var).a;
                                    MtTransportType mtTransportType2 = ee01Var.d;
                                    switch (mtTransportType2 != null ? bf30.c[mtTransportType2.ordinal()] : -1) {
                                        case -1:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                            break;
                                        case 0:
                                        default:
                                            w511.b();
                                            return null;
                                        case 1:
                                            transportRouteAnalytics$VehicleType3 = TransportRouteAnalytics$VehicleType.Aeroexpress;
                                            break;
                                        case 2:
                                            transportRouteAnalytics$VehicleType3 = TransportRouteAnalytics$VehicleType.Bus;
                                            break;
                                        case 3:
                                        case 4:
                                        case 5:
                                            transportRouteAnalytics$VehicleType3 = TransportRouteAnalytics$VehicleType.Suburban;
                                            break;
                                        case 6:
                                            transportRouteAnalytics$VehicleType3 = TransportRouteAnalytics$VehicleType.Underground;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                            transportRouteAnalytics$VehicleType3 = TransportRouteAnalytics$VehicleType.Ground;
                                            break;
                                    }
                                    e(transportRouteAnalytics$DetailCardTappedButtonV22, transportRouteAnalytics$VehicleType3);
                                    pf30Var.d(ee01Var.b);
                                    return obj3;
                                }
                                if (!(wh30Var instanceof kh30)) {
                                    boolean z5 = wh30Var instanceof rh30;
                                    ah00 ah00Var = this.c;
                                    if (z5) {
                                        fi6 fi6Var = new fi6();
                                        su30 su30Var = this.h;
                                        if (su30Var == null) {
                                            su30Var = null;
                                        }
                                        fi6Var.a(su30Var.g.a.d);
                                        su30 su30Var2 = this.h;
                                        if (su30Var2 == null) {
                                            su30Var2 = null;
                                        }
                                        fi6Var.a(su30Var2.g.b.d);
                                        su30 su30Var3 = this.h;
                                        if (su30Var3 == null) {
                                            su30Var3 = null;
                                        }
                                        fi6Var.d(su30Var3.b);
                                        ((gh00) ah00Var).A(fi6Var.g(), null);
                                        uj30 uj30Var = this.i;
                                        (uj30Var != null ? uj30Var : null).a();
                                        return obj3;
                                    }
                                    if (wh30Var instanceof vh30) {
                                        mtDetailedRouteUiActionInteractor$handleAction$1.L$0 = null;
                                        mtDetailedRouteUiActionInteractor$handleAction$1.L$1 = null;
                                        mtDetailedRouteUiActionInteractor$handleAction$1.label = 1;
                                    } else if (wh30Var instanceof dh30) {
                                        TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV23 = TransportRouteAnalytics$DetailCardTappedButtonV2.TransportBubble;
                                        dh30 dh30Var = (dh30) wh30Var;
                                        ib11 ib11Var = dh30Var.b;
                                        MtTransportType mtTransportType3 = ib11Var != null ? ib11Var.a : null;
                                        switch (mtTransportType3 != null ? bf30.c[mtTransportType3.ordinal()] : -1) {
                                            case -1:
                                            case 14:
                                            case 15:
                                            case 16:
                                            case 17:
                                            case 18:
                                            case 19:
                                            case 20:
                                            case 21:
                                            case 22:
                                            case 23:
                                                transportRouteAnalytics$VehicleType = null;
                                                break;
                                            case 0:
                                            default:
                                                w511.b();
                                                return null;
                                            case 1:
                                                transportRouteAnalytics$VehicleType = TransportRouteAnalytics$VehicleType.Aeroexpress;
                                                break;
                                            case 2:
                                                transportRouteAnalytics$VehicleType = TransportRouteAnalytics$VehicleType.Bus;
                                                break;
                                            case 3:
                                            case 4:
                                            case 5:
                                                transportRouteAnalytics$VehicleType = TransportRouteAnalytics$VehicleType.Suburban;
                                                break;
                                            case 6:
                                                transportRouteAnalytics$VehicleType = TransportRouteAnalytics$VehicleType.Underground;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                            case 10:
                                            case 11:
                                            case 12:
                                            case 13:
                                                transportRouteAnalytics$VehicleType = TransportRouteAnalytics$VehicleType.Ground;
                                                break;
                                        }
                                        e(transportRouteAnalytics$DetailCardTappedButtonV23, transportRouteAnalytics$VehicleType);
                                        h711 h711Var2 = dh30Var.a;
                                        mtDetailedRouteUiActionInteractor$handleAction$1.L$0 = null;
                                        mtDetailedRouteUiActionInteractor$handleAction$1.L$1 = null;
                                        mtDetailedRouteUiActionInteractor$handleAction$1.label = 2;
                                        if (h711Var2 instanceof f611) {
                                            f611 f611Var = (f611) h711Var2;
                                            ib11 ib11Var2 = (ib11) kotlin.collections.a.R(f611Var.d.a);
                                            if (ib11Var2 != null) {
                                                Set set2 = xh30.a;
                                                z2 = xh30.a.contains(ib11Var2.a);
                                            }
                                            if (!z2) {
                                                obj3 = d(f611Var, ib11Var, pf30Var, mtDetailedRouteUiActionInteractor$handleAction$1);
                                                if (obj3 == obj2) {
                                                    return obj3;
                                                }
                                            }
                                        }
                                        b(h711Var2);
                                        if (obj3 == obj2) {
                                        }
                                    } else {
                                        if (wh30Var instanceof fh30) {
                                            ((gh00) ah00Var).w();
                                            return obj3;
                                        }
                                        if (!(wh30Var instanceof sh30)) {
                                            w511.b();
                                            return null;
                                        }
                                        sh30 sh30Var = (sh30) wh30Var;
                                        boolean z6 = sh30Var.a;
                                        boolean z7 = sh30Var.b;
                                        MtDetailedRouteAnalyticSource mtDetailedRouteAnalyticSource2 = this.k;
                                        int i7 = mtDetailedRouteAnalyticSource2 == null ? -1 : bf30.a[mtDetailedRouteAnalyticSource2.ordinal()];
                                        if (i7 != -1) {
                                            if (i7 == 1) {
                                                transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Hub;
                                                MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType3 = this.l;
                                                i2 = mtDetailedRouteAnalyticType3 != null ? -1 : bf30.b[mtDetailedRouteAnalyticType3.ordinal()];
                                                if (i2 != -1) {
                                                    if (i2 == 1) {
                                                        transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Vertical;
                                                        TransportRouteAnalytics$DetailCardAppearanceState transportRouteAnalytics$DetailCardAppearanceState = z6 ? TransportRouteAnalytics$DetailCardAppearanceState.Expanded : TransportRouteAnalytics$DetailCardAppearanceState.Collapsed;
                                                        Boolean valueOf = Boolean.valueOf(z7);
                                                        b611 b611Var = yw30Var.a;
                                                        HashMap o = smw0.o(b611Var);
                                                        o.put("source", transportRouteAnalytics$DetailCardSource.getEventValue());
                                                        o.put("type", transportRouteAnalytics$DetailCardType.getEventValue());
                                                        o.put(ClidProvider.STATE, transportRouteAnalytics$DetailCardAppearanceState.getEventValue());
                                                        o.put("is_user_initiated", valueOf);
                                                        b611Var.a.a("TransportRoute.DetailCard.StateChanged", o, 1, new HashMap());
                                                        if (!z6 && z7) {
                                                            yw30Var.a.d(transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType);
                                                        }
                                                    } else if (i2 != 2) {
                                                        w511.b();
                                                        return null;
                                                    }
                                                }
                                                transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
                                                if (z6) {
                                                }
                                                Boolean valueOf2 = Boolean.valueOf(z7);
                                                b611 b611Var2 = yw30Var.a;
                                                HashMap o2 = smw0.o(b611Var2);
                                                o2.put("source", transportRouteAnalytics$DetailCardSource.getEventValue());
                                                o2.put("type", transportRouteAnalytics$DetailCardType.getEventValue());
                                                o2.put(ClidProvider.STATE, transportRouteAnalytics$DetailCardAppearanceState.getEventValue());
                                                o2.put("is_user_initiated", valueOf2);
                                                b611Var2.a.a("TransportRoute.DetailCard.StateChanged", o2, 1, new HashMap());
                                                if (!z6) {
                                                    yw30Var.a.d(transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType);
                                                }
                                            } else if (i7 != 2) {
                                                w511.b();
                                                return null;
                                            }
                                        }
                                        transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Transport;
                                        MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType32 = this.l;
                                        if (mtDetailedRouteAnalyticType32 != null) {
                                        }
                                        if (i2 != -1) {
                                        }
                                        transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
                                        if (z6) {
                                        }
                                        Boolean valueOf22 = Boolean.valueOf(z7);
                                        b611 b611Var22 = yw30Var.a;
                                        HashMap o22 = smw0.o(b611Var22);
                                        o22.put("source", transportRouteAnalytics$DetailCardSource.getEventValue());
                                        o22.put("type", transportRouteAnalytics$DetailCardType.getEventValue());
                                        o22.put(ClidProvider.STATE, transportRouteAnalytics$DetailCardAppearanceState.getEventValue());
                                        o22.put("is_user_initiated", valueOf22);
                                        b611Var22.a.a("TransportRoute.DetailCard.StateChanged", o22, 1, new HashMap());
                                        if (!z6) {
                                        }
                                    }
                                    return obj2;
                                }
                                TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV24 = TransportRouteAnalytics$DetailCardTappedButtonV2.MyTickets;
                                ge01 ge01Var = ((kh30) wh30Var).a;
                                MtTransportType mtTransportType4 = ge01Var.d;
                                switch (mtTransportType4 != null ? bf30.c[mtTransportType4.ordinal()] : -1) {
                                    case -1:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                        e(transportRouteAnalytics$DetailCardTappedButtonV24, transportRouteAnalytics$VehicleType4);
                                        str = ge01Var.b;
                                        if (str != null) {
                                            pf30Var.g(str);
                                            return obj3;
                                        }
                                        break;
                                    case 0:
                                    default:
                                        w511.b();
                                        return null;
                                    case 1:
                                        transportRouteAnalytics$VehicleType4 = TransportRouteAnalytics$VehicleType.Aeroexpress;
                                        e(transportRouteAnalytics$DetailCardTappedButtonV24, transportRouteAnalytics$VehicleType4);
                                        str = ge01Var.b;
                                        if (str != null) {
                                        }
                                        break;
                                    case 2:
                                        transportRouteAnalytics$VehicleType4 = TransportRouteAnalytics$VehicleType.Bus;
                                        e(transportRouteAnalytics$DetailCardTappedButtonV24, transportRouteAnalytics$VehicleType4);
                                        str = ge01Var.b;
                                        if (str != null) {
                                        }
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                        transportRouteAnalytics$VehicleType4 = TransportRouteAnalytics$VehicleType.Suburban;
                                        e(transportRouteAnalytics$DetailCardTappedButtonV24, transportRouteAnalytics$VehicleType4);
                                        str = ge01Var.b;
                                        if (str != null) {
                                        }
                                        break;
                                    case 6:
                                        transportRouteAnalytics$VehicleType4 = TransportRouteAnalytics$VehicleType.Underground;
                                        e(transportRouteAnalytics$DetailCardTappedButtonV24, transportRouteAnalytics$VehicleType4);
                                        str = ge01Var.b;
                                        if (str != null) {
                                        }
                                        break;
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                        transportRouteAnalytics$VehicleType4 = TransportRouteAnalytics$VehicleType.Ground;
                                        e(transportRouteAnalytics$DetailCardTappedButtonV24, transportRouteAnalytics$VehicleType4);
                                        str = ge01Var.b;
                                        if (str != null) {
                                        }
                                        break;
                                }
                            }
                        }
                    }
                    return obj3;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                kotlin.b.b(obj);
                uj30 uj30Var2 = this.i;
                (uj30Var2 != null ? uj30Var2 : null).c();
                return obj3;
            }
        }
        mtDetailedRouteUiActionInteractor$handleAction$1 = new MtDetailedRouteUiActionInteractor$handleAction$1(this, continuationImpl);
        Object obj4 = mtDetailedRouteUiActionInteractor$handleAction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtDetailedRouteUiActionInteractor$handleAction$1.label;
        Object obj32 = zy11.a;
        TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType22 = null;
        TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType32 = null;
        TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType42 = null;
        if (i != 0) {
        }
        uj30 uj30Var22 = this.i;
        (uj30Var22 != null ? uj30Var22 : null).c();
        return obj32;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(f611 f611Var, ib11 ib11Var, pf30 pf30Var, ContinuationImpl continuationImpl) {
        MtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1 mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1;
        int i;
        Object obj;
        final w1u f;
        final hj40 hj40Var;
        int i2;
        final String str;
        String str2;
        w1u w1uVar;
        hj40 hj40Var2;
        hj40 hj40Var3;
        w211 w211Var;
        Object obj2;
        if (continuationImpl instanceof MtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1) {
            mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1 = (MtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1) continuationImpl;
            int i3 = mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1.label;
                final int i4 = 0;
                zy11 zy11Var = zy11.a;
                final int i5 = 1;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    String str3 = f611Var.h;
                    Set set = xh30.a;
                    Integer l = bvu0.l(10, evu0.f0('_', str3, str3));
                    if (l != null) {
                        int intValue = l.intValue();
                        su30 su30Var = this.h;
                        if (su30Var == null) {
                            su30Var = null;
                        }
                        Iterator it = su30Var.a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            hz30 hz30Var = (hz30) obj;
                            if ((hz30Var instanceof jm30) && ((jm30) hz30Var).l == intValue) {
                                break;
                            }
                        }
                        jm30 jm30Var = obj instanceof jm30 ? (jm30) obj : null;
                        if (jm30Var != null) {
                            if (ib11Var != null && (w211Var = ib11Var.j) != null) {
                                Iterator it2 = jm30Var.a.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it2.next();
                                    if (((w1u) obj2).f.equals(w211Var)) {
                                        break;
                                    }
                                }
                                w1u w1uVar2 = (w1u) obj2;
                                if (w1uVar2 != null) {
                                    f = w1uVar2;
                                    bzy0 bzy0Var = f611Var.d.g;
                                    zyy0 zyy0Var = !(bzy0Var instanceof zyy0) ? (zyy0) bzy0Var : null;
                                    hj40Var = (zyy0Var != null || (hj40Var3 = zyy0Var.a) == null) ? (hj40) kotlin.collections.a.R(jm30Var.i) : hj40Var3;
                                    i2 = (ib11Var == null && ib11Var.i) ? 1 : 0;
                                    str = i2 == 0 ? ib11Var.k : "";
                                    if (i2 != 0) {
                                        b(f611Var);
                                        switch (pf30Var.a) {
                                            case 0:
                                                ((qf30) pf30Var.b).r(new tls() { // from class: nf30
                                                    @Override // defpackage.tls
                                                    public final Object invoke(Object obj5) {
                                                        int i6 = i4;
                                                        zy11 zy11Var2 = zy11.a;
                                                        String str4 = str;
                                                        w1u w1uVar3 = f;
                                                        hj40 hj40Var4 = hj40Var;
                                                        qg30 qg30Var = (qg30) obj5;
                                                        switch (i6) {
                                                            case 0:
                                                                qg30Var.a.a(new y540(hj40Var4, w1uVar3, str4));
                                                                break;
                                                            default:
                                                                qg30Var.a.a(new y540(hj40Var4, w1uVar3, str4));
                                                                break;
                                                        }
                                                        return zy11Var2;
                                                    }
                                                });
                                                break;
                                            default:
                                                ((j4a) pf30Var.b).r(new tls() { // from class: nf30
                                                    @Override // defpackage.tls
                                                    public final Object invoke(Object obj5) {
                                                        int i6 = i5;
                                                        zy11 zy11Var2 = zy11.a;
                                                        String str4 = str;
                                                        w1u w1uVar3 = f;
                                                        hj40 hj40Var4 = hj40Var;
                                                        qg30 qg30Var = (qg30) obj5;
                                                        switch (i6) {
                                                            case 0:
                                                                qg30Var.a.a(new y540(hj40Var4, w1uVar3, str4));
                                                                break;
                                                            default:
                                                                qg30Var.a.a(new y540(hj40Var4, w1uVar3, str4));
                                                                break;
                                                        }
                                                        return zy11Var2;
                                                    }
                                                });
                                                break;
                                        }
                                    } else {
                                        mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1.L$0 = null;
                                        mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1.L$1 = null;
                                        mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1.L$2 = pf30Var;
                                        mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1.L$3 = null;
                                        mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1.L$4 = f;
                                        mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1.L$5 = hj40Var;
                                        mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1.L$6 = str;
                                        mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1.I$0 = intValue;
                                        mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1.I$1 = i2;
                                        mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1.label = 1;
                                        if (a(hj40Var, str, mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1) == obj4) {
                                            return obj4;
                                        }
                                        str2 = str;
                                        w1uVar = f;
                                        hj40Var2 = hj40Var;
                                    }
                                }
                            }
                            f = jm30Var.f();
                            bzy0 bzy0Var2 = f611Var.d.g;
                            if (!(bzy0Var2 instanceof zyy0)) {
                            }
                            if (zyy0Var != null) {
                            }
                            if (ib11Var == null) {
                            }
                            if (i2 == 0) {
                            }
                            if (i2 != 0) {
                            }
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = (String) mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1.L$6;
                hj40Var2 = (hj40) mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1.L$5;
                w1uVar = (w1u) mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1.L$4;
                pf30Var = (pf30) mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1.L$2;
                kotlin.b.b(obj3);
                hj40Var = hj40Var2;
                f = w1uVar;
                str = str2;
                switch (pf30Var.a) {
                }
            }
        }
        mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1 = new MtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1(this, continuationImpl);
        Object obj32 = mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtDetailedRouteUiActionInteractor$openGroundThreadSchedule$1.label;
        final int i42 = 0;
        zy11 zy11Var2 = zy11.a;
        final int i52 = 1;
        if (i != 0) {
        }
        hj40Var = hj40Var2;
        f = w1uVar;
        str = str2;
        switch (pf30Var.a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV2, TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType) {
        TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource;
        int i;
        TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType;
        su30 su30Var;
        MtDetailedRouteAnalyticSource mtDetailedRouteAnalyticSource = this.k;
        int i2 = mtDetailedRouteAnalyticSource == null ? -1 : bf30.a[mtDetailedRouteAnalyticSource.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Hub;
                TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource2 = transportRouteAnalytics$DetailCardSource;
                MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType = this.l;
                i = mtDetailedRouteAnalyticType != null ? -1 : bf30.b[mtDetailedRouteAnalyticType.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Vertical;
                        TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType2 = transportRouteAnalytics$DetailCardType;
                        su30Var = this.h;
                        if (su30Var == null) {
                            su30Var = null;
                        }
                        this.a.c(transportRouteAnalytics$DetailCardTappedButtonV2, transportRouteAnalytics$DetailCardSource2, transportRouteAnalytics$DetailCardType2, wtb1.d(su30Var.a), transportRouteAnalytics$VehicleType);
                    }
                    if (i != 2) {
                        w511.b();
                        return;
                    }
                }
                transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
                TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType22 = transportRouteAnalytics$DetailCardType;
                su30Var = this.h;
                if (su30Var == null) {
                }
                this.a.c(transportRouteAnalytics$DetailCardTappedButtonV2, transportRouteAnalytics$DetailCardSource2, transportRouteAnalytics$DetailCardType22, wtb1.d(su30Var.a), transportRouteAnalytics$VehicleType);
            }
            if (i2 != 2) {
                w511.b();
                return;
            }
        }
        transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Transport;
        TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource22 = transportRouteAnalytics$DetailCardSource;
        MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType2 = this.l;
        if (mtDetailedRouteAnalyticType2 != null) {
        }
        if (i != -1) {
        }
        transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
        TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType222 = transportRouteAnalytics$DetailCardType;
        su30Var = this.h;
        if (su30Var == null) {
        }
        this.a.c(transportRouteAnalytics$DetailCardTappedButtonV2, transportRouteAnalytics$DetailCardSource22, transportRouteAnalytics$DetailCardType222, wtb1.d(su30Var.a), transportRouteAnalytics$VehicleType);
    }
}
