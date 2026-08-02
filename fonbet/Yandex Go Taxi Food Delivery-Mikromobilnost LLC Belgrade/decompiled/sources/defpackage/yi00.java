package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class yi00 {
    public final boolean a;
    public final String b;

    public yi00(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi00)) {
            return false;
        }
        yi00 yi00Var = (yi00) obj;
        return this.a == yi00Var.a && this.b.equals(yi00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xvz.m("MapImageUrl(isDark=", this.a, ", value=", this.b, Extension.C_BRAKE);
    }
}
