package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.foundation.text.input.internal.undo.UndoManager;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.text.TextRange;
import androidx.work.impl.WorkLauncherImpl;
import coil3.Extras;
import coil3.size.SizeKt;
import com.google.android.gms.dynamite.zzf;
import com.google.android.gms.dynamite.zzg;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadj;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class TextFieldState {
    public final ParcelableSnapshotMutableState isEditing$delegate;
    public TextFieldBuffer mainBuffer;
    public final MutableVector notifyImeListeners;
    public final WorkLauncherImpl textUndoManager;
    public final Extras.Key undoState;
    public final ParcelableSnapshotMutableState userCommit$delegate;
    public final ParcelableSnapshotMutableState value$delegate;

    public interface NotifyImeListener {
        void onChange(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z);
    }

    public TextFieldState(String str, long j, WorkLauncherImpl workLauncherImpl) {
        this.textUndoManager = workLauncherImpl;
        this.mainBuffer = new TextFieldBuffer(new TextFieldCharSequence(str, SizeKt.m1469coerceIn8ffj60Q(str.length(), j), null, null, null, null, 60), null, null, null, 14);
        Boolean bool = Boolean.FALSE;
        this.isEditing$delegate = Updater.mutableStateOf$default(bool);
        this.value$delegate = Updater.mutableStateOf$default(new TextFieldCharSequence(str, j, null, null, null, null, 60));
        this.userCommit$delegate = Updater.mutableStateOf$default(bool);
        this.undoState = new Extras.Key(this);
        this.notifyImeListeners = new MutableVector(0, new NotifyImeListener[16]);
    }

    public static final void access$commitEditAsUser(TextFieldState textFieldState, InputTransformation inputTransformation, boolean z, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        TextFieldCharSequence value$foundation = textFieldState.getValue$foundation();
        if (((MutableVector) textFieldState.mainBuffer.getChangeTracker$foundation().processor).size == 0 && TextRange.m986equalsimpl0(value$foundation.selection, textFieldState.mainBuffer.selectionInChars)) {
            if (Intrinsics.areEqual(value$foundation.composition, textFieldState.mainBuffer.composition) && Intrinsics.areEqual(value$foundation.highlight, textFieldState.mainBuffer.highlight) && Intrinsics.areEqual(value$foundation.composingAnnotations, textFieldState.mainBuffer.composingAnnotations)) {
                return;
            }
            TextFieldCharSequence value$foundation2 = textFieldState.getValue$foundation();
            String partialGapBuffer = textFieldState.mainBuffer.buffer.toString();
            TextFieldBuffer textFieldBuffer = textFieldState.mainBuffer;
            long j = textFieldBuffer.selectionInChars;
            TextRange textRange = textFieldBuffer.composition;
            textFieldState.updateValueAndNotifyListeners(value$foundation2, new TextFieldCharSequence(partialGapBuffer, j, textRange, textFieldBuffer.highlight, TextFieldStateKt.m381access$finalizeComposingAnnotationsitr0ztk(textRange, textFieldBuffer.composingAnnotations), null, 32), z);
            return;
        }
        boolean z2 = false;
        boolean z3 = ((MutableVector) textFieldState.mainBuffer.getChangeTracker$foundation().processor).size != 0;
        String partialGapBuffer2 = textFieldState.mainBuffer.buffer.toString();
        TextFieldBuffer textFieldBuffer2 = textFieldState.mainBuffer;
        long j2 = textFieldBuffer2.selectionInChars;
        TextRange textRange2 = textFieldBuffer2.composition;
        TextFieldCharSequence textFieldCharSequence = new TextFieldCharSequence(partialGapBuffer2, j2, textRange2, textFieldBuffer2.highlight, TextFieldStateKt.m381access$finalizeComposingAnnotationsitr0ztk(textRange2, textFieldBuffer2.composingAnnotations), null, 32);
        if (inputTransformation == null) {
            if (z3 && z) {
                z2 = true;
            }
            textFieldState.updateValueAndNotifyListeners(value$foundation, textFieldCharSequence, z2);
            textFieldState.recordEditForUndo(value$foundation, textFieldCharSequence, textFieldState.mainBuffer.getChangeTracker$foundation(), textFieldEditUndoBehavior);
            return;
        }
        TextFieldBuffer textFieldBuffer3 = new TextFieldBuffer(textFieldCharSequence, textFieldState.mainBuffer.getChangeTracker$foundation(), value$foundation, null, 8);
        inputTransformation.transformInput(textFieldBuffer3);
        boolean contentEquals = StringsKt__StringsJVMKt.contentEquals(textFieldBuffer3.buffer, textFieldCharSequence);
        boolean z4 = !contentEquals;
        boolean m986equalsimpl0 = TextRange.m986equalsimpl0(textFieldBuffer3.selectionInChars, textFieldCharSequence.selection);
        boolean z5 = !m986equalsimpl0;
        if (contentEquals && m986equalsimpl0) {
            textFieldState.updateValueAndNotifyListeners(value$foundation, TextFieldBuffer.m377toTextFieldCharSequencewFTz33Y$foundation$default(textFieldBuffer3, 0L, textFieldCharSequence.composition, 13), z);
        } else {
            textFieldState.syncMainBufferToTemporaryBuffer$foundation(textFieldBuffer3, z4, z5);
        }
        textFieldState.recordEditForUndo(value$foundation, textFieldState.getValue$foundation(), textFieldBuffer3.getChangeTracker$foundation(), textFieldEditUndoBehavior);
    }

    public final void commitEdit(TextFieldBuffer textFieldBuffer) {
        boolean z = ((MutableVector) textFieldBuffer.getChangeTracker$foundation().processor).size > 0;
        boolean m986equalsimpl0 = true ^ TextRange.m986equalsimpl0(textFieldBuffer.selectionInChars, this.mainBuffer.selectionInChars);
        if (z) {
            recordEditForUndo(getValue$foundation(), TextFieldBuffer.m377toTextFieldCharSequencewFTz33Y$foundation$default(textFieldBuffer, 0L, null, 15), textFieldBuffer.getChangeTracker$foundation(), TextFieldEditUndoBehavior.NeverMerge);
        }
        syncMainBufferToTemporaryBuffer$foundation(textFieldBuffer, z, m986equalsimpl0);
    }

    public final void finishEditing() {
        this.isEditing$delegate.setValue(Boolean.FALSE);
        setUserCommit(false);
    }

    public final TextFieldCharSequence getValue$foundation() {
        return (TextFieldCharSequence) this.value$delegate.getValue();
    }

    public final void recordEditForUndo(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, WorkLauncherImpl workLauncherImpl, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        int ordinal = textFieldEditUndoBehavior.ordinal();
        WorkLauncherImpl workLauncherImpl2 = this.textUndoManager;
        if (ordinal == 0) {
            zzadj.recordChanges(workLauncherImpl2, textFieldCharSequence, textFieldCharSequence2, workLauncherImpl, true);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                zzadj.recordChanges(workLauncherImpl2, textFieldCharSequence, textFieldCharSequence2, workLauncherImpl, false);
                return;
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
        }
        ((ParcelableSnapshotMutableState) workLauncherImpl2.workTaskExecutor).setValue(null);
        UndoManager undoManager = (UndoManager) workLauncherImpl2.processor;
        undoManager.undoStack.clear();
        undoManager.redoStack.clear();
    }

    public final void setUserCommit(boolean z) {
        this.userCommit$delegate.setValue(Boolean.valueOf(z));
    }

    public final TextFieldBuffer startEdit() {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.isEditing$delegate;
        Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
        Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
                InlineClassHelperKt.throwIllegalStateException("TextFieldState does not support concurrent or nested editing.");
            }
            parcelableSnapshotMutableState.setValue(Boolean.TRUE);
            return new TextFieldBuffer(getValue$foundation(), null, null, null, 14);
        } finally {
            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    public final void syncMainBufferToTemporaryBuffer$foundation(TextFieldBuffer textFieldBuffer, boolean z, boolean z2) {
        TextFieldCharSequence m377toTextFieldCharSequencewFTz33Y$foundation$default = TextFieldBuffer.m377toTextFieldCharSequencewFTz33Y$foundation$default(this.mainBuffer, 0L, null, 15);
        if (z) {
            this.mainBuffer = new TextFieldBuffer(new TextFieldCharSequence(textFieldBuffer.buffer.toString(), textFieldBuffer.selectionInChars, null, null, null, null, 60), null, null, null, 14);
        } else if (z2) {
            TextFieldBuffer textFieldBuffer2 = this.mainBuffer;
            long j = textFieldBuffer.selectionInChars;
            int i = TextRange.$r8$clinit;
            textFieldBuffer2.m379setSelection5zctL8(SizeKt.TextRange((int) (j >> 32), (int) (j & BodyPartID.bodyIdMax)));
        }
        if (z || z2 || !Intrinsics.areEqual(m377toTextFieldCharSequencewFTz33Y$foundation$default.composition, textFieldBuffer.composition)) {
            this.mainBuffer.m378setCompositionOEnZFl4(null);
        }
        updateValueAndNotifyListeners(m377toTextFieldCharSequencewFTz33Y$foundation$default, TextFieldBuffer.m377toTextFieldCharSequencewFTz33Y$foundation$default(this.mainBuffer, 0L, null, 15), true);
    }

    public final String toString() {
        Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
        Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            return "TextFieldState(selection=" + ((Object) TextRange.m992toStringimpl(getValue$foundation().selection)) + ", text=\"" + ((Object) getValue$foundation().text) + "\")";
        } finally {
            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    public final void updateValueAndNotifyListeners(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z) {
        this.value$delegate.setValue(textFieldCharSequence2);
        MutableVector mutableVector = this.notifyImeListeners;
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            ((NotifyImeListener) objArr[i2]).onChange(textFieldCharSequence, textFieldCharSequence2, (!z || StringsKt__StringsJVMKt.contentEquals(textFieldCharSequence.text, textFieldCharSequence2) || textFieldCharSequence.composition == null) ? false : true);
        }
        setUserCommit(false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextFieldState(String str, int i) {
        this(str, SizeKt.TextRange(r4, r4));
        str = (i & 1) != 0 ? "" : str;
        int length = str.length();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextFieldState(String str, long j) {
        this(str, j, new WorkLauncherImpl((TextUndoOperation) null, new UndoManager(100, r2, r2)));
        EmptyList emptyList = EmptyList.INSTANCE;
    }

    public final class Saver implements androidx.compose.runtime.saveable.Saver {
        public static final Saver INSTANCE = new Saver(0);
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Saver(int i) {
            this.$r8$classId = i;
        }

        public static List save(SaveableHolder saveableHolder, TextFieldState textFieldState) {
            List list;
            String obj = textFieldState.getValue$foundation().text.toString();
            long j = textFieldState.getValue$foundation().selection;
            int i = TextRange.$r8$clinit;
            Integer valueOf = Integer.valueOf((int) (j >> 32));
            Integer valueOf2 = Integer.valueOf((int) (textFieldState.getValue$foundation().selection & BodyPartID.bodyIdMax));
            WorkLauncherImpl workLauncherImpl = textFieldState.textUndoManager;
            TextUndoOperation textUndoOperation = (TextUndoOperation) ((ParcelableSnapshotMutableState) workLauncherImpl.workTaskExecutor).getValue();
            if (textUndoOperation != null) {
                Integer valueOf3 = Integer.valueOf(textUndoOperation.index);
                String str = textUndoOperation.preText;
                String str2 = textUndoOperation.postText;
                long j2 = textUndoOperation.preSelection;
                int i2 = TextRange.$r8$clinit;
                Integer valueOf4 = Integer.valueOf((int) (j2 >> 32));
                Integer valueOf5 = Integer.valueOf((int) (j2 & BodyPartID.bodyIdMax));
                long j3 = textUndoOperation.postSelection;
                list = CollectionsKt__CollectionsKt.listOf(valueOf3, str, str2, valueOf4, valueOf5, Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) (j3 & BodyPartID.bodyIdMax)), Long.valueOf(textUndoOperation.timeInMillis));
            } else {
                list = null;
            }
            return CollectionsKt__CollectionsKt.listOf(obj, valueOf, valueOf2, CollectionsKt__CollectionsKt.listOf(list, TextUndoManager$Companion$Saver.undoManagerSaver.save(saveableHolder, (UndoManager) workLauncherImpl.processor)));
        }

        @Override // androidx.compose.runtime.saveable.Saver
        /* renamed from: restore, reason: collision with other method in class */
        public final Object mo380restore(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    return restore(obj);
                default:
                    List list = (List) obj;
                    int intValue = ((Number) list.get(0)).intValue();
                    int intValue2 = ((Number) list.get(1)).intValue();
                    int intValue3 = ((Number) list.get(2)).intValue();
                    ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    int i = 3;
                    while (true) {
                        int i2 = intValue2 + 3;
                        zzf zzfVar = TextUndoOperation.Saver;
                        if (i >= i2) {
                            ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                            ListBuilder createListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                            while (i < intValue2 + intValue3 + 3) {
                                createListBuilder2.add(zzfVar.mo380restore(list.get(i)));
                                i++;
                            }
                            return new UndoManager(intValue, build, CollectionsKt__CollectionsJVMKt.build(createListBuilder2));
                        }
                        createListBuilder.add(zzfVar.mo380restore(list.get(i)));
                        i++;
                    }
            }
        }

        public static TextFieldState restore(Object obj) {
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(0);
            Object obj3 = list.get(1);
            Object obj4 = list.get(2);
            Object obj5 = list.get(3);
            obj2.getClass();
            String str = (String) obj2;
            obj3.getClass();
            int intValue = ((Integer) obj3).intValue();
            obj4.getClass();
            long TextRange = SizeKt.TextRange(intValue, ((Integer) obj4).intValue());
            obj5.getClass();
            List list2 = (List) obj5;
            Object obj6 = list2.get(0);
            Object obj7 = list2.get(1);
            TextUndoOperation textUndoOperation = obj6 != null ? (TextUndoOperation) TextUndoOperation.Saver.mo380restore(obj6) : null;
            obj7.getClass();
            return new TextFieldState(str, TextRange, new WorkLauncherImpl(textUndoOperation, (UndoManager) TextUndoManager$Companion$Saver.undoManagerSaver.mo380restore(obj7)));
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public final Object save(SaveableHolder saveableHolder, Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    return save(saveableHolder, (TextFieldState) obj);
                default:
                    UndoManager undoManager = (UndoManager) obj;
                    ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    createListBuilder.add(Integer.valueOf(undoManager.capacity));
                    SnapshotStateList snapshotStateList = undoManager.undoStack;
                    createListBuilder.add(Integer.valueOf(snapshotStateList.size()));
                    SnapshotStateList snapshotStateList2 = undoManager.redoStack;
                    createListBuilder.add(Integer.valueOf(snapshotStateList2.size()));
                    int size = snapshotStateList.size();
                    int i = 0;
                    while (true) {
                        zzf zzfVar = TextUndoOperation.Saver;
                        if (i < size) {
                            createListBuilder.add(zzfVar.save(saveableHolder, snapshotStateList.get(i)));
                            i++;
                        } else {
                            int size2 = snapshotStateList2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                createListBuilder.add(zzfVar.save(saveableHolder, snapshotStateList2.get(i2)));
                            }
                            return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                        }
                    }
            }
        }
    }
}
