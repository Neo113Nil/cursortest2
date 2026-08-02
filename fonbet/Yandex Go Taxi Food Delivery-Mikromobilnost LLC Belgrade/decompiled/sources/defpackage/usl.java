package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class usl implements vsl {
    public final String a;
    public final boolean b;
    public final rb6 c;

    public usl(String str, boolean z, rb6 rb6Var) {
        this.a = str;
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

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usl)) {
            return false;
        }
        usl uslVar = (usl) obj;
        return jl40.l(this.a, uslVar.a) && this.b == uslVar.b && jl40.l(this.c, uslVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int e = unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        rb6 rb6Var = this.c;
        return e + (rb6Var != null ? rb6Var.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("Loading(skeletonId=", this.a, ", showBackButton=", ", bottomBarState=", this.b);
        l.append(this.c);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
