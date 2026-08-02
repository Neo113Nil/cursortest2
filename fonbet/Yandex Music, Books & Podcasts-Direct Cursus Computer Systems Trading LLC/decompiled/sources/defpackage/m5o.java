package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class m5o implements p3d {
    public static final m5o a;

    @NotNull
    private static final mhp descriptor;

    static {
        m5o m5oVar = new m5o();
        a = m5oVar;
        j5m j5mVar = new j5m("com.yandex.plus2.sdk.widget.daily.internal.domain.model.rest.RestPlusStateRequestBody", m5oVar, 3);
        j5mVar.k("geoId", false);
        j5mVar.k("coordinates", false);
        j5mVar.k("geoPinPosition", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        t9f C = ff7.C(cqe.a);
        o5o o5oVar = o5o.a;
        return new t9f[]{C, ff7.C(o5oVar), ff7.C(o5oVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        Integer num;
        q5o q5oVar;
        q5o q5oVar2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        Integer num2 = null;
        if (c.m()) {
            num = (Integer) c.n(mhpVar, 0, cqe.a, null);
            o5o o5oVar = o5o.a;
            q5oVar = (q5o) c.n(mhpVar, 1, o5oVar, null);
            q5oVar2 = (q5o) c.n(mhpVar, 2, o5oVar, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            q5o q5oVar3 = null;
            q5o q5oVar4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    num2 = (Integer) c.n(mhpVar, 0, cqe.a, num2);
                    i2 |= 1;
                } else if (w == 1) {
                    q5oVar3 = (q5o) c.n(mhpVar, 1, o5o.a, q5oVar3);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    q5oVar4 = (q5o) c.n(mhpVar, 2, o5o.a, q5oVar4);
                    i2 |= 4;
                }
            }
            i = i2;
            num = num2;
            q5oVar = q5oVar3;
            q5oVar2 = q5oVar4;
        }
        c.b(mhpVar);
        return new r5o(i, num, q5oVar, q5oVar2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        r5o r5oVar = (r5o) obj;
        l6bVar.getClass();
        r5oVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.q(mhpVar, 0, cqe.a, r5oVar.a);
        o5o o5oVar = o5o.a;
        c.q(mhpVar, 1, o5oVar, r5oVar.b);
        c.q(mhpVar, 2, o5oVar, r5oVar.c);
        c.b(mhpVar);
    }
}
