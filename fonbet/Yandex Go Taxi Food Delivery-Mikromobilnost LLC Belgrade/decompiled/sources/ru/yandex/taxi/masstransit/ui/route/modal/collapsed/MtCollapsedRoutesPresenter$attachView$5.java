package ru.yandex.taxi.masstransit.ui.route.modal.collapsed;

import defpackage.e040;
import defpackage.i0z;
import defpackage.igl0;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.n1f;
import defpackage.ny61;
import defpackage.pi00;
import defpackage.qoi0;
import defpackage.su30;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vu30;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesPresenter$attachView$5", f = "MtCollapsedRoutesPresenter.kt", l = {162}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtCollapsedRoutesPresenter$attachView$5 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le040;", "uiState", "Lzy11;", "<anonymous>", "(Le040;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesPresenter$attachView$5$1", f = "MtCollapsedRoutesPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesPresenter$attachView$5$1, reason: invalid class name */
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
            d dVar = this.this$0;
            if (e040Var instanceof igl0) {
                dVar.getClass();
            } else {
                dVar.Lg(EmptyList.a, e040Var, null);
            }
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/Pair;", "", "Led30;", "Le040;", "promosInfo", "Lsu30;", "selectedRoute", "Lkotlin/Triple;", "<anonymous>", "(Lkotlin/Pair;Lsu30;)Lkotlin/Triple;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesPresenter$attachView$5$4", f = "MtCollapsedRoutesPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesPresenter$attachView$5$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(3, (Continuation) obj3);
            anonymousClass4.L$0 = (Pair) obj;
            anonymousClass4.L$1 = (su30) obj2;
            return anonymousClass4.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.L$0;
            su30 su30Var = (su30) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return new Triple(pair.c(), pair.f(), su30Var);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtCollapsedRoutesPresenter$attachView$5(Continuation continuation, d dVar) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtCollapsedRoutesPresenter$attachView$5(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtCollapsedRoutesPresenter$attachView$5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = e.t(new m0(e.X(e.s(new n1f(8, new jqr(this.this$0.A.b(), new AnonymousClass1(null, this.this$0), 3), qoi0.a(igl0.class)), new i0z(18)), new MtCollapsedRoutesPresenter$attachView$5$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0)), new ru.yandex.taxi.masstransit.holder.b(e.s(e.d(this.this$0.A.a.i), new vu30(2))), new AnonymousClass4(3, null)));
            pi00 pi00Var = new pi00(12, this.this$0);
            this.label = 1;
            if (t.collect(pi00Var, this) == coroutineSingletons) {
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
