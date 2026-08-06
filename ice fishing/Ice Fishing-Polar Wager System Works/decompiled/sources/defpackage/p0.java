package defpackage;

/* loaded from: classes.dex */
public final class p0 extends defpackage.p90 implements defpackage.g00 {
    public final /* synthetic */ defpackage.rz0 AARZUJiTa;
    public final /* synthetic */ int xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(int i, defpackage.rz0 rz0Var) {
        super(1);
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = rz0Var;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        boolean z;
        int i = this.xiZrDbcSW0;
        defpackage.rz0 rz0Var = this.AARZUJiTa;
        switch (i) {
            case 0:
                rz0Var.adDC3e2L = (defpackage.gy) obj;
                return java.lang.Boolean.TRUE;
            default:
                defpackage.kn knVar = (defpackage.ui1) obj;
                if (((defpackage.lj0) knVar).adDC3e2L.kd6TUFXn) {
                    rz0Var.adDC3e2L = knVar;
                    z = false;
                } else {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
        }
    }
}
