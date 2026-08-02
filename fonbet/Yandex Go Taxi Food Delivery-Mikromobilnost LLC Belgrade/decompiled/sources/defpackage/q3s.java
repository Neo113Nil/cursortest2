package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class q3s {
    public final String a;
    public final int b;

    public q3s(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3s)) {
            return false;
        }
        q3s q3sVar = (q3s) obj;
        return jl40.l(this.a, q3sVar.a) && this.b == q3sVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "FormContentStyle(backgroundColor=", this.a, ", spacingHeight=", Extension.C_BRAKE);
    }

    public q3s() {
        this(null, 2);
    }
}
