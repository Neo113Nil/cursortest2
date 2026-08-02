package defpackage;

import com.yandex.go.chargers.order.data.model.ChargersOrderNotificationActionDto$ShowPopupById;
import com.yandex.go.chargers.order.data.model.t0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class xca extends xqt {
    public static final xca e = new xca();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, t0.INSTANCE.serializer(), qoi0.a(t0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("show_popup_by_id", ChargersOrderNotificationActionDto$ShowPopupById.Companion.serializer(), qoi0.a(ChargersOrderNotificationActionDto$ShowPopupById.class)));
    }
}
