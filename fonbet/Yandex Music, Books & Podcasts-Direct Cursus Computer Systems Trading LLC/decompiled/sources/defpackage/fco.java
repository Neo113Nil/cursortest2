package defpackage;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class fco extends nco {
    public final nco a;
    public final zvs b;
    public final q3t c;
    public final fys d;
    public final boolean e;
    public int f;

    public fco(nco ncoVar, zvs zvsVar, q3t q3tVar, fys fysVar, boolean z) {
        ncoVar.getClass();
        zvsVar.getClass();
        this.a = ncoVar;
        this.b = zvsVar;
        this.c = q3tVar;
        this.d = fysVar;
        this.e = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.nco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, Exception exc, cg6 cg6Var) {
        eco ecoVar;
        int i;
        fys fysVar;
        zvs zvsVar;
        Exception exc2;
        Unit unit;
        if (cg6Var instanceof eco) {
            ecoVar = (eco) cg6Var;
            int i2 = ecoVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ecoVar.p = i2 - Integer.MIN_VALUE;
                Object obj = ecoVar.n;
                nm6 nm6Var = nm6.a;
                i = ecoVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    if (this.f >= 1) {
                        return Boolean.FALSE;
                    }
                    fysVar = this.d;
                    qdc qdcVar = fysVar.b;
                    zvs zvsVar2 = this.b;
                    if (!qdcVar.N(zvsVar2)) {
                        unit = null;
                        if (unit == null) {
                            return Boolean.FALSE;
                        }
                        this.f++;
                        ecoVar.k = null;
                        ecoVar.l = null;
                        ecoVar.m = null;
                        ecoVar.j = z;
                        ecoVar.p = 2;
                        Object a = this.a.a(z, exc, ecoVar);
                        return a == nm6Var ? nm6Var : a;
                    }
                    try {
                        q3t q3tVar = this.c;
                        boolean z2 = this.e;
                        ecoVar.k = exc;
                        ecoVar.l = fysVar;
                        ecoVar.m = zvsVar2;
                        ecoVar.j = z;
                        ecoVar.p = 1;
                        if (rvf.u(q3tVar, zvsVar2, z2, ecoVar) != nm6Var) {
                            exc2 = exc;
                            zvsVar = zvsVar2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        zvsVar = zvsVar2;
                        fysVar.b.P(zvsVar);
                        throw th;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = ecoVar.j;
                zvsVar = ecoVar.m;
                fysVar = ecoVar.l;
                exc2 = ecoVar.k;
                try {
                    qgg.h0(obj);
                } catch (Throwable th2) {
                    th = th2;
                    fysVar.b.P(zvsVar);
                    throw th;
                }
                unit = Unit.a;
                fysVar.b.P(zvsVar);
                exc = exc2;
                if (unit == null) {
                }
            }
        }
        ecoVar = new eco(this, cg6Var);
        Object obj2 = ecoVar.n;
        nm6 nm6Var2 = nm6.a;
        i = ecoVar.p;
        if (i != 0) {
        }
        unit = Unit.a;
        fysVar.b.P(zvsVar);
        exc = exc2;
        if (unit == null) {
        }
    }
}
