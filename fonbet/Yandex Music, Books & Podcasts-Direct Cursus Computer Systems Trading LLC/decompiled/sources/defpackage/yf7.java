package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class yf7 {
    public final Class a;
    public final List b;
    public final z2o c;
    public final chm d;
    public final String e;

    public yf7(Class cls, Class cls2, Class cls3, List list, z2o z2oVar, chm chmVar) {
        this.a = cls;
        this.b = list;
        this.c = z2oVar;
        this.d = chmVar;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
    
        if (r0 == 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
    
        if (r2 != 2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b9, code lost:
    
        if (r0 == 1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k2o a(int i, int i2, oa7 oa7Var, pwj pwjVar, j4x j4xVar) {
        k2o k2oVar;
        d7t d7tVar;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Object t97Var;
        chm chmVar = this.d;
        Object f = chmVar.f();
        w1g.s(f, "Argument must not be null");
        List list = (List) f;
        try {
            k2o b = b(oa7Var, i, i2, pwjVar, list);
            chmVar.c(list);
            xf7 xf7Var = (xf7) j4xVar.c;
            int i4 = j4xVar.b;
            wf7 wf7Var = xf7Var.a;
            Class<?> cls = b.get().getClass();
            r2o r2oVar = null;
            if (i4 != 4) {
                d7t e = wf7Var.e(cls);
                d7tVar = e;
                k2oVar = e.a(xf7Var.h, b, xf7Var.l, xf7Var.m);
            } else {
                k2oVar = b;
                d7tVar = null;
            }
            if (!b.equals(k2oVar)) {
                b.g();
            }
            if (wf7Var.c.a().d.c(k2oVar.h()) != null) {
                r2oVar = wf7Var.c.a().d.c(k2oVar.h());
                if (r2oVar == null) {
                    throw new lsn(k2oVar.h());
                }
                i3 = r2oVar.w(xf7Var.o);
            } else {
                i3 = 3;
            }
            r2o r2oVar2 = r2oVar;
            daf dafVar = xf7Var.u;
            ArrayList b2 = wf7Var.b();
            int size = b2.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    break;
                }
                if (((jci) b2.get(i5)).a.equals(dafVar)) {
                    z = true;
                    break;
                }
                i5++;
            }
            switch (xf7Var.n.a) {
                default:
                    z2 = true;
                    if (!z) {
                        break;
                    }
                    break;
                case 0:
                case 1:
                    z2 = false;
                    break;
            }
            if (z2) {
                if (r2oVar2 == null) {
                    throw new lsn(k2oVar.get().getClass());
                }
                int D = ouj.D(i3);
                if (D == 0) {
                    z3 = false;
                    z4 = true;
                    t97Var = new t97(xf7Var.u, xf7Var.i);
                } else {
                    if (D != 1) {
                        xq0.x("Unknown strategy: ".concat(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                        return null;
                    }
                    z3 = false;
                    z4 = true;
                    t97Var = new m2o(wf7Var.c.a, xf7Var.u, xf7Var.i, xf7Var.l, xf7Var.m, d7tVar, cls, xf7Var.o);
                }
                rqg rqgVar = (rqg) rqg.e.f();
                rqgVar.d = z3;
                rqgVar.c = z4;
                rqgVar.b = k2oVar;
                vx6 vx6Var = xf7Var.f;
                vx6Var.b = t97Var;
                vx6Var.c = r2oVar2;
                vx6Var.d = rqgVar;
                k2oVar = rqgVar;
            }
            return this.c.w(k2oVar, pwjVar);
        } catch (Throwable th) {
            chmVar.c(list);
            throw th;
        }
    }

    public final k2o b(oa7 oa7Var, int i, int i2, pwj pwjVar, List list) {
        List list2 = this.b;
        int size = list2.size();
        k2o k2oVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            o2o o2oVar = (o2o) list2.get(i3);
            try {
                if (o2oVar.a(oa7Var.a(), pwjVar)) {
                    k2oVar = o2oVar.b(oa7Var.a(), i, i2, pwjVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + o2oVar, e);
                }
                list.add(e);
            }
            if (k2oVar != null) {
                break;
            }
        }
        if (k2oVar != null) {
            return k2oVar;
        }
        throw new lld(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
