package defpackage;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class x230 {
    public final x43 a = new x43();

    public final void a(String str) {
        Object obj;
        x43 x43Var = this.a;
        Iterator<E> it = x43Var.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((w230) obj).a, str)) {
                    break;
                }
            }
        }
        w230 w230Var = (w230) obj;
        if (w230Var != null) {
            x43Var.remove(w230Var);
        }
    }

    public final void b(String str) {
        Object obj;
        x43 x43Var = this.a;
        Iterator it = x43Var.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((w230) obj).a, str)) {
                    break;
                }
            }
        }
        w230 w230Var = (w230) obj;
        if (w230Var != null) {
            w230Var.b.dismiss();
            x43Var.remove(w230Var);
        }
    }
}
