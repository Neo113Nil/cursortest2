package androidx.compose.runtime.composer.gapbuffer;

import com.squareup.cash.benefits.utils.ErrorReportingKt;

/* loaded from: classes3.dex */
public final class AnchoredGroupPath extends ErrorReportingKt {
    public final int group;

    public AnchoredGroupPath(int i) {
        this.group = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AnchoredGroupPath) && ((AnchoredGroupPath) obj).group == this.group;
    }

    @Override // com.squareup.cash.benefits.utils.ErrorReportingKt
    public final Object getIdentity(SlotTable slotTable) {
        return slotTable.anchor(this.group);
    }

    public final int hashCode() {
        return this.group * 31;
    }
}
