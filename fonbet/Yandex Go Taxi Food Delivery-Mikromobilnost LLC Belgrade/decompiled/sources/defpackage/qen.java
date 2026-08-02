package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qen {
    public final String a;
    public final boolean b;

    public qen(String str, boolean z) {
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
        if (!(obj instanceof qen)) {
            return false;
        }
        qen qenVar = (qen) obj;
        return jl40.l(this.a, qenVar.a) && this.b == qenVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("WebCustomTabsAction(url=", this.a, ", wrapAuthUrl=", this.b, Extension.C_BRAKE);
    }
}
