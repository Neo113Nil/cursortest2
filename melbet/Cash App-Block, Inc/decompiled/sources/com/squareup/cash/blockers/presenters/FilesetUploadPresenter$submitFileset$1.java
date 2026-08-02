package com.squareup.cash.blockers.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class FilesetUploadPresenter$submitFileset$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FilesetUploadPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesetUploadPresenter$submitFileset$1(FilesetUploadPresenter filesetUploadPresenter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = filesetUploadPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return FilesetUploadPresenter.access$submitFileset(this.this$0, null, null, this);
    }
}
