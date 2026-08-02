package bo.app;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j0 {
    public final Bitmap a;
    public final Map b;

    public j0() {
        this.a = null;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.areEqual(this.a, j0Var.a) && Intrinsics.areEqual(this.b, j0Var.b);
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        Map map = this.b;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "BitmapAndHeaders(bitmap=" + this.a + ", headers=" + this.b + ")";
    }

    public j0(Bitmap bitmap, Map map) {
        this.a = bitmap;
        this.b = map;
    }
}
