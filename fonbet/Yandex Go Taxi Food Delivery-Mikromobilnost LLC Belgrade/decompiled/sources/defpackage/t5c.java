package defpackage;

import com.yandex.go.shortcuts.dto.response.PromoMode;
import com.yandex.go.splash.data.dto.DynamicSplash;
import com.yandex.go.superapp.orders.known.KnownOrder;
import com.yandex.go.taxi.order.cache.data.model.OrderDetailsPresentationInfoSerializable;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlinx.serialization.KSerializer;

/* loaded from: classes9.dex */
public final /* synthetic */ class t5c implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ eex b;

    public /* synthetic */ t5c(eex eexVar, int i) {
        this.a = i;
        this.b = eexVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        EmptyList emptyList = EmptyList.a;
        eex eexVar = this.b;
        switch (i) {
            case 0:
                am2 am2Var = new am2("linked_orders", "closed_orders.json", EmptySet.a);
                auu0 auu0Var = auu0.a;
                eexVar.getClass();
                return eexVar.a(am2Var, new p53(auu0Var, 1));
            case 1:
                am2 am2Var2 = new am2("dynamic_splash", "dynamic_splash_cache.json", emptyList);
                KSerializer serializer = DynamicSplash.Companion.serializer();
                eexVar.getClass();
                return eexVar.c(am2Var2, new p53(serializer, 0));
            case 2:
                am2 am2Var3 = new am2("mlutp", "orders.json", emptyList);
                KSerializer serializer2 = KnownOrder.Companion.serializer();
                eexVar.getClass();
                return eexVar.c(am2Var3, new p53(serializer2, 0));
            case 3:
                am2 am2Var4 = new am2("orders", "details_presentation_cache.json", emptyList);
                KSerializer serializer3 = OrderDetailsPresentationInfoSerializable.Companion.serializer();
                eexVar.getClass();
                return eexVar.c(am2Var4, new p53(serializer3, 0));
            default:
                return eexVar.a(new am2("superapp", "promo_mode", PromoMode.UNKNOWN), PromoMode.Companion.serializer());
        }
    }
}
