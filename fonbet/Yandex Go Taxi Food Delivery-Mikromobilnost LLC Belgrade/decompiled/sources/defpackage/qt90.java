package defpackage;

import java.util.Map;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.pay_now.api.a;

/* loaded from: classes5.dex */
public final class qt90 implements b801 {
    public final kcz0 a;
    public final e b;
    public final j00 c;
    public final j770 d;
    public Map e;
    public final a f;
    public final acu g;
    public final String h;

    public qt90(String str, ot90 ot90Var, kcz0 kcz0Var, e eVar, j00 j00Var, j770 j770Var) {
        this.a = kcz0Var;
        this.b = eVar;
        this.c = j00Var;
        this.d = j770Var;
        yj70 yj70Var = new yj70(this);
        wrr wrrVar = ot90Var.a;
        a aVar = new a(str, yj70Var, (phi) ((gbg) wrrVar.b).get(), (ru.yandex.taxi.logistics.payment.a) ((hbg) wrrVar.c).get(), (hwy0) ((ibg) wrrVar.w).get(), (at20) ((g680) wrrVar.x).get(), (ru.yandex.taxi.logistics.sdk.pay_on_delivery.a) ((gbg) wrrVar.y).get(), (z9h) ((gbg) wrrVar.z).get(), (st2) ((gbg) wrrVar.A).get());
        this.f = aVar;
        this.g = new acu(aVar.g, 9);
        this.h = "pay-now-key";
    }

    @Override // defpackage.b801
    public final tpr a() {
        return this.g;
    }

    @Override // defpackage.b801
    public final String getKey() {
        return this.h;
    }
}
