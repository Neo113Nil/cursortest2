package androidx.compose.runtime.composer.gapbuffer;

import com.squareup.cash.benefits.utils.ErrorReportingKt;

/* loaded from: classes3.dex */
public final class RelativeGroupPath extends ErrorReportingKt {
    public final int index;
    public final ErrorReportingKt parent;

    public RelativeGroupPath(ErrorReportingKt errorReportingKt, int i) {
        this.parent = errorReportingKt;
        this.index = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RelativeGroupPath)) {
            return false;
        }
        RelativeGroupPath relativeGroupPath = (RelativeGroupPath) obj;
        return relativeGroupPath.parent.equals(this.parent) && relativeGroupPath.index == this.index;
    }

    @Override // com.squareup.cash.benefits.utils.ErrorReportingKt
    public final Object getIdentity(SlotTable slotTable) {
        return new SourceInformationSlotTableGroupIdentity(this.parent.getIdentity(slotTable), this.index);
    }

    public final int hashCode() {
        return this.parent.hashCode() + (this.index * 31);
    }
}
