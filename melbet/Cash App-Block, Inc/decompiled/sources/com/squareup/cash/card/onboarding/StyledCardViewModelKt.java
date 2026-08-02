package com.squareup.cash.card.onboarding;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.protos.franklin.cards.TouchData;
import com.squareup.protos.franklin.common.Stamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import timber.log.Timber;

/* loaded from: classes6.dex */
public abstract class StyledCardViewModelKt {
    public static final CustomizationDetails toCustomizationDetails(TouchData touchData, Map map) {
        StampDetails stampDetails;
        touchData.getClass();
        map.getClass();
        Float f = touchData.width;
        f.getClass();
        float floatValue = f.floatValue();
        Float f2 = touchData.height;
        f2.getClass();
        float floatValue2 = f2.floatValue();
        List<TouchData.Stroke> list = touchData.strokes;
        List<TouchData.StampCustomization> list2 = touchData.stamps;
        ArrayList arrayList = new ArrayList();
        for (TouchData.StampCustomization stampCustomization : list2) {
            if (map.get(stampCustomization.identifier) == null) {
                Timber.Forest.e("Stamp id:" + stampCustomization.identifier + " is not in StampConfig. StampConfig size is " + map.size(), new Object[0]);
                stampDetails = null;
            } else {
                Object obj = map.get(stampCustomization.identifier);
                obj.getClass();
                stampDetails = new StampDetails((Stamp) obj, stampCustomization);
            }
            if (stampDetails != null) {
                arrayList.add(stampDetails);
            }
        }
        return new CustomizationDetails(floatValue, floatValue2, list, arrayList);
    }

    public static final CustomizationDetails toPortraitCustomizationDetails(TouchData touchData, Map map) {
        touchData.getClass();
        map.getClass();
        Float f = touchData.height;
        f.getClass();
        float floatValue = f.floatValue();
        Float f2 = touchData.height;
        Float f3 = touchData.width;
        List<TouchData.Stroke> list = touchData.strokes;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (TouchData.Stroke stroke : list) {
            List<TouchData.Point> list2 = stroke.points;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (TouchData.Point point : list2) {
                Float f4 = point.y_coordinate;
                f4.getClass();
                Float valueOf = Float.valueOf(floatValue - f4.floatValue());
                Float f5 = point.x_coordinate;
                f5.getClass();
                arrayList2.add(TouchData.Point.copy$default(point, valueOf, f5, null, null, 12, null));
            }
            arrayList.add(TouchData.Stroke.copy$default(stroke, arrayList2, null, 2, null));
        }
        List<TouchData.StampCustomization> list3 = touchData.stamps;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        for (TouchData.StampCustomization stampCustomization : list3) {
            TouchData.Point point2 = stampCustomization.center;
            point2.getClass();
            TouchData.Point point3 = stampCustomization.center;
            point3.getClass();
            Float f6 = point3.y_coordinate;
            f6.getClass();
            Float valueOf2 = Float.valueOf(floatValue - f6.floatValue());
            TouchData.Point point4 = stampCustomization.center;
            point4.getClass();
            Float f7 = point4.x_coordinate;
            f7.getClass();
            TouchData.Point copy$default = TouchData.Point.copy$default(point2, valueOf2, f7, null, null, 12, null);
            Float f8 = stampCustomization.rotation;
            arrayList3.add(TouchData.StampCustomization.copy$default(stampCustomization, null, copy$default, null, null, Float.valueOf(((f8 != null ? f8.floatValue() : RecyclerView.DECELERATION_RATE) + 1.5707964f) % 6.2831855f), null, 45, null));
        }
        return toCustomizationDetails(TouchData.copy$default(touchData, f2, f3, arrayList, arrayList3, null, 16), map);
    }
}
