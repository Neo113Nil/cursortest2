package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.AbstractC0193i4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.random.Random;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.workflow.network.ExponentialBackoffRetry$doNetworkCallWithRetries$2", f = "ExponentialBackoffRetry.kt", l = {32, 33}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class Y0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Ref$ObjectRef a;
    public int b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ Function1<Continuation<? super AbstractC0193i4<Object, ? extends Object>>, Object> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Y0(Ref$IntRef ref$IntRef, Ref$ObjectRef ref$ObjectRef, Function1<? super Continuation<? super AbstractC0193i4<Object, ? extends Object>>, ? extends Object> function1, Continuation<? super Y0> continuation) {
        super(2, continuation);
        this.c = ref$IntRef;
        this.d = ref$ObjectRef;
        this.e = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Y0(this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Y0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r5, r9) != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (r10 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0084 -> B:6:0x0087). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        AbstractC0193i4 abstractC0193i4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (this.c.element < 4) {
                abstractC0193i4 = (AbstractC0193i4) this.d.element;
                abstractC0193i4.getClass();
                if (abstractC0193i4 instanceof AbstractC0193i4.a) {
                }
                long pow = ((long) Math.pow(2.0d, this.c.element)) * 1000;
                Random.Default.getClass();
                long min = Math.min(Random.defaultRandom.nextLong(0L, pow) + pow, 32000L);
                this.a = null;
                this.b = 1;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef = this.a;
            SafeTrace.throwOnFailure(obj);
            ref$ObjectRef.element = obj;
            this.c.element++;
            if (this.c.element < 4 && ((AbstractC0193i4) this.d.element).a()) {
                abstractC0193i4 = (AbstractC0193i4) this.d.element;
                abstractC0193i4.getClass();
                if ((abstractC0193i4 instanceof AbstractC0193i4.a) || ((AbstractC0193i4.a) abstractC0193i4).b != 400) {
                    long pow2 = ((long) Math.pow(2.0d, this.c.element)) * 1000;
                    Random.Default.getClass();
                    long min2 = Math.min(Random.defaultRandom.nextLong(0L, pow2) + pow2, 32000L);
                    this.a = null;
                    this.b = 1;
                }
            }
            return Unit.INSTANCE;
        }
        SafeTrace.throwOnFailure(obj);
        ref$ObjectRef = this.d;
        Function1<Continuation<? super AbstractC0193i4<Object, ? extends Object>>, Object> function1 = this.e;
        this.a = ref$ObjectRef;
        this.b = 2;
        obj = function1.invoke(this);
    }
}
