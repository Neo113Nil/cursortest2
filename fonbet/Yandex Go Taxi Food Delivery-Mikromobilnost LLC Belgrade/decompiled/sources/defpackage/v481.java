package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class v481 implements m681 {
    public final ot81 a;

    public v481(ot81 ot81Var) {
        this.a = ot81Var;
    }

    @Override // defpackage.m681
    public final void a() {
        te81 e;
        ot81 ot81Var = this.a;
        synchronized (ot81Var) {
            try {
                ot81Var.l.size();
                ot81Var.d();
                ArrayList arrayList = new ArrayList();
                Iterator it = ot81Var.l.iterator();
                while (it.hasNext()) {
                    kf71 kf71Var = (kf71) it.next();
                    gg81 a = ot81Var.f.a(ot81Var.a);
                    boolean z = a != null ? a.o : false;
                    nr41 nr41Var = ot81Var.c;
                    if (z) {
                        int i = kf71Var.c;
                        va81 va81Var = (va81) nr41Var.b;
                        e = va81Var.d.e(va81Var.a, i, false);
                    } else {
                        int i2 = kf71Var.c;
                        va81 va81Var2 = (va81) nr41Var.b;
                        e = va81Var2.d.e(va81Var2.a, i2, true);
                    }
                    Objects.toString(e);
                    if (e instanceof f881) {
                        it.remove();
                        ot81Var.a(kf71Var, (f881) e);
                    } else if (e instanceof a581) {
                        a581 a581Var = (a581) e;
                        ot81Var.b.a(kf71Var.d, a581Var);
                        arrayList.add(new a881(kf71Var, a581Var));
                    }
                }
                ot81Var.b.a(arrayList);
                ot81Var.c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
