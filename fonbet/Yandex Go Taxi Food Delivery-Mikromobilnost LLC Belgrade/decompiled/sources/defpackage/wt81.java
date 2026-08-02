package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class wt81 {
    public final float a;
    public final boolean b;

    public wt81(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt81)) {
            return false;
        }
        wt81 wt81Var = (wt81) obj;
        return Float.compare(this.a, wt81Var.a) == 0 && this.b == wt81Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CoreNativeAdMedia(aspectRatio=" + this.a + ", hasVideo=" + this.b + Extension.C_BRAKE;
    }
}
