package defpackage;

import com.yandex.go.slot.dto.SlotItemTrailDto$AccordionTrailDto;
import com.yandex.go.slot.dto.SlotItemTrailDto$ButtonDto;
import com.yandex.go.slot.dto.SlotItemTrailDto$IconDto;
import com.yandex.go.slot.dto.SlotItemTrailDto$IconSpotDto;
import com.yandex.go.slot.dto.SlotItemTrailDto$NavTrailDto;
import com.yandex.go.slot.dto.v2;
import com.yandex.go.slot.dto.w2;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class trs0 extends xqt {
    public static final trs0 e = new trs0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, w2.INSTANCE.serializer(), qoi0.a(w2.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("nav", SlotItemTrailDto$NavTrailDto.Companion.serializer(), qoi0.a(SlotItemTrailDto$NavTrailDto.class)), new f9("accordion_chevron", SlotItemTrailDto$AccordionTrailDto.Companion.serializer(), qoi0.a(SlotItemTrailDto$AccordionTrailDto.class)), new f9("button", SlotItemTrailDto$ButtonDto.Companion.serializer(), qoi0.a(SlotItemTrailDto$ButtonDto.class)), new f9("switch", v2.INSTANCE.serializer(), qoi0.a(v2.class)), new f9("icon_spot", SlotItemTrailDto$IconSpotDto.Companion.serializer(), qoi0.a(SlotItemTrailDto$IconSpotDto.class)), new f9("icon", SlotItemTrailDto$IconDto.Companion.serializer(), qoi0.a(SlotItemTrailDto$IconDto.class)));
    }
}
