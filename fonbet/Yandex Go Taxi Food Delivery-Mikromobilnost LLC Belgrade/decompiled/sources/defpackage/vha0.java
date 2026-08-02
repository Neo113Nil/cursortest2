package defpackage;

import android.app.Activity;
import com.yandex.go.payments.promo.ui.PaymentPromoModalView;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.utils.c;

/* loaded from: classes13.dex */
public final class vha0 {
    public final i130 a;
    public final uha0 b;

    public vha0(i130 i130Var, uha0 uha0Var) {
        this.a = i130Var;
        this.b = uha0Var;
    }

    public final void a(ptv ptvVar, qfo qfoVar) {
        oo2 oo2Var = this.b.a;
        this.a.a().s(new PaymentPromoModalView(ptvVar, qfoVar, (Activity) ((xvf0) oo2Var.a).get(), (dt41) ((xvf0) oo2Var.b).get(), (c) ((xvf0) oo2Var.c).get(), (sha0) ((tj70) oo2Var.w).get(), (f) ((xvf0) oo2Var.x).get()), true);
    }
}
