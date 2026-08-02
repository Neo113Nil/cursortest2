package defpackage;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$StatusProgress$Trail$BoldTimer;
import com.yandex.go.taxi.order.models.api.response.b6;
import com.yandex.go.taxi.order.models.api.response.c6;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class ujk0 extends xqt {
    public static final ujk0 e = new ujk0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, c6.INSTANCE.serializer(), qoi0.a(c6.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("bold_timer", RideCardItemDto$StatusProgress$Trail$BoldTimer.Companion.serializer(), qoi0.a(RideCardItemDto$StatusProgress$Trail$BoldTimer.class)), new f9("regular_timer", b6.INSTANCE.serializer(), qoi0.a(b6.class)));
    }
}
