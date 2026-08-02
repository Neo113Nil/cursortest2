package ru.yandex.taxi.delivery.contacts;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.ad5;
import defpackage.apf;
import defpackage.avj0;
import defpackage.b1;
import defpackage.bgb0;
import defpackage.bgq0;
import defpackage.dde;
import defpackage.e1i;
import defpackage.g1i;
import defpackage.h1i;
import defpackage.ide;
import defpackage.iei;
import defpackage.iwh;
import defpackage.kyh0;
import defpackage.o61;
import defpackage.pex0;
import defpackage.qnh;
import defpackage.qu;
import defpackage.rdq0;
import defpackage.sdq0;
import defpackage.tje;
import defpackage.tse0;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.wt90;
import defpackage.wth;
import defpackage.wti;
import defpackage.x0i;
import defpackage.zde;
import defpackage.zuj0;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.contacts.SelectedFrom;
import ru.yandex.taxi.contacts.g;
import ru.yandex.taxi.delivery.experiments.e;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;
import ru.yandex.taxi.logistics.payment_method_selector.c;

/* loaded from: classes5.dex */
public final class a extends ad5 {
    public final g A;
    public final x0i B;
    public final rdq0 C;
    public final sdq0 D;
    public final apf E;
    public final wti F;
    public final wt90 G;
    public final iei H;
    public final e I;
    public final qnh J;
    public final c K;
    public boolean L;
    public boolean M;
    public List N;
    public List O;
    public dde P;
    public final ru.yandex.taxi.contacts.a x;
    public final zuj0 y;
    public final zde z;

    public a(ru.yandex.taxi.contacts.a aVar, zuj0 zuj0Var, zde zdeVar, g gVar, x0i x0iVar, rdq0 rdq0Var, sdq0 sdq0Var, apf apfVar, wti wtiVar, wt90 wt90Var, iei ieiVar, e eVar, qnh qnhVar, c cVar) {
        super(e1i.class);
        this.x = aVar;
        this.y = zuj0Var;
        this.z = zdeVar;
        this.A = gVar;
        this.B = x0iVar;
        this.C = rdq0Var;
        this.D = sdq0Var;
        this.E = apfVar;
        this.F = wtiVar;
        this.G = wt90Var;
        this.H = ieiVar;
        this.I = eVar;
        this.J = qnhVar;
        this.K = cVar;
        EmptyList emptyList = EmptyList.a;
        this.N = emptyList;
        this.O = emptyList;
    }

    public static final void Kg(a aVar, List list) {
        if (list == null) {
            aVar.Rg();
            return;
        }
        aVar.N = list;
        aVar.O = list;
        e1i e1iVar = (e1i) aVar.Dg();
        zde zdeVar = aVar.z;
        List list2 = aVar.B.c;
        zdeVar.getClass();
        e1iVar.r(zde.a(null, list2, list));
    }

    public static final void Lg(a aVar, ide ideVar) {
        aVar.getClass();
        String str = ideVar != null ? ideVar.a : null;
        String str2 = ideVar != null ? ideVar.b : null;
        if (ideVar == null || !bgb0.g(str2)) {
            ((e1i) aVar.Dg()).t();
            return;
        }
        boolean z = str == null || str.length() == 0 || str.equals(str2);
        e1i e1iVar = (e1i) aVar.Dg();
        String e = bgb0.e(str2);
        if (str == null) {
            str = "";
        }
        e1iVar.A6(e, str);
        if (z) {
            ((e1i) aVar.Dg()).v0(((avj0) aVar.y).h(kyh0.order_for_other_phone_input_hint));
        }
        aVar.Og(new bgq0(ideVar.a, ideVar.b, SelectedFrom.CONTACTS, 8));
    }

    public final void Mg() {
        x0i x0iVar = this.B;
        bgq0 bgq0Var = x0iVar.e;
        if (bgq0Var == bgq0.f) {
            Pg(null);
            if (x0iVar.g) {
                ((e1i) Dg()).A(0);
                return;
            } else {
                ((e1i) Dg()).z();
                return;
            }
        }
        String str = bgq0Var.b;
        String str2 = bgq0Var.a;
        ((e1i) Dg()).A6(str, str2);
        if (str2.length() == 0 || bgb0.e(bgq0Var.b).length() == 0) {
            ((e1i) Dg()).v0(((avj0) this.y).h(kyh0.order_for_other_phone_input_hint));
        }
        Pg(str);
        if (x0iVar.g) {
            ((e1i) Dg()).A(str.length());
        } else {
            ((e1i) Dg()).z();
        }
    }

