package com.squareup.cash.qrcodes.presenters;

import com.squareup.cash.integration.analytics.Analytics;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class CashQrScannerPresenter$trackScanMainQrCode$1 extends ContinuationImpl {
    public Analytics L$0;
    public String L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CashQrScannerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashQrScannerPresenter$trackScanMainQrCode$1(CashQrScannerPresenter cashQrScannerPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cashQrScannerPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return CashQrScannerPresenter.access$trackScanMainQrCode(this.this$0, null, null, false, this);
    }
}
