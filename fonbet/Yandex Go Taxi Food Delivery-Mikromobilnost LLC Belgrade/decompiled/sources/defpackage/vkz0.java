package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.ToggleItemAction$SelectTransportOptionAction;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.j2;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class vkz0 extends xqt {
    public static final vkz0 e = new vkz0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, j2.INSTANCE.serializer(), qoi0.a(j2.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("select_transport_option_action", ToggleItemAction$SelectTransportOptionAction.Companion.serializer(), qoi0.a(ToggleItemAction$SelectTransportOptionAction.class)));
    }
}
