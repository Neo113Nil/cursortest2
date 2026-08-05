package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class a50 extends bb0 implements dl {
    public int P7K7Inc8;
    public final /* synthetic */ long Qr9iLBAD;
    public final /* synthetic */ d50 b2ZJblxo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a50(d50 d50Var, long j, g9 g9Var) {
        super(2, g9Var);
        this.b2ZJblxo = d50Var;
        this.Qr9iLBAD = j;
    }

    @Override // defpackage.h9
    public final Object OxcuoDLp(Object obj) {
        int i = this.P7K7Inc8;
        if (i == 0) {
            fn.SgZGMMPL(obj);
            dt dtVar = this.b2ZJblxo.MdtA4re8;
            this.P7K7Inc8 = 1;
            Object qoPGr6Ce = dtVar.qoPGr6Ce(this.Qr9iLBAD, this);
            u9 u9Var = u9.NCTxEWno;
            if (qoPGr6Ce == u9Var) {
                return u9Var;
            }
        } else {
            if (i != 1) {
                m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fn.SgZGMMPL(obj);
        }
        return xe0.qoPGr6Ce;
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        return ((a50) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0.qoPGr6Ce);
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        return new a50(this.b2ZJblxo, this.Qr9iLBAD, g9Var);
    }
}
