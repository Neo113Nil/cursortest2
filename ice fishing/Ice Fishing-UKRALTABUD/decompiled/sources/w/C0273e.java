package w;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: w.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273e {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f3055a;

    public C0273e(DisplayCutout displayCutout) {
        this.f3055a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0273e.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f3055a, ((C0273e) obj).f3055a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f3055a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f3055a + "}";
    }
}
