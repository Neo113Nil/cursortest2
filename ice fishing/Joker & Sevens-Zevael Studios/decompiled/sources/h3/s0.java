package h3;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class s0 extends r0 {
    public s0(a1 a1Var, WindowInsets windowInsets) {
        super(a1Var, windowInsets);
    }

    @Override // h3.x0
    public a1 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f2814c.consumeDisplayCutout();
        return a1.c(null, consumeDisplayCutout);
    }

    @Override // h3.x0
    public d e() {
        DisplayCutout displayCutout;
        displayCutout = this.f2814c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new d(displayCutout);
    }

    @Override // h3.q0, h3.x0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Objects.equals(this.f2814c, s0Var.f2814c) && Objects.equals(this.f2818g, s0Var.f2818g) && q0.B(this.f2819h, s0Var.f2819h);
    }

    @Override // h3.x0
    public int hashCode() {
        return this.f2814c.hashCode();
    }
}
