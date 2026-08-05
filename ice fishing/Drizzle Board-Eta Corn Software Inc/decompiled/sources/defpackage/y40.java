package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class y40 extends bb0 implements dl {
    public int P7K7Inc8;
    public final /* synthetic */ long Qr9iLBAD;
    public final /* synthetic */ d50 b2ZJblxo;
    public final /* synthetic */ int jb9XjC4I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y40(d50 d50Var, long j, int i, g9 g9Var) {
        super(2, g9Var);
        this.b2ZJblxo = d50Var;
        this.Qr9iLBAD = j;
        this.jb9XjC4I = i;
    }

    @Override // defpackage.h9
    public final Object OxcuoDLp(Object obj) {
        int i = this.P7K7Inc8;
        xe0 xe0Var = xe0.qoPGr6Ce;
        if (i != 0) {
            if (i == 1) {
                fn.SgZGMMPL(obj);
                return xe0Var;
            }
            m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fn.SgZGMMPL(obj);
        zy zyVar = this.b2ZJblxo.NCTxEWno;
        this.P7K7Inc8 = 1;
        v30 v30Var = zyVar.qoPGr6Ce.qoPGr6Ce;
        final int i2 = this.jb9XjC4I;
        final long j = this.Qr9iLBAD;
        Object gjV1z5T1 = fn.gjV1z5T1(this, new zk() { // from class: my
            @Override // defpackage.zk
            public final Object ow5vqvCr(Object obj2) {
                int i3 = i2;
                long j2 = j;
                f40 f40Var = (f40) obj2;
                f40Var.getClass();
                h40 Ey6iv0m0 = f40Var.Ey6iv0m0("UPDATE pairings SET rating = ? WHERE id = ?");
                try {
                    Ey6iv0m0.qoPGr6Ce(1, i3);
                    Ey6iv0m0.qoPGr6Ce(2, j2);
                    Ey6iv0m0.amk52bBQ();
                    Ey6iv0m0.close();
                    return xe0.qoPGr6Ce;
                } catch (Throwable th) {
                    Ey6iv0m0.close();
                    throw th;
                }
            }
        }, v30Var, false, true);
        u9 u9Var = u9.NCTxEWno;
        if (gjV1z5T1 != u9Var) {
            gjV1z5T1 = xe0Var;
        }
        if (gjV1z5T1 != u9Var) {
            gjV1z5T1 = xe0Var;
        }
        return gjV1z5T1 == u9Var ? u9Var : xe0Var;
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        return ((y40) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0.qoPGr6Ce);
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        return new y40(this.b2ZJblxo, this.Qr9iLBAD, this.jb9XjC4I, g9Var);
    }
}
