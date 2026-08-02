package com.squareup.cash.multiplatform.bitcoin.parsers;

import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealBitcoinAddressParserKt$tryParseBase58Address$1 extends ContinuationImpl {
    public String L$0;
    public Set L$1;
    public int label;
    public /* synthetic */ Object result;

    public RealBitcoinAddressParserKt$tryParseBase58Address$1(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealBitcoinAddressParserKt.access$tryParseBase58Address(null, null, this);
    }
}
