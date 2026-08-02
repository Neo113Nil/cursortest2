package ru.yandex.taxi.masstransit.trains.search;

import defpackage.ac01;
import defpackage.b611;
import defpackage.bc01;
import defpackage.cc01;
import defpackage.kc01;
import defpackage.mc01;
import defpackage.mvg;
import defpackage.nc01;
import defpackage.nvi0;
import defpackage.ny61;
import defpackage.p6o;
import defpackage.pc01;
import defpackage.q8v0;
import defpackage.qu;
import defpackage.r;
import defpackage.tse;
import defpackage.ub01;
import defpackage.vb01;
import defpackage.vwp0;
import defpackage.w511;
import defpackage.wb01;
import defpackage.wls;
import defpackage.xb01;
import defpackage.yb01;
import defpackage.zb01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$RouteOptionsErrorButtonName;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$RouteOptionsTapButtonName;
import ru.yandex.taxi.masstransit.ui.StationFocus;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.search.TrainStationSearchModalRouter$content$1$1$1", f = "TrainStationSearchModalRouter.kt", l = {27}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TrainStationSearchModalRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ bc01 $action;
    int label;
    final /* synthetic */ kc01 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainStationSearchModalRouter$content$1$1$1(kc01 kc01Var, bc01 bc01Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kc01Var;
        this.$action = bc01Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrainStationSearchModalRouter$content$1$1$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrainStationSearchModalRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0417 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0418 A[RETURN] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.String, nvi0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        wb01 wb01Var;
        Object value2;
        Object value3;
        nc01 nc01Var;
        Object value4;
        StationFocus stationFocus;
        Object emit;
        Object value5;
        StationFocus stationFocus2;
        String str;
        Object value6;
        nc01 nc01Var2;
        vwp0 vwp0Var;
        String str2;
        String str3;
        Object value7;
        nc01 nc01Var3;
        vwp0 vwp0Var2;
        vwp0 a;
        vwp0 vwp0Var3;
        Pair pair;
        String str4;
        Object value8;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        kc01 kc01Var = this.this$0;
        bc01 bc01Var = this.$action;
        this.label = 1;
        a aVar = kc01Var.I;
        pc01 pc01Var = kc01Var.H;
        aVar.getClass();
        if (!(bc01Var instanceof ub01)) {
            if (bc01Var instanceof xb01) {
                r0 r0Var = pc01Var.d;
                do {
                    value8 = r0Var.getValue();
                } while (!r0Var.k(value8, nc01.a((nc01) value8, null, null, null, null, null, null, 3967)));
                nc01 nc01Var4 = (nc01) pc01Var.d.getValue();
                b611 b611Var = aVar.c;
                TransportRouteAnalytics$RouteOptionsErrorButtonName transportRouteAnalytics$RouteOptionsErrorButtonName = TransportRouteAnalytics$RouteOptionsErrorButtonName.Update;
                TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin = nc01Var4.e;
                vwp0 vwp0Var4 = nc01Var4.b;
                vwp0 vwp0Var5 = nc01Var4.a;
                b611Var.g(transportRouteAnalytics$RouteOptionsErrorButtonName, transportRouteAnalytics$FlowOrigin, nc01Var4.k, vwp0Var5.e, vwp0Var4.e);
                int i2 = cc01.a[nc01Var4.j.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    emit = aVar.b(vwp0Var5.a.toString(), pc01Var, SuggestType.SOURCE, this);
                } else {
                    if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    emit = aVar.b(vwp0Var4.a.toString(), pc01Var, SuggestType.DESTINATION, this);
                }
            } else {
                Object obj2 = null;
                boolean z = bc01Var instanceof zb01;
                EmptyList emptyList = EmptyList.a;
                if (z) {
                    r0 r0Var2 = pc01Var.d;
                    StationFocus stationFocus3 = ((nc01) r0Var2.getValue()).j;
                    nc01 nc01Var5 = (nc01) r0Var2.getValue();
                    aVar.c.i(TransportRouteAnalytics$RouteOptionsTapButtonName.Reverse, nc01Var5.l, nc01Var5.e, nc01Var5.k, nc01Var5.a.e, nc01Var5.b.e, Boolean.valueOf(nc01Var5.c.isEmpty()));
                    do {
                        value7 = r0Var2.getValue();
                        nc01Var3 = (nc01) value7;
                        vwp0 vwp0Var6 = nc01Var3.a;
                        vwp0Var2 = nc01Var3.b;
                        a = vwp0.a(vwp0Var6, vwp0Var2.a, vwp0Var2.d, vwp0Var2.e, vwp0Var2.g);
                        vwp0Var3 = nc01Var3.a;
                    } while (!r0Var2.k(value7, nc01.a(nc01Var3, a, vwp0.a(vwp0Var2, vwp0Var3.a, vwp0Var3.d, vwp0Var3.e, vwp0Var3.g), emptyList, null, null, null, 4088)));
                    nc01 nc01Var6 = (nc01) r0Var2.getValue();
                    vwp0 vwp0Var7 = nc01Var6.a;
                    vwp0 vwp0Var8 = nc01Var6.b;
                    if (vwp0Var7.d && vwp0Var8.d) {
                        String str5 = vwp0Var7.e;
                        if (str5 != null && (str4 = vwp0Var8.e) != null) {
                            kc01Var.r(new r(str5, str4, 28));
                        }
                    } else {
                        int i3 = cc01.a[stationFocus3.ordinal()];
                        if (i3 == 1) {
                            pair = new Pair(SuggestType.SOURCE, nc01Var6.a.a.toString());
                        } else if (i3 == 2) {
                            pair = null;
                        } else {
                            if (i3 != 3) {
                                w511.b();
                                return null;
                            }
                            pair = new Pair(SuggestType.DESTINATION, vwp0Var8.a.toString());
                        }
                        if (pair != null) {
                            aVar.a((String) pair.getSecond(), pc01Var, (SuggestType) pair.getFirst());
                        }
                    }
                } else if (bc01Var instanceof yb01) {
                    r0 r0Var3 = pc01Var.d;
                    while (true) {
                        Object value9 = r0Var3.getValue();
                        nc01 nc01Var7 = (nc01) value9;
                        vwp0 vwp0Var9 = nc01Var7.a;
                        str3 = ((yb01) bc01Var).a;
                        ?? r11 = obj2;
                        if (r0Var3.k(value9, nc01.a(nc01Var7, vwp0.a(vwp0Var9, str3, false, r11, r11), null, null, null, StationFocus.SOURCE, null, 3582))) {
                            break;
                        }
                        obj2 = null;
                    }
                    aVar.a(str3, pc01Var, SuggestType.SOURCE);
                } else if (bc01Var instanceof vb01) {
                    r0 r0Var4 = pc01Var.d;
                    do {
                        value6 = r0Var4.getValue();
                        nc01Var2 = (nc01) value6;
                        vwp0Var = nc01Var2.b;
                        str2 = ((vb01) bc01Var).a;
                    } while (!r0Var4.k(value6, nc01.a(nc01Var2, null, vwp0.a(vwp0Var, str2, false, null, null), null, null, StationFocus.DESTINATION, null, 3581)));
                    aVar.a(str2, pc01Var, SuggestType.DESTINATION);
                } else if (bc01Var instanceof ac01) {
                    q8v0 q8v0Var = ((ac01) bc01Var).a;
                    nvi0 nvi0Var = q8v0Var.b;
                    String str6 = q8v0Var.a;
                    CharSequence charSequence = q8v0Var.c;
                    int i4 = cc01.b[q8v0Var.d.ordinal()];
                    boolean z2 = true;
                    if (i4 == 1) {
                        r0 r0Var5 = pc01Var.d;
                        do {
                            value3 = r0Var5.getValue();
                            nc01Var = (nc01) value3;
                        } while (!r0Var5.k(value3, nc01.a(nc01Var, vwp0.a(nc01Var.a, charSequence, true, str6, nvi0Var), null, null, null, null, null, 4094)));
                    } else {
                        if (i4 != 2) {
                            w511.b();
                            return null;
                        }
                        r0 r0Var6 = pc01Var.d;
                        while (true) {
                            Object value10 = r0Var6.getValue();
                            nc01 nc01Var8 = (nc01) value10;
                            if (r0Var6.k(value10, nc01.a(nc01Var8, null, vwp0.a(nc01Var8.b, charSequence, z2, str6, nvi0Var), null, null, null, null, 4093))) {
                                break;
                            }
                            z2 = true;
                        }
                    }
                    r0 r0Var7 = pc01Var.d;
                    n0 n0Var = pc01Var.e;
                    nc01 nc01Var9 = (nc01) r0Var7.getValue();
                    vwp0 vwp0Var10 = nc01Var9.a;
                    vwp0 vwp0Var11 = nc01Var9.b;
                    boolean z3 = vwp0Var10.d;
                    if (z3 && vwp0Var11.d) {
                        String str7 = vwp0Var10.e;
                        if (str7 != null && (str = vwp0Var11.e) != null) {
                            kc01Var.r(new r(str7, str, 28));
                        }
                    } else if (z3) {
                        do {
                            value5 = r0Var7.getValue();
                            stationFocus2 = StationFocus.DESTINATION;
                        } while (!r0Var7.k(value5, nc01.a((nc01) value5, null, null, emptyList, null, stationFocus2, null, 3579)));
                        emit = n0Var.emit(new mc01(stationFocus2), this);
                    } else if (vwp0Var11.d) {
                        do {
                            value4 = r0Var7.getValue();
                            stationFocus = StationFocus.SOURCE;
                        } while (!r0Var7.k(value4, nc01.a((nc01) value4, null, null, emptyList, null, stationFocus, null, 3579)));
                        emit = n0Var.emit(new mc01(stationFocus), this);
                    }
                } else {
                    if (!(bc01Var instanceof wb01)) {
                        w511.b();
                        return null;
                    }
                    r0 r0Var8 = pc01Var.d;
                    do {
                        value = r0Var8.getValue();
                        wb01Var = (wb01) bc01Var;
                    } while (!r0Var8.k(value, nc01.a((nc01) value, null, null, null, null, wb01Var.a, null, 3583)));
                    nc01 nc01Var10 = (nc01) r0Var8.getValue();
                    int i5 = cc01.a[wb01Var.a.ordinal()];
                    if (i5 == 1) {
                        aVar.c.i(TransportRouteAnalytics$RouteOptionsTapButtonName.StopA, nc01Var10.l, nc01Var10.e, nc01Var10.k, nc01Var10.a.e, nc01Var10.b.e, Boolean.valueOf(nc01Var10.c.isEmpty()));
                        aVar.a(((nc01) r0Var8.getValue()).a.a.toString(), pc01Var, SuggestType.SOURCE);
                    } else if (i5 == 2) {
                        do {
                            value2 = r0Var8.getValue();
                        } while (!r0Var8.k(value2, nc01.a((nc01) value2, null, null, emptyList, null, null, null, 4091)));
                    } else {
                        if (i5 != 3) {
                            w511.b();
                            return null;
                        }
                        aVar.c.i(TransportRouteAnalytics$RouteOptionsTapButtonName.StopB, nc01Var10.l, nc01Var10.e, nc01Var10.k, nc01Var10.a.e, nc01Var10.b.e, Boolean.valueOf(nc01Var10.c.isEmpty()));
                        aVar.a(((nc01) r0Var8.getValue()).b.a.toString(), pc01Var, SuggestType.DESTINATION);
                    }
                }
            }
            return emit != coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        nc01 nc01Var11 = (nc01) pc01Var.d.getValue();
        p6o p6oVar = nc01Var11.h;
        vwp0 vwp0Var12 = nc01Var11.b;
        vwp0 vwp0Var13 = nc01Var11.a;
        b611 b611Var2 = aVar.c;
        if (p6oVar == null) {
            b611Var2.i(TransportRouteAnalytics$RouteOptionsTapButtonName.Back, nc01Var11.l, nc01Var11.e, nc01Var11.k, vwp0Var13.e, vwp0Var12.e, Boolean.valueOf(nc01Var11.c.isEmpty()));
        } else {
            b611Var2.g(TransportRouteAnalytics$RouteOptionsErrorButtonName.Back, nc01Var11.e, nc01Var11.k, vwp0Var13.e, vwp0Var12.e);
        }
        kc01Var.r(new qu(9));
        emit = zy11Var;
        if (emit != coroutineSingletons) {
        }
    }
}
