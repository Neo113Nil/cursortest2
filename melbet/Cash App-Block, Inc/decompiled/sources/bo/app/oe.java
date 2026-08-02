package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;

/* loaded from: classes3.dex */
public final class oe {
    public final int a;
    public final int b;

    public oe(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe)) {
            return false;
        }
        oe oeVar = (oe) obj;
        return this.a == oeVar.a && this.b == oeVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline2.m(this.a, this.b, "RateLimitEndpointConfig(capacity=", ", refillRate=", ")");
    }
}
