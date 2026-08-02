package com.squareup.cash.deposits.physical.backend.real.retailer;

import com.squareup.scannerview.SizeMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class RealAtmRetailerLocationManager$retailersNearLocation$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SizeMap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAtmRetailerLocationManager$retailersNearLocation$1(SizeMap sizeMap, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sizeMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.retailersNearLocation(0.0d, 0.0d, 0.0d, this);
    }
}
