package defpackage;

import com.yandex.go.slot.dto.SettingsModalContentItemDto$DividerLine;
import com.yandex.go.slot.dto.SettingsModalContentItemDto$Slot;
import com.yandex.go.slot.dto.SettingsModalContentItemDto$SpacerVertical;
import com.yandex.go.slot.dto.n;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class s9r0 extends xqt {
    public static final s9r0 e = new s9r0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, n.INSTANCE.serializer(), qoi0.a(n.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("slot", SettingsModalContentItemDto$Slot.Companion.serializer(), qoi0.a(SettingsModalContentItemDto$Slot.class)), new f9("spacer_vertical", SettingsModalContentItemDto$SpacerVertical.Companion.serializer(), qoi0.a(SettingsModalContentItemDto$SpacerVertical.class)), new f9("divider", SettingsModalContentItemDto$DividerLine.Companion.serializer(), qoi0.a(SettingsModalContentItemDto$DividerLine.class)));
    }
}
