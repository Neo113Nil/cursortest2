package com.squareup.cash.family.familyhub.views;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class U13CelebrationViewKt$AutoplayCycler$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $autoplayGeneration;
    public final /* synthetic */ Function1 $onCycle;
    public final /* synthetic */ boolean $shouldFloat;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U13CelebrationViewKt$AutoplayCycler$1$1(int i, Continuation continuation, Function1 function1, boolean z) {
        super(2, continuation);
        this.$shouldFloat = z;
        this.$autoplayGeneration = i;
        this.$onCycle = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new U13CelebrationViewKt$AutoplayCycler$1$1(this.$autoplayGeneration, continuation, this.$onCycle, this.$shouldFloat);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((U13CelebrationViewKt$AutoplayCycler$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (r6.$onCycle.invoke(r6) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r4, r6) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (!this.$shouldFloat) {
                return Unit.INSTANCE;
            }
            long j = this.$autoplayGeneration == 0 ? 1200L : 1900L;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        this.label = 2;
    }
}
