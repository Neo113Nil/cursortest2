package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.ultima_mode.api.data.UltimaModeActionDto$CloseAndDeeplink;
import com.yandex.go.ultima_mode.api.data.UltimaModeActionDto$OpenDeeplink;
import com.yandex.go.ultima_mode.api.data.b;
import com.yandex.go.ultima_mode.api.data.d;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class xu11 extends xqt {
    public static final xu11 e = new xu11();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, b.INSTANCE.serializer(), qoi0.a(b.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("toggle_ultima_mode", d.INSTANCE.serializer(), qoi0.a(d.class)), new f9(Constants.DEEPLINK, UltimaModeActionDto$OpenDeeplink.Companion.serializer(), qoi0.a(UltimaModeActionDto$OpenDeeplink.class)), new f9("close_and_deeplink", UltimaModeActionDto$CloseAndDeeplink.Companion.serializer(), qoi0.a(UltimaModeActionDto$CloseAndDeeplink.class)));
    }
}
