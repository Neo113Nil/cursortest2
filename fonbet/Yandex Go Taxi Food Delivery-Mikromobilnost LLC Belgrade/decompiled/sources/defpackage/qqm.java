package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class qqm implements rqm {
    public final boolean a;
    public final boolean b;
    public final tls c;

    public qqm(tls tlsVar, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = tlsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqm)) {
            return false;
        }
        qqm qqmVar = (qqm) obj;
        return this.a == qqmVar.a && this.b == qqmVar.b && jl40.l(this.c, qqmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder u = qv10.u("Toggle(selected=", ", enabled=", ", onSelectedChange=", this.a, this.b);
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
