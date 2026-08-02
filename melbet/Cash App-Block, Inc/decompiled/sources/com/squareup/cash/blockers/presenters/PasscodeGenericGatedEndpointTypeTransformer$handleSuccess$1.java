package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.presenters.PasscodeGatedEndpoint;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class PasscodeGenericGatedEndpointTypeTransformer$handleSuccess$1 extends ContinuationImpl {
    public int I$0;
    public PasscodeGatedEndpoint.Response.Success L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PasscodeGenericGatedEndpointTypeTransformer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasscodeGenericGatedEndpointTypeTransformer$handleSuccess$1(PasscodeGenericGatedEndpointTypeTransformer passcodeGenericGatedEndpointTypeTransformer, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = passcodeGenericGatedEndpointTypeTransformer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return PasscodeGenericGatedEndpointTypeTransformer.access$handleSuccess(this.this$0, null, null, 0, this);
    }
}
