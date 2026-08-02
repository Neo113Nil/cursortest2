package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class wl0 {
    public final int a;
    public final String b;

    public wl0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl0)) {
            return false;
        }
        wl0 wl0Var = (wl0) obj;
        return this.a == wl0Var.a && jl40.l(this.b, wl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.l(this.a, "AdditionalMapStyle(styleIndex=", ", style=", this.b, Extension.C_BRAKE);
    }
}
