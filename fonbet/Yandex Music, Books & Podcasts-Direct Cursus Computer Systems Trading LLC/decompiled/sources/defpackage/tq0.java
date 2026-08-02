package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class tq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ er0 b;

    public /* synthetic */ tq0(er0 er0Var, int i) {
        this.a = i;
        this.b = er0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                er0 er0Var = this.b;
                if ((er0Var.G0 & 1) != 0) {
                    er0Var.z(0);
                }
                if ((er0Var.G0 & 4096) != 0) {
                    er0Var.z(108);
                }
                er0Var.F0 = false;
                er0Var.G0 = 0;
                break;
            default:
                er0 er0Var2 = this.b;
                er0Var2.w.showAtLocation(er0Var2.v, 55, 0, 0);
                wgu wguVar = er0Var2.y;
                if (wguVar != null) {
                    wguVar.b();
                }
                if (!er0Var2.A || (viewGroup = er0Var2.B) == null || !viewGroup.isLaidOut()) {
                    er0Var2.v.setAlpha(1.0f);
                    er0Var2.v.setVisibility(0);
                    break;
                } else {
                    er0Var2.v.setAlpha(0.0f);
                    wgu b = wdu.b(er0Var2.v);
                    b.a(1.0f);
                    er0Var2.y = b;
                    b.d(new uq0(0, this));
                    break;
                }
        }
    }
}
