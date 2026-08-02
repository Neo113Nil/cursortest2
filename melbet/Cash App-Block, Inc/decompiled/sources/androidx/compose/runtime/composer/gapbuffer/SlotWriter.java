package androidx.compose.runtime.composer.gapbuffer;

import androidx.collection.IntSetKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.GapRememberObserverHolder;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class SlotWriter {
    public ArrayList anchors;
    public MutableIntObjectMap calledByMap;
    public boolean closed;
    public int currentGroup;
    public int currentGroupEnd;
    public int currentSlot;
    public int currentSlotEnd;
    public MutableIntObjectMap deferredSlotWrites;
    public final IntStack endStack;
    public int groupGapLen;
    public int groupGapStart;
    public int[] groups;
    public int insertCount;
    public int nodeCount;
    public final IntStack nodeCountStack;
    public int parent;
    public MutableIntList pendingRecalculateMarks;
    public Object[] slots;
    public int slotsGapLen;
    public int slotsGapOwner;
    public int slotsGapStart;
    public HashMap sourceInformationMap;
    public final IntStack startStack;
    public final SlotTable table;

    public SlotWriter(SlotTable slotTable) {
        this.table = slotTable;
        int[] iArr = slotTable.groups;
        this.groups = iArr;
        Object[] objArr = slotTable.slots;
        this.slots = objArr;
        this.anchors = slotTable.anchors;
        this.sourceInformationMap = slotTable.sourceInformationMap;
        this.calledByMap = slotTable.calledByMap;
        int i = slotTable.groupsSize;
        this.groupGapStart = i;
        this.groupGapLen = (iArr.length / 5) - i;
        int i2 = slotTable.slotsSize;
        this.slotsGapStart = i2;
        this.slotsGapLen = objArr.length - i2;
        this.slotsGapOwner = i;
        this.startStack = new IntStack(0, false);
        this.endStack = new IntStack(0, false);
        this.nodeCountStack = new IntStack(0, false);
        this.currentGroupEnd = i;
        this.parent = -1;
    }

    public static int dataIndexToDataAnchor(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void markGroup$default(SlotWriter slotWriter) {
        int i = slotWriter.parent;
        int groupIndexToAddress = slotWriter.groupIndexToAddress(i);
        int[] iArr = slotWriter.groups;
        int i2 = (groupIndexToAddress * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        slotWriter.updateContainsMark(slotWriter.parent(i, iArr));
    }

    public final void advanceBy(int i) {
        if (i < 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek backwards");
        }
        if (this.insertCount > 0) {
            PreconditionsKt.throwIllegalStateException("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.currentGroup + i;
        if (i2 < this.parent || i2 > this.currentGroupEnd) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')');
        }
        this.currentGroup = i2;
        int dataIndex = dataIndex(groupIndexToAddress(i2), this.groups);
        this.currentSlot = dataIndex;
        this.currentSlotEnd = dataIndex;
    }

    public final GapAnchor anchor(int i) {
        ArrayList arrayList = this.anchors;
        int search = SlotTableKt.search(arrayList, i, getSize$runtime());
        if (search >= 0) {
            return (GapAnchor) arrayList.get(search);
        }
        if (i > this.groupGapStart) {
            i = -(getSize$runtime() - i);
        }
        GapAnchor gapAnchor = new GapAnchor(i);
        arrayList.add(-(search + 1), gapAnchor);
        return gapAnchor;
    }

    public final int anchorIndex(GapAnchor gapAnchor) {
        int i = gapAnchor.location;
        return i < 0 ? getSize$runtime() + i : i;
    }

    public final void beginInsert() {
        int i = this.insertCount;
        this.insertCount = i + 1;
        if (i == 0) {
            this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
        }
    }

    public final void close(boolean z) {
        this.closed = true;
        if (z && this.startStack.tos == 0) {
            moveGroupGapTo(getSize$runtime());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            int i = this.slotsGapStart;
            Arrays.fill(this.slots, i, this.slotsGapLen + i, (Object) null);
            recalculateMarks();
        }
        int[] iArr = this.groups;
        int i2 = this.groupGapStart;
        Object[] objArr = this.slots;
        int i3 = this.slotsGapStart;
        ArrayList arrayList = this.anchors;
        HashMap hashMap = this.sourceInformationMap;
        MutableIntObjectMap mutableIntObjectMap = this.calledByMap;
        SlotTable slotTable = this.table;
        if (!slotTable.writer) {
            PreconditionsKt.throwIllegalArgumentException("Unexpected writer close()");
        }
        slotTable.writer = false;
        slotTable.groups = iArr;
        slotTable.groupsSize = i2;
        slotTable.slots = objArr;
        slotTable.slotsSize = i3;
        slotTable.anchors = arrayList;
        slotTable.sourceInformationMap = hashMap;
        slotTable.calledByMap = mutableIntObjectMap;
    }

    public final int dataIndex(int i, int[] iArr) {
        if (i >= getCapacity()) {
            return this.slots.length - this.slotsGapLen;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.slots.length - this.slotsGapLen) + i2 + 1 : i2;
    }

    public final int dataIndexToDataAddress(int i) {
        return (this.slotsGapLen * (i < this.slotsGapStart ? 0 : 1)) + i;
    }

    public final void endGroup() {
        MutableObjectList mutableObjectList;
        boolean z = this.insertCount > 0;
        int i = this.currentGroup;
        int i2 = this.currentGroupEnd;
        int i3 = this.parent;
        int groupIndexToAddress = groupIndexToAddress(i3);
        int i4 = this.nodeCount;
        int i5 = i - i3;
        int i6 = groupIndexToAddress * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.groups[i7] & 1073741824) != 0;
        IntStack intStack = this.nodeCountStack;
        if (z) {
            MutableIntObjectMap mutableIntObjectMap = this.deferredSlotWrites;
            if (mutableIntObjectMap != null && (mutableObjectList = (MutableObjectList) mutableIntObjectMap.get(i3)) != null) {
                Object[] objArr = mutableObjectList.content;
                int i8 = mutableObjectList._size;
                for (int i9 = 0; i9 < i8; i9++) {
                    rawUpdate(objArr[i9]);
                }
            }
            int[] iArr = this.groups;
            iArr[i6 + 3] = i5;
            SlotTableKt.access$updateNodeCount(groupIndexToAddress, i4, iArr);
            int pop = intStack.pop();
            if (z2) {
                i4 = 1;
            }
            this.nodeCount = pop + i4;
            int parent = parent(i3, this.groups);
            this.parent = parent;
            int size$runtime = parent < 0 ? getSize$runtime() : groupIndexToAddress(parent + 1);
            int dataIndex = size$runtime >= 0 ? dataIndex(size$runtime, this.groups) : 0;
            this.currentSlot = dataIndex;
            this.currentSlotEnd = dataIndex;
            return;
        }
        if (i != i2) {
            ComposerKt.composeImmediateRuntimeError("Expected to be at the end of a group");
        }
        int[] iArr2 = this.groups;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        SlotTableKt.access$updateNodeCount(groupIndexToAddress, i4, iArr2);
        int pop2 = this.startStack.pop();
        this.currentGroupEnd = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.parent = pop2;
        int parent2 = parent(i3, this.groups);
        int pop3 = intStack.pop();
        this.nodeCount = pop3;
        if (parent2 == pop2) {
            this.nodeCount = pop3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (parent2 != 0 && parent2 != pop2 && (i14 != 0 || i13 != 0)) {
                int groupIndexToAddress2 = groupIndexToAddress(parent2);
                if (i13 != 0) {
                    int[] iArr3 = this.groups;
                    int i15 = (groupIndexToAddress2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.groups;
                    SlotTableKt.access$updateNodeCount(groupIndexToAddress2, (iArr4[(groupIndexToAddress2 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.groups;
                if ((iArr5[(groupIndexToAddress2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                parent2 = parent(parent2, iArr5);
            }
        }
        this.nodeCount += i14;
    }

    public final void endInsert() {
        if (this.insertCount <= 0) {
            PreconditionsKt.throwIllegalStateException("Unbalanced begin/end insert");
        }
        int i = this.insertCount - 1;
        this.insertCount = i;
        if (i == 0) {
            if (this.nodeCountStack.tos != this.startStack.tos) {
                ComposerKt.composeImmediateRuntimeError("startGroup/endGroup mismatch while inserting");
            }
            this.currentGroupEnd = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        }
    }

    public final void ensureStarted(int i) {
        boolean z = false;
        if (!(this.insertCount <= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.parent;
        if (i2 != i) {
            if (i >= i2 && i < this.currentGroupEnd) {
                z = true;
            }
            if (!z) {
                ComposerKt.composeImmediateRuntimeError("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.currentGroup;
            int i4 = this.currentSlot;
            int i5 = this.currentSlotEnd;
            this.currentGroup = i;
            startGroup();
            this.currentGroup = i3;
            this.currentSlot = i4;
            this.currentSlotEnd = i5;
        }
    }

    public final void fixParentAnchorsFor(int i, int i2, int i3) {
        if (i >= this.groupGapStart) {
            i = -((getSize$runtime() - i) + 2);
        }
        while (i3 < i2) {
            this.groups[(groupIndexToAddress(i3) * 5) + 2] = i;
            int i4 = this.groups[(groupIndexToAddress(i3) * 5) + 3] + i3;
            fixParentAnchorsFor(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0136, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void forAllDataInRememberOrder(int i, Function2 function2) {
        int i2;
        int i3;
        int i4;
        Function2 function22 = function2;
        int parent = parent(i, this.groups);
        int size$runtime = getSize$runtime();
        int groupSize = groupSize(i) + i;
        int i5 = i;
        MutableIntSet mutableIntSet = null;
        MutableIntList mutableIntList = null;
        loop0: while (i5 < groupSize) {
            int dataIndex = dataIndex(i5);
            int i6 = i5 + 1;
            int dataIndex2 = dataIndex(i6);
            while (dataIndex < dataIndex2) {
                Object obj = this.slots[dataIndexToDataAddress(dataIndex)];
                if (obj instanceof RememberObserverHolder) {
                    RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                    GapRememberObserverHolder gapRememberObserverHolder = rememberObserverHolder instanceof GapRememberObserverHolder ? (GapRememberObserverHolder) rememberObserverHolder : null;
                    if (gapRememberObserverHolder == null) {
                        ComposerKt.composeRuntimeError("Inconsistent composition");
                        OptionalProvider$$ExternalSyntheticLambda0.m$1();
                        return;
                    }
                    int i7 = gapRememberObserverHolder.afterGroupIndex;
                    if (i7 >= 0) {
                        int groupSize2 = groupSize(i5) + i5;
                        int i8 = i6;
                        int i9 = 0;
                        while (i8 < groupSize2 && i9 < i7) {
                            int groupIndexToAddress = groupIndexToAddress(i8);
                            int i10 = parent;
                            int[] iArr = this.groups;
                            int i11 = groupIndexToAddress * 5;
                            i8 = iArr[i11 + 3] + i8;
                            if (i8 < groupSize2 && (iArr[i11 + 1] & PKIFailureInfo.duplicateCertReq) == 0) {
                                i9++;
                            }
                            parent = i10;
                        }
                        i4 = parent;
                        if (mutableIntSet == null) {
                            int[] iArr2 = IntSetKt.EmptyIntArray;
                            mutableIntSet = new MutableIntSet();
                        }
                        if (mutableIntList == null) {
                            mutableIntList = new MutableIntList();
                        }
                        mutableIntSet.add(i8);
                        mutableIntList.add(i8);
                        mutableIntList.add(dataIndex);
                        dataIndex++;
                        parent = i4;
                    }
                }
                i4 = parent;
                function22.invoke(Integer.valueOf(dataIndex), obj);
                dataIndex++;
                parent = i4;
            }
            int i12 = parent;
            parent = i6 < size$runtime ? parent(i6, this.groups) : -1;
            if (parent != i5) {
                int i13 = i12;
                while (true) {
                    if (mutableIntList == null || mutableIntSet == null || !mutableIntSet.remove(i5)) {
                        i2 = size$runtime;
                    } else {
                        int i14 = mutableIntList._size;
                        int i15 = i14 / 2;
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < i15) {
                            int i18 = i16 * 2;
                            int i19 = size$runtime;
                            int i20 = mutableIntList.get(i18);
                            if (i20 == i5) {
                                int i21 = mutableIntList.get(i18 + 1);
                                function22.invoke(Integer.valueOf(i21), this.slots[dataIndexToDataAddress(i21)]);
                            } else if (i18 != i17) {
                                int i22 = i17 + 1;
                                mutableIntList.set(i17, i20);
                                i17 += 2;
                                mutableIntList.set(i22, mutableIntList.get(i18 + 1));
                            } else {
                                i17 += 2;
                            }
                            i16++;
                            function22 = function2;
                            size$runtime = i19;
                        }
                        i2 = size$runtime;
                        if (i17 != i14) {
                            if (i17 < 0 || i17 > (i3 = mutableIntList._size) || i14 < 0 || i14 > i3) {
                                break loop0;
                            }
                            if (i14 < i17) {
                                RuntimeHelpersKt.throwIllegalArgumentException("The end index must be < start index");
                                throw null;
                            }
                            if (i14 != i17) {
                                if (i14 < i3) {
                                    int[] iArr3 = mutableIntList.content;
                                    ArraysKt___ArraysJvmKt.copyInto(i17, iArr3, i14, i3, iArr3);
                                }
                                mutableIntList._size -= i14 - i17;
                            }
                        }
                    }
                    if (i5 != i && i13 != parent) {
                        i5 = i13;
                        size$runtime = i2;
                        i13 = parent(i13, this.groups);
                        function22 = function2;
                    }
                }
            } else {
                i2 = size$runtime;
            }
            function22 = function2;
            i5 = i6;
            size$runtime = i2;
        }
    }

    public final int getCapacity() {
        return this.groups.length / 5;
    }

    public final int getSize$runtime() {
        return getCapacity() - this.groupGapLen;
    }

    public final Object groupAux(int i) {
        int groupIndexToAddress = groupIndexToAddress(i);
        int[] iArr = this.groups;
        int i2 = (groupIndexToAddress * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return Composer.Companion.Empty;
        }
        return this.slots[Integer.bitCount(iArr[i2] >> 29) + dataIndex(groupIndexToAddress, iArr)];
    }

    public final int groupIndexToAddress(int i) {
        return (this.groupGapLen * (i < this.groupGapStart ? 0 : 1)) + i;
    }

    public final int groupKey(int i) {
        return this.groups[groupIndexToAddress(i) * 5];
    }

    public final Object groupObjectKey(int i) {
        int groupIndexToAddress = groupIndexToAddress(i);
        int[] iArr = this.groups;
        if ((iArr[(groupIndexToAddress * 5) + 1] & PKIFailureInfo.duplicateCertReq) != 0) {
            return this.slots[SlotTableKt.access$objectKeyIndex(groupIndexToAddress, iArr)];
        }
        return null;
    }

    public final int groupSize(int i) {
        return this.groups[(groupIndexToAddress(i) * 5) + 3];
    }

    public final boolean indexInGroup(int i, int i2) {
        int capacity;
        int groupSize;
        if (i2 == this.parent) {
            capacity = this.currentGroupEnd;
        } else {
            IntStack intStack = this.startStack;
            if (i2 > intStack.peekOr(0)) {
                groupSize = groupSize(i2);
            } else {
                int[] iArr = intStack.slots;
                int min = Math.min(iArr.length, intStack.tos);
                int i3 = 0;
                while (true) {
                    if (i3 >= min) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    groupSize = groupSize(i2);
                } else {
                    capacity = (getCapacity() - this.groupGapLen) - this.endStack.slots[i3];
                }
            }
            capacity = groupSize + i2;
        }
        return i > i2 && i < capacity;
    }

    public final void insertGroups(int i) {
        if (i > 0) {
            int i2 = this.currentGroup;
            moveGroupGapTo(i2);
            int i3 = this.groupGapStart;
            int i4 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                ArraysKt___ArraysJvmKt.copyInto(0, iArr, 0, i3 * 5, iArr2);
                ArraysKt___ArraysJvmKt.copyInto((i3 + i6) * 5, iArr, (i4 + i3) * 5, length * 5, iArr2);
                this.groups = iArr2;
                i4 = i6;
            }
            int i7 = this.currentGroupEnd;
            if (i7 >= i3) {
                this.currentGroupEnd = i7 + i;
            }
            int i8 = i3 + i;
            this.groupGapStart = i8;
            this.groupGapLen = i4 - i;
            int dataIndexToDataAnchor = dataIndexToDataAnchor(i5 > 0 ? dataIndex(i2 + i) : 0, this.slotsGapOwner >= i3 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.groups[(i9 * 5) + 4] = dataIndexToDataAnchor;
            }
            int i10 = this.slotsGapOwner;
            if (i10 >= i3) {
                this.slotsGapOwner = i10 + i;
            }
        }
    }

    public final void insertSlots(int i, int i2) {
        if (i > 0) {
            moveSlotGapTo(this.currentSlot, i2);
            int i3 = this.slotsGapStart;
            int i4 = this.slotsGapLen;
            if (i4 < i) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.slots = objArr2;
                i4 = i7;
            }
            int i9 = this.currentSlotEnd;
            if (i9 >= i3) {
                this.currentSlotEnd = i9 + i;
            }
            this.slotsGapStart = i3 + i;
            this.slotsGapLen = i4 - i;
        }
    }

    public final boolean isNode(int i) {
        return (this.groups[(groupIndexToAddress(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void moveFrom(SlotTable slotTable, int i) {
        if (this.insertCount <= 0) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (i == 0 && this.currentGroup == 0 && this.table.groupsSize == 0) {
            int[] iArr = slotTable.groups;
            int i2 = iArr[(i * 5) + 3];
            int i3 = slotTable.groupsSize;
            if (i2 == i3) {
                int[] iArr2 = this.groups;
                Object[] objArr = this.slots;
                ArrayList arrayList = this.anchors;
                HashMap hashMap = this.sourceInformationMap;
                MutableIntObjectMap mutableIntObjectMap = this.calledByMap;
                Object[] objArr2 = slotTable.slots;
                int i4 = slotTable.slotsSize;
                HashMap hashMap2 = slotTable.sourceInformationMap;
                MutableIntObjectMap mutableIntObjectMap2 = slotTable.calledByMap;
                this.groups = iArr;
                this.slots = objArr2;
                this.anchors = slotTable.anchors;
                this.groupGapStart = i3;
                this.groupGapLen = (iArr.length / 5) - i3;
                this.slotsGapStart = i4;
                this.slotsGapLen = objArr2.length - i4;
                this.slotsGapOwner = i3;
                this.sourceInformationMap = hashMap2;
                this.calledByMap = mutableIntObjectMap2;
                slotTable.groups = iArr2;
                slotTable.groupsSize = 0;
                slotTable.slots = objArr;
                slotTable.slotsSize = 0;
                slotTable.anchors = arrayList;
                slotTable.sourceInformationMap = hashMap;
                slotTable.calledByMap = mutableIntObjectMap;
                return;
            }
        }
        SlotWriter openWriter = slotTable.openWriter();
        try {
            Trace.moveGroup(openWriter, i, this, true, true, false);
            openWriter.close(true);
        } catch (Throwable th) {
            openWriter.close(false);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r2 = r8.groups;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r4 + r3, r2, r3, r5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        kotlin.collections.ArraysKt___ArraysJvmKt.copyInto(r5, r2, r5 + r4, r3 + r4, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void moveGroupGapTo(int i) {
        GapAnchor gapAnchor;
        int i2;
        GapAnchor gapAnchor2;
        int i3;
        int i4;
        int i5 = this.groupGapLen;
        int i6 = this.groupGapStart;
        if (i6 != i) {
            if (!this.anchors.isEmpty()) {
                int capacity = getCapacity() - this.groupGapLen;
                ArrayList arrayList = this.anchors;
                if (i6 < i) {
                    for (int access$locationOf = SlotTableKt.access$locationOf(arrayList, i6, capacity); access$locationOf < this.anchors.size() && (i3 = (gapAnchor2 = (GapAnchor) this.anchors.get(access$locationOf)).location) < 0 && (i4 = i3 + capacity) < i; access$locationOf++) {
                        gapAnchor2.location = i4;
                    }
                } else {
                    for (int access$locationOf2 = SlotTableKt.access$locationOf(arrayList, i, capacity); access$locationOf2 < this.anchors.size() && (i2 = (gapAnchor = (GapAnchor) this.anchors.get(access$locationOf2)).location) >= 0; access$locationOf2++) {
                        gapAnchor.location = -(capacity - i2);
                    }
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int capacity2 = getCapacity();
            if (i6 >= capacity2) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            while (i6 < capacity2) {
                int i7 = (i6 * 5) + 2;
                int i8 = this.groups[i7];
                int size$runtime = i8 > -2 ? i8 : (getSize$runtime() + i8) - (-2);
                if (size$runtime >= i) {
                    size$runtime = -((getSize$runtime() - size$runtime) - (-2));
                }
                if (size$runtime != i8) {
                    this.groups[i7] = size$runtime;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.groupGapStart = i;
    }

    public final void moveSlotGapTo(int i, int i2) {
        int i3 = this.slotsGapLen;
        int i4 = this.slotsGapStart;
        int i5 = this.slotsGapOwner;
        if (i4 != i) {
            Object[] objArr = this.slots;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = Math.min(i2 + 1, getSize$runtime());
        if (i5 != min) {
            int length = this.slots.length - i3;
            if (min < i5) {
                int groupIndexToAddress = groupIndexToAddress(min);
                int groupIndexToAddress2 = groupIndexToAddress(i5);
                int i7 = this.groupGapStart;
                while (groupIndexToAddress < groupIndexToAddress2) {
                    int i8 = (groupIndexToAddress * 5) + 4;
                    int i9 = this.groups[i8];
                    if (i9 < 0) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a positive anchor");
                    }
                    this.groups[i8] = -((length - i9) + 1);
                    groupIndexToAddress++;
                    if (groupIndexToAddress == i7) {
                        groupIndexToAddress += this.groupGapLen;
                    }
                }
            } else {
                int groupIndexToAddress3 = groupIndexToAddress(i5);
                int groupIndexToAddress4 = groupIndexToAddress(min);
                while (groupIndexToAddress3 < groupIndexToAddress4) {
                    int i10 = (groupIndexToAddress3 * 5) + 4;
                    int i11 = this.groups[i10];
                    if (i11 >= 0) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a negative anchor");
                    }
                    this.groups[i10] = i11 + length + 1;
                    groupIndexToAddress3++;
                    if (groupIndexToAddress3 == this.groupGapStart) {
                        groupIndexToAddress3 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = min;
        }
        this.slotsGapStart = i;
    }

    public final Object node(int i) {
        int groupIndexToAddress = groupIndexToAddress(i);
        int[] iArr = this.groups;
        if ((iArr[(groupIndexToAddress * 5) + 1] & 1073741824) != 0) {
            return this.slots[dataIndexToDataAddress(dataIndex(groupIndexToAddress, iArr))];
        }
        return null;
    }

    public final int parent(int i, int[] iArr) {
        int i2 = iArr[(groupIndexToAddress(i) * 5) + 2];
        return i2 > -2 ? i2 : (getSize$runtime() + i2) - (-2);
    }

    public final Object rawUpdate(Object obj) {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i = this.currentSlot;
        this.currentSlot = i + 1;
        Object obj2 = objArr[dataIndexToDataAddress(i)];
        if (this.currentSlot > this.currentSlotEnd) {
            ComposerKt.composeImmediateRuntimeError("Writing to an invalid slot");
        }
        this.slots[dataIndexToDataAddress(this.currentSlot - 1)] = obj;
        return obj2;
    }

    public final void recalculateMarks() {
        int i;
        MutableIntList mutableIntList = this.pendingRecalculateMarks;
        if (mutableIntList != null) {
            while (mutableIntList._size != 0) {
                int m1175takeMaximpl = TransactorKt.m1175takeMaximpl(mutableIntList);
                int groupIndexToAddress = groupIndexToAddress(m1175takeMaximpl);
                int i2 = m1175takeMaximpl + 1;
                int groupSize = groupSize(m1175takeMaximpl) + m1175takeMaximpl;
                while (true) {
                    if (i2 >= groupSize) {
                        i = 0;
                        break;
                    } else {
                        if ((this.groups[(groupIndexToAddress(i2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i2 += groupSize(i2);
                    }
                }
                int[] iArr = this.groups;
                int i3 = (groupIndexToAddress * 5) + 1;
                int i4 = iArr[i3];
                if (((67108864 & i4) != 0 ? 1 : 0) != i) {
                    iArr[i3] = (i << 26) | ((-67108865) & i4);
                    int parent = parent(m1175takeMaximpl, iArr);
                    if (parent >= 0) {
                        TransactorKt.m1171addimpl(mutableIntList, parent);
                    }
                }
            }
        }
    }

    public final boolean removeGroup() {
        if (this.insertCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot remove group while inserting");
        }
        int i = this.currentGroup;
        int i2 = this.currentSlot;
        int dataIndex = dataIndex(groupIndexToAddress(i), this.groups);
        int skipGroup = skipGroup();
        sourceInformationOf$runtime(this.parent);
        MutableIntList mutableIntList = this.pendingRecalculateMarks;
        if (mutableIntList != null) {
            while (true) {
                int i3 = mutableIntList._size;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    RuntimeHelpersKt.throwNoSuchElementException("IntList is empty.");
                    throw null;
                }
                if (mutableIntList.content[0] < i) {
                    break;
                }
                TransactorKt.m1175takeMaximpl(mutableIntList);
            }
        }
        boolean removeGroups = removeGroups(i, this.currentGroup - i);
        removeSlots(dataIndex, this.currentSlot - dataIndex, i - 1);
        this.currentGroup = i;
        this.currentSlot = i2;
        this.nodeCount -= skipGroup;
        return removeGroups;
    }

    public final boolean removeGroups(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.anchors;
            moveGroupGapTo(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.sourceInformationMap;
                int i3 = i + i2;
                int access$locationOf = SlotTableKt.access$locationOf(this.anchors, i3, getCapacity() - this.groupGapLen);
                if (access$locationOf >= this.anchors.size()) {
                    access$locationOf--;
                }
                int i4 = access$locationOf + 1;
                int i5 = 0;
                while (access$locationOf >= 0) {
                    GapAnchor gapAnchor = (GapAnchor) this.anchors.get(access$locationOf);
                    int anchorIndex = anchorIndex(gapAnchor);
                    if (anchorIndex < i) {
                        break;
                    }
                    if (anchorIndex < i3) {
                        gapAnchor.location = PKIFailureInfo.systemUnavail;
                        if (hashMap != null) {
                        }
                        if (i5 == 0) {
                            i5 = access$locationOf + 1;
                        }
                        i4 = access$locationOf;
                    }
                    access$locationOf--;
                }
                r0 = i4 < i5;
                if (r0) {
                    this.anchors.subList(i4, i5).clear();
                }
            }
            this.groupGapStart = i;
            this.groupGapLen += i2;
            int i6 = this.slotsGapOwner;
            if (i6 > i) {
                this.slotsGapOwner = Math.max(i, i6 - i2);
            }
            int i7 = this.currentGroupEnd;
            if (i7 >= this.groupGapStart) {
                this.currentGroupEnd = i7 - i2;
            }
            int i8 = this.parent;
            if (i8 >= 0 && (this.groups[(groupIndexToAddress(i8) * 5) + 1] & 67108864) != 0) {
                updateContainsMark(i8);
            }
        }
        return r0;
    }

    public final void removeSlots(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.slotsGapLen;
            int i5 = i + i2;
            moveSlotGapTo(i5, i3);
            this.slotsGapStart = i;
            this.slotsGapLen = i4 + i2;
            Arrays.fill(this.slots, i, i5, (Object) null);
            int i6 = this.currentSlotEnd;
            if (i6 >= i) {
                this.currentSlotEnd = i6 - i2;
            }
        }
    }

    public final Object set(int i, int i2, Object obj) {
        int slotIndex = slotIndex(groupIndexToAddress(i), this.groups);
        int dataIndex = dataIndex(groupIndexToAddress(i + 1), this.groups);
        int i3 = slotIndex + i2;
        if (i3 < slotIndex || i3 >= dataIndex) {
            ComposerKt.composeImmediateRuntimeError("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int dataIndexToDataAddress = dataIndexToDataAddress(i3);
        Object[] objArr = this.slots;
        Object obj2 = objArr[dataIndexToDataAddress];
        objArr[dataIndexToDataAddress] = obj;
        return obj2;
    }

    public final int skipGroup() {
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int i = this.currentGroup;
        int[] iArr = this.groups;
        int i2 = groupIndexToAddress * 5;
        int i3 = iArr[i2 + 3] + i;
        this.currentGroup = i3;
        this.currentSlot = dataIndex(groupIndexToAddress(i3), iArr);
        int i4 = this.groups[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void skipToGroupEnd() {
        int i = this.currentGroupEnd;
        this.currentGroup = i;
        this.currentSlot = dataIndex(groupIndexToAddress(i), this.groups);
    }

    public final int slotIndex(int i, int[] iArr) {
        if (i >= getCapacity()) {
            return this.slots.length - this.slotsGapLen;
        }
        int access$slotAnchor = SlotTableKt.access$slotAnchor(i, iArr);
        return access$slotAnchor < 0 ? (this.slots.length - this.slotsGapLen) + access$slotAnchor + 1 : access$slotAnchor;
    }

    public final GapGroupSourceInformation sourceInformationOf$runtime(int i) {
        GapAnchor tryAnchor$runtime;
        HashMap hashMap = this.sourceInformationMap;
        if (hashMap == null || (tryAnchor$runtime = tryAnchor$runtime(i)) == null) {
            return null;
        }
        return (GapGroupSourceInformation) hashMap.get(tryAnchor$runtime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void startGroup(Object obj, Object obj2, boolean z, int i) {
        int i2;
        int i3 = this.parent;
        Object[] objArr = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (objArr == true) {
            int i4 = this.currentGroup;
            int dataIndex = dataIndex(groupIndexToAddress(i4), this.groups);
            insertGroups(1);
            this.currentSlot = dataIndex;
            this.currentSlotEnd = dataIndex;
            int groupIndexToAddress = groupIndexToAddress(i4);
            int i5 = obj != neverEqualPolicy ? 1 : 0;
            int i6 = (z || obj2 == neverEqualPolicy) ? 0 : 1;
            int dataIndexToDataAnchor = dataIndexToDataAnchor(dataIndex, this.slotsGapStart, this.slotsGapLen, this.slots.length);
            if (dataIndexToDataAnchor >= 0 && this.slotsGapOwner < i4) {
                dataIndexToDataAnchor = -(((this.slots.length - this.slotsGapLen) - dataIndexToDataAnchor) + 1);
            }
            int[] iArr = this.groups;
            int i7 = this.parent;
            int i8 = groupIndexToAddress * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = dataIndexToDataAnchor;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                insertSlots(i9, i4);
                Object[] objArr2 = this.slots;
                int i10 = this.currentSlot;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.currentSlot = i10;
            }
            this.nodeCount = 0;
            i2 = i4 + 1;
            this.parent = i4;
            this.currentGroup = i2;
            if (i3 >= 0) {
                sourceInformationOf$runtime(i3);
            }
        } else {
            this.startStack.push(i3);
            this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
            int i11 = this.currentGroup;
            int groupIndexToAddress2 = groupIndexToAddress(i11);
            if (!Intrinsics.areEqual(obj2, neverEqualPolicy)) {
                if (z) {
                    updateNodeOfGroup(this.currentGroup, obj2);
                } else {
                    updateAux(obj2);
                }
            }
            this.currentSlot = slotIndex(groupIndexToAddress2, this.groups);
            this.currentSlotEnd = dataIndex(groupIndexToAddress(this.currentGroup + 1), this.groups);
            int[] iArr2 = this.groups;
            int i12 = groupIndexToAddress2 * 5;
            this.nodeCount = iArr2[i12 + 1] & 67108863;
            this.parent = i11;
            this.currentGroup = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.currentGroupEnd = i2;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    public final GapAnchor tryAnchor$runtime(int i) {
        ArrayList arrayList;
        int search;
        if (i < 0 || i >= getSize$runtime() || (search = SlotTableKt.search((arrayList = this.anchors), i, getSize$runtime())) < 0) {
            return null;
        }
        return (GapAnchor) arrayList.get(search);
    }

    public final void updateAux(Object obj) {
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int i = (groupIndexToAddress * 5) + 1;
        if ((this.groups[i] & 268435456) == 0) {
            ComposerKt.composeImmediateRuntimeError("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.slots;
        int[] iArr = this.groups;
        objArr[dataIndexToDataAddress(Integer.bitCount(iArr[i] >> 29) + dataIndex(groupIndexToAddress, iArr))] = obj;
    }

    public final void updateContainsMark(int i) {
        if (i >= 0) {
            MutableIntList mutableIntList = this.pendingRecalculateMarks;
            if (mutableIntList == null) {
                mutableIntList = new MutableIntList();
                this.pendingRecalculateMarks = mutableIntList;
            }
            TransactorKt.m1171addimpl(mutableIntList, i);
        }
    }

    public final void updateNodeOfGroup(int i, Object obj) {
        int groupIndexToAddress = groupIndexToAddress(i);
        int[] iArr = this.groups;
        if (groupIndexToAddress >= iArr.length || (iArr[(groupIndexToAddress * 5) + 1] & 1073741824) == 0) {
            ComposerKt.composeImmediateRuntimeError("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.slots[dataIndexToDataAddress(dataIndex(groupIndexToAddress, this.groups))] = obj;
    }

    public final int dataIndex(int i) {
        return dataIndex(groupIndexToAddress(i), this.groups);
    }

    public final void startGroup() {
        if (this.insertCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Key must be supplied when inserting");
        }
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        startGroup(neverEqualPolicy, neverEqualPolicy, false, 0);
    }
}
