package defpackage;

import android.net.Uri;

/* loaded from: classes15.dex */
public final class wwu0 extends sh3 {
    public final boolean equals(Object obj) {
        if (obj instanceof wwu0) {
            return jl40.l(this.d, ((wwu0) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.d;
        if (uri != null) {
            return uri.hashCode();
        }
        return 0;
    }
}
