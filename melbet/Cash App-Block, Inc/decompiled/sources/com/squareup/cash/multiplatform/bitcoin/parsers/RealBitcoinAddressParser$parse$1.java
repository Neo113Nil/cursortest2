package com.squareup.cash.multiplatform.bitcoin.parsers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealBitcoinAddressParser$parse$1 extends ContinuationImpl {
    public String L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBitcoinAddressParser this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBitcoinAddressParser$parse$1(RealBitcoinAddressParser realBitcoinAddressParser, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realBitcoinAddressParser;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.parse(null, this);
    }
}
