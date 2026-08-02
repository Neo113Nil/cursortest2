package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class f5o implements p3d {
    public static final f5o a;

    @NotNull
    private static final mhp descriptor;

    static {
        f5o f5oVar = new f5o();
        a = f5oVar;
        j5m j5mVar = new j5m("com.yandex.plus2.sdk.widget.daily.internal.domain.model.rest.RestExperimentsResponseBody.Experiment", f5oVar, 3);
        j5mVar.k("testId", false);
        j5mVar.k("bucketId", false);
        j5mVar.k("flags", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = h5o.d;
        cqe cqeVar = cqe.a;
        return new t9f[]{ff7.C(cqeVar), ff7.C(cqeVar), ff7.C((t9f) arfVarArr[2].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        Integer num;
        Integer num2;
        upi upiVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = h5o.d;
        Integer num3 = null;
        if (c.m()) {
            cqe cqeVar = cqe.a;
            num = (Integer) c.n(mhpVar, 0, cqeVar, null);
            num2 = (Integer) c.n(mhpVar, 1, cqeVar, null);
            upiVar = (upi) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            Integer num4 = null;
            upi upiVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    num3 = (Integer) c.n(mhpVar, 0, cqe.a, num3);
                    i2 |= 1;
                } else if (w == 1) {
                    num4 = (Integer) c.n(mhpVar, 1, cqe.a, num4);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    upiVar2 = (upi) c.n(mhpVar, 2, (t9f) arfVarArr[2].getValue(), upiVar2);
                    i2 |= 4;
                }
            }
            i = i2;
            num = num3;
            num2 = num4;
            upiVar = upiVar2;
        }
        c.b(mhpVar);
        return new h5o(i, num, num2, upiVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        h5o h5oVar = (h5o) obj;
        l6bVar.getClass();
        h5oVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = h5o.d;
        cqe cqeVar = cqe.a;
        c.q(mhpVar, 0, cqeVar, h5oVar.a);
        c.q(mhpVar, 1, cqeVar, h5oVar.b);
        c.q(mhpVar, 2, (t9f) arfVarArr[2].getValue(), h5oVar.c);
        c.b(mhpVar);
    }
}
