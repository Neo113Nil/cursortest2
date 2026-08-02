package com.squareup.cash.beacondetection.real;

import androidx.emoji2.text.MetadataRepo;
import coil3.memory.RealStrongMemoryCache;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class BeaconDetectionSetupTeardown$runDetection$1 extends ContinuationImpl {
    public MetadataRepo L$1;
    public RealStrongMemoryCache L$2;
    public BeaconRegionTracker L$3;
    public BufferedChannel L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BeaconDetectionSetupTeardown this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeaconDetectionSetupTeardown$runDetection$1(BeaconDetectionSetupTeardown beaconDetectionSetupTeardown, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = beaconDetectionSetupTeardown;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return BeaconDetectionSetupTeardown.access$runDetection(this.this$0, this);
    }
}
