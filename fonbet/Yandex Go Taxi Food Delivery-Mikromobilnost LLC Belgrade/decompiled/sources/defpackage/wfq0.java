package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class wfq0 {
    public static final vfq0 Companion = new vfq0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ wfq0(int i, String str, String str2, String str3, String str4) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, ufq0.a.getDescriptor());
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
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfq0)) {
            return false;
        }
        wfq0 wfq0Var = (wfq0) obj;
        return jl40.l(this.a, wfq0Var.a) && jl40.l(this.b, wfq0Var.b) && jl40.l(this.c, wfq0Var.c) && jl40.l(this.d, wfq0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("DecodedPayload(methodId=", this.a, ", bankName=", this.b, ", paymentSystem="), this.c, ", suffix=", this.d, Extension.C_BRAKE);
    }
}
