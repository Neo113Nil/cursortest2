package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$Deeplink;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$OpenDeliveryOrderForm;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$OpenMoreActions;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$OpenNavigator;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$OpenTaxi;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$ShareNative;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$Unknown;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$WebCustomTabs;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$WebView;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class wd6 extends xqt {
    public static final wd6 e = new wd6();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, BottomPanelButtonActionDto$Unknown.Companion.serializer(), qoi0.a(BottomPanelButtonActionDto$Unknown.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9(Constants.DEEPLINK, BottomPanelButtonActionDto$Deeplink.Companion.serializer(), qoi0.a(BottomPanelButtonActionDto$Deeplink.class)), new f9("share_native", BottomPanelButtonActionDto$ShareNative.Companion.serializer(), qoi0.a(BottomPanelButtonActionDto$ShareNative.class)), new f9("web_view", BottomPanelButtonActionDto$WebView.Companion.serializer(), qoi0.a(BottomPanelButtonActionDto$WebView.class)), new f9("web_custom_tabs", BottomPanelButtonActionDto$WebCustomTabs.Companion.serializer(), qoi0.a(BottomPanelButtonActionDto$WebCustomTabs.class)), new f9("open_taxi", BottomPanelButtonActionDto$OpenTaxi.Companion.serializer(), qoi0.a(BottomPanelButtonActionDto$OpenTaxi.class)), new f9("open_navigator", BottomPanelButtonActionDto$OpenNavigator.Companion.serializer(), qoi0.a(BottomPanelButtonActionDto$OpenNavigator.class)), new f9("open_delivery_order_form", BottomPanelButtonActionDto$OpenDeliveryOrderForm.Companion.serializer(), qoi0.a(BottomPanelButtonActionDto$OpenDeliveryOrderForm.class)), new f9("open_more_actions", BottomPanelButtonActionDto$OpenMoreActions.Companion.serializer(), qoi0.a(BottomPanelButtonActionDto$OpenMoreActions.class)));
    }
}
