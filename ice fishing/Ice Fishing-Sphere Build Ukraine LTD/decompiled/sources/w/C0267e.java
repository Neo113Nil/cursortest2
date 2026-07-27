package w;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: w.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267e {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f3060a;

    public C0267e(DisplayCutout displayCutout) {
        this.f3060a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0267e.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f3060a, ((C0267e) obj).f3060a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f3060a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f3060a + "}";
    }
}
