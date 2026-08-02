package com.squareup.cash.savings.presenters;

import app.cash.local.presenters.LocalEditorialPresenter;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.savings.screens.TransferProcessingScreen;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class TransferringPresenter$startTransferFlow$1 extends ContinuationImpl {
    public TransferProcessingScreen.Direction L$0;
    public OpenSourceKt$$ExternalSyntheticLambda11 L$1;
    public String L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LocalEditorialPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferringPresenter$startTransferFlow$1(LocalEditorialPresenter localEditorialPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = localEditorialPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LocalEditorialPresenter.access$startTransferFlow(this.this$0, null, null, this);
    }
}
