package defpackage;

import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsItemDto$PartnerPromoItemDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsItemDto$ProgressDiscountItemDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsItemDto$RentalPromoItemDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsItemDto$TaskDiscountItemDto;
import com.yandex.go.chargers.discounts.data.models.z;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class vu9 extends xqt {
    public static final vu9 e = new vu9();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, z.INSTANCE.serializer(), qoi0.a(z.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("rental_promo", ChargersDiscountsItemDto$RentalPromoItemDto.Companion.serializer(), qoi0.a(ChargersDiscountsItemDto$RentalPromoItemDto.class)), new f9("partner_promo", ChargersDiscountsItemDto$PartnerPromoItemDto.Companion.serializer(), qoi0.a(ChargersDiscountsItemDto$PartnerPromoItemDto.class)), new f9("progress_discount", ChargersDiscountsItemDto$ProgressDiscountItemDto.Companion.serializer(), qoi0.a(ChargersDiscountsItemDto$ProgressDiscountItemDto.class)), new f9("task_discount", ChargersDiscountsItemDto$TaskDiscountItemDto.Companion.serializer(), qoi0.a(ChargersDiscountsItemDto$TaskDiscountItemDto.class)));
    }
}
