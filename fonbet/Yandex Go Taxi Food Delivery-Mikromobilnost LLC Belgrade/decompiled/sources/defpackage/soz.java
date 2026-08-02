package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.lootbox.impl.data.entities.network.common.action.LootBoxActionDeeplinkDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.action.LootBoxActionModalViewDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.action.LootBoxActionWebViewDto;
import com.yandex.go.lootbox.impl.data.entities.network.common.action.d;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class soz extends xqt {
    public static final soz e = new soz();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, d.INSTANCE.serializer(), qoi0.a(d.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("modal_view", LootBoxActionModalViewDto.Companion.serializer(), qoi0.a(LootBoxActionModalViewDto.class)), new f9(Constants.DEEPLINK, LootBoxActionDeeplinkDto.Companion.serializer(), qoi0.a(LootBoxActionDeeplinkDto.class)), new f9("web_view", LootBoxActionWebViewDto.Companion.serializer(), qoi0.a(LootBoxActionWebViewDto.class)));
    }
}
