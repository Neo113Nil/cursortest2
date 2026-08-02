package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.C0095a6;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.link.LinkActivityViewModel$startLinkEventQueue$1", f = "LinkActivityViewModel.kt", l = {90}, m = "invokeSuspend")
/* renamed from: com.plaid.internal.k2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0209k2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C0200j2 c;

    @DebugMetadata(c = "com.plaid.internal.link.LinkActivityViewModel$startLinkEventQueue$1$1", f = "LinkActivityViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.plaid.internal.k2$a */
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ LinkEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LinkEvent linkEvent, Continuation<? super a> continuation) {
            super(2, continuation);
            this.a = linkEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.a, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new a(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            SafeTrace.throwOnFailure(obj);
            C0095a6.a.a(C0095a6.a, "delivering " + this.a);
            Plaid.INSTANCE.getCustomerFacingLinkEventListenerInternal$link_sdk_release().invoke(this.a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0209k2(C0200j2 c0200j2, Continuation<? super C0209k2> continuation) {
        super(2, continuation);
        this.c = c0200j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C0209k2 c0209k2 = new C0209k2(this.c, continuation);
        c0209k2.b = obj;
        return c0209k2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C0209k2 c0209k2 = new C0209k2(this.c, (Continuation) obj2);
        c0209k2.b = (CoroutineScope) obj;
        return c0209k2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.b;
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            coroutineScope = (CoroutineScope) this.b;
            try {
                SafeTrace.throwOnFailure(obj);
            } catch (CancellationException unused) {
                C0095a6.a.e(C0095a6.a, "Link event consumer has ended. This is normal at the end of the activity lifecycle.If it occurs at any other time, it may result in loss of link events delivered.");
                return Unit.INSTANCE;
            }
        }
        while (JobKt.isActive(coroutineScope)) {
            A2 a2 = this.c.e;
            if (a2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("linkEventQueue");
                throw null;
            }
            DelayedC0332y0 poll = a2.a.poll(200L, TimeUnit.MILLISECONDS);
            LinkEvent linkEvent = poll != null ? poll.a : null;
            if (linkEvent != null) {
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                a aVar = new a(linkEvent, null);
                this.b = coroutineScope;
                this.a = 1;
                if (JobKt.withContext(handlerContext, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
