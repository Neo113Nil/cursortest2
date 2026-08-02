package androidx.compose.ui.spatial;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class RelativeLayoutBounds {
    public final long bottomRight;
    public final Modifier.Node node;
    public final long screenOffset;
    public final long topLeft;
    public final float[] viewToWindowMatrix;
    public final long windowOffset;
    public final long windowSize;

    public RelativeLayoutBounds(long j, long j2, long j3, long j4, long j5, Modifier.Node node, float[] fArr) {
        this.topLeft = j;
        this.bottomRight = j2;
        this.windowOffset = j3;
        this.screenOffset = j4;
        this.windowSize = j5;
        this.viewToWindowMatrix = fArr;
        this.node = node;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj != null && RelativeLayoutBounds.class == obj.getClass()) {
                RelativeLayoutBounds relativeLayoutBounds = (RelativeLayoutBounds) obj;
                if (this.topLeft == relativeLayoutBounds.topLeft && this.bottomRight == relativeLayoutBounds.bottomRight && this.windowSize == relativeLayoutBounds.windowSize && IntOffset.m1047equalsimpl0(this.windowOffset, relativeLayoutBounds.windowOffset) && IntOffset.m1047equalsimpl0(this.screenOffset, relativeLayoutBounds.screenOffset)) {
                    float[] fArr = relativeLayoutBounds.viewToWindowMatrix;
                    float[] fArr2 = this.viewToWindowMatrix;
                    if (fArr2 == null) {
                        if (fArr == null) {
                            equals = true;
                            if (equals && this.node.equals(relativeLayoutBounds.node)) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (fArr != null) {
                            equals = fArr2.equals(fArr);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final float fractionVisibleInRect(int i, int i2, int i3, int i4) {
        long j = this.topLeft;
        int i5 = (int) (j >> 32);
        int min = Math.min(Math.max(i5, i), i3);
        int i6 = (int) j;
        int min2 = Math.min(Math.max(i6, i2), i4);
        long j2 = this.bottomRight;
        int i7 = (int) (j2 >> 32);
        int max = Math.max(Math.min(i7, i3), i);
        int i8 = (int) j2;
        int max2 = Math.max(Math.min(i8, i4), i2);
        int i9 = i4 - i2;
        int i10 = (i8 - i6) * (i7 - i5);
        return Math.max((max2 - min2) * (max - min), 0) / Math.min(i9 * (i3 - i), i10);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.topLeft) * 31, 31, this.bottomRight), 31, this.windowSize), 31, this.windowOffset), 31, this.screenOffset);
        float[] fArr = this.viewToWindowMatrix;
        return this.node.hashCode() + ((m + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
