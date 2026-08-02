package defpackage;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public class qnc {
    public static int a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        ny61.g(oyr.i(i, "Invalid rotation: "));
        return 0;
    }

    public static void b(Point[] pointArr, Matrix matrix) {
        int length = pointArr.length;
        float[] fArr = new float[length + length];
        for (int i = 0; i < pointArr.length; i++) {
            Point point = pointArr[i];
            int i2 = i + i;
            fArr[i2] = point.x;
            fArr[i2 + 1] = point.y;
        }
        matrix.mapPoints(fArr);
        for (int i3 = 0; i3 < pointArr.length; i3++) {
            int i4 = i3 + i3;
            pointArr[i3].set((int) fArr[i4], (int) fArr[i4 + 1]);
        }
    }

    public static void c(ArrayList arrayList, Matrix matrix) {
        int size = arrayList.size();
        float[] fArr = new float[size + size];
        for (int i = 0; i < arrayList.size(); i++) {
            int i2 = i + i;
            fArr[i2] = ((PointF) arrayList.get(i)).x;
            fArr[i2 + 1] = ((PointF) arrayList.get(i)).y;
        }
        matrix.mapPoints(fArr);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int i4 = i3 + i3;
            ((PointF) arrayList.get(i3)).set(fArr[i4], fArr[i4 + 1]);
        }
    }

    public static void d(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
