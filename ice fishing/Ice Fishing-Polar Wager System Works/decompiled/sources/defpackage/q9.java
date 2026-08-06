package defpackage;

/* loaded from: classes.dex */
public final class q9 implements defpackage.g00 {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ q9(int i, java.lang.Object obj) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        long j;
        switch (this.adDC3e2L) {
            case 0:
                ((defpackage.eb) this.xiZrDbcSW0).cancel();
                return defpackage.ok1.IHQe1A4L2xu;
            default:
                defpackage.ua1 ua1Var = (defpackage.ua1) obj;
                synchronized (defpackage.wa1.r1MBDhnF) {
                    j = defpackage.wa1.adDC3e2L;
                    defpackage.wa1.adDC3e2L = 1 + j;
                }
                return new defpackage.wy0(j, ua1Var, (defpackage.g00) this.xiZrDbcSW0);
        }
    }
}
