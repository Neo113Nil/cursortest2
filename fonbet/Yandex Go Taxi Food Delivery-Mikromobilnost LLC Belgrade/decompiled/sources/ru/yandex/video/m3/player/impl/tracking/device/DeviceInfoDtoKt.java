package ru.yandex.video.m3.player.impl.tracking.device;

import defpackage.g8e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0001H\u0082\u0010\u001a\u001c\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0002`\u0006*\u00020\u0007*&\u0010\b\"\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¨\u0006\t"}, d2 = {"createUniqueKey", "", "", "", "key", "toDeviceInfoDto", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoDto;", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfo;", "DeviceInfoDto", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeviceInfoDtoKt {
    private static final String createUniqueKey(Map<String, ? extends Object> map, String str) {
        while (map.containsKey(str)) {
            str = g8e.o("_", str);
        }
        return str;
    }

    public static final Map<String, Object> toDeviceInfoDto(DeviceInfo deviceInfo) {
        Set<Map.Entry<String, Object>> entrySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap(deviceInfo.getProperties());
        Map<String, Object> customInfo = deviceInfo.getCustomInfo();
        linkedHashMap.remove("customInfo");
        if (customInfo != null && (entrySet = customInfo.entrySet()) != null) {
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(createUniqueKey(linkedHashMap, (String) entry.getKey()), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (entry2.getValue() != null) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap2;
    }
}
