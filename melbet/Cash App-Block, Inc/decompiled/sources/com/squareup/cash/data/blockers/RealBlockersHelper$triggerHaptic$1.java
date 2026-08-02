package com.squareup.cash.data.blockers;

import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealBlockersHelper$triggerHaptic$1 extends ContinuationImpl {
    public BlockerAction.HapticFeedbackAction L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBlockersHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBlockersHelper$triggerHaptic$1(RealBlockersHelper realBlockersHelper, Continuation continuation) {
        super(continuation);
        this.this$0 = realBlockersHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.triggerHaptic(null, this);
    }
}
