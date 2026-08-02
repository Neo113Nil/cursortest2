package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.places.models.data.entities.network.ActionDto$CallLinkBackgroundActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$DeeplinkActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$DeleteUserReviewActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$GoalTrackingLinkActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$OpenDeliveryFormActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$OpenNavigatorActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$OpenTaxiActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$OpenWebCustomTabsActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$OpenWebViewActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$OpenWebViewAuthActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$OrganizationCardActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$ShareActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$ShowTrackingLinkActionDto;
import com.yandex.go.places.models.data.entities.network.d;
import com.yandex.go.places.models.data.entities.network.h;
import com.yandex.go.places.models.data.entities.network.n;
import com.yandex.go.places.models.data.entities.network.o;
import com.yandex.go.places.models.data.entities.network.r;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class rv extends xqt {
    public static final rv e = new rv();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, r.INSTANCE.serializer(), qoi0.a(r.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("organization_card", ActionDto$OrganizationCardActionDto.Companion.serializer(), qoi0.a(ActionDto$OrganizationCardActionDto.class)), new f9("share_native", ActionDto$ShareActionDto.Companion.serializer(), qoi0.a(ActionDto$ShareActionDto.class)), new f9("web_view", ActionDto$OpenWebViewActionDto.Companion.serializer(), qoi0.a(ActionDto$OpenWebViewActionDto.class)), new f9("web_view_auth", ActionDto$OpenWebViewAuthActionDto.Companion.serializer(), qoi0.a(ActionDto$OpenWebViewAuthActionDto.class)), new f9("web_custom_tabs", ActionDto$OpenWebCustomTabsActionDto.Companion.serializer(), qoi0.a(ActionDto$OpenWebCustomTabsActionDto.class)), new f9(Constants.DEEPLINK, ActionDto$DeeplinkActionDto.Companion.serializer(), qoi0.a(ActionDto$DeeplinkActionDto.class)), new f9("open_photo_viewer", h.INSTANCE.serializer(), qoi0.a(h.class)), new f9("open_taxi", ActionDto$OpenTaxiActionDto.Companion.serializer(), qoi0.a(ActionDto$OpenTaxiActionDto.class)), new f9("open_delivery_order_form", ActionDto$OpenDeliveryFormActionDto.Companion.serializer(), qoi0.a(ActionDto$OpenDeliveryFormActionDto.class)), new f9("open_navigator", ActionDto$OpenNavigatorActionDto.Companion.serializer(), qoi0.a(ActionDto$OpenNavigatorActionDto.class)), new f9("organization_list_search", o.INSTANCE.serializer(), qoi0.a(o.class)), new f9("organization_list_reset_filters", n.INSTANCE.serializer(), qoi0.a(n.class)), new f9("delete_user_review", ActionDto$DeleteUserReviewActionDto.Companion.serializer(), qoi0.a(ActionDto$DeleteUserReviewActionDto.class)), new f9("dismiss_modal", d.INSTANCE.serializer(), qoi0.a(d.class)), new f9("show_tracking_link", ActionDto$ShowTrackingLinkActionDto.Companion.serializer(), qoi0.a(ActionDto$ShowTrackingLinkActionDto.class)), new f9("goal_tracking_link", ActionDto$GoalTrackingLinkActionDto.Companion.serializer(), qoi0.a(ActionDto$GoalTrackingLinkActionDto.class)), new f9("call_link_background", ActionDto$CallLinkBackgroundActionDto.Companion.serializer(), qoi0.a(ActionDto$CallLinkBackgroundActionDto.class)));
    }
}
