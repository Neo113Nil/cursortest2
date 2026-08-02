package defpackage;

import com.yandex.go.places.impl.data.entities.network.bookings.BookingDto$$serializer;
import com.yandex.go.places.impl.data.entities.network.bookings.PlacesUserBookingsResponse;
import com.yandex.go.places.impl.data.entities.network.bookings.e;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.home.repository.api.model.panel.ActionType;
import com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut;
import com.yandex.plus.home.repository.api.model.panel.ShortcutAction;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final /* synthetic */ class sfc0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ sfc0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_;
        switch (this.a) {
            case 0:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_supermap_l_badge_bottom_offset);
            case 1:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_supermap_m_image_size);
            case 2:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_supermap_m_border);
            case 3:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_supermap_m_corner);
            case 4:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_selected_width);
            case 5:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_supermap_l_selected_circle_gap);
            case 6:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_supermap_m_selected_circle_gap);
            case 7:
                return Integer.valueOf(eug0.discovery_map_pin_war_embedded_label_overlap);
            case 8:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_selected_height);
            case 9:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_selected_image_size);
            case 10:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_selected_border);
            case 11:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_selected_corner);
            case 12:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_selected_circle_outer_radius);
            case 13:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_selected_circle_inner_radius);
            case 14:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_l_padding);
            case 15:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_l_border);
            case 16:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_l_corner);
            case 17:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_l_badge_size);
            case 18:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_l_overlay_icon_size);
            case 19:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_m_image_size);
            case 20:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_m_image_size_small);
            case 21:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_m_padding);
            case 22:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_m_border);
            case 23:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_m_corner);
            case 24:
                return Integer.valueOf(eug0.discovery_map_pin_war_style_m_badge_size);
            case 25:
                e eVar = PlacesUserBookingsResponse.Companion;
                return new p53(BookingDto$$serializer.INSTANCE, 0);
            case 26:
                sjh sjhVar = uyj.a;
                return mdh.b;
            case 27:
                return new PlusCardShortcut.PromoMini("debug-panel", "debug panel", "open debug panel", "", new PlusThemedColor(null, null), new PlusThemedColor(null, null), new PlusThemedColor(null, null), new ShortcutAction("open debug panel", new PlusThemedColor(null, null), "", "", ActionType.DEBUG_PANEL, new PlusThemedColor(null, null)), false, new PlusThemedImage(null, null));
            case 28:
                _init_$_anonymous_ = PlusColor._init_$_anonymous_();
                return _init_$_anonymous_;
            default:
                _childSerializers$_anonymous_ = PlusColor.Gradient._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
        }
    }
}
