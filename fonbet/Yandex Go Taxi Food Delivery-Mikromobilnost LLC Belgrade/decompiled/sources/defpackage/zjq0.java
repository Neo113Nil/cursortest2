package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class zjq0 {
    public static final yjq0 Companion = new yjq0();
    public final String a;
    public final String b;
    public final Boolean c;

    public /* synthetic */ zjq0(int i, Boolean bool, String str, String str2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, xjq0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjq0)) {
            return false;
        }
        zjq0 zjq0Var = (zjq0) obj;
        return jl40.l(this.a, zjq0Var.a) && jl40.l(this.b, zjq0Var.b) && jl40.l(this.c, zjq0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return nzs.d(b64.v("DecodedPayload(methodId=", this.a, ", cardType=", this.b, ", isOwner="), this.c, Extension.C_BRAKE);
    }
}
