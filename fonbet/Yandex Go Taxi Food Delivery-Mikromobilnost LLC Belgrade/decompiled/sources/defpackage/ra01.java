package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TrailingItemDtoV2$TrailingCheckboxItem;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TrailingItemDtoV2$TrailingChevronItem;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TrailingItemDtoV2$TrailingTextItem;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.p2;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class ra01 extends xqt {
    public static final ra01 e = new ra01();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, p2.INSTANCE.serializer(), qoi0.a(p2.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("text", TrailingItemDtoV2$TrailingTextItem.Companion.serializer(), qoi0.a(TrailingItemDtoV2$TrailingTextItem.class)), new f9("checkbox", TrailingItemDtoV2$TrailingCheckboxItem.Companion.serializer(), qoi0.a(TrailingItemDtoV2$TrailingCheckboxItem.class)), new f9("chevron", TrailingItemDtoV2$TrailingChevronItem.Companion.serializer(), qoi0.a(TrailingItemDtoV2$TrailingChevronItem.class)));
    }
}
