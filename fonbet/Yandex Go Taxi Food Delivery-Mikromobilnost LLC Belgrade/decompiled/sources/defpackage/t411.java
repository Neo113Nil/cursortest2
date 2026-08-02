package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class t411 {
    public final String a;
    public final String b;
    public g700 c;

    public t411(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t411)) {
            return false;
        }
        t411 t411Var = (t411) obj;
        return jl40.l(this.a, t411Var.a) && jl40.l(this.b, t411Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("TransportPaymentListPayload(source=", this.a, ", notificationText=", this.b, Extension.C_BRAKE);
    }

    public t411() {
        this(null, null);
    }
}
