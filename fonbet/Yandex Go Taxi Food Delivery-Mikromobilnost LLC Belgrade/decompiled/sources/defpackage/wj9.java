package defpackage;

import com.yandex.go.chargers.data.model.ChargersActionAttributeDto$Action$ShowPopupById;
import com.yandex.go.chargers.data.model.f;
import com.yandex.go.chargers.data.model.h;
import com.yandex.go.chargers.data.model.i;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class wj9 extends xqt {
    public static final wj9 e = new wj9();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, i.INSTANCE.serializer(), qoi0.a(i.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("show_popup", f.INSTANCE.serializer(), qoi0.a(f.class)), new f9("show_popup_by_id", ChargersActionAttributeDto$Action$ShowPopupById.Companion.serializer(), qoi0.a(ChargersActionAttributeDto$Action$ShowPopupById.class)), new f9("show_surge_modal", h.INSTANCE.serializer(), qoi0.a(h.class)));
    }
}
