package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tsl implements vsl {
    public final kao a;
    public final boolean b;
    public final rb6 c;

    public tsl(kao kaoVar, boolean z, rb6 rb6Var) {
        this.a = kaoVar;
        this.b = z;
        this.c = rb6Var;
    }

    @Override // defpackage.vsl
    public final rb6 a() {
        return this.c;
    }

    public final boolean b() {
        return this.b;
    }

    public final kao c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tsl) {
            tsl tslVar = (tsl) obj;
            if (this.a == tslVar.a && this.b == tslVar.b && jl40.l(this.c, tslVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        rb6 rb6Var = this.c;
        return e + (rb6Var == null ? 0 : rb6Var.a.hashCode());
    }

    public final String toString() {
        return "Error(state=" + this.a + ", showBackButton=" + this.b + ", bottomBarState=" + this.c + Extension.C_BRAKE;
    }
}
