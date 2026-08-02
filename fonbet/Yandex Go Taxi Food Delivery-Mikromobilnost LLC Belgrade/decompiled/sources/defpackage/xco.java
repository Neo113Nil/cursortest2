package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class xco {
    public final Uri a;
    public final String b;

    public xco(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }

    public final Uri a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xco)) {
            return false;
        }
        xco xcoVar = (xco) obj;
        return jl40.l(this.a, xcoVar.a) && this.b.equals(xcoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EulasAgreementDeeplink(deeplinkUri=" + this.a + ", url=" + this.b + Extension.C_BRAKE;
    }
}
