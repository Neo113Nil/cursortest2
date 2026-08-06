package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class s6 {
    public final ColorFilter GWasM1elztuh;
    public final int X1lG3V04pd;
    public final long Yi7zF1RB1;

    public s6(int i, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            v9x4KbmAO.OOA6hdeuvCS();
            porterDuffColorFilter = v9x4KbmAO.X1lG3V04pd(ki1.HFYAaqMd6(j), fb1.Uxq83abb04(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(ki1.HFYAaqMd6(j), fb1.mqNvfisv7(i));
        }
        this.GWasM1elztuh = porterDuffColorFilter;
        this.Yi7zF1RB1 = j;
        this.X1lG3V04pd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj;
        return yb.X1lG3V04pd(this.Yi7zF1RB1, s6Var.Yi7zF1RB1) && this.X1lG3V04pd == s6Var.X1lG3V04pd;
    }

    public final int hashCode() {
        int i = yb.encWxUiV2;
        return Integer.hashCode(this.X1lG3V04pd) + (Long.hashCode(this.Yi7zF1RB1) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        mr0.uFEq9NpZ(this.Yi7zF1RB1, sb, ", blendMode=");
        sb.append((Object) n30.Uxq83abb04(this.X1lG3V04pd));
        sb.append(')');
        return sb.toString();
    }
}
