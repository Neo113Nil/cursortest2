package ru.yandex.taxi.contacts;

import defpackage.abq0;
import defpackage.ad5;
import defpackage.avj0;
import defpackage.bgb0;
import defpackage.bgq0;
import defpackage.dde;
import defpackage.dgq0;
import defpackage.gbq0;
import defpackage.ide;
import defpackage.kyh0;
import defpackage.tje;
import defpackage.zde;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.contacts.SelectContactMvpView;

/* loaded from: classes5.dex */
public final class d extends ad5 {
    public final zuj0 A;
    public final zde B;
    public final g C;
    public final abq0 D;
    public boolean E;
    public boolean F;
    public boolean G;
    public SelectContactMvpView.UiState H;
    public List I;
    public List J;
    public dde K;
    public boolean L;
    public final a x;
    public final gbq0 y;
    public final dgq0 z;

    public d(a aVar, gbq0 gbq0Var, dgq0 dgq0Var, zuj0 zuj0Var, zde zdeVar, g gVar, abq0 abq0Var) {
        super(SelectContactMvpView.class);
        this.x = aVar;
        this.y = gbq0Var;
        this.z = dgq0Var;
        this.A = zuj0Var;
        this.B = zdeVar;
        this.C = gVar;
        this.D = abq0Var;
        this.H = SelectContactMvpView.UiState.NORMAL;
        EmptyList emptyList = EmptyList.a;
        this.I = emptyList;
        this.J = emptyList;
    }

    public static final void Kg(d dVar, List list) {
        if (list == null) {
            dVar.F = true;
            ((SelectContactMvpView) dVar.Dg()).J(dVar.y.g);
            dVar.Sg((SelectContactMvpView) dVar.Dg());
            return;
        }
        dVar.I = list;
        dVar.J = list;
        SelectContactMvpView selectContactMvpView = (SelectContactMvpView) dVar.Dg();
        zde zdeVar = dVar.B;
        List list2 = dVar.y.d;
        zdeVar.getClass();
        selectContactMvpView.r(zde.a(null, list2, list));
    }

    public final void Lg() {
        gbq0 gbq0Var = this.y;
        bgq0 bgq0Var = gbq0Var.f;
        boolean z = gbq0Var.m;
        boolean z2 = gbq0Var.l;
        if (bgq0Var == bgq0.f) {
            Og(null, null);
            if (z) {
                ((SelectContactMvpView) Dg()).A(0);
                return;
            } else {
                ((SelectContactMvpView) Dg()).z();
                return;
            }
        }
        String str = bgq0Var.b;
        String str2 = bgq0Var.a;
        ((SelectContactMvpView) Dg()).o2(str, str2, z2);
        if ((!z2 && str2.length() == 0) || bgb0.e(bgq0Var.b).length() == 0) {
            ((SelectContactMvpView) Dg()).v0(((avj0) this.A).h(kyh0.order_for_other_phone_input_hint));
        }
        Og(str, str2);
        if (z) {
            ((SelectContactMvpView) Dg()).A(str.length());
        } else {
            ((SelectContactMvpView) Dg()).z();
        }
    }

    public final String Mg(String str) {
        return this.y.k ? str == null ? "" : str : bgb0.e(str);
    }

    public final void Ng(List list, List list2) {
        if (list.isEmpty()) {
            ((SelectContactMvpView) Dg()).ac();
            this.H = SelectContactMvpView.UiState.EMPTY;
        } else {
            ((SelectContactMvpView) Dg()).Ya(list, this.H);
        }
        if (list2.isEmpty()) {
            ((SelectContactMvpView) Dg()).c0();
        } else {
            ((SelectContactMvpView) Dg()).u(list2);
        }
    }

    public final void Og(String str, String str2) {
        boolean z = true;
        boolean z2 = str == null || str.length() == 0;
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        gbq0 gbq0Var = this.y;
        if (!gbq0Var.l) {
            ((SelectContactMvpView) Dg()).nd();
            if (z2) {
                ((SelectContactMvpView) Dg()).i0();
                return;
            } else {
                ((SelectContactMvpView) Dg()).f0();
                return;
            }
        }
        if (z2) {
            ((SelectContactMvpView) Dg()).nd();
            ((SelectContactMvpView) Dg()).i0();
            return;
        }
        ((SelectContactMvpView) Dg()).Ga();
        if (z && gbq0Var.h) {
            ((SelectContactMvpView) Dg()).i0();
        } else {
            ((SelectContactMvpView) Dg()).f0();
        }
    }

