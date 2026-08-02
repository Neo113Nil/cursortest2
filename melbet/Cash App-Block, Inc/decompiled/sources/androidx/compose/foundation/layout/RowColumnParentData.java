package androidx.compose.foundation.layout;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RowColumnParentData {
    public float weight = RecyclerView.DECELERATION_RATE;
    public boolean fill = true;
    public SpacerKt crossAxisAlignment = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowColumnParentData)) {
            return false;
        }
        RowColumnParentData rowColumnParentData = (RowColumnParentData) obj;
        return Float.compare(this.weight, rowColumnParentData.weight) == 0 && this.fill == rowColumnParentData.fill && Intrinsics.areEqual(this.crossAxisAlignment, rowColumnParentData.crossAxisAlignment);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Float.hashCode(this.weight) * 31, 31, this.fill);
        SpacerKt spacerKt = this.crossAxisAlignment;
        return (m + (spacerKt == null ? 0 : spacerKt.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.weight + ", fill=" + this.fill + ", crossAxisAlignment=" + this.crossAxisAlignment + ", flowLayoutData=null)";
    }
}
