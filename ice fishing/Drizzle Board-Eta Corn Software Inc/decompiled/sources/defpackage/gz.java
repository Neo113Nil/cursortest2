package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class gz extends bb0 implements zk {
    public int P7K7Inc8;
    public final /* synthetic */ ld0 Qr9iLBAD;
    public final /* synthetic */ hz b2ZJblxo;
    public final /* synthetic */ dl jb9XjC4I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz(hz hzVar, ld0 ld0Var, dl dlVar, g9 g9Var) {
        super(1, g9Var);
        this.b2ZJblxo = hzVar;
        this.Qr9iLBAD = ld0Var;
        this.jb9XjC4I = dlVar;
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
        this.P7K7Inc8 = 1;
        Object VgvYg0wo = this.b2ZJblxo.VgvYg0wo(this.Qr9iLBAD, this.jb9XjC4I, this);
        u9 u9Var = u9.NCTxEWno;
        return VgvYg0wo == u9Var ? u9Var : VgvYg0wo;
    }

    @Override // defpackage.zk
    public final Object ow5vqvCr(Object obj) {
        ld0 ld0Var = this.Qr9iLBAD;
        dl dlVar = this.jb9XjC4I;
        return new gz(this.b2ZJblxo, ld0Var, dlVar, (g9) obj).OxcuoDLp(xe0.qoPGr6Ce);
    }
}
