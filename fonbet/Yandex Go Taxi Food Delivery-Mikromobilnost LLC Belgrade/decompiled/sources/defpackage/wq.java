package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.taxi.order.models.api.cancel.Action$DeeplinkAction;
import com.yandex.go.taxi.order.models.api.cancel.Action$DeeplinkAndCancelAction;
import com.yandex.go.taxi.order.models.api.cancel.Action$DriverCall;
import com.yandex.go.taxi.order.models.api.cancel.Action$ModalViewAction;
import com.yandex.go.taxi.order.models.api.cancel.Action$RideSupportChat;
import com.yandex.go.taxi.order.models.api.cancel.a;
import com.yandex.go.taxi.order.models.api.cancel.b;
import com.yandex.go.taxi.order.models.api.cancel.c;
import com.yandex.go.taxi.order.models.api.cancel.d;
import com.yandex.go.taxi.order.models.api.cancel.e;
import com.yandex.go.taxi.order.models.api.cancel.h;
import com.yandex.go.taxi.order.models.api.cancel.j;
import com.yandex.go.taxi.order.models.api.cancel.m;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class wq extends xqt {
    public static final wq e = new wq();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, m.INSTANCE.serializer(), qoi0.a(m.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("cancel", a.INSTANCE.serializer(), qoi0.a(a.class)), new f9("driver_call", Action$DriverCall.Companion.serializer(), qoi0.a(Action$DriverCall.class)), new f9("open_chat_with_driver", j.INSTANCE.serializer(), qoi0.a(j.class)), new f9("do_nothing", h.INSTANCE.serializer(), qoi0.a(h.class)), new f9("change_point_a", c.INSTANCE.serializer(), qoi0.a(c.class)), new f9("change_point_b", d.INSTANCE.serializer(), qoi0.a(d.class)), new f9("change_driver", b.INSTANCE.serializer(), qoi0.a(b.class)), new f9("open_modal_window", Action$ModalViewAction.Companion.serializer(), qoi0.a(Action$ModalViewAction.class)), new f9(Constants.DEEPLINK, Action$DeeplinkAction.Companion.serializer(), qoi0.a(Action$DeeplinkAction.class)), new f9("deeplink_and_cancel", Action$DeeplinkAndCancelAction.Companion.serializer(), qoi0.a(Action$DeeplinkAndCancelAction.class)), new f9("open_ride_support_chat", Action$RideSupportChat.Companion.serializer(), qoi0.a(Action$RideSupportChat.class)), new f9("close", e.INSTANCE.serializer(), qoi0.a(e.class)));
    }
}
