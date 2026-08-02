package androidx.compose.runtime;

import androidx.compose.runtime.composer.gapbuffer.SlotTableKt;
import androidx.compose.runtime.tooling.CompositionData;

/* loaded from: classes3.dex */
public final class GapCompositionDataImpl implements CompositionData {
    public final Composition composition;

    public GapCompositionDataImpl(Composition composition) {
        this.composition = composition;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GapCompositionDataImpl) {
            return this.composition.equals(((GapCompositionDataImpl) obj).composition);
        }
        return false;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final Iterable getCompositionGroups() {
        return SlotTableKt.asGapBufferSlotTable(((CompositionImpl) this.composition).slotStorage);
    }

    public final int hashCode() {
        return this.composition.hashCode() * 31;
    }
}
