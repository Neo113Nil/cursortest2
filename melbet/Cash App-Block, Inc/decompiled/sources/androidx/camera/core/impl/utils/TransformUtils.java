package androidx.camera.core.impl.utils;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class TransformUtils {
    public static final RectF NORMALIZED_RECT = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix getRectToRect(RectF rectF, RectF rectF2, int i, boolean z) {
        Matrix matrix = new Matrix();
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        RectF rectF3 = NORMALIZED_RECT;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate(i);
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static int getRotationDegrees(Matrix matrix) {
        matrix.getValues(new float[9]);
        return within360((int) Math.round(Math.atan2(r0[3], r0[0]) * 57.29577951308232d));
    }

    public static boolean hasCropping(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean is90or270(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Invalid rotation degrees: "));
        return false;
    }

    public static boolean isAspectRatioMatchingWithRoundingError(Size size, boolean z, Size size2) {
        float width;
        float width2;
        if (z) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        return width >= (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) && (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f) >= width2;
    }

    public static boolean isMirrored(Matrix matrix) {
        float[] fArr = {RecyclerView.DECELERATION_RATE, 1.0f, 1.0f, RecyclerView.DECELERATION_RATE};
        matrix.mapVectors(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = (f2 * f4) + (f * f3);
        float f6 = (f * f4) - (f2 * f3);
        double sqrt = Math.sqrt((f2 * f2) + (f * f)) * Math.sqrt((f4 * f4) + (f3 * f3));
        return ((float) Math.toDegrees(Math.atan2(((double) f6) / sqrt, ((double) f5) / sqrt))) > RecyclerView.DECELERATION_RATE;
    }

    public static Size rectToSize(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static String rectToString(Rect rect) {
        Locale locale = Locale.US;
        return rect + "(" + rect.width() + "x" + rect.height() + ")";
    }

    public static Size rotateSize(int i, Size size) {
        TransactorKt.checkArgument("Invalid rotation degrees: " + i, i % 90 == 0);
        return is90or270(within360(i)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static RectF sizeToRectF(Size size) {
        return new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, size.getWidth(), size.getHeight());
    }

    public static int within360(int i) {
        return ((i % 360) + 360) % 360;
    }
}
