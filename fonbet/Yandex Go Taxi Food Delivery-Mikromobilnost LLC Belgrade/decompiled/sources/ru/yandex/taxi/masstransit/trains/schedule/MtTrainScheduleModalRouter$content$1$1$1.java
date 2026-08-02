package ru.yandex.taxi.masstransit.trains.schedule;

import defpackage.b611;
import defpackage.bb01;
import defpackage.db01;
import defpackage.eb01;
import defpackage.fb01;
import defpackage.gb01;
import defpackage.gg40;
import defpackage.gh40;
import defpackage.hb01;
import defpackage.ht;
import defpackage.hx41;
import defpackage.ib01;
import defpackage.ii40;
import defpackage.ix41;
import defpackage.jb01;
import defpackage.jl40;
import defpackage.jt;
import defpackage.kb01;
import defpackage.kt;
import defpackage.lb01;
import defpackage.m950;
import defpackage.mb01;
import defpackage.mvg;
import defpackage.nh40;
import defpackage.ny61;
import defpackage.ob01;
import defpackage.og40;
import defpackage.ox41;
import defpackage.pb01;
import defpackage.pj40;
import defpackage.qb01;
import defpackage.qu;
import defpackage.sg40;
import defpackage.tse;
import defpackage.uk10;
import defpackage.uk9;
import defpackage.w511;
import defpackage.wls;
import defpackage.xf40;
import defpackage.zg40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$RouteOptionsEntryPointSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$ScheduleButtonTypeV2;
import ru.yandex.taxi.masstransit.trains.search.StationSearchOpenReason;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.schedule.MtTrainScheduleModalRouter$content$1$1$1", f = "MtTrainScheduleModalRouter.kt", l = {65}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtTrainScheduleModalRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ mb01 $action;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTrainScheduleModalRouter$content$1$1$1(e eVar, mb01 mb01Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$action = mb01Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTrainScheduleModalRouter$content$1$1$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTrainScheduleModalRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x02af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02b0 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object d;
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
        e eVar = this.this$0;
        og40 og40Var = eVar.I;
        f fVar = eVar.S;
        mb01 mb01Var = this.$action;
        uk10 uk10Var = new uk10(eVar);
        this.label = 1;
        xf40 xf40Var = og40Var.a;
        xf40 xf40Var2 = og40Var.a;
        r0 r0Var = fVar.h;
        r0 r0Var2 = fVar.g;
        gh40 gh40Var = ((sg40) r0Var.getValue()).b;
        nh40 nh40Var = gh40Var != null ? gh40Var.e : null;
        gg40 b = fVar.b();
        String str = b.c;
        String str2 = b.b;
        String str3 = b.a;
        if (mb01Var instanceof db01) {
            kt ktVar = ((db01) mb01Var).a;
            if (ktVar instanceof ht) {
                b611.m(xf40Var.a, xf40Var.b.a, xf40Var.c, TransportRouteAnalytics$ScheduleButtonTypeV2.Filter, str3, str2, str, b.e, b.d, null, 1664);
                ht htVar = (ht) ktVar;
                eVar.A((m950) eVar.J.get(), new ii40(htVar.a, htVar.b, htVar.d, htVar.c, eVar.O, eVar.S), new d(eVar));
            } else {
                if (!(ktVar instanceof jt)) {
                    w511.b();
                    return null;
                }
                b611.m(xf40Var.a, xf40Var.b.a, xf40Var.c, TransportRouteAnalytics$ScheduleButtonTypeV2.Calendar, str3, str2, str, b.e, b.d, null, 1664);
                ix41 ix41Var = ((jt) ktVar).a;
                gg40 b2 = fVar.b();
                eVar.A((m950) eVar.K.get(), new ox41(ix41Var, new hx41(b2.a, b2.b, b2.c, b2.e, b2.d)), new b(eVar, ix41Var));
            }
        } else {
            boolean z = mb01Var instanceof ib01;
            pj40 pj40Var = pj40.c;
            if (z) {
                qb01 qb01Var = ((ib01) mb01Var).a;
                if (jl40.l(qb01Var, ob01.a)) {
                    b611.m(xf40Var2.a, xf40Var2.b.a, xf40Var2.c, TransportRouteAnalytics$ScheduleButtonTypeV2.Update, str3, str2, str, b.e, b.d, null, 1664);
                    d = fVar.d(((sg40) r0Var2.getValue()).a, pj40Var, this);
                    return d == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                if (!jl40.l(qb01Var, pb01.a)) {
                    w511.b();
                    return null;
                }
                uk10Var.i(og40.a(nh40Var, StationSearchOpenReason.OTHER, TransportRouteAnalytics$RouteOptionsEntryPointSource.Schedule));
            } else if (mb01Var instanceof fb01) {
                bb01 bb01Var = ((fb01) mb01Var).a;
                CharSequence charSequence = bb01Var.h;
                String obj2 = charSequence != null ? charSequence.toString() : null;
                b611.m(xf40Var.a, xf40Var.b.a, xf40Var.c, TransportRouteAnalytics$ScheduleButtonTypeV2.Buy, str3, str2, str, b.e, b.d, obj2, 1152);
                uk10Var.h(bb01Var);
            } else if (mb01Var instanceof gb01) {
                b611.m(xf40Var.a, xf40Var.b.a, xf40Var.c, TransportRouteAnalytics$ScheduleButtonTypeV2.TravelCard, str3, str2, str, b.e, b.d, null, 1664);
                bb01 bb01Var2 = ((gb01) mb01Var).a;
                if (bb01Var2.n.isEmpty()) {
                    uk10Var.h(bb01Var2);
                } else {
                    eVar.C((m950) eVar.N.get(), new uk9(7));
                }
            } else if (jl40.l(mb01Var, kb01.a)) {
                b611.m(xf40Var.a, xf40Var.b.a, xf40Var.c, TransportRouteAnalytics$ScheduleButtonTypeV2.StopA, str3, str2, str, b.e, b.d, null, 1664);
                uk10Var.i(og40.a(nh40Var, StationSearchOpenReason.SOURCE, TransportRouteAnalytics$RouteOptionsEntryPointSource.Schedule));
            } else if (jl40.l(mb01Var, hb01.a)) {
                b611.m(xf40Var.a, xf40Var.b.a, xf40Var.c, TransportRouteAnalytics$ScheduleButtonTypeV2.StopB, str3, str2, str, b.e, b.d, null, 1664);
                uk10Var.i(og40.a(nh40Var, StationSearchOpenReason.DEST, TransportRouteAnalytics$RouteOptionsEntryPointSource.Schedule));
            } else if (jl40.l(mb01Var, eb01.a)) {
                b611.m(xf40Var.a, xf40Var.b.a, xf40Var.c, TransportRouteAnalytics$ScheduleButtonTypeV2.Back, str3, str2, str, b.e, b.d, null, 1664);
                eVar.r(new qu(9));
            } else {
                if (jl40.l(mb01Var, lb01.a)) {
                    b611.m(xf40Var.a, xf40Var.b.a, xf40Var.c, TransportRouteAnalytics$ScheduleButtonTypeV2.Reverse, str3, str2, str, b.e, b.d, null, 1664);
                    zg40 zg40Var = ((sg40) r0Var2.getValue()).a;
                    d = fVar.d(zg40.a(zg40Var, null, zg40Var.c, zg40Var.b, null, Constants.VPN_TRAFFIC), pj40Var, this);
                } else {
                    if (!jl40.l(mb01Var, jb01.a)) {
                        w511.b();
                        return null;
                    }
                    b611.m(xf40Var2.a, xf40Var2.b.a, xf40Var2.c, TransportRouteAnalytics$ScheduleButtonTypeV2.Update, str3, str2, str, b.e, b.d, null, 1664);
                    d = fVar.d(((sg40) r0Var2.getValue()).a, pj40Var, this);
                }
                if (d == coroutineSingletons) {
                }
            }
        }
        d = zy11Var;
        if (d == coroutineSingletons) {
        }
    }
}
