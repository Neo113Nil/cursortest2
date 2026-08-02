package com.squareup.cash.card.onboarding;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cardcustomizations.signature.SavedSignature;
import com.squareup.cardcustomizations.stampview.Stamp;
import com.squareup.cardcustomizations.stampview.TransformedStamp;
import com.squareup.protos.franklin.cards.TouchData;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes6.dex */
public abstract class TouchdatasKt {
    public static TouchData createLandscapeTouchData$default(SavedSignature savedSignature, List list) {
        float f = savedSignature.width;
        float f2 = savedSignature.height;
        list.getClass();
        TouchData createTouchData = createTouchData(savedSignature, list, f, f2);
        Float f3 = createTouchData.width;
        f3.getClass();
        float floatValue = f3.floatValue();
        Float f4 = createTouchData.height;
        Float f5 = createTouchData.width;
        List<TouchData.Stroke> list2 = createTouchData.strokes;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (TouchData.Stroke stroke : list2) {
            List<TouchData.Point> list3 = stroke.points;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            for (TouchData.Point point : list3) {
                Float f6 = point.y_coordinate;
                f6.getClass();
                Float f7 = point.x_coordinate;
                f7.getClass();
                arrayList2.add(TouchData.Point.copy$default(point, f6, Float.valueOf(floatValue - f7.floatValue()), null, null, 12, null));
            }
            arrayList.add(TouchData.Stroke.copy$default(stroke, arrayList2, null, 2, null));
        }
        List<TouchData.StampCustomization> list4 = createTouchData.stamps;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
        for (TouchData.StampCustomization stampCustomization : list4) {
            Float f8 = stampCustomization.rotation;
            float floatValue2 = (f8 != null ? f8.floatValue() : 0.0f) - 1.5707964f;
            TouchData.Point point2 = stampCustomization.center;
            point2.getClass();
            TouchData.Point point3 = stampCustomization.center;
            point3.getClass();
            Float f9 = point3.y_coordinate;
            f9.getClass();
            TouchData.Point point4 = stampCustomization.center;
            point4.getClass();
            Float f10 = point4.x_coordinate;
            f10.getClass();
            TouchData.Point copy$default = TouchData.Point.copy$default(point2, f9, Float.valueOf(floatValue - f10.floatValue()), null, null, 12, null);
            if (floatValue2 < RecyclerView.DECELERATION_RATE) {
                floatValue2 += 6.2831855f;
            }
            arrayList3.add(TouchData.StampCustomization.copy$default(stampCustomization, null, copy$default, null, null, Float.valueOf(floatValue2), null, 45, null));
        }
        return TouchData.copy$default(createTouchData, f4, f5, arrayList, arrayList3, null, 16);
    }

    public static final TouchData createTouchData(SavedSignature savedSignature, List list, float f, float f2) {
        Long valueOf;
        list.getClass();
        float[][][] fArr = savedSignature.glyphs;
        int i = 0;
        char c = 1;
        if (fArr.length == 0) {
            valueOf = null;
        } else {
            float[][] fArr2 = fArr[0];
            if (fArr2.length == 0) {
                a$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            Long valueOf2 = Long.valueOf((long) fArr2[0][2]);
            int length = fArr2.length - 1;
            if (1 <= length) {
                int i2 = 1;
                while (true) {
                    Long valueOf3 = Long.valueOf((long) fArr2[i2][2]);
                    if (valueOf2.compareTo(valueOf3) > 0) {
                        valueOf2 = valueOf3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            valueOf = Long.valueOf(valueOf2.longValue());
            int length2 = fArr.length - 1;
            if (1 <= length2) {
                int i3 = 1;
                while (true) {
                    float[][] fArr3 = fArr[i3];
                    if (fArr3.length == 0) {
                        a$$ExternalSyntheticBUOutline0.m();
                        return null;
                    }
                    long j = (long) fArr3[0][2];
                    int length3 = fArr3.length - 1;
                    if (1 <= length3) {
                        int i4 = 1;
                        while (true) {
                            long j2 = (long) fArr3[i4][2];
                            if (j > j2) {
                                j = j2;
                            }
                            if (i4 == length3) {
                                break;
                            }
                            i4++;
                        }
                    }
                    Long valueOf4 = Long.valueOf(j);
                    if (valueOf.compareTo(valueOf4) > 0) {
                        valueOf = valueOf4;
                    }
                    if (i3 == length2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        long longValue = valueOf != null ? valueOf.longValue() : 0L;
        Float valueOf5 = Float.valueOf(f);
        Float valueOf6 = Float.valueOf(f2);
        ArrayList arrayList = new ArrayList(fArr.length);
        int length4 = fArr.length;
        int i5 = 0;
        while (true) {
            float f3 = RecyclerView.DECELERATION_RATE;
            if (i5 >= length4) {
                break;
            }
            float[][] fArr4 = fArr[i5];
            ArrayList arrayList2 = new ArrayList(fArr4.length);
            int length5 = fArr4.length;
            int i6 = i;
            while (i < length5) {
                float[] fArr5 = fArr4[i];
                arrayList2.add(new TouchData.Point(Float.valueOf(fArr5[i6] - f3), Float.valueOf(fArr5[c] - f3), Long.valueOf(((long) fArr5[2]) - longValue), null, 8, null));
                i++;
                fArr4 = fArr4;
                c = c;
                f3 = RecyclerView.DECELERATION_RATE;
            }
            arrayList.add(new TouchData.Stroke(arrayList2, null, 2, null));
            i5++;
            i = i6;
        }
        int i7 = i;
        char c2 = c;
        List<TransformedStamp> list2 = list;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (TransformedStamp transformedStamp : list2) {
            Stamp stamp = transformedStamp.renderedStamp;
            Matrix matrix = transformedStamp.transform;
            RectF canvasBounds = stamp.getCanvasBounds();
            PointF mapPoint = mapPoint(matrix, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            PointF mapPoint2 = mapPoint(matrix, canvasBounds.width(), RecyclerView.DECELERATION_RATE);
            PointF mapPoint3 = mapPoint(matrix, RecyclerView.DECELERATION_RATE, canvasBounds.height());
            PointF mapPoint4 = mapPoint(matrix, canvasBounds.width() / 2.0f, canvasBounds.height() / 2.0f);
            float distance = OnBackPressedDispatcherKt.distance(mapPoint, mapPoint2);
            float distance2 = OnBackPressedDispatcherKt.distance(mapPoint, mapPoint3);
            String str = transformedStamp.renderedStamp.name;
            TouchData.Point point = new TouchData.Point(Float.valueOf(mapPoint4.x - RecyclerView.DECELERATION_RATE), Float.valueOf(mapPoint4.y - RecyclerView.DECELERATION_RATE), null, null, 12, null);
            Float valueOf7 = Float.valueOf(distance);
            Float valueOf8 = Float.valueOf(distance2);
            matrix.getValues(new float[9]);
            float f4 = -((float) Math.atan2(r1[c2], r1[i7]));
            if (f4 < RecyclerView.DECELERATION_RATE) {
                f4 += 6.2831855f;
            }
            arrayList3.add(new TouchData.StampCustomization(str, point, valueOf7, valueOf8, Float.valueOf(f4), null, 32, null));
        }
        return new TouchData(valueOf5, valueOf6, arrayList, arrayList3, 16);
    }

    public static final PointF mapPoint(Matrix matrix, float f, float f2) {
        float[] fArr = {f, f2};
        matrix.mapPoints(fArr);
        return new PointF(fArr[0], fArr[1]);
    }
}
