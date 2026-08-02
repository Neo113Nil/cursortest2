package defpackage;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TipsWishSelector$Content$ContentAnimation;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$TipsWishSelector$Content$ContentImage;
import com.yandex.go.taxi.order.models.api.response.v6;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class wjk0 extends xqt {
    public static final wjk0 e = new wjk0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, v6.INSTANCE.serializer(), qoi0.a(v6.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("image", RideCardItemDto$TipsWishSelector$Content$ContentImage.Companion.serializer(), qoi0.a(RideCardItemDto$TipsWishSelector$Content$ContentImage.class)), new f9("animation", RideCardItemDto$TipsWishSelector$Content$ContentAnimation.Companion.serializer(), qoi0.a(RideCardItemDto$TipsWishSelector$Content$ContentAnimation.class)));
    }
}
