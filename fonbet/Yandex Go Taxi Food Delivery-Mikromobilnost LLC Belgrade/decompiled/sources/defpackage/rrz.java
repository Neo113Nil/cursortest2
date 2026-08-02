package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class rrz {
    public final Uri a;
    public final String b;

    public rrz(Uri uri, String str) {
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
        if (!(obj instanceof rrz)) {
            return false;
        }
        rrz rrzVar = (rrz) obj;
        return jl40.l(this.a, rrzVar.a) && jl40.l(this.b, rrzVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "LostItemsDeeplink(deeplinkUri=" + this.a + ", orderId=" + this.b + Extension.C_BRAKE;
    }
}
