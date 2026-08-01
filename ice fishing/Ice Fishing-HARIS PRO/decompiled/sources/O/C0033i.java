package O;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: O.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033i {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f817a;

    public C0033i(DisplayCutout displayCutout) {
        this.f817a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0033i.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f817a, ((C0033i) obj).f817a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f817a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f817a + "}";
    }
}
