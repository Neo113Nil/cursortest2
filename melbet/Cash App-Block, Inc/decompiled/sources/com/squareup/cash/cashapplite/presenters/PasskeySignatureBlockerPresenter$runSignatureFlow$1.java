package com.squareup.cash.cashapplite.presenters;

import com.squareup.protos.cash.cashliteorchestrator.api.v1.BuildAndPrepareUserOpResponse;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PasskeySignatureBlockerPresenter$runSignatureFlow$1 extends ContinuationImpl {
    public BuildAndPrepareUserOpResponse L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LiteCashInPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeySignatureBlockerPresenter$runSignatureFlow$1(LiteCashInPresenter liteCashInPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = liteCashInPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LiteCashInPresenter.access$runSignatureFlow(this.this$0, this);
    }
}
