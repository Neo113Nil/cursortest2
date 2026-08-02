package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class u7z0 implements w7z0 {
    public final float a;

    public u7z0(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u7z0) && Float.compare(this.a, ((u7z0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return x4e.f("Loaded(barHeightFraction=", Extension.C_BRAKE, this.a);
    }
}
