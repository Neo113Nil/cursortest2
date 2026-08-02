package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class viz {
    public final String a;
    public final boolean b;

    public viz(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof viz)) {
            return false;
        }
        viz vizVar = (viz) obj;
        return jl40.l(this.a, vizVar.a) && this.b == vizVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("Image(url=", this.a, ", isAvatar=", this.b, Extension.C_BRAKE);
    }
}
