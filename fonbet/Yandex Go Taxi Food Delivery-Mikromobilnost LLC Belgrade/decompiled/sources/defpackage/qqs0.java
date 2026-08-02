package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.slot.dto.SlotItemActionDto$ChangeRequirements;
import com.yandex.go.slot.dto.SlotItemActionDto$CloseAndDeeplink;
import com.yandex.go.slot.dto.SlotItemActionDto$ConfirmAltOption;
import com.yandex.go.slot.dto.SlotItemActionDto$CopyToClipboard;
import com.yandex.go.slot.dto.SlotItemActionDto$Deeplink;
import com.yandex.go.slot.dto.SlotItemActionDto$EditFavoriteRide;
import com.yandex.go.slot.dto.SlotItemActionDto$OpenBottomModal;
import com.yandex.go.slot.dto.SlotItemActionDto$OpenCenterModal;
import com.yandex.go.slot.dto.SlotItemActionDto$OpenComment;
import com.yandex.go.slot.dto.SlotItemActionDto$OpenDetailedPriceModal;
import com.yandex.go.slot.dto.SlotItemActionDto$OpenSettingsModal;
import com.yandex.go.slot.dto.SlotItemActionDto$OpenUrl;
import com.yandex.go.slot.dto.SlotItemActionDto$ShareFavoriteRide;
import com.yandex.go.slot.dto.SlotItemActionDto$StartAcceptancePayment;
import com.yandex.go.slot.dto.a2;
import com.yandex.go.slot.dto.d1;
import com.yandex.go.slot.dto.e0;
import com.yandex.go.slot.dto.f0;
import com.yandex.go.slot.dto.g0;
import com.yandex.go.slot.dto.g1;
import com.yandex.go.slot.dto.h0;
import com.yandex.go.slot.dto.h1;
import com.yandex.go.slot.dto.i0;
import com.yandex.go.slot.dto.i1;
import com.yandex.go.slot.dto.j0;
import com.yandex.go.slot.dto.k0;
import com.yandex.go.slot.dto.k1;
import com.yandex.go.slot.dto.l0;
import com.yandex.go.slot.dto.l1;
import com.yandex.go.slot.dto.m0;
import com.yandex.go.slot.dto.m1;
import com.yandex.go.slot.dto.n0;
import com.yandex.go.slot.dto.n1;
import com.yandex.go.slot.dto.p0;
import com.yandex.go.slot.dto.q0;
import com.yandex.go.slot.dto.q1;
import com.yandex.go.slot.dto.r1;
import com.yandex.go.slot.dto.t1;
import com.yandex.go.slot.dto.u0;
import com.yandex.go.slot.dto.u1;
import com.yandex.go.slot.dto.v1;
import com.yandex.go.slot.dto.w0;
import com.yandex.go.slot.dto.x1;
import com.yandex.go.slot.dto.y0;
import com.yandex.go.slot.dto.z1;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class qqs0 extends xqt {
    public static final qqs0 e = new qqs0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, y0.INSTANCE.serializer(), qoi0.a(y0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("change_source", q0.INSTANCE.serializer(), qoi0.a(q0.class)), new f9("change_entrance", l0.INSTANCE.serializer(), qoi0.a(l0.class)), new f9("change_destination", k0.INSTANCE.serializer(), qoi0.a(k0.class)), new f9("open_payment", m1.INSTANCE.serializer(), qoi0.a(m1.class)), new f9("open_order_info", l1.INSTANCE.serializer(), qoi0.a(l1.class)), new f9("cancel", j0.INSTANCE.serializer(), qoi0.a(j0.class)), new f9("add_route_point", g0.INSTANCE.serializer(), qoi0.a(g0.class)), new f9("change_route_point", p0.INSTANCE.serializer(), qoi0.a(p0.class)), new f9("close_and_deeplink", SlotItemActionDto$CloseAndDeeplink.Companion.serializer(), qoi0.a(SlotItemActionDto$CloseAndDeeplink.class)), new f9("set_user_coming", v1.INSTANCE.serializer(), qoi0.a(v1.class)), new f9("open_chat", d1.INSTANCE.serializer(), qoi0.a(d1.class)), new f9("open_deaf_driver", i1.INSTANCE.serializer(), qoi0.a(i1.class)), new f9("call_driver", h0.INSTANCE.serializer(), qoi0.a(h0.class)), new f9("open_safety_center", n1.INSTANCE.serializer(), qoi0.a(n1.class)), new f9("share_route", x1.INSTANCE.serializer(), qoi0.a(x1.class)), new f9("create_order", u0.INSTANCE.serializer(), qoi0.a(u0.class)), new f9("open_url", SlotItemActionDto$OpenUrl.Companion.serializer(), qoi0.a(SlotItemActionDto$OpenUrl.class)), new f9("open_comment", SlotItemActionDto$OpenComment.Companion.serializer(), qoi0.a(SlotItemActionDto$OpenComment.class)), new f9("open_cost_center", h1.INSTANCE.serializer(), qoi0.a(h1.class)), new f9("open_center_modal", SlotItemActionDto$OpenCenterModal.Companion.serializer(), qoi0.a(SlotItemActionDto$OpenCenterModal.class)), new f9("open_detailed_price_modal", SlotItemActionDto$OpenDetailedPriceModal.Companion.serializer(), qoi0.a(SlotItemActionDto$OpenDetailedPriceModal.class)), new f9("open_bottom_modal", SlotItemActionDto$OpenBottomModal.Companion.serializer(), qoi0.a(SlotItemActionDto$OpenBottomModal.class)), new f9("open_settings_modal", SlotItemActionDto$OpenSettingsModal.Companion.serializer(), qoi0.a(SlotItemActionDto$OpenSettingsModal.class)), new f9("delete_favorite_ride", w0.INSTANCE.serializer(), qoi0.a(w0.class)), new f9("share_favorite_ride", SlotItemActionDto$ShareFavoriteRide.Companion.serializer(), qoi0.a(SlotItemActionDto$ShareFavoriteRide.class)), new f9("edit_favorite_ride", SlotItemActionDto$EditFavoriteRide.Companion.serializer(), qoi0.a(SlotItemActionDto$EditFavoriteRide.class)), new f9("toggle_share_location", z1.INSTANCE.serializer(), qoi0.a(z1.class)), new f9("cancel_alt_option", i0.INSTANCE.serializer(), qoi0.a(i0.class)), new f9("confirm_alt_option", SlotItemActionDto$ConfirmAltOption.Companion.serializer(), qoi0.a(SlotItemActionDto$ConfirmAltOption.class)), new f9("toggle_ultima_mode", a2.INSTANCE.serializer(), qoi0.a(a2.class)), new f9("open_tips_modal", r1.INSTANCE.serializer(), qoi0.a(r1.class)), new f9("open_details", k1.INSTANCE.serializer(), qoi0.a(k1.class)), new f9("open_compact_or_details", g1.INSTANCE.serializer(), qoi0.a(g1.class)), new f9("open_support", q1.INSTANCE.serializer(), qoi0.a(q1.class)), new f9("accept_eula", e0.INSTANCE.serializer(), qoi0.a(e0.class)), new f9("reject_eula", t1.INSTANCE.serializer(), qoi0.a(t1.class)), new f9("change_rating", m0.INSTANCE.serializer(), qoi0.a(m0.class)), new f9("change_rating_and_open_details", n0.INSTANCE.serializer(), qoi0.a(n0.class)), new f9(Constants.DEEPLINK, SlotItemActionDto$Deeplink.Companion.serializer(), qoi0.a(SlotItemActionDto$Deeplink.class)), new f9("set_check_in_confirmed", u1.INSTANCE.serializer(), qoi0.a(u1.class)), new f9("copy_to_clipboard", SlotItemActionDto$CopyToClipboard.Companion.serializer(), qoi0.a(SlotItemActionDto$CopyToClipboard.class)), new f9("activation_with_onboarding", f0.INSTANCE.serializer(), qoi0.a(f0.class)), new f9("change_requirements", SlotItemActionDto$ChangeRequirements.Companion.serializer(), qoi0.a(SlotItemActionDto$ChangeRequirements.class)), new f9("start_acceptance_payment", SlotItemActionDto$StartAcceptancePayment.Companion.serializer(), qoi0.a(SlotItemActionDto$StartAcceptancePayment.class)));
    }
}
