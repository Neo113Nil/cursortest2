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
        consumeDisplayCutout = this.f3032c.consumeDisplayCutout();
        return S.a(consumeDisplayCutout, null);
    }

    @Override // w.P
    public C0267e e() {
        DisplayCutout displayCutout;
        displayCutout = this.f3032c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0267e(displayCutout);
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
        return Objects.equals(this.f3032c, m2.f3032c) && Objects.equals(this.f3036g, m2.f3036g);
    }

    @Override // w.P
    public int hashCode() {
        return this.f3032c.hashCode();
    }
}
