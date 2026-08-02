package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wnv {
    public final Bitmap a;
    public final rnv b;

    public wnv(Bitmap bitmap, rnv rnvVar) {
        this.a = bitmap;
        this.b = rnvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnv)) {
            return false;
        }
        wnv wnvVar = (wnv) obj;
        return Intrinsics.d(this.a, wnvVar.a) && this.b.equals(wnvVar.b);
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        return this.b.hashCode() + ((bitmap == null ? 0 : bitmap.hashCode()) * 31);
    }

    public final String toString() {
        return "WidgetRecentlyPlayed(cover=" + this.a + ", widgetRecentlyEntity=" + this.b + ")";
    }
}
