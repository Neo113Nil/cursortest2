package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.InitVerificationFlowState", f = "InitVerificationFlowState.kt", l = {40}, m = "onProcess")
/* loaded from: classes4.dex */
final class InitVerificationFlowState$onProcess$1 extends ContinuationImpl {
    public g a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitVerificationFlowState$onProcess$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(null, this);
    }
}
