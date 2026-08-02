package ru.yandex.taxi.masstransit.ui.route.modal.expanded;

import defpackage.ij30;
import defpackage.jqr;
import defpackage.kj30;
import defpackage.lj30;
import defpackage.lvj0;
import defpackage.mdh;
import defpackage.mth;
import defpackage.mvg;
import defpackage.n1j;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$VehicleType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.ui.route.modal.expanded.MtExpandedRoutesPresenter$attachView$1", f = "MtExpandedRoutesPresenter.kt", l = {lvj0.NOT_MODIFIED}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtExpandedRoutesPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ ij30 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ lj30 this$0;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", "Ln1j;", "", "", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.ui.route.modal.expanded.MtExpandedRoutesPresenter$attachView$1$1", f = "MtExpandedRoutesPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.ui.route.modal.expanded.MtExpandedRoutesPresenter$attachView$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ lj30 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(lj30 lj30Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = lj30Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((Pair) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar = ((n1j) pair.getFirst()).b.h;
            if ((aVar.a() || aVar.b()) && !this.this$0.L) {
                ArrayList arrayList = new ArrayList();
                if (aVar.a()) {
                    arrayList.add(TransportRouteAnalytics$VehicleType.Aeroexpress.getEventValue());
                }
                if (aVar.b()) {
                    arrayList.add(TransportRouteAnalytics$VehicleType.Suburban.getEventValue());
                }
                this.this$0.B.d(arrayList, TransportRouteAnalytics$DetailCardSource.Transport, TransportRouteAnalytics$DetailCardType.Horizontal);
                this.this$0.L = true;
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtExpandedRoutesPresenter$attachView$1(lj30 lj30Var, ij30 ij30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lj30Var;
        this.$mvpView = ij30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtExpandedRoutesPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtExpandedRoutesPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            lj30 lj30Var = this.this$0;
            jqr jqrVar = new jqr(e.X(new mth(new j0(null, lj30Var.D.b(e.X(lj30Var.K, new MtExpandedRoutesPresenter$paymentTicketsFlow$$inlined$flatMapLatest$1(lj30Var, null))), new MtExpandedRoutesPresenter$updateLocalState$$inlined$withPreviousEmit$1(3, null)), 6), new MtExpandedRoutesPresenter$updateLocalState$$inlined$flatMapLatest$1(lj30Var, null)), new AnonymousClass1(this.this$0, null), 3);
            lj30 lj30Var2 = this.this$0;
            b bVar = new b(jqrVar, lj30Var2);
            lj30Var2.y.getClass();
            sjh sjhVar = uyj.a;
            tpr F = e.F(bVar, mdh.b);
            ij30 ij30Var = this.$mvpView;
            o oVar = new o(F, new MtExpandedRoutesPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            kj30 kj30Var = new kj30(ij30Var, 0);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(kj30Var, this) == coroutineSingletons) {
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
