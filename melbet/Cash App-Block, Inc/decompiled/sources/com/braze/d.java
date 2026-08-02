package com.braze;

import bo.app.y0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class d extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Braze e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ Function0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z, Object obj, boolean z2, boolean z3, Braze braze, Function2 function2, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.a = z;
        this.b = obj;
        this.c = z2;
        this.d = z3;
        this.e = braze;
        this.f = function2;
        this.g = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        if (this.a && Braze.INSTANCE.isDisabled()) {
            return this.b;
        }
        if (this.c && Braze.INSTANCE.isDelayedInitializationEnabled()) {
            return this.b;
        }
        return JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new y0(this.d, this.e, this.b, this.f, this.g, null));
    }
}
