package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class cct implements wxi {
    public final /* synthetic */ mct a;
    public final /* synthetic */ aqi b;

    public cct(mct mctVar, aqi aqiVar) {
        this.a = mctVar;
        this.b = aqiVar;
    }

    @Override // defpackage.wxi
    public final long K(int i, long j, long j2) {
        if (!((Boolean) this.b.getValue()).booleanValue()) {
            return 0L;
        }
        float f = enj.f(j2);
        mct mctVar = this.a;
        if (f < 0.0f || enj.f(j) < 0.0f) {
            t6k t6kVar = mctVar.e;
            t6k t6kVar2 = mctVar.e;
            float e = t6kVar.e();
            mctVar.b(enj.f(j) + t6kVar2.e());
            return swf.i(0.0f, t6kVar2.e() - e);
        }
        if (enj.f(j2) <= 0.0f) {
            return 0L;
        }
        t6k t6kVar3 = mctVar.e;
        t6k t6kVar4 = mctVar.e;
        float e2 = t6kVar3.e();
        mctVar.b(enj.f(j2) + t6kVar4.e());
        return swf.i(0.0f, t6kVar4.e() - e2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.wxi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(long j, long j2, Continuation continuation) {
        bct bctVar;
        Object obj;
        nm6 nm6Var;
        int i;
        cct cctVar;
        long j3;
        long j4;
        long j5;
        if (continuation instanceof bct) {
            bctVar = (bct) continuation;
            int i2 = bctVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bctVar.o = i2 - Integer.MIN_VALUE;
                bct bctVar2 = bctVar;
                obj = bctVar2.m;
                nm6Var = nm6.a;
                i = bctVar2.o;
                if (i != 0) {
                    qgg.h0(obj);
                    bctVar2.j = j;
                    bctVar2.k = j2;
                    bctVar2.o = 1;
                    cctVar = this;
                    obj = super.k(j, j2, bctVar2);
                    if (obj != nm6Var) {
                        j3 = j;
                        j4 = j2;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j5 = bctVar2.l;
                    qgg.h0(obj);
                    return new yzt(yzt.e(j5, ((yzt) obj).a));
                }
                j4 = bctVar2.k;
                j3 = bctVar2.j;
                qgg.h0(obj);
                cctVar = this;
                long j6 = ((yzt) obj).a;
                float c = yzt.c(j4);
                mct mctVar = cctVar.a;
                mctVar.getClass();
                b9r b9rVar = mctVar.b;
                bctVar2.j = j3;
                bctVar2.k = j4;
                bctVar2.l = j6;
                bctVar2.o = 2;
                obj = kct.d(mctVar, c, b9rVar, bctVar2);
                if (obj != nm6Var) {
                    j5 = j6;
                    return new yzt(yzt.e(j5, ((yzt) obj).a));
                }
                return nm6Var;
            }
        }
        bctVar = new bct(this, (cg6) continuation);
        bct bctVar22 = bctVar;
        obj = bctVar22.m;
        nm6Var = nm6.a;
        i = bctVar22.o;
        if (i != 0) {
        }
        long j62 = ((yzt) obj).a;
        float c2 = yzt.c(j4);
        mct mctVar2 = cctVar.a;
        mctVar2.getClass();
        b9r b9rVar2 = mctVar2.b;
        bctVar22.j = j3;
        bctVar22.k = j4;
        bctVar22.l = j62;
        bctVar22.o = 2;
        obj = kct.d(mctVar2, c2, b9rVar2, bctVar22);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    @Override // defpackage.wxi
    public final long x(int i, long j) {
        if (!((Boolean) this.b.getValue()).booleanValue()) {
            return 0L;
        }
        float f = enj.f(j);
        mct mctVar = this.a;
        if (f > 0.0f && !mctVar.a.a()) {
            return 0L;
        }
        t6k t6kVar = mctVar.e;
        t6k t6kVar2 = mctVar.e;
        float e = t6kVar.e();
        mctVar.b(enj.f(j) + t6kVar2.e());
        if (e == t6kVar2.e()) {
            return 0L;
        }
        return enj.a(0.0f, 0.0f, 2, j);
    }
}
