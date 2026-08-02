package ru.yandex.taxi.order;

import com.yandex.go.taxi.order.perf.experiment.TaxiOrderPerfTweaksExperiment;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import defpackage.fs70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.ww70;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.OrderFragmentPresenter$attachView$5", f = "OrderFragmentPresenter.kt", l = {226}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class OrderFragmentPresenter$attachView$5 extends SuspendLambda implements wls {
    final /* synthetic */ ww70 $mvpView;
    Object L$0;
    int label;
    final /* synthetic */ i this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.order.OrderFragmentPresenter$attachView$5$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((ww70) this.receiver).findViewById(((Number) obj).intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderFragmentPresenter$attachView$5(i iVar, ww70 ww70Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$mvpView = ww70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderFragmentPresenter$attachView$5(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderFragmentPresenter$attachView$5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            TaxiOrderPerfTweaksExperiment.DelayType delayType = this.this$0.w0.b().i;
            int i2 = delayType == null ? -1 : com.yandex.go.taxi.order.perf.experiment.c.a[delayType.ordinal()];
            TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : TaxiOrderSessionCheckpoint.LCP : TaxiOrderSessionCheckpoint.LCP_DEFAULTS : TaxiOrderSessionCheckpoint.FCP;
            com.yandex.go.taxi.order.perf.a aVar = this.this$0.x0;
            fs70 fs70Var = new fs70(14);
            this.L$0 = null;
            this.label = 1;
            if (aVar.a(taxiOrderSessionCheckpoint, fs70Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ((com.yandex.go.taxi.order.chat.navigation.a) this.this$0.t0.get()).a(new AnonymousClass2(1, this.$mvpView, ww70.class, "findViewById", "findViewById(I)Landroid/view/View;", 0));
        return zy11.a;
    }
}
