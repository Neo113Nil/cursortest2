package defpackage;

import ru.yandex.taxi.settings.account.c;
import ru.yandex.taxi.settings.support.MenuBadgePresenterImpl$attachView$$inlined$safeCollectIn$1;
import ru.yandex.taxi.settings.support.MenuBadgePresenterImpl$attachView$$inlined$safeCollectIn$2;
import ru.yandex.taxi.settings.support.MenuBadgePresenterImpl$attachView$$inlined$safeCollectIn$3;
import ru.yandex.taxi.settings.support.MenuBadgePresenterImpl$attachView$$inlined$safeCollectIn$4;
import ru.yandex.taxi.settings.support.MenuBadgePresenterImpl$attachView$$inlined$safeCollectIn$5;
import ru.yandex.taxi.settings.support.d;
import ru.yandex.taxi.settings.support.g;
import ru.yandex.taxi.settings.support.i;

/* loaded from: classes10.dex */
public final class rj10 extends oj10 {
    public final c A;
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final lj10 x;
    public final as21 y;
    public final g z;

    public rj10(lj10 lj10Var, as21 as21Var, g gVar, c cVar) {
        this.x = lj10Var;
        this.y = as21Var;
        this.z = gVar;
        this.A = cVar;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Bg(l050 l050Var) {
        super.Bg((yjw0) l050Var);
        lj10 lj10Var = this.x;
        boolean z = lj10Var.a;
        g gVar = this.z;
        if (z) {
            tje.N(Jg(), null, null, new MenuBadgePresenterImpl$attachView$$inlined$safeCollectIn$1(gVar.a.c, null, this), 3);
        }
        if (lj10Var.b) {
            tje.N(Jg(), null, null, new MenuBadgePresenterImpl$attachView$$inlined$safeCollectIn$2(new d(((com.yandex.go.payments.paymentlist.data.c) gVar.b).u, gVar), null, this), 3);
        }
        if (lj10Var.c) {
            tje.N(Jg(), null, null, new MenuBadgePresenterImpl$attachView$$inlined$safeCollectIn$3(gVar.b(), null, this), 3);
        }
        if (lj10Var.d) {
            tje.N(Jg(), null, null, new MenuBadgePresenterImpl$attachView$$inlined$safeCollectIn$4(gVar.b(), null, this), 3);
            this.E = lj10Var.d && gVar.c.a.l();
            Kg();
        }
        if (lj10Var.e) {
            tje.N(Jg(), null, null, new MenuBadgePresenterImpl$attachView$$inlined$safeCollectIn$5(new i(this.A.a()), null, this), 3);
        }
    }

    public final void Kg() {
        String c;
        int i;
        if (Eg()) {
            lj10 lj10Var = this.x;
            int i2 = (lj10Var.b && this.C) ? 1 : 0;
            if (lj10Var.a && (c = this.y.c("LAST_KNOWN_SUPPORT_URL")) != null && !evu0.J(c) && (i = this.B) > 0) {
                i2 += i;
            }
            if (this.D) {
                i2++;
            }
            if (this.E) {
                i2++;
            }
            if (lj10Var.e && this.F) {
                i2++;
            }
            ((yjw0) Dg()).render(i2 == 0 ? new rm4(null, 7) : lj10Var.f ? new rm4("", "1", true) : new rm4(String.valueOf(i2), 2));
        }
    }

    @Override // defpackage.oj10
    public final void refresh() {
        g gVar = this.z;
        this.C = g.c(((com.yandex.go.payments.paymentlist.data.c) gVar.b).h());
        boolean z = false;
        this.B = gVar.a.b.i("unread_support_messages_count", 0);
        lj10 lj10Var = this.x;
        this.D = lj10Var.c && gVar.a();
        if (lj10Var.d && gVar.c.a.l()) {
            z = true;
        }
        this.E = z;
        Kg();
    }
}
