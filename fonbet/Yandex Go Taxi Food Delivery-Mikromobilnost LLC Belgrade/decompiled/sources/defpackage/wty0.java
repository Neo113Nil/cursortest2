package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wty0 {
    public final String a;
    public final int b;
    public final int c;

    public wty0(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wty0)) {
            return false;
        }
        wty0 wty0Var = (wty0) obj;
        return jl40.l(this.a, wty0Var.a) && this.b == wty0Var.b && this.c == wty0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "TextViewDetails(text=", this.a, ", textAppearance=", ", textColor="));
    }

    public /* synthetic */ wty0(String str, int i) {
        this(str, i, ung0.ybColor_textIcon_primary);
    }
}
