package defpackage;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class v5a implements p3d {
    public static final v5a a;

    @NotNull
    private static final mhp descriptor;

    static {
        v5a v5aVar = new v5a();
        a = v5aVar;
        j5m j5mVar = new j5m("flex.parser.query.DocumentQuerySurrogate", v5aVar, 3);
        j5mVar.k("path", false);
        j5mVar.k("params", false);
        j5mVar.k("body", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, ff7.C((t9f) x5a.d[1].getValue()), ff7.C(s5f.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        Map map;
        q5f q5fVar;
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = x5a.d;
        String str2 = null;
        if (c.m()) {
            str = c.g(mhpVar, 0);
            map = (Map) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            q5fVar = (q5f) c.n(mhpVar, 2, s5f.a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            Map map2 = null;
            q5f q5fVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    map2 = (Map) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), map2);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    q5fVar2 = (q5f) c.n(mhpVar, 2, s5f.a, q5fVar2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str2;
            map = map2;
            q5fVar = q5fVar2;
        }
        c.b(mhpVar);
        return new x5a(i, str, map, q5fVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        x5a x5aVar = (x5a) obj;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = x5a.d;
        c.p(mhpVar, 0, x5aVar.a);
        c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), x5aVar.b);
        c.q(mhpVar, 2, s5f.a, x5aVar.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
