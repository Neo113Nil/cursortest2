package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseWindowButtonActionDto$Deeplink;
import com.yandex.go.scooters.subscription.data.model.i;
import com.yandex.go.scooters.subscription.data.model.k;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class syo0 extends xqt {
    public static final syo0 e = new syo0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, k.INSTANCE.serializer(), qoi0.a(k.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("close", i.INSTANCE.serializer(), qoi0.a(i.class)), new f9(Constants.DEEPLINK, ScootersSubscriptionPurchaseWindowButtonActionDto$Deeplink.Companion.serializer(), qoi0.a(ScootersSubscriptionPurchaseWindowButtonActionDto$Deeplink.class)));
    }
}
