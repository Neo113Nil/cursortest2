package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemDto$DefaultOfferItem;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemDto$SectionHeader;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.x;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class qyu extends xqt {
    public static final qyu e = new qyu();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, x.INSTANCE.serializer(), qoi0.a(x.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("section_header", HubItemDto$SectionHeader.Companion.serializer(), qoi0.a(HubItemDto$SectionHeader.class)), new f9("default_offer_item", HubItemDto$DefaultOfferItem.Companion.serializer(), qoi0.a(HubItemDto$DefaultOfferItem.class)));
    }
}
