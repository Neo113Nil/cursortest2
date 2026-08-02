package com.squareup.cash.discover.promotiondetails.backend.real;

import com.squareup.scannerview.SizeMap;
import com.squareup.wire.ProtoAdapter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class RealTreehouseDetailsPageProvider$getDetailsPage$1 extends ContinuationImpl {
    public ProtoAdapter L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SizeMap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTreehouseDetailsPageProvider$getDetailsPage$1(SizeMap sizeMap, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sizeMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getDetailsPage(null, this);
    }
}
