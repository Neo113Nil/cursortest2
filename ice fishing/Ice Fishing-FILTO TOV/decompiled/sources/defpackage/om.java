package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class om {
    public final DisplayCutout GWasM1elztuh;

    public om(DisplayCutout displayCutout) {
        this.GWasM1elztuh = displayCutout;
    }

    public final e20 GWasM1elztuh() {
        return Build.VERSION.SDK_INT >= 30 ? e20.X1lG3V04pd(dcDmLGVhzWm.X1lG3V04pd(this.GWasM1elztuh)) : e20.OOA6hdeuvCS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || om.class != obj.getClass()) {
            return false;
        }
        return this.GWasM1elztuh.equals(((om) obj).GWasM1elztuh);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.GWasM1elztuh.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.GWasM1elztuh + "}";
    }
}
