package com.squareup.cash.mri.android;

import com.squareup.cash.keystore.AttestedKeyService;
import com.squareup.protos.cash.deviceintegritly.api.SendSignedMRIContextRequest;
import com.squareup.protos.cash.security.mri.api.v1.MRIContext;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class MobileRuntimeIntegrityWorker$buildSignedRequest$1 extends ContinuationImpl {
    public MRIContext L$0;
    public Map L$1;
    public AttestedKeyService L$2;
    public SendSignedMRIContextRequest L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MobileRuntimeIntegrityWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileRuntimeIntegrityWorker$buildSignedRequest$1(MobileRuntimeIntegrityWorker mobileRuntimeIntegrityWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mobileRuntimeIntegrityWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return MobileRuntimeIntegrityWorker.access$buildSignedRequest(this.this$0, null, null, this);
    }
}
