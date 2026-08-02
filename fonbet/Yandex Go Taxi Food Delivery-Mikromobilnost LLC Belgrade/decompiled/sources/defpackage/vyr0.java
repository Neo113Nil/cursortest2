package defpackage;

import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.ShortcutChipDto$ShortcutFilterChipDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.ShortcutChipDto$ShortcutModalChipDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.p;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class vyr0 extends xqt {
    public static final vyr0 e = new vyr0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, p.INSTANCE.serializer(), qoi0.a(p.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("shortcut_modal_chip", ShortcutChipDto$ShortcutModalChipDto.Companion.serializer(), qoi0.a(ShortcutChipDto$ShortcutModalChipDto.class)), new f9("shortcut_filter_chip", ShortcutChipDto$ShortcutFilterChipDto.Companion.serializer(), qoi0.a(ShortcutChipDto$ShortcutFilterChipDto.class)));
    }
}
