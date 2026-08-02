package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class z041 {
    public final boolean a;
    public final float b;

    public z041(boolean z, float f) {
        this.a = z;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z041)) {
            return false;
        }
        z041 z041Var = (z041) obj;
        return this.a == z041Var.a && Float.compare(this.b, z041Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "WalkNavCompassFabState(isVisible=" + this.a + ", azimuth=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ z041(int i) {
        this(false, 0.0f);
    }

    public z041() {
        this(0);
    }
}
