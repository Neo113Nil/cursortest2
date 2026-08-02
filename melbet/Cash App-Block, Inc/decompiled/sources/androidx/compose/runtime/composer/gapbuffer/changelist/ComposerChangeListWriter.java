package androidx.compose.runtime.composer.gapbuffer.changelist;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.composer.gapbuffer.SlotReader;
import androidx.compose.runtime.composer.gapbuffer.changelist.Operation;
import androidx.room.util.DBUtil;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ComposerChangeListWriter {
    public ChangeList changeList;
    public final GapComposer composer;
    public int moveCount;
    public int pendingUps;
    public boolean startedGroup;
    public int writersReaderDelta;
    public final IntStack startedGroups = new IntStack(0, false);
    public boolean implicitRootStart = true;
    public final ArrayList pendingDownNodes = new ArrayList();
    public int removeFrom = -1;
    public int moveFrom = -1;
    public int moveTo = -1;

    public ComposerChangeListWriter(GapComposer gapComposer, ChangeList changeList) {
        this.composer = gapComposer;
        this.changeList = changeList;
    }

    public final void moveUp() {
        realizeNodeMovementOperations();
        ArrayList arrayList = this.pendingDownNodes;
        if (arrayList.isEmpty()) {
            this.pendingUps++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void pushPendingUpsAndDowns() {
        int i = this.pendingUps;
        if (i > 0) {
            Operations operations2 = this.changeList.f854operations;
            operations2.pushOp(Operation.Ups.INSTANCE);
            operations2.intArgs[operations2.intArgsSize - operations2.opCodes[operations2.opCodesSize - 1].ints] = i;
            this.pendingUps = 0;
        }
        ArrayList arrayList = this.pendingDownNodes;
        if (arrayList.isEmpty()) {
            return;
        }
        ChangeList changeList = this.changeList;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        changeList.getClass();
        if (size != 0) {
            Operations operations3 = changeList.f854operations;
            operations3.pushOp(Operation.Downs.INSTANCE);
            DBUtil.m1186setObjectsGr0YRc(operations3, 0, objArr);
        }
        arrayList.clear();
    }

    public final void realizeNodeMovementOperations() {
        int i = this.moveCount;
        if (i > 0) {
            int i2 = this.removeFrom;
            if (i2 >= 0) {
                pushPendingUpsAndDowns();
                Operations operations2 = this.changeList.f854operations;
                operations2.pushOp(Operation.RemoveNode.INSTANCE);
                int i3 = operations2.intArgsSize - operations2.opCodes[operations2.opCodesSize - 1].ints;
                int[] iArr = operations2.intArgs;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.removeFrom = -1;
            } else {
                int i4 = this.moveTo;
                int i5 = this.moveFrom;
                pushPendingUpsAndDowns();
                Operations operations3 = this.changeList.f854operations;
                operations3.pushOp(Operation.MoveNode.INSTANCE);
                int i6 = operations3.intArgsSize - operations3.opCodes[operations3.opCodesSize - 1].ints;
                int[] iArr2 = operations3.intArgs;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.moveFrom = -1;
                this.moveTo = -1;
            }
            this.moveCount = 0;
        }
    }

    public final void realizeOperationLocation(boolean z) {
        SlotReader slotReader = this.composer.reader;
        int i = z ? slotReader.parent : slotReader.currentGroup;
        int i2 = i - this.writersReaderDelta;
        if (i2 < 0) {
            ComposerKt.composeImmediateRuntimeError("Tried to seek backward");
        }
        if (i2 > 0) {
            Operations operations2 = this.changeList.f854operations;
            operations2.pushOp(Operation.AdvanceSlotsBy.INSTANCE);
            operations2.intArgs[operations2.intArgsSize - operations2.opCodes[operations2.opCodesSize - 1].ints] = i2;
            this.writersReaderDelta = i;
        }
    }

    public final void removeNode(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                ComposerKt.composeImmediateRuntimeError("Invalid remove index " + i);
            }
            if (this.removeFrom == i) {
                this.moveCount += i2;
                return;
            }
            realizeNodeMovementOperations();
            this.removeFrom = i;
            this.moveCount = i2;
        }
    }
}
