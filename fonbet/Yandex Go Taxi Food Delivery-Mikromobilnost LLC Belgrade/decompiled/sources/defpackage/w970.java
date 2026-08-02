package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class w970 implements z970 {
    public final Uri a;

    public /* synthetic */ w970(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w970) {
            return jl40.l(this.a, ((w970) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        return g8e.m(this.a, "Promocodes(deeplink=", Extension.C_BRAKE);
    }
}
