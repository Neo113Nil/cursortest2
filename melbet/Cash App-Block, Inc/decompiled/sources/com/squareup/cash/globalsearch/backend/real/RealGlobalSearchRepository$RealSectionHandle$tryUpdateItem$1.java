package com.squareup.cash.globalsearch.backend.real;

import com.squareup.cash.globalsearch.backend.real.RealGlobalSearchRepository;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealGlobalSearchRepository$RealSectionHandle$tryUpdateItem$1 extends ContinuationImpl {
    public String L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealGlobalSearchRepository.RealSectionHandle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGlobalSearchRepository$RealSectionHandle$tryUpdateItem$1(RealGlobalSearchRepository.RealSectionHandle realSectionHandle, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realSectionHandle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.tryUpdateItem(null, this);
    }
}
