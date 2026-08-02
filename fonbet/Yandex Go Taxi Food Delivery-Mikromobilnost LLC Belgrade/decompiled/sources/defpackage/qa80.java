package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qa80 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public qa80(boolean z, boolean z2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa80)) {
            return false;
        }
        qa80 qa80Var = (qa80) obj;
        return jl40.l(this.a, qa80Var.a) && jl40.l(this.b, qa80Var.b) && this.c == qa80Var.c && this.d == qa80Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Boolean.hashCode(this.d) + unr0.e((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        return smw0.k(", needOpenDetails=", Extension.C_BRAKE, b64.v("OrderInfo(orderId=", this.a, ", tariffName=", this.b, ", isBufferCombo="), this.c, this.d);
    }

    public /* synthetic */ qa80(int i) {
        this(false, false, null, null);
    }

    public qa80() {
        this(0);
    }

    public qa80(String str) {
        this(false, false, str, null);
    }
}
