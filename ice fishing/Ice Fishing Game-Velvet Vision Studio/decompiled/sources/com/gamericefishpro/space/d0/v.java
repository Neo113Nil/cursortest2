package com.gamericefishpro.space.d0;

import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements g {
    public static final v b = new v(0);
    public final /* synthetic */ int a;

    public /* synthetic */ v(int i) {
        this.a = i;
    }

    public static final a c(int i, String str) {
        WeakHashMap weakHashMap = m1.v;
        return new a(i, str);
    }

    public static final j1 d(int i, String str) {
        WeakHashMap weakHashMap = m1.v;
        return new j1(new m0(0, 0, 0, 0), str);
    }

    public static m1 f(com.gamericefishpro.space.t0.r rVar) {
        m1 m1Var;
        View view = (View) rVar.j(com.gamericefishpro.space.i2.j0.f);
        WeakHashMap weakHashMap = m1.v;
        synchronized (weakHashMap) {
            try {
                Object m1Var2 = weakHashMap.get(view);
                if (m1Var2 == null) {
                    m1Var2 = new m1(view);
                    weakHashMap.put(view, m1Var2);
                }
                m1Var = (m1) m1Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean zH = rVar.h(m1Var) | rVar.h(view);
        Object objP = rVar.P();
        if (zH || objP == com.gamericefishpro.space.t0.n.a) {
            objP = new q0(2, m1Var, view);
            rVar.k0(objP);
        }
        com.gamericefishpro.space.t0.i.d(m1Var, (Function1) objP, rVar);
        return m1Var;
    }

    @Override // com.gamericefishpro.space.d0.g
    public void b(int i, com.gamericefishpro.space.f2.n0 n0Var, int[] iArr, int[] iArr2) {
        switch (this.a) {
            case 1:
                h.c(i, iArr, iArr2, false);
                break;
            default:
                h.b(iArr, iArr2, false);
                break;
        }
    }

    public com.gamericefishpro.space.h1.m e(com.gamericefishpro.space.h1.m mVar, com.gamericefishpro.space.h1.e eVar) {
        return mVar.c(new m(eVar));
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Arrangement#Bottom";
            case 2:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }
}
