package defpackage;

/* loaded from: classes.dex */
public final class r0 extends defpackage.p90 implements defpackage.g00 {
    public final /* synthetic */ defpackage.v0 AARZUJiTa;
    public final /* synthetic */ int xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(defpackage.v0 v0Var, int i) {
        super(1);
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = v0Var;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.xiZrDbcSW0;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.v0 v0Var = this.AARZUJiTa;
        switch (i) {
            case 0:
                int i2 = ((defpackage.sx) obj).IHQe1A4L2xu;
                defpackage.cy cyVar = (defpackage.cy) v0Var.getFocusOwner();
                defpackage.v0 v0Var2 = cyVar.IHQe1A4L2xu;
                defpackage.rz0 rz0Var = new defpackage.rz0();
                rz0Var.adDC3e2L = java.lang.Boolean.FALSE;
                defpackage.gy xiZrDbcSW0 = cyVar.xiZrDbcSW0();
                java.lang.Boolean adDC3e2L = cyVar.adDC3e2L(i2, v0Var2.getEmbeddedViewFocusRect(), new defpackage.ay(i2, rz0Var));
                if ((!defpackage.x70.QoRHpC4k(adDC3e2L, java.lang.Boolean.TRUE) || xiZrDbcSW0 == cyVar.xiZrDbcSW0()) && adDC3e2L != null && rz0Var.adDC3e2L != null && adDC3e2L.booleanValue()) {
                    ((java.lang.Boolean) rz0Var.adDC3e2L).getClass();
                    break;
                }
                break;
            default:
                defpackage.vz vzVar = (defpackage.vz) obj;
                v0Var.getUncaughtExceptionHandler$ui();
                android.os.Handler handler = v0Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) != android.os.Looper.myLooper()) {
                    android.os.Handler handler2 = v0Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new defpackage.h0(1, vzVar));
                        break;
                    }
                } else {
                    vzVar.IHQe1A4L2xu();
                    break;
                }
                break;
        }
        return ok1Var;
    }
}
