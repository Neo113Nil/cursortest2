package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class udt0 implements vdt0 {
    public final float a;

    public udt0(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof udt0) && Float.compare(this.a, ((udt0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return x4e.f("Zoom(zoom=", Extension.C_BRAKE, this.a);
    }
}
