package com.squareup.cash.card.onboarding;

import android.content.Context;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.backend.math.Vector4;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;

/* loaded from: classes6.dex */
public final class PerspectiveView extends FrameLayout {
    public float cameraFov;
    public float childOffsetX;
    public float childOffsetY;
    public float childOffsetZ;
    public float childRotationX;
    public float childRotationY;
    public float childRotationZ;
    public boolean forceCentered;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerspectiveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.childOffsetZ = Float.MIN_VALUE;
        this.cameraFov = 35.0f;
        setStaticTransformationsEnabled(true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() != 1) {
            super.addView(view, i, layoutParams);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Cannot add more than one child to this view.");
        }
    }

    public final void forceUpdate() {
        invalidate();
        Iterator it = new ViewGroupKt$children$1(this).iterator();
        while (it.hasNext()) {
            ((View) it.next()).requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean getChildStaticTransformation(View view, Transformation transformation) {
        RectF rectF;
        view.getClass();
        transformation.getClass();
        float width = view.getWidth();
        float height = view.getHeight();
        if (this.childOffsetZ == Float.MIN_VALUE) {
            setChildOffsetZ(Math.max(width, height));
        }
        Vector4[] vector4Arr = {new Vector4(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f), new Vector4(RecyclerView.DECELERATION_RATE, height, RecyclerView.DECELERATION_RATE, 1.0f), new Vector4(width, height, RecyclerView.DECELERATION_RATE, 1.0f), new Vector4(width, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f)};
        float f = width / 2.0f;
        float f2 = height / 2.0f;
        int i = 4;
        char c = 0;
        boolean z = true;
        char c2 = 2;
        int i2 = 3;
        float[] fArr = {-f, -f2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
        ArrayList arrayList = new ArrayList(4);
        int i3 = 0;
        while (i3 < 4) {
            boolean z2 = z;
            Vector4 vector4 = vector4Arr[i3];
            vector4.getClass();
            char c3 = c2;
            float[] fArr2 = vector4.vector;
            int i4 = i2;
            arrayList.add(new Vector4(fArr2[0] + fArr[0], fArr2[z2 ? 1 : 0] + fArr[z2 ? 1 : 0], fArr2[c3] + fArr[c3], fArr2[i4] + fArr[i4]));
            i3++;
            z = z2 ? 1 : 0;
            c2 = c3;
            i2 = i4;
        }
        boolean z3 = z;
        char c4 = c2;
        int i5 = i2;
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = fArr3;
        Matrix.rotateM(fArr4, 0, this.childRotationX, 1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        Matrix.rotateM(fArr4, 0, this.childRotationY, RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE);
        Matrix.rotateM(fArr4, 0, this.childRotationZ, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.translateM(fArr5, 0, this.childOffsetX, this.childOffsetY, -this.childOffsetZ);
        float[] fArr6 = new float[16];
        Matrix.setIdentityM(fArr6, 0);
        Matrix.perspectiveM(fArr6, 0, this.cameraFov, width / height, 0.1f, Math.max(width, height));
        float[] fArr7 = new float[16];
        Matrix.setIdentityM(fArr7, 0);
        Matrix.setLookAtM(fArr7, 0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, -1.0f, RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Vector4 vector42 = (Vector4) it.next();
            vector42.getClass();
            float[] fArr8 = new float[i];
            float[] fArr9 = fArr4;
            Matrix.multiplyMV(fArr8, 0, fArr9, 0, vector42.vector, 0);
            fArr4 = fArr9;
            float[] fArr10 = new float[i];
            Matrix.multiplyMV(fArr10, 0, fArr5, 0, fArr8, 0);
            float[] fArr11 = new float[i];
            Matrix.multiplyMV(fArr11, 0, fArr7, 0, fArr10, 0);
            float[] fArr12 = new float[i];
            Matrix.multiplyMV(fArr12, 0, fArr6, 0, fArr11, 0);
            float max = Math.max(width, height);
            float f3 = fArr12[c];
            float f4 = fArr12[i5];
            char c5 = c;
            float[] fArr13 = new Vector4(f3 / f4, fArr12[z3 ? 1 : 0] / f4, fArr12[c4] / f4, 1.0f).vector;
            float f5 = (fArr13[c5] * f) + f;
            float f6 = (fArr13[z3 ? 1 : 0] * f2) + f2;
            float f7 = ((max - 0.1f) / 2.0f) * fArr13[c4];
            float[] fArr14 = new float[i5];
            fArr14[c5] = f5;
            fArr14[z3 ? 1 : 0] = f6;
            fArr14[c4] = ((max + 0.1f) / 2.0f) + f7;
            arrayList2.add(fArr14);
            vector4Arr = vector4Arr;
            c = c5;
            i = 4;
        }
        Vector4[] vector4Arr2 = vector4Arr;
        boolean z4 = c;
        ArrayList arrayList3 = new ArrayList();
        for (int i6 = z4 ? 1 : 0; i6 < 4; i6++) {
            Vector4 vector43 = vector4Arr2[i6];
            CollectionsKt__MutableCollectionsKt.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(vector43.vector[z4 ? 1 : 0]), Float.valueOf(vector43.vector[z3 ? 1 : 0])}), arrayList3);
        }
        float[] floatArray = CollectionsKt.toFloatArray(arrayList3);
        RectF rectF2 = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, width, height);
        if (this.forceCentered) {
            Iterator it2 = arrayList2.iterator();
            if (!it2.hasNext()) {
                a$$ExternalSyntheticBUOutline0.m();
                return z4;
            }
            float f8 = ((float[]) it2.next())[z4 ? 1 : 0];
            while (it2.hasNext()) {
                f8 = Math.min(f8, ((float[]) it2.next())[z4 ? 1 : 0]);
            }
            Iterator it3 = arrayList2.iterator();
            if (!it3.hasNext()) {
                a$$ExternalSyntheticBUOutline0.m();
                return z4;
            }
            float f9 = ((float[]) it3.next())[z3 ? 1 : 0];
            while (it3.hasNext()) {
                f9 = Math.min(f9, ((float[]) it3.next())[z3 ? 1 : 0]);
            }
            Iterator it4 = arrayList2.iterator();
            if (!it4.hasNext()) {
                a$$ExternalSyntheticBUOutline0.m();
                return z4;
            }
            float f10 = ((float[]) it4.next())[z4 ? 1 : 0];
            while (it4.hasNext()) {
                f10 = Math.max(f10, ((float[]) it4.next())[z4 ? 1 : 0]);
            }
            Iterator it5 = arrayList2.iterator();
            if (!it5.hasNext()) {
                a$$ExternalSyntheticBUOutline0.m();
                return z4;
            }
            float f11 = ((float[]) it5.next())[z3 ? 1 : 0];
            while (it5.hasNext()) {
                f11 = Math.max(f11, ((float[]) it5.next())[z3 ? 1 : 0]);
            }
            rectF = new RectF(f8, f9, f10, f11);
        } else {
            rectF = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, width, height);
        }
        float centerX = rectF.centerX() - rectF2.centerX();
        float centerY = rectF.centerY() - rectF2.centerY();
        ArrayList arrayList4 = new ArrayList();
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            float[] fArr15 = (float[]) it6.next();
            CollectionsKt__MutableCollectionsKt.addAll(CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(fArr15[z4 ? 1 : 0] - centerX), Float.valueOf(fArr15[z3 ? 1 : 0] - centerY)}), arrayList4);
        }
        float[] floatArray2 = CollectionsKt.toFloatArray(arrayList4);
        android.graphics.Matrix matrix = transformation.getMatrix();
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.setPolyToPoly(floatArray, 0, floatArray2, 0, 4);
        matrix.set(matrix2);
        return z3;
    }

    public final void setCameraFov(float f) {
        if (this.cameraFov == f) {
            return;
        }
        this.cameraFov = f;
        forceUpdate();
    }

    public final void setChildOffsetX(float f) {
        if (this.childOffsetX == f) {
            return;
        }
        this.childOffsetX = f;
        forceUpdate();
    }

    public final void setChildOffsetY(float f) {
        if (this.childOffsetY == f) {
            return;
        }
        this.childOffsetY = f;
        forceUpdate();
    }

    public final void setChildOffsetZ(float f) {
        if (this.childOffsetZ == f) {
            return;
        }
        this.childOffsetZ = f;
        forceUpdate();
    }

    public final void setChildRotationX(float f) {
        if (this.childRotationX == f) {
            return;
        }
        this.childRotationX = f;
        forceUpdate();
    }

    public final void setChildRotationY(float f) {
        if (this.childRotationY == f) {
            return;
        }
        this.childRotationY = f;
        forceUpdate();
    }

    public final void setChildRotationZ(float f) {
        if (this.childRotationZ == f) {
            return;
        }
        this.childRotationZ = f;
        forceUpdate();
    }

    public final void setForceCentered(boolean z) {
        if (this.forceCentered != z) {
            this.forceCentered = z;
            forceUpdate();
        }
    }
}
