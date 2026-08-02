package defpackage;

import com.yandex.go.slot.dto.SlotItemActionDto$Deeplink;
import com.yandex.go.slot.dto.SlotItemActionDto$EditFavoriteRide;
import com.yandex.go.slot.dto.SlotItemActionDto$ShareFavoriteRide;
import com.yandex.go.slot.dto.SlotItemActionDto$Type;
import com.yandex.go.slot.dto.b2;
import com.yandex.go.slot.dto.w0;

/* loaded from: classes5.dex */
public final class t9r0 implements sqs0 {
    public static p9r0 b(b2 b2Var) {
        return b2Var instanceof SlotItemActionDto$Deeplink ? new k9r0(SlotItemActionDto$Type.DEEPLINK.getAnalyticsName(), ((SlotItemActionDto$Deeplink) b2Var).a) : b2Var instanceof w0 ? new l9r0(SlotItemActionDto$Type.DELETE_FAVORITE_RIDE.getAnalyticsName()) : b2Var instanceof SlotItemActionDto$ShareFavoriteRide ? new o9r0(SlotItemActionDto$Type.SHARE_FAVORITE_RIDE.getAnalyticsName(), ((SlotItemActionDto$ShareFavoriteRide) b2Var).a) : b2Var instanceof SlotItemActionDto$EditFavoriteRide ? new m9r0(SlotItemActionDto$Type.EDIT_FAVORITE_RIDE.getAnalyticsName(), ((SlotItemActionDto$EditFavoriteRide) b2Var).a) : n9r0.a;
    }

    @Override // defpackage.sqs0
    public final /* bridge */ /* synthetic */ nqs0 a(b2 b2Var) {
        return b(b2Var);
    }
}
