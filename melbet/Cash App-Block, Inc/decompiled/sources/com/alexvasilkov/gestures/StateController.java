package com.alexvasilkov.gestures;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.alexvasilkov.gestures.internal.MovementBounds;
import com.alexvasilkov.gestures.internal.ZoomBounds;
import com.alexvasilkov.gestures.utils.GravityUtils;
import com.alexvasilkov.gestures.utils.MathUtils;

/* loaded from: classes3.dex */
public final class StateController {
    public boolean isResetRequired = true;
    public final MovementBounds movBounds;
    public final Settings settings;
    public final ZoomBounds zoomBounds;
    public float zoomPatch;
    public static final State tmpState = new State();
    public static final Rect tmpRect = new Rect();
    public static final RectF tmpRectF = new RectF();
    public static final PointF tmpPointF = new PointF();

    public StateController(Settings settings) {
        this.settings = settings;
        this.zoomBounds = new ZoomBounds(settings);
        this.movBounds = new MovementBounds(settings);
    }

    public static float applyTranslationResilience(float f, float f2, float f3, float f4, float f5) {
        if (f5 != RecyclerView.DECELERATION_RATE) {
            float f6 = (f + f2) * 0.5f;
            float f7 = (f6 >= f3 || f >= f2) ? (f6 <= f4 || f <= f2) ? 0.0f : (f6 - f4) / f5 : (f3 - f6) / f5;
            if (f7 != RecyclerView.DECELERATION_RATE) {
                if (f7 > 1.0f) {
                    f7 = 1.0f;
                }
                return f - ((f - f2) * ((float) Math.sqrt(f7)));
            }
        }
        return f;
    }

    public final void applyZoomPatch(State state) {
        float f = this.zoomPatch;
        if (f > RecyclerView.DECELERATION_RATE) {
            state.set(state.x, state.y, state.zoom * f, state.rotation);
        }
    }

    public final boolean restrictStateBounds(State state, State state2, float f, float f2, boolean z, boolean z2, boolean z3) {
        float f3;
        float f4;
        Settings settings = this.settings;
        boolean z4 = false;
        if (settings.boundsDisableCount > 0) {
            return false;
        }
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            f3 = state.x;
            f4 = state.y;
        } else {
            f3 = f;
            f4 = f2;
        }
        if (z3 && settings.isRestrictRotation) {
            float round = Math.round(state.rotation / 90.0f) * 90.0f;
            if (!State.equals(round, state.rotation)) {
                Matrix matrix = state.matrix;
                float f5 = -state.rotation;
                State.nonNaN(round);
                State.nonNaN(f3);
                State.nonNaN(f4);
                matrix.postRotate(f5 + round, f3, f4);
                state.updateFromMatrix(false, true);
                z4 = true;
            }
        }
        ZoomBounds zoomBounds = this.zoomBounds;
        zoomBounds.set(state);
        float f6 = zoomBounds.minZoom;
        float f7 = zoomBounds.maxZoom;
        float f8 = z2 ? settings.overzoomFactor : 1.0f;
        float f9 = state.zoom;
        float f10 = f6 / f8;
        float f11 = f7 * f8;
        Matrix matrix2 = MathUtils.tmpMatrix;
        float max = Math.max(f10, Math.min(f9, f11));
        if (state2 != null) {
            float f12 = state2.zoom;
            if (f8 != 1.0f) {
                float f13 = (max >= f6 || max >= f12) ? (max <= f7 || max <= f12) ? 0.0f : (max - f7) / (f11 - f7) : (f6 - max) / (f6 - f10);
                if (f13 != RecyclerView.DECELERATION_RATE) {
                    max = CameraState$Type$EnumUnboxingLocalUtility.m(f12, max, (float) Math.sqrt(f13), max);
                }
            }
        }
        if (!State.equals(max, state.zoom)) {
            state.zoomTo(max, f3, f4);
            z4 = true;
        }
        float f14 = z ? settings.overscrollDistanceX : 0.0f;
        float f15 = z ? settings.overscrollDistanceY : 0.0f;
        MovementBounds movementBounds = this.movBounds;
        movementBounds.set(state);
        float f16 = state.x;
        float f17 = state.y;
        MovementBounds movementBounds2 = this.movBounds;
        PointF pointF = tmpPointF;
        movementBounds2.restrict(f16, f17, f14, f15, pointF);
        float f18 = f14;
        float f19 = f15;
        float f20 = pointF.x;
        float f21 = pointF.y;
        if (max < f6 && f8 > 1.0f) {
            float sqrt = (float) Math.sqrt((((max * f8) / f6) - 1.0f) / (f8 - 1.0f));
            movementBounds.restrict(f20, f21, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, pointF);
            float f22 = pointF.x;
            float f23 = pointF.y;
            f20 = CameraState$Type$EnumUnboxingLocalUtility.m(f20, f22, sqrt, f22);
            f21 = CameraState$Type$EnumUnboxingLocalUtility.m(f21, f23, sqrt, f23);
        }
        if (state2 != null) {
            RectF rectF = movementBounds.bounds;
            float f24 = movementBounds.boundsRotation;
            RectF rectF2 = tmpRectF;
            if (f24 == RecyclerView.DECELERATION_RATE) {
                rectF2.set(rectF);
            } else {
                Matrix matrix3 = MovementBounds.tmpMatrix;
                matrix3.setRotate(f24, movementBounds.boundsPivotX, movementBounds.boundsPivotY);
                matrix3.mapRect(rectF2, rectF);
            }
            f20 = applyTranslationResilience(f20, state2.x, rectF2.left, rectF2.right, f18);
            f21 = applyTranslationResilience(f21, state2.y, rectF2.top, rectF2.bottom, f19);
        }
        if (State.equals(f20, state.x) && State.equals(f21, state.y)) {
            return z4;
        }
        state.translateTo(f20, f21);
        return true;
    }

    public final boolean updateState(State state) {
        if (!this.isResetRequired) {
            restrictStateBounds(state, state, Float.NaN, Float.NaN, false, false, true);
            return false;
        }
        ZoomBounds zoomBounds = this.zoomBounds;
        zoomBounds.set(state);
        state.set(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, zoomBounds.fitZoom, RecyclerView.DECELERATION_RATE);
        Matrix matrix = GravityUtils.tmpMatrix;
        state.get(matrix);
        Settings settings = this.settings;
        GravityUtils.getImagePosition(matrix, settings, tmpRect);
        state.translateTo(r3.left, r3.top);
        boolean z = settings.imageW == 0 || settings.imageH == 0 || settings.viewportW == 0 || settings.viewportH == 0;
        this.isResetRequired = z;
        return !z;
    }
}
