package com.squareup.cash.cashapplite.presenters;

import com.squareup.cash.blockers.data.BlockersData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class PasskeySignatureBlockerPresenter$submitFormAndAdvance$1 extends ContinuationImpl {
    public BlockersData L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LiteCashInPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeySignatureBlockerPresenter$submitFormAndAdvance$1(LiteCashInPresenter liteCashInPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = liteCashInPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.submitFormAndAdvance(this);
    }
}
