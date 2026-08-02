package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class y8n {
    public final int a;
    public final String b;
    public final String c;

    public y8n(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8n)) {
            return false;
        }
        y8n y8nVar = (y8n) obj;
        return this.a == y8nVar.a && jl40.l(this.b, y8nVar.b) && jl40.l(this.c, y8nVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(unr0.v(this.a, "DynamicSearchStatus(displayTimeSeconds=", ", dynamicSummary=", this.b, ", dynamicDescription="), this.c, Extension.C_BRAKE);
    }
}
