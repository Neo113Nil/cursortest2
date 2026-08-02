package defpackage;

import java.util.Arrays;
import java.util.List;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class sjx0 extends xqt {
    public static final sjx0 e = new sjx0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, x121.INSTANCE.serializer(), qoi0.a(x121.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9(TariffOrderFlow.ORDER_FLOW_DRIVE_KEY, ghm.Companion.serializer(), qoi0.a(ghm.class)), new f9("scooters", s5p0.Companion.serializer(), qoi0.a(s5p0.class)));
    }
}
