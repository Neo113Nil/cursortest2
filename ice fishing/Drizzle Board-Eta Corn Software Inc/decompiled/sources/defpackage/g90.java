package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class g90 extends bb0 implements dl {
    public int P7K7Inc8;
    public final /* synthetic */ long Qr9iLBAD;
    public final /* synthetic */ h90 b2ZJblxo;
    public final /* synthetic */ ArrayList eVhOlqcC;
    public final /* synthetic */ int jb9XjC4I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g90(h90 h90Var, long j, int i, ArrayList arrayList, g9 g9Var) {
        super(2, g9Var);
        this.b2ZJblxo = h90Var;
        this.Qr9iLBAD = j;
        this.jb9XjC4I = i;
        this.eVhOlqcC = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        if (r1.OnDfzHZD(r2, r23) == r5) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0083, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (r1 == r5) goto L15;
     */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OxcuoDLp(Object obj) {
        Object gjV1z5T1;
        int i = this.P7K7Inc8;
        h90 h90Var = this.b2ZJblxo;
        u9 u9Var = u9.NCTxEWno;
        if (i == 0) {
            fn.SgZGMMPL(obj);
            v80 v80Var = h90Var.MdtA4re8;
            i90 i90Var = h90Var.wxUZMvaN;
            List list = h90Var.eVhOlqcC;
            this.P7K7Inc8 = 1;
            y80 y80Var = v80Var.qoPGr6Ce;
            z80 z80Var = new z80(0L, i90Var.NCTxEWno, this.Qr9iLBAD, this.jb9XjC4I, System.currentTimeMillis(), x5.Sjrx9cEN(this.eVhOlqcC, ",", null, null, null, 62), x5.Sjrx9cEN(list, ",", null, null, null, 62));
            gjV1z5T1 = fn.gjV1z5T1(this, new cm(y80Var, 7, z80Var), y80Var.qoPGr6Ce, false, true);
        } else {
            if (i != 1) {
                if (i == 2) {
                    fn.SgZGMMPL(obj);
                    return xe0.qoPGr6Ce;
                }
                m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fn.SgZGMMPL(obj);
            gjV1z5T1 = obj;
        }
        long longValue = ((Number) gjV1z5T1).longValue();
        h70 h70Var = h90Var.b2ZJblxo;
        Long l = new Long(longValue);
        this.P7K7Inc8 = 2;
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        return ((g90) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0.qoPGr6Ce);
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        return new g90(this.b2ZJblxo, this.Qr9iLBAD, this.jb9XjC4I, this.eVhOlqcC, g9Var);
    }
}
