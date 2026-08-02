package ru.yandex.taxi.logistics.postcard.presentation;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.ife0;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ofe0;
import defpackage.puh;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.ysa1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.postcard.presentation.PostcardController$subscribeOnPostcardUpdates$1", f = "PostcardController.kt", l = {43}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PostcardController$subscribeOnPostcardUpdates$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.logistics.postcard.presentation.PostcardController$subscribeOnPostcardUpdates$1$1", f = "PostcardController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.logistics.postcard.presentation.PostcardController$subscribeOnPostcardUpdates$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ c this$0;

        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        /* renamed from: ru.yandex.taxi.logistics.postcard.presentation.PostcardController$subscribeOnPostcardUpdates$1$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C01051 extends AdaptedFunctionReference implements wls {
            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                ife0 ife0Var = (ife0) obj;
                c cVar = (c) this.receiver;
                cVar.getClass();
                if (ife0Var == null) {
                    w511.b();
                    return null;
                }
                puh a = ife0Var.a();
                cVar.a.a(new ofe0(a.b(), ysa1.c(a)));
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, c cVar) {
            super(2, continuation);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.this$0);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c cVar = this.this$0;
            kotlinx.coroutines.flow.e.H(tseVar, new jqr(kotlinx.coroutines.flow.e.X(new m0(cVar.a.f, cVar.d.c(), new PostcardController$getNavCommandFlow$1(null, cVar)), new PostcardController$getNavCommandFlow$$inlined$flatMapLatest$1(null, cVar)), new C01051(2, this.this$0, c.class, "navigate", "navigate(Lru/yandex/taxi/logistics/postcard/presentation/PostcardController$Command;)V", 4), 3));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostcardController$subscribeOnPostcardUpdates$1(Continuation continuation, c cVar) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PostcardController$subscribeOnPostcardUpdates$1(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PostcardController$subscribeOnPostcardUpdates$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            Lifecycle lifecycle = cVar.f;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, cVar);
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
