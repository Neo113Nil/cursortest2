package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class we {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public we(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        return jl40.l(this.a, weVar.a) && jl40.l(this.b, weVar.b) && jl40.l(this.c, weVar.c) && jl40.l(this.d, weVar.d) && this.e == weVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return Boolean.hashCode(this.e) + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("AcceptancePaymentNotificationUiState(title=", this.a, ", subtitle=", this.b, ", imageTag=");
        g8e.D(v, this.c, ", cancelButtonTitle=", this.d, ", shimmering=");
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
