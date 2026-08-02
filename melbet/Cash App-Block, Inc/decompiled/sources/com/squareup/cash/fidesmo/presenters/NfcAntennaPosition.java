package com.squareup.cash.fidesmo.presenters;

/* loaded from: classes6.dex */
public final class NfcAntennaPosition {
    public final float xFromCentrelineMm;
    public final float yFromTopMm;

    public NfcAntennaPosition(float f, float f2) {
        this.xFromCentrelineMm = f;
        this.yFromTopMm = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NfcAntennaPosition)) {
            return false;
        }
        NfcAntennaPosition nfcAntennaPosition = (NfcAntennaPosition) obj;
        return Float.compare(this.xFromCentrelineMm, nfcAntennaPosition.xFromCentrelineMm) == 0 && Float.compare(this.yFromTopMm, nfcAntennaPosition.yFromTopMm) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.yFromTopMm) + (Float.hashCode(this.xFromCentrelineMm) * 31);
    }

    public final String toString() {
        return "NfcAntennaPosition(xFromCentrelineMm=" + this.xFromCentrelineMm + ", yFromTopMm=" + this.yFromTopMm + ")";
    }
}
