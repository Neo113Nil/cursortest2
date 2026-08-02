package defpackage;

import ru.yandex.taxi.masstransit.d;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$CheckoutScreenOpenReason;
import ru.yandex.taxi.masstransit.model.MtCheckoutDeeplinkStatus;

/* loaded from: classes6.dex */
public final class zz00 implements jd30 {
    public final /* synthetic */ MtCheckoutDeeplinkStatus A;
    public final /* synthetic */ yq30 B;
    public final /* synthetic */ e310 a;
    public final /* synthetic */ d b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ pj40 y;
    public final /* synthetic */ TransportPaymentAnalytics$CheckoutScreenOpenReason z;

    public zz00(e310 e310Var, d dVar, String str, String str2, Object obj, pj40 pj40Var, TransportPaymentAnalytics$CheckoutScreenOpenReason transportPaymentAnalytics$CheckoutScreenOpenReason, MtCheckoutDeeplinkStatus mtCheckoutDeeplinkStatus, yq30 yq30Var) {
        this.a = e310Var;
        this.b = dVar;
        this.c = str;
        this.w = str2;
        this.x = obj;
        this.y = pj40Var;
        this.z = transportPaymentAnalytics$CheckoutScreenOpenReason;
        this.A = mtCheckoutDeeplinkStatus;
        this.B = yq30Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.b.Y(this.a, this.c, this.w, this.x, this.y, this.z, this.B, null, k1j0.a);
    }

    @Override // defpackage.jd30
    public final void c() {
        e310 e310Var = this.a;
        je30 b = ((i3g) e310Var).b();
        ae30 ae30Var = new ae30(this.c, this.w, this.x, this.y, this.z, this.A);
        yq30 yq30Var = this.B;
        d dVar = this.b;
        dVar.D(b, ae30Var, new yz00(dVar, e310Var, yq30Var));
        b.T();
    }

    @Override // defpackage.jd30
    public final void onClose() {
        this.b.Y(this.a, this.c, this.w, this.x, this.y, this.z, this.B, null, k1j0.a);
    }
}
