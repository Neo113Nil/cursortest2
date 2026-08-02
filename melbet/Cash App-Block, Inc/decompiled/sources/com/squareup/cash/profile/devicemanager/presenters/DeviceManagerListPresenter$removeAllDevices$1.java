package com.squareup.cash.profile.devicemanager.presenters;

import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class DeviceManagerListPresenter$removeAllDevices$1 extends ContinuationImpl {
    public int I$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PdfPreviewPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceManagerListPresenter$removeAllDevices$1(PdfPreviewPresenter pdfPreviewPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pdfPreviewPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return PdfPreviewPresenter.access$removeAllDevices(this.this$0, 0, this);
    }
}
