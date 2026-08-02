package com.squareup.cash.shopping.backend.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealShippingAddressRepository$getShippingAddress$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealShippingAddressRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealShippingAddressRepository$getShippingAddress$1(RealShippingAddressRepository realShippingAddressRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realShippingAddressRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getShippingAddress(this);
    }
}
