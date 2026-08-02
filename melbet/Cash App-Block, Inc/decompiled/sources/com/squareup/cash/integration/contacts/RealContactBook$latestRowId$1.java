package com.squareup.cash.integration.contacts;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealContactBook$latestRowId$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealContactBook this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealContactBook$latestRowId$1(RealContactBook realContactBook, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realContactBook;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.latestRowId(0L, null, this);
    }
}
