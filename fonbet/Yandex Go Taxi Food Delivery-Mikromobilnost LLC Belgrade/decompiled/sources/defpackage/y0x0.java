package defpackage;

import android.net.Uri;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class y0x0 implements z0x0 {
    public final tn3 a;
    public final Uri b;

    public y0x0(tn3 tn3Var, Uri uri) {
        this.a = tn3Var;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0x0)) {
            return false;
        }
        y0x0 y0x0Var = (y0x0) obj;
        if (!jl40.l(this.a, y0x0Var.a)) {
            return false;
        }
        Uri uri = y0x0Var.b;
        Uri uri2 = this.b;
        if (uri2 == null) {
            if (uri == null) {
                l = true;
            }
            l = false;
        } else {
            if (uri != null) {
                Set set = le41.b;
                l = jl40.l(uri2, uri);
            }
            l = false;
        }
        return l;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Uri uri = this.b;
        if (uri == null) {
            hashCode = 0;
        } else {
            Set set = le41.b;
            hashCode = uri.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        Uri uri = this.b;
        return "Synchronized(authorizationState=" + this.a + ", webChatUrl=" + (uri == null ? "null" : le41.a(uri)) + Extension.C_BRAKE;
    }
}
