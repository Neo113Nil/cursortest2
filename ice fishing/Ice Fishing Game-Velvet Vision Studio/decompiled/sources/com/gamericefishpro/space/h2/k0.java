package com.gamericefishpro.space.h2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements com.gamericefishpro.space.c3.c {
    public boolean d;
    public long e = 9223372034707292159L;
    public long i = 0;
    public final /* synthetic */ n0 v;

    public k0(n0 n0Var) {
        this.v = n0Var;
    }

    public final void a(com.gamericefishpro.space.f2.m mVar, float f) {
        n0 n0Var = this.v;
        w1 w1Var = n0Var.F;
        if (w1Var == null) {
            w1Var = new w1();
            n0Var.F = w1Var;
        }
        int iU = com.gamericefishpro.space.ph.v.u((com.gamericefishpro.space.f2.m[]) w1Var.b, mVar);
        if (iU >= 0) {
            float[] fArr = (float[]) w1Var.c;
            if (fArr[iU] != f) {
                fArr[iU] = f;
                ((byte[]) w1Var.d)[iU] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) w1Var.d;
                if (bArr[iU] == 2) {
                    bArr[iU] = 0;
                    return;
                }
                return;
            }
        }
        int i = w1Var.a;
        com.gamericefishpro.space.f2.m[] mVarArr = (com.gamericefishpro.space.f2.m[]) w1Var.b;
        if (i == mVarArr.length) {
            int i2 = i * 2;
            Object[] objArrCopyOf = Arrays.copyOf(mVarArr, i2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            w1Var.b = (com.gamericefishpro.space.f2.m[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf((float[]) w1Var.c, i2);
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
            w1Var.c = fArrCopyOf;
            byte[] bArrCopyOf = Arrays.copyOf((byte[]) w1Var.d, i2);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            w1Var.d = bArrCopyOf;
        }
        ((com.gamericefishpro.space.f2.m[]) w1Var.b)[i] = mVar;
        ((byte[]) w1Var.d)[i] = 3;
        ((float[]) w1Var.c)[i] = f;
        w1Var.a++;
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float b() {
        return this.v.b();
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float g() {
        return this.v.g();
    }
}
