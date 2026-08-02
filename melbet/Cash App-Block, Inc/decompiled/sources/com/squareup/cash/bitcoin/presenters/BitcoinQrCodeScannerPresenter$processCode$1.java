package com.squareup.cash.bitcoin.presenters;

import com.squareup.cash.bitcoin.presenters.BitcoinQrCodeScannerPresenter$State;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class BitcoinQrCodeScannerPresenter$processCode$1 extends ContinuationImpl {
    public BitcoinQrCodeScannerPresenter$State.ProcessingCode L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ProfilePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinQrCodeScannerPresenter$processCode$1(ProfilePresenter profilePresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = profilePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ProfilePresenter.access$processCode(this.this$0, null, this);
    }
}
