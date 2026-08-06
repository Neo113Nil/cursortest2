package y;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: y.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1072e {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f8582a;

    public C1072e(DisplayCutout displayCutout) {
        this.f8582a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1072e.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f8582a, ((C1072e) obj).f8582a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f8582a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f8582a + "}";
    }
}
