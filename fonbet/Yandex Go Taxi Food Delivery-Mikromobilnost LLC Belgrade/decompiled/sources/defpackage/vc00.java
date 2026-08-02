package defpackage;

import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.MainSidePager;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.a;

/* loaded from: classes.dex */
public final class vc00 {
    public final yvf0 a;
    public MainSidePager b;
    public boolean c;
    public boolean d;
    public Float e;

    public vc00(yvf0 yvf0Var) {
        this.a = yvf0Var;
    }

    public static boolean b(vc00 vc00Var) {
        MainSidePager mainSidePager = vc00Var.b;
        if (mainSidePager == null || !mainSidePager.isOnSidePage()) {
            return false;
        }
        vc00Var.c = false;
        vc00Var.d = false;
        mainSidePager.showMain(true);
        return true;
    }

    public final void a() {
        MainSidePager mainSidePager = this.b;
        if (mainSidePager == null || !mainSidePager.isOnSidePage()) {
            return;
        }
        this.c = true;
        this.d = true;
        this.e = Float.valueOf(mainSidePager.getSidePhase());
        a941 a941Var = ((a) this.a.get()).e;
        if (a941Var != null) {
            a941Var.f();
        }
    }

    public final boolean c(boolean z) {
        MainSidePager mainSidePager = this.b;
        if (mainSidePager == null) {
            return false;
        }
        if (mainSidePager.isOnSidePage()) {
            return true;
        }
        a aVar = (a) this.a.get();
        MainSidePager mainSidePager2 = aVar.h;
        if (mainSidePager2 != null) {
            aVar.b(mainSidePager2);
        }
        mainSidePager.showSidePage(z);
        return true;
    }
}
