package com.squareup.cash.fidesmo.views.haptic;

import com.google.zxing.BinaryBitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ProvisioningHaptics {
    public final WaveformHapticPattern disconnect;
    public final WaveformHapticPattern failure;
    public final WaveformHapticPattern holdConfirmed;
    public final WaveformHapticPattern holdRamp;
    public final WaveformHapticPattern nfcConnectPop;
    public final BinaryBitmap player;
    public final WaveformHapticPattern stepTurnGearPop;
    public final WaveformHapticPattern success;

    public ProvisioningHaptics(BinaryBitmap binaryBitmap, WaveformHapticPattern waveformHapticPattern, WaveformHapticPattern waveformHapticPattern2, WaveformHapticPattern waveformHapticPattern3, WaveformHapticPattern waveformHapticPattern4, WaveformHapticPattern waveformHapticPattern5, WaveformHapticPattern waveformHapticPattern6, WaveformHapticPattern waveformHapticPattern7) {
        waveformHapticPattern.getClass();
        waveformHapticPattern2.getClass();
        waveformHapticPattern3.getClass();
        waveformHapticPattern4.getClass();
        waveformHapticPattern5.getClass();
        waveformHapticPattern6.getClass();
        waveformHapticPattern7.getClass();
        this.player = binaryBitmap;
        this.nfcConnectPop = waveformHapticPattern;
        this.holdRamp = waveformHapticPattern2;
        this.holdConfirmed = waveformHapticPattern3;
        this.stepTurnGearPop = waveformHapticPattern4;
        this.success = waveformHapticPattern5;
        this.failure = waveformHapticPattern6;
        this.disconnect = waveformHapticPattern7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProvisioningHaptics) {
            ProvisioningHaptics provisioningHaptics = (ProvisioningHaptics) obj;
            if (this.player == provisioningHaptics.player && Intrinsics.areEqual(this.nfcConnectPop, provisioningHaptics.nfcConnectPop) && Intrinsics.areEqual(this.holdRamp, provisioningHaptics.holdRamp) && Intrinsics.areEqual(this.holdConfirmed, provisioningHaptics.holdConfirmed) && Intrinsics.areEqual(this.stepTurnGearPop, provisioningHaptics.stepTurnGearPop) && Intrinsics.areEqual(this.success, provisioningHaptics.success) && Intrinsics.areEqual(this.failure, provisioningHaptics.failure) && Intrinsics.areEqual(this.disconnect, provisioningHaptics.disconnect)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.disconnect.hashCode() + ((this.failure.hashCode() + ((this.success.hashCode() + ((this.stepTurnGearPop.hashCode() + ((this.holdConfirmed.hashCode() + ((this.holdRamp.hashCode() + ((this.nfcConnectPop.hashCode() + (this.player.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ProvisioningHaptics(player=" + this.player + ", nfcConnectPop=" + this.nfcConnectPop + ", holdRamp=" + this.holdRamp + ", holdConfirmed=" + this.holdConfirmed + ", stepTurnGearPop=" + this.stepTurnGearPop + ", success=" + this.success + ", failure=" + this.failure + ", disconnect=" + this.disconnect + ")";
    }
}
