package com.squareup.cash.crypto.address;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealCryptoInvoiceParser$parse$1 extends ContinuationImpl {
    public long J$0;
    public Ref$ObjectRef L$1;
    public Ref$ObjectRef L$2;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealCryptoInvoiceParser this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealCryptoInvoiceParser$parse$1(RealCryptoInvoiceParser realCryptoInvoiceParser, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realCryptoInvoiceParser;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.parse(null, false, this);
    }
}
