package androidx.compose.ui.geometry;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class RoundRect {
    public final float bottom;
    public final long bottomLeftCornerRadius;
    public final long bottomRightCornerRadius;
    public final float left;
    public final float right;
    public final float top;
    public final long topLeftCornerRadius;
    public final long topRightCornerRadius;

    static {
        Strings.RoundRect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    public RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
        this.topLeftCornerRadius = j;
        this.topRightCornerRadius = j2;
        this.bottomRightCornerRadius = j3;
        this.bottomLeftCornerRadius = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) obj;
        return Float.compare(this.left, roundRect.left) == 0 && Float.compare(this.top, roundRect.top) == 0 && Float.compare(this.right, roundRect.right) == 0 && Float.compare(this.bottom, roundRect.bottom) == 0 && TransactorKt.m1172equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && TransactorKt.m1172equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && TransactorKt.m1172equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && TransactorKt.m1172equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public final int hashCode() {
        return Long.hashCode(this.bottomLeftCornerRadius) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.bottom, CameraState$Type$EnumUnboxingLocalUtility.m(this.right, CameraState$Type$EnumUnboxingLocalUtility.m(this.top, Float.hashCode(this.left) * 31, 31), 31), 31), 31, this.topLeftCornerRadius), 31, this.topRightCornerRadius), 31, this.bottomRightCornerRadius);
    }

    public final String toString() {
        String str = GeometryUtilsKt.toStringAsFixed(this.left) + ", " + GeometryUtilsKt.toStringAsFixed(this.top) + ", " + GeometryUtilsKt.toStringAsFixed(this.right) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom);
        long j = this.topLeftCornerRadius;
        long j2 = this.topRightCornerRadius;
        boolean m1172equalsimpl0 = TransactorKt.m1172equalsimpl0(j, j2);
        long j3 = this.bottomRightCornerRadius;
        long j4 = this.bottomLeftCornerRadius;
        if (!m1172equalsimpl0 || !TransactorKt.m1172equalsimpl0(j2, j3) || !TransactorKt.m1172equalsimpl0(j3, j4)) {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("RoundRect(rect=", str, ", topLeft=");
            m3m.append((Object) TransactorKt.m1176toStringimpl(j));
            m3m.append(", topRight=");
            m3m.append((Object) TransactorKt.m1176toStringimpl(j2));
            m3m.append(", bottomRight=");
            m3m.append((Object) TransactorKt.m1176toStringimpl(j3));
            m3m.append(", bottomLeft=");
            m3m.append((Object) TransactorKt.m1176toStringimpl(j4));
            m3m.append(')');
            return m3m.toString();
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        if (intBitsToFloat == Float.intBitsToFloat(i2)) {
            StringBuilder m3m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("RoundRect(rect=", str, ", radius=");
            m3m2.append(GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i)));
            m3m2.append(')');
            return m3m2.toString();
        }
        StringBuilder m3m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("RoundRect(rect=", str, ", x=");
        m3m3.append(GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i)));
        m3m3.append(", y=");
        m3m3.append(GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i2)));
        m3m3.append(')');
        return m3m3.toString();
    }
}
