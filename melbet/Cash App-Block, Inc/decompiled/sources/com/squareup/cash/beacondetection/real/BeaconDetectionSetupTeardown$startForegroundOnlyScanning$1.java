package com.squareup.cash.beacondetection.real;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class BeaconDetectionSetupTeardown$startForegroundOnlyScanning$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BeaconDetectionSetupTeardown this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeaconDetectionSetupTeardown$startForegroundOnlyScanning$1(BeaconDetectionSetupTeardown beaconDetectionSetupTeardown, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = beaconDetectionSetupTeardown;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        BeaconDetectionSetupTeardown.access$startForegroundOnlyScanning(this.this$0, null, null, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
