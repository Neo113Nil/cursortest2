package w;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class M extends K {
    public M(S s2, WindowInsets windowInsets) {
        super(s2, windowInsets);
    }

    @Override // w.P
    public S a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f3027c.consumeDisplayCutout();
        return S.a(consumeDisplayCutout, null);
    }

    @Override // w.P
    public C0273e e() {
        DisplayCutout displayCutout;
        displayCutout = this.f3027c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0273e(displayCutout);
    }

    @Override // w.J, w.P
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m2 = (M) obj;
        return Objects.equals(this.f3027c, m2.f3027c) && Objects.equals(this.f3031g, m2.f3031g);
    }

    @Override // w.P
    public int hashCode() {
        return this.f3027c.hashCode();
    }
}
