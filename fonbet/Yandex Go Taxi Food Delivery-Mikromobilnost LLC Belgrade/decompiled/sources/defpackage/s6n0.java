package defpackage;

import com.yandex.go.scooters.offers.v2.analytics.ScootersCardV2Analytics$CardButton;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class s6n0 {
    public final f6n0 a;
    public h6n0 b;
    public boolean c;
    public y5n0 d;
    public ArrayList e;
    public wwo0 f;

    public s6n0(f6n0 f6n0Var) {
        this.a = f6n0Var;
    }

    public final void a(ScootersCardV2Analytics$CardButton scootersCardV2Analytics$CardButton) {
        y5n0 y5n0Var = this.d;
        h6n0 h6n0Var = this.b;
        if (h6n0Var == null) {
            h6n0Var = null;
        }
        boolean booleanValue = ((Boolean) h6n0Var.invoke()).booleanValue();
        f6n0 f6n0Var = this.a;
        f6n0Var.getClass();
        f6n0Var.b(y5n0Var, null, null, scootersCardV2Analytics$CardButton.getEvgenValue(), booleanValue, null);
    }

    public final void b(List list) {
        if (list == null) {
            this.e = null;
            return;
        }
        ArrayList e = m1b1.e(list);
        if (jl40.l(this.e, e)) {
            return;
        }
        this.e = e;
        y5n0 y5n0Var = this.d;
        if (y5n0Var != null) {
            h6n0 h6n0Var = this.b;
            this.a.d(y5n0Var, ((Boolean) (h6n0Var != null ? h6n0Var : null).invoke()).booleanValue(), e);
        }
    }
}
