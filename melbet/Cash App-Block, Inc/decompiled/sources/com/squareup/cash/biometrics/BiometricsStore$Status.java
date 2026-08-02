package com.squareup.cash.biometrics;

import com.squareup.cash.biometrics.Biometrics$AuthenticationStatus;

/* loaded from: classes7.dex */
public final class BiometricsStore$Status {
    public static final BiometricsStore$Status Ready = new BiometricsStore$Status(true, Biometrics$AuthenticationStatus.BiometricsEnrolled.INSTANCE);
    public final Biometrics$AuthenticationStatus biometricsStatus;
    public final boolean hardwareSupported;
    public final boolean ready;
    public final boolean secureStoreSupported;

    public BiometricsStore$Status(boolean z, Biometrics$AuthenticationStatus biometrics$AuthenticationStatus) {
        this.secureStoreSupported = z;
        this.biometricsStatus = biometrics$AuthenticationStatus;
        boolean z2 = false;
        this.ready = z && (biometrics$AuthenticationStatus instanceof Biometrics$AuthenticationStatus.BiometricsEnrolled);
        if (z && !(biometrics$AuthenticationStatus instanceof Biometrics$AuthenticationStatus.HardwareNotSupported)) {
            z2 = true;
        }
        this.hardwareSupported = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiometricsStore$Status)) {
            return false;
        }
        BiometricsStore$Status biometricsStore$Status = (BiometricsStore$Status) obj;
        return this.secureStoreSupported == biometricsStore$Status.secureStoreSupported && this.biometricsStatus.equals(biometricsStore$Status.biometricsStatus);
    }

    public final int hashCode() {
        return this.biometricsStatus.hashCode() + (Boolean.hashCode(this.secureStoreSupported) * 31);
    }

    public final String toString() {
        return "Status(secureStoreSupported=" + this.secureStoreSupported + ", biometricsStatus=" + this.biometricsStatus + ")";
    }
}
