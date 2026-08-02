package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class usj0 {
    public final List a;
    public final String b;
    public final String c;

    public usj0(List list, String str, String str2) {
        this.a = list;
        this.b = str;
        this.c = str2;
    }

    public final List a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usj0)) {
            return false;
        }
        usj0 usj0Var = (usj0) obj;
        return jl40.l(this.a, usj0Var.a) && jl40.l(this.b, usj0Var.b) && jl40.l(this.c, usj0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(xvz.s("ResolvedQrEntity(deeplinks=", this.a, ", qrType=", this.b, ", qrcId="), this.c, Extension.C_BRAKE);
    }

    public /* synthetic */ usj0(List list) {
        this(list, null, null);
    }
}
