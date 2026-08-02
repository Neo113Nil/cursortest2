package defpackage;

import com.yandex.go.taxi.order.models.api.response.Action$ShowFullScreenAction;
import com.yandex.go.taxi.order.models.api.response.Action$ShowOrderPopupAction;
import com.yandex.go.taxi.order.models.api.response.c;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class yx extends xqt {
    public static final yx e = new yx();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, c.INSTANCE.serializer(), qoi0.a(c.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("show_fullscreen", Action$ShowFullScreenAction.Companion.serializer(), qoi0.a(Action$ShowFullScreenAction.class)), new f9("show_order_popup", Action$ShowOrderPopupAction.Companion.serializer(), qoi0.a(Action$ShowOrderPopupAction.class)));
    }
}
