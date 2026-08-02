package ru.yandex.taxi.masstransit.main.ui.overlay;

import defpackage.ifu0;
import defpackage.jqr;
import defpackage.kfu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pfu0;
import defpackage.qfu0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.wo30;
import defpackage.xo30;
import defpackage.yo30;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.main.ui.overlay.MtMainOverlayPresenter$attachView$1", f = "MtMainOverlayPresenter.kt", l = {159}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtMainOverlayPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ wo30 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ yo30 this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.masstransit.main.ui.overlay.MtMainOverlayPresenter$attachView$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            Object obj3;
            pfu0 pfu0Var = (pfu0) obj;
            yo30 yo30Var = (yo30) this.receiver;
            if (pfu0Var != null) {
                yo30Var.getClass();
                obj3 = new kfu0(pfu0Var.a.a);
            } else {
                obj3 = ifu0.a;
            }
            r0 r0Var = yo30Var.B.a;
            r0Var.getClass();
            r0Var.m(null, obj3);
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqfu0;", "it", "Lzy11;", "<anonymous>", "(Lqfu0;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.main.ui.overlay.MtMainOverlayPresenter$attachView$1$3", f = "MtMainOverlayPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.main.ui.overlay.MtMainOverlayPresenter$attachView$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        final /* synthetic */ wo30 $mvpView;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(wo30 wo30Var, Continuation continuation) {
            super(2, continuation);
            this.$mvpView = wo30Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$mvpView, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((qfu0) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass3.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            qfu0 qfu0Var = (qfu0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.$mvpView.e5(qfu0Var);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtMainOverlayPresenter$attachView$1(yo30 yo30Var, wo30 wo30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = yo30Var;
        this.$mvpView = wo30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtMainOverlayPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtMainOverlayPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr b = this.this$0.A.b();
            yo30 yo30Var = this.this$0;
            c cVar = new c(new jqr(b, new AnonymousClass1(2, yo30Var, yo30.class, "handleStopState", "handleStopState(Lru/yandex/taxi/masstransit/stopbubble/model/StopBubbleState;)V", 4), 3), yo30Var);
            yo30Var.z.getClass();
            o oVar = new o(e.X(new jqr(e.F(cVar, uyj.a), new AnonymousClass3(this.$mvpView, null), 3), new MtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1(this.this$0, null)), new MtMainOverlayPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            xo30 xo30Var = new xo30();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(xo30Var, this) == coroutineSingletons) {
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
