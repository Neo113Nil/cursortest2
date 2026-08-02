package com.squareup.cash.attribution;

import com.squareup.cash.attribution.InstallAttributer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class InstallAttributer$handleClearAdvertisingId$1 extends ContinuationImpl {
    public InstallAttributer.State L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InstallAttributer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallAttributer$handleClearAdvertisingId$1(InstallAttributer installAttributer, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = installAttributer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.handleClearAdvertisingId(null, null, this);
    }
}
