package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.PreconditionsKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class SlotReader {
    public boolean closed;
    public int currentEnd;
    public int currentGroup;
    public int currentSlot;
    public int currentSlotEnd;
    public final IntStack currentSlotStack;
    public int emptyCount;
    public final int[] groups;
    public final int groupsSize;
    public boolean hadNext;
    public int parent;
    public Object[] slots;
    public final int slotsSize;
    public final SlotTable table;

    public SlotReader(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.groups;
        int i = slotTable.groupsSize;
        this.groupsSize = i;
        this.slots = slotTable.slots;
        this.slotsSize = slotTable.slotsSize;
        this.currentEnd = i;
        this.parent = -1;
        this.currentSlotStack = new IntStack(0, false);
    }

    public final GapAnchor anchor(int i) {
        ArrayList arrayList = this.table.anchors;
        int search = SlotTableKt.search(arrayList, i, this.groupsSize);
        if (search >= 0) {
            return (GapAnchor) arrayList.get(search);
        }
        GapAnchor gapAnchor = new GapAnchor(i);
        arrayList.add(-(search + 1), gapAnchor);
        return gapAnchor;
    }

    public final Object aux(int i, int[] iArr) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.slots[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return Composer.Companion.Empty;
    }

    public final void close() {
        this.closed = true;
        if (this.table.readers <= 0) {
            ComposerKt.composeImmediateRuntimeError("Unexpected reader close()");
        }
        r0.readers--;
        this.slots = new Object[0];
    }

    public final boolean containsMark(int i) {
        return (this.groups[(i * 5) + 1] & 67108864) != 0;
    }

    public final void endGroup() {
        if (this.emptyCount == 0) {
            if (this.currentGroup != this.currentEnd) {
                ComposerKt.composeImmediateRuntimeError("endGroup() not called at the end of a group");
            }
            int i = (this.parent * 5) + 2;
            int[] iArr = this.groups;
            int i2 = iArr[i];
            this.parent = i2;
            int i3 = this.groupsSize;
            this.currentEnd = i2 < 0 ? i3 : iArr[(i2 * 5) + 3] + i2;
            int pop = this.currentSlotStack.pop();
            if (pop < 0) {
                this.currentSlot = 0;
                this.currentSlotEnd = 0;
            } else {
                this.currentSlot = pop;
                this.currentSlotEnd = i2 >= i3 + (-1) ? this.slotsSize : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    public final Object getGroupAux() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return aux(i, this.groups);
        }
        return 0;
    }

    public final int getGroupKey() {
        int i = this.currentGroup;
        if (i >= this.currentEnd) {
            return 0;
        }
        return this.groups[i * 5];
    }

    public final Object groupGet(int i, int i2) {
        int[] iArr = this.groups;
        int access$slotAnchor = SlotTableKt.access$slotAnchor(i, iArr);
        int i3 = i + 1;
        int i4 = access$slotAnchor + i2;
        return i4 < (i3 < this.groupsSize ? iArr[(i3 * 5) + 4] : this.slotsSize) ? this.slots[i4] : Composer.Companion.Empty;
    }

    public final int groupKey(int i) {
        return this.groups[i * 5];
    }

    public final boolean hasMark(int i) {
        return (this.groups[(i * 5) + 1] & 134217728) != 0;
    }

    public final boolean hasObjectKey(int i) {
        return (this.groups[(i * 5) + 1] & PKIFailureInfo.duplicateCertReq) != 0;
    }

    public final boolean isNode(int i) {
        return (this.groups[(i * 5) + 1] & 1073741824) != 0;
    }

    public final Object next() {
        int i;
        if (this.emptyCount > 0 || (i = this.currentSlot) >= this.currentSlotEnd) {
            this.hadNext = false;
            return Composer.Companion.Empty;
        }
        this.hadNext = true;
        Object[] objArr = this.slots;
        this.currentSlot = i + 1;
        return objArr[i];
    }

    public final Object node(int i) {
        int i2 = i * 5;
        int[] iArr = this.groups;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.slots[iArr[i2 + 4]] : Composer.Companion.Empty;
        }
        return null;
    }

    public final int nodeCount(int i) {
        return this.groups[(i * 5) + 1] & 67108863;
    }

    public final Object objectKey(int i, int[] iArr) {
        if ((iArr[(i * 5) + 1] & PKIFailureInfo.duplicateCertReq) != 0) {
            return this.slots[SlotTableKt.access$objectKeyIndex(i, iArr)];
        }
        return null;
    }

    public final int parent(int i) {
        return this.groups[(i * 5) + 2];
    }

    public final void reposition(int i) {
        if (this.emptyCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot reposition while in an empty region");
        }
        this.currentGroup = i;
        int[] iArr = this.groups;
        int i2 = this.groupsSize;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.parent) {
            this.parent = i3;
            if (i3 < 0) {
                this.currentEnd = i2;
            } else {
                this.currentEnd = iArr[(i3 * 5) + 3] + i3;
            }
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
        }
    }

    public final int skipGroup() {
        if (this.emptyCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip while in an empty region");
        }
        int i = this.currentGroup;
        int i2 = i * 5;
        int[] iArr = this.groups;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.currentGroup = iArr[i2 + 3] + i;
        return i4;
    }

    public final void skipToGroupEnd() {
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip the enclosing group while in an empty region");
        }
        this.currentGroup = this.currentEnd;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void startGroup() {
        if (this.emptyCount <= 0) {
            int i = this.parent;
            int i2 = this.currentGroup;
            int i3 = i2 * 5;
            int[] iArr = this.groups;
            if (iArr[i3 + 2] != i) {
                PreconditionsKt.throwIllegalArgumentException("Invalid slot table detected");
            }
            int i4 = this.currentSlot;
            int i5 = this.currentSlotEnd;
            IntStack intStack = this.currentSlotStack;
            if (i4 == 0 && i5 == 0) {
                intStack.push(-1);
            } else {
                intStack.push(i4);
            }
            this.parent = i2;
            this.currentEnd = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.currentGroup = i6;
            this.currentSlot = SlotTableKt.access$slotAnchor(i2, iArr);
            this.currentSlotEnd = i2 >= this.groupsSize + (-1) ? this.slotsSize : iArr[(i6 * 5) + 4];
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.currentGroup);
        sb.append(", key=");
        sb.append(getGroupKey());
        sb.append(", parent=");
        sb.append(this.parent);
        sb.append(", end=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.currentEnd, ')');
    }
}
