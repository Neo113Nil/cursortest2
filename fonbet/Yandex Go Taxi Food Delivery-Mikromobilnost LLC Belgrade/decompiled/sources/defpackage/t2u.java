package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.GroupItemContentDto$GroupItemIconContentDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.GroupItemContentDto$GroupItemTextContentDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.m;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class t2u extends xqt {
    public static final t2u e = new t2u();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, m.INSTANCE.serializer(), qoi0.a(m.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("icon_content", GroupItemContentDto$GroupItemIconContentDto.Companion.serializer(), qoi0.a(GroupItemContentDto$GroupItemIconContentDto.class)), new f9("text_content", GroupItemContentDto$GroupItemTextContentDto.Companion.serializer(), qoi0.a(GroupItemContentDto$GroupItemTextContentDto.class)));
    }
}
