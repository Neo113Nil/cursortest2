package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes6.dex */
public final class sg20 {
    public final v8o a;
    public final hjc0 b;

    public sg20(v8o v8oVar, hjc0 hjc0Var) {
        this.a = v8oVar;
        this.b = hjc0Var;
    }

    public final void a(View view, sf20 sf20Var) {
        int i;
        float f;
        o151 c = sf20Var.c();
        omy0 omy0Var = omy0.c;
        n151 n151Var = c.b;
        wly0 wly0Var = wly0.w;
        if (jl40.l(n151Var, wly0Var)) {
            i = 0;
        } else if (jl40.l(n151Var, omy0Var)) {
            i = -2;
        } else {
            if (!(n151Var instanceof m151)) {
                w511.b();
                return;
            }
            i = (int) ((m151) n151Var).a;
        }
        if (jl40.l(n151Var, wly0Var)) {
            f = 1.0f;
        } else {
            if (!jl40.l(n151Var, omy0Var) && !(n151Var instanceof m151)) {
                w511.b();
                return;
            }
            f = 0.0f;
        }
        view.setLayoutParams(new LinearLayout.LayoutParams(i, -2, f));
        if (sf20Var.a() != null) {
            c.z(new g700(18, this, sf20Var), view);
        }
    }
}
