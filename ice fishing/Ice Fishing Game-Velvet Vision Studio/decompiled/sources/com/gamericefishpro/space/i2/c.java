package com.gamericefishpro.space.i2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends com.gamericefishpro.space.f.b {
    public static c d;
    public static final com.gamericefishpro.space.b3.j e = com.gamericefishpro.space.b3.j.e;
    public static final com.gamericefishpro.space.b3.j f = com.gamericefishpro.space.b3.j.d;
    public com.gamericefishpro.space.r2.f0 c;

    @Override // com.gamericefishpro.space.f.b
    public final int[] b(int i) {
        int iA;
        if (n().length() <= 0 || i >= n().length()) {
            return null;
        }
        com.gamericefishpro.space.b3.j jVar = e;
        if (i < 0) {
            com.gamericefishpro.space.r2.f0 f0Var = this.c;
            if (f0Var == null) {
                Intrinsics.h("layoutResult");
                throw null;
            }
            iA = f0Var.a(0);
        } else {
            com.gamericefishpro.space.r2.f0 f0Var2 = this.c;
            if (f0Var2 == null) {
                Intrinsics.h("layoutResult");
                throw null;
            }
            int iA2 = f0Var2.a(i);
            iA = y(iA2, jVar) == i ? iA2 : iA2 + 1;
        }
        com.gamericefishpro.space.r2.f0 f0Var3 = this.c;
        if (f0Var3 == null) {
            Intrinsics.h("layoutResult");
            throw null;
        }
        if (iA >= f0Var3.b.b) {
            return null;
        }
        return l(y(iA, jVar), y(iA, f) + 1);
    }

    @Override // com.gamericefishpro.space.f.b
    public final int[] x(int i) {
        int iA;
        if (n().length() <= 0 || i <= 0) {
            return null;
        }
        int length = n().length();
        com.gamericefishpro.space.b3.j jVar = f;
        if (i > length) {
            com.gamericefishpro.space.r2.f0 f0Var = this.c;
            if (f0Var == null) {
                Intrinsics.h("layoutResult");
                throw null;
            }
            iA = f0Var.a(n().length());
        } else {
            com.gamericefishpro.space.r2.f0 f0Var2 = this.c;
            if (f0Var2 == null) {
                Intrinsics.h("layoutResult");
                throw null;
            }
            int iA2 = f0Var2.a(i);
            iA = y(iA2, jVar) + 1 == i ? iA2 : iA2 - 1;
        }
        if (iA < 0) {
            return null;
        }
        return l(y(iA, e), y(iA, jVar) + 1);
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
