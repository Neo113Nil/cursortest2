package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class wdv implements zdv {
    public final Bitmap a;

    public final boolean equals(Object obj) {
        if (obj instanceof wdv) {
            return this.a.equals(((wdv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Bitmap(value=" + this.a + ')';
    }
}
