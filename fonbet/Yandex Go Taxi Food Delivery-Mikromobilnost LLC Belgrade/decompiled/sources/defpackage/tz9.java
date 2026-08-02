package defpackage;

import com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenPromoPlateActionDto$OpenDiscountDetails;
import com.yandex.go.chargers.feedback.data.m;
import com.yandex.go.chargers.feedback.data.n;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class tz9 extends xqt {
    public static final tz9 e = new tz9();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, n.INSTANCE.serializer(), qoi0.a(n.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("open_discount_details", ChargersFeedbackScreenPromoPlateActionDto$OpenDiscountDetails.Companion.serializer(), qoi0.a(ChargersFeedbackScreenPromoPlateActionDto$OpenDiscountDetails.class)), new f9("open_discount_list", m.INSTANCE.serializer(), qoi0.a(m.class)));
    }
}
