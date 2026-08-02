package androidx.compose.foundation.text.selection;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.LongIntMapKt;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGesturesModifierKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequesterImpl;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.SizeKt;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.StandaloneCoroutine;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class SelectionManager {
    public LayoutCoordinates containerLayoutCoordinates;
    public CoroutineScope coroutineScope;
    public final DerivedSnapshotState derivedContentRect$delegate;
    public PlatformHapticFeedback hapticFeedBack;
    public boolean isLongPressOrClickSelection;
    public Function1 onCopyHandler;
    public PlatformSelectionBehaviorsImpl platformSelectionBehaviors;
    public Offset previousPosition;
    public SelectionLayout previousSelectionLayout;
    public final SelectionRegistrarImpl selectionRegistrar;
    public boolean showToolbar;
    public final ParcelableSnapshotMutableState _selection = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState _isInTouchMode = Updater.mutableStateOf$default(Boolean.TRUE);
    public Function1 onSelectionChange = new SelectionManager$$ExternalSyntheticLambda1(this, 7);
    public final ToolbarRequesterImpl toolbarRequester = new ToolbarRequesterImpl();
    public final FocusRequester focusRequester = new FocusRequester();
    public final ParcelableSnapshotMutableState hasFocus$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
    public final ParcelableSnapshotMutableState positionChangeState$delegate = new ParcelableSnapshotMutableState(Unit.INSTANCE, NeverEqualPolicy.INSTANCE);
    public final ParcelableSnapshotMutableState dragBeginPosition$delegate = Updater.mutableStateOf$default(new Offset(0));
    public final ParcelableSnapshotMutableState dragTotalDistance$delegate = Updater.mutableStateOf$default(new Offset(0));
    public final ParcelableSnapshotMutableState startHandlePosition$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState endHandlePosition$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState draggingHandle$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState currentDragPosition$delegate = Updater.mutableStateOf$default(null);

    public SelectionManager(SelectionRegistrarImpl selectionRegistrarImpl) {
        this.selectionRegistrar = selectionRegistrarImpl;
        int i = 3;
        this.derivedContentRect$delegate = Updater.derivedStateOf(new SelectionManager$$ExternalSyntheticLambda0(this, i));
        selectionRegistrarImpl.onPositionChangeCallback = new SelectionManager$$ExternalSyntheticLambda1(this, 8);
        selectionRegistrarImpl.onSelectionUpdateStartCallback = new ScoreUiFactory$$ExternalSyntheticLambda0(this, 1);
        selectionRegistrarImpl.onSelectionUpdateCallback = new SelectionManager$$ExternalSyntheticLambda8(this);
        selectionRegistrarImpl.onSelectionUpdateEndCallback = new SelectionManager$$ExternalSyntheticLambda0(this, 4);
        selectionRegistrarImpl.onSelectableChangeCallback = new SelectionManager$$ExternalSyntheticLambda1(this, 2);
        selectionRegistrarImpl.afterSelectableUnsubscribe = new SelectionManager$$ExternalSyntheticLambda1(this, i);
    }

    /* renamed from: convertToContainerCoordinates-R5De75A, reason: not valid java name */
    public final long m443convertToContainerCoordinatesR5De75A(LayoutCoordinates layoutCoordinates, long j) {
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        if (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) {
            return 9205357640488583168L;
        }
        return requireContainerCoordinates$foundation().mo839localPositionOfR5De75A(layoutCoordinates, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copy$foundation() {
        AnnotatedString annotatedString;
        Function1 function1;
        int i;
        if (getSelection() != null) {
            SelectionRegistrarImpl selectionRegistrarImpl = this.selectionRegistrar;
            if (selectionRegistrarImpl.getSubselections()._size != 0) {
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                ArrayList sort = selectionRegistrarImpl.sort(requireContainerCoordinates$foundation());
                ListIterator listIterator = sort.listIterator(sort.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                        break;
                    }
                    Selection selection = (Selection) selectionRegistrarImpl.getSubselections().get(((MultiWidgetSelectionDelegate) listIterator.previous()).selectableId);
                    if (selection != null && selection.start.offset != selection.end.offset) {
                        i = listIterator.nextIndex();
                        break;
                    }
                }
                if (i != -1) {
                    int size = sort.size();
                    int i2 = 0;
                    while (i2 < size) {
                        MultiWidgetSelectionDelegate multiWidgetSelectionDelegate = (MultiWidgetSelectionDelegate) sort.get(i2);
                        Selection selection2 = (Selection) selectionRegistrarImpl.getSubselections().get(multiWidgetSelectionDelegate.selectableId);
                        if (selection2 != null) {
                            AnnotatedString text = multiWidgetSelectionDelegate.getText();
                            long TextRange = SizeKt.TextRange(selection2.start.offset, selection2.end.offset);
                            boolean z = i2 >= i;
                            builder.append(text, TextRange.m990getMinimpl(TextRange), TextRange.m989getMaximpl(TextRange));
                            if (!z) {
                                builder.append('\n');
                            }
                        }
                        i2++;
                    }
                }
                annotatedString = builder.toAnnotatedString();
                if (annotatedString == null) {
                    AnnotatedString annotatedString2 = annotatedString.text.length() > 0 ? annotatedString : null;
                    if (annotatedString2 == null || (function1 = this.onCopyHandler) == null) {
                        return;
                    }
                    function1.invoke(annotatedString2);
                    return;
                }
                return;
            }
        }
        annotatedString = null;
        if (annotatedString == null) {
        }
    }

    public final MultiWidgetSelectionDelegate getAnchorSelectable$foundation(Selection.AnchorInfo anchorInfo) {
        return (MultiWidgetSelectionDelegate) this.selectionRegistrar._selectableMap.get(anchorInfo.selectableId);
    }

    public final Modifier getContextMenuAreaModifier() {
        Continuation continuation = null;
        int i = 4;
        return TextContextMenuModifierKt.textContextMenuToolbarHandler(TextContextMenuGesturesModifierKt.showTextContextMenuOnSecondaryClick(new ThumbNode$onAttach$1(this, continuation, 24)), this.toolbarRequester, new Scene.AnonymousClass1(this, continuation, i), null, new SelectionManager$$ExternalSyntheticLambda1(this, i));
    }

    public final Pair getContextTextAndSelection$foundation() {
        int i;
        int i2;
        int i3;
        if (getSelection() == null) {
            return null;
        }
        SelectionRegistrarImpl selectionRegistrarImpl = this.selectionRegistrar;
        if (selectionRegistrarImpl._selectables.isEmpty()) {
            return null;
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder();
        ArrayList sort = selectionRegistrarImpl.sort(requireContainerCoordinates$foundation());
        ListIterator listIterator = sort.listIterator(sort.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            Selection selection = (Selection) selectionRegistrarImpl.getSubselections().get(((MultiWidgetSelectionDelegate) listIterator.previous()).selectableId);
            if (selection != null && selection.start.offset != selection.end.offset) {
                i = listIterator.nextIndex();
                break;
            }
        }
        if (i != -1) {
            int size = sort.size();
            i2 = -1;
            i3 = -1;
            int i4 = 0;
            while (i4 < size) {
                MultiWidgetSelectionDelegate multiWidgetSelectionDelegate = (MultiWidgetSelectionDelegate) sort.get(i4);
                Selection selection2 = (Selection) selectionRegistrarImpl.getSubselections().get(multiWidgetSelectionDelegate.selectableId);
                if (selection2 != null) {
                    AnnotatedString text = multiWidgetSelectionDelegate.getText();
                    long TextRange = SizeKt.TextRange(selection2.start.offset, selection2.end.offset);
                    boolean z = i4 >= i;
                    if (i2 == -1) {
                        i2 = TextRange.m990getMinimpl(TextRange);
                        builder.append(text, 0, TextRange.m990getMinimpl(TextRange));
                    }
                    builder.append(text, TextRange.m990getMinimpl(TextRange), TextRange.m989getMaximpl(TextRange));
                    if (z) {
                        i3 = builder.text.length();
                        builder.append(text, TextRange.m989getMaximpl(TextRange), text.text.length());
                    } else {
                        builder.append('\n');
                    }
                }
                i4++;
            }
        } else {
            i2 = -1;
            i3 = -1;
        }
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (i2 == -1 || i3 == -1) {
            return null;
        }
        return new Pair(annotatedString, new TextRange(SizeKt.TextRange(i2, i3)));
    }

    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    public final Selection getSelection() {
        return (Selection) this._selection.getValue();
    }

    public final boolean isInTouchMode() {
        return ((Boolean) this._isInTouchMode.getValue()).booleanValue();
    }

    public final boolean isNonEmptySelection$foundation() {
        Selection selection = getSelection();
        if (selection != null) {
            Selection.AnchorInfo anchorInfo = selection.end;
            Selection.AnchorInfo anchorInfo2 = selection.start;
            if (!Intrinsics.areEqual(anchorInfo2, anchorInfo)) {
                if (anchorInfo2.selectableId == anchorInfo.selectableId) {
                    return true;
                }
                LayoutCoordinates requireContainerCoordinates$foundation = requireContainerCoordinates$foundation();
                SelectionRegistrarImpl selectionRegistrarImpl = this.selectionRegistrar;
                ArrayList sort = selectionRegistrarImpl.sort(requireContainerCoordinates$foundation);
                int size = sort.size();
                for (int i = 0; i < size; i++) {
                    Selection selection2 = (Selection) selectionRegistrarImpl.getSubselections().get(((MultiWidgetSelectionDelegate) sort.get(i)).selectableId);
                    if (selection2 != null && selection2.start.offset != selection2.end.offset) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void onRelease() {
        PlatformHapticFeedback platformHapticFeedback;
        MutableLongObjectMap mutableLongObjectMap = LongObjectMapKt.EmptyLongObjectMap;
        mutableLongObjectMap.getClass();
        this.selectionRegistrar.subselections$delegate.setValue(mutableLongObjectMap);
        this.showToolbar = false;
        updateSelectionToolbar();
        if (getSelection() != null) {
            this.onSelectionChange.invoke(null);
            if (!isInTouchMode() || (platformHapticFeedback = this.hapticFeedBack) == null) {
                return;
            }
            platformHapticFeedback.m769performHapticFeedbackCdsT49E(9);
        }
    }

    public final LayoutCoordinates requireContainerCoordinates$foundation() {
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates == null) {
            throw Recorder$$ExternalSyntheticOutline2.m("null coordinates");
        }
        if (!layoutCoordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("unattached coordinates");
        }
        return layoutCoordinates;
    }

    public final void setInTouchMode(boolean z) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this._isInTouchMode;
        if (((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue() != z) {
            parcelableSnapshotMutableState.setValue(Boolean.valueOf(z));
            updateSelectionToolbar();
        }
    }

    public final void setSelection(Selection selection) {
        this._selection.setValue(selection);
        if (selection != null) {
            updateHandleOffsets();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (androidx.compose.foundation.text.selection.SimpleLayoutKt.m448containsInclusiveUv8p0NA(r11, r10) == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateHandleOffsets() {
        long j;
        Offset offset;
        Selection.AnchorInfo anchorInfo;
        Selection.AnchorInfo anchorInfo2;
        Selection selection = getSelection();
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        Offset offset2 = null;
        MultiWidgetSelectionDelegate anchorSelectable$foundation = (selection == null || (anchorInfo2 = selection.start) == null) ? null : getAnchorSelectable$foundation(anchorInfo2);
        MultiWidgetSelectionDelegate anchorSelectable$foundation2 = (selection == null || (anchorInfo = selection.end) == null) ? null : getAnchorSelectable$foundation(anchorInfo);
        LayoutCoordinates layoutCoordinates2 = anchorSelectable$foundation != null ? anchorSelectable$foundation.getLayoutCoordinates() : null;
        LayoutCoordinates layoutCoordinates3 = anchorSelectable$foundation2 != null ? anchorSelectable$foundation2.getLayoutCoordinates() : null;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.endHandlePosition$delegate;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.startHandlePosition$delegate;
        if (selection == null || layoutCoordinates == null || !layoutCoordinates.isAttached() || (layoutCoordinates2 == null && layoutCoordinates3 == null)) {
            parcelableSnapshotMutableState2.setValue(null);
            parcelableSnapshotMutableState.setValue(null);
            return;
        }
        Rect visibleBounds = SimpleLayoutKt.visibleBounds(layoutCoordinates);
        if (layoutCoordinates2 != null) {
            j = 9205357640488583168L;
            long m436getHandlePositiondBAh8RU = anchorSelectable$foundation.m436getHandlePositiondBAh8RU(selection, true);
            if ((m436getHandlePositiondBAh8RU & 9223372034707292159L) != 9205357640488583168L) {
                long mo839localPositionOfR5De75A = layoutCoordinates.mo839localPositionOfR5De75A(layoutCoordinates2, m436getHandlePositiondBAh8RU);
                offset = new Offset(mo839localPositionOfR5De75A);
                if (getDraggingHandle() != Handle.SelectionStart) {
                }
                parcelableSnapshotMutableState2.setValue(offset);
                if (layoutCoordinates3 != null) {
                    long m436getHandlePositiondBAh8RU2 = anchorSelectable$foundation2.m436getHandlePositiondBAh8RU(selection, false);
                    if ((m436getHandlePositiondBAh8RU2 & 9223372034707292159L) != j) {
                        long mo839localPositionOfR5De75A2 = layoutCoordinates.mo839localPositionOfR5De75A(layoutCoordinates3, m436getHandlePositiondBAh8RU2);
                        Offset offset3 = new Offset(mo839localPositionOfR5De75A2);
                        if (getDraggingHandle() == Handle.SelectionEnd || SimpleLayoutKt.m448containsInclusiveUv8p0NA(mo839localPositionOfR5De75A2, visibleBounds)) {
                            offset2 = offset3;
                        }
                    }
                }
                parcelableSnapshotMutableState.setValue(offset2);
            }
        } else {
            j = 9205357640488583168L;
        }
        offset = null;
        parcelableSnapshotMutableState2.setValue(offset);
        if (layoutCoordinates3 != null) {
        }
        parcelableSnapshotMutableState.setValue(offset2);
    }

    /* renamed from: updateSelection-jyLRC_s$foundation, reason: not valid java name */
    public final boolean m444updateSelectionjyLRC_s$foundation(long j, long j2, boolean z, SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0) {
        ArrayList arrayList;
        SelectionLayout selectionLayout;
        TextLayoutResult textLayoutResult;
        long j3;
        ArrayList arrayList2;
        int i;
        long m625minusMKHz9U;
        int i2;
        SelectionLayoutBuilder selectionLayoutBuilder;
        long j4;
        long j5;
        Direction appendSelectableInfo_Parwq6A$otherDirection;
        Direction direction;
        Direction direction2;
        boolean z2;
        int i3;
        ArrayList arrayList3;
        Direction direction3;
        ArrayList arrayList4;
        Direction direction4;
        Direction direction5;
        Direction direction6;
        SelectionLayoutBuilder selectionLayoutBuilder2;
        int i4;
        int i5;
        int i6;
        Selection.AnchorInfo anchorInfo;
        int i7;
        Selection.AnchorInfo anchorInfo2;
        this.draggingHandle$delegate.setValue(z ? Handle.SelectionStart : Handle.SelectionEnd);
        this.currentDragPosition$delegate.setValue(new Offset(j));
        LayoutCoordinates requireContainerCoordinates$foundation = requireContainerCoordinates$foundation();
        SelectionRegistrarImpl selectionRegistrarImpl = this.selectionRegistrar;
        ArrayList sort = selectionRegistrarImpl.sort(requireContainerCoordinates$foundation);
        int i8 = LongIntMapKt.$r8$clinit;
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(6);
        int size = sort.size();
        for (int i9 = 0; i9 < size; i9++) {
            mutableLongIntMap.set(i9, ((MultiWidgetSelectionDelegate) sort.get(i9)).selectableId);
        }
        long j6 = 9223372034707292159L;
        long j7 = 9205357640488583168L;
        SelectionLayoutBuilder selectionLayoutBuilder3 = new SelectionLayoutBuilder(j, j2, requireContainerCoordinates$foundation, z, (j2 & 9223372034707292159L) == 9205357640488583168L ? null : getSelection(), new SemanticsSortKt$special$$inlined$thenBy$1(mutableLongIntMap, 3));
        int size2 = sort.size();
        int i10 = 0;
        while (true) {
            arrayList = selectionLayoutBuilder3.infoList;
            if (i10 >= size2) {
                break;
            }
            MultiWidgetSelectionDelegate multiWidgetSelectionDelegate = (MultiWidgetSelectionDelegate) sort.get(i10);
            LayoutCoordinates layoutCoordinates = multiWidgetSelectionDelegate.getLayoutCoordinates();
            if (layoutCoordinates == null || (textLayoutResult = (TextLayoutResult) multiWidgetSelectionDelegate.layoutResultCallback.invoke()) == null) {
                i2 = size2;
                i3 = i10;
                arrayList4 = sort;
                j3 = j6;
                j5 = j7;
                selectionLayoutBuilder2 = selectionLayoutBuilder3;
            } else {
                j3 = j6;
                long mo839localPositionOfR5De75A = selectionLayoutBuilder3.containerCoordinates.mo839localPositionOfR5De75A(layoutCoordinates, 0L);
                long m625minusMKHz9U2 = Offset.m625minusMKHz9U(selectionLayoutBuilder3.currentPosition, mo839localPositionOfR5De75A);
                long j8 = selectionLayoutBuilder3.previousHandlePosition;
                if ((j8 & j3) == j7) {
                    i = 0;
                    arrayList2 = sort;
                    m625minusMKHz9U = j7;
                } else {
                    arrayList2 = sort;
                    i = 0;
                    m625minusMKHz9U = Offset.m625minusMKHz9U(j8, mo839localPositionOfR5De75A);
                }
                long j9 = multiWidgetSelectionDelegate.selectableId;
                i2 = size2;
                int i11 = i10;
                long j10 = textLayoutResult.size;
                float f = (int) (j10 >> 32);
                float f2 = (int) (j10 & BodyPartID.bodyIdMax);
                int i12 = (int) (m625minusMKHz9U2 >> 32);
                Direction direction7 = Float.intBitsToFloat(i12) < RecyclerView.DECELERATION_RATE ? Direction.BEFORE : Float.intBitsToFloat(i12) > f ? Direction.AFTER : Direction.ON;
                int i13 = (int) (m625minusMKHz9U2 & BodyPartID.bodyIdMax);
                Direction direction8 = Float.intBitsToFloat(i13) < RecyclerView.DECELERATION_RATE ? Direction.BEFORE : Float.intBitsToFloat(i13) > f2 ? Direction.AFTER : Direction.ON;
                boolean z3 = selectionLayoutBuilder3.isStartHandle;
                Selection selection = selectionLayoutBuilder3.previousSelection;
                if (z3) {
                    j5 = j7;
                    selectionLayoutBuilder = selectionLayoutBuilder3;
                    j4 = j9;
                    appendSelectableInfo_Parwq6A$otherDirection = SimpleLayoutKt.appendSelectableInfo_Parwq6A$otherDirection(direction7, direction8, selectionLayoutBuilder, j4, selection != null ? selection.end : null);
                    z2 = z3;
                    i3 = i11;
                    arrayList3 = arrayList;
                    arrayList4 = arrayList2;
                    direction4 = direction7;
                    direction = direction4;
                    direction5 = direction8;
                    direction2 = direction5;
                    direction3 = appendSelectableInfo_Parwq6A$otherDirection;
                    direction6 = direction3;
                } else {
                    selectionLayoutBuilder = selectionLayoutBuilder3;
                    j4 = j9;
                    j5 = j7;
                    appendSelectableInfo_Parwq6A$otherDirection = SimpleLayoutKt.appendSelectableInfo_Parwq6A$otherDirection(direction7, direction8, selectionLayoutBuilder, j4, selection != null ? selection.start : null);
                    direction = direction7;
                    direction2 = direction8;
                    z2 = z3;
                    i3 = i11;
                    arrayList3 = arrayList;
                    direction3 = direction;
                    arrayList4 = arrayList2;
                    direction4 = appendSelectableInfo_Parwq6A$otherDirection;
                    direction5 = direction4;
                    direction6 = direction2;
                }
                selectionLayoutBuilder2 = selectionLayoutBuilder;
                Direction resolve2dDirection = SimpleLayoutKt.resolve2dDirection(direction, direction2);
                if (resolve2dDirection == Direction.ON || resolve2dDirection != appendSelectableInfo_Parwq6A$otherDirection) {
                    int length = textLayoutResult.layoutInput.text.text.length();
                    SemanticsSortKt$special$$inlined$thenBy$1 semanticsSortKt$special$$inlined$thenBy$1 = selectionLayoutBuilder2.selectableIdOrderingComparator;
                    if (z2) {
                        int m450getOffsetForPosition3MmeM6k = SimpleLayoutKt.m450getOffsetForPosition3MmeM6k(m625minusMKHz9U2, textLayoutResult);
                        if (selection == null || (anchorInfo2 = selection.end) == null) {
                            i7 = m450getOffsetForPosition3MmeM6k;
                            length = i7;
                        } else {
                            i7 = m450getOffsetForPosition3MmeM6k;
                            int compare = semanticsSortKt$special$$inlined$thenBy$1.compare(Long.valueOf(anchorInfo2.selectableId), Long.valueOf(j4));
                            if (compare < 0) {
                                length = i;
                            } else if (compare <= 0) {
                                length = anchorInfo2.offset;
                            }
                        }
                        i6 = length;
                        i5 = i7;
                    } else {
                        int m450getOffsetForPosition3MmeM6k2 = SimpleLayoutKt.m450getOffsetForPosition3MmeM6k(m625minusMKHz9U2, textLayoutResult);
                        if (selection == null || (anchorInfo = selection.start) == null) {
                            i4 = m450getOffsetForPosition3MmeM6k2;
                            i5 = i4;
                        } else {
                            i4 = m450getOffsetForPosition3MmeM6k2;
                            int compare2 = semanticsSortKt$special$$inlined$thenBy$1.compare(Long.valueOf(anchorInfo.selectableId), Long.valueOf(j4));
                            if (compare2 < 0) {
                                length = i;
                            } else if (compare2 <= 0) {
                                length = anchorInfo.offset;
                            }
                            i5 = length;
                        }
                        i6 = i4;
                    }
                    int m450getOffsetForPosition3MmeM6k3 = (m625minusMKHz9U & j3) == j5 ? -1 : SimpleLayoutKt.m450getOffsetForPosition3MmeM6k(m625minusMKHz9U, textLayoutResult);
                    int i14 = selectionLayoutBuilder2.currentSlot + 2;
                    selectionLayoutBuilder2.currentSlot = i14;
                    long j11 = j4;
                    SelectableInfo selectableInfo = new SelectableInfo(j11, i14, i5, i6, m450getOffsetForPosition3MmeM6k3, textLayoutResult);
                    selectionLayoutBuilder2.startSlot = selectionLayoutBuilder2.updateSlot(selectionLayoutBuilder2.startSlot, direction4, direction5);
                    selectionLayoutBuilder2.endSlot = selectionLayoutBuilder2.updateSlot(selectionLayoutBuilder2.endSlot, direction3, direction6);
                    selectionLayoutBuilder2.selectableIdToInfoListIndex.set(arrayList3.size(), j11);
                    arrayList3.add(selectableInfo);
                }
            }
            i10 = i3 + 1;
            size2 = i2;
            selectionLayoutBuilder3 = selectionLayoutBuilder2;
            j6 = j3;
            j7 = j5;
            sort = arrayList4;
        }
        SelectionLayoutBuilder selectionLayoutBuilder4 = selectionLayoutBuilder3;
        int i15 = selectionLayoutBuilder4.currentSlot + 1;
        int size3 = arrayList.size();
        if (size3 == 0) {
            selectionLayout = null;
        } else if (size3 != 1) {
            int i16 = selectionLayoutBuilder4.startSlot;
            int i17 = i16 == -1 ? i15 : i16;
            int i18 = selectionLayoutBuilder4.endSlot;
            selectionLayout = new MultiSelectionLayout(selectionLayoutBuilder4.selectableIdToInfoListIndex, arrayList, i17, i18 == -1 ? i15 : i18, selectionLayoutBuilder4.isStartHandle, selectionLayoutBuilder4.previousSelection);
        } else {
            SelectableInfo selectableInfo2 = (SelectableInfo) CollectionsKt.single((List) arrayList);
            int i19 = selectionLayoutBuilder4.startSlot;
            int i20 = i19 == -1 ? i15 : i19;
            int i21 = selectionLayoutBuilder4.endSlot;
            selectionLayout = new SingleSelectionLayout(selectionLayoutBuilder4.isStartHandle, i20, i21 == -1 ? i15 : i21, selectionLayoutBuilder4.previousSelection, selectableInfo2);
        }
        if (selectionLayout == null || !selectionLayout.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return false;
        }
        Selection adjust = selectionAdjustment$Companion$$ExternalSyntheticLambda0.adjust(selectionLayout);
        if (!Intrinsics.areEqual(adjust, getSelection())) {
            if (isInTouchMode()) {
                ArrayList arrayList5 = selectionRegistrarImpl._selectables;
                int size4 = arrayList5.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size4) {
                        break;
                    }
                    if (((MultiWidgetSelectionDelegate) arrayList5.get(i22)).getText().text.length() > 0) {
                        PlatformHapticFeedback platformHapticFeedback = this.hapticFeedBack;
                        if (platformHapticFeedback != null) {
                            platformHapticFeedback.m769performHapticFeedbackCdsT49E(9);
                        }
                    } else {
                        i22++;
                    }
                }
            }
            selectionRegistrarImpl.subselections$delegate.setValue(selectionLayout.createSubSelections(adjust));
            this.onSelectionChange.invoke(adjust);
            this.isLongPressOrClickSelection = false;
        }
        this.previousSelectionLayout = selectionLayout;
        return true;
    }

    public final void updateSelectionToolbar() {
        StandaloneCoroutine standaloneCoroutine;
        if (((Boolean) this.hasFocus$delegate.getValue()).booleanValue()) {
            boolean z = this.showToolbar;
            ToolbarRequesterImpl toolbarRequesterImpl = this.toolbarRequester;
            if (z && isInTouchMode()) {
                if (((Rect) this.derivedContentRect$delegate.getValue()) == null) {
                    return;
                }
                toolbarRequesterImpl.show();
            } else {
                TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode = toolbarRequesterImpl.toolbarHandlerNode;
                if (textContextMenuToolbarHandlerNode == null || (standaloneCoroutine = textContextMenuToolbarHandlerNode.textToolbarJob) == null) {
                    return;
                }
                standaloneCoroutine.cancel(null);
                textContextMenuToolbarHandlerNode.textToolbarJob = null;
            }
        }
    }
}
