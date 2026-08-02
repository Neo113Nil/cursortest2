package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class xva implements wxi {
    public final e2o a;
    public final b9r b;

    public xva(e2o e2oVar, b9r b9rVar) {
        e2oVar.getClass();
        this.a = e2oVar;
        this.b = b9rVar;
    }

    @Override // defpackage.wxi
    public final long K(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        float f = enj.f(j2);
        if (f == 0.0f) {
            return 0L;
        }
        return swf.i(0.0f, this.a.a.b(f));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.wxi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(long j, long j2, Continuation continuation) {
        vva vvaVar;
        int i;
        if (continuation instanceof vva) {
            vvaVar = (vva) continuation;
            int i2 = vvaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vvaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = vvaVar.j;
                nm6 nm6Var = nm6.a;
                i = vvaVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    vvaVar.l = 1;
                    if (this.a.c(this.b, vvaVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new yzt(0L);
            }
        }
        vvaVar = new vva(this, (cg6) continuation);
        Object obj2 = vvaVar.j;
        nm6 nm6Var2 = nm6.a;
        i = vvaVar.l;
        if (i != 0) {
        }
        return new yzt(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.wxi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r0(long j, Continuation continuation) {
        wva wvaVar;
        int i;
        if (continuation instanceof wva) {
            wvaVar = (wva) continuation;
            int i2 = wvaVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wvaVar.m = i2 - Integer.MIN_VALUE;
                Object obj = wvaVar.k;
                nm6 nm6Var = nm6.a;
                i = wvaVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (yzt.c(j) < 0.0f) {
                        e2o e2oVar = this.a;
                        ja0 ja0Var = e2oVar.a;
                        float e = ja0Var.j.e();
                        if (!Float.isNaN(e) && e > ja0Var.c().c()) {
                            wvaVar.j = j;
                            wvaVar.m = 1;
                            if (e2oVar.c(this.b, wvaVar) == nm6Var) {
                                return nm6Var;
                            }
                        }
                    }
                    j = 0;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = wvaVar.j;
                    qgg.h0(obj);
                }
                return new yzt(j);
            }
        }
        wvaVar = new wva(this, (cg6) continuation);
        Object obj2 = wvaVar.k;
        nm6 nm6Var2 = nm6.a;
        i = wvaVar.m;
        if (i != 0) {
        }
        return new yzt(j);
    }

    @Override // defpackage.wxi
    public final long x(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        float f = enj.f(j);
        if (f < 0.0f) {
            return swf.i(0.0f, this.a.a.b(f));
        }
        return 0L;
    }
}
