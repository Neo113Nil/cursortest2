package defpackage;

import com.yandex.go.benefits_center.benefits.data.model.BenefitsCenterBduiPayload$NavigationAction$OpenActivation;
import com.yandex.go.benefits_center.benefits.data.model.BenefitsCenterBduiPayload$NavigationAction$OpenPromoCode;
import com.yandex.go.benefits_center.benefits.data.model.BenefitsCenterBduiPayload$NavigationAction$SelectFilter;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class vm5 extends xqt {
    public static final vm5 e = new vm5();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, wm5.INSTANCE.serializer(), qoi0.a(wm5.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("open_promocode", BenefitsCenterBduiPayload$NavigationAction$OpenPromoCode.Companion.serializer(), qoi0.a(BenefitsCenterBduiPayload$NavigationAction$OpenPromoCode.class)), new f9("selected_filter", BenefitsCenterBduiPayload$NavigationAction$SelectFilter.Companion.serializer(), qoi0.a(BenefitsCenterBduiPayload$NavigationAction$SelectFilter.class)), new f9("open_activation", BenefitsCenterBduiPayload$NavigationAction$OpenActivation.Companion.serializer(), qoi0.a(BenefitsCenterBduiPayload$NavigationAction$OpenActivation.class)));
    }
}
