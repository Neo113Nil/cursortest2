package defpackage;

import com.adjust.sdk.Constants;
import java.util.Arrays;
import java.util.List;
import ru.yandex.taxi.surge.models.dto.f0;
import ru.yandex.taxi.surge.models.dto.g0;
import ru.yandex.taxi.surge.models.dto.v;
import ru.yandex.taxi.surge.models.dto.x;
import ru.yandex.taxi.surge.models.dto.y;

/* loaded from: classes6.dex */
public final class xow0 extends xqt {
    public static final xow0 e = new xow0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, g0.INSTANCE.serializer(), qoi0.a(g0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9(Constants.DEEPLINK, v.Companion.serializer(), qoi0.a(v.class)), new f9("open_support", x.Companion.serializer(), qoi0.a(x.class)), new f9("open_price_feedback_modal", y.Companion.serializer(), qoi0.a(y.class)), new f9("send_feedback", f0.INSTANCE.serializer(), qoi0.a(f0.class)));
    }
}
