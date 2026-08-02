package defpackage;

import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes10.dex */
public final class q751 extends p751 {
    public q751(Window window, va90 va90Var) {
        super(window, va90Var);
    }

    @Override // defpackage.p751, defpackage.bvf0
    public final boolean E() {
        int systemBarsAppearance;
        systemBarsAppearance = this.j.getSystemBarsAppearance();
        return (systemBarsAppearance & 16) != 0;
    }

    @Override // defpackage.p751, defpackage.bvf0
    public final boolean F() {
        int systemBarsAppearance;
        systemBarsAppearance = this.j.getSystemBarsAppearance();
        return (systemBarsAppearance & 8) != 0;
    }

    @Override // defpackage.p751, defpackage.bvf0
    public final void V() {
        this.j.setSystemBarsBehavior(2);
    }

    public q751(WindowInsetsController windowInsetsController, va90 va90Var) {
        super(windowInsetsController, va90Var);
    }
}
