package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.flows;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "ru.rt.ebs.cryptosdk.core.verificationFlow.entities.flows.BaseVerificationFlow", f = "BaseVerificationFlow.kt", l = {60}, m = "startProcessingStateChangingJob")
/* loaded from: classes4.dex */
final class BaseVerificationFlow$startProcessingStateChangingJob$1 extends ContinuationImpl {
    public a a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseVerificationFlow$startProcessingStateChangingJob$1(a aVar, Continuation continuation) {
        super(continuation);
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
