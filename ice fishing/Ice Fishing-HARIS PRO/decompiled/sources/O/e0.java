package O;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class e0 extends d0 {
    public e0(j0 j0Var, WindowInsets windowInsets) {
        super(j0Var, windowInsets);
    }

    @Override // O.h0
    public j0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f792c.consumeDisplayCutout();
        return j0.g(null, consumeDisplayCutout);
    }

    @Override // O.h0
    public C0033i e() {
        DisplayCutout displayCutout;
        displayCutout = this.f792c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0033i(displayCutout);
    }

    @Override // O.c0, O.h0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Objects.equals(this.f792c, e0Var.f792c) && Objects.equals(this.f795g, e0Var.f795g);
    }

    @Override // O.h0
    public int hashCode() {
        return this.f792c.hashCode();
    }
}
