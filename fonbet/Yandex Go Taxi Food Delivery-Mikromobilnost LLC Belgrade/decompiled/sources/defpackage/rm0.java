package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class rm0 extends sm0 {
    public final Uri a;
    public final String b;

    public rm0(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm0)) {
            return false;
        }
        rm0 rm0Var = (rm0) obj;
        return this.a.equals(rm0Var.a) && jl40.l(this.b, rm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SHOW_SBP_OR_WEB_BANK(uri=" + this.a + ", qrcId=" + this.b + Extension.C_BRAKE;
    }
}
