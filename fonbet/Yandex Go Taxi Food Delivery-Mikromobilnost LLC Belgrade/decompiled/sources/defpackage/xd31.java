package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xd31 implements ge31 {
    public final Uri a;
    public final p011 b;

    public xd31(Uri uri, p011 p011Var) {
        this.a = uri;
        this.b = p011Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd31)) {
            return false;
        }
        xd31 xd31Var = (xd31) obj;
        return jl40.l(this.a, xd31Var.a) && this.b.equals(xd31Var.b);
    }

    public final int hashCode() {
        Uri uri = this.a;
        return this.b.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31);
    }

    public final String toString() {
        return "OnTransportCardDeeplink(cardAction=" + this.a + ", analyticsData=" + this.b + Extension.C_BRAKE;
    }
}
