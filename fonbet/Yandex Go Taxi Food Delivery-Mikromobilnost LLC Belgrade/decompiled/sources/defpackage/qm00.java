package defpackage;

import com.yandex.go.taxi.order.models.api.objects.MapObjectAction$OpenPointAAlternative;
import com.yandex.go.taxi.order.models.api.objects.a0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class qm00 extends xqt {
    public static final qm00 e = new qm00();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, a0.INSTANCE.serializer(), qoi0.a(a0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("open_point_a_alternative", MapObjectAction$OpenPointAAlternative.Companion.serializer(), qoi0.a(MapObjectAction$OpenPointAAlternative.class)));
    }
}
