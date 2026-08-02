package defpackage;

import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto$ChargersOfferBannerActionDto$OpenDiscountDetails;
import com.yandex.go.chargers.offer.data.api.g;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class z8a extends xqt {
    public static final z8a e = new z8a();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, g.INSTANCE.serializer(), qoi0.a(g.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("open_discount_details", ChargersOfferResponseDto$ChargersOfferBannerActionDto$OpenDiscountDetails.Companion.serializer(), qoi0.a(ChargersOfferResponseDto$ChargersOfferBannerActionDto$OpenDiscountDetails.class)));
    }
}
