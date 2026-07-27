package O;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class v0 extends u0 {
    public v0(A0 a02, WindowInsets windowInsets) {
        super(a02, windowInsets);
    }

    @Override // O.y0
    public A0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f2325c.consumeDisplayCutout();
        return A0.h(null, consumeDisplayCutout);
    }

    @Override // O.y0
    public C0347i e() {
        DisplayCutout displayCutout;
        displayCutout = this.f2325c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0347i(displayCutout);
    }

    @Override // O.t0, O.y0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Objects.equals(this.f2325c, v0Var.f2325c) && Objects.equals(this.f2329g, v0Var.f2329g);
    }

    @Override // O.y0
    public int hashCode() {
        return this.f2325c.hashCode();
    }
}
