package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class jk0 {
    public static final j6e a = j6e.s("k", "x", "y");

    public static ik0 a(m7f m7fVar, ayg aygVar) {
        ArrayList arrayList = new ArrayList();
        if (m7fVar.peek() == 1) {
            m7fVar.a();
            while (m7fVar.hasNext()) {
                m7f m7fVar2 = m7fVar;
                ayg aygVar2 = aygVar;
                arrayList.add(new jak(aygVar2, ccf.b(m7fVar2, aygVar2, rvt.c(), ofc.h, m7fVar.peek() == 3, false)));
                m7fVar = m7fVar2;
                aygVar = aygVar2;
            }
            m7fVar.g();
            dcf.b(arrayList);
        } else {
            arrayList.add(new acf(p7f.b(m7fVar, rvt.c())));
        }
        ik0 ik0Var = new ik0();
        ik0Var.a = arrayList;
        return ik0Var;
    }

    public static ok0 b(m7f m7fVar, ayg aygVar) {
        m7fVar.b();
        ik0 ik0Var = null;
        hk0 hk0Var = null;
        boolean z = false;
        hk0 hk0Var2 = null;
        while (m7fVar.peek() != 4) {
            int D = m7fVar.D(a);
            if (D == 0) {
                ik0Var = a(m7fVar, aygVar);
            } else if (D != 1) {
                if (D != 2) {
                    m7fVar.H();
                    m7fVar.w();
                } else if (m7fVar.peek() == 6) {
                    m7fVar.w();
                    z = true;
                } else {
                    hk0Var = vnj.J(m7fVar, aygVar, true);
                }
            } else if (m7fVar.peek() == 6) {
                m7fVar.w();
                z = true;
            } else {
                hk0Var2 = vnj.J(m7fVar, aygVar, true);
            }
        }
        m7fVar.o();
        if (z) {
            aygVar.a("Lottie doesn't support expressions.");
        }
        return ik0Var != null ? ik0Var : new kk0(hk0Var2, hk0Var);
    }
}
