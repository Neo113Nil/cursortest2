package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class xfi {
    public final Uri a;

    public xfi(Uri uri) {
        this.a = uri;
    }

    public final Uri a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xfi) && jl40.l(this.a, ((xfi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g8e.m(this.a, "DeliveryOrderFormDeeplink(deeplinkUri=", Extension.C_BRAKE);
    }
}
