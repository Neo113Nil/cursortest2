package defpackage;

/* loaded from: classes6.dex */
public final class qle implements p3d {
    public static final qle a;
    private static final /* synthetic */ j5m descriptor;

    static {
        qle qleVar = new qle();
        a = qleVar;
        j5m j5mVar = new j5m("ru.yandex.video.m3.list_player_manager.model.InitFlags", qleVar, 1);
        j5mVar.k("blurHashOnOtherThread", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{oc3.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        eg7Var.getClass();
        j5m j5mVar = descriptor;
        tq5 c = eg7Var.c(j5mVar);
        int i = 1;
        if (c.m()) {
            z = c.D(j5mVar, 0);
        } else {
            boolean z2 = true;
            z = false;
            int i2 = 0;
            while (z2) {
                int w = c.w(j5mVar);
                if (w == -1) {
                    z2 = false;
                } else {
                    if (w != 0) {
                        l1j.g(w);
                        return null;
                    }
                    z = c.D(j5mVar, 0);
                    i2 = 1;
                }
            }
            i = i2;
        }
        c.b(j5mVar);
        return new sle(i, z);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        sle sleVar = (sle) obj;
        l6bVar.getClass();
        sleVar.getClass();
        boolean z = sleVar.a;
        j5m j5mVar = descriptor;
        wq5 c = l6bVar.c(j5mVar);
        if (c.e(j5mVar) || z) {
            c.j(j5mVar, 0, z);
        }
        c.b(j5mVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
