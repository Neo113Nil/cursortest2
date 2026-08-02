package com.squareup.cash.card.onboarding.core.instancing;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InstancedCardBatch$setUniqueCards$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public long J$0;
    public List L$0;
    public ArrayList L$5;
    public ArrayList L$6;
    public ArrayList L$7;
    public ArrayList L$8;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InstancedCardBatch this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstancedCardBatch$setUniqueCards$1(InstancedCardBatch instancedCardBatch, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = instancedCardBatch;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.setUniqueCards(null, this);
    }
}
