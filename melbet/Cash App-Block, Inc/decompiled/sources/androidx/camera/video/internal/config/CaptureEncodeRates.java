package androidx.camera.video.internal.config;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class CaptureEncodeRates {
    public final int captureRate;
    public final int encodeRate;

    public CaptureEncodeRates(int i, int i2) {
        this.captureRate = i;
        this.encodeRate = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptureEncodeRates)) {
            return false;
        }
        CaptureEncodeRates captureEncodeRates = (CaptureEncodeRates) obj;
        return this.captureRate == captureEncodeRates.captureRate && this.encodeRate == captureEncodeRates.encodeRate;
    }

    public final int hashCode() {
        return Integer.hashCode(this.encodeRate) + (Integer.hashCode(this.captureRate) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CaptureEncodeRates(captureRate=");
        sb.append(this.captureRate);
        sb.append(", encodeRate=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.encodeRate, ')');
    }
}
