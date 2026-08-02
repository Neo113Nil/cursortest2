package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wgr0 {
    public final float a;
    public final float b;

    public wgr0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgr0)) {
            return false;
        }
        wgr0 wgr0Var = (wgr0) obj;
        return Float.compare(this.a, wgr0Var.a) == 0 && Float.compare(this.b, wgr0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x4e.e("Bounds(top=", this.a, ", bottom=", this.b, Extension.C_BRAKE);
    }
}
