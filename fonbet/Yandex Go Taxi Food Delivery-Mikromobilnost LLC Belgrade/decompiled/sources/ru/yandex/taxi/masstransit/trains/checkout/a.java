package ru.yandex.taxi.masstransit.trains.checkout;

import defpackage.a60;
import defpackage.ab40;
import defpackage.avj0;
import defpackage.b611;
import defpackage.be40;
import defpackage.c21;
import defpackage.c7s0;
import defpackage.db40;
import defpackage.ea40;
import defpackage.eb40;
import defpackage.ei40;
import defpackage.fa40;
import defpackage.fb40;
import defpackage.fd40;
import defpackage.fi40;
import defpackage.fmt;
import defpackage.ga40;
import defpackage.gb40;
import defpackage.gd40;
import defpackage.gwk0;
import defpackage.h3y;
import defpackage.hb40;
import defpackage.hd40;
import defpackage.ib40;
import defpackage.id40;
import defpackage.ief;
import defpackage.jb40;
import defpackage.jd40;
import defpackage.jl40;
import defpackage.ka40;
import defpackage.kd40;
import defpackage.kyh0;
import defpackage.ld40;
import defpackage.lga0;
import defpackage.lv90;
import defpackage.m1a0;
import defpackage.m950;
import defpackage.ma40;
import defpackage.md40;
import defpackage.mga0;
import defpackage.nd40;
import defpackage.ny61;
import defpackage.od40;
import defpackage.pd40;
import defpackage.pga0;
import defpackage.ph40;
import defpackage.pzt0;
import defpackage.qb40;
import defpackage.qd40;
import defpackage.qu;
import defpackage.r1e0;
import defpackage.r7s0;
import defpackage.rd40;
import defpackage.s8o;
import defpackage.sa40;
import defpackage.sd40;
import defpackage.sh40;
import defpackage.sib1;
import defpackage.sy60;
import defpackage.t411;
import defpackage.td40;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.ud40;
import defpackage.uk9;
import defpackage.v770;
import defpackage.vb40;
import defpackage.vd40;
import defpackage.w511;
import defpackage.wd40;
import defpackage.wh40;
import defpackage.wwg;
import defpackage.xd40;
import defpackage.ya40;
import defpackage.z940;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$CheckoutButtonType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$TripType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$VehicleType;
import ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutResponse;

/* loaded from: classes6.dex */
public final class a {
    public final eb40 a;
    public final ea40 b;
    public final jb40 c;
    public final j d;
    public final ga40 e;
    public final h3y f;
    public final zuj0 g;
    public pzt0 h;

    public a(eb40 eb40Var, ea40 ea40Var, jb40 jb40Var, j jVar, ga40 ga40Var, h3y h3yVar, zuj0 zuj0Var) {
        this.a = eb40Var;
        this.b = ea40Var;
        this.c = jb40Var;
        this.d = jVar;
        this.e = ga40Var;
        this.f = h3yVar;
        this.g = zuj0Var;
    }

    public static final void a(a aVar, sa40 sa40Var, String str, String str2) {
        TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType;
        aVar.getClass();
        int i = z940.a[sa40Var.d.a.ordinal()];
        if (i == 1) {
            transportRouteAnalytics$VehicleType = TransportRouteAnalytics$VehicleType.Bus;
        } else if (i == 2) {
            transportRouteAnalytics$VehicleType = TransportRouteAnalytics$VehicleType.Aeroexpress;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            transportRouteAnalytics$VehicleType = TransportRouteAnalytics$VehicleType.Suburban;
        }
        TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType2 = transportRouteAnalytics$VehicleType;
        ga40 ga40Var = aVar.e;
        ga40Var.a = fa40.a(ga40Var.a, str, null, transportRouteAnalytics$VehicleType2, null, null, 0, null, null, null, null, null, sa40Var.d.b, str2, null, 10234);
    }

