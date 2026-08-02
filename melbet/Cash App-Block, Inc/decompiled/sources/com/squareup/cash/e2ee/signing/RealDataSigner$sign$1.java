package com.squareup.cash.e2ee.signing;

import com.google.zxing.BinaryBitmap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealDataSigner$sign$1 extends ContinuationImpl {
    public byte[] L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BinaryBitmap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDataSigner$sign$1(BinaryBitmap binaryBitmap, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = binaryBitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.sign(null, this);
    }
}
