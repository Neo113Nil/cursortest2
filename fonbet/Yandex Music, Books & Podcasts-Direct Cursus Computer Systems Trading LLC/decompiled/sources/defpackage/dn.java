package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class dn extends en {
    public final Uri a;
    public final String b;

    public dn(Uri uri, String str) {
        uri.getClass();
        str.getClass();
        this.a = uri;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn)) {
            return false;
        }
        dn dnVar = (dn) obj;
        return Intrinsics.d(this.a, dnVar.a) && Intrinsics.d(this.b, dnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SHOW_SBP_OR_WEB_BANK(uri=" + this.a + ", qrcId=" + this.b + ")";
    }
}
