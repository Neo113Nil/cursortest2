package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class u3m {
    public final z9c0 a;
    public final String b;
    public final boolean c;
    public final String d;

    public u3m(z9c0 z9c0Var, String str, boolean z, String str2) {
        this.a = z9c0Var;
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3m)) {
            return false;
        }
        u3m u3mVar = (u3m) obj;
        return this.a.equals(u3mVar.a) && jl40.l(this.b, u3mVar.b) && this.c == u3mVar.c && jl40.l(this.d, u3mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DomainFlexScreen(name=");
        sb.append(this.a);
        sb.append(", path=");
        sb.append(this.b);
        sb.append(", enabled=");
        return n.m(", skeleton=", this.d, Extension.C_BRAKE, sb, this.c);
    }
}
