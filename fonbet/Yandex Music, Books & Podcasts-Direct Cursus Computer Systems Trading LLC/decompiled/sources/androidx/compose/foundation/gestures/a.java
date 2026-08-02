package androidx.compose.foundation.gestures;

import defpackage.bxj;
import defpackage.cg6;
import defpackage.cxo;
import defpackage.dxo;
import defpackage.enj;
import defpackage.exo;
import defpackage.hqi;
import defpackage.iyo;
import defpackage.mxo;
import defpackage.n5;
import defpackage.nm6;
import defpackage.p3k;
import defpackage.qgg;
import defpackage.uoi;
import defpackage.uqn;
import defpackage.xq0;
import defpackage.yci;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class a {
    public static final dxo a = new dxo();
    public static final cxo b = new cxo();
    public static final p3k c = new p3k(1);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(iyo iyoVar, long j, cg6 cg6Var) {
        exo exoVar;
        int i;
        uqn uqnVar;
        iyo iyoVar2;
        if (cg6Var instanceof exo) {
            exoVar = (exo) cg6Var;
            int i2 = exoVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                exoVar.m = i2 - Integer.MIN_VALUE;
                Object obj = exoVar.l;
                nm6 nm6Var = nm6.a;
                i = exoVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    uqnVar = new uqn();
                    hqi hqiVar = hqi.a;
                    n5 n5Var = new n5(iyoVar, j, uqnVar, (Continuation) null, 7);
                    exoVar.j = iyoVar;
                    exoVar.k = uqnVar;
                    exoVar.m = 1;
                    if (iyoVar.e(hqiVar, n5Var, exoVar) == nm6Var) {
                        return nm6Var;
                    }
                    iyoVar2 = iyoVar;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uqn uqnVar2 = exoVar.k;
                    iyo iyoVar3 = exoVar.j;
                    qgg.h0(obj);
                    uqnVar = uqnVar2;
                    iyoVar2 = iyoVar3;
                }
                return new enj(iyoVar2.g(uqnVar.a));
            }
        }
        exoVar = new exo(cg6Var);
        Object obj2 = exoVar.l;
        nm6 nm6Var2 = nm6.a;
        i = exoVar.m;
        if (i != 0) {
        }
        return new enj(iyoVar2.g(uqnVar.a));
    }

    public static yci b(mxo mxoVar, bxj bxjVar, boolean z, boolean z2, uoi uoiVar, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            uoiVar = null;
        }
        return new ScrollableElement(mxoVar, bxjVar, z3, z2, uoiVar);
    }
}
