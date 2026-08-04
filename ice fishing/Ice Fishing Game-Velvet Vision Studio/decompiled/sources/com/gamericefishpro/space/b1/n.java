package com.gamericefishpro.space.b1;

import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.t0.x;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final StackTraceElement[] a = new StackTraceElement[0];
    public static final o b = new o(0, new long[0], new Object[0]);

    public static final int a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }

    public static final h c(int i, com.gamericefishpro.space.oh.d dVar, r rVar) {
        Object objP = rVar.P();
        if (objP == com.gamericefishpro.space.t0.n.a) {
            objP = new h(i, dVar, true);
            rVar.k0(objP);
        }
        h hVar = (h) objP;
        if (!Intrinsics.a(hVar.i, dVar)) {
            boolean z = hVar.i == null;
            hVar.i = dVar;
            if (!z && hVar.e) {
                p1 p1Var = hVar.v;
                if (p1Var != null) {
                    x xVar = p1Var.a;
                    if (xVar != null) {
                        xVar.s(p1Var, null);
                    }
                    hVar.v = null;
                }
                ArrayList arrayList = hVar.w;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        p1 p1Var2 = (p1) arrayList.get(i2);
                        x xVar2 = p1Var2.a;
                        if (xVar2 != null) {
                            xVar2.s(p1Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return hVar;
    }

    public static final boolean d(p1 p1Var, p1 p1Var2) {
        if (p1Var == null) {
            return true;
        }
        if (p1Var instanceof p1) {
            return !p1Var.b() || p1Var.equals(p1Var2) || Intrinsics.a(p1Var.c, p1Var2.c);
        }
        return false;
    }
}
