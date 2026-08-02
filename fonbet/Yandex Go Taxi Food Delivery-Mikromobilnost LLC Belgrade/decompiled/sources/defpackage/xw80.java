package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class xw80 {
    public static final ww80 Companion = new ww80();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ik7 e;
    public final String f;
    public final String g;
    public boolean h;
    public boolean i;

    public /* synthetic */ xw80(int i, String str, String str2, String str3, String str4, ik7 ik7Var, String str5, String str6, boolean z, boolean z2) {
        if (79 != (i & 79)) {
            qje.Z(i, 79, vw80.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = ik7Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        this.g = str6;
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw80)) {
            return false;
        }
        xw80 xw80Var = (xw80) obj;
        return jl40.l(this.a, xw80Var.a) && jl40.l(this.b, xw80Var.b) && jl40.l(this.c, xw80Var.c) && jl40.l(this.d, xw80Var.d) && jl40.l(this.e, xw80Var.e) && jl40.l(this.f, xw80Var.f) && jl40.l(this.g, xw80Var.g);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ik7 ik7Var = this.e;
        int hashCode3 = (hashCode2 + (ik7Var == null ? 0 : ik7Var.hashCode())) * 31;
        String str3 = this.f;
        return this.g.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("OutgoingCallArgs(forwardingId=", this.a, ", callToTitle=", this.b, ", callToAvatarUrl=");
        g8e.D(v, this.c, ", rating=", this.d, ", callToCar=");
        v.append(this.e);
        v.append(", callToCarColor=");
        v.append(this.f);
        v.append(", linkageId=");
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }

    public xw80(String str, String str2, String str3, String str4, ik7 ik7Var, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = ik7Var;
        this.f = null;
        this.g = str5;
    }
}
