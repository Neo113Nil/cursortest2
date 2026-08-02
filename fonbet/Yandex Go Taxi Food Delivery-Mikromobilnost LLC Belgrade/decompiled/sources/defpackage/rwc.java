package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class rwc {
    public final boolean a;
    public final float b;

    public rwc(boolean z, float f) {
        this.a = z;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwc)) {
            return false;
        }
        rwc rwcVar = (rwc) obj;
        return this.a == rwcVar.a && Float.compare(this.b, rwcVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CompassState(isCompassButtonsVisible=" + this.a + ", azimuth=" + this.b + Extension.C_BRAKE;
    }
}
