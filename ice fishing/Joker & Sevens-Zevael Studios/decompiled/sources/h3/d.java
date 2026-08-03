package h3;

import android.os.Build;
import android.view.DisplayCutout;
import java.util.Objects;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f2767a;

    public d(DisplayCutout displayCutout) {
        this.f2767a = displayCutout;
    }

    public final a3.b a() {
        return Build.VERSION.SDK_INT >= 30 ? a3.b.c(a2.c.c(this.f2767a)) : a3.b.f193e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f2767a, ((d) obj).f2767a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f2767a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f2767a + "}";
    }
}
