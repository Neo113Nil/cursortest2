package androidx.camera.video;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.internal.utils.SizeUtil;
import com.plaid.internal.EnumC0170g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class QualityRatioToResolutionsTable {
    public static final HashMap sAspectRatioMap;
    public static final HashMap sQualityRangeMap;
    public final HashMap mTable = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        sQualityRangeMap = hashMap;
        hashMap.put(AutoValue_Quality_ConstantQuality.UHD, Range.create(2160, 4319));
        hashMap.put(AutoValue_Quality_ConstantQuality.FHD, Range.create(1080, 1439));
        hashMap.put(AutoValue_Quality_ConstantQuality.HD, Range.create(720, 1079));
        hashMap.put(AutoValue_Quality_ConstantQuality.SD, Range.create(Integer.valueOf(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE), 719));
        HashMap hashMap2 = new HashMap();
        sAspectRatioMap = hashMap2;
        hashMap2.put(0, AspectRatioUtil.ASPECT_RATIO_4_3);
        hashMap2.put(1, AspectRatioUtil.ASPECT_RATIO_16_9);
    }

    public QualityRatioToResolutionsTable(List list, HashMap hashMap) {
        HashMap hashMap2;
        Integer num;
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality;
        HashMap hashMap3 = sQualityRangeMap;
        Iterator it = hashMap3.keySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap2 = sAspectRatioMap;
            if (!hasNext) {
                break;
            }
            AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality2 = (AutoValue_Quality_ConstantQuality) it.next();
            this.mTable.put(new AutoValue_QualityRatioToResolutionsTable_QualityRatio(autoValue_Quality_ConstantQuality2, -1), new ArrayList());
            Iterator it2 = hashMap2.keySet().iterator();
            while (it2.hasNext()) {
                this.mTable.put(new AutoValue_QualityRatioToResolutionsTable_QualityRatio(autoValue_Quality_ConstantQuality2, ((Integer) it2.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list2 = (List) this.mTable.get(new AutoValue_QualityRatioToResolutionsTable_QualityRatio((AutoValue_Quality_ConstantQuality) entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add((Size) entry.getValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Size size = (Size) it3.next();
            Iterator it4 = hashMap3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    autoValue_Quality_ConstantQuality = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains((Range) Integer.valueOf(size.getHeight()))) {
                    autoValue_Quality_ConstantQuality = (AutoValue_Quality_ConstantQuality) entry2.getKey();
                    break;
                }
            }
            if (autoValue_Quality_ConstantQuality != null) {
                Iterator it5 = hashMap2.entrySet().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it5.next();
                    if (AspectRatioUtil.hasMatchingAspectRatio(size, (Rational) entry3.getValue(), SizeUtil.RESOLUTION_QVGA)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.mTable.get(new AutoValue_QualityRatioToResolutionsTable_QualityRatio(autoValue_Quality_ConstantQuality, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.mTable.entrySet()) {
            Size size2 = (Size) hashMap.get(((AutoValue_QualityRatioToResolutionsTable_QualityRatio) entry4.getKey()).quality);
            if (size2 != null) {
                Size size3 = SizeUtil.RESOLUTION_ZERO;
                final int height = size2.getHeight() * size2.getWidth();
                Collections.sort((List) entry4.getValue(), new Comparator() { // from class: androidx.camera.video.QualityRatioToResolutionsTable$$ExternalSyntheticLambda0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int area = SizeUtil.getArea((Size) obj);
                        int i = height;
                        return Math.abs(area - i) - Math.abs(SizeUtil.getArea((Size) obj2) - i);
                    }
                });
            }
        }
    }
}