    public final Object b(td40 td40Var, r rVar, ab40 ab40Var, gb40 gb40Var, tse tseVar, Continuation continuation) {
        Object value;
        ud40 ud40Var;
        fi40 fi40Var;
        ief iefVar;
        TransportRouteAnalytics$TripType transportRouteAnalytics$TripType;
        TransportRouteAnalytics$TripType transportRouteAnalytics$TripType2;
        Object value2;
        ud40 ud40Var2;
        String str;
        lv90 lv90Var;
        lv90 lv90Var2;
        ib40 ib40Var;
        Object value3;
        ud40 ud40Var3;
        Object value4;
        ud40 ud40Var4;
        boolean z = td40Var instanceof id40;
        zy11 zy11Var = zy11.a;
        ga40 ga40Var = this.e;
        eb40 eb40Var = this.a;
        ea40 ea40Var = this.b;
        if (z) {
            id40 id40Var = (id40) td40Var;
            ga40Var.a = fa40.a(ga40Var.a, null, null, null, null, null, id40Var.a, null, null, null, null, null, null, null, null, 16351);
            int i = id40Var.a;
            fa40 fa40Var = ea40Var.b.a;
            ea40Var.a.a(ea40Var.d, fa40Var.a, fa40Var.b, fa40Var.c, fa40Var.d, fa40Var.e, i, TransportRouteAnalytics$CheckoutButtonType.AdultTicket, fa40Var.h, fa40Var.i, fa40Var.m, fa40Var.g, fa40Var.k, fa40Var.j);
            int i2 = id40Var.a;
            r0 r0Var = rVar.g;
            xd40 xd40Var = (xd40) r0Var.getValue();
            if (xd40Var instanceof ud40) {
                do {
                    value4 = r0Var.getValue();
                    ud40Var4 = (ud40) xd40Var;
                } while (!r0Var.k(value4, ud40.a(ud40Var4, null, ei40.a(ud40Var4.e, false, Integer.valueOf(i2), null, 262015), null, 47)));
                db40 a = eb40Var.a();
                eb40.c(eb40Var, a != null ? db40.a(a, false, null, i2, 0, 27) : null);
                return zy11Var;
            }
        } else {
            if (jl40.l(td40Var, jd40.a)) {
                fa40 fa40Var2 = ea40Var.b.a;
                ea40Var.a.a(ea40Var.d, fa40Var2.a, fa40Var2.b, fa40Var2.c, fa40Var2.d, fa40Var2.e, fa40Var2.f, TransportRouteAnalytics$CheckoutButtonType.Back, fa40Var2.h, fa40Var2.i, fa40Var2.m, fa40Var2.g, fa40Var2.k, fa40Var2.j);
                ((ya40) ab40Var).a.r(new qu(9));
                return zy11Var;
            }
            if (jl40.l(td40Var, od40.a)) {
                return d(tseVar, eb40Var.a(), gb40Var, ((fb40) eb40Var.b.getValue()).c, rVar, ab40Var, continuation);
            }
            if (!(td40Var instanceof kd40)) {
                boolean z2 = td40Var instanceof ld40;
                c21 c21Var = sy60.Q2;
                if (z2) {
                    fa40 fa40Var3 = ea40Var.b.a;
                    ea40Var.a.a(ea40Var.d, fa40Var3.a, fa40Var3.b, fa40Var3.c, fa40Var3.d, fa40Var3.e, fa40Var3.f, TransportRouteAnalytics$CheckoutButtonType.Conditions, fa40Var3.h, fa40Var3.i, fa40Var3.m, fa40Var3.g, fa40Var3.k, fa40Var3.j);
                    be40 be40Var = ((ld40) td40Var).a;
                    i iVar = ((ya40) ab40Var).a;
                    iVar.D((m950) iVar.N.get(), be40Var, c21Var);
                    return zy11Var;
                }
                if (td40Var instanceof md40) {
                    hb40 hb40Var = ((md40) td40Var).a;
                    fa40 fa40Var4 = ea40Var.b.a;
                    ea40Var.a.a(ea40Var.d, fa40Var4.a, fa40Var4.b, fa40Var4.c, fa40Var4.d, fa40Var4.e, fa40Var4.f, TransportRouteAnalytics$CheckoutButtonType.Payment, fa40Var4.h, fa40Var4.i, fa40Var4.m, fa40Var4.g, fa40Var4.k, fa40Var4.j);
                    if (jl40.l((hb40Var == null || (ib40Var = hb40Var.d) == null) ? null : ib40Var.a, m1a0.h)) {
                        i iVar2 = ((ya40) ab40Var).a;
                        iVar2.A((m950) iVar2.Q.get(), new t411(null, null), c21Var);
                        return zy11Var;
                    }
                    ib40 ib40Var2 = hb40Var != null ? hb40Var.d : null;
                    Map map = gb40Var.e;
                    db40 a2 = eb40Var.a();
                    if (a2 == null) {
                        return zy11Var;
                    }
                    String str2 = ((fb40) eb40Var.b.getValue()).c;
                    db40 a3 = db40.a(a2, false, null, 0, 0, 15);
                    if (ib40Var2 == null || (lv90Var2 = ib40Var2.b) == null || (str = lv90Var2.b) == null) {
                        str = "";
                    }
                    return e(new qb40(str2, new qb40.a(str, (ib40Var2 == null || (lv90Var = ib40Var2.b) == null) ? null : lv90Var.a), a3, map), rVar, continuation);
                }
                if (td40Var instanceof rd40) {
                    fa40 fa40Var5 = ga40Var.a;
                    rd40 rd40Var = (rd40) td40Var;
                    boolean z3 = rd40Var.a;
                    if (z3) {
                        transportRouteAnalytics$TripType = TransportRouteAnalytics$TripType.RoundTrip;
                    } else {
                        if (z3) {
                            w511.b();
                            return null;
                        }
                        transportRouteAnalytics$TripType = TransportRouteAnalytics$TripType.OneWay;
                    }
                    ga40Var.a = fa40.a(fa40Var5, null, null, null, null, transportRouteAnalytics$TripType, 0, null, null, null, null, null, null, null, null, 16367);
                    fa40 fa40Var6 = ea40Var.b.a;
                    b611 b611Var = ea40Var.a;
                    TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin = ea40Var.d;
                    String str3 = fa40Var6.a;
                    String str4 = fa40Var6.b;
                    TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType = fa40Var6.c;
                    String str5 = fa40Var6.d;
                    if (z3) {
                        transportRouteAnalytics$TripType2 = TransportRouteAnalytics$TripType.RoundTrip;
                    } else {
                        if (z3) {
                            w511.b();
                            return null;
                        }
                        transportRouteAnalytics$TripType2 = TransportRouteAnalytics$TripType.OneWay;
                    }
                    b611Var.a(transportRouteAnalytics$FlowOrigin, str3, str4, transportRouteAnalytics$VehicleType, str5, transportRouteAnalytics$TripType2, fa40Var6.f, TransportRouteAnalytics$CheckoutButtonType.TripType, fa40Var6.h, fa40Var6.i, fa40Var6.m, fa40Var6.g, fa40Var6.k, fa40Var6.j);
                    boolean z4 = rd40Var.a;
                    r0 r0Var2 = rVar.g;
                    xd40 xd40Var2 = (xd40) r0Var2.getValue();
                    if (!(xd40Var2 instanceof ud40)) {
                        return zy11Var;
                    }
                    do {
                        value2 = r0Var2.getValue();
                        ud40Var2 = (ud40) xd40Var2;
                    } while (!r0Var2.k(value2, ud40.a(ud40Var2, null, ei40.a(ud40Var2.e, z4, null, null, 262142), null, 47)));
                    db40 a4 = eb40Var.a();
                    eb40.c(eb40Var, a4 != null ? db40.a(a4, z4, null, 0, 0, 30) : null);
                    return zy11Var;
                }
                if (td40Var instanceof qd40) {
                    fa40 fa40Var7 = ea40Var.b.a;
                    ea40Var.a.a(ea40Var.d, fa40Var7.a, fa40Var7.b, fa40Var7.c, fa40Var7.d, fa40Var7.e, fa40Var7.f, TransportRouteAnalytics$CheckoutButtonType.TariffName, fa40Var7.h, fa40Var7.i, fa40Var7.m, fa40Var7.g, fa40Var7.k, fa40Var7.j);
                    vb40.m mVar = ((qd40) td40Var).a;
                    db40 a5 = eb40Var.a();
                    String str6 = a5 != null ? a5.b : null;
                    i iVar3 = ((ya40) ab40Var).a;
                    m950 m950Var = (m950) iVar3.P.get();
                    db40 a6 = iVar3.K.a();
                    iVar3.D(m950Var, new sh40(mVar, str6, (a6 == null || (iefVar = a6.e) == null) ? null : gwk0.h(iefVar)), new h(iVar3));
                    return zy11Var;
                }
                if (td40Var instanceof hd40) {
                    hd40 hd40Var = (hd40) td40Var;
                    return d(tseVar, hd40Var.a, hd40Var.b, hd40Var.c, rVar, ab40Var, continuation);
                }
                if (td40Var instanceof gd40) {
                    return c(tseVar, ((gd40) td40Var).a, rVar, ab40Var, continuation);
                }
                if (td40Var instanceof fd40) {
                    ka40 ka40Var = ((fd40) td40Var).a;
                    if (ka40Var instanceof c7s0) {
                        i iVar4 = ((ya40) ab40Var).a;
                        iVar4.A((m950) iVar4.O.get(), (c7s0) ka40Var, new uk9(6));
                        return zy11Var;
                    }
                    if (ka40Var instanceof r7s0) {
                        return ((s) this.f.get()).a((r7s0) ka40Var, continuation);
                    }
                    if (jl40.l(ka40Var, ma40.INSTANCE)) {
                        return zy11Var;
                    }
                    w511.b();
                    return null;
                }
                if (!(td40Var instanceof pd40)) {
                    if (jl40.l(td40Var, nd40.a)) {
                        fa40 fa40Var8 = ea40Var.b.a;
                        ea40Var.a.a(ea40Var.d, fa40Var8.a, fa40Var8.b, fa40Var8.c, fa40Var8.d, fa40Var8.e, fa40Var8.f, TransportRouteAnalytics$CheckoutButtonType.PaymentMethod, fa40Var8.h, fa40Var8.i, fa40Var8.m, fa40Var8.g, fa40Var8.k, fa40Var8.j);
                        i iVar5 = ((ya40) ab40Var).a;
                        iVar5.A((m950) iVar5.Q.get(), new t411(null, null), c21Var);
                        return zy11Var;
                    }
                    if (td40Var instanceof sd40) {
                        ((a60) ((ya40) ab40Var).a.R).c(((sd40) td40Var).a, v770.c);
                        return zy11Var;
                    }
                    w511.b();
                    return null;
                }
                pd40 pd40Var = (pd40) td40Var;
                String str7 = pd40Var.a;
                ph40 ph40Var = pd40Var.b;
                r0 r0Var3 = rVar.g;
                xd40 xd40Var3 = (xd40) r0Var3.getValue();
                if (!(xd40Var3 instanceof ud40)) {
                    if ((xd40Var3 instanceof vd40) || (xd40Var3 instanceof wd40)) {
                        return zy11Var;
                    }
                    w511.b();
                    return null;
                }
                do {
                    value = r0Var3.getValue();
                    ud40Var = (ud40) xd40Var3;
                    fi40Var = ud40Var.d;
                } while (!r0Var3.k(value, ud40.a(ud40Var, new fi40(fi40Var.a, fi40Var.b, new wh40(ph40Var.c, ph40Var.a, ph40Var.b, fi40Var.c.d, str7)), null, null, 55)));
                db40 a7 = eb40Var.a();
                eb40.c(eb40Var, a7 != null ? db40.a(a7, false, str7, 0, 0, 29) : null);
                return zy11Var;
            }
            fa40 fa40Var9 = ga40Var.a;
            kd40 kd40Var = (kd40) td40Var;
            int i3 = kd40Var.a;
            ga40Var.a = fa40.a(fa40Var9, null, null, null, null, null, 0, Integer.valueOf(i3), null, null, null, null, null, null, null, 16319);
            fa40 fa40Var10 = ea40Var.b.a;
            ea40Var.a.a(ea40Var.d, fa40Var10.a, fa40Var10.b, fa40Var10.c, fa40Var10.d, fa40Var10.e, fa40Var10.f, TransportRouteAnalytics$CheckoutButtonType.ChildrenTicket, fa40Var10.h, fa40Var10.i, fa40Var10.m, Integer.valueOf(i3), fa40Var10.k, fa40Var10.j);
            int i4 = kd40Var.a;
            r0 r0Var4 = rVar.g;
            xd40 xd40Var4 = (xd40) r0Var4.getValue();
            if (xd40Var4 instanceof ud40) {
                do {
                    value3 = r0Var4.getValue();
                    ud40Var3 = (ud40) xd40Var4;
                } while (!r0Var4.k(value3, ud40.a(ud40Var3, null, ei40.a(ud40Var3.e, false, null, Integer.valueOf(i4), 229375), null, 47)));
                db40 a8 = eb40Var.a();
                eb40.c(eb40Var, a8 != null ? db40.a(a8, false, null, 0, i4, 23) : null);
                return zy11Var;
            }
        }
        return zy11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        if (defpackage.zy11.a == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(tse tseVar, gb40 gb40Var, r rVar, ab40 ab40Var, Continuation continuation) {
        MtTrainCheckoutActionInteractor$loadInitData$1 mtTrainCheckoutActionInteractor$loadInitData$1;
        int i;
        Object value;
        avj0 avj0Var;
        if (continuation instanceof MtTrainCheckoutActionInteractor$loadInitData$1) {
            mtTrainCheckoutActionInteractor$loadInitData$1 = (MtTrainCheckoutActionInteractor$loadInitData$1) continuation;
            int i2 = mtTrainCheckoutActionInteractor$loadInitData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainCheckoutActionInteractor$loadInitData$1.label = i2 - Integer.MIN_VALUE;
                MtTrainCheckoutActionInteractor$loadInitData$1 mtTrainCheckoutActionInteractor$loadInitData$12 = mtTrainCheckoutActionInteractor$loadInitData$1;
                Object obj = mtTrainCheckoutActionInteractor$loadInitData$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainCheckoutActionInteractor$loadInitData$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mtTrainCheckoutActionInteractor$loadInitData$12.L$0 = tseVar;
                    mtTrainCheckoutActionInteractor$loadInitData$12.L$1 = gb40Var;
                    mtTrainCheckoutActionInteractor$loadInitData$12.L$2 = rVar;
                    mtTrainCheckoutActionInteractor$loadInitData$12.L$3 = ab40Var;
                    mtTrainCheckoutActionInteractor$loadInitData$12.label = 1;
                    zuj0 zuj0Var = rVar.d;
                    r0 r0Var = rVar.g;
                    do {
                        value = r0Var.getValue();
                        avj0Var = (avj0) zuj0Var;
                    } while (!r0Var.k(value, new wd40(avj0Var.h(kyh0.masstransit_vertical_trains_buy_ticket), avj0Var.h(kyh0.masstransit_vertical_trains_clarifying))));
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    ab40Var = (ab40) mtTrainCheckoutActionInteractor$loadInitData$12.L$3;
                    rVar = (r) mtTrainCheckoutActionInteractor$loadInitData$12.L$2;
                    gb40Var = (gb40) mtTrainCheckoutActionInteractor$loadInitData$12.L$1;
                    tseVar = (tse) mtTrainCheckoutActionInteractor$loadInitData$12.L$0;
                    kotlin.b.b(obj);
                }
                r rVar2 = rVar;
                ab40 ab40Var2 = ab40Var;
                mtTrainCheckoutActionInteractor$loadInitData$12.L$0 = null;
                mtTrainCheckoutActionInteractor$loadInitData$12.L$1 = null;
                mtTrainCheckoutActionInteractor$loadInitData$12.L$2 = null;
                mtTrainCheckoutActionInteractor$loadInitData$12.L$3 = null;
                mtTrainCheckoutActionInteractor$loadInitData$12.label = 2;
                Object d = d(tseVar, null, gb40Var, null, rVar2, ab40Var2, mtTrainCheckoutActionInteractor$loadInitData$12);
                return d != obj2 ? obj2 : d;
            }
        }
        mtTrainCheckoutActionInteractor$loadInitData$1 = new MtTrainCheckoutActionInteractor$loadInitData$1(this, continuation);
        MtTrainCheckoutActionInteractor$loadInitData$1 mtTrainCheckoutActionInteractor$loadInitData$122 = mtTrainCheckoutActionInteractor$loadInitData$1;
        Object obj3 = mtTrainCheckoutActionInteractor$loadInitData$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainCheckoutActionInteractor$loadInitData$122.label;
        if (i != 0) {
        }
        r rVar22 = rVar;
        ab40 ab40Var22 = ab40Var;
        mtTrainCheckoutActionInteractor$loadInitData$122.L$0 = null;
        mtTrainCheckoutActionInteractor$loadInitData$122.L$1 = null;
        mtTrainCheckoutActionInteractor$loadInitData$122.L$2 = null;
        mtTrainCheckoutActionInteractor$loadInitData$122.L$3 = null;
        mtTrainCheckoutActionInteractor$loadInitData$122.label = 2;
        Object d2 = d(tseVar, null, gb40Var, null, rVar22, ab40Var22, mtTrainCheckoutActionInteractor$loadInitData$122);
        if (d2 != obj22) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(tse tseVar, db40 db40Var, gb40 gb40Var, String str, r rVar, ab40 ab40Var, Continuation continuation) {
        MtTrainCheckoutActionInteractor$loadScreenData$1 mtTrainCheckoutActionInteractor$loadScreenData$1;
        int i;
        r rVar2;
        gb40 gb40Var2;
        String str2;
        ab40 ab40Var2;
        tse tseVar2;
        db40 db40Var2;
        Object value;
        pzt0 pzt0Var;
        if (continuation instanceof MtTrainCheckoutActionInteractor$loadScreenData$1) {
            mtTrainCheckoutActionInteractor$loadScreenData$1 = (MtTrainCheckoutActionInteractor$loadScreenData$1) continuation;
            int i2 = mtTrainCheckoutActionInteractor$loadScreenData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainCheckoutActionInteractor$loadScreenData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtTrainCheckoutActionInteractor$loadScreenData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainCheckoutActionInteractor$loadScreenData$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mtTrainCheckoutActionInteractor$loadScreenData$1.L$0 = tseVar;
                    mtTrainCheckoutActionInteractor$loadScreenData$1.L$1 = db40Var;
                    mtTrainCheckoutActionInteractor$loadScreenData$1.L$2 = gb40Var;
                    mtTrainCheckoutActionInteractor$loadScreenData$1.L$3 = str;
                    mtTrainCheckoutActionInteractor$loadScreenData$1.L$4 = rVar;
                    mtTrainCheckoutActionInteractor$loadScreenData$1.L$5 = ab40Var;
                    mtTrainCheckoutActionInteractor$loadScreenData$1.label = 1;
                    rVar.getClass();
                    if ((db40Var != null ? db40Var.b : null) != null) {
                        String str3 = db40Var.b;
                        db40 a = this.a.a();
                        if (!jl40.l(str3, a != null ? a.b : null)) {
                            r0 r0Var = rVar.g;
                            do {
                                value = r0Var.getValue();
                            } while (!r0Var.k(value, new wd40(((avj0) rVar.d).h(kyh0.masstransit_vertical_trains_buy_ticket), 2)));
                        }
                    }
                    if (zy11Var == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    rVar2 = rVar;
                    gb40Var2 = gb40Var;
                    str2 = str;
                    ab40Var2 = ab40Var;
                    tseVar2 = tseVar;
                    db40Var2 = db40Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ab40 ab40Var3 = (ab40) mtTrainCheckoutActionInteractor$loadScreenData$1.L$5;
                    r rVar3 = (r) mtTrainCheckoutActionInteractor$loadScreenData$1.L$4;
                    String str4 = (String) mtTrainCheckoutActionInteractor$loadScreenData$1.L$3;
                    gb40 gb40Var3 = (gb40) mtTrainCheckoutActionInteractor$loadScreenData$1.L$2;
                    db40 db40Var3 = (db40) mtTrainCheckoutActionInteractor$loadScreenData$1.L$1;
                    tse tseVar3 = (tse) mtTrainCheckoutActionInteractor$loadScreenData$1.L$0;
                    kotlin.b.b(obj);
                    rVar2 = rVar3;
                    str2 = str4;
                    tseVar2 = tseVar3;
                    gb40Var2 = gb40Var3;
                    db40Var2 = db40Var3;
                    ab40Var2 = ab40Var3;
                }
                pzt0Var = this.h;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                this.h = tje.N(tseVar2, null, null, new MtTrainCheckoutActionInteractor$loadScreenData$2(this, str2, db40Var2, gb40Var2, rVar2, tseVar2, ab40Var2, null), 3);
                return zy11Var;
            }
        }
        mtTrainCheckoutActionInteractor$loadScreenData$1 = new MtTrainCheckoutActionInteractor$loadScreenData$1(this, continuation);
        Object obj2 = mtTrainCheckoutActionInteractor$loadScreenData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainCheckoutActionInteractor$loadScreenData$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        pzt0Var = this.h;
        if (pzt0Var != null) {
        }
        this.h = tje.N(tseVar2, null, null, new MtTrainCheckoutActionInteractor$loadScreenData$2(this, str2, db40Var2, gb40Var2, rVar2, tseVar2, ab40Var2, null), 3);
        return zy11Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x011d, code lost:
    
        if (r11 == r3) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012d A[Catch: Exception -> 0x00f9, CancellationException -> 0x0184, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f9, blocks: (B:41:0x0120, B:13:0x007d, B:19:0x00a2, B:27:0x00f2, B:33:0x00fb, B:34:0x0100, B:35:0x0101, B:37:0x0106, B:38:0x010d, B:46:0x0126, B:47:0x012d), top: B:40:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0120 -> B:13:0x007d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(qb40 qb40Var, r rVar, Continuation continuation) {
        MtTrainCheckoutActionInteractor$requestPayment$1 mtTrainCheckoutActionInteractor$requestPayment$1;
        ?? r4;
        r rVar2;
        qb40 qb40Var2;
        MtTrainCheckoutActionInteractor$requestPayment$1 mtTrainCheckoutActionInteractor$requestPayment$12;
        Object failure;
        qb40 qb40Var3;
        Throwable a;
        int i;
        Object b;
        try {
            if (continuation instanceof MtTrainCheckoutActionInteractor$requestPayment$1) {
                mtTrainCheckoutActionInteractor$requestPayment$1 = (MtTrainCheckoutActionInteractor$requestPayment$1) continuation;
                int i2 = mtTrainCheckoutActionInteractor$requestPayment$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mtTrainCheckoutActionInteractor$requestPayment$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = mtTrainCheckoutActionInteractor$requestPayment$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r4 = mtTrainCheckoutActionInteractor$requestPayment$1.label;
                    zy11 zy11Var = zy11.a;
                    ga40 ga40Var = this.e;
                    lga0 lga0Var = lga0.a;
                    mga0 mga0Var = mga0.a;
                    tls tlsVar = null;
                    jb40 jb40Var = this.c;
                    if (r4 == 0) {
                        try {
                        } catch (Exception e) {
                            e = e;
                            rVar2 = r4;
                        }
                        if (r4 == 1) {
                            r rVar3 = (r) mtTrainCheckoutActionInteractor$requestPayment$1.L$1;
                            qb40Var2 = (qb40) mtTrainCheckoutActionInteractor$requestPayment$1.L$0;
                            kotlin.b.b(obj);
                            mtTrainCheckoutActionInteractor$requestPayment$12 = mtTrainCheckoutActionInteractor$requestPayment$1;
                            rVar2 = rVar3;
                            fmt fmtVar = (fmt) obj;
                            r1e0 l = wwg.l(fmtVar);
                            Object obj2 = fmtVar.a;
                            Long l2 = l.b;
                            ga40Var.a = fa40.a(ga40Var.a, null, null, null, null, null, 0, null, null, null, null, null, null, null, fmtVar.e.a("X-YaMasstransitRequestId"), 8191);
                            i = z940.b[((MtTrainCheckoutResponse) obj2).a.ordinal()];
                            if (i == 1) {
                            }
                            failure = zy11Var;
                            a = Result.a(failure);
                            if (a != null) {
                            }
                            return zy11Var;
                        }
                        if (r4 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r rVar4 = (r) mtTrainCheckoutActionInteractor$requestPayment$1.L$1;
                        qb40Var2 = (qb40) mtTrainCheckoutActionInteractor$requestPayment$1.L$0;
                        kotlin.b.b(obj);
                        Object obj3 = obj;
                        tls tlsVar2 = null;
                        mtTrainCheckoutActionInteractor$requestPayment$12 = mtTrainCheckoutActionInteractor$requestPayment$1;
                        rVar2 = rVar4;
                        try {
                            tlsVar = tlsVar2;
                            qb40Var3 = qb40Var2;
                            j jVar = this.d;
                            mtTrainCheckoutActionInteractor$requestPayment$12.L$0 = qb40Var3;
                            mtTrainCheckoutActionInteractor$requestPayment$12.L$1 = rVar2;
                            mtTrainCheckoutActionInteractor$requestPayment$12.L$2 = tlsVar;
                            mtTrainCheckoutActionInteractor$requestPayment$12.L$3 = tlsVar;
                            mtTrainCheckoutActionInteractor$requestPayment$12.label = 1;
                            b = ru.yandex.taxi.network.api.a.b(((MtTrainCheckoutApi) jVar.b.getValue()).b(qb40Var3), tlsVar, mtTrainCheckoutActionInteractor$requestPayment$12);
                        } catch (Exception e2) {
                            e = e2;
                        }
                        if (b != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        qb40Var2 = qb40Var3;
                        obj = b;
                        fmt fmtVar2 = (fmt) obj;
                        r1e0 l3 = wwg.l(fmtVar2);
                        Object obj22 = fmtVar2.a;
                        Long l22 = l3.b;
                        ga40Var.a = fa40.a(ga40Var.a, null, null, null, null, null, 0, null, null, null, null, null, null, null, fmtVar2.e.a("X-YaMasstransitRequestId"), 8191);
                        i = z940.b[((MtTrainCheckoutResponse) obj22).a.ordinal()];
                        if (i == 1) {
                            jb40Var.a(new pga0(((MtTrainCheckoutResponse) obj22).b, ((avj0) this.g).h(kyh0.mt_ticket_is_paid)));
                        } else if (i == 2) {
                            jb40Var.a(mga0Var);
                            rVar2.a();
                        } else if (i == 3) {
                            jb40Var.a(lga0Var);
                            long longValue = l22 != null ? l22.longValue() : 5000L;
                            mtTrainCheckoutActionInteractor$requestPayment$12.L$0 = qb40Var2;
                            mtTrainCheckoutActionInteractor$requestPayment$12.L$1 = rVar2;
                            tlsVar2 = null;
                            mtTrainCheckoutActionInteractor$requestPayment$12.L$2 = null;
                            mtTrainCheckoutActionInteractor$requestPayment$12.L$3 = null;
                            mtTrainCheckoutActionInteractor$requestPayment$12.label = 2;
                            obj3 = kotlinx.coroutines.a.i(longValue, mtTrainCheckoutActionInteractor$requestPayment$12);
                        } else {
                            if (i != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            jb40Var.a(mga0Var);
                            rVar2.a();
                        }
                        failure = zy11Var;
                        a = Result.a(failure);
                        if (a != null) {
                            jb40Var.a(mga0Var);
                            ga40Var.a = fa40.a(ga40Var.a, null, null, null, null, null, 0, null, null, null, null, null, null, null, sib1.b(s8o.O(a)), 8191);
                            rVar2.a();
                        }
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                    jb40Var.a(lga0Var);
                    try {
                        jb40Var.a(lga0Var);
                        qb40Var3 = qb40Var;
                        mtTrainCheckoutActionInteractor$requestPayment$12 = mtTrainCheckoutActionInteractor$requestPayment$1;
                        rVar2 = rVar;
                        j jVar2 = this.d;
                        mtTrainCheckoutActionInteractor$requestPayment$12.L$0 = qb40Var3;
                        mtTrainCheckoutActionInteractor$requestPayment$12.L$1 = rVar2;
                        mtTrainCheckoutActionInteractor$requestPayment$12.L$2 = tlsVar;
                        mtTrainCheckoutActionInteractor$requestPayment$12.L$3 = tlsVar;
                        mtTrainCheckoutActionInteractor$requestPayment$12.label = 1;
                        b = ru.yandex.taxi.network.api.a.b(((MtTrainCheckoutApi) jVar2.b.getValue()).b(qb40Var3), tlsVar, mtTrainCheckoutActionInteractor$requestPayment$12);
                        if (b != coroutineSingletons) {
                        }
                    } catch (Exception e3) {
                        e = e3;
                        rVar2 = rVar;
                    }
                    failure = new Result.Failure(e);
                    a = Result.a(failure);
                    if (a != null) {
                    }
                    return zy11Var;
                }
            }
            if (r4 == 0) {
            }
            failure = new Result.Failure(e);
            a = Result.a(failure);
            if (a != null) {
            }
            return zy11Var;
        } catch (CancellationException e4) {
            throw e4;
        }
        mtTrainCheckoutActionInteractor$requestPayment$1 = new MtTrainCheckoutActionInteractor$requestPayment$1(this, continuation);
        Object obj4 = mtTrainCheckoutActionInteractor$requestPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r4 = mtTrainCheckoutActionInteractor$requestPayment$1.label;
        zy11 zy11Var2 = zy11.a;
        ga40 ga40Var2 = this.e;
        lga0 lga0Var2 = lga0.a;
        mga0 mga0Var2 = mga0.a;
        tls tlsVar3 = null;
        jb40 jb40Var2 = this.c;
    }
}