    public final void Pg(String str, String str2) {
        gbq0 gbq0Var = this.y;
        boolean z = gbq0Var.o;
        zuj0 zuj0Var = this.A;
        if (!z) {
            if (!gbq0Var.l) {
                ((SelectContactMvpView) Dg()).v0(((avj0) zuj0Var).h(kyh0.order_for_other_phone_input_hint));
            }
            Og(str, str2);
            return;
        }
        ((SelectContactMvpView) Dg()).v0(((avj0) zuj0Var).h(kyh0.contacts_enter_phone_or_name));
        this.G = true ^ (str == null || str.length() == 0);
        if (str != null) {
            List list = this.I;
            this.x.getClass();
            ArrayList b = a.b(str, list);
            this.J = b;
            List list2 = this.G ? EmptyList.a : gbq0Var.d;
            this.B.getClass();
            ArrayList a = zde.a(null, list2, b);
            ((SelectContactMvpView) Dg()).i0();
            this.K = null;
            ((SelectContactMvpView) Dg()).r(a);
            if (bgb0.e(str).length() > 0) {
                ((SelectContactMvpView) Dg()).f0();
            } else {
                ((SelectContactMvpView) Dg()).i0();
            }
        }
    }

    public final void Qg(ide ideVar) {
        String str;
        String str2;
        if (ideVar != null) {
            str = ideVar.a;
            str2 = ideVar.b;
        } else {
            str = null;
            str2 = null;
        }
        gbq0 gbq0Var = this.y;
        if ((ideVar == null || !bgb0.g(str2)) && !gbq0Var.j) {
            ((SelectContactMvpView) Dg()).t();
            return;
        }
        if (ideVar != null) {
            String str3 = ideVar.b;
            String str4 = ideVar.a;
            boolean z = true;
            this.E = true;
            String Mg = Mg(str2);
            if (str != null && str.length() != 0 && !str.equals(str2)) {
                z = false;
            }
            boolean z2 = gbq0Var.l;
            abq0 abq0Var = this.D;
            if (!z2) {
                SelectContactMvpView selectContactMvpView = (SelectContactMvpView) Dg();
                if (str == null) {
                    str = "";
                }
                selectContactMvpView.o2(Mg, str, false);
                if (z) {
                    ((SelectContactMvpView) Dg()).v0(((avj0) this.A).h(kyh0.order_for_other_phone_input_hint));
                }
                abq0Var.I(new bgq0(str4, str3, SelectedFrom.CONTACTS, 8));
                return;
            }
            ((SelectContactMvpView) Dg()).R5(Mg);
            if (z) {
                ((SelectContactMvpView) Dg()).v8("");
                ((SelectContactMvpView) Dg()).D4();
                return;
            }
            SelectContactMvpView selectContactMvpView2 = (SelectContactMvpView) Dg();
            if (str == null) {
                str = "";
            }
            selectContactMvpView2.v8(str);
            abq0Var.I(new bgq0(str4, str3, SelectedFrom.CONTACTS, 8));
        }
    }

    public final void Rg(SelectContactMvpView selectContactMvpView) {
        selectContactMvpView.m4();
        selectContactMvpView.v0(((avj0) this.A).h(kyh0.contacts_enter_phone_or_name));
        selectContactMvpView.updateInputType(3);
        Og(null, null);
        if (this.y.m) {
            selectContactMvpView.A(0);
        }
        selectContactMvpView.H7(true);
        tje.N(Jg(), null, null, new SelectContactPresenter$setupViewWithContactsOnScreen$1(this, null), 3);
    }

    public final void Sg(SelectContactMvpView selectContactMvpView) {
        selectContactMvpView.x1();
        selectContactMvpView.updateInputType(4);
        dgq0 dgq0Var = this.z;
        List e = dgq0Var.e();
        gbq0 gbq0Var = this.y;
        Ng(e, gbq0Var.d);
        selectContactMvpView.H7(!gbq0Var.l);
        if (gbq0Var.i) {
            selectContactMvpView.xf(dgq0Var.e(), this.H);
        } else {
            selectContactMvpView.z();
        }
        Lg();
    }
}
