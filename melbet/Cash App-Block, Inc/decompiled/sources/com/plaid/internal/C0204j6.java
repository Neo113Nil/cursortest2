package com.plaid.internal;

import com.plaid.link.SubmissionData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController$setSubmissionData$2", f = "PreloadLinkController.kt", l = {}, m = "invokeSuspend")
/* renamed from: com.plaid.internal.j6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0204j6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ P5 a;
    public final /* synthetic */ SubmissionData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0204j6(P5 p5, SubmissionData submissionData, Continuation<? super C0204j6> continuation) {
        super(2, continuation);
        this.a = p5;
        this.b = submissionData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0204j6(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C0204j6(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        this.a.a(this.b.getPhoneNumber(), this.b.getDateOfBirth(), this.b.getParams());
        return Unit.INSTANCE;
    }
}
