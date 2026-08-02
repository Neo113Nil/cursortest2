package defpackage;

import android.graphics.drawable.PictureDrawable;

/* loaded from: classes3.dex */
public final class nce implements oce {
    public final PictureDrawable a;

    public final boolean equals(Object obj) {
        if (obj instanceof nce) {
            return this.a.equals(((nce) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PictureDrawable(value=" + this.a + ')';
    }
}
