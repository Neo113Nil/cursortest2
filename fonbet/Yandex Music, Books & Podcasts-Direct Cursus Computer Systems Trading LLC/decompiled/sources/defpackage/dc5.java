package defpackage;

import timber.log.Timber;

/* loaded from: classes6.dex */
public final class dc5 {
    /* JADX WARN: Multi-variable type inference failed */
    public static fc5 a(double d, boolean z) {
        fc5 fc5Var;
        dc5 dc5Var = fc5.e;
        ujl ujlVar = new ujl();
        xzi xziVar = new xzi(9);
        tf6 tf6Var = fc5.g;
        tf6Var.getClass();
        fc5 fc5Var2 = fc5.f;
        if (fc5Var2 != null) {
            return fc5Var2;
        }
        synchronized (dc5Var) {
            fc5Var = fc5.f;
            if (fc5Var == null) {
                Timber.INSTANCE.v("Initing CommonBandwidthMeter", new Object[0]);
                uk2 uk2Var = uk2.e;
                uk2 K = b3i.K(d);
                v8c v8cVar = new v8c(new bnd(27, ujlVar), new rp7(new qzc(5, tf6Var)));
                lum lumVar = new lum();
                kpm kpmVar = new kpm(1, v8cVar, lumVar);
                if (z) {
                    dxr dxrVar = new dxr();
                    dxrVar.a = kpmVar;
                    dxrVar.b = new nsh(tf6Var);
                    kpmVar = dxrVar;
                }
                K.a.add(v8cVar);
                v8cVar.a(K.d);
                v8cVar.b(lumVar);
                fc5Var = new fc5(ujlVar, xziVar, kpmVar, new k5(24, K));
                fc5.f = fc5Var;
            }
        }
        return fc5Var;
    }
}
