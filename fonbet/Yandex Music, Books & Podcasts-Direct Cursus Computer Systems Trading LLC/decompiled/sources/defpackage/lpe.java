package defpackage;

/* loaded from: classes6.dex */
public final class lpe implements p3d {
    public static final lpe a;
    private static final /* synthetic */ j5m descriptor;

    static {
        lpe lpeVar = new lpe();
        a = lpeVar;
        j5m j5mVar = new j5m("ru.yandex.video.m3.netperf.IntArrayWrapper", lpeVar, 1);
        j5mVar.k("data", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{kpe.d};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int[] iArr;
        eg7Var.getClass();
        j5m j5mVar = descriptor;
        tq5 c = eg7Var.c(j5mVar);
        int i = 1;
        int[] iArr2 = null;
        if (c.m()) {
            iArr = (int[]) c.z(j5mVar, 0, kpe.d, null);
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
                    iArr2 = (int[]) c.z(j5mVar, 0, kpe.d, iArr2);
                    i2 = 1;
                }
            }
            iArr = iArr2;
            i = i2;
        }
        c.b(j5mVar);
        return new npe(iArr, i);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        npe npeVar = (npe) obj;
        l6bVar.getClass();
        npeVar.getClass();
        j5m j5mVar = descriptor;
        wq5 c = l6bVar.c(j5mVar);
        c.k(j5mVar, 0, kpe.d, npeVar.a);
        c.b(j5mVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
