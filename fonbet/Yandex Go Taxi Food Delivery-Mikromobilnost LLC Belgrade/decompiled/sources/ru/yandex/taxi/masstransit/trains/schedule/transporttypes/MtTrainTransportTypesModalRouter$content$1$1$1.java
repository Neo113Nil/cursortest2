package ru.yandex.taxi.masstransit.trains.schedule.transporttypes;

import defpackage.gg40;
import defpackage.hi40;
import defpackage.ii40;
import defpackage.jl40;
import defpackage.li40;
import defpackage.mi40;
import defpackage.mvg;
import defpackage.na11;
import defpackage.ni40;
import defpackage.ny61;
import defpackage.oi40;
import defpackage.pi40;
import defpackage.qu;
import defpackage.si40;
import defpackage.ti40;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.x240;
import defpackage.xf40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$ScheduleTransportFilterButtonType;
import ru.yandex.taxi.masstransit.trains.schedule.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.schedule.transporttypes.MtTrainTransportTypesModalRouter$content$1$1$1", f = "MtTrainTransportTypesModalRouter.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtTrainTransportTypesModalRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ oi40 $action;
    int label;
    final /* synthetic */ hi40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTrainTransportTypesModalRouter$content$1$1$1(hi40 hi40Var, oi40 oi40Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hi40Var;
        this.$action = oi40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTrainTransportTypesModalRouter$content$1$1$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTrainTransportTypesModalRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        si40 si40Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        hi40 hi40Var = this.this$0;
        oi40 oi40Var = this.$action;
        this.label = 1;
        ii40 ii40Var = hi40Var.J;
        if (ii40Var != null) {
            pi40 pi40Var = hi40Var.I;
            ti40 ti40Var = hi40Var.H;
            na11 na11Var = ii40Var.d;
            String str = na11Var.a;
            String str2 = na11Var.b;
            xf40 xf40Var = ii40Var.e;
            f fVar = ii40Var.f;
            pi40Var.getClass();
            gg40 b = fVar.b();
            String str3 = b.c;
            String str4 = b.b;
            String str5 = b.a;
            if (oi40Var instanceof li40) {
                na11 na11Var2 = ((li40) oi40Var).a;
                xf40Var.a.l(xf40Var.c, str5, str4, str3, str, TransportRouteAnalytics$ScheduleTransportFilterButtonType.Apply, b.e, str2, na11Var2.b);
                hi40Var.r(new x240(12, na11Var2));
            } else if (oi40Var instanceof ni40) {
                na11 na11Var3 = ((ni40) oi40Var).a;
                r0 r0Var = ti40Var.a;
                do {
                    value = r0Var.getValue();
                    si40Var = (si40) value;
                } while (!r0Var.k(value, new si40(si40Var.a, si40Var.b, na11Var3, si40Var.d)));
                xf40Var.a.l(xf40Var.c, str5, str4, str3, str, TransportRouteAnalytics$ScheduleTransportFilterButtonType.SelectItem, b.e, str2, na11Var3.b);
            } else {
                if (!jl40.l(oi40Var, mi40.a)) {
                    w511.b();
                    return null;
                }
                xf40Var.a.l(xf40Var.c, str5, str4, str3, str, TransportRouteAnalytics$ScheduleTransportFilterButtonType.Back, b.e, str2, null);
                hi40Var.r(new qu(9));
            }
        }
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
