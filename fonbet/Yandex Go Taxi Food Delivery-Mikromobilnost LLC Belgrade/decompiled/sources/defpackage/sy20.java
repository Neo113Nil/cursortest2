package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class sy20 implements uy20 {
    public final float a;

    public sy20(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sy20) && Float.compare(this.a, ((sy20) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return x4e.f("RatioToWidth(value=", Extension.C_BRAKE, this.a);
    }
}
