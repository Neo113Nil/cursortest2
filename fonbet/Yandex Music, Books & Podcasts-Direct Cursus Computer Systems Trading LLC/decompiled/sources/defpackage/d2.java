package defpackage;

import ru.yandex.video.m3.ab.validation.AbValidationType;

/* loaded from: classes6.dex */
public final class d2 implements p3d {
    public static final d2 a;
    private static final /* synthetic */ j5m descriptor;

    static {
        d2 d2Var = new d2();
        a = d2Var;
        j5m j5mVar = new j5m("NoFlagNoSlots", d2Var, 1);
        j5mVar.k("abValidationType", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{f2.c[0]};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        AbValidationType abValidationType;
        eg7Var.getClass();
        j5m j5mVar = descriptor;
        tq5 c = eg7Var.c(j5mVar);
        t9f[] t9fVarArr = f2.c;
        int i = 1;
        AbValidationType abValidationType2 = null;
        if (c.m()) {
            abValidationType = (AbValidationType) c.z(j5mVar, 0, t9fVarArr[0], null);
        } else {
            boolean z = true;
            int i2 = 0;
            while (z) {
                int w = c.w(j5mVar);
                if (w == -1) {
                    z = false;
                } else {
                    if (w != 0) {
                        l1j.g(w);
                        return null;
                    }
                    abValidationType2 = (AbValidationType) c.z(j5mVar, 0, t9fVarArr[0], abValidationType2);
                    i2 = 1;
                }
            }
            abValidationType = abValidationType2;
            i = i2;
        }
        c.b(j5mVar);
        return new f2(i, abValidationType);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        f2 f2Var = (f2) obj;
        l6bVar.getClass();
        f2Var.getClass();
        j5m j5mVar = descriptor;
        wq5 c = l6bVar.c(j5mVar);
        c.k(j5mVar, 0, f2.c[0], f2Var.b);
        c.b(j5mVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
