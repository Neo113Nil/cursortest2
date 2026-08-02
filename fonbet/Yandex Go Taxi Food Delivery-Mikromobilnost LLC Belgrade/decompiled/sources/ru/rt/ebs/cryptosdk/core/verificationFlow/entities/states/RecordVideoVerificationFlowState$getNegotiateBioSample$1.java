package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.RecordVideoVerificationFlowState", f = "RecordVideoVerificationFlowState.kt", l = {46}, m = "getNegotiateBioSample")
/* loaded from: classes4.dex */
final class RecordVideoVerificationFlowState$getNegotiateBioSample$1 extends ContinuationImpl {
    public i a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordVideoVerificationFlowState$getNegotiateBioSample$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.m(this);
    }
}
