package y;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class L extends K {
    public L(Q q2, WindowInsets windowInsets) {
        super(q2, windowInsets);
    }

    @Override // y.O
    public Q a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f8554c.consumeDisplayCutout();
        return Q.a(consumeDisplayCutout, null);
    }

    @Override // y.O
    public C1072e e() {
        DisplayCutout displayCutout;
        displayCutout = this.f8554c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C1072e(displayCutout);
    }

    @Override // y.J, y.O
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l2 = (L) obj;
        return Objects.equals(this.f8554c, l2.f8554c) && Objects.equals(this.f8558g, l2.f8558g);
    }

    @Override // y.O
    public int hashCode() {
        return this.f8554c.hashCode();
    }
}
