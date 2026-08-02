package defpackage;

import com.yandex.go.payments.cards.data.model.ProfileResponse;
import com.yandex.go.payments.cards.data.model.j;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeActionDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeActionTypeDto;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeDecorationDto$$serializer;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.PromoCodeTextDto$$serializer;
import com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common.a;
import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import com.yandex.go.shortcuts.dto.response.ProductsCommon$OfferItem;
import com.yandex.go.shortcuts.dto.response.ProductsCommon$Section;
import com.yandex.go.shortcuts.dto.response.ProductsResponse;
import com.yandex.go.shortcuts.dto.response.ProductsScreenResponse;
import com.yandex.go.shortcuts.dto.response.PromoMode;
import com.yandex.go.shortcuts.dto.response.TurboButton$$serializer;
import com.yandex.go.shortcuts.dto.response.VerticalStack$$serializer;
import com.yandex.go.shortcuts.dto.response.h1;
import com.yandex.go.shortcuts.dto.response.l1;
import com.yandex.go.shortcuts.dto.response.o1;
import com.yandex.go.shortcuts.dto.response.p1;
import com.yandex.go.shortcuts.dto.response.q1;
import com.yandex.go.shortcuts.dto.response.r1;
import com.yandex.go.shortcuts.dto.response.s1;
import com.yandex.go.shortcuts.dto.response.u1;
import com.yandex.go.shortcuts.dto.response.v1;
import com.yandex.go.shortcuts.dto.response.x1;
import com.yandex.go.shortcuts.dto.response.y1;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.payments.model.pci_dss.UserCardProfileName;

/* loaded from: classes13.dex */
public final /* synthetic */ class v8f0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ v8f0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                h1 h1Var = ProductMode$Taxi.SectionHeader.Companion;
                return new p53(h5q0.e, 0);
            case 1:
                return vez0.g("com.yandex.go.shortcuts.dto.response.ProductMode.Taxi.SectionTag", ProductMode$Taxi.SectionTag.values(), new String[]{null, "gray_separator", "transparent_separator", "black_separator", "nav_section_width"}, new Annotation[][]{null, null, null, null, null});
            case 2:
                return vez0.g("com.yandex.go.shortcuts.dto.response.ProductMode.Taxi.TopItemAlign", ProductMode$Taxi.TopItemAlign.values(), new String[]{"left", "right"}, new Annotation[][]{null, null});
            case 3:
                l1 l1Var = ProductMode$Taxi.TopScreenIconButton.Companion;
                return ProductMode$Taxi.TopItemAlign.Companion.serializer();
            case 4:
                o1 o1Var = ProductMode$Taxi.TopScreenRoundButton.Companion;
                return ProductMode$Taxi.TopItemAlign.Companion.serializer();
            case 5:
                return new o4o("com.yandex.go.shortcuts.dto.response.ProductMode.Taxi.UnknownAboveCardObject", p1.INSTANCE, new Annotation[0]);
            case 6:
                return new o4o("com.yandex.go.shortcuts.dto.response.ProductMode.Taxi.UnknownBottomScreenObject", q1.INSTANCE, new Annotation[0]);
            case 7:
                return new o4o("com.yandex.go.shortcuts.dto.response.ProductMode.Taxi.UnknownTopScreenObject", r1.INSTANCE, new Annotation[0]);
            case 8:
                return new o4o("com.yandex.go.shortcuts.dto.response.ProductMode.Unknown", s1.INSTANCE, new Annotation[0]);
            case 9:
                u1 u1Var = ProductsCommon$OfferItem.Companion;
                return new p53(ur60.Companion.serializer(), 0);
            case 10:
                u1 u1Var2 = ProductsCommon$OfferItem.Companion;
                return new p53(ur60.Companion.serializer(), 0);
            case 11:
                u1 u1Var3 = ProductsCommon$OfferItem.Companion;
                return new p53(TurboButton$$serializer.INSTANCE, 0);
            case 12:
                u1 u1Var4 = ProductsCommon$OfferItem.Companion;
                return new p53(VerticalStack$$serializer.INSTANCE, 0);
            case 13:
                v1 v1Var = ProductsCommon$Section.Companion;
                return ProductMode$Taxi.SectionType.Companion.serializer();
            case 14:
                v1 v1Var2 = ProductsCommon$Section.Companion;
                return new p53(auu0.a, 0);
            case 15:
                v1 v1Var3 = ProductsCommon$Section.Companion;
                return new p53(auu0.a, 0);
            case 16:
                v1 v1Var4 = ProductsCommon$Section.Companion;
                return new p53(auu0.a, 0);
            case 17:
                v1 v1Var5 = ProductsCommon$Section.Companion;
                return jsq0.Companion.serializer(ProductMode$Taxi.SectionTag.Companion.serializer());
            case 18:
                x1 x1Var = ProductsResponse.Companion;
                return new p53(x8f0.f, 0);
            case 19:
                x1 x1Var2 = ProductsResponse.Companion;
                return PromoMode.Companion.serializer();
            case 20:
                y1 y1Var = ProductsScreenResponse.Companion;
                return new p53(x8f0.f, 0);
            case 21:
                y1 y1Var2 = ProductsScreenResponse.Companion;
                return PromoMode.Companion.serializer();
            case 22:
                j jVar = ProfileResponse.Companion;
                return UserCardProfileName.Companion.serializer();
            case 23:
                return hkf0.a(false);
            case 24:
                return hkf0.a(true);
            case 25:
                nlf0 nlf0Var = olf0.Companion;
                return new p53(auu0.a, 1);
            case 26:
                a aVar = PromoCodeActionDto.Companion;
                return PromoCodeActionTypeDto.Companion.serializer();
            case 27:
                a aVar2 = PromoCodeActionDto.Companion;
                return new p53(PromoCodeTextDto$$serializer.INSTANCE, 0);
            case 28:
                a aVar3 = PromoCodeActionDto.Companion;
                return new p53(PromoCodeTextDto$$serializer.INSTANCE, 0);
            default:
                a aVar4 = PromoCodeActionDto.Companion;
                return new p53(PromoCodeDecorationDto$$serializer.INSTANCE, 0);
        }
    }
}
