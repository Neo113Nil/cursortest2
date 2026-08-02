package com.alexvasilkov.gestures.internal;

import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import com.alexvasilkov.gestures.Settings;
import com.alexvasilkov.gestures.State;

/* loaded from: classes3.dex */
public final class ZoomBounds {
    public static final Matrix tmpMatrix = new Matrix();
    public static final RectF tmpRectF = new RectF();
    public float fitZoom;
    public float maxZoom;
    public float minZoom;
    public final Settings settings;

    public ZoomBounds(Settings settings) {
        this.settings = settings;
    }

    public final void set(State state) {
        Settings settings = this.settings;
        float f = settings.imageW;
        float f2 = settings.imageH;
        boolean z = settings.isMovementAreaSpecified;
        float f3 = z ? settings.movementAreaW : settings.viewportW;
        float f4 = z ? settings.movementAreaH : settings.viewportH;
        if (f == RecyclerView.DECELERATION_RATE || f2 == RecyclerView.DECELERATION_RATE || f3 == RecyclerView.DECELERATION_RATE || f4 == RecyclerView.DECELERATION_RATE) {
            this.fitZoom = 1.0f;
            this.maxZoom = 1.0f;
            this.minZoom = 1.0f;
            return;
        }
        this.minZoom = settings.minZoom;
        this.maxZoom = settings.maxZoom;
        float f5 = state.rotation;
        if (!State.equals(f5, RecyclerView.DECELERATION_RATE)) {
            int i = settings.fitMethod;
            RectF rectF = tmpRectF;
            Matrix matrix = tmpMatrix;
            if (i == 4) {
                matrix.setRotate(-f5);
                rectF.set(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f3, f4);
                matrix.mapRect(rectF);
                f3 = rectF.width();
                f4 = rectF.height();
            } else {
                matrix.setRotate(f5);
                rectF.set(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f, f2);
                matrix.mapRect(rectF);
                f = rectF.width();
                f2 = rectF.height();
            }
        }
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(settings.fitMethod);
        if (ordinal == 0) {
            this.fitZoom = f3 / f;
        } else if (ordinal == 1) {
            this.fitZoom = f4 / f2;
        } else if (ordinal == 2) {
            this.fitZoom = Math.min(f3 / f, f4 / f2);
        } else if (ordinal != 3) {
            float f6 = this.minZoom;
            this.fitZoom = f6 > RecyclerView.DECELERATION_RATE ? f6 : 1.0f;
        } else {
            this.fitZoom = Math.max(f3 / f, f4 / f2);
        }
        if (this.minZoom <= RecyclerView.DECELERATION_RATE) {
            this.minZoom = this.fitZoom;
        }
        if (this.maxZoom <= RecyclerView.DECELERATION_RATE) {
            this.maxZoom = this.fitZoom;
        }
        float f7 = this.fitZoom;
        float f8 = this.maxZoom;
        if (f7 > f8) {
            if (settings.isFillViewport) {
                this.maxZoom = f7;
            } else {
                this.fitZoom = f8;
            }
        }
        float f9 = this.minZoom;
        float f10 = this.maxZoom;
        if (f9 > f10) {
            this.minZoom = f10;
        }
        float f11 = this.fitZoom;
        float f12 = this.minZoom;
        if (f11 < f12) {
            if (settings.isFillViewport) {
                this.minZoom = f11;
            } else {
                this.fitZoom = f12;
            }
        }
    }
}
