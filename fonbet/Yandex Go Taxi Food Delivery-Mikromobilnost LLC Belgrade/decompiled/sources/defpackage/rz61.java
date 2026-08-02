package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import yads.f1;

/* loaded from: classes7.dex */
public final class rz61 implements rk81 {
    public final cl81 a;
    public final WeakReference b;

    public rz61(st81 st81Var) {
        cl81 cl81Var = new cl81();
        WeakReference weakReference = new WeakReference(st81Var);
        this.a = cl81Var;
        this.b = weakReference;
        kgx kgxVar = cl81.b[0];
        r581 r581Var = cl81Var.a;
        r581Var.getClass();
        r581Var.a = new WeakReference(this);
    }

    @Override // defpackage.rk81
    public final void a(int i, Bundle bundle) {
        st81 st81Var = (st81) this.b.get();
        if (st81Var != null) {
            d391 d391Var = st81Var.a;
            z4m0 z4m0Var = st81Var.b;
            int i2 = 1;
            if (i == 19) {
                d391Var.a.post(new c391(d391Var, i2));
                ((n871) ((hlx0) z4m0Var.z).c).c(f1.e);
                return;
            }
            if (i == 20) {
                ((n871) ((hlx0) z4m0Var.z).c).b(f1.e);
                return;
            }
            switch (i) {
                case 6:
                    d391Var.a.post(new c391(d391Var, i2));
                    ((n871) ((hlx0) z4m0Var.z).c).c(f1.d);
                    break;
                case 7:
                    d391Var.a.post(new c391(d391Var, i2));
                    ((hlx0) z4m0Var.z).n();
                    break;
                case 8:
                    ((n871) ((hlx0) z4m0Var.z).c).b(f1.d);
                    break;
                case 9:
                    hlx0 hlx0Var = (hlx0) z4m0Var.z;
                    xq81 xq81Var = (xq81) hlx0Var.w;
                    Context context = (Context) hlx0Var.b;
                    qk61 qk61Var = (qk61) hlx0Var.y;
                    xq81Var.b(context, qk61Var);
                    xq81Var.a(context, qk61Var);
                    break;
            }
        }
    }
}
