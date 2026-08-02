package androidx.compose.ui.geometry;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.RecyclerView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class Rect {
    public static final Rect Zero = new Rect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
    public final float bottom;
    public final float left;
    public final float right;
    public final float top;

    public Rect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public static Rect copy$default(Rect rect, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = rect.left;
        }
        float f4 = rect.top;
        if ((i & 4) != 0) {
            f2 = rect.right;
        }
        if ((i & 8) != 0) {
            f3 = rect.bottom;
        }
        return new Rect(f, f4, f2, f3);
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m629containsk4lQ0M(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
        return (intBitsToFloat >= this.left) & (intBitsToFloat < this.right) & (intBitsToFloat2 >= this.top) & (intBitsToFloat2 < this.bottom);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        return Float.compare(this.left, rect.left) == 0 && Float.compare(this.top, rect.top) == 0 && Float.compare(this.right, rect.right) == 0 && Float.compare(this.bottom, rect.bottom) == 0;
    }

    /* renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m630getBottomCenterF1C5BW0() {
        float f = this.right;
        float f2 = this.left;
        return (Float.floatToRawIntBits(Recorder$$ExternalSyntheticOutline2.m(f, f2, 2.0f, f2)) << 32) | (Float.floatToRawIntBits(this.bottom) & BodyPartID.bodyIdMax);
    }

    /* renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m631getBottomLeftF1C5BW0() {
        return (Float.floatToRawIntBits(this.left) << 32) | (Float.floatToRawIntBits(this.bottom) & BodyPartID.bodyIdMax);
    }

    /* renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m632getBottomRightF1C5BW0() {
        return (Float.floatToRawIntBits(this.right) << 32) | (Float.floatToRawIntBits(this.bottom) & BodyPartID.bodyIdMax);
    }

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m633getCenterF1C5BW0() {
        float f = this.right;
        float f2 = this.left;
        float m = Recorder$$ExternalSyntheticOutline2.m(f, f2, 2.0f, f2);
        float f3 = this.top;
        float m2 = Recorder$$ExternalSyntheticOutline2.m(this.bottom, f3, 2.0f, f3);
        return (Float.floatToRawIntBits(m) << 32) | (Float.floatToRawIntBits(m2) & BodyPartID.bodyIdMax);
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m634getSizeNHjbRc() {
        float f = this.right - this.left;
        float f2 = this.bottom - this.top;
        return (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32);
    }

    /* renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m635getTopCenterF1C5BW0() {
        float f = this.right;
        float f2 = this.left;
        return (Float.floatToRawIntBits(Recorder$$ExternalSyntheticOutline2.m(f, f2, 2.0f, f2)) << 32) | (Float.floatToRawIntBits(this.top) & BodyPartID.bodyIdMax);
    }

    /* renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m636getTopLeftF1C5BW0() {
        return (Float.floatToRawIntBits(this.left) << 32) | (Float.floatToRawIntBits(this.top) & BodyPartID.bodyIdMax);
    }

    public final int hashCode() {
        return Float.hashCode(this.bottom) + CameraState$Type$EnumUnboxingLocalUtility.m(this.right, CameraState$Type$EnumUnboxingLocalUtility.m(this.top, Float.hashCode(this.left) * 31, 31), 31);
    }

    public final Rect intersect(Rect rect) {
        return new Rect(Math.max(this.left, rect.left), Math.max(this.top, rect.top), Math.min(this.right, rect.right), Math.min(this.bottom, rect.bottom));
    }

    public final boolean isEmpty() {
        return (this.left >= this.right) | (this.top >= this.bottom);
    }

    public final boolean overlaps(Rect rect) {
        return (this.left < rect.right) & (rect.left < this.right) & (this.top < rect.bottom) & (rect.top < this.bottom);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.toStringAsFixed(this.left) + ", " + GeometryUtilsKt.toStringAsFixed(this.top) + ", " + GeometryUtilsKt.toStringAsFixed(this.right) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom) + ')';
    }

    public final Rect translate(float f, float f2) {
        return new Rect(this.left + f, this.top + f2, this.right + f, this.bottom + f2);
    }

    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final Rect m637translatek4lQ0M(long j) {
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i) + this.left;
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        return new Rect(intBitsToFloat, Float.intBitsToFloat(i2) + this.top, Float.intBitsToFloat(i) + this.right, Float.intBitsToFloat(i2) + this.bottom);
    }
}
