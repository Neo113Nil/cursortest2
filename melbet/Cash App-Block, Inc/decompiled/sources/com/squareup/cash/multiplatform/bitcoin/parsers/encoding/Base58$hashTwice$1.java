package com.squareup.cash.multiplatform.bitcoin.parsers.encoding;

import com.google.mlkit.vision.text.internal.zzr;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class Base58$hashTwice$1 extends ContinuationImpl {
    public zzr L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Base58 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Base58$hashTwice$1(Base58 base58, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = base58;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.hashTwice(null, this);
    }
}
