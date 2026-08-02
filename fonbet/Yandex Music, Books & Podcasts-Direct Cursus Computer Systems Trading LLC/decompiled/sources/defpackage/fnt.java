package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class fnt implements p3d {
    public static final fnt a;

    @NotNull
    private static final mhp descriptor;

    static {
        fnt fntVar = new fnt();
        a = fntVar;
        j5m j5mVar = new j5m("flex.feature.document.action.UpdateDocumentAction", fntVar, 1);
        j5mVar.k("document", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{knt.b[0].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        q2a q2aVar;
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = knt.b;
        int i = 1;
        q2a q2aVar2 = null;
        if (c.m()) {
            q2aVar = (q2a) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
        } else {
            boolean z = true;
            int i2 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else {
                    if (w != 0) {
                        l1j.g(w);
                        return null;
                    }
                    q2aVar2 = (q2a) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), q2aVar2);
                    i2 = 1;
                }
            }
            q2aVar = q2aVar2;
            i = i2;
        }
        c.b(mhpVar);
        return new knt(i, q2aVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, (t9f) knt.b[0].getValue(), ((knt) obj).a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
