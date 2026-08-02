package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wdk0 {
    public final int a;
    public final String b;

    public wdk0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdk0)) {
            return false;
        }
        wdk0 wdk0Var = (wdk0) obj;
        return this.a == wdk0Var.a && jl40.l(this.b, wdk0Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.l(this.a, "Payload(rating=", ", comment=", this.b, Extension.C_BRAKE);
    }
}
