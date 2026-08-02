package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.RecordVideoVerificationFlowState", f = "RecordVideoVerificationFlowState.kt", l = {34}, m = "getValue")
/* loaded from: classes4.dex */
final class RecordVideoVerificationFlowState$getValue$1<T> extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ i b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordVideoVerificationFlowState$getValue$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.getValue(null, this);
    }
}
