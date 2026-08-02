package com.squareup.cash.biometrics;

/* loaded from: classes4.dex */
public final class CashBiometricsInfo {
    public final Biometrics$Info changeSettings;
    public final Biometrics$Info moveFunds;
    public final Biometrics$Info unlock;

    public CashBiometricsInfo(Biometrics$Info biometrics$Info, Biometrics$Info biometrics$Info2, Biometrics$Info biometrics$Info3) {
        this.moveFunds = biometrics$Info;
        this.changeSettings = biometrics$Info2;
        this.unlock = biometrics$Info3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashBiometricsInfo)) {
            return false;
        }
        CashBiometricsInfo cashBiometricsInfo = (CashBiometricsInfo) obj;
        return this.moveFunds.equals(cashBiometricsInfo.moveFunds) && this.changeSettings.equals(cashBiometricsInfo.changeSettings) && this.unlock.equals(cashBiometricsInfo.unlock);
    }

    public final int hashCode() {
        return this.unlock.hashCode() + ((this.changeSettings.hashCode() + (this.moveFunds.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CashBiometricsInfo(moveFunds=" + this.moveFunds + ", changeSettings=" + this.changeSettings + ", unlock=" + this.unlock + ")";
    }
}
