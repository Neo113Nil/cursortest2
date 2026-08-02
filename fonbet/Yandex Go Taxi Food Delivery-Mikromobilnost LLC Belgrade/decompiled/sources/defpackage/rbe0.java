package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class rbe0 {
    public final kj a;
    public final ucm b;

    public rbe0(kj kjVar, ucm ucmVar) {
        this.a = kjVar;
        this.b = ucmVar;
    }

    public final ucm a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rbe0) {
            rbe0 rbe0Var = (rbe0) obj;
            return this.a.equals(rbe0Var.a) && this.b == rbe0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PortalAuthData(portalAccount=" + this.a + ", authData=" + this.b + Extension.C_BRAKE;
    }
}
