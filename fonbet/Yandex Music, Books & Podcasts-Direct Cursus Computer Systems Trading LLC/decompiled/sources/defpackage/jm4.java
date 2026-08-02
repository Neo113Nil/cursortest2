package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class jm4 extends z3f {
    public static final ny0 d = new ny0(1);
    public final ot0 a;
    public final im4[] b;
    public final aqd c;

    public jm4(ot0 ot0Var, TreeMap treeMap) {
        this.a = ot0Var;
        this.b = (im4[]) treeMap.values().toArray(new im4[treeMap.size()]);
        this.c = aqd.q((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // defpackage.z3f
    public final Object a(l7f l7fVar) {
        try {
            Object N = this.a.N();
            try {
                l7fVar.b();
                while (l7fVar.hasNext()) {
                    int Y = l7fVar.Y(this.c);
                    if (Y == -1) {
                        l7fVar.j0();
                        l7fVar.w();
                    } else {
                        im4 im4Var = this.b[Y];
                        im4Var.b.set(N, im4Var.c.a(l7fVar));
                    }
                }
                l7fVar.D();
                return N;
            } catch (IllegalAccessException unused) {
                wvs.b();
                return null;
            }
        } catch (IllegalAccessException unused2) {
            wvs.b();
            return null;
        } catch (InstantiationException e) {
            b6e.q(e);
            return null;
        } catch (InvocationTargetException e2) {
            avt.f(e2);
            throw null;
        }
    }

    @Override // defpackage.z3f
    public final void e(n7f n7fVar, Object obj) {
        try {
            n7fVar.g();
            for (im4 im4Var : this.b) {
                n7fVar.z(im4Var.a);
                im4Var.c.e(n7fVar, im4Var.b.get(obj));
            }
            n7fVar.f = false;
            n7fVar.o(3, 5, '}');
        } catch (IllegalAccessException unused) {
            wvs.b();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.a + ")";
    }
}
