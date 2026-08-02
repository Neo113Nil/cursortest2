package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class t5o implements p3d {
    public static final t5o a;

    @NotNull
    private static final mhp descriptor;

    static {
        t5o t5oVar = new t5o();
        a = t5oVar;
        j5m j5mVar = new j5m("com.yandex.plus2.sdk.widget.daily.internal.domain.model.rest.RestPlusStateResponseBody.Balance", t5oVar, 2);
        j5mVar.k("amount", true);
        j5mVar.k("currency", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C(tkr.a), ff7.C((t9f) w5o.c[1].getValue())};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        v5o v5oVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = w5o.c;
        String str2 = null;
        if (c.m()) {
            str = (String) c.n(mhpVar, 0, tkr.a, null);
            v5oVar = (v5o) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            v5o v5oVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = (String) c.n(mhpVar, 0, tkr.a, str2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    v5oVar2 = (v5o) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), v5oVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            str = str2;
            v5oVar = v5oVar2;
        }
        c.b(mhpVar);
        return new w5o(i, str, v5oVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        w5o w5oVar = (w5o) obj;
        l6bVar.getClass();
        w5oVar.getClass();
        v5o v5oVar = w5oVar.b;
        String str = w5oVar.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = w5o.c;
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 0, tkr.a, str);
        }
        if (c.e(mhpVar) || v5oVar != null) {
            c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), v5oVar);
        }
        c.b(mhpVar);
    }
}
