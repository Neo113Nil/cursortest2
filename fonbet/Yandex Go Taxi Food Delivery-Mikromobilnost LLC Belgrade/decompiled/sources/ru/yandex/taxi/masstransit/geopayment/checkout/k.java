package ru.yandex.taxi.masstransit.geopayment.checkout;

import com.yandex.go.address.models.Address;
import defpackage.a2a0;
import defpackage.ac11;
import defpackage.bvf0;
import defpackage.cu1;
import defpackage.d411;
import defpackage.ge30;
import defpackage.h4z0;
import defpackage.i0z;
import defpackage.ke30;
import defpackage.kgx;
import defpackage.mth;
import defpackage.pnb;
import defpackage.qd30;
import defpackage.qnb;
import defpackage.qv10;
import defpackage.r6f;
import defpackage.s311;
import defpackage.sy00;
import defpackage.wjb;
import defpackage.wu30;
import defpackage.xjb;
import defpackage.yjb;
import defpackage.zjb;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;
import ru.yandex.taxi.masstransit.model.CheckoutUIState$PaymentCheckoutUIState;

/* loaded from: classes6.dex */
public final class k {
    public static final /* synthetic */ int p = 0;
    public final wu30 a;
    public final ge30 b;
    public final b c;
    public final com.yandex.go.payments.data.p d;
    public final a2a0 e;
    public final e f;
    public final s311 g;
    public final cu1 h;
    public final d411 i;
    public final sy00 j;
    public final qd30 k;
    public final ke30 l;
    public final r0 m = bvf0.c(Boolean.FALSE);
    public final r0 n;
    public final r0 o;

    static {
        kgx[] kgxVarArr = sy00.h;
    }

    public k(wu30 wu30Var, ge30 ge30Var, b bVar, com.yandex.go.payments.data.p pVar, a2a0 a2a0Var, e eVar, s311 s311Var, cu1 cu1Var, d411 d411Var, sy00 sy00Var, qd30 qd30Var, ke30 ke30Var) {
        this.a = wu30Var;
        this.b = ge30Var;
        this.c = bVar;
        this.d = pVar;
        this.e = a2a0Var;
        this.f = eVar;
        this.g = s311Var;
        this.h = cu1Var;
        this.i = d411Var;
        this.j = sy00Var;
        this.k = qd30Var;
        this.l = ke30Var;
        r0 c = bvf0.c(b());
        this.n = c;
        this.o = c;
    }

    public final int a() {
        h4z0 h4z0Var = (h4z0) kotlinx.coroutines.flow.e.d(((ru.yandex.taxi.masstransit.geopayment.checkout.network.b) this.b).c).a.getValue();
        if (h4z0Var != null) {
            return h4z0Var.a;
        }
        return 1;
    }

    public final qnb b() {
        return ((ac11) this.h.a.b()).b ? pnb.a : new CheckoutUIState$PaymentCheckoutUIState(null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 1048447);
    }

    public final Object c(SuspendLambda suspendLambda) {
        Address h;
        zzs B;
        zjb zjbVar = (zjb) kotlinx.coroutines.flow.e.d(((ru.yandex.taxi.masstransit.geopayment.checkout.network.b) this.b).d).a.getValue();
        if (zjbVar instanceof yjb) {
            CheckoutResponse.CheckoutPaymentMethods checkoutPaymentMethods = ((yjb) zjbVar).a.n;
            if ((checkoutPaymentMethods != null ? checkoutPaymentMethods.a : null) == CheckoutResponse.CheckoutPaymentMethods.Source.MOSMETRO && (h = this.a.h()) != null && (B = h.B()) != null) {
                return ((l) this.k).b(B, "no_feature", suspendLambda);
            }
        }
        return zy11.a;
    }

    public final Object d(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, Object obj, SuspendLambda suspendLambda) {
        Object value;
        Object obj2;
        this.l.a();
        r0 r0Var = ((ru.yandex.taxi.masstransit.geopayment.checkout.network.b) this.b).d;
        do {
            value = r0Var.getValue();
            zjb zjbVar = (zjb) value;
            if ((zjbVar instanceof yjb) && (z || z2)) {
                yjb yjbVar = (yjb) zjbVar;
                obj2 = new yjb(yjbVar.a, yjbVar.b, yjbVar.c, true);
            } else {
                obj2 = ((ac11) this.h.a.b()).b ? wjb.a : xjb.a;
            }
        } while (!r0Var.k(value, obj2));
        return kotlinx.coroutines.flow.e.k(new m0(new mth(kotlinx.coroutines.flow.e.s(this.a.f(), new i0z(17)), 6), new ru.yandex.taxi.masstransit.geopayment.experiment.b(ru.yandex.taxi.experiments.d.a(this.g.a)), new MtCheckoutInteractor$requestCheckout$3(3, null)), new MtCheckoutInteractor$requestCheckout$4(this, obj, str, str2, str4, str5, str3, null), suspendLambda);
    }

    public final void e() {
        Object value;
        Object value2;
        ru.yandex.taxi.masstransit.geopayment.checkout.network.b bVar = (ru.yandex.taxi.masstransit.geopayment.checkout.network.b) this.b;
        r0 r0Var = bVar.c;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, null));
        r6f r6fVar = r6f.h;
        r0 r0Var2 = bVar.b;
        do {
            value2 = r0Var2.getValue();
        } while (!r0Var2.k(value2, r6fVar));
        this.l.a();
        qnb b = b();
        r0 r0Var3 = this.n;
        r0Var3.getClass();
        r0Var3.m(null, b);
    }

    public final void f(boolean z) {
        qv10.B(z, this.m, null);
    }
}
