package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class cx9 implements fx9 {
    public final k79 a;
    public final Function1 b;
    public final Function1 c;
    public boolean d;
    public Object e;
    public int f;

    public cx9(k79 k79Var, Function1 function1, Function1 function12) {
        this.a = k79Var;
        this.b = function1;
        this.c = function12;
    }

    @Override // defpackage.fx9
    public final k79 getItem() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    @Override // defpackage.fx9
    public final k79 q() {
        List list;
        List c0;
        k79 k79Var = this.a;
        jc8 jc8Var = k79Var.a;
        if (this.d) {
            Object obj = this.e;
            ?? r2 = obj;
            if (obj == null) {
                xzb xzbVar = k79Var.b;
                if (jc8Var instanceof rb8) {
                    c0 = c5b.a;
                } else if (jc8Var instanceof hb8) {
                    c0 = c5b.a;
                } else if (jc8Var instanceof fb8) {
                    c0 = c5b.a;
                } else if (jc8Var instanceof mb8) {
                    c0 = c5b.a;
                } else if (jc8Var instanceof ib8) {
                    c0 = c5b.a;
                } else if (jc8Var instanceof nb8) {
                    c0 = c5b.a;
                } else if (jc8Var instanceof jb8) {
                    c0 = c5b.a;
                } else if (jc8Var instanceof db8) {
                    c0 = c5b.a;
                } else if (jc8Var instanceof lb8) {
                    c0 = c5b.a;
                } else if (jc8Var instanceof sb8) {
                    c0 = c5b.a;
                } else if (jc8Var instanceof pb8) {
                    c0 = c5b.a;
                } else if (jc8Var instanceof cb8) {
                    jt8 jt8Var = ((cb8) jc8Var).c;
                    c0 = qwp.x(jt8Var.B, jt8Var.z, xzbVar);
                } else if (jc8Var instanceof gb8) {
                    List list2 = ((gb8) jc8Var).c.y;
                    if (list2 == null) {
                        list2 = c5b.a;
                    }
                    c0 = qwp.r0(list2, xzbVar);
                } else if (jc8Var instanceof eb8) {
                    s09 s09Var = ((eb8) jc8Var).c;
                    c0 = qwp.x(s09Var.u, s09Var.s, xzbVar);
                } else if (jc8Var instanceof kb8) {
                    eb9 eb9Var = ((kb8) jc8Var).c;
                    c0 = qwp.x(eb9Var.t, eb9Var.r, xzbVar);
                } else if (jc8Var instanceof qb8) {
                    c0 = qwp.c0(((qb8) jc8Var).c, xzbVar);
                } else {
                    if (!(jc8Var instanceof ob8)) {
                        b6e.s();
                        return null;
                    }
                    List list3 = ((ob8) jc8Var).c.I;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        jc8 jc8Var2 = ((cm9) it.next()).c;
                        k79 k79Var2 = jc8Var2 != null ? new k79(jc8Var2, xzbVar) : null;
                        if (k79Var2 != null) {
                            arrayList.add(k79Var2);
                        }
                    }
                    list = arrayList;
                    this.e = list;
                    r2 = list;
                }
                list = c0;
                this.e = list;
                r2 = list;
            }
            if (this.f < r2.size()) {
                int i = this.f;
                this.f = i + 1;
                return (k79) r2.get(i);
            }
            Function1 function1 = this.c;
            if (function1 != null) {
                function1.invoke(jc8Var);
            }
        } else {
            Function1 function12 = this.b;
            if (function12 == null || ((Boolean) function12.invoke(jc8Var)).booleanValue()) {
                this.d = true;
                return k79Var;
            }
        }
        return null;
    }
}
