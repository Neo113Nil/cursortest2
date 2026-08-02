package com.google.android.gms.internal.mlkit_genai_prompt;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.RequestQueue;
import com.squareup.cash.graphics.backend.math.Matrix4;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.graphics.swampgl.components.AABB;
import com.squareup.cash.graphics.swampgl.components.Entity;
import kotlin.Pair;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public abstract class zzahe {
    public static final Rect getCharSequenceBounds(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    textPaint2.getTextBounds(charSequence, i, nextSpanTransition, rect2);
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        textPaint.getTextBounds(charSequence, i, i2, rect3);
        return rect3;
    }

    public static final Vector4 touchToLocalRay$touchToWorldCoordinate(float f, float f2, float f3, float f4, RequestQueue requestQueue, Matrix4 matrix4, Matrix4 matrix42, float f5) {
        float[] fArr = {((f / f2) * 2.0f) - 1.0f, (((f3 - f4) / f3) * 2.0f) - 1.0f, (((f5 - requestQueue.getNear()) / (((Number) ((StateFlowImpl) requestQueue.mNetwork).getValue()).floatValue() - requestQueue.getNear())) * 2.0f) - 1.0f, 1.0f};
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.invertM(fArr2, 0, matrix4.matrix, 0);
        float[] fArr3 = new float[4];
        Matrix.multiplyMV(fArr3, 0, fArr2, 0, fArr, 0);
        float f6 = fArr3[0];
        float f7 = fArr3[3];
        Vector4 vector4 = new Vector4(f6 / f7, fArr3[1] / f7, fArr3[2] / f7, 1.0f);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        Matrix.invertM(fArr4, 0, matrix42.matrix, 0);
        float[] fArr5 = new float[4];
        Matrix.multiplyMV(fArr5, 0, fArr4, 0, vector4.vector, 0);
        return new Vector4(fArr5);
    }

    public static final Pair touchToTextureUV(RequestQueue requestQueue, float f, float f2, float f3, float f4, Entity entity) {
        requestQueue.getClass();
        AABB aabb = entity.geometry.getAABB();
        float[] computeModelMatrix = entity.transform.computeModelMatrix();
        Matrix4 matrix4 = new Matrix4((float[]) requestQueue.mEventListeners);
        Matrix4 matrix42 = new Matrix4((float[]) requestQueue.mFinishedListeners);
        Vector4 vector4 = touchToLocalRay$touchToWorldCoordinate(f, f3, f4, f2, requestQueue, matrix4, matrix42, requestQueue.getNear());
        Vector4 vector42 = touchToLocalRay$touchToWorldCoordinate(f, f3, f4, f2, requestQueue, matrix4, matrix42, ((Number) ((StateFlowImpl) requestQueue.mNetwork).getValue()).floatValue());
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.invertM(fArr, 0, computeModelMatrix, 0);
        float[] fArr2 = new float[4];
        Matrix.multiplyMV(fArr2, 0, fArr, 0, vector4.vector, 0);
        Vector4 vector43 = new Vector4(fArr2);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        Matrix.invertM(fArr3, 0, computeModelMatrix, 0);
        float[] fArr4 = new float[4];
        Matrix.multiplyMV(fArr4, 0, fArr3, 0, vector42.vector, 0);
        Vector4 vector44 = new Vector4(fArr4);
        float[] fArr5 = vector43.vector;
        float f5 = fArr5[1];
        float f6 = f5 - RecyclerView.DECELERATION_RATE;
        float[] fArr6 = vector44.vector;
        float f7 = f6 / (fArr6[1] - f5);
        float f8 = fArr5[0];
        float abs = (Math.abs(f7) * (fArr6[0] - f8)) + f8;
        float f9 = fArr5[2];
        float[] fArr7 = {abs, RecyclerView.DECELERATION_RATE, (Math.abs(f7) * (fArr6[2] - f9)) + f9, 1.0f};
        float f10 = aabb.maxX;
        float f11 = aabb.minX;
        float f12 = aabb.maxY;
        float f13 = aabb.minY;
        float f14 = aabb.maxZ;
        float f15 = aabb.minZ;
        float[] fArr8 = {(f10 - f11) / 2.0f, (f12 - f13) / 2.0f, (f14 - f15) / 2.0f};
        float[] fArr9 = {(f11 + f10) / 2.0f, (f13 + f12) / 2.0f, (f15 + f14) / 2.0f};
        float f16 = fArr9[0];
        float f17 = fArr8[0];
        float f18 = f16 - f17;
        float f19 = f16 + f17;
        float f20 = fArr7[0];
        if (f20 < f18 || f20 > f19) {
            return null;
        }
        float f21 = fArr9[1];
        float f22 = fArr8[1];
        float f23 = f21 - f22;
        float f24 = f21 + f22;
        float f25 = fArr7[1];
        if (f25 < f23 || f25 > f24) {
            return null;
        }
        float f26 = fArr9[2];
        float f27 = fArr8[2];
        float f28 = f26 - f27;
        float f29 = f26 + f27;
        float f30 = fArr7[2];
        if (f30 < f28 || f30 > f29) {
            return null;
        }
        boolean z = fArr6[1] > (f13 + f12) / 2.0f;
        float[] fArr10 = {(f10 - f11) / 2.0f, (f12 - f13) / 2.0f, (f14 - f15) / 2.0f};
        float f31 = fArr10[0];
        float f32 = fArr10[2];
        float f33 = (f20 + f31) / (f31 * 2.0f);
        float f34 = ((f30 + f32) / (2.0f * f32)) * 0.4682479f;
        if (z) {
            f33 = 1.0f - f33;
            f34 += 0.5317521f;
        }
        return new Pair(Float.valueOf(f33), Float.valueOf(f34));
    }
}
