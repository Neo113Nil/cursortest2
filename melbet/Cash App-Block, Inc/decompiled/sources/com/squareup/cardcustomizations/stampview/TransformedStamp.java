package com.squareup.cardcustomizations.stampview;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Paint;
import com.google.android.play.core.review.zzb;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class TransformedStamp implements Parcelable {
    public static final Parcelable.Creator<TransformedStamp> CREATOR = new zzb(19);
    public final float minFraction;
    public final int minHeight;
    public final Matrix persistedTransform;
    public final Stamp renderedStamp;
    public final Matrix transform;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TransformedStamp(Stamp stamp, Matrix matrix, float f) {
        this(stamp, matrix, f, r4, (int) (r0.height() * f));
        Matrix matrix2 = new Matrix(matrix);
        RectF rectF = stamp.transformedBounds;
        matrix.mapRect(rectF, (RectF) stamp.pathBounds$delegate.getValue());
    }

    public static TransformedStamp copy$default(TransformedStamp transformedStamp, Matrix matrix, Matrix matrix2) {
        Stamp stamp = transformedStamp.renderedStamp;
        float f = transformedStamp.minFraction;
        int i = transformedStamp.minHeight;
        stamp.getClass();
        return new TransformedStamp(stamp, matrix, f, matrix2, i);
    }

    public static void draw$default(TransformedStamp transformedStamp, Canvas canvas, Paint paint) {
        Matrix matrix = transformedStamp.transform;
        transformedStamp.getClass();
        canvas.getClass();
        paint.getClass();
        matrix.getClass();
        Stamp stamp = transformedStamp.renderedStamp;
        stamp.getClass();
        Path path = stamp.path;
        if (path == null) {
            Intrinsics.throwUninitializedPropertyAccessException("path");
            throw null;
        }
        Path path2 = stamp.renderedPath;
        path.transform(matrix, path2);
        canvas.drawPath(new AndroidPath(path2), paint);
    }

    public final RectF bounds() {
        Stamp stamp = this.renderedStamp;
        stamp.getClass();
        Matrix matrix = this.transform;
        matrix.getClass();
        RectF rectF = stamp.transformedBounds;
        matrix.mapRect(rectF, (RectF) stamp.pathBounds$delegate.getValue());
        return rectF;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedStamp)) {
            return false;
        }
        TransformedStamp transformedStamp = (TransformedStamp) obj;
        return Intrinsics.areEqual(this.renderedStamp, transformedStamp.renderedStamp) && Intrinsics.areEqual(this.transform, transformedStamp.transform) && Float.compare(this.minFraction, transformedStamp.minFraction) == 0 && Intrinsics.areEqual(this.persistedTransform, transformedStamp.persistedTransform) && this.minHeight == transformedStamp.minHeight;
    }

    public final int hashCode() {
        return Integer.hashCode(this.minHeight) + ((this.persistedTransform.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.minFraction, (this.transform.hashCode() + (this.renderedStamp.hashCode() * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformedStamp(renderedStamp=");
        sb.append(this.renderedStamp);
        sb.append(", transform=");
        sb.append(this.transform);
        sb.append(", minFraction=");
        sb.append(this.minFraction);
        sb.append(", persistedTransform=");
        sb.append(this.persistedTransform);
        sb.append(", minHeight=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.minHeight, ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Stamp stamp = this.renderedStamp;
        stamp.getClass();
        parcel.getClass();
        parcel.writeString(stamp.name);
        parcel.writeString(stamp.svgString);
        Matrix matrix = this.transform;
        matrix.getClass();
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        parcel.writeFloatArray(fArr);
        parcel.writeFloat(this.minFraction);
        Matrix matrix2 = this.persistedTransform;
        matrix2.getClass();
        float[] fArr2 = new float[9];
        matrix2.getValues(fArr2);
        parcel.writeFloatArray(fArr2);
        parcel.writeInt(this.minHeight);
    }

    public TransformedStamp(Stamp stamp, Matrix matrix, float f, Matrix matrix2, int i) {
        this.renderedStamp = stamp;
        this.transform = matrix;
        this.minFraction = f;
        this.persistedTransform = matrix2;
        this.minHeight = i;
    }
}
