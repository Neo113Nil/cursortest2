package ru.yandex.taxi.masstransit.trains.routedetails;

import defpackage.av30;
import defpackage.bv30;
import defpackage.cv30;
import defpackage.dv30;
import defpackage.f2l0;
import defpackage.g2l0;
import defpackage.gb40;
import defpackage.h2l0;
import defpackage.i2l0;
import defpackage.j2l0;
import defpackage.jl40;
import defpackage.k2l0;
import defpackage.l2l0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.v2l0;
import defpackage.w2l0;
import defpackage.w511;
import defpackage.wls;
import defpackage.xu30;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.routedetails.MtRouteDetailsModalRouter$content$1$1$1", f = "MtRouteDetailsModalRouter.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtRouteDetailsModalRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ l2l0 $action;
    int label;
    final /* synthetic */ cv30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtRouteDetailsModalRouter$content$1$1$1(cv30 cv30Var, l2l0 l2l0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cv30Var;
        this.$action = l2l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtRouteDetailsModalRouter$content$1$1$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtRouteDetailsModalRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
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
        cv30 cv30Var = this.this$0;
        l2l0 l2l0Var = this.$action;
        this.label = 1;
        xu30 xu30Var = cv30Var.I;
        dv30 dv30Var = cv30Var.H;
        xu30Var.getClass();
        if (jl40.l(l2l0Var, f2l0.a)) {
            cv30Var.r(new qu(9));
        } else if (jl40.l(l2l0Var, g2l0.a)) {
            cv30Var.D((m950) cv30Var.J.get(), gb40.f, new av30(cv30Var, 0));
        } else if (jl40.l(l2l0Var, h2l0.a)) {
            r0 r0Var = dv30Var.a;
            do {
                value2 = r0Var.getValue();
            } while (!r0Var.k(value2, w2l0.a((w2l0) value2, false)));
        } else if (jl40.l(l2l0Var, i2l0.a)) {
            r0 r0Var2 = dv30Var.a;
            do {
                value = r0Var2.getValue();
            } while (!r0Var2.k(value, w2l0.a((w2l0) value, true)));
        } else if (l2l0Var instanceof k2l0) {
            cv30Var.D((m950) cv30Var.K.get(), new v2l0(((k2l0) l2l0Var).a), new bv30());
        } else if (!jl40.l(l2l0Var, j2l0.a)) {
            w511.b();
            return null;
        }
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
