package defpackage;

import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class gy extends bb0 implements dl {
    public xx P7K7Inc8;
    public final /* synthetic */ iy Qr9iLBAD;
    public int b2ZJblxo;
    public final /* synthetic */ xx eVhOlqcC;
    public final /* synthetic */ long jb9XjC4I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy(iy iyVar, long j, xx xxVar, g9 g9Var) {
        super(2, g9Var);
        this.Qr9iLBAD = iyVar;
        this.jb9XjC4I = j;
        this.eVhOlqcC = xxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        if (r3 == r9) goto L24;
     */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OxcuoDLp(Object obj) {
        Object wxUZMvaN;
        xx xxVar;
        iy iyVar = this.Qr9iLBAD;
        zy zyVar = iyVar.NCTxEWno;
        int i = this.b2ZJblxo;
        xx xxVar2 = this.eVhOlqcC;
        xe0 xe0Var = xe0.qoPGr6Ce;
        int i2 = 1;
        u9 u9Var = u9.NCTxEWno;
        if (i == 0) {
            fn.SgZGMMPL(obj);
            List FySoLYna = ra.FySoLYna(new Long(this.jb9XjC4I));
            this.b2ZJblxo = 1;
            wxUZMvaN = zyVar.wxUZMvaN(FySoLYna, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xxVar = this.P7K7Inc8;
                fn.SgZGMMPL(obj);
                x90 x90Var = iyVar.wxUZMvaN;
                Boolean bool = Boolean.FALSE;
                x90Var.getClass();
                x90Var.eVhOlqcC(null, bool);
                x90 x90Var2 = iyVar.VgvYg0wo;
                r6 r6Var = new r6(g50.ygLcUYwZ(xxVar2), g50.ygLcUYwZ(xxVar));
                x90Var2.getClass();
                x90Var2.eVhOlqcC(null, r6Var);
                return xe0Var;
            }
            fn.SgZGMMPL(obj);
            wxUZMvaN = obj;
        }
        xx xxVar3 = (xx) x5.VGmz0ccI((List) wxUZMvaN);
        if (xxVar3 == null) {
            return xe0Var;
        }
        long j = xxVar2.qoPGr6Ce;
        long j2 = xxVar3.qoPGr6Ce;
        this.P7K7Inc8 = xxVar3;
        this.b2ZJblxo = 2;
        o6 o6Var = zyVar.NCTxEWno;
        p6 p6Var = new p6(0L, j, j2, System.currentTimeMillis());
        Object gjV1z5T1 = fn.gjV1z5T1(this, new cm(o6Var, i2, p6Var), o6Var.qoPGr6Ce, false, true);
        if (gjV1z5T1 != u9Var) {
            gjV1z5T1 = xe0Var;
        }
        if (gjV1z5T1 != u9Var) {
            gjV1z5T1 = xe0Var;
        }
        if (gjV1z5T1 != u9Var) {
            xxVar = xxVar3;
            x90 x90Var3 = iyVar.wxUZMvaN;
            Boolean bool2 = Boolean.FALSE;
            x90Var3.getClass();
            x90Var3.eVhOlqcC(null, bool2);
            x90 x90Var22 = iyVar.VgvYg0wo;
            r6 r6Var2 = new r6(g50.ygLcUYwZ(xxVar2), g50.ygLcUYwZ(xxVar));
            x90Var22.getClass();
            x90Var22.eVhOlqcC(null, r6Var2);
            return xe0Var;
        }
        return u9Var;
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        return ((gy) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0.qoPGr6Ce);
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        return new gy(this.Qr9iLBAD, this.jb9XjC4I, this.eVhOlqcC, g9Var);
    }
}
