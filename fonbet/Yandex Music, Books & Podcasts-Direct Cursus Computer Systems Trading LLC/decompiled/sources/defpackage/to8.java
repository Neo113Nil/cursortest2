package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class to8 extends wo8 {
    public final Uri a;
    public final Rect b;

    public to8(Uri uri, Rect rect) {
        this.a = uri;
        this.b = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to8)) {
            return false;
        }
        to8 to8Var = (to8) obj;
        return Intrinsics.d(this.a, to8Var.a) && this.b.equals(to8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NinePatch(imageUrl=" + this.a + ", insets=" + this.b + ')';
    }
}
