package com.squareup.cash.blockers.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.commonmark.node.Node;

/* loaded from: classes10.dex */
public final class RealMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Node this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9(Node node, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = node;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.resolve((Function1) null, this);
    }
}
