package defpackage;

import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemLeadDto$Icon;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemLeadDto$Image;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemLeadDto$Payment;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.i;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class v410 extends xqt {
    public static final v410 e = new v410();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, i.INSTANCE.serializer(), qoi0.a(i.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("icon", MasstransitSlotItemLeadDto$Icon.Companion.serializer(), qoi0.a(MasstransitSlotItemLeadDto$Icon.class)), new f9("image", MasstransitSlotItemLeadDto$Image.Companion.serializer(), qoi0.a(MasstransitSlotItemLeadDto$Image.class)), new f9("payment", MasstransitSlotItemLeadDto$Payment.Companion.serializer(), qoi0.a(MasstransitSlotItemLeadDto$Payment.class)));
    }
}
