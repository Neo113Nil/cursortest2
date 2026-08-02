package com.squareup.cash.activity.backend.contacts;

import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealDeviceContactItemTransformer$transformActivityItem$1 extends ContinuationImpl {
    public FormattedPaymentHistoryActivityItem L$0;
    public ActivityItemGlobalId L$1;
    public String L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealDeviceContactItemTransformer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDeviceContactItemTransformer$transformActivityItem$1(RealDeviceContactItemTransformer realDeviceContactItemTransformer, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realDeviceContactItemTransformer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.transformActivityItem(null, null, this);
    }
}
