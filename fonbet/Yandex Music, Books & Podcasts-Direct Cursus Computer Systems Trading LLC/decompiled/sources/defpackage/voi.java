package defpackage;

import android.os.Looper;

/* loaded from: classes.dex */
public class voi extends qdg {
    @Override // defpackage.qdg
    public void l(Object obj) {
        qdg.a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public void m(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == qdg.k;
            this.f = obj;
        }
        if (z) {
            hx0 Z = hx0.Z();
            dsd dsdVar = this.j;
            gs7 gs7Var = Z.a;
            if (gs7Var.c == null) {
                synchronized (gs7Var.a) {
                    try {
                        if (gs7Var.c == null) {
                            gs7Var.c = gs7.Z(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            gs7Var.c.post(dsdVar);
        }
    }
}
