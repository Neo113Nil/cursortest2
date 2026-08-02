package ru.yandex.taxi.routeselector.presentation;

import defpackage.bms;
import defpackage.byb;
import defpackage.d0l0;
import defpackage.jqr;
import defpackage.lal0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.u0c0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.routeselector.presentation.RouteSelectorPresenter$attachView$3", f = "RouteSelectorPresenter.kt", l = {491}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteSelectorPresenter$attachView$3 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ s this$0;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ld0l0;", "route", "Lru/yandex/taxi/address/experiment/e;", ConfigConstants.CONFIG, "Lu0c0;", "pinStyles", "Lkotlin/Triple;", "<anonymous>", "(Ld0l0;Lru/yandex/taxi/address/experiment/e;Lu0c0;)Lkotlin/Triple;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.routeselector.presentation.RouteSelectorPresenter$attachView$3$2", f = "RouteSelectorPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.routeselector.presentation.RouteSelectorPresenter$attachView$3$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements bms {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        @Override // defpackage.bms
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(4, (Continuation) obj4);
            anonymousClass2.L$0 = (d0l0) obj;
            anonymousClass2.L$1 = (ru.yandex.taxi.address.experiment.e) obj2;
            anonymousClass2.L$2 = (u0c0) obj3;
            return anonymousClass2.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            d0l0 d0l0Var = (d0l0) this.L$0;
            ru.yandex.taxi.address.experiment.e eVar = (ru.yandex.taxi.address.experiment.e) this.L$1;
            u0c0 u0c0Var = (u0c0) this.L$2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return new Triple(d0l0Var, eVar, u0c0Var);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Triple;", "Ld0l0;", "Lru/yandex/taxi/address/experiment/e;", "Lu0c0;", "it", "Lzy11;", "<anonymous>", "(Lkotlin/Triple;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.routeselector.presentation.RouteSelectorPresenter$attachView$3$3", f = "RouteSelectorPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.routeselector.presentation.RouteSelectorPresenter$attachView$3$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ s this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(s sVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((Triple) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass3.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Triple triple = (Triple) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            byb bybVar = this.this$0.S;
            triple.toString();
            bybVar.getClass();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteSelectorPresenter$attachView$3(s sVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteSelectorPresenter$attachView$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteSelectorPresenter$attachView$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr f = this.this$0.y.f();
            com.yandex.go.taxi.tariffs.internal.repository.m g = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.this$0.M).g();
            s sVar = this.this$0;
            tpr t = kotlinx.coroutines.flow.e.t(new jqr(kotlinx.coroutines.flow.e.n(f, new r(g, sVar), ((ru.yandex.taxi.styling.f) sVar.O).d(null), new AnonymousClass2(4, null)), new AnonymousClass3(this.this$0, null), 3));
            s sVar2 = this.this$0;
            kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(t, new RouteSelectorPresenter$attachView$3$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            lal0 lal0Var = new lal0(sVar2, i2);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(lal0Var, this) == coroutineSingletons) {
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
