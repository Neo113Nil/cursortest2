package com.squareup.cash.beacondetection.real;

import com.squareup.cash.beacondetection.api.DetectionContext;
import com.squareup.cash.beacondetection.api.LocationPermissionLevel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class BeaconDetectionSetupTeardown$logRegionEvent$1 extends ContinuationImpl {
    public DetectionContext L$0;
    public LocationPermissionLevel L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BeaconDetectionSetupTeardown this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeaconDetectionSetupTeardown$logRegionEvent$1(BeaconDetectionSetupTeardown beaconDetectionSetupTeardown, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = beaconDetectionSetupTeardown;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.logRegionEvent(null, null, this);
    }
}
