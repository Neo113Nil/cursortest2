package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class v370 extends mr {
    public final String a;
    public final boolean b;
    public final bm50 c;

    public v370(String str, boolean z, bm50 bm50Var) {
        this.a = str;
        this.b = z;
        this.c = bm50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v370) {
            v370 v370Var = (v370) obj;
            return jl40.l(this.a, v370Var.a) && this.b == v370Var.b && this.c == v370Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder l = oo31.l("OpenApp(url=", this.a, ", shouldAuthorize=", ", onClose=", this.b);
        l.append(this.c);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
