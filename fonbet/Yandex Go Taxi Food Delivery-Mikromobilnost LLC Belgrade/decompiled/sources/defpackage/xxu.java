package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFilterActionV2$TransportSelectorAction;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.u;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.v;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.x;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class xxu extends xqt {
    public static final xxu e = new xxu();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, x.INSTANCE.serializer(), qoi0.a(x.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("select_one_action", u.INSTANCE.serializer(), qoi0.a(u.class)), new f9("transport_selector_screen", HubFilterActionV2$TransportSelectorAction.Companion.serializer(), qoi0.a(HubFilterActionV2$TransportSelectorAction.class)), new f9("show_due_selector", v.INSTANCE.serializer(), qoi0.a(v.class)));
    }
}
