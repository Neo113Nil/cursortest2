package defpackage;

import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public abstract class xc5 extends yr31 implements tc5 {
    public final rwo b;
    public final dy40 c = new dy40(c950.b);

    public xc5(rwo rwoVar) {
        this.b = rwoVar;
    }

    public void L() {
        ((y22) W()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Открытие экрана подтверждения закрытия формы после нажатия вне ее или на крестик", "confirm_exit_screen_opened"));
        this.c.l(c950.d);
    }

    public void Q() {
        ((y22) W()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Подтвержение закрытия формы", "confirmed_exit"));
        this.c.l(c950.a);
    }

    public rwo W() {
        return this.b;
    }

    public final void X() {
        ((y22) W()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Отмена закрытия формы", "cancelled_exit"));
        this.c.l(c950.b);
    }

    public final void Y() {
        dy40 dy40Var = this.c;
        f950 f950Var = (f950) dy40Var.d();
        if (n891.o(f950Var != null ? Boolean.valueOf(f950Var.equals(c950.e)) : null)) {
            dy40Var.l(c950.c);
            return;
        }
        f950 f950Var2 = (f950) dy40Var.d();
        if (n891.o(f950Var2 != null ? Boolean.valueOf(f950Var2.equals(c950.d)) : null)) {
            X();
        } else {
            L();
        }
    }
}
