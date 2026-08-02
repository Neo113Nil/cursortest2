package androidx.compose.ui.geometry;

import androidx.recyclerview.widget.RecyclerView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class MutableRect {
    public float left = RecyclerView.DECELERATION_RATE;
    public float top = RecyclerView.DECELERATION_RATE;
    public float right = RecyclerView.DECELERATION_RATE;
    public float bottom = RecyclerView.DECELERATION_RATE;

    public final void intersect(float f, float f2, float f3, float f4) {
        this.left = Math.max(f, this.left);
        this.top = Math.max(f2, this.top);
        this.right = Math.min(f3, this.right);
        this.bottom = Math.min(f4, this.bottom);
    }

    public final boolean isEmpty() {
        return (this.left >= this.right) | (this.top >= this.bottom);
    }

    public final String toString() {
        return "MutableRect(" + GeometryUtilsKt.toStringAsFixed(this.left) + ", " + GeometryUtilsKt.toStringAsFixed(this.top) + ", " + GeometryUtilsKt.toStringAsFixed(this.right) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom) + ')';
    }

    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final void m619translatek4lQ0M(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
        this.left += intBitsToFloat;
        this.top += intBitsToFloat2;
        this.right += intBitsToFloat;
        this.bottom += intBitsToFloat2;
    }
}
