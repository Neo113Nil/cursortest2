package com.squareup.cash.cashapplite.presenters;

import com.squareup.protos.cash.cashliteorchestrator.api.v1.SignatureRequest;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PasskeySignatureBlockerPresenter$signAllRequests$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Collection L$3;
    public Iterator L$4;
    public SignatureRequest L$6;
    public Collection L$8;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LiteCashInPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeySignatureBlockerPresenter$signAllRequests$1(LiteCashInPresenter liteCashInPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = liteCashInPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.signAllRequests(null, this);
    }
}
