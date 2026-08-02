package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class r2c {
    public final String a;
    public final boolean b;

    public r2c(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2c)) {
            return false;
        }
        r2c r2cVar = (r2c) obj;
        return jl40.l(this.a, r2cVar.a) && this.b == r2cVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("PlusSwitchState(spendAmount=", this.a, ", turnedOn=", this.b, Extension.C_BRAKE);
    }
}
