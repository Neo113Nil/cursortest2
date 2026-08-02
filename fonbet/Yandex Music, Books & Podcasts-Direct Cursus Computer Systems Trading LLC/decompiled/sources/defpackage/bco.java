package defpackage;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class bco extends nco {
    public final nco a;
    public final bp3 b;
    public int c;

    public bco(nco ncoVar, bp3 bp3Var) {
        ncoVar.getClass();
        this.a = ncoVar;
        this.b = bp3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r11 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.nco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, Exception exc, cg6 cg6Var) {
        aco acoVar;
        int i;
        if (cg6Var instanceof aco) {
            acoVar = (aco) cg6Var;
            int i2 = acoVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                acoVar.n = i2 - Integer.MIN_VALUE;
                Object obj = acoVar.l;
                nm6 nm6Var = nm6.a;
                i = acoVar.n;
                nco ncoVar = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    if (this.c >= 1) {
                        acoVar.k = null;
                        acoVar.j = z;
                        acoVar.n = 1;
                        Object a = ncoVar.a(z, exc, acoVar);
                        if (a != nm6Var) {
                            return a;
                        }
                    } else {
                        acoVar.k = exc;
                        acoVar.j = z;
                        acoVar.n = 2;
                        Object a2 = ((bal) this.b.a.getValue()).a(2, acoVar);
                        if (a2 != nm6Var) {
                            a2 = Unit.a;
                        }
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
                z = acoVar.j;
                exc = acoVar.k;
                qgg.h0(obj);
                this.c++;
                acoVar.k = null;
                acoVar.j = z;
                acoVar.n = 3;
                Object a3 = ncoVar.a(z, exc, acoVar);
                return a3 != nm6Var ? nm6Var : a3;
            }
        }
        acoVar = new aco(this, cg6Var);
        Object obj2 = acoVar.l;
        nm6 nm6Var2 = nm6.a;
        i = acoVar.n;
        nco ncoVar2 = this.a;
        if (i != 0) {
        }
        this.c++;
        acoVar.k = null;
        acoVar.j = z;
        acoVar.n = 3;
        Object a32 = ncoVar2.a(z, exc, acoVar);
        if (a32 != nm6Var2) {
        }
    }
}
