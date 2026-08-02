package com.squareup.cash.beacondetection.real;

import com.squareup.cash.beacondetection.api.IBeaconDevice;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.Channel;

/* loaded from: classes4.dex */
public final /* synthetic */ class BeaconDetectionSetupTeardown$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Channel f$0;

    public /* synthetic */ BeaconDetectionSetupTeardown$$ExternalSyntheticLambda1(Channel channel, int i) {
        this.$r8$classId = i;
        this.f$0 = channel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Channel channel = this.f$0;
        IBeaconDevice iBeaconDevice = (IBeaconDevice) obj;
        switch (i) {
            case 0:
                iBeaconDevice.getClass();
                channel.mo1159trySendJP2dKIU(iBeaconDevice);
                break;
            case 1:
                iBeaconDevice.getClass();
                channel.mo1159trySendJP2dKIU(iBeaconDevice);
                break;
            default:
                iBeaconDevice.getClass();
                channel.mo1159trySendJP2dKIU(iBeaconDevice);
                break;
        }
        return Unit.INSTANCE;
    }
}
