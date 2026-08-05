package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ca extends bb0 implements dl {
    public int P7K7Inc8;
    public final /* synthetic */ boolean Qr9iLBAD;
    public final /* synthetic */ v30 b2ZJblxo;
    public final /* synthetic */ zk eVhOlqcC;
    public final /* synthetic */ boolean jb9XjC4I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(g9 g9Var, zk zkVar, v30 v30Var, boolean z, boolean z2) {
        super(2, g9Var);
        this.b2ZJblxo = v30Var;
        this.Qr9iLBAD = z;
        this.jb9XjC4I = z2;
        this.eVhOlqcC = zkVar;
    }

    @Override // defpackage.h9
    public final Object OxcuoDLp(Object obj) {
        int i = this.P7K7Inc8;
        if (i != 0) {
            if (i == 1) {
                fn.SgZGMMPL(obj);
                return obj;
            }
            m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fn.SgZGMMPL(obj);
        zk zkVar = this.eVhOlqcC;
        v30 v30Var = this.b2ZJblxo;
        boolean z = this.jb9XjC4I;
        boolean z2 = this.Qr9iLBAD;
        fa faVar = new fa(null, zkVar, v30Var, z, z2);
        this.P7K7Inc8 = 1;
        Object eVhOlqcC = v30Var.eVhOlqcC(z2, faVar, this);
        u9 u9Var = u9.NCTxEWno;
        return eVhOlqcC == u9Var ? u9Var : eVhOlqcC;
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        return ((ca) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0.qoPGr6Ce);
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        return new ca(g9Var, this.eVhOlqcC, this.b2ZJblxo, this.Qr9iLBAD, this.jb9XjC4I);
    }
}
