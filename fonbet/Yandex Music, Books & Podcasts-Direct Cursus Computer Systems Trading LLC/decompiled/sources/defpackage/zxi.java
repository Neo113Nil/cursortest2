package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class zxi implements wxi {
    public final na0 a;
    public final ykl b;
    public final aqi c;
    public final ja0 d;

    public zxi(na0 na0Var, ykl yklVar, aqi aqiVar) {
        aqiVar.getClass();
        this.a = na0Var;
        this.b = yklVar;
        this.c = aqiVar;
        this.d = na0Var.e;
    }

    @Override // defpackage.wxi
    public final long K(int i, long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
        if (i == 2) {
            return 0L;
        }
        if (i == 1) {
            return (Float.floatToRawIntBits(this.d.b(intBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        }
        dfi.r("Unexpected value source ".concat(i == 1 ? "UserInput" : i == 2 ? "SideEffect" : i == 3 ? "Relocate" : "Invalid"), "PlayerScreen");
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r7.d.i(r12, r6) == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.wxi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(long j, long j2, Continuation continuation) {
        xxi xxiVar;
        int i;
        if (continuation instanceof xxi) {
            xxiVar = (xxi) continuation;
            int i2 = xxiVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xxiVar.n = i2 - Integer.MIN_VALUE;
                xxi xxiVar2 = xxiVar;
                Object obj = xxiVar2.l;
                Object obj2 = nm6.a;
                i = xxiVar2.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (this.c.getValue() == lmf.b) {
                        float c = yzt.c(j2);
                        xxiVar2.j = j;
                        xxiVar2.k = j2;
                        xxiVar2.n = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = xxiVar2.k;
                    j = xxiVar2.j;
                    qgg.h0(obj);
                }
                long j3 = j2;
                xxiVar2.j = j;
                xxiVar2.k = j3;
                xxiVar2.n = 2;
                Object k = super.k(j, j3, xxiVar2);
                return k != obj2 ? obj2 : k;
            }
        }
        xxiVar = new xxi(this, (cg6) continuation);
        xxi xxiVar22 = xxiVar;
        Object obj3 = xxiVar22.l;
        Object obj22 = nm6.a;
        i = xxiVar22.n;
        if (i != 0) {
        }
        long j32 = j2;
        xxiVar22.j = j;
        xxiVar22.k = j32;
        xxiVar22.n = 2;
        Object k2 = super.k(j, j32, xxiVar22);
        if (k2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r12.i(r2, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
    
        if (com.yandex.music.core.ui.compose.draggable.a.i(r12, r2, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.wxi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r0(long j, Continuation continuation) {
        yxi yxiVar;
        int i;
        long j2;
        if (continuation instanceof yxi) {
            yxiVar = (yxi) continuation;
            int i2 = yxiVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yxiVar.m = i2 - Integer.MIN_VALUE;
                Object obj = yxiVar.k;
                nm6 nm6Var = nm6.a;
                i = yxiVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!this.a.a()) {
                        return new yzt(j);
                    }
                    ja0 ja0Var = this.d;
                    j2 = 0;
                    if (ja0Var.g.getValue() == lf3.b) {
                        return new yzt(0L);
                    }
                    float c = yzt.c(j);
                    ykl yklVar = this.b;
                    if (c < 0.0f && ((Boolean) yklVar.invoke()).booleanValue()) {
                        float c2 = yzt.c(j);
                        yxiVar.j = j;
                        yxiVar.m = 1;
                    } else if (yzt.c(j) > 0.0f && ((Boolean) yklVar.invoke()).booleanValue()) {
                        lf3 lf3Var = lf3.a;
                        yxiVar.j = j;
                        yxiVar.m = 2;
                    }
                    return new yzt(j2);
                }
                if (i != 1 && i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = yxiVar.j;
                qgg.h0(obj);
                j2 = j;
                return new yzt(j2);
            }
        }
        yxiVar = new yxi(this, (cg6) continuation);
        Object obj2 = yxiVar.k;
        nm6 nm6Var2 = nm6.a;
        i = yxiVar.m;
        if (i != 0) {
        }
        j2 = j;
        return new yzt(j2);
    }

    @Override // defpackage.wxi
    public final long x(int i, long j) {
        aqi aqiVar = this.c;
        if (i == 1) {
            aqiVar.setValue(lmf.b);
        }
        if (!this.a.a()) {
            return j;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (intBitsToFloat >= 0.0f || aqiVar.getValue() != lmf.b) {
            return 0L;
        }
        float b = this.d.b(intBitsToFloat);
        return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(b) & 4294967295L);
    }
}
