package com.gamericefishpro.space.i2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.gamericefishpro.space.f.b {
    public static d e;
    public static final com.gamericefishpro.space.b3.j f = com.gamericefishpro.space.b3.j.e;
    public static final com.gamericefishpro.space.b3.j g = com.gamericefishpro.space.b3.j.d;
    public com.gamericefishpro.space.r2.f0 c;
    public com.gamericefishpro.space.o2.o d;

    @Override // com.gamericefishpro.space.f.b
    public final int[] b(int i) {
        int iB;
        if (n().length() <= 0 || i >= n().length()) {
            return null;
        }
        try {
            com.gamericefishpro.space.o2.o oVar = this.d;
            if (oVar == null) {
                Intrinsics.h("node");
                throw null;
            }
            com.gamericefishpro.space.n1.c cVarG = oVar.g();
            int iRound = Math.round(cVarG.d - cVarG.b);
            if (i <= 0) {
                i = 0;
            }
            com.gamericefishpro.space.r2.f0 f0Var = this.c;
            if (f0Var == null) {
                Intrinsics.h("layoutResult");
                throw null;
            }
            int iA = f0Var.a(i);
            com.gamericefishpro.space.r2.f0 f0Var2 = this.c;
            if (f0Var2 == null) {
                Intrinsics.h("layoutResult");
                throw null;
            }
            float fD = f0Var2.d(iA) + iRound;
            com.gamericefishpro.space.r2.f0 f0Var3 = this.c;
            if (f0Var3 == null) {
                Intrinsics.h("layoutResult");
                throw null;
            }
            if (f0Var3 == null) {
                Intrinsics.h("layoutResult");
                throw null;
            }
            if (fD < f0Var3.d(f0Var3.b.b - 1)) {
                com.gamericefishpro.space.r2.f0 f0Var4 = this.c;
                if (f0Var4 == null) {
                    Intrinsics.h("layoutResult");
                    throw null;
                }
                iB = f0Var4.b(fD);
            } else {
                com.gamericefishpro.space.r2.f0 f0Var5 = this.c;
                if (f0Var5 == null) {
                    Intrinsics.h("layoutResult");
                    throw null;
                }
                iB = f0Var5.b.b;
            }
            return l(i, y(iB - 1, g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.gamericefishpro.space.f.b
    public final int[] x(int i) {
        int iB;
        if (n().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            com.gamericefishpro.space.o2.o oVar = this.d;
            if (oVar == null) {
                Intrinsics.h("node");
                throw null;
            }
            com.gamericefishpro.space.n1.c cVarG = oVar.g();
            int iRound = Math.round(cVarG.d - cVarG.b);
            int length = n().length();
            if (length <= i) {
                i = length;
            }
            com.gamericefishpro.space.r2.f0 f0Var = this.c;
            if (f0Var == null) {
                Intrinsics.h("layoutResult");
                throw null;
            }
            int iA = f0Var.a(i);
            com.gamericefishpro.space.r2.f0 f0Var2 = this.c;
            if (f0Var2 == null) {
                Intrinsics.h("layoutResult");
                throw null;
            }
            float fD = f0Var2.d(iA) - iRound;
            if (fD > 0.0f) {
                com.gamericefishpro.space.r2.f0 f0Var3 = this.c;
                if (f0Var3 == null) {
                    Intrinsics.h("layoutResult");
                    throw null;
                }
                iB = f0Var3.b(fD);
            } else {
                iB = 0;
            }
            if (i == n().length() && iB < iA) {
                iB++;
            }
            return l(y(iB, f), i);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int y(int i, com.gamericefishpro.space.b3.j jVar) {
        com.gamericefishpro.space.r2.f0 f0Var = this.c;
        if (f0Var == null) {
            Intrinsics.h("layoutResult");
            throw null;
        }
        int iC = f0Var.c(i);
        com.gamericefishpro.space.r2.f0 f0Var2 = this.c;
        if (f0Var2 == null) {
            Intrinsics.h("layoutResult");
            throw null;
        }
        if (jVar != f0Var2.e(iC)) {
            com.gamericefishpro.space.r2.f0 f0Var3 = this.c;
            if (f0Var3 != null) {
                return f0Var3.c(i);
            }
            Intrinsics.h("layoutResult");
            throw null;
        }
        com.gamericefishpro.space.r2.f0 f0Var4 = this.c;
        if (f0Var4 == null) {
            Intrinsics.h("layoutResult");
            throw null;
        }
        com.gamericefishpro.space.f1.k kVar = f0Var4.b;
        kVar.g(i);
        ArrayList arrayList = (ArrayList) kVar.e;
        com.gamericefishpro.space.r2.m mVar = (com.gamericefishpro.space.r2.m) arrayList.get(com.gamericefishpro.space.r2.a0.d(i, arrayList));
        return (mVar.a.d.e(i - mVar.d) + mVar.b) - 1;
    }
}
