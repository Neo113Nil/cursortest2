package defpackage;

/* loaded from: classes6.dex */
public final class w5b implements p3d {
    public static final w5b a;
    private static final /* synthetic */ j5m descriptor;

    static {
        w5b w5bVar = new w5b();
        a = w5bVar;
        j5m j5mVar = new j5m("ru.yandex.video.m3.ab.config.service.EnableHevcServiceFlag", w5bVar, 3);
        j5mVar.k("service", true);
        j5mVar.k("defaultFlagValue", true);
        j5mVar.k("enable", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        oc3 oc3Var = oc3.a;
        return new t9f[]{ff7.C(tkr.a), oc3Var, oc3Var};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        boolean z2;
        int i;
        String str;
        eg7Var.getClass();
        j5m j5mVar = descriptor;
        tq5 c = eg7Var.c(j5mVar);
        if (c.m()) {
            str = (String) c.n(j5mVar, 0, tkr.a, null);
            z2 = c.D(j5mVar, 1);
            z = c.D(j5mVar, 2);
            i = 7;
        } else {
            boolean z3 = true;
            boolean z4 = false;
            int i2 = 0;
            String str2 = null;
            boolean z5 = false;
            while (z3) {
                int w = c.w(j5mVar);
                if (w == -1) {
                    z3 = false;
                } else if (w == 0) {
                    str2 = (String) c.n(j5mVar, 0, tkr.a, str2);
                    i2 |= 1;
                } else if (w == 1) {
                    z5 = c.D(j5mVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    z4 = c.D(j5mVar, 2);
                    i2 |= 4;
                }
            }
            z = z4;
            z2 = z5;
            i = i2;
            str = str2;
        }
        c.b(j5mVar);
        return new y5b(str, z2, z, i);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        y5b y5bVar = (y5b) obj;
        l6bVar.getClass();
        y5bVar.getClass();
        j5m j5mVar = descriptor;
        wq5 c = l6bVar.c(j5mVar);
        oc3 oc3Var = oc3.a;
        yjp.d(y5bVar, c, j5mVar);
        boolean z = y5bVar.d;
        boolean z2 = y5bVar.c;
        if (c.e(j5mVar) || z2) {
            c.j(j5mVar, 1, z2);
        }
        if (c.e(j5mVar) || z != z2) {
            c.j(j5mVar, 2, z);
        }
        c.b(j5mVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
