package com.gamericefishpro.space.u1;

import com.gamericefishpro.space.t0.y0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends h0 {
    public final float A;
    public final int B;
    public final int C;
    public final float D;
    public final float E;
    public final float F;
    public final float G;
    public final String d;
    public final List e;
    public final int i;
    public final com.gamericefishpro.space.o1.o v;
    public final float w;
    public final com.gamericefishpro.space.o1.o y;
    public final float z;

    public j0(String str, List list, int i, com.gamericefishpro.space.o1.o oVar, float f, com.gamericefishpro.space.o1.o oVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.d = str;
        this.e = list;
        this.i = i;
        this.v = oVar;
        this.w = f;
        this.y = oVar2;
        this.z = f2;
        this.A = f3;
        this.B = i2;
        this.C = i3;
        this.D = f4;
        this.E = f5;
        this.F = f6;
        this.G = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j0.class == obj.getClass()) {
            j0 j0Var = (j0) obj;
            return Intrinsics.a(this.d, j0Var.d) && Intrinsics.a(this.v, j0Var.v) && this.w == j0Var.w && Intrinsics.a(this.y, j0Var.y) && this.z == j0Var.z && this.A == j0Var.A && this.B == j0Var.B && this.C == j0Var.C && this.D == j0Var.D && this.E == j0Var.E && this.F == j0Var.F && this.G == j0Var.G && this.i == j0Var.i && Intrinsics.a(this.e, j0Var.e);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + (this.d.hashCode() * 31)) * 31;
        com.gamericefishpro.space.o1.o oVar = this.v;
        int iA = y0.a(this.w, (iHashCode + (oVar != null ? oVar.hashCode() : 0)) * 31, 31);
        com.gamericefishpro.space.o1.o oVar2 = this.y;
        return Integer.hashCode(this.i) + y0.a(this.G, y0.a(this.F, y0.a(this.E, y0.a(this.D, com.gamericefishpro.space.m5.a.t(this.C, com.gamericefishpro.space.m5.a.t(this.B, y0.a(this.A, y0.a(this.z, (iA + (oVar2 != null ? oVar2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
