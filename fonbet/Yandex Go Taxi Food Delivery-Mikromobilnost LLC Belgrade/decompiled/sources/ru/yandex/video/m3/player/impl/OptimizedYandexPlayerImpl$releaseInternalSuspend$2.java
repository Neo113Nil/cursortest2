package ru.yandex.video.m3.player.impl;

import defpackage.h5z0;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.observers.InternalPlayerObserver;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", CA20Status.STATUS_CERTIFICATE_H, "Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl$releaseInternalSuspend$2", f = "OptimizedYandexPlayerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class OptimizedYandexPlayerImpl$releaseInternalSuspend$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptimizedYandexPlayerImpl<H> this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", CA20Status.STATUS_CERTIFICATE_H, "Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
    @mvg(c = "ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl$releaseInternalSuspend$2$1", f = "OptimizedYandexPlayerImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl$releaseInternalSuspend$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ OptimizedYandexPlayerImpl<H> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OptimizedYandexPlayerImpl<H> optimizedYandexPlayerImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = optimizedYandexPlayerImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
            return ((AnonymousClass1) create(tseVar, continuation)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            HashSet H0;
            Object failure;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            ObserverDispatcher observerDispatcher = ((OptimizedYandexPlayerImpl) this.this$0).internalObservers;
            synchronized (observerDispatcher.getObservers()) {
                H0 = kotlin.collections.a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((InternalPlayerObserver) it.next()).onPlayerReleased();
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", CA20Status.STATUS_CERTIFICATE_H, "Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
    @mvg(c = "ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl$releaseInternalSuspend$2$2", f = "OptimizedYandexPlayerImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.yandex.video.m3.player.impl.OptimizedYandexPlayerImpl$releaseInternalSuspend$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ OptimizedYandexPlayerImpl<H> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OptimizedYandexPlayerImpl<H> optimizedYandexPlayerImpl, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = optimizedYandexPlayerImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
            return ((AnonymousClass2) create(tseVar, continuation)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            this.this$0.commonReleaseBlock();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptimizedYandexPlayerImpl$releaseInternalSuspend$2(OptimizedYandexPlayerImpl<H> optimizedYandexPlayerImpl, Continuation<? super OptimizedYandexPlayerImpl$releaseInternalSuspend$2> continuation) {
        super(2, continuation);
        this.this$0 = optimizedYandexPlayerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        OptimizedYandexPlayerImpl$releaseInternalSuspend$2 optimizedYandexPlayerImpl$releaseInternalSuspend$2 = new OptimizedYandexPlayerImpl$releaseInternalSuspend$2(this.this$0, continuation);
        optimizedYandexPlayerImpl$releaseInternalSuspend$2.L$0 = obj;
        return optimizedYandexPlayerImpl$releaseInternalSuspend$2;
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super l8x> continuation) {
        return ((OptimizedYandexPlayerImpl$releaseInternalSuspend$2) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        tse tseVar = (tse) this.L$0;
        tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, null), 3);
        return tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
    }
}
