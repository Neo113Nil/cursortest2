package com.squareup.cash.blockers.flow;

import com.google.zxing.BinaryBitmap;
import com.squareup.protos.franklin.app.UploadFileRequest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$5 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BinaryBitmap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealMultiBlockerFacilitator$SingleBlockerResolver$resolve$5(BinaryBitmap binaryBitmap, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = binaryBitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.resolve((UploadFileRequest) null, this);
    }
}
