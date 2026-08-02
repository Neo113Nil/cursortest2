package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.user_profile.ui.am.AmActions$CloseAndDeeplink;
import com.yandex.go.user_profile.ui.am.AmActions$Command;
import com.yandex.go.user_profile.ui.am.AmActions$Deeplink;
import com.yandex.go.user_profile.ui.am.AmActions$Uri;
import com.yandex.go.user_profile.ui.am.d;
import com.yandex.go.user_profile.ui.am.e;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class t02 extends xqt {
    public static final t02 e = new t02();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, e.INSTANCE.serializer(), qoi0.a(e.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("superapp_command_action", AmActions$Command.Companion.serializer(), qoi0.a(AmActions$Command.class)), new f9("superapp_uri_action", AmActions$Uri.Companion.serializer(), qoi0.a(AmActions$Uri.class)), new f9("toggle_ultima_mode", d.INSTANCE.serializer(), qoi0.a(d.class)), new f9(Constants.DEEPLINK, AmActions$Deeplink.Companion.serializer(), qoi0.a(AmActions$Deeplink.class)), new f9("close_and_deeplink", AmActions$CloseAndDeeplink.Companion.serializer(), qoi0.a(AmActions$CloseAndDeeplink.class)));
    }
}
