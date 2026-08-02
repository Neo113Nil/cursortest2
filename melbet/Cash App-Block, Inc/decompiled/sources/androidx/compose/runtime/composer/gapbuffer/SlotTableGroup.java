package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class SlotTableGroup implements CompositionGroup, Iterable, KMappedMarker {
    public final int group;
    public final SlotTable table;
    public final int version;

    public SlotTableGroup(SlotTable slotTable, int i, int i2) {
        this.table = slotTable;
        this.group = i;
        this.version = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SlotTableGroup)) {
            return false;
        }
        SlotTableGroup slotTableGroup = (SlotTableGroup) obj;
        return slotTableGroup.group == this.group && slotTableGroup.version == this.version && slotTableGroup.table == this.table;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final Iterable getCompositionGroups() {
        return this;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final Iterable getData() {
        SlotTable slotTable = this.table;
        int i = this.group;
        slotTable.sourceInformationOf(i);
        return new DataIterator(slotTable, i);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final Object getIdentity() {
        SlotTable slotTable = this.table;
        if (slotTable.version != this.version) {
            SlotTableKt.throwConcurrentModificationException();
        }
        SlotReader openReader = slotTable.openReader();
        try {
            return openReader.anchor(this.group);
        } finally {
            openReader.close();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final Object getKey() {
        SlotTable slotTable = this.table;
        int[] iArr = slotTable.groups;
        int i = this.group;
        int i2 = i * 5;
        if ((iArr[i2 + 1] & PKIFailureInfo.duplicateCertReq) == 0) {
            return Integer.valueOf(iArr[i2]);
        }
        Object obj = slotTable.slots[SlotTableKt.access$objectKeyIndex(i, iArr)];
        obj.getClass();
        return obj;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final Object getNode() {
        SlotTable slotTable = this.table;
        int[] iArr = slotTable.groups;
        int i = this.group * 5;
        if ((iArr[i + 1] & 1073741824) != 0) {
            return slotTable.slots[iArr[i + 4]];
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public final String getSourceInfo() {
        this.table.sourceInformationOf(this.group);
        return null;
    }

    public final int hashCode() {
        return (this.table.hashCode() * 31) + this.group;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        SlotTable slotTable = this.table;
        if (slotTable.version != this.version) {
            SlotTableKt.throwConcurrentModificationException();
        }
        int i = this.group;
        slotTable.sourceInformationOf(i);
        return new GroupIterator(slotTable, i + 1, slotTable.groups[(i * 5) + 3] + i);
    }
}
