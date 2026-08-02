package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class ya7 implements cb7 {
    public final /* synthetic */ cb7 a;
    public final /* synthetic */ cb7 b;

    public ya7(cb7 cb7Var, cb7 cb7Var2) {
        this.a = cb7Var;
        this.b = cb7Var2;
    }

    @Override // defpackage.cb7
    public final Object C(Object obj, wa7 wa7Var) {
        return this.a.C(obj, wa7Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.cb7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M(cg6 cg6Var) {
        wa7 wa7Var;
        nm6 nm6Var;
        int i;
        ya7 ya7Var;
        Object C;
        Object obj;
        if (cg6Var instanceof wa7) {
            wa7Var = (wa7) cg6Var;
            int i2 = wa7Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wa7Var.n = i2 - Integer.MIN_VALUE;
                Object obj2 = wa7Var.l;
                nm6Var = nm6.a;
                i = wa7Var.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    wa7Var.j = this;
                    wa7Var.n = 1;
                    obj2 = this.a.M(wa7Var);
                    if (obj2 != nm6Var) {
                        ya7Var = this;
                    }
                }
                if (i == 1) {
                    ya7Var = (ya7) wa7Var.j;
                    qgg.h0(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj3 = wa7Var.j;
                            qgg.h0(obj2);
                            return obj3;
                        }
                        ya7Var = (ya7) wa7Var.j;
                        qgg.h0(obj2);
                        if (obj2 == null) {
                            return null;
                        }
                        cb7 cb7Var = ya7Var.a;
                        wa7Var.j = obj2;
                        wa7Var.n = 4;
                        return cb7Var.N(obj2, wa7Var) == nm6Var ? nm6Var : obj2;
                    }
                    Object obj4 = wa7Var.k;
                    ya7 ya7Var2 = (ya7) wa7Var.j;
                    qgg.h0(obj2);
                    obj = obj4;
                    ya7Var = ya7Var2;
                    if (!((Boolean) obj2).booleanValue()) {
                        return obj;
                    }
                    cb7 cb7Var2 = ya7Var.b;
                    wa7Var.j = ya7Var;
                    wa7Var.k = null;
                    wa7Var.n = 3;
                    obj2 = cb7Var2.M(wa7Var);
                }
                wa7Var.j = ya7Var;
                wa7Var.k = obj2;
                wa7Var.n = 2;
                C = ya7Var.a.C(obj2, wa7Var);
                if (C != nm6Var) {
                    obj = obj2;
                    obj2 = C;
                    if (!((Boolean) obj2).booleanValue()) {
                    }
                }
            }
        }
        wa7Var = new wa7(this, cg6Var);
        Object obj22 = wa7Var.l;
        nm6Var = nm6.a;
        i = wa7Var.n;
        if (i != 0) {
        }
        wa7Var.j = ya7Var;
        wa7Var.k = obj22;
        wa7Var.n = 2;
        C = ya7Var.a.C(obj22, wa7Var);
        if (C != nm6Var) {
        }
    }

    @Override // defpackage.cb7
    public final Object N(Object obj, cg6 cg6Var) {
        Object Q = gld.Q(new d57(this.a, obj, this.b, (Continuation) null, 2), cg6Var);
        return Q == nm6.a ? Q : Unit.a;
    }

    @Override // defpackage.cb7
    public final ya7 S(qec qecVar) {
        return new ya7(this, qecVar);
    }
}
