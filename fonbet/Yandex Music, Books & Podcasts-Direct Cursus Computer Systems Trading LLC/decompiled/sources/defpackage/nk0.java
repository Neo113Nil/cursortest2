package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class nk0 {
    public static final j6e a = j6e.s("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");
    public static final j6e b = j6e.s("k");

    public static void a(hk0 hk0Var, ayg aygVar) {
        Float valueOf = Float.valueOf(0.0f);
        List list = hk0Var.b;
        if (list.isEmpty()) {
            list.add(new acf(aygVar, valueOf, valueOf, (Interpolator) null, 0.0f, Float.valueOf(aygVar.m)));
        } else if (((acf) list.get(0)).b == null) {
            list.set(0, new acf(aygVar, valueOf, valueOf, (Interpolator) null, 0.0f, Float.valueOf(aygVar.m)));
        }
    }

    public static boolean b(hk0 hk0Var) {
        if (hk0Var != null) {
            return hk0Var.c() && ((Float) ((acf) hk0Var.b.get(0)).b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0119, code lost:
    
        if (r1.b == 1.0f) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static mk0 c(m7f m7fVar, ayg aygVar) {
        gk0 gk0Var;
        boolean z = m7fVar.peek() == 3;
        if (z) {
            m7fVar.b();
        }
        ik0 ik0Var = null;
        ok0 ok0Var = null;
        hk0 hk0Var = null;
        gk0 gk0Var2 = null;
        hk0 hk0Var2 = null;
        hk0 hk0Var3 = null;
        hk0 hk0Var4 = null;
        hk0 hk0Var5 = null;
        hk0 hk0Var6 = null;
        gk0 gk0Var3 = null;
        hk0 hk0Var7 = null;
        hk0 hk0Var8 = null;
        while (m7fVar.hasNext()) {
            switch (m7fVar.D(a)) {
                case 0:
                    m7fVar.b();
                    while (m7fVar.hasNext()) {
                        if (m7fVar.D(b) != 0) {
                            m7fVar.H();
                            m7fVar.w();
                        } else {
                            ik0Var = jk0.a(m7fVar, aygVar);
                        }
                    }
                    m7fVar.o();
                    break;
                case 1:
                    ok0Var = jk0.b(m7fVar, aygVar);
                    break;
                case 2:
                    gk0Var2 = new gk0(dcf.a(m7fVar, aygVar, 1.0f, gos.h, false), 4);
                    break;
                case 3:
                    hk0Var6 = vnj.J(m7fVar, aygVar, false);
                    a(hk0Var6, aygVar);
                    break;
                case 4:
                    hk0Var = vnj.J(m7fVar, aygVar, false);
                    a(hk0Var, aygVar);
                    break;
                case 5:
                    gk0Var3 = vnj.L(m7fVar, aygVar);
                    break;
                case 6:
                    hk0Var7 = vnj.J(m7fVar, aygVar, false);
                    break;
                case 7:
                    hk0Var8 = vnj.J(m7fVar, aygVar, false);
                    break;
                case 8:
                    hk0Var2 = vnj.J(m7fVar, aygVar, false);
                    break;
                case 9:
                    hk0Var3 = vnj.J(m7fVar, aygVar, false);
                    break;
                case 10:
                    hk0Var4 = vnj.J(m7fVar, aygVar, false);
                    a(hk0Var4, aygVar);
                    break;
                case 11:
                    hk0Var5 = vnj.J(m7fVar, aygVar, false);
                    a(hk0Var5, aygVar);
                    break;
                default:
                    m7fVar.H();
                    m7fVar.w();
                    break;
            }
        }
        if (z) {
            m7fVar.o();
        }
        if (ik0Var == null || (ik0Var.c() && ((PointF) ((acf) ik0Var.a.get(0)).b).equals(0.0f, 0.0f))) {
            ik0Var = null;
        }
        ok0 ok0Var2 = (ok0Var == null || (!(ok0Var instanceof kk0) && ok0Var.c() && ((PointF) ((acf) ok0Var.b().get(0)).b).equals(0.0f, 0.0f))) ? null : ok0Var;
        hk0 hk0Var9 = b(hk0Var) ? null : hk0Var;
        if (gk0Var2 != null) {
            if (gk0Var2.c()) {
                tso tsoVar = (tso) ((acf) gk0Var2.b.get(0)).b;
                if (tsoVar.a == 1.0f) {
                }
            }
            gk0Var = gk0Var2;
            return new mk0(ik0Var, ok0Var2, gk0Var, hk0Var9, gk0Var3, hk0Var7, hk0Var8, (hk0Var2 != null || (hk0Var2.c() && ((Float) ((acf) hk0Var2.b.get(0)).b).floatValue() == 0.0f)) ? null : hk0Var2, (hk0Var3 != null || (hk0Var3.c() && ((Float) ((acf) hk0Var3.b.get(0)).b).floatValue() == 0.0f)) ? null : hk0Var3, !b(hk0Var4) ? null : hk0Var4, !b(hk0Var5) ? null : hk0Var5, !b(hk0Var6) ? null : hk0Var6);
        }
        gk0Var = null;
        return new mk0(ik0Var, ok0Var2, gk0Var, hk0Var9, gk0Var3, hk0Var7, hk0Var8, (hk0Var2 != null || (hk0Var2.c() && ((Float) ((acf) hk0Var2.b.get(0)).b).floatValue() == 0.0f)) ? null : hk0Var2, (hk0Var3 != null || (hk0Var3.c() && ((Float) ((acf) hk0Var3.b.get(0)).b).floatValue() == 0.0f)) ? null : hk0Var3, !b(hk0Var4) ? null : hk0Var4, !b(hk0Var5) ? null : hk0Var5, !b(hk0Var6) ? null : hk0Var6);
    }
}
