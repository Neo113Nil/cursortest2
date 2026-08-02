package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class svk0 {
    public final String a;
    public final kdc b;
    public final kdc c;
    public final fvk0 d;

    public svk0(String str, kdc kdcVar, kdc kdcVar2, fvk0 fvk0Var) {
        this.a = str;
        this.b = kdcVar;
        this.c = kdcVar2;
        this.d = fvk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svk0)) {
            return false;
        }
        svk0 svk0Var = (svk0) obj;
        return jl40.l(this.a, svk0Var.a) && this.b.equals(svk0Var.b) && this.c.equals(svk0Var.c) && this.d.equals(svk0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + smw0.d(this.c, smw0.d(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Button(text=" + this.a + ", textColor=" + this.b + ", color=" + this.c + ", action=" + this.d + Extension.C_BRAKE;
    }
}
