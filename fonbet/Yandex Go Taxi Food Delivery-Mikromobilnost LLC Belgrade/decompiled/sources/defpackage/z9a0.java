package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class z9a0 {
    public final Uri a;
    public final String b;
    public final String c;

    public z9a0(Uri uri, String str, String str2) {
        this.a = uri;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9a0)) {
            return false;
        }
        z9a0 z9a0Var = (z9a0) obj;
        return jl40.l(this.a, z9a0Var.a) && jl40.l(this.b, z9a0Var.b) && jl40.l(this.c, z9a0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentMethodsDeeplink(deeplinkUri=");
        sb.append(this.a);
        sb.append(", service=");
        sb.append(this.b);
        sb.append(", type=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
