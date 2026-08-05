package defpackage;

import android.view.DisplayCutout;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class gd {
    public final DisplayCutout qoPGr6Ce;

    public gd(DisplayCutout displayCutout) {
        this.qoPGr6Ce = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gd.class != obj.getClass()) {
            return false;
        }
        return this.qoPGr6Ce.equals(((gd) obj).qoPGr6Ce);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.qoPGr6Ce.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.qoPGr6Ce + "}";
    }
}
