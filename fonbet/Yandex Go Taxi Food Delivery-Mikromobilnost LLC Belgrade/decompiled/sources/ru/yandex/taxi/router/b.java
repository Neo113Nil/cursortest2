package ru.yandex.taxi.router;

import com.yandex.go.address.models.Address;
import com.yandex.go.mainscreen.superapp.api.presentation.AdditionalAction;
import com.yandex.go.navigation.screen.api.Screen;
import defpackage.bvv;
import defpackage.m950;
import defpackage.ne0;
import defpackage.nre0;
import defpackage.oe0;
import defpackage.pph;
import defpackage.qa00;
import defpackage.qre0;
import defpackage.qtb1;
import defpackage.qu;
import defpackage.ra00;
import defpackage.tje;
import defpackage.vd0;
import defpackage.vnv0;
import defpackage.w511;
import defpackage.yvf0;

/* loaded from: classes6.dex */
public final class b implements vd0 {
    public final /* synthetic */ c a;
    public final /* synthetic */ bvv b;
    public final /* synthetic */ Screen c;

    public b(c cVar, bvv bvvVar, Screen screen) {
        this.a = cVar;
        this.b = bvvVar;
        this.c = screen;
    }

    @Override // defpackage.vd0
    public final void T0(Address address) {
        this.a.r(new qu(9));
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = oe0.a[this.b.g.ordinal()];
        c cVar = this.a;
        if (i == 1) {
            tje.N(cVar.o(), null, null, new AddFavoritesRootRouterImpl$openAddFavorites$1$onExitCalledInside$1(cVar, null), 3);
            return;
        }
        if (i != 2) {
            if (i == 3) {
                return;
            }
            w511.b();
            return;
        }
        yvf0 yvf0Var = cVar.K;
        ra00 ra00Var = cVar.D;
        int i2 = ne0.a[this.c.ordinal()];
        if (i2 == 1) {
            ra00Var.c.e((qa00) cVar.H.get(), new pph(AdditionalAction.NONE));
        } else if (i2 == 2 || i2 == 3) {
            ra00Var.b((m950) yvf0Var.get(), new qre0(qtb1.M));
        } else if (i2 != 4) {
            cVar.r(new qu(9));
        } else {
            ra00Var.b((m950) yvf0Var.get(), new nre0(new vnv0(null, null)));
        }
    }
}
