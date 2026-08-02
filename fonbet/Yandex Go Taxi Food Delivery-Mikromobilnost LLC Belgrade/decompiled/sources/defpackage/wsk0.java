package defpackage;

import com.yandex.go.navigator.events.NavigatorTag;
import com.yandex.mapkit.road_events.EventTag;
import com.yandex.mapkit.styling.roadevents.R;
import java.util.LinkedHashMap;

/* loaded from: classes15.dex */
public final class wsk0 {
    public static LinkedHashMap a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 24;
        Integer num = null;
        linkedHashMap.put(EventTag.POLICE, new kg50(NavigatorTag.POLICE, R.drawable.event_poi_mobile_control, Integer.valueOf(R.drawable.event_pin_mobile_control), null, num, Integer.valueOf(v2h0.event_alt_mobile_control), i));
        linkedHashMap.put(EventTag.MOBILE_CONTROL, new kg50(NavigatorTag.MOBILE_CONTROL, R.drawable.event_poi_mobile_control, Integer.valueOf(R.drawable.event_pin_mobile_control), null, num, Integer.valueOf(v2h0.event_alt_mobile_control), i));
        linkedHashMap.put(EventTag.ROAD_MARKING_CONTROL, new kg50(NavigatorTag.ROAD_MARKING_CONTROL, R.drawable.event_poi_lane_control, Integer.valueOf(R.drawable.event_pin_lane_control), null, num, Integer.valueOf(v2h0.event_alt_lane_control), i));
        linkedHashMap.put(EventTag.CROSS_ROAD_CONTROL, new kg50(NavigatorTag.CROSS_ROAD_CONTROL, R.drawable.event_poi_cross_road_control, Integer.valueOf(R.drawable.event_pin_cross_road_control), null, num, Integer.valueOf(v2h0.event_alt_cross_road_control), i));
        linkedHashMap.put(EventTag.LANE_CONTROL, new kg50(NavigatorTag.LANE_CONTROL, R.drawable.event_poi_lane_control, Integer.valueOf(R.drawable.event_pin_lane_control), null, num, Integer.valueOf(v2h0.event_alt_lane_control), i));
        EventTag eventTag = EventTag.SPEED_CONTROL;
        NavigatorTag navigatorTag = NavigatorTag.SPEED_CONTROL;
        int i2 = R.drawable.event_pin_speed_control;
        Integer num2 = null;
        linkedHashMap.put(eventTag, new kg50(navigatorTag, R.drawable.event_poi_speed_control, Integer.valueOf(i2), num2, num, Integer.valueOf(v2h0.ic_event_alt_camera), i));
        linkedHashMap.put(EventTag.ACCIDENT, new kg50(NavigatorTag.ACCIDENT, R.drawable.event_poi_accident, Integer.valueOf(R.drawable.event_pin_accident), null, num, Integer.valueOf(v2h0.ic_event_alt_accident), i));
        linkedHashMap.put(EventTag.RECONSTRUCTION, new kg50(NavigatorTag.RECONSTRUCTION, R.drawable.event_poi_reconstruction, Integer.valueOf(R.drawable.event_pin_reconstruction), Integer.valueOf(R.drawable.event_poi_reconstruction_future), Integer.valueOf(R.drawable.event_pin_reconstruction_future), Integer.valueOf(v2h0.ic_event_alt_reconstruction)));
        Integer num3 = null;
        int i3 = 56;
        Integer num4 = null;
        Integer num5 = null;
        linkedHashMap.put(EventTag.OTHER, new kg50(NavigatorTag.OTHER, R.drawable.event_poi_other, Integer.valueOf(R.drawable.event_pin_other), num4, num5, num3, i3));
        linkedHashMap.put(EventTag.CHAT, new kg50(NavigatorTag.CHAT, R.drawable.event_poi_chat, Integer.valueOf(R.drawable.event_pin_chat), num4, num5, num3, i3));
        linkedHashMap.put(EventTag.LOCAL_CHAT, new kg50(NavigatorTag.LOCAL_CHAT, R.drawable.event_poi_chat, Integer.valueOf(R.drawable.event_pin_chat), num4, num5, num3, i3));
        int i4 = 32;
        linkedHashMap.put(EventTag.DRAWBRIDGE, new kg50(NavigatorTag.DRAWBRIDGE, R.drawable.event_poi_drawbridge, Integer.valueOf(R.drawable.event_pin_drawbridge), Integer.valueOf(R.drawable.event_poi_drawbridge_future), Integer.valueOf(R.drawable.event_pin_drawbridge_future), num3, i4));
        linkedHashMap.put(EventTag.CLOSED, new kg50(NavigatorTag.CLOSED, R.drawable.event_poi_closed, Integer.valueOf(R.drawable.event_pin_closed), Integer.valueOf(R.drawable.event_poi_closed_future), Integer.valueOf(R.drawable.event_pin_closed_future), num3, i4));
        int i5 = 56;
        Integer num6 = null;
        Integer num7 = null;
        linkedHashMap.put(EventTag.DANGER, new kg50(NavigatorTag.DANGER, R.drawable.event_poi_danger, Integer.valueOf(R.drawable.event_pin_danger), num6, num7, num3, i5));
        linkedHashMap.put(EventTag.SCHOOL, new kg50(NavigatorTag.SCHOOL, R.drawable.event_poi_school, Integer.valueOf(R.drawable.event_pin_school), num6, num7, num3, i5));
        linkedHashMap.put(EventTag.OVERTAKING_DANGER, new kg50(NavigatorTag.OVERTAKING_DANGER, v2h0.ic_event_poi_overtaking_danger, Integer.valueOf(v2h0.ic_event_pin_overtaking_danger), num6, num7, num3, i5));
        linkedHashMap.put(EventTag.PEDESTRIAN_DANGER, new kg50(NavigatorTag.PEDESTRIAN_DANGER, R.drawable.event_poi_school, Integer.valueOf(R.drawable.event_pin_school), num6, num7, num3, i5));
        linkedHashMap.put(EventTag.CROSS_ROAD_DANGER, new kg50(NavigatorTag.CROSS_ROAD_DANGER, R.drawable.event_poi_cross_road_control, Integer.valueOf(R.drawable.event_pin_cross_road_control), null, num7, Integer.valueOf(v2h0.event_alt_cross_road_control), 24));
        return linkedHashMap;
    }
}
