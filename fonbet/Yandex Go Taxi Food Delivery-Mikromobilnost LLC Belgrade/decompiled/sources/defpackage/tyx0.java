package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tyx0 {
    public final int a;
    public final String b;

    public tyx0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyx0)) {
            return false;
        }
        tyx0 tyx0Var = (tyx0) obj;
        return this.a == tyx0Var.a && jl40.l(this.b, tyx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.l(this.a, "Address(id=", ", text=", this.b, Extension.C_BRAKE);
    }
}
