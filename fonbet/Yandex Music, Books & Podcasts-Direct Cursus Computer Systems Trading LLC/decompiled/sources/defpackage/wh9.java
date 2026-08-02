package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class wh9 {
    public final nm9 a;
    public final w2s b;

    public wh9(nm9 nm9Var, w2s w2sVar) {
        this.a = nm9Var;
        this.b = w2sVar;
    }

    public static d0c a(jc8 jc8Var, gc8 gc8Var, pm9 pm9Var, d0c d0cVar) {
        d0c h = gc8Var.getRuntimeStore$div_release().h(jc8Var, d0cVar.a, pm9Var.c());
        rdk rdkVar = h.c;
        if (rdkVar != null) {
            rdkVar.O(gc8Var);
        }
        return h;
    }

    public final void b(jc8 jc8Var, gc8 gc8Var, pm9 pm9Var, d0c d0cVar) {
        if (jc8Var instanceof cb8) {
            jt8 jt8Var = ((cb8) jc8Var).c;
            d(jc8Var, gc8Var, jt8Var.B, jt8Var.z, pm9Var, d0cVar);
            return;
        }
        if (jc8Var instanceof gb8) {
            d(jc8Var, gc8Var, ((gb8) jc8Var).c.y, null, pm9Var, d0cVar);
            return;
        }
        if (jc8Var instanceof eb8) {
            s09 s09Var = ((eb8) jc8Var).c;
            d(jc8Var, gc8Var, s09Var.u, s09Var.s, pm9Var, d0cVar);
            return;
        }
        if (jc8Var instanceof kb8) {
            eb9 eb9Var = ((kb8) jc8Var).c;
            d(jc8Var, gc8Var, eb9Var.t, eb9Var.r, pm9Var, d0cVar);
            return;
        }
        if (jc8Var instanceof ob8) {
            ob8 ob8Var = (ob8) jc8Var;
            e(ob8Var.c, gc8Var, pm9Var, a(ob8Var, gc8Var, pm9Var, d0cVar));
            return;
        }
        if (jc8Var instanceof qb8) {
            qb8 qb8Var = (qb8) jc8Var;
            f(qb8Var.c, gc8Var, pm9Var, a(qb8Var, gc8Var, pm9Var, d0cVar));
            return;
        }
        if (jc8Var instanceof db8) {
            a(jc8Var, gc8Var, pm9Var, d0cVar);
            return;
        }
        if (jc8Var instanceof fb8) {
            a(jc8Var, gc8Var, pm9Var, d0cVar);
            return;
        }
        if (jc8Var instanceof hb8) {
            a(jc8Var, gc8Var, pm9Var, d0cVar);
            return;
        }
        if (jc8Var instanceof ib8) {
            a(jc8Var, gc8Var, pm9Var, d0cVar);
            return;
        }
        if (jc8Var instanceof jb8) {
            a(jc8Var, gc8Var, pm9Var, d0cVar);
            return;
        }
        if (jc8Var instanceof lb8) {
            a(jc8Var, gc8Var, pm9Var, d0cVar);
            return;
        }
        if (jc8Var instanceof mb8) {
            a(jc8Var, gc8Var, pm9Var, d0cVar);
            return;
        }
        if (jc8Var instanceof nb8) {
            a(jc8Var, gc8Var, pm9Var, d0cVar);
            return;
        }
        if (jc8Var instanceof rb8) {
            a(jc8Var, gc8Var, pm9Var, d0cVar);
        } else if (jc8Var instanceof sb8) {
            a(jc8Var, gc8Var, pm9Var, d0cVar);
        } else if (jc8Var instanceof pb8) {
            a(jc8Var, gc8Var, pm9Var, d0cVar);
        }
    }

    public final void c(jc8 jc8Var, gc8 gc8Var, pm9 pm9Var, d0c d0cVar, boolean z) {
        if (z) {
            b(jc8Var, gc8Var, pm9Var, d0cVar);
            return;
        }
        gc8Var.getRuntimeStore$div_release().d(gc8Var.getRuntimeStore$div_release().h(jc8Var, d0cVar.a, pm9Var.c()), pm9Var, new am8(gc8Var, 1));
    }

    public final void d(jc8 jc8Var, gc8 gc8Var, List list, pr8 pr8Var, pm9 pm9Var, d0c d0cVar) {
        d0c a = a(jc8Var, gc8Var, pm9Var, d0cVar);
        zzb zzbVar = a.a;
        int i = 0;
        if (pr8Var == null) {
            if (list != null) {
                ArrayList K = wvo.K(list, gd9.s, gd9.t);
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        u75.n();
                        throw null;
                    }
                    b((jc8) obj, gc8Var, pm9Var.b((String) K.get(i)), a);
                    i = i2;
                }
                return;
            }
            return;
        }
        ArrayList w = qwp.w(pr8Var, zzbVar);
        ArrayList K2 = wvo.K(w, gd9.u, gd9.v);
        Iterator it = w.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            k79 k79Var = (k79) next;
            pm9 b = pm9Var.b((String) K2.get(i));
            d0c j = gc8Var.getRuntimeStore$div_release().j(b, k79Var.a, k79Var.b, zzbVar);
            jc8 jc8Var2 = k79Var.a;
            if (j == null) {
                j = a;
            }
            b(jc8Var2, gc8Var, b, j);
            i = i3;
        }
    }

    public final void e(dm9 dm9Var, gc8 gc8Var, pm9 pm9Var, d0c d0cVar) {
        gc8 gc8Var2;
        d0c d0cVar2;
        zzb zzbVar = d0cVar.a;
        StringBuilder sb = new StringBuilder();
        sb.append(pm9Var.f());
        sb.append('/');
        List list = pm9Var.c;
        sb.append((String) CollectionsKt.Y(list));
        String b = this.a.b(dm9Var, gc8Var, zzbVar, sb.toString());
        for (cm9 cm9Var : dm9Var.I) {
            jc8 jc8Var = cm9Var.c;
            String str = cm9Var.d;
            if (jc8Var == null) {
                gc8Var2 = gc8Var;
                d0cVar2 = d0cVar;
            } else {
                gc8Var2 = gc8Var;
                d0cVar2 = d0cVar;
                c(jc8Var, gc8Var2, pm9Var.a((String) CollectionsKt.Y(list), cm9Var, str), d0cVar2, Intrinsics.d(str, b));
            }
            gc8Var = gc8Var2;
            d0cVar = d0cVar2;
        }
    }

    public final void f(vo9 vo9Var, gc8 gc8Var, pm9 pm9Var, d0c d0cVar) {
        d0c d0cVar2;
        int i;
        boolean z;
        wh9 wh9Var;
        gc8 gc8Var2;
        List list = vo9Var.q;
        String str = gc8Var.getDivTag().a;
        String c = pm9Var.c();
        Map map = (Map) this.b.a.get(str);
        Integer num = map != null ? (Integer) map.get(c) : null;
        if (num != null) {
            i = num.intValue();
            d0cVar2 = d0cVar;
        } else {
            d0cVar2 = d0cVar;
            long longValue = ((Number) vo9Var.y.a(d0cVar2.a)).longValue();
            long j = longValue >> 31;
            i = (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        ArrayList K = wvo.K(list, gd9.D, gd9.t);
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                u75.n();
                throw null;
            }
            jc8 jc8Var = ((ro9) obj).a;
            pm9 b = pm9Var.b((String) K.get(i2));
            if (i == i2) {
                z = true;
                gc8Var2 = gc8Var;
                wh9Var = this;
            } else {
                z = false;
                wh9Var = this;
                gc8Var2 = gc8Var;
            }
            wh9Var.c(jc8Var, gc8Var2, b, d0cVar2, z);
            d0cVar2 = d0cVar;
            i2 = i3;
        }
    }
}
