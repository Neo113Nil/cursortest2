package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class yqp0 extends crp0 {
    public final String c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqp0(String str, int i) {
        super("UntrustedRedirectUri");
        str = (i & 2) != 0 ? null : str;
        this.c = "Untrusted uri by redirect";
        this.d = str;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return this.d;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqp0)) {
            return false;
        }
        yqp0 yqp0Var = (yqp0) obj;
        return jl40.l(this.c, yqp0Var.c) && jl40.l(this.d, yqp0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        Object obj = this.d;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "UntrustedRedirectUri(message=" + this.c + ", payload=" + this.d + Extension.C_BRAKE;
    }

    public yqp0() {
        this(null, 3);
    }
}
