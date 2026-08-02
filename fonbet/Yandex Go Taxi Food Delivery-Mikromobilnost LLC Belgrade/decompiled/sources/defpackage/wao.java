package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class wao extends xao {
    public final Uri a;

    public wao(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wao) && this.a.equals(((wao) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g8e.m(this.a, "OpenLinkInBrowser(uri=", Extension.C_BRAKE);
    }
}
