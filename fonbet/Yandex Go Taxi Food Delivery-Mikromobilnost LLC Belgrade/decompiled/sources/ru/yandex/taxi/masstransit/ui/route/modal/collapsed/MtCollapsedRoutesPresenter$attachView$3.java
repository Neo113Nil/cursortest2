package ru.yandex.taxi.masstransit.ui.route.modal.collapsed;

import defpackage.b611;
import defpackage.e040;
import defpackage.ezy;
import defpackage.hzy;
import defpackage.igl0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.kd60;
import defpackage.me30;
import defpackage.mvg;
import defpackage.ne30;
import defpackage.ny61;
import defpackage.ob60;
import defpackage.smw0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.yw30;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesPresenter$attachView$3", f = "MtCollapsedRoutesPresenter.kt", l = {440}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtCollapsedRoutesPresenter$attachView$3 extends SuspendLambda implements wls {
    final /* synthetic */ me30 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le040;", "it", "Lzy11;", "<anonymous>", "(Le040;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesPresenter$attachView$3$1", f = "MtCollapsedRoutesPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesPresenter$attachView$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, d dVar) {
            super(2, continuation);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.this$0);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((e040) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            e040 e040Var = (e040) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            yw30 yw30Var = this.this$0.B;
            if (jl40.l(e040Var, hzy.a)) {
                b611 b611Var = yw30Var.a;
                b611Var.a.a("TransportRoute.Loading.Error", smw0.o(b611Var), 1, new HashMap());
            } else if (jl40.l(e040Var, ob60.a)) {
                b611 b611Var2 = yw30Var.a;
                b611Var2.a.a("TransportRoute.NoPointB.Error", smw0.o(b611Var2), 1, new HashMap());
            } else if (jl40.l(e040Var, kd60.a)) {
                b611 b611Var3 = yw30Var.a;
                b611Var3.a.a("TransportRoute.NoRoutes.Error", smw0.o(b611Var3), 1, new HashMap());
            } else if (!(e040Var instanceof ezy) && !(e040Var instanceof igl0)) {
                w511.b();
                return null;
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtCollapsedRoutesPresenter$attachView$3(d dVar, me30 me30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$mvpView = me30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtCollapsedRoutesPresenter$attachView$3(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtCollapsedRoutesPresenter$attachView$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            jqr jqrVar = new jqr(this.this$0.A.b(), new AnonymousClass1(null, this.this$0), 3);
            me30 me30Var = this.$mvpView;
            o oVar = new o(jqrVar, new MtCollapsedRoutesPresenter$attachView$3$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            ne30 ne30Var = new ne30(me30Var, 1);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(ne30Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
