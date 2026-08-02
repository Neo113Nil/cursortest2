package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
public final class SourceInformationSlotTableGroup implements CompositionGroup, Iterable, KMappedMarker {
    public final RelativeGroupPath identityPath;
    public final int parent;
    public final SlotTable table;
    public final Integer key = 0;
    public final SourceInformationSlotTableGroup compositionGroups = this;

    public SourceInformationSlotTableGroup(SlotTable slotTable, int i, GapGroupSourceInformation gapGroupSourceInformation, RelativeGroupPath relativeGroupPath) {
        this.table = slotTable;
        this.parent = i;
        this.identityPath = relativeGroupPath;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SourceInformationSlotTableGroup)) {
            return false;
        }
        SourceInformationSlotTableGroup sourceInformationSlotTableGroup = (SourceInformationSlotTableGroup) obj;
        return sourceInformationSlotTableGroup.parent == this.parent && sourceInformationSlotTableGroup.table == this.table && sourceInformationSlotTableGroup.identityPath.equals(this.identityPath);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final Iterable getCompositionGroups() {
        return this.compositionGroups;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final Iterable getData() {
        return new SourceInformationGroupDataIterator(this.table, this.parent, null);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final Object getIdentity() {
        return this.identityPath.getIdentity(this.table);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final Object getNode() {
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final String getSourceInfo() {
        return null;
    }

    public final int hashCode() {
        return this.identityPath.hashCode() + ((this.table.hashCode() + (this.parent * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new SourceInformationGroupIterator(this.table, this.parent, null, this.identityPath);
    }
}
