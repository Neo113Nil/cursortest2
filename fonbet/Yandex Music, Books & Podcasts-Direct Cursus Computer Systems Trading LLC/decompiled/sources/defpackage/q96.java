package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class q96 extends f96 {
    public static ceg x(i96 i96Var, int i) {
        i96Var.getClass();
        switch (i96Var.ordinal()) {
            case 0:
                return new m96(i, 3);
            case 1:
                return new n96(i, 3);
            case 2:
                return new p96(i, 3);
            case 3:
                return new k96(i, 3);
            case 4:
                return new j96(i, 3);
            case 5:
                return new o96(i, 3);
            case 6:
                return new l96(i, 3);
            default:
                b6e.s();
                return null;
        }
    }

    public final void v(b6... b6VarArr) {
        for (b6 b6Var : b6VarArr) {
            if (b6Var instanceof h96) {
                ceg cegVar = (ceg) b6Var.b;
                int i = cegVar.b;
                int n = cegVar.n();
                ceg cegVar2 = (ceg) b6Var.c;
                h(i, n, cegVar2.b, cegVar2.n(), ((h96) b6Var).d);
            } else {
                if (!(b6Var instanceof g96)) {
                    b6e.s();
                    return;
                }
                ceg cegVar3 = (ceg) b6Var.b;
                int i2 = cegVar3.b;
                int n2 = cegVar3.n();
                ceg cegVar4 = (ceg) b6Var.c;
                g(i2, n2, cegVar4.b, cegVar4.n());
            }
        }
    }

    public final void w(View view, Function1 function1) {
        view.getClass();
        function1.invoke(new ceu(view.getId(), this));
    }
}
