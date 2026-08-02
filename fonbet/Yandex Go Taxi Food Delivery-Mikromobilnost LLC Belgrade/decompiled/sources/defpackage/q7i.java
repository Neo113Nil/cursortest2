package defpackage;

import com.yandex.go.zone.dto.objects.DeliveryEstimatedWaiting$Exact;
import com.yandex.go.zone.dto.objects.DeliveryEstimatedWaiting$Range;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes15.dex */
public final class q7i extends xqt {
    public static final q7i e = new q7i();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, DeliveryEstimatedWaiting$Exact.Companion.serializer(), qoi0.a(DeliveryEstimatedWaiting$Exact.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("exact", DeliveryEstimatedWaiting$Exact.Companion.serializer(), qoi0.a(DeliveryEstimatedWaiting$Exact.class)), new f9("range", DeliveryEstimatedWaiting$Range.Companion.serializer(), qoi0.a(DeliveryEstimatedWaiting$Range.class)));
    }
}