    public final void Ng() {
        String str;
        this.D.a();
        x0i x0iVar = this.B;
        DeliveryFormStepType deliveryFormStepType = x0iVar.a;
        apf apfVar = this.E;
        b1 b1Var = (b1) apfVar.w;
        int i = iwh.a[deliveryFormStepType.ordinal()];
        if (i == 1) {
            str = "source";
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            str = "destination";
        }
        pex0 m = ((k) ((wiq0) apfVar.b)).m();
        b1Var.m("back", str, m != null ? m.b : null);
        apfVar.x(x0iVar.a, new wth(25));
        h1i h1iVar = (h1i) this.J.a;
        if (h1iVar.u()) {
            h1iVar.r(new qu(9));
        }
    }

    public final void Og(bgq0 bgq0Var) {
        DeliveryFormStepType deliveryFormStepType = this.B.a;
        int i = g1i.a[bgq0Var.c.ordinal()];
        String str = "source";
        apf apfVar = this.E;
        if (i == 1) {
            b1 b1Var = (b1) apfVar.w;
            int i2 = iwh.a[deliveryFormStepType.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    w511.b();
                    return;
                }
                str = "destination";
            }
            pex0 m = ((k) ((wiq0) apfVar.b)).m();
            b1Var.m("done", str, m != null ? m.b : null);
            apfVar.x(deliveryFormStepType, new wth(24));
        } else if (i == 2) {
            b1 b1Var2 = (b1) apfVar.w;
            int i3 = iwh.a[deliveryFormStepType.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    w511.b();
                    return;
                }
                str = "destination";
            }
            pex0 m2 = ((k) ((wiq0) apfVar.b)).m();
            b1Var2.m("save_user_selected", str, m2 != null ? m2.b : null);
        } else if (i != 3) {
            b1 b1Var3 = (b1) apfVar.w;
            int i4 = iwh.a[deliveryFormStepType.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    w511.b();
                    return;
                }
                str = "destination";
            }
            pex0 m3 = ((k) ((wiq0) apfVar.b)).m();
            b1Var3.m("user_selected", str, m3 != null ? m3.b : null);
        } else {
            String str2 = bgq0Var.b;
            o61 o61Var = (o61) apfVar.x;
            int i5 = iwh.a[deliveryFormStepType.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    w511.b();
                    return;
                }
                str = "destination";
            }
            pex0 m4 = ((k) ((wiq0) apfVar.b)).m();
            String str3 = m4 != null ? m4.b : null;
            String str4 = str2.length() == 0 ? "not specify" : "initiator's number";
            o61Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("screen_type", str);
            if (str3 != null) {
                hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str3);
            }
            o61Var.a.a("DeliveryDetailsCard.PhoneNumberOptionTapped", hashMap, 1, tse0.r(PlusAcquisitionSmartOffer.Texts.OPTION_PREFIX, hashMap, str4));
        }
        this.C.I(bgq0Var);
        ((e1i) Dg()).closeKeyboard();
        this.D.h();
        h1i h1iVar = (h1i) this.J.a;
        if (h1iVar.u()) {
            h1iVar.r(new qu(9));
        }
    }

    public final void Pg(String str) {
        if (str == null || str.length() == 0) {
            ((e1i) Dg()).i0();
        } else {
            ((e1i) Dg()).f0();
        }
    }

    public final void Qg() {
        ((e1i) Dg()).x3();
        ((e1i) Dg()).v0(((avj0) this.y).h(kyh0.contacts_enter_phone_or_name));
        ((e1i) Dg()).updateInputType(3);
        Pg(null);
        if (this.B.g) {
            ((e1i) Dg()).A(0);
        }
        tje.N(Jg(), null, null, new DeliveryContactsPresenter$setupContacts$1(this, null), 3);
    }

    public final void Rg() {
        this.L = true;
        boolean Fd = ((e1i) Dg()).Fd();
        x0i x0iVar = this.B;
        if (!Fd) {
            ((e1i) Dg()).J(x0iVar.f);
        }
        ((e1i) Dg()).l7();
        ((e1i) Dg()).updateInputType(4);
        List list = x0iVar.c;
        if (list.isEmpty()) {
            ((e1i) Dg()).c0();
        } else {
            ((e1i) Dg()).u(list);
        }
        ((e1i) Dg()).z();
        Mg();
    }
}
