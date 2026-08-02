package com.alexvasilkov.gestures.utils;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Gravity;
import androidx.recyclerview.widget.RecyclerView;
import com.alexvasilkov.gestures.Settings;

/* loaded from: classes3.dex */
public abstract class GravityUtils {
    public static final Matrix tmpMatrix = new Matrix();
    public static final RectF tmpRectF = new RectF();
    public static final Rect tmpRect1 = new Rect();
    public static final Rect tmpRect2 = new Rect();

    public static void getDefaultPivot(Settings settings, Point point) {
        Rect rect = tmpRect2;
        getMovementAreaPosition(settings, rect);
        int i = settings.gravity;
        Rect rect2 = tmpRect1;
        Gravity.apply(i, 0, 0, rect, rect2);
        point.set(rect2.left, rect2.top);
    }

    public static void getImagePosition(Matrix matrix, Settings settings, Rect rect) {
        float f = settings.imageW;
        float f2 = settings.imageH;
        RectF rectF = tmpRectF;
        rectF.set(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f, f2);
        matrix.mapRect(rectF);
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        int i = settings.viewportW;
        int i2 = settings.viewportH;
        Rect rect2 = tmpRect1;
        rect2.set(0, 0, i, i2);
        Gravity.apply(settings.gravity, round, round2, rect2, rect);
    }

    public static void getMovementAreaPosition(Settings settings, Rect rect) {
        int i = settings.viewportW;
        int i2 = settings.viewportH;
        Rect rect2 = tmpRect1;
        rect2.set(0, 0, i, i2);
        int i3 = settings.gravity;
        boolean z = settings.isMovementAreaSpecified;
        Gravity.apply(i3, z ? settings.movementAreaW : settings.viewportW, z ? settings.movementAreaH : settings.viewportH, rect2, rect);
    }
}
