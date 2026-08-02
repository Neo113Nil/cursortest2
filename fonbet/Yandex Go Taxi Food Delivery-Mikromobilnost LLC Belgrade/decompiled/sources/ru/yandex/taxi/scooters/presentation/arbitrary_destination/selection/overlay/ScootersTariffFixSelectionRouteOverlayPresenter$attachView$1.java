package ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.overlay;

import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x33;
import defpackage.y4p0;
import defpackage.z4p0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.overlay.ScootersTariffFixSelectionRouteOverlayPresenter$attachView$1", f = "ScootersTariffFixSelectionRouteOverlayPresenter.kt", l = {19}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersTariffFixSelectionRouteOverlayPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ y4p0 $mvpView;
    int label;
    final /* synthetic */ z4p0 this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx33;", "it", "Lzy11;", "<anonymous>", "(Lx33;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.overlay.ScootersTariffFixSelectionRouteOverlayPresenter$attachView$1$1", f = "ScootersTariffFixSelectionRouteOverlayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.overlay.ScootersTariffFixSelectionRouteOverlayPresenter$attachView$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ y4p0 $mvpView;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(y4p0 y4p0Var, Continuation continuation) {
            super(2, continuation);
            this.$mvpView = y4p0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mvpView, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((x33) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            x33 x33Var = (x33) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            this.$mvpView.k9(x33Var);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersTariffFixSelectionRouteOverlayPresenter$attachView$1(z4p0 z4p0Var, y4p0 y4p0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = z4p0Var;
        this.$mvpView = y4p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersTariffFixSelectionRouteOverlayPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersTariffFixSelectionRouteOverlayPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            jqr b = this.this$0.y.b();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mvpView, null);
            this.label = 1;
            if (e.k(b, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
