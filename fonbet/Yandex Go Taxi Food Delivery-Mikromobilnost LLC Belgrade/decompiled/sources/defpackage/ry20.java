package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ry20 implements uy20 {
    public final float a;

    public ry20(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ry20) && Float.compare(this.a, ((ry20) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return x4e.f("FixedDp(value=", Extension.C_BRAKE, this.a);
    }
}
