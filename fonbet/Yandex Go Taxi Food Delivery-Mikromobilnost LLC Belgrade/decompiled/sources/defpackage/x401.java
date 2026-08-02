package defpackage;

import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusLeadImageWithOverlayImageDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusSquareImageDto;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class x401 extends wqt {
    public static final x401 e = new x401();

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("square_image", TrackingCardStatusSquareImageDto.Companion.serializer(), qoi0.a(TrackingCardStatusSquareImageDto.class)), new f9("image_with_overlay_image", TrackingCardStatusLeadImageWithOverlayImageDto.Companion.serializer(), qoi0.a(TrackingCardStatusLeadImageWithOverlayImageDto.class)));
    }
}
