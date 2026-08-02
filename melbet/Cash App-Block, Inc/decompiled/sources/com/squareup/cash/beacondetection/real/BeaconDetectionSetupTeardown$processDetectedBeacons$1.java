package com.squareup.cash.beacondetection.real;

import coil3.memory.RealStrongMemoryCache;
import com.squareup.cash.beacondetection.api.BeaconProximity;
import com.squareup.cash.beacondetection.api.IBeaconDevice;
import com.squareup.cash.beacondetection.api.LocationPermissionLevel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferedChannel;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class BeaconDetectionSetupTeardown$processDetectedBeacons$1 extends ContinuationImpl {
    public CoroutineScope L$0;
    public Double L$10;
    public RealStrongMemoryCache L$2;
    public BeaconRegionTracker L$3;
    public LocationPermissionLevel L$4;
    public Job L$5;
    public BufferedChannel.BufferedChannelIterator L$6;
    public IBeaconDevice L$7;
    public BeaconProximity L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BeaconDetectionSetupTeardown this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeaconDetectionSetupTeardown$processDetectedBeacons$1(BeaconDetectionSetupTeardown beaconDetectionSetupTeardown, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = beaconDetectionSetupTeardown;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return BeaconDetectionSetupTeardown.access$processDetectedBeacons(this.this$0, null, null, null, null, null, this);
    }
}
