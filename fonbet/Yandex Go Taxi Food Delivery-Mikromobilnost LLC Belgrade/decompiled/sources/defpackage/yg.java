package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class yg {
    public final boolean a;
    public final String b;

    public yg(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg)) {
            return false;
        }
        yg ygVar = (yg) obj;
        return this.a == ygVar.a && jl40.l(this.b, ygVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return xvz.m("AccessibilityInfo(isHeader=", this.a, ", contentDescription=", this.b, Extension.C_BRAKE);
    }

    public yg() {
        this(false, null);
    }
}
