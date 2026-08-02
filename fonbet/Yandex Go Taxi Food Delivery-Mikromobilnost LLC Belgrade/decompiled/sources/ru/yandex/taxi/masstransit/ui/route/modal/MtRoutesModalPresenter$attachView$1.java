package ru.yandex.taxi.masstransit.ui.route.modal;

import defpackage.jx30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pi30;
import defpackage.tls;
import defpackage.tse;
import defpackage.vx30;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.domain.h0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.ui.route.modal.MtRoutesModalPresenter$attachView$1", f = "MtRoutesModalPresenter.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtRoutesModalPresenter$attachView$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ jx30 this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.ui.route.modal.MtRoutesModalPresenter$attachView$1$1", f = "MtRoutesModalPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.ui.route.modal.MtRoutesModalPresenter$attachView$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        int label;
        final /* synthetic */ jx30 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(jx30 jx30Var, Continuation continuation) {
            super(1, continuation);
            this.this$0 = jx30Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((Continuation) obj);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            ((vx30) this.this$0.x.a).r(new pi30(16));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtRoutesModalPresenter$attachView$1(jx30 jx30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jx30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtRoutesModalPresenter$attachView$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtRoutesModalPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            jx30 jx30Var = this.this$0;
            h0 h0Var = jx30Var.A;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(jx30Var, null);
            this.label = 1;
            if (h0Var.a(anonymousClass1, this) == coroutineSingletons) {
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
