package defpackage;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class xs2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zs2 b;

    public /* synthetic */ xs2(zs2 zs2Var, int i) {
        this.a = i;
        this.b = zs2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zs2 zs2Var = this.b;
                if (zs2Var.e > 0) {
                    SystemClock.uptimeMillis();
                }
                zs2Var.setVisibility(0);
                break;
            default:
                zs2 zs2Var2 = this.b;
                ((zpa) zs2Var2.getCurrentDrawable()).d(false, false, true);
                if (zs2Var2.getProgressDrawable() == null || !zs2Var2.getProgressDrawable().isVisible()) {
                    if (zs2Var2.getIndeterminateDrawable() == null || !zs2Var2.getIndeterminateDrawable().isVisible()) {
                        zs2Var2.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
