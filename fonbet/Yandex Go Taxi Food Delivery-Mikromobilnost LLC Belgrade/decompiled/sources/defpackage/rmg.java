package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rmg implements qas0 {
    public final n0t0 a;
    public final boolean b;

    public rmg(n0t0 n0t0Var, boolean z) {
        this.a = n0t0Var;
        this.b = z;
    }

    public final n0t0 a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmg)) {
            return false;
        }
        rmg rmgVar = (rmg) obj;
        return this.a.equals(rmgVar.a) && this.b == rmgVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSnackbar(content=" + this.a + ", isError=" + this.b + Extension.C_BRAKE;
    }
}
