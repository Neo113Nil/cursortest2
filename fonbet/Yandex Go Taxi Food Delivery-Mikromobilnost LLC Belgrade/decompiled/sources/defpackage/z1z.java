package defpackage;

import android.net.Uri;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public final class z1z {
    public final WeakReference a;
    public final Uri b;

    public z1z(WeakReference weakReference, Uri uri) {
        this.a = weakReference;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1z)) {
            return false;
        }
        z1z z1zVar = (z1z) obj;
        return this.a.equals(z1zVar.a) && jl40.l(this.b, z1zVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return hashCode + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        return "BitmapInCache(bitmapWeakRef=" + this.a + ", uri=" + this.b + ')';
    }
}
