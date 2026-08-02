package androidx.camera.camera2.internal;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.camera.core.DynamicRange;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes3.dex */
public abstract class DynamicRangeConversions {
    public static final LinkedHashMap DR_TO_PROFILE_MAP;
    public static final LinkedHashMap PROFILE_TO_DR_MAP;

    static {
        DynamicRange dynamicRange;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PROFILE_TO_DR_MAP = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        DR_TO_PROFILE_MAP = linkedHashMap2;
        DynamicRange dynamicRange2 = DynamicRange.SDR;
        linkedHashMap.put(1L, dynamicRange2);
        linkedHashMap2.put(dynamicRange2, CollectionsKt__CollectionsJVMKt.listOf(1L));
        linkedHashMap.put(2L, DynamicRange.HLG_10_BIT);
        linkedHashMap2.put(linkedHashMap.get(2L), CollectionsKt__CollectionsJVMKt.listOf(2L));
        DynamicRange dynamicRange3 = DynamicRange.HDR10_10_BIT;
        linkedHashMap.put(4L, dynamicRange3);
        linkedHashMap2.put(dynamicRange3, CollectionsKt__CollectionsJVMKt.listOf(4L));
        DynamicRange dynamicRange4 = DynamicRange.HDR10_PLUS_10_BIT;
        linkedHashMap.put(8L, dynamicRange4);
        linkedHashMap2.put(dynamicRange4, CollectionsKt__CollectionsJVMKt.listOf(8L));
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Long[]{64L, 128L, 16L, 32L});
        Iterator it = listOf.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            dynamicRange = DynamicRange.DOLBY_VISION_10_BIT;
            if (!hasNext) {
                break;
            }
            PROFILE_TO_DR_MAP.put(Long.valueOf(((Number) it.next()).longValue()), dynamicRange);
        }
        DR_TO_PROFILE_MAP.put(dynamicRange, listOf);
        List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Long[]{1024L, 2048L, 256L, 512L});
        Iterator it2 = listOf2.iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            DynamicRange dynamicRange5 = DynamicRange.DOLBY_VISION_8_BIT;
            if (!hasNext2) {
                DR_TO_PROFILE_MAP.put(dynamicRange5, listOf2);
                return;
            } else {
                PROFILE_TO_DR_MAP.put(Long.valueOf(((Number) it2.next()).longValue()), dynamicRange5);
            }
        }
    }

    public static Long dynamicRangeToFirstSupportedProfile(DynamicRange dynamicRange, DynamicRangeProfiles dynamicRangeProfiles) {
        dynamicRange.getClass();
        dynamicRangeProfiles.getClass();
        List list = (List) DR_TO_PROFILE_MAP.get(dynamicRange);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        supportedProfiles.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            if (supportedProfiles.contains(Long.valueOf(longValue))) {
                return Long.valueOf(longValue);
            }
        }
        return null;
    }
}
