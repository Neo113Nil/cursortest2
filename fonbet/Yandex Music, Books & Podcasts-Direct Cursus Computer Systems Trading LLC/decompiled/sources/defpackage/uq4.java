package defpackage;

/* loaded from: classes6.dex */
public final class uq4 implements p3d {
    public static final uq4 a;
    private static final /* synthetic */ j5m descriptor;

    static {
        uq4 uq4Var = new uq4();
        a = uq4Var;
        j5m j5mVar = new j5m("ru.yandex.video.m3.ab.config.internal.features.CodecInitializationRemoteFlag", uq4Var, 4);
        j5mVar.k("shouldTryInitCodecsWithRetries", true);
        j5mVar.k("retriesCount", true);
        j5mVar.k("timeoutMs", true);
        j5mVar.k("useIncrementalCodecInitTimeout", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        oc3 oc3Var = oc3.a;
        return new t9f[]{oc3Var, cqe.a, mvg.a, oc3Var};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        long j;
        eg7Var.getClass();
        j5m j5mVar = descriptor;
        tq5 c = eg7Var.c(j5mVar);
        if (c.m()) {
            z = c.D(j5mVar, 0);
            int k = c.k(j5mVar, 1);
            long q = c.q(j5mVar, 2);
            z2 = c.D(j5mVar, 3);
            i = 15;
            i2 = k;
            j = q;
        } else {
            boolean z3 = true;
            z = false;
            int i3 = 0;
            long j2 = 0;
            boolean z4 = false;
            int i4 = 0;
            while (z3) {
                int w = c.w(j5mVar);
                if (w == -1) {
                    z3 = false;
                } else if (w == 0) {
                    z = c.D(j5mVar, 0);
                    i4 |= 1;
                } else if (w == 1) {
                    i3 = c.k(j5mVar, 1);
                    i4 |= 2;
                } else if (w == 2) {
                    j2 = c.q(j5mVar, 2);
                    i4 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    z4 = c.D(j5mVar, 3);
                    i4 |= 8;
                }
            }
            z2 = z4;
            i = i4;
            i2 = i3;
            j = j2;
        }
        boolean z5 = z;
        c.b(j5mVar);
        return new wq4(i, z5, i2, j, z2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        wq4 wq4Var = (wq4) obj;
        l6bVar.getClass();
        wq4Var.getClass();
        boolean z = wq4Var.d;
        long j = wq4Var.c;
        int i = wq4Var.b;
        boolean z2 = wq4Var.a;
        j5m j5mVar = descriptor;
        wq5 c = l6bVar.c(j5mVar);
        if (c.e(j5mVar) || !z2) {
            c.j(j5mVar, 0, z2);
        }
        if (c.e(j5mVar) || i != 3) {
            c.A(1, i, j5mVar);
        }
        if (c.e(j5mVar) || j != 50) {
            c.g(j5mVar, 2, j);
        }
        if (c.e(j5mVar) || z) {
            c.j(j5mVar, 3, z);
        }
        c.b(j5mVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
