package com.squareup.cash.beacondetection.real;

import androidx.emoji2.text.MetadataRepo;
import com.squareup.cash.appforeground.AppForegroundState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes4.dex */
public final class BeaconDetectionSetupTeardown$startForegroundOnlyScanning$2 implements FlowCollector {
    public final /* synthetic */ Channel $channel;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MetadataRepo $scanner;

    public /* synthetic */ BeaconDetectionSetupTeardown$startForegroundOnlyScanning$2(MetadataRepo metadataRepo, Channel channel, int i) {
        this.$r8$classId = i;
        this.$scanner = metadataRepo;
        this.$channel = channel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Channel channel = this.$channel;
        MetadataRepo metadataRepo = this.$scanner;
        switch (i) {
            case 0:
                int ordinal = ((AppForegroundState) obj).ordinal();
                if (ordinal == 0) {
                    metadataRepo.startScanning(true, new BeaconDetectionSetupTeardown$$ExternalSyntheticLambda1(channel, 2));
                } else if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    metadataRepo.stopScanning();
                }
                break;
            default:
                boolean z = ((AppForegroundState) obj) == AppForegroundState.FOREGROUND;
                metadataRepo.stopScanning();
                metadataRepo.startScanning(z, new BeaconDetectionSetupTeardown$$ExternalSyntheticLambda1(channel, 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
