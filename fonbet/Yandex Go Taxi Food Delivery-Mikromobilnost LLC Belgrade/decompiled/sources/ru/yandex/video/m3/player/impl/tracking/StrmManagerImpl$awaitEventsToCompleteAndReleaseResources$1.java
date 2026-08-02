package ru.yandex.video.m3.player.impl.tracking;

import defpackage.dse;
import defpackage.ie60;
import defpackage.jyc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8x;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.impl.tracking.StrmManagerImpl$awaitEventsToCompleteAndReleaseResources$1", f = "StrmManagerImpl.kt", l = {417}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class StrmManagerImpl$awaitEventsToCompleteAndReleaseResources$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ StrmManagerImpl this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
    @mvg(c = "ru.yandex.video.m3.player.impl.tracking.StrmManagerImpl$awaitEventsToCompleteAndReleaseResources$1$1", f = "StrmManagerImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.yandex.video.m3.player.impl.tracking.StrmManagerImpl$awaitEventsToCompleteAndReleaseResources$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ StrmManagerImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StrmManagerImpl strmManagerImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = strmManagerImpl;
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
            jyc jycVar;
            dse dseVar;
            ScheduledExecutorService scheduledExecutorService;
            boolean z;
            ScheduledExecutorService scheduledExecutorService2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            jycVar = this.this$0.eventTrackerSupervisorJob;
            ((s8x) jycVar).j0();
            dseVar = this.this$0.eventTrackerSupervisorJob;
            ((c) dseVar).a(null);
            scheduledExecutorService = this.this$0.playerAliveScheduledExecutorService;
            scheduledExecutorService.shutdownNow();
            z = this.this$0.shouldReleaseProvidedScheduledExecutorService;
            if (z) {
                scheduledExecutorService2 = this.this$0.scheduledExecutorService;
                scheduledExecutorService2.shutdown();
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrmManagerImpl$awaitEventsToCompleteAndReleaseResources$1(StrmManagerImpl strmManagerImpl, Continuation<? super StrmManagerImpl$awaitEventsToCompleteAndReleaseResources$1> continuation) {
        super(2, continuation);
        this.this$0 = strmManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new StrmManagerImpl$awaitEventsToCompleteAndReleaseResources$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((StrmManagerImpl$awaitEventsToCompleteAndReleaseResources$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ie60 ie60Var = ie60.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (tje.k0(ie60Var, anonymousClass1, this) == coroutineSingletons) {
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
