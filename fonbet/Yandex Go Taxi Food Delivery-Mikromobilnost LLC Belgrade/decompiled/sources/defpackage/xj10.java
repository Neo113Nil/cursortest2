package defpackage;

import ru.yandex.taxi.settings.MainMenuButton;

/* loaded from: classes6.dex */
public final class xj10 implements wj10 {
    public final a600 b;
    public final o500 c;

    public xj10(a600 a600Var, o500 o500Var) {
        this.b = a600Var;
        this.c = o500Var;
    }

    @Override // defpackage.wj10
    public final int a() {
        return this.c.b.getBottom();
    }

    @Override // defpackage.wj10
    public final void b(boolean z) {
        o500 o500Var = this.c;
        MainMenuButton mainMenuButton = o500Var.b;
        if (this.b != o500Var.c.get()) {
            return;
        }
        if (z) {
            cma1.N(mainMenuButton);
        } else {
            mainMenuButton.animate().cancel();
            mainMenuButton.setAlpha(0.0f);
        }
    }

    @Override // defpackage.wj10
    public final void c() {
        o500 o500Var = this.c;
        if (this.b != o500Var.c.get()) {
            return;
        }
        MainMenuButton mainMenuButton = o500Var.b;
        mainMenuButton.setEnabled(true);
        cma1.b(1.0f, mainMenuButton).withEndAction(new fbz(11, o500Var));
    }

    @Override // defpackage.wj10
    public final void setEnabled(boolean z) {
        o500 o500Var = this.c;
        if (this.b != o500Var.c.get()) {
            return;
        }
        o500Var.b.setEnabled(z);
    }

    @Override // defpackage.wj10
    public final void setVisibility(int i) {
        o500 o500Var = this.c;
        if (this.b != o500Var.c.get()) {
            return;
        }
        o500Var.b.setVisibility(i);
    }
}
