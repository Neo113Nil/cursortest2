package defpackage;

import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationItemDto$OrganizationBannerItemDto;
import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationItemDto$OrganizationPreviewItemDto;
import com.yandex.go.places.impl.data.entities.network.organizations.e;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class zi80 extends xqt {
    public static final zi80 e = new zi80();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, e.INSTANCE.serializer(), qoi0.a(e.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("banner", OrganizationItemDto$OrganizationBannerItemDto.Companion.serializer(), qoi0.a(OrganizationItemDto$OrganizationBannerItemDto.class)), new f9("organization", OrganizationItemDto$OrganizationPreviewItemDto.Companion.serializer(), qoi0.a(OrganizationItemDto$OrganizationPreviewItemDto.class)));
    }
}
