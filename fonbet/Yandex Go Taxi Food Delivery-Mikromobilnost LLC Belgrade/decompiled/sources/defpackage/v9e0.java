package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v9e0 extends qez {
    public final String b;
    public final String c;

    public v9e0(String str, String str2) {
        super(2);
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9e0)) {
            return false;
        }
        v9e0 v9e0Var = (v9e0) obj;
        return jl40.l(this.b, v9e0Var.b) && jl40.l(this.c, v9e0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("Promotional(id=", this.b, ", screen=", this.c, Extension.C_BRAKE);
    }
}
