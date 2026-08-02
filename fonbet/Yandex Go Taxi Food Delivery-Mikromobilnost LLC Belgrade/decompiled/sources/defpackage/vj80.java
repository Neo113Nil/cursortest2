package defpackage;

import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationPreviewImageItemDto$OrganizationPreviewImageDto;
import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationPreviewImageItemDto$OrganizationPreviewPlaceholderDto;
import com.yandex.go.places.impl.data.entities.network.organizations.m;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class vj80 extends xqt {
    public static final vj80 e = new vj80();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, m.INSTANCE.serializer(), qoi0.a(m.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("image", OrganizationPreviewImageItemDto$OrganizationPreviewImageDto.Companion.serializer(), qoi0.a(OrganizationPreviewImageItemDto$OrganizationPreviewImageDto.class)), new f9("placeholder", OrganizationPreviewImageItemDto$OrganizationPreviewPlaceholderDto.Companion.serializer(), qoi0.a(OrganizationPreviewImageItemDto$OrganizationPreviewPlaceholderDto.class)));
    }
}
