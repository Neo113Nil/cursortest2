package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class qq3 {
    public final Bitmap a;
    public final Uri b;
    public final t33 c;

    public qq3(Bitmap bitmap, Uri uri, t33 t33Var, int i) {
        this.a = bitmap;
        this.b = uri;
        this.c = t33Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qq3.class == obj.getClass()) {
            qq3 qq3Var = (qq3) obj;
            if (!this.a.equals(qq3Var.a) || this.c != qq3Var.c) {
                return false;
            }
            Uri uri = qq3Var.b;
            Uri uri2 = this.b;
            if (uri2 != null) {
                return uri2.equals(uri);
            }
            if (uri == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.a.hashCode() * 31)) * 31;
        Uri uri = this.b;
        return hashCode + (uri != null ? uri.hashCode() : 0);
    }
}
