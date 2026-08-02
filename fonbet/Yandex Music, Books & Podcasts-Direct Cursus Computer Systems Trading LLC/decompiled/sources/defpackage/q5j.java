package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class q5j extends n9 {
    public npb e;

    public q5j(k79 k79Var, int i, npb npbVar) {
        super(k79Var, i);
        this.e = npbVar;
    }

    public final List k() {
        jc8 jc8Var;
        k79 k79Var = (k79) this.c;
        xzb xzbVar = k79Var.b;
        jc8 jc8Var2 = k79Var.a;
        if (jc8Var2 instanceof rb8) {
            return c5b.a;
        }
        if (jc8Var2 instanceof hb8) {
            return c5b.a;
        }
        if (jc8Var2 instanceof fb8) {
            return c5b.a;
        }
        if (jc8Var2 instanceof mb8) {
            return c5b.a;
        }
        if (jc8Var2 instanceof ib8) {
            return c5b.a;
        }
        if (jc8Var2 instanceof nb8) {
            return c5b.a;
        }
        if (jc8Var2 instanceof jb8) {
            return c5b.a;
        }
        if (jc8Var2 instanceof lb8) {
            return c5b.a;
        }
        if (jc8Var2 instanceof sb8) {
            return c5b.a;
        }
        if (jc8Var2 instanceof pb8) {
            return c5b.a;
        }
        if (jc8Var2 instanceof cb8) {
            jt8 jt8Var = ((cb8) jc8Var2).c;
            return l(qwp.x(jt8Var.B, jt8Var.z, xzbVar));
        }
        if (jc8Var2 instanceof db8) {
            List list = ((db8) jc8Var2).c.q;
            if (list == null) {
                list = c5b.a;
            }
            return l(qwp.r0(list, xzbVar));
        }
        if (jc8Var2 instanceof gb8) {
            List list2 = ((gb8) jc8Var2).c.y;
            if (list2 == null) {
                list2 = c5b.a;
            }
            return l(qwp.r0(list2, xzbVar));
        }
        if (jc8Var2 instanceof eb8) {
            s09 s09Var = ((eb8) jc8Var2).c;
            return l(qwp.x(s09Var.u, s09Var.s, xzbVar));
        }
        if (jc8Var2 instanceof kb8) {
            eb9 eb9Var = ((kb8) jc8Var2).c;
            return l(qwp.x(eb9Var.t, eb9Var.r, xzbVar));
        }
        if (jc8Var2 instanceof qb8) {
            return l(qwp.c0(((qb8) jc8Var2).c, xzbVar));
        }
        if (jc8Var2 instanceof ob8) {
            cm9 S = vq1.S(((ob8) jc8Var2).c, xzbVar);
            return (S == null || (jc8Var = S.c) == null) ? c5b.a : l(t75.c(new k79(jc8Var, xzbVar)));
        }
        b6e.s();
        return null;
    }

    public final ArrayList l(List list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            arrayList.add(new q5j((k79) obj, i, this.e));
            i = i2;
        }
        return arrayList;
    }
}
