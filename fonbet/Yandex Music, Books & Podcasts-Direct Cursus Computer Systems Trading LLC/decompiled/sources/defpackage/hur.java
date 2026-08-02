package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class hur implements jx7, Continuation {
    public final zt3 a;
    public final /* synthetic */ iur b;
    public zt3 c;
    public gfm d = gfm.b;
    public final g e = g.a;
    public final /* synthetic */ iur f;

    public hur(iur iurVar, zt3 zt3Var) {
        this.f = iurVar;
        this.a = zt3Var;
        this.b = iurVar;
    }

    @Override // defpackage.jx7
    public final long B0(long j) {
        return this.b.B0(j);
    }

    @Override // defpackage.jx7
    public final int L(float f) {
        return this.b.L(f);
    }

    @Override // defpackage.jx7
    public final float N(long j) {
        return this.b.N(j);
    }

    public final Object a(gfm gfmVar, kq2 kq2Var) {
        zt3 zt3Var = new zt3(1, qxe.b(kq2Var));
        zt3Var.s();
        this.d = gfmVar;
        this.c = zt3Var;
        Object q = zt3Var.q();
        nm6 nm6Var = nm6.a;
        return q;
    }

    public final long b() {
        iur iurVar = this.f;
        long B0 = iurVar.B0(bcx.F(iurVar).A.d());
        long j = iurVar.y;
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (B0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (B0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public final aeu c() {
        return bcx.F(this.f).A;
    }

    @Override // defpackage.jx7
    public final float c0(int i) {
        return this.b.c0(i);
    }

    @Override // defpackage.jx7
    public final float d0(float f) {
        return f / this.b.getDensity();
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.e;
    }

    @Override // defpackage.jx7
    public final float getDensity() {
        return this.b.getDensity();
    }

    @Override // defpackage.jx7
    public final float i0() {
        return this.b.i0();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(long j, Function2 function2, cg6 cg6Var) {
        fur furVar;
        int i;
        rar y;
        Throwable th;
        zt3 zt3Var;
        if (cg6Var instanceof fur) {
            furVar = (fur) cg6Var;
            int i2 = furVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                furVar.m = i2 - Integer.MIN_VALUE;
                Object obj = furVar.k;
                Object obj2 = nm6.a;
                i = furVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (j <= 0 && (zt3Var = this.c) != null) {
                        r7o r7oVar = z7o.b;
                        zt3Var.resumeWith(new t7o(new hfm(j)));
                    }
                    y = x97.y(this.f.G0(), null, null, new mj0(j, this, (Continuation) null, 11), 3);
                    try {
                        furVar.j = y;
                        furVar.m = 1;
                        obj = function2.invoke(this, furVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        y.g(rt3.a);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y = furVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        y.g(rt3.a);
                        throw th;
                    }
                }
                y.g(rt3.a);
                return obj;
            }
        }
        furVar = new fur(this, cg6Var);
        Object obj3 = furVar.k;
        Object obj22 = nm6.a;
        i = furVar.m;
        if (i != 0) {
        }
        y.g(rt3.a);
        return obj3;
    }

    @Override // defpackage.jx7
    public final long l(float f) {
        return this.b.l(f);
    }

    @Override // defpackage.jx7
    public final long m(long j) {
        return this.b.m(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(long j, Function2 function2, kq2 kq2Var) {
        gur gurVar;
        int i;
        try {
            if (kq2Var instanceof gur) {
                gurVar = (gur) kq2Var;
                int i2 = gurVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gurVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = gurVar.j;
                    Object obj2 = nm6.a;
                    i = gurVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        gurVar.l = 1;
                        Object k = k(j, function2, gurVar);
                        return k == obj2 ? obj2 : k;
                    }
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            if (i != 0) {
            }
        } catch (hfm unused) {
            return null;
        }
        gurVar = new gur(this, kq2Var);
        Object obj3 = gurVar.j;
        Object obj22 = nm6.a;
        i = gurVar.l;
    }

    @Override // defpackage.jx7
    public final float n0(float f) {
        return this.b.getDensity() * f;
    }

    @Override // defpackage.jx7
    public final float p(long j) {
        return this.b.p(j);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        iur iurVar = this.f;
        synchronized (iurVar.v) {
            iurVar.u.l(this);
        }
        this.a.resumeWith(obj);
    }

    @Override // defpackage.jx7
    public final int s0(long j) {
        return this.b.s0(j);
    }

    @Override // defpackage.jx7
    public final long w(float f) {
        return this.b.w(f);
    }
}
