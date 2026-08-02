package androidx.compose.foundation.gestures;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class DefaultDraggableAnchors {
    public final float[] anchors;
    public final List keys;
    public final int size;

    public DefaultDraggableAnchors(List list, float[] fArr) {
        this.keys = list;
        this.anchors = fArr;
        if (list.size() != fArr.length) {
            InlineClassHelperKt.throwIllegalArgumentException("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + ArraysKt___ArraysKt.toList(fArr));
        }
        this.size = fArr.length;
    }

    public final Object closestAnchor(float f, boolean z) {
        float[] fArr = this.anchors;
        int length = fArr.length;
        int i = 0;
        int i2 = -1;
        float f2 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (i < length) {
            float f3 = fArr[i];
            int i4 = i3 + 1;
            float f4 = z ? f3 - f : f - f3;
            if (f4 < RecyclerView.DECELERATION_RATE) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if (f4 <= f2) {
                i2 = i3;
                f2 = f4;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.keys.get(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultDraggableAnchors)) {
            return false;
        }
        DefaultDraggableAnchors defaultDraggableAnchors = (DefaultDraggableAnchors) obj;
        return Intrinsics.areEqual(this.keys, defaultDraggableAnchors.keys) && Arrays.equals(this.anchors, defaultDraggableAnchors.anchors) && this.size == defaultDraggableAnchors.size;
    }

    public final boolean hasPositionFor(Object obj) {
        return this.keys.indexOf(obj) != -1;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.anchors) + (this.keys.hashCode() * 31)) * 31) + this.size;
    }

    public final float maxPosition() {
        float[] fArr = this.anchors;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float f = fArr[0];
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                f = Math.max(f, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return f;
    }

    public final float minPosition() {
        float[] fArr = this.anchors;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float f = fArr[0];
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                f = Math.min(f, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return f;
    }

    public final float positionOf(Object obj) {
        int indexOf = this.keys.indexOf(obj);
        if (indexOf < 0) {
            return Float.NaN;
        }
        float[] fArr = this.anchors;
        if (indexOf < fArr.length) {
            return fArr[indexOf];
        }
        return Float.NaN;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        float f;
        StringBuilder sb = new StringBuilder("DraggableAnchors(anchors={");
        int i = 0;
        while (true) {
            int i2 = this.size;
            if (i >= i2) {
                sb.append("})");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(CollectionsKt.getOrNull(i, this.keys));
            sb2.append('=');
            if (i >= 0) {
                float[] fArr = this.anchors;
                if (i < fArr.length) {
                    f = fArr[i];
                    sb2.append(f);
                    sb.append(sb2.toString());
                    if (i >= i2 - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
            }
            f = Float.NaN;
            sb2.append(f);
            sb.append(sb2.toString());
            if (i >= i2 - 1) {
            }
            i++;
        }
    }

    public final Object closestAnchor(float f) {
        float[] fArr = this.anchors;
        int length = fArr.length;
        float f2 = Float.POSITIVE_INFINITY;
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int i4 = i3 + 1;
            float abs = Math.abs(f - fArr[i]);
            if (abs <= f2) {
                i2 = i3;
                f2 = abs;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.keys.get(i2);
    }
}
