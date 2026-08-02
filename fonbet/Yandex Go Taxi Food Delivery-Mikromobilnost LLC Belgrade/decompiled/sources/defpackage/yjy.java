package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class yjy {
    public final String a;
    public final String b;

    public yjy(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjy)) {
            return false;
        }
        yjy yjyVar = (yjy) obj;
        return jl40.l(this.a, yjyVar.a) && jl40.l(this.b, yjyVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return unr0.p("LinkAccountsFullscreenParams(title=", this.a, ", description=", this.b, Extension.C_BRAKE);
    }
}
