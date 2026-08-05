package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class j6 extends bb0 implements dl {
    public int P7K7Inc8;
    public final /* synthetic */ int Qr9iLBAD;
    public final /* synthetic */ xg[] b2ZJblxo;
    public final /* synthetic */ z2 eVhOlqcC;
    public final /* synthetic */ AtomicInteger jb9XjC4I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(xg[] xgVarArr, int i, AtomicInteger atomicInteger, z2 z2Var, g9 g9Var) {
        super(2, g9Var);
        this.b2ZJblxo = xgVarArr;
        this.Qr9iLBAD = i;
        this.jb9XjC4I = atomicInteger;
        this.eVhOlqcC = z2Var;
    }

    @Override // defpackage.h9
    public final Object OxcuoDLp(Object obj) {
        int i = this.P7K7Inc8;
        AtomicInteger atomicInteger = this.jb9XjC4I;
        z2 z2Var = this.eVhOlqcC;
        try {
            if (i == 0) {
                fn.SgZGMMPL(obj);
                xg[] xgVarArr = this.b2ZJblxo;
                int i2 = this.Qr9iLBAD;
                xg xgVar = xgVarArr[i2];
                i6 i6Var = new i6(z2Var, i2);
                this.P7K7Inc8 = 1;
                Object NCTxEWno = xgVar.NCTxEWno(i6Var, this);
                u9 u9Var = u9.NCTxEWno;
                if (NCTxEWno == u9Var) {
                    return u9Var;
                }
            } else {
                if (i != 1) {
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fn.SgZGMMPL(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                e50.NCTxEWno(z2Var);
            }
            return xe0.qoPGr6Ce;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                e50.NCTxEWno(z2Var);
            }
        }
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        return ((j6) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0.qoPGr6Ce);
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        return new j6(this.b2ZJblxo, this.Qr9iLBAD, this.jb9XjC4I, this.eVhOlqcC, g9Var);
    }
}
