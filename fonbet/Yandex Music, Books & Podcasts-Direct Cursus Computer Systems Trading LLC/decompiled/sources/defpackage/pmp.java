package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class pmp implements kmp {
    public final qqi a = rqi.a();
    public final omp b = new omp(this);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Function2 function2, cg6 cg6Var) {
        lmp lmpVar;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        pmp pmpVar;
        Function2 function22;
        Throwable th;
        oqi oqiVar;
        Object invoke;
        try {
            if (cg6Var instanceof lmp) {
                lmpVar = (lmp) cg6Var;
                int i2 = lmpVar.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lmpVar.o = i2 - Integer.MIN_VALUE;
                    Object obj = lmpVar.m;
                    nm6Var = nm6.a;
                    i = lmpVar.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        lmpVar.j = this;
                        lmpVar.k = (aur) function2;
                        qqiVar = this.a;
                        lmpVar.l = qqiVar;
                        lmpVar.o = 1;
                        if (qqiVar.a(lmpVar) != nm6Var) {
                            pmpVar = this;
                            function22 = function2;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqiVar = (oqi) lmpVar.j;
                        try {
                            qgg.h0(obj);
                            oqiVar.b(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            oqiVar.b(null);
                            throw th;
                        }
                    }
                    qqi qqiVar2 = lmpVar.l;
                    Function2 function23 = (Function2) lmpVar.k;
                    pmpVar = (pmp) lmpVar.j;
                    qgg.h0(obj);
                    qqiVar = qqiVar2;
                    function22 = function23;
                    omp ompVar = pmpVar.b;
                    lmpVar.j = qqiVar;
                    lmpVar.k = null;
                    lmpVar.l = null;
                    lmpVar.o = 2;
                    invoke = function22.invoke(ompVar, lmpVar);
                    if (invoke != nm6Var) {
                        qqi qqiVar3 = qqiVar;
                        obj = invoke;
                        oqiVar = qqiVar3;
                        oqiVar.b(null);
                        return obj;
                    }
                    return nm6Var;
                }
            }
            omp ompVar2 = pmpVar.b;
            lmpVar.j = qqiVar;
            lmpVar.k = null;
            lmpVar.l = null;
            lmpVar.o = 2;
            invoke = function22.invoke(ompVar2, lmpVar);
            if (invoke != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            qqi qqiVar4 = qqiVar;
            th = th3;
            oqiVar = qqiVar4;
            oqiVar.b(null);
            throw th;
        }
        lmpVar = new lmp(this, cg6Var);
        Object obj2 = lmpVar.m;
        nm6Var = nm6.a;
        i = lmpVar.o;
        if (i != 0) {
        }
    }
}
