package com.squareup.cash.card.onboarding.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ContouredMarquee$startMarquee$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float $resumeFromOffset;
    public long J$0;
    public int label;
    public final /* synthetic */ ContouredMarquee this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContouredMarquee$startMarquee$1(ContouredMarquee contouredMarquee, float f, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = contouredMarquee;
        this.$resumeFromOffset = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        float f = this.$resumeFromOffset;
        ContouredMarquee contouredMarquee = this.this$0;
        switch (i) {
            case 0:
                return new ContouredMarquee$startMarquee$1(contouredMarquee, f, continuation, 0);
            default:
                return new ContouredMarquee$startMarquee$1(contouredMarquee, f, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
            case 0:
                ((ContouredMarquee$startMarquee$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            default:
                return ((ContouredMarquee$startMarquee$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long nanoTime;
        long j;
        long nanoTime2;
        long j2;
        int i = this.$r8$classId;
        ContouredMarquee contouredMarquee = this.this$0;
        float f = this.$resumeFromOffset;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    nanoTime = System.nanoTime();
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nanoTime = this.J$0;
                    SafeTrace.throwOnFailure(obj);
                }
                do {
                    contouredMarquee.setOffset.invoke(new Float(f - ((((System.nanoTime() - nanoTime) / 1000000) % 5000) / 5000.0f)));
                    contouredMarquee.onFrame.invoke();
                    j = contouredMarquee.frameDelayMs;
                    this.J$0 = nanoTime;
                    this.label = 1;
                } while (JobKt.delay(j, this) != coroutineSingletons);
                return coroutineSingletons;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    nanoTime2 = System.nanoTime();
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nanoTime2 = this.J$0;
                    SafeTrace.throwOnFailure(obj);
                }
                do {
                    long nanoTime3 = (System.nanoTime() - nanoTime2) / 1000000;
                    if (nanoTime3 >= 1000) {
                        contouredMarquee.setOffset.invoke(new Float(f - 0.099999994f));
                        contouredMarquee.onFrame.invoke();
                        return Unit.INSTANCE;
                    }
                    float f2 = 1.0f - (nanoTime3 / 1000.0f);
                    contouredMarquee.setOffset.invoke(new Float(((-0.099999994f) * (1.0f - (f2 * f2))) + f));
                    contouredMarquee.onFrame.invoke();
                    j2 = contouredMarquee.frameDelayMs;
                    this.J$0 = nanoTime2;
                    this.label = 1;
                } while (JobKt.delay(j2, this) != coroutineSingletons2);
                return coroutineSingletons2;
        }
    }
}
