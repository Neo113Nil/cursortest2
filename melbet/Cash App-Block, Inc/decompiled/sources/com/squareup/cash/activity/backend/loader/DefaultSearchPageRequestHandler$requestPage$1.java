package com.squareup.cash.activity.backend.loader;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class DefaultSearchPageRequestHandler$requestPage$1 extends ContinuationImpl {
    public DefaultSearchPageRequestHandler L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultSearchPageRequestHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSearchPageRequestHandler$requestPage$1(DefaultSearchPageRequestHandler defaultSearchPageRequestHandler, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = defaultSearchPageRequestHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return DefaultSearchPageRequestHandler.requestPage$suspendImpl(this.this$0, null, null, this);
    }
}
