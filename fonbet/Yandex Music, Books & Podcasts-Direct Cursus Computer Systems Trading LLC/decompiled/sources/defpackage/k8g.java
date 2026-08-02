package defpackage;

import java.util.List;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class k8g extends qon {
    public final ls1 d;

    public k8g(up6 up6Var) {
        i8g i8gVar = new i8g(this);
        rp7 rp7Var = new rp7(this);
        synchronized (zc4.a) {
            try {
                if (zc4.b == null) {
                    zc4.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ls1 ls1Var = new ls1(rp7Var, new yfx(6, zc4.b, up6Var));
        this.d = ls1Var;
        ls1Var.d.add(i8gVar);
    }

    @Override // defpackage.qon
    public final int c() {
        return this.d.f.size();
    }

    public final Object u(int i) {
        return this.d.f.get(i);
    }

    public void v(List list) {
        this.d.b(list, null);
    }
}
