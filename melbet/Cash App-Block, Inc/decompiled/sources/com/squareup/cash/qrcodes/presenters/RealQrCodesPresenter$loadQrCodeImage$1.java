package com.squareup.cash.qrcodes.presenters;

import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda10;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealQrCodesPresenter$loadQrCodeImage$1 extends ContinuationImpl {
    public TabToolbarsKt$$ExternalSyntheticLambda10 L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealQrCodesPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealQrCodesPresenter$loadQrCodeImage$1(RealQrCodesPresenter realQrCodesPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realQrCodesPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealQrCodesPresenter.access$loadQrCodeImage(this.this$0, null, null, null, this);
    }
}
