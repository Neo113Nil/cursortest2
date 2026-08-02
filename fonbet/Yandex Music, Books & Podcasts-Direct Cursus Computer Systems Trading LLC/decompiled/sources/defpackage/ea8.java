package defpackage;

import android.view.DisplayCutout;

/* loaded from: classes.dex */
public final class ea8 {
    public final DisplayCutout a;

    public ea8(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ea8.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ea8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
