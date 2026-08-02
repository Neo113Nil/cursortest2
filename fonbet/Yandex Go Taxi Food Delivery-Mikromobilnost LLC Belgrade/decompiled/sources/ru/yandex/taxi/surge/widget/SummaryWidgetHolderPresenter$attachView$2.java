package ru.yandex.taxi.surge.widget;

import defpackage.hww0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.jrv0;
import defpackage.kgx;
import defpackage.krv0;
import defpackage.lrv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qdx;
import defpackage.qrv0;
import defpackage.rrv0;
import defpackage.srv0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tse0;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wls;
import defpackage.xcv0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.internal.g;
import ru.yandex.taxi.surge.interactor.SummaryWidgetOnBoardingInteractor$stateFlow$$inlined$flatMapLatest$1;
import ru.yandex.taxi.surge.interactor.SummaryWidgetOnBoardingInteractor$stateFlow$$inlined$flatMapLatest$2;
import ru.yandex.taxi.surge.interactor.d;
import ru.yandex.taxi.surge.interactor.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.widget.SummaryWidgetHolderPresenter$attachView$2", f = "SummaryWidgetHolderPresenter.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryWidgetHolderPresenter$attachView$2 extends SuspendLambda implements wls {
    final /* synthetic */ jrv0 $mvpView;
    int label;
    final /* synthetic */ lrv0 this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.surge.widget.SummaryWidgetHolderPresenter$attachView$2$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            srv0 srv0Var = (srv0) obj;
            lrv0 lrv0Var = (lrv0) this.receiver;
            lrv0Var.getClass();
            if (!jl40.l(srv0Var, qrv0.a)) {
                if (!(srv0Var instanceof rrv0)) {
                    w511.b();
                    return null;
                }
                xcv0 xcv0Var = lrv0Var.C.b;
                xcv0Var.a.a("Summary.SurgePopup.Shown", tse0.q(xcv0Var), 1, new HashMap());
                hww0 hww0Var = lrv0Var.y.c;
                AtomicBoolean atomicBoolean = hww0Var.b;
                qdx qdxVar = hww0Var.c;
                if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
                    kgx[] kgxVarArr = hww0.f;
                    qdxVar.setValue(hww0Var, kgxVarArr[0], Integer.valueOf(((Number) qdxVar.getValue(hww0Var, kgxVarArr[0])).intValue() + 1));
                }
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryWidgetHolderPresenter$attachView$2(lrv0 lrv0Var, jrv0 jrv0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lrv0Var;
        this.$mvpView = jrv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryWidgetHolderPresenter$attachView$2(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryWidgetHolderPresenter$attachView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            lrv0 lrv0Var = this.this$0;
            e eVar = lrv0Var.y;
            g X = kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new d(eVar.b.c())), new SummaryWidgetOnBoardingInteractor$stateFlow$$inlined$flatMapLatest$1(null, eVar, lrv0Var.F))), new SummaryWidgetOnBoardingInteractor$stateFlow$$inlined$flatMapLatest$2(null, eVar));
            lrv0 lrv0Var2 = this.this$0;
            jqr jqrVar = new jqr(X, new AnonymousClass1(2, lrv0Var2, lrv0.class, "handleOnBoardingState", "handleOnBoardingState(Lru/yandex/taxi/surge/widget/SummaryWidgetOnBoardingState;)V", 4), 3);
            lrv0Var2.B.getClass();
            tpr F = kotlinx.coroutines.flow.e.F(jqrVar, uyj.a);
            krv0 krv0Var = new krv0(this.$mvpView, 1);
            this.label = 1;
            if (F.collect(krv0Var, this) == coroutineSingletons) {
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
