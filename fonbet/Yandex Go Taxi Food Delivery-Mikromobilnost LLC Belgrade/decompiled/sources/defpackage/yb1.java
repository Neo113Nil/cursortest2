package defpackage;

import java.util.Arrays;
import java.util.List;
import ru.yandex.taxi.common_models.net.map_object.a0;
import ru.yandex.taxi.common_models.net.map_object.i;
import ru.yandex.taxi.common_models.net.map_object.k;

/* loaded from: classes5.dex */
public final class yb1 extends xqt {
    public static final yb1 e = new yb1();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, k.INSTANCE.serializer(), qoi0.a(k.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("point_сlarification_screen", a0.Companion.serializer(), qoi0.a(a0.class)), new f9("address_confirmation_screen", i.Companion.serializer(), qoi0.a(i.class)));
    }
}
