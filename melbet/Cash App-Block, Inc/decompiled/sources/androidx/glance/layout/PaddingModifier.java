package androidx.glance.layout;

import androidx.glance.GlanceModifier;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class PaddingModifier implements GlanceModifier.Element {
    public final PaddingDimension bottom;
    public final PaddingDimension end;
    public final PaddingDimension left;
    public final PaddingDimension right;
    public final PaddingDimension start;
    public final PaddingDimension top;

    public PaddingModifier(PaddingDimension paddingDimension, PaddingDimension paddingDimension2, PaddingDimension paddingDimension3, PaddingDimension paddingDimension4, PaddingDimension paddingDimension5, PaddingDimension paddingDimension6) {
        this.left = paddingDimension;
        this.start = paddingDimension2;
        this.top = paddingDimension3;
        this.right = paddingDimension4;
        this.end = paddingDimension5;
        this.bottom = paddingDimension6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaddingModifier)) {
            return false;
        }
        PaddingModifier paddingModifier = (PaddingModifier) obj;
        return Intrinsics.areEqual(this.left, paddingModifier.left) && Intrinsics.areEqual(this.start, paddingModifier.start) && Intrinsics.areEqual(this.top, paddingModifier.top) && Intrinsics.areEqual(this.right, paddingModifier.right) && Intrinsics.areEqual(this.end, paddingModifier.end) && Intrinsics.areEqual(this.bottom, paddingModifier.bottom);
    }

    public final int hashCode() {
        return this.bottom.hashCode() + ((this.end.hashCode() + ((this.right.hashCode() + ((this.top.hashCode() + ((this.start.hashCode() + (this.left.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PaddingModifier(left=" + this.left + ", start=" + this.start + ", top=" + this.top + ", right=" + this.right + ", end=" + this.end + ", bottom=" + this.bottom + ')';
    }
}
