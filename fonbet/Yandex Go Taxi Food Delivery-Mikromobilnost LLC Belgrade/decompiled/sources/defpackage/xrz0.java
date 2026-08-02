package defpackage;

import com.yandex.go.zone.dto.objects.UiOnOrderButton;
import com.yandex.go.zone.dto.objects.UiOnSummary;
import com.yandex.go.zone.dto.objects.r6;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class xrz0 extends xqt {
    public static final xrz0 e = new xrz0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, r6.INSTANCE.serializer(), qoi0.a(r6.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("on_summary", UiOnSummary.Companion.serializer(), qoi0.a(UiOnSummary.class)), new f9("on_order_button", UiOnOrderButton.Companion.serializer(), qoi0.a(UiOnOrderButton.class)));
    }
}
