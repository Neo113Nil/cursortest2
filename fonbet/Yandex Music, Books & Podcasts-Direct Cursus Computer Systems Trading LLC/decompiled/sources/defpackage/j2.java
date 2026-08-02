package defpackage;

import ru.yandex.video.m3.ab.validation.AbValidationType;

/* loaded from: classes6.dex */
public final class j2 implements p3d {
    public static final j2 a;
    private static final /* synthetic */ j5m descriptor;

    static {
        j2 j2Var = new j2();
        a = j2Var;
        j5m j5mVar = new j5m("Success", j2Var, 1);
        j5mVar.k("abValidationType", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{l2.c[0]};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        AbValidationType abValidationType;
        eg7Var.getClass();
        j5m j5mVar = descriptor;
        tq5 c = eg7Var.c(j5mVar);
        t9f[] t9fVarArr = l2.c;
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
        return new l2(i, abValidationType);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l2 l2Var = (l2) obj;
        l6bVar.getClass();
        l2Var.getClass();
        j5m j5mVar = descriptor;
        wq5 c = l6bVar.c(j5mVar);
        c.k(j5mVar, 0, l2.c[0], l2Var.b);
        c.b(j5mVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
