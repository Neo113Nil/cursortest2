package com.squareup.cash.card.onboarding;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cardcustomizations.signature.Signature;
import com.squareup.cardcustomizations.stampview.TransformedStamp;
import com.squareup.protos.franklin.cards.TouchData;
import com.squareup.protos.franklin.common.Stamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class CustomizationDetailsExtensionsKt {
    public static final Bitmap toBitmap(CustomizationDetails customizationDetails, int i, int i2) {
        customizationDetails.getClass();
        float f = customizationDetails.width;
        float f2 = customizationDetails.height;
        if (f == RecyclerView.DECELERATION_RATE || f2 == RecyclerView.DECELERATION_RATE) {
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            createBitmap.getClass();
            return createBitmap;
        }
        Matrix matrix = new Matrix();
        RectF rectF = new RectF();
        rectF.right = f;
        rectF.bottom = f2;
        RectF rectF2 = new RectF();
        float f3 = i;
        rectF2.right = f3;
        rectF2.bottom = i2;
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
        Signature signature = new Signature(i, i2, f3 * 0.00525f, -16777216, new CustomizationDetailsExtensionsKt$toBitmap$signature$1());
        float[] fArr = {RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
        for (TouchData.Stroke stroke : customizationDetails.strokes) {
            signature.startGlyph();
            for (TouchData.Point point : stroke.points) {
                Float f4 = point.x_coordinate;
                f4.getClass();
                fArr[0] = f4.floatValue();
                Float f5 = point.y_coordinate;
                f5.getClass();
                fArr[1] = f5.floatValue();
                matrix.mapPoints(fArr);
                float f6 = fArr[0];
                float f7 = fArr[1];
                Long l = point.created_at;
                l.getClass();
                signature.extendGlyph(f6, f7, l.longValue());
            }
            signature.finishGlyph();
        }
        List<StampDetails> list = customizationDetails.stamps;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (StampDetails stampDetails : list) {
            Stamp stamp = stampDetails.stamp;
            TouchData.StampCustomization stampCustomization = stampDetails.customization;
            TouchData.Point point2 = stampCustomization.center;
            point2.getClass();
            Float f8 = point2.x_coordinate;
            f8.getClass();
            float floatValue = f8.floatValue();
            TouchData.Point point3 = stampCustomization.center;
            point3.getClass();
            Float f9 = point3.y_coordinate;
            f9.getClass();
            float floatValue2 = f9.floatValue();
            Float f10 = stampCustomization.width;
            f10.getClass();
            float floatValue3 = f10.floatValue();
            Float f11 = stampCustomization.height;
            f11.getClass();
            float floatValue4 = f11.floatValue();
            String str = stamp.name;
            str.getClass();
            String str2 = stamp.svg;
            str2.getClass();
            com.squareup.cardcustomizations.stampview.Stamp stamp2 = new com.squareup.cardcustomizations.stampview.Stamp(str, str2);
            Matrix matrix2 = new Matrix();
            matrix2.setTranslate(floatValue - stamp2.getCanvasBounds().centerX(), floatValue2 - stamp2.getCanvasBounds().centerY());
            matrix2.postScale(floatValue3 / stamp2.getCanvasBounds().width(), floatValue4 / stamp2.getCanvasBounds().width(), floatValue, floatValue2);
            stampCustomization.rotation.getClass();
            matrix2.postRotate((float) Math.toDegrees(r13.floatValue()), floatValue, floatValue2);
            matrix2.postConcat(matrix);
            stamp.min_scale.getClass();
            arrayList.add(new TransformedStamp(stamp2, matrix2, r0.intValue() / 100.0f));
        }
        Bitmap bitmap = signature.getBitmap();
        Canvas canvas = new Canvas(bitmap);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TransformedStamp transformedStamp = (TransformedStamp) it.next();
            Matrix matrix3 = transformedStamp.transform;
            Paint paint = signature.bitmapPaint;
            paint.getClass();
            matrix3.getClass();
            com.squareup.cardcustomizations.stampview.Stamp stamp3 = transformedStamp.renderedStamp;
            stamp3.getClass();
            Path path = stamp3.path;
            if (path == null) {
                Intrinsics.throwUninitializedPropertyAccessException("path");
                throw null;
            }
            Path path2 = stamp3.renderedPath;
            path.transform(matrix3, path2);
            canvas.drawPath(path2, paint);
        }
        return bitmap;
    }
}
