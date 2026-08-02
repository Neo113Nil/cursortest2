package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.presenters.FilesetUploadPresenter;
import com.squareup.cash.fileupload.api.ImageFormatConverter$ConversionResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class FilesetUploadPresenter$uploadFile$1 extends ContinuationImpl {
    public FilesetUploadPresenter.UriToUpload L$0;
    public String L$1;
    public ImageFormatConverter$ConversionResult L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FilesetUploadPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesetUploadPresenter$uploadFile$1(FilesetUploadPresenter filesetUploadPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = filesetUploadPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return FilesetUploadPresenter.access$uploadFile(this.this$0, null, this);
    }
}
