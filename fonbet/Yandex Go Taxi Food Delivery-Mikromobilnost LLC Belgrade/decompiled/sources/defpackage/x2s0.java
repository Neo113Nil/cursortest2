package defpackage;

import com.yandex.go.navigation.screen.c;
import com.yandex.go.taxi.main.ShortcutsMainScreen;
import ru.yandex.taxi.preorder.mainscreen.MainScreen;
import ru.yandex.taxi.preorder.source.domain.r;

/* loaded from: classes14.dex */
public final class x2s0 implements z700 {
    public final h3y a;
    public final uio0 b;
    public final hwo0 c;

    public x2s0(h3y h3yVar, uio0 uio0Var, hwo0 hwo0Var) {
        this.a = h3yVar;
        this.b = uio0Var;
        this.c = hwo0Var;
    }

    @Override // defpackage.z700
    public final void Ac() {
        ShortcutsMainScreen shortcutsMainScreen = (ShortcutsMainScreen) this.a.get();
        hwo0 hwo0Var = this.c;
        ((z2s0) hwo0Var.c).a = 0;
        ((z2s0) hwo0Var.x).c = false;
        shortcutsMainScreen.getTransitionCoordinator().Qb(MainScreen.class, true);
        ((a3v) hwo0Var.b).Lc(MainScreen.class, null);
    }

    @Override // defpackage.z700
    public final void D6(int i, int i2, boolean z) {
        int i3;
        hwo0 hwo0Var = this.c;
        z2s0 z2s0Var = (z2s0) hwo0Var.c;
        if (z || i2 > z2s0Var.a) {
            z2s0Var.a = i2;
        }
        if (!((z2s0) hwo0Var.x).c || (i3 = z2s0Var.a) <= 0 || ((z2s0) hwo0Var.w).b) {
            return;
        }
        ((a3v) hwo0Var.b).F8(i, i3, MainScreen.class);
    }

    @Override // defpackage.z700
    public final void e1() {
        hwo0 hwo0Var = this.c;
        ((z2s0) hwo0Var.x).c = true;
        int i = ((z2s0) hwo0Var.c).a;
        if (i > 0) {
            ((a3v) hwo0Var.b).Td(i, MainScreen.class);
        }
    }

    @Override // defpackage.z700
    public final void onSlide(float f) {
        ShortcutsMainScreen shortcutsMainScreen = (ShortcutsMainScreen) this.a.get();
        if (((z2s0) this.c.x).c) {
            shortcutsMainScreen.getTransitionCoordinator().Qb(MainScreen.class, f <= 0.2f);
        }
    }

    @Override // defpackage.z700
    public final void qa() {
        ShortcutsMainScreen shortcutsMainScreen = (ShortcutsMainScreen) this.a.get();
        uio0 uio0Var = this.b;
        ((z2s0) uio0Var.f).b = true;
        ((rgt0) uio0Var.e).a();
        shortcutsMainScreen.getTransitionCoordinator().C1();
    }

    @Override // defpackage.z700
    public final void u3() {
        ShortcutsMainScreen shortcutsMainScreen = (ShortcutsMainScreen) this.a.get();
        uio0 uio0Var = this.b;
        z2s0 z2s0Var = (z2s0) uio0Var.f;
        if (z2s0Var.b) {
            rgt0 rgt0Var = (rgt0) uio0Var.e;
            rgt0Var.b.postDelayed(rgt0Var.c, 500L);
        }
        z2s0Var.b = false;
        if (shortcutsMainScreen.isStickOut() || shortcutsMainScreen.isProcessing()) {
            return;
        }
        ((r) ((svw) uio0Var.b)).g();
        ((kpi0) uio0Var.d).b();
        ((vvx0) uio0Var.a).a();
        if (((c) uio0Var.c).h()) {
            shortcutsMainScreen.getTransitionCoordinator().showControlElements(true);
        }
    }
}
