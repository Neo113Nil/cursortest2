package com.squareup.cash.fileupload.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealFileUploadService$uploadFileViaStreaming$1 extends ContinuationImpl {
    public String L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealFileUploadService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealFileUploadService$uploadFileViaStreaming$1(RealFileUploadService realFileUploadService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realFileUploadService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.m3559uploadFileViaStreamingnmrlmFc(null, null, null, null, this);
    }
}
