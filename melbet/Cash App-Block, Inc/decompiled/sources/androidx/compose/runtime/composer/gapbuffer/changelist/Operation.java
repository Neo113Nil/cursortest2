package androidx.compose.runtime.composer.gapbuffer.changelist;

import androidx.camera.video.Recorder;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.GapRememberObserverHolder;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotTableKt;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.composer.gapbuffer.changelist.Operations;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.PausedCompositionRemembers;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes.dex */
public abstract class Operation {
    public final int ints;
    public final int objects;

    public final class AdvanceSlotsBy extends Operation {
        public static final AdvanceSlotsBy INSTANCE = new AdvanceSlotsBy(1, 0, 2);

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            slotWriter.advanceBy(opIterator.getInt(0));
        }
    }

    public final class AppendValue extends Operation {
        public static final AppendValue INSTANCE = new AppendValue(0, 2, 1);

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            GapAnchor gapAnchor = (GapAnchor) opIterator.m580getObjectPtLUHM(0);
            Object m580getObjectPtLUHM = opIterator.m580getObjectPtLUHM(1);
            if (m580getObjectPtLUHM instanceof RememberObserverHolder) {
                RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) m580getObjectPtLUHM;
                ((MutableVector) rememberEventDispatcher.currentRememberingList).add(rememberObserverHolder);
                ((MutableScatterSet) rememberEventDispatcher.rememberSet).add(rememberObserverHolder);
            }
            if (slotWriter.insertCount != 0) {
                ComposerKt.composeImmediateRuntimeError("Can only append a slot if not current inserting");
            }
            int i = slotWriter.currentSlot;
            int i2 = slotWriter.currentSlotEnd;
            int anchorIndex = slotWriter.anchorIndex(gapAnchor);
            int dataIndex = slotWriter.dataIndex(slotWriter.groupIndexToAddress(anchorIndex + 1), slotWriter.groups);
            slotWriter.currentSlot = dataIndex;
            slotWriter.currentSlotEnd = dataIndex;
            slotWriter.insertSlots(1, anchorIndex);
            if (i >= dataIndex) {
                i++;
                i2++;
            }
            slotWriter.slots[dataIndex] = m580getObjectPtLUHM;
            slotWriter.currentSlot = i;
            slotWriter.currentSlotEnd = i2;
        }
    }

    /* loaded from: classes3.dex */
    public final class ApplyChangeList extends Operation {
        public static final ApplyChangeList INSTANCE = new ApplyChangeList(0, 2, 1);

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            IntRef intRef = (IntRef) opIterator.m580getObjectPtLUHM(1);
            int i = intRef != null ? intRef.element : 0;
            ChangeList changeList = (ChangeList) opIterator.m580getObjectPtLUHM(0);
            if (i > 0) {
                applier = new OffsetApplier(applier, i);
            }
            changeList.executeAndFlushAllPendingChanges(applier, slotWriter, rememberEventDispatcher, operationErrorContext != null ? new Recorder.AnonymousClass1(18, operationErrorContext, slotWriter) : null);
        }
    }

    /* loaded from: classes3.dex */
    public final class CopyNodesToNewAnchorLocation extends Operation {
        public static final CopyNodesToNewAnchorLocation INSTANCE = new CopyNodesToNewAnchorLocation(0, 2, 1);

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            int i = ((IntRef) opIterator.m580getObjectPtLUHM(0)).element;
            List list = (List) opIterator.m580getObjectPtLUHM(1);
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                int i3 = i + i2;
                applier.insertBottomUp(i3, obj);
                applier.insertTopDown(i3, obj);
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class CopySlotTableToAnchorLocation extends Operation {
        public static final CopySlotTableToAnchorLocation INSTANCE = new CopySlotTableToAnchorLocation(0, 4, 1);

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) opIterator.m580getObjectPtLUHM(2);
            CompositionContext compositionContext = (CompositionContext) opIterator.m580getObjectPtLUHM(1);
            compositionContext.movableContentStateResolve$runtime(movableContentStateReference);
            ComposerKt.composeRuntimeError("Could not resolve state for movable content");
            OptionalProvider$$ExternalSyntheticLambda0.m$1();
        }
    }

    /* loaded from: classes3.dex */
    public final class DeactivateCurrentGroup extends Operation {
        public static final DeactivateCurrentGroup INSTANCE;

        static {
            int i = 0;
            INSTANCE = new DeactivateCurrentGroup(i, i, 3);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            slotWriter.forAllDataInRememberOrder(slotWriter.currentGroup, new TextKt$$ExternalSyntheticLambda0(23, rememberEventDispatcher, slotWriter));
        }
    }

    /* loaded from: classes3.dex */
    public final class DetermineMovableContentNodeIndex extends Operation {
        public static final DetermineMovableContentNodeIndex INSTANCE = new DetermineMovableContentNodeIndex(0, 2, 1);

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            int i;
            IntRef intRef = (IntRef) opIterator.m580getObjectPtLUHM(0);
            int anchorIndex = slotWriter.anchorIndex((GapAnchor) opIterator.m580getObjectPtLUHM(1));
            if (slotWriter.currentGroup >= anchorIndex) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            zzadt.positionToParentOf(slotWriter, applier, anchorIndex);
            int i2 = slotWriter.currentGroup;
            int i3 = slotWriter.parent;
            while (i3 >= 0 && !slotWriter.isNode(i3)) {
                i3 = slotWriter.parent(i3, slotWriter.groups);
            }
            int i4 = i3 + 1;
            int i5 = 0;
            while (i4 < i2) {
                if (slotWriter.indexInGroup(i2, i4)) {
                    if (slotWriter.isNode(i4)) {
                        i5 = 0;
                    }
                    i4++;
                } else {
                    i5 += slotWriter.isNode(i4) ? 1 : slotWriter.groups[(slotWriter.groupIndexToAddress(i4) * 5) + 1] & 67108863;
                    i4 += slotWriter.groupSize(i4);
                }
            }
            while (true) {
                i = slotWriter.currentGroup;
                if (i >= anchorIndex) {
                    break;
                }
                if (slotWriter.indexInGroup(anchorIndex, i)) {
                    int i6 = slotWriter.currentGroup;
                    if (i6 < slotWriter.currentGroupEnd && (slotWriter.groups[(slotWriter.groupIndexToAddress(i6) * 5) + 1] & 1073741824) != 0) {
                        applier.down(slotWriter.node(slotWriter.currentGroup));
                        i5 = 0;
                    }
                    slotWriter.startGroup();
                } else {
                    i5 += slotWriter.skipGroup();
                }
            }
            if (i != anchorIndex) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            intRef.element = i5;
        }
    }

    public final class Downs extends Operation {
        public static final Downs INSTANCE;

        static {
            int i = 1;
            INSTANCE = new Downs(0, i, i);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            for (Object obj : (Object[]) opIterator.m580getObjectPtLUHM(0)) {
                applier.down(obj);
            }
        }
    }

    public final class EndCompositionScope extends Operation {
        public static final EndCompositionScope INSTANCE = new EndCompositionScope(0, 2, 1);

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            ((Function1) opIterator.m580getObjectPtLUHM(0)).invoke((Composition) opIterator.m580getObjectPtLUHM(1));
        }
    }

    public final class EndCurrentGroup extends Operation {
        public static final EndCurrentGroup INSTANCE;

        static {
            int i = 0;
            INSTANCE = new EndCurrentGroup(i, i, 3);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            slotWriter.endGroup();
        }
    }

    /* loaded from: classes3.dex */
    public final class EndMovableContentPlacement extends Operation {
        public static final EndMovableContentPlacement INSTANCE;

        static {
            int i = 0;
            INSTANCE = new EndMovableContentPlacement(i, i, 3);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            zzadt.positionToParentOf(slotWriter, applier, 0);
            slotWriter.endGroup();
        }
    }

    /* loaded from: classes3.dex */
    public final class EndResumingScope extends Operation {
        public static final EndResumingScope INSTANCE;

        static {
            int i = 1;
            INSTANCE = new EndResumingScope(0, i, i);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            MutableVector mutableVector;
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) opIterator.m580getObjectPtLUHM(0);
            MutableScatterMap mutableScatterMap = (MutableScatterMap) rememberEventDispatcher.pausedPlaceholders;
            if (mutableScatterMap == null || ((PausedCompositionRemembers) mutableScatterMap.get(recomposeScopeImpl)) == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) rememberEventDispatcher.nestedRemembersLists;
            if (arrayList != null && (mutableVector = (MutableVector) arrayList.remove(arrayList.size() - 1)) != null) {
                rememberEventDispatcher.currentRememberingList = mutableVector;
            }
            mutableScatterMap.remove(recomposeScopeImpl);
        }
    }

    public final class EnsureGroupStarted extends Operation {
        public static final EnsureGroupStarted INSTANCE;

        static {
            int i = 1;
            INSTANCE = new EnsureGroupStarted(0, i, i);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            GapAnchor gapAnchor = (GapAnchor) opIterator.m580getObjectPtLUHM(0);
            gapAnchor.getClass();
            slotWriter.ensureStarted(slotWriter.anchorIndex(gapAnchor));
        }
    }

    public final class EnsureRootGroupStarted extends Operation {
        public static final EnsureRootGroupStarted INSTANCE;

        static {
            int i = 0;
            INSTANCE = new EnsureRootGroupStarted(i, i, 3);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            slotWriter.ensureStarted(0);
        }
    }

    public final class InsertSlots extends Operation {
        public static final InsertSlots INSTANCE = new InsertSlots(0, 2, 1);

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            SlotTable slotTable = (SlotTable) opIterator.m580getObjectPtLUHM(1);
            GapAnchor gapAnchor = (GapAnchor) opIterator.m580getObjectPtLUHM(0);
            slotWriter.beginInsert();
            gapAnchor.getClass();
            slotWriter.moveFrom(slotTable, slotTable.anchorIndex(gapAnchor));
            slotWriter.endInsert();
        }
    }

    public final class InsertSlotsWithFixups extends Operation {
        public static final InsertSlotsWithFixups INSTANCE = new InsertSlotsWithFixups(0, 3, 1);

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            Recorder.AnonymousClass1 access$withCurrentStackTrace;
            SlotTable slotTable = (SlotTable) opIterator.m580getObjectPtLUHM(1);
            GapAnchor gapAnchor = (GapAnchor) opIterator.m580getObjectPtLUHM(0);
            FixupList fixupList = (FixupList) opIterator.m580getObjectPtLUHM(2);
            SlotWriter openWriter = slotTable.openWriter();
            if (operationErrorContext != null) {
                try {
                    access$withCurrentStackTrace = zzadt.access$withCurrentStackTrace(operationErrorContext, slotWriter);
                } catch (Throwable th) {
                    openWriter.close(false);
                    throw th;
                }
            } else {
                access$withCurrentStackTrace = null;
            }
            if (!fixupList.pendingOperations.isEmpty()) {
                ComposerKt.composeImmediateRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
            }
            fixupList.f855operations.executeAndFlushAllPendingOperations(applier, openWriter, rememberEventDispatcher, access$withCurrentStackTrace);
            openWriter.close(true);
            slotWriter.beginInsert();
            gapAnchor.getClass();
            slotWriter.moveFrom(slotTable, slotTable.anchorIndex(gapAnchor));
            slotWriter.endInsert();
        }
    }

    public final class MoveCurrentGroup extends Operation {
        public static final MoveCurrentGroup INSTANCE = new MoveCurrentGroup(1, 0, 2);

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            int[] iArr;
            GapAnchor gapAnchor;
            int anchorIndex;
            int i = opIterator.getInt(0);
            if (slotWriter.insertCount != 0) {
                ComposerKt.composeImmediateRuntimeError("Cannot move a group while inserting");
            }
            if (i < 0) {
                ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
            }
            if (i == 0) {
                return;
            }
            int i2 = slotWriter.currentGroup;
            int i3 = slotWriter.parent;
            int i4 = slotWriter.currentGroupEnd;
            int i5 = i2;
            while (true) {
                iArr = slotWriter.groups;
                if (i <= 0) {
                    break;
                }
                i5 += iArr[(slotWriter.groupIndexToAddress(i5) * 5) + 3];
                if (i5 > i4) {
                    ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
                }
                i--;
            }
            int i6 = iArr[(slotWriter.groupIndexToAddress(i5) * 5) + 3];
            int dataIndex = slotWriter.dataIndex(slotWriter.groupIndexToAddress(slotWriter.currentGroup), slotWriter.groups);
            int dataIndex2 = slotWriter.dataIndex(slotWriter.groupIndexToAddress(i5), slotWriter.groups);
            int i7 = i5 + i6;
            int dataIndex3 = slotWriter.dataIndex(slotWriter.groupIndexToAddress(i7), slotWriter.groups);
            int i8 = dataIndex3 - dataIndex2;
            slotWriter.insertSlots(i8, Math.max(slotWriter.currentGroup - 1, 0));
            slotWriter.insertGroups(i6);
            int[] iArr2 = slotWriter.groups;
            int groupIndexToAddress = slotWriter.groupIndexToAddress(i7) * 5;
            ArraysKt___ArraysJvmKt.copyInto(slotWriter.groupIndexToAddress(i2) * 5, iArr2, groupIndexToAddress, (i6 * 5) + groupIndexToAddress, iArr2);
            if (i8 > 0) {
                Object[] objArr = slotWriter.slots;
                int dataIndexToDataAddress = slotWriter.dataIndexToDataAddress(dataIndex2 + i8);
                System.arraycopy(objArr, dataIndexToDataAddress, objArr, dataIndex, slotWriter.dataIndexToDataAddress(dataIndex3 + i8) - dataIndexToDataAddress);
            }
            int i9 = dataIndex2 + i8;
            int i10 = i9 - dataIndex;
            int i11 = slotWriter.slotsGapStart;
            int i12 = slotWriter.slotsGapLen;
            int length = slotWriter.slots.length;
            int i13 = slotWriter.slotsGapOwner;
            int i14 = i2 + i6;
            int i15 = i2;
            while (i15 < i14) {
                int groupIndexToAddress2 = slotWriter.groupIndexToAddress(i15);
                int i16 = i10;
                int[] iArr3 = iArr2;
                iArr3[(groupIndexToAddress2 * 5) + 4] = SlotWriter.dataIndexToDataAnchor(SlotWriter.dataIndexToDataAnchor(slotWriter.dataIndex(groupIndexToAddress2, iArr2) - i16, i13 < groupIndexToAddress2 ? 0 : i11, i12, length), slotWriter.slotsGapStart, slotWriter.slotsGapLen, slotWriter.slots.length);
                i15++;
                i10 = i16;
                iArr2 = iArr3;
                i11 = i11;
            }
            int i17 = i7 + i6;
            int size$runtime = slotWriter.getSize$runtime();
            int access$locationOf = SlotTableKt.access$locationOf(slotWriter.anchors, i7, size$runtime);
            ArrayList arrayList = new ArrayList();
            if (access$locationOf >= 0) {
                while (access$locationOf < slotWriter.anchors.size() && (anchorIndex = slotWriter.anchorIndex((gapAnchor = (GapAnchor) slotWriter.anchors.get(access$locationOf)))) >= i7 && anchorIndex < i17) {
                    arrayList.add(gapAnchor);
                }
            }
            int i18 = i2 - i7;
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                GapAnchor gapAnchor2 = (GapAnchor) arrayList.get(i19);
                int anchorIndex2 = slotWriter.anchorIndex(gapAnchor2) + i18;
                if (anchorIndex2 >= slotWriter.groupGapStart) {
                    gapAnchor2.location = -(size$runtime - anchorIndex2);
                } else {
                    gapAnchor2.location = anchorIndex2;
                }
                slotWriter.anchors.add(SlotTableKt.access$locationOf(slotWriter.anchors, anchorIndex2, size$runtime), gapAnchor2);
            }
            if (slotWriter.removeGroups(i7, i6)) {
                ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
            }
            slotWriter.fixParentAnchorsFor(i3, slotWriter.currentGroupEnd, i2);
            if (i8 > 0) {
                slotWriter.removeSlots(i9, i8, i7 - 1);
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class MoveNode extends Operation {
        public static final MoveNode INSTANCE = new MoveNode(3, 0, 2);

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            applier.move(opIterator.getInt(0), opIterator.getInt(1), opIterator.getInt(2));
        }
    }

    public final class Remember extends Operation {
        public static final Remember INSTANCE;

        static {
            int i = 1;
            INSTANCE = new Remember(0, i, i);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) opIterator.m580getObjectPtLUHM(0);
            ((MutableVector) rememberEventDispatcher.currentRememberingList).add(rememberObserverHolder);
            ((MutableScatterSet) rememberEventDispatcher.rememberSet).add(rememberObserverHolder);
        }
    }

    /* loaded from: classes3.dex */
    public final class RememberPausingScope extends Operation {
        public static final RememberPausingScope INSTANCE;

        static {
            int i = 1;
            INSTANCE = new RememberPausingScope(0, i, i);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) opIterator.m580getObjectPtLUHM(0);
            Set set = (Set) rememberEventDispatcher.abandoning;
            if (set == null) {
                return;
            }
            PausedCompositionRemembers pausedCompositionRemembers = new PausedCompositionRemembers(set);
            MutableScatterMap mutableScatterMap = (MutableScatterMap) rememberEventDispatcher.pausedPlaceholders;
            if (mutableScatterMap == null) {
                long[] jArr = ScatterMapKt.EmptyGroup;
                mutableScatterMap = new MutableScatterMap();
                rememberEventDispatcher.pausedPlaceholders = mutableScatterMap;
            }
            mutableScatterMap.set(recomposeScopeImpl, pausedCompositionRemembers);
            ((MutableVector) rememberEventDispatcher.currentRememberingList).add(new GapRememberObserverHolder(pausedCompositionRemembers, -1));
        }
    }

    public final class RemoveCurrentGroup extends Operation {
        public static final RemoveCurrentGroup INSTANCE;

        static {
            int i = 0;
            INSTANCE = new RemoveCurrentGroup(i, i, 3);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            slotWriter.forAllDataInRememberOrder(slotWriter.currentGroup, new ComposerKt$$ExternalSyntheticLambda0(rememberEventDispatcher, 0));
            slotWriter.removeGroup();
        }
    }

    public final class RemoveNode extends Operation {
        public static final RemoveNode INSTANCE;

        static {
            int i = 2;
            INSTANCE = new RemoveNode(i, 0, i);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            applier.remove(opIterator.getInt(0), opIterator.getInt(1));
        }
    }

    /* loaded from: classes3.dex */
    public final class ResetSlots extends Operation {
        public static final ResetSlots INSTANCE;

        static {
            int i = 0;
            INSTANCE = new ResetSlots(i, i, 3);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            if (slotWriter.insertCount != 0) {
                ComposerKt.composeImmediateRuntimeError("Cannot reset when inserting");
            }
            slotWriter.recalculateMarks();
            slotWriter.currentGroup = 0;
            slotWriter.currentGroupEnd = slotWriter.getCapacity() - slotWriter.groupGapLen;
            slotWriter.currentSlot = 0;
            slotWriter.currentSlotEnd = 0;
            slotWriter.nodeCount = 0;
        }
    }

    public final class SideEffect extends Operation {
        public static final SideEffect INSTANCE;

        static {
            int i = 1;
            INSTANCE = new SideEffect(0, i, i);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            ((MutableVector) rememberEventDispatcher.sideEffects).add((Function0) opIterator.m580getObjectPtLUHM(0));
        }
    }

    /* loaded from: classes3.dex */
    public final class SkipToEndOfCurrentGroup extends Operation {
        public static final SkipToEndOfCurrentGroup INSTANCE;

        static {
            int i = 0;
            INSTANCE = new SkipToEndOfCurrentGroup(i, i, 3);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            slotWriter.skipToGroupEnd();
        }
    }

    /* loaded from: classes3.dex */
    public final class StartResumingScope extends Operation {
        public static final StartResumingScope INSTANCE;

        static {
            int i = 1;
            INSTANCE = new StartResumingScope(0, i, i);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) opIterator.m580getObjectPtLUHM(0);
            MutableScatterMap mutableScatterMap = (MutableScatterMap) rememberEventDispatcher.pausedPlaceholders;
            PausedCompositionRemembers pausedCompositionRemembers = mutableScatterMap != null ? (PausedCompositionRemembers) mutableScatterMap.get(recomposeScopeImpl) : null;
            if (pausedCompositionRemembers != null) {
                ArrayList arrayList = (ArrayList) rememberEventDispatcher.nestedRemembersLists;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    rememberEventDispatcher.nestedRemembersLists = arrayList;
                }
                arrayList.add((MutableVector) rememberEventDispatcher.currentRememberingList);
                rememberEventDispatcher.currentRememberingList = pausedCompositionRemembers.pausedRemembers;
            }
        }
    }

    public final class TrimParentValues extends Operation {
        public static final TrimParentValues INSTANCE = new TrimParentValues(1, 0, 2);

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            int i = opIterator.getInt(0);
            int i2 = slotWriter.parent;
            int slotIndex = slotWriter.slotIndex(slotWriter.groupIndexToAddress(i2), slotWriter.groups);
            int dataIndex = slotWriter.dataIndex(slotWriter.groupIndexToAddress(i2 + 1), slotWriter.groups);
            for (int max = Math.max(slotIndex, dataIndex - i); max < dataIndex; max++) {
                Object obj = slotWriter.slots[slotWriter.dataIndexToDataAddress(max)];
                if (obj instanceof RememberObserverHolder) {
                    rememberEventDispatcher.forgetting((RememberObserverHolder) obj);
                } else if (obj instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj).release();
                }
            }
            if (i <= 0) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            int i3 = slotWriter.parent;
            int slotIndex2 = slotWriter.slotIndex(slotWriter.groupIndexToAddress(i3), slotWriter.groups);
            int dataIndex2 = slotWriter.dataIndex(slotWriter.groupIndexToAddress(i3 + 1), slotWriter.groups) - i;
            if (dataIndex2 < slotIndex2) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            slotWriter.removeSlots(dataIndex2, i, i3);
            int i4 = slotWriter.currentSlot;
            if (i4 >= slotIndex2) {
                slotWriter.currentSlot = i4 - i;
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class UpdateAuxData extends Operation {
        public static final UpdateAuxData INSTANCE;

        static {
            int i = 1;
            INSTANCE = new UpdateAuxData(0, i, i);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            slotWriter.updateAux(opIterator.m580getObjectPtLUHM(0));
        }
    }

    public final class UpdateNode extends Operation {
        public static final UpdateNode INSTANCE = new UpdateNode(0, 2, 1);

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            applier.apply(opIterator.m580getObjectPtLUHM(0), (Function2) opIterator.m580getObjectPtLUHM(1));
        }
    }

    public final class UpdateValue extends Operation {
        public static final UpdateValue INSTANCE;
        public static final UpdateValue INSTANCE$1;
        public static final UpdateValue INSTANCE$2;
        public static final UpdateValue INSTANCE$3;
        public final /* synthetic */ int $r8$classId;

        static {
            int i = 1;
            INSTANCE$1 = new UpdateValue(i, 2, 1);
            int i2 = 1;
            INSTANCE$2 = new UpdateValue(i2, i2, 2);
            INSTANCE$3 = new UpdateValue(i, 2, 3);
            int i3 = 1;
            INSTANCE = new UpdateValue(i3, i3, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UpdateValue(int i, int i2, int i3) {
            super(i, i2);
            this.$r8$classId = i3;
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            switch (this.$r8$classId) {
                case 0:
                    Object m580getObjectPtLUHM = opIterator.m580getObjectPtLUHM(0);
                    int i = opIterator.getInt(0);
                    if (m580getObjectPtLUHM instanceof RememberObserverHolder) {
                        RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) m580getObjectPtLUHM;
                        ((MutableVector) rememberEventDispatcher.currentRememberingList).add(rememberObserverHolder);
                        ((MutableScatterSet) rememberEventDispatcher.rememberSet).add(rememberObserverHolder);
                    }
                    Object obj = slotWriter.set(slotWriter.currentGroup, i, m580getObjectPtLUHM);
                    if (!(obj instanceof RememberObserverHolder)) {
                        if (obj instanceof RecomposeScopeImpl) {
                            ((RecomposeScopeImpl) obj).release();
                            break;
                        }
                    } else {
                        rememberEventDispatcher.forgetting((RememberObserverHolder) obj);
                        break;
                    }
                    break;
                case 1:
                    Object invoke = ((Function0) opIterator.m580getObjectPtLUHM(0)).invoke();
                    GapAnchor gapAnchor = (GapAnchor) opIterator.m580getObjectPtLUHM(1);
                    int i2 = opIterator.getInt(0);
                    gapAnchor.getClass();
                    slotWriter.updateNodeOfGroup(slotWriter.anchorIndex(gapAnchor), invoke);
                    applier.insertTopDown(i2, invoke);
                    applier.down(invoke);
                    break;
                case 2:
                    GapAnchor gapAnchor2 = (GapAnchor) opIterator.m580getObjectPtLUHM(0);
                    int i3 = opIterator.getInt(0);
                    applier.up();
                    gapAnchor2.getClass();
                    applier.insertBottomUp(i3, slotWriter.node(slotWriter.anchorIndex(gapAnchor2)));
                    break;
                default:
                    Object m580getObjectPtLUHM2 = opIterator.m580getObjectPtLUHM(0);
                    GapAnchor gapAnchor3 = (GapAnchor) opIterator.m580getObjectPtLUHM(1);
                    int i4 = opIterator.getInt(0);
                    if (m580getObjectPtLUHM2 instanceof RememberObserverHolder) {
                        RememberObserverHolder rememberObserverHolder2 = (RememberObserverHolder) m580getObjectPtLUHM2;
                        ((MutableVector) rememberEventDispatcher.currentRememberingList).add(rememberObserverHolder2);
                        ((MutableScatterSet) rememberEventDispatcher.rememberSet).add(rememberObserverHolder2);
                    }
                    Object obj2 = slotWriter.set(slotWriter.anchorIndex(gapAnchor3), i4, m580getObjectPtLUHM2);
                    if (!(obj2 instanceof RememberObserverHolder)) {
                        if (obj2 instanceof RecomposeScopeImpl) {
                            ((RecomposeScopeImpl) obj2).release();
                            break;
                        }
                    } else {
                        rememberEventDispatcher.forgetting((RememberObserverHolder) obj2);
                        break;
                    }
                    break;
            }
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public GapAnchor getGroupAnchor(Operations.OpIterator opIterator) {
            switch (this.$r8$classId) {
                case 1:
                    return (GapAnchor) opIterator.m580getObjectPtLUHM(1);
                case 2:
                    return (GapAnchor) opIterator.m580getObjectPtLUHM(0);
                default:
                    return super.getGroupAnchor(opIterator);
            }
        }
    }

    public final class Ups extends Operation {
        public static final Ups INSTANCE = new Ups(1, 0, 2);

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            int i = opIterator.getInt(0);
            for (int i2 = 0; i2 < i; i2++) {
                applier.up();
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class UseCurrentNode extends Operation {
        public static final UseCurrentNode INSTANCE;

        static {
            int i = 0;
            INSTANCE = new UseCurrentNode(i, i, 3);
        }

        @Override // androidx.compose.runtime.composer.gapbuffer.changelist.Operation
        public final void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext) {
            applier.reuse();
        }
    }

    public /* synthetic */ Operation(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public abstract void execute(Operations.OpIterator opIterator, Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher, OperationErrorContext operationErrorContext);

    public GapAnchor getGroupAnchor(Operations.OpIterator opIterator) {
        return null;
    }

    public final String toString() {
        String simpleName = Reflection.factory.getOrCreateKotlinClass(getClass()).getSimpleName();
        return simpleName == null ? "" : simpleName;
    }

    public Operation(int i, int i2) {
        this.ints = i;
        this.objects = i2;
    }
}
