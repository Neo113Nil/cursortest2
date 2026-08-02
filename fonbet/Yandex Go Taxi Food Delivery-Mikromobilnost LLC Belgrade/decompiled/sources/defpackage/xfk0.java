package defpackage;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class xfk0 {
    public final tbk0 a;

    public xfk0(tbk0 tbk0Var) {
        this.a = tbk0Var;
    }

    public final void a(boolean z, RideCardPresentationType rideCardPresentationType) {
        String b = vpa1.b(rideCardPresentationType);
        tbk0 tbk0Var = this.a;
        if (z) {
            tbk0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("card_state", b);
            tbk0Var.a.a("RideCard.Defaults.CacheHit", hashMap, 1, new HashMap());
            return;
        }
        tbk0Var.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("card_state", b);
        tbk0Var.a.a("RideCard.Defaults.CacheMiss", hashMap2, 1, new HashMap());
    }
}
