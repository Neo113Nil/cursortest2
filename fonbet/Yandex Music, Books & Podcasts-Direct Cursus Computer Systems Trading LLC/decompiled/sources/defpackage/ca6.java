package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class ca6 {
    public final Uri a;
    public final boolean b;

    public ca6(boolean z, Uri uri) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ca6.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ca6 ca6Var = (ca6) obj;
        return this.a.equals(ca6Var.a) && this.b == ca6Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
