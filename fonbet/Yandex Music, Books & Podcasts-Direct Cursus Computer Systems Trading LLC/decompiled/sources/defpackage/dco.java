package defpackage;

/* loaded from: classes4.dex */
public final class dco extends nco {
    public final nco a;
    public final zvs b;
    public final q3t c;
    public int d;

    public dco(nco ncoVar, zvs zvsVar, q3t q3tVar) {
        ncoVar.getClass();
        zvsVar.getClass();
        this.a = ncoVar;
        this.b = zvsVar;
        this.c = q3tVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        if (defpackage.rvf.u(r8.c, r8.b, true, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.nco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, Exception exc, cg6 cg6Var) {
        cco ccoVar;
        int i;
        if (cg6Var instanceof cco) {
            ccoVar = (cco) cg6Var;
            int i2 = ccoVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ccoVar.n = i2 - Integer.MIN_VALUE;
                Object obj = ccoVar.l;
                nm6 nm6Var = nm6.a;
                i = ccoVar.n;
                nco ncoVar = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    if (this.d >= 2) {
                        ccoVar.k = null;
                        ccoVar.j = z;
                        ccoVar.n = 1;
                        Object a = ncoVar.a(z, exc, ccoVar);
                        if (a != nm6Var) {
                            return a;
                        }
                    } else {
                        ccoVar.k = exc;
                        ccoVar.j = z;
                        ccoVar.n = 2;
                    }
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i == 3) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = ccoVar.j;
                exc = ccoVar.k;
                qgg.h0(obj);
                this.d++;
                ccoVar.k = null;
                ccoVar.j = z;
                ccoVar.n = 3;
                Object a2 = ncoVar.a(z, exc, ccoVar);
                return a2 != nm6Var ? nm6Var : a2;
            }
        }
        ccoVar = new cco(this, cg6Var);
        Object obj2 = ccoVar.l;
        nm6 nm6Var2 = nm6.a;
        i = ccoVar.n;
        nco ncoVar2 = this.a;
        if (i != 0) {
        }
        this.d++;
        ccoVar.k = null;
        ccoVar.j = z;
        ccoVar.n = 3;
        Object a22 = ncoVar2.a(z, exc, ccoVar);
        if (a22 != nm6Var2) {
        }
    }
}
