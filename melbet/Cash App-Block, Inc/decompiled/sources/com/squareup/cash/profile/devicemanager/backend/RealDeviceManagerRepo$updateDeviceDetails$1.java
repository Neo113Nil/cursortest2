package com.squareup.cash.profile.devicemanager.backend;

import com.squareup.cash.devicegrip.service.UpdateDeviceDetailsRequest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealDeviceManagerRepo$updateDeviceDetails$1 extends ContinuationImpl {
    public UpdateDeviceDetailsRequest L$0;
    public String L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealDeviceManagerRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDeviceManagerRepo$updateDeviceDetails$1(RealDeviceManagerRepo realDeviceManagerRepo, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realDeviceManagerRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.updateDeviceDetails(this);
    }
}
