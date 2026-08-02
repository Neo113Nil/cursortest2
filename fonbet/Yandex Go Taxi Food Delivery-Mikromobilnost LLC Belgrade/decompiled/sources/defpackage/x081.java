package defpackage;

import android.view.View;
import java.util.Objects;
import yads.za2;

/* loaded from: classes7.dex */
public final class x081 implements c071 {
    public final /* synthetic */ va81 a;

    public x081(va81 va81Var) {
        this.a = va81Var;
    }

    @Override // defpackage.c071
    public final void a(za2 za2Var) {
        View a;
        o081 o081Var = (o081) this.a.d.w;
        boolean e = (o081Var == null || (a = o081Var.c.a()) == null) ? true : sj71.e(a);
        Objects.toString(za2Var);
        x081.class.toString();
        ot81 ot81Var = this.a.D;
        synchronized (ot81Var) {
            try {
                Objects.toString(za2Var);
                int ordinal = za2Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        ot81Var.d();
                    } else if (ordinal != 2) {
                    }
                }
                if (!e) {
                    ot81Var.c();
                }
            } finally {
            }
        }
    }
}
