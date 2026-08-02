package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class hmf {
    public final Uri a;
    public final List b;

    public hmf(Uri uri, List list) {
        uri.getClass();
        list.getClass();
        this.a = uri;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmf)) {
            return false;
        }
        hmf hmfVar = (hmf) obj;
        return Intrinsics.d(this.a, hmfVar.a) && Intrinsics.d(this.b, hmfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Last3ds(uri=" + this.a + ", trustedUrls=" + this.b + ")";
    }
}
