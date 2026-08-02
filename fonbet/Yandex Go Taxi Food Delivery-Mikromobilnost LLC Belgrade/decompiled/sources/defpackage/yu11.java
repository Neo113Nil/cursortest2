package defpackage;

import com.yandex.go.slot.dto.SlotItemActionDto$CloseAndDeeplink;
import com.yandex.go.slot.dto.SlotItemActionDto$Type;
import com.yandex.go.slot.dto.a2;
import com.yandex.go.slot.dto.b2;
import com.yandex.go.ultima_mode.api.data.UltimaModeActionDto$CloseAndDeeplink;
import com.yandex.go.ultima_mode.api.data.UltimaModeActionDto$OpenDeeplink;
import com.yandex.go.ultima_mode.api.data.UltimaModeActionDto$Type;
import com.yandex.go.ultima_mode.api.data.d;
import com.yandex.go.ultima_mode.api.data.e;

/* loaded from: classes14.dex */
public final class yu11 implements sqs0 {
    public static vu11 b(e eVar) {
        return eVar instanceof d ? uu11.a : eVar instanceof UltimaModeActionDto$CloseAndDeeplink ? new tu11(UltimaModeActionDto$Type.CLOSE_AND_DEEPLINK.getAnalyticsName(), ((UltimaModeActionDto$CloseAndDeeplink) eVar).a) : eVar instanceof UltimaModeActionDto$OpenDeeplink ? new tu11(UltimaModeActionDto$Type.DEEPLINK.getAnalyticsName(), ((UltimaModeActionDto$OpenDeeplink) eVar).a) : su11.a;
    }

    @Override // defpackage.sqs0
    public final nqs0 a(b2 b2Var) {
        return b2Var instanceof a2 ? uu11.a : b2Var instanceof SlotItemActionDto$CloseAndDeeplink ? new tu11(SlotItemActionDto$Type.CLOSE_AND_DEEPLINK.getAnalyticsName(), ((SlotItemActionDto$CloseAndDeeplink) b2Var).a) : su11.a;
    }
}
