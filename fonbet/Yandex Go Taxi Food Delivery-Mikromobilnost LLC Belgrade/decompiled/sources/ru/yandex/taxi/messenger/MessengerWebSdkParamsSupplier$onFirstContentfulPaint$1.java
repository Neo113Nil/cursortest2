package ru.yandex.taxi.messenger;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.messenger.MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1", f = "MessengerWebSdkParamsSupplier.kt", l = {100}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.messenger.MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1", f = "MessengerWebSdkParamsSupplier.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.messenger.MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, e eVar) {
            super(2, continuation);
            this.this$0 = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(continuation, this.this$0);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
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
            kotlin.b.b(obj);
            tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(new c(ru.yandex.taxi.experiments.d.b(this.this$0.j)), new MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0)));
            e eVar = this.this$0;
            tje.N(eVar.c, null, null, new MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$1(t, null, eVar), 3);
            tpr t2 = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(new c(ru.yandex.taxi.experiments.d.b(this.this$0.j)), new MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$flatMapLatest$2(null, this.this$0)));
            e eVar2 = this.this$0;
            tje.N(eVar2.c, null, null, new MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2(t2, null, eVar2), 3);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1(Continuation continuation, e eVar) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            Lifecycle lifecycle = eVar.d;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, eVar);
            this.label = 1;
            if (b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
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
