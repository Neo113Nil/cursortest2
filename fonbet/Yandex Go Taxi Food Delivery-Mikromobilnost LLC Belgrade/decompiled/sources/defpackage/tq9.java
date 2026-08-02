package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class tq9 {
    public final Uri a;
    public final String b;
    public final String c;

    public tq9(Uri uri, String str, String str2) {
        this.a = uri;
        this.b = str;
        this.c = str2;
    }

    public final Uri a() {
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
        if (!(obj instanceof tq9)) {
            return false;
        }
        tq9 tq9Var = (tq9) obj;
        return jl40.l(this.a, tq9Var.a) && jl40.l(this.b, tq9Var.b) && jl40.l(this.c, tq9Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChargersDeeplink(deeplinkUri=");
        sb.append(this.a);
        sb.append(", number=");
        sb.append(this.b);
        sb.append(", vendor=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
