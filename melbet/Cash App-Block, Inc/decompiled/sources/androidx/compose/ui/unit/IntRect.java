package androidx.compose.ui.unit;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class IntRect {
    public static final IntRect Zero = new IntRect(0, 0, 0, 0);
    public final int bottom;
    public final int left;
    public final int right;
    public final int top;

    public IntRect(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntRect)) {
            return false;
        }
        IntRect intRect = (IntRect) obj;
        return this.left == intRect.left && this.top == intRect.top && this.right == intRect.right && this.bottom == intRect.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    /* renamed from: getCenter-nOcc-ac, reason: not valid java name */
    public final long m1051getCenternOccac() {
        return (((getHeight() / 2) + this.top) & BodyPartID.bodyIdMax) | (((getWidth() / 2) + this.left) << 32);
    }

    public final int getHeight() {
        return this.bottom - this.top;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    /* renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m1052getTopLeftnOccac() {
        return (this.left << 32) | (this.top & BodyPartID.bodyIdMax);
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public final int hashCode() {
        return Integer.hashCode(this.bottom) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.right, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.top, Integer.hashCode(this.left) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.left);
        sb.append(", ");
        sb.append(this.top);
        sb.append(", ");
        sb.append(this.right);
        sb.append(", ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.bottom, ')');
    }
}
