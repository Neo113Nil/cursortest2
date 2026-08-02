package ru.yandex.taxi.search.presenter;

import com.yandex.go.address.models.Address;
import defpackage.ad5;
import defpackage.evu0;
import defpackage.ffx;
import defpackage.ftj0;
import defpackage.gtj0;
import defpackage.htj0;
import defpackage.i51;
import defpackage.itj0;
import defpackage.j51;
import defpackage.j61;
import defpackage.jst;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.v6v0;
import defpackage.x9v0;
import java.util.List;
import kotlin.text.Regex;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes6.dex */
public abstract class e extends ad5 {
    public pzt0 A;
    public final j51 x;
    public final n0 y;
    public pzt0 z;

    public e(j51 j51Var) {
        super(j61.class);
        this.x = j51Var;
        this.y = ffx.b(1, 1, BufferOverflow.DROP_OLDEST);
    }

    @Override // defpackage.zc5
    public void Fg() {
        ch();
    }

    @Override // defpackage.zc5
    public void Gg() {
        bh();
    }

    public void Kg(boolean z) {
        Ug();
    }

    public void Lg(String str) {
        n0 n0Var = this.y;
        if (str == null || evu0.J(str)) {
            Ug();
            n0Var.g("");
        } else {
            n0Var.g(new Regex("\\s+").j(evu0.k0(str).toString(), " "));
        }
    }

    public tpr Mg(x9v0 x9v0Var) {
        return new b(this.x.e(x9v0Var.a, true, false));
    }

    public void Ng(ftj0 ftj0Var) {
        ((j61) Dg()).zd(ftj0Var.a, true);
    }

    public void Og(gtj0 gtj0Var) {
        ((j61) Dg()).P6(gtj0Var.a);
    }

    public void Pg(htj0 htj0Var) {
        ((j61) Dg()).Rb(htj0Var.a);
    }

    public void Qg(itj0 itj0Var) {
        List list = itj0Var.d;
        if (list.isEmpty()) {
            ((i51) Dg()).cg();
        } else {
            ((i51) Dg()).y2(list);
        }
    }

    public void Rg() {
        pzt0 pzt0Var = this.z;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        bh();
        String filter = ((j61) Dg()).getFilter();
        if (filter == null || evu0.J(filter)) {
            return;
        }
        showProgress();
        Sg(this.x.a(filter));
    }

    public final void Sg(tpr tprVar) {
        pzt0 pzt0Var = this.A;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.A = tje.N(Jg(), null, null, new BaseAddressSearchFieldPresenter$observe$1(tprVar, this, null), 3);
    }

    public void Tg() {
    }

    public void Ug() {
        pzt0 pzt0Var = this.A;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.z;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        bh();
        ((j61) Dg()).Rb("");
        ((i51) Dg()).hideProgress();
    }

    public void Vg(x9v0 x9v0Var) {
    }

    public void Wg(v6v0 v6v0Var) {
    }

    public void Xg() {
    }

    public final void Yg() {
        jst.e.getClass();
        if (Eg()) {
            ((i51) Dg()).hideProgress();
            ((i51) Dg()).cg();
        }
    }

    public void Zg() {
        ch();
    }

    public void ah(Address address) {
        ch();
    }

    public final void bh() {
        this.z = tje.N(Jg(), null, null, new BaseAddressSearchFieldPresenter$subscribeToFilterUpdates$1(this, null), 3);
    }

    public final void ch() {
        pzt0 pzt0Var = this.z;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.A;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
    }

    public void onDismiss() {
        ch();
    }

    public void showProgress() {
        ((i51) Dg()).showProgress();
    }
}
