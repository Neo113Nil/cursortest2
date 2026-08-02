package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$DefaultOfferItemDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$GroupItemsDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$SectionHeaderDtoV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2$ToggleItemDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.a1;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class tyu extends xqt {
    public static final tyu e = new tyu();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, a1.INSTANCE.serializer(), qoi0.a(a1.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("section_header", HubItemDtoV2$SectionHeaderDtoV2.Companion.serializer(), qoi0.a(HubItemDtoV2$SectionHeaderDtoV2.class)), new f9("default_offer_item", HubItemDtoV2$DefaultOfferItemDtoV2.Companion.serializer(), qoi0.a(HubItemDtoV2$DefaultOfferItemDtoV2.class)), new f9("group_items", HubItemDtoV2$GroupItemsDto.Companion.serializer(), qoi0.a(HubItemDtoV2$GroupItemsDto.class)), new f9("toggle_item", HubItemDtoV2$ToggleItemDto.Companion.serializer(), qoi0.a(HubItemDtoV2$ToggleItemDto.class)));
    }
}
