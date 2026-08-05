package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ea extends bb0 implements dl {
    public final /* synthetic */ int P7K7Inc8 = 0;
    public final /* synthetic */ Object Qr9iLBAD;
    public /* synthetic */ Object b2ZJblxo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(g9 g9Var, zk zkVar) {
        super(2, g9Var);
        this.Qr9iLBAD = zkVar;
    }

    @Override // defpackage.h9
    public final Object OxcuoDLp(Object obj) {
        int i = this.P7K7Inc8;
        Object obj2 = this.Qr9iLBAD;
        switch (i) {
            case 0:
                fn.SgZGMMPL(obj);
                cz czVar = (cz) this.b2ZJblxo;
                czVar.getClass();
                return ((zk) obj2).ow5vqvCr(czVar.NCTxEWno());
            default:
                fn.SgZGMMPL(obj);
                t9 t9Var = (t9) this.b2ZJblxo;
                qo qoVar = (qo) obj2;
                xo xoVar = qoVar.NCTxEWno;
                if (xoVar.MdtA4re8.compareTo(po.MdtA4re8) >= 0) {
                    xoVar.qoPGr6Ce(qoVar);
                } else {
                    vn vnVar = (vn) t9Var.VgvYg0wo().OnDfzHZD(re.VgvYg0wo);
                    if (vnVar != null) {
                        vnVar.b2ZJblxo(null);
                    }
                }
                return xe0.qoPGr6Ce;
        }
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        int i = this.P7K7Inc8;
        xe0 xe0Var = xe0.qoPGr6Ce;
        switch (i) {
            case 0:
                return ((ea) lDXGDhIF((g9) obj2, (cz) obj)).OxcuoDLp(xe0Var);
            default:
                ((ea) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0Var);
                return xe0Var;
        }
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        int i = this.P7K7Inc8;
        Object obj2 = this.Qr9iLBAD;
        switch (i) {
            case 0:
                ea eaVar = new ea(g9Var, (zk) obj2);
                eaVar.b2ZJblxo = obj;
                return eaVar;
            default:
                ea eaVar2 = new ea((qo) obj2, g9Var);
                eaVar2.b2ZJblxo = obj;
                return eaVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(qo qoVar, g9 g9Var) {
        super(2, g9Var);
        this.Qr9iLBAD = qoVar;
    }
}
