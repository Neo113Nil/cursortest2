package com.alexvasilkov.gestures.internal;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import com.alexvasilkov.gestures.Settings;
import com.alexvasilkov.gestures.State;
import com.alexvasilkov.gestures.utils.GravityUtils;
import com.alexvasilkov.gestures.utils.MathUtils;

/* loaded from: classes3.dex */
public final class MovementBounds {
    public final RectF bounds = new RectF();
    public float boundsPivotX;
    public float boundsPivotY;
    public float boundsRotation;
    public final Settings settings;
    public static final Matrix tmpMatrix = new Matrix();
    public static final float[] tmpPointArr = new float[2];
    public static final Point tmpPoint = new Point();
    public static final Rect tmpRect = new Rect();
    public static final RectF tmpRectF = new RectF();

    public MovementBounds(Settings settings) {
        this.settings = settings;
    }

    public final void restrict(float f, float f2, float f3, float f4, PointF pointF) {
        float[] fArr = tmpPointArr;
        fArr[0] = f;
        fArr[1] = f2;
        float f5 = this.boundsRotation;
        Matrix matrix = tmpMatrix;
        if (f5 != RecyclerView.DECELERATION_RATE) {
            matrix.setRotate(-f5, this.boundsPivotX, this.boundsPivotY);
            matrix.mapPoints(fArr);
        }
        float f6 = fArr[0];
        RectF rectF = this.bounds;
        float f7 = rectF.left - f3;
        float f8 = rectF.right + f3;
        Matrix matrix2 = MathUtils.tmpMatrix;
        fArr[0] = Math.max(f7, Math.min(f6, f8));
        fArr[1] = Math.max(rectF.top - f4, Math.min(fArr[1], rectF.bottom + f4));
        float f9 = this.boundsRotation;
        if (f9 != RecyclerView.DECELERATION_RATE) {
            matrix.setRotate(f9, this.boundsPivotX, this.boundsPivotY);
            matrix.mapPoints(fArr);
        }
        pointF.set(fArr[0], fArr[1]);
    }

    public final void set(State state) {
        Settings settings = this.settings;
        Rect rect = tmpRect;
        GravityUtils.getMovementAreaPosition(settings, rect);
        RectF rectF = tmpRectF;
        rectF.set(rect);
        int i = settings.fitMethod;
        Matrix matrix = tmpMatrix;
        if (i == 4) {
            this.boundsRotation = state.rotation;
            this.boundsPivotX = rectF.centerX();
            this.boundsPivotY = rectF.centerY();
            if (!State.equals(this.boundsRotation, RecyclerView.DECELERATION_RATE)) {
                matrix.setRotate(-this.boundsRotation, this.boundsPivotX, this.boundsPivotY);
                matrix.mapRect(rectF);
            }
        } else {
            this.boundsRotation = RecyclerView.DECELERATION_RATE;
            this.boundsPivotY = RecyclerView.DECELERATION_RATE;
            this.boundsPivotX = RecyclerView.DECELERATION_RATE;
        }
        state.get(matrix);
        if (!State.equals(this.boundsRotation, RecyclerView.DECELERATION_RATE)) {
            matrix.postRotate(-this.boundsRotation, this.boundsPivotX, this.boundsPivotY);
        }
        GravityUtils.getImagePosition(matrix, settings, rect);
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(settings.boundsType);
        float[] fArr = tmpPointArr;
        RectF rectF2 = this.bounds;
        if (ordinal == 0) {
            if (rectF.width() < rect.width()) {
                rectF2.left = rectF.left - (rect.width() - rectF.width());
                rectF2.right = rectF.left;
            } else {
                float f = rect.left;
                rectF2.right = f;
                rectF2.left = f;
            }
            if (rectF.height() < rect.height()) {
                rectF2.top = rectF.top - (rect.height() - rectF.height());
                rectF2.bottom = rectF.top;
            } else {
                float f2 = rect.top;
                rectF2.bottom = f2;
                rectF2.top = f2;
            }
        } else if (ordinal == 1) {
            float width = rectF.width();
            float width2 = rect.width();
            float f3 = rectF.left;
            if (width < width2) {
                rectF2.left = f3 - (rect.width() - rectF.width());
                rectF2.right = rectF.left;
            } else {
                rectF2.left = f3;
                rectF2.right = rectF.right - rect.width();
            }
            float height = rectF.height();
            float height2 = rect.height();
            float f4 = rectF.top;
            if (height < height2) {
                rectF2.top = f4 - (rect.height() - rectF.height());
                rectF2.bottom = rectF.top;
            } else {
                rectF2.top = f4;
                rectF2.bottom = rectF.bottom - rect.height();
            }
        } else if (ordinal == 2) {
            rectF2.left = rectF.left - rect.width();
            rectF2.right = rectF.right;
            rectF2.top = rectF.top - rect.height();
            rectF2.bottom = rectF.bottom;
        } else if (ordinal != 3) {
            rectF2.set(-5.368709E8f, -5.368709E8f, 5.368709E8f, 5.368709E8f);
        } else {
            GravityUtils.getDefaultPivot(settings, tmpPoint);
            fArr[0] = r3.x;
            fArr[1] = r3.y;
            if (!State.equals(this.boundsRotation, RecyclerView.DECELERATION_RATE)) {
                matrix.setRotate(-this.boundsRotation, this.boundsPivotX, this.boundsPivotY);
                matrix.mapPoints(fArr);
            }
            rectF2.left = fArr[0] - rect.width();
            rectF2.right = fArr[0];
            rectF2.top = fArr[1] - rect.height();
            rectF2.bottom = fArr[1];
        }
        if (settings.fitMethod != 4) {
            matrix.set(state.matrix);
            rectF.set(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, settings.imageW, settings.imageH);
            matrix.mapRect(rectF);
            fArr[1] = 0.0f;
            fArr[0] = 0.0f;
            matrix.mapPoints(fArr);
            rectF2.offset(fArr[0] - rectF.left, fArr[1] - rectF.top);
        }
    }
}
