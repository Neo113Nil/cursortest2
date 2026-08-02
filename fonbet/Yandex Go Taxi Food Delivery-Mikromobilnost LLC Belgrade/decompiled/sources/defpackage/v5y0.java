package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class v5y0 {
    public final String a;
    public final kdc b;
    public final kdc c;
    public final String d;

    public v5y0(String str, kdc kdcVar, kdc kdcVar2, String str2) {
        this.a = str;
        this.b = kdcVar;
        this.c = kdcVar2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5y0)) {
            return false;
        }
        v5y0 v5y0Var = (v5y0) obj;
        return jl40.l(this.a, v5y0Var.a) && this.b.equals(v5y0Var.b) && this.c.equals(v5y0Var.c) && this.d.equals(v5y0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + smw0.d(this.c, smw0.d(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Button(text=" + this.a + ", textColor=" + this.b + ", color=" + this.c + ", analyticsEvent=" + this.d + Extension.C_BRAKE;
    }
}
