package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.paging.FlowExtKt$simpleScan$1;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.SizeKt;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class SelectionManager$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SelectionManager f$0;

    public /* synthetic */ SelectionManager$$ExternalSyntheticLambda0(SelectionManager selectionManager, int i) {
        this.$r8$classId = i;
        this.f$0 = selectionManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LayoutCoordinates layoutCoordinates;
        Rect rect;
        Rect rect2;
        int i;
        Rect rect3;
        LayoutCoordinates layoutCoordinates2;
        int[] iArr;
        int i2;
        int[] iArr2;
        ?? r2;
        Rect boundingBox;
        int i3;
        long j;
        Object obj;
        CoroutineScope coroutineScope;
        Selection selection;
        ArrayList arrayList;
        int i4;
        int i5 = this.$r8$classId;
        int i6 = 0;
        SelectionManager selectionManager = this.f$0;
        switch (i5) {
            case 0:
                selectionManager.onRelease();
                return Unit.INSTANCE;
            case 1:
                Offset offset = (Offset) selectionManager.endHandlePosition$delegate.getValue();
                return new Offset(offset != null ? offset.packedValue : 9205357640488583168L);
            case 2:
                Offset offset2 = (Offset) selectionManager.startHandlePosition$delegate.getValue();
                return new Offset(offset2 != null ? offset2.packedValue : 9205357640488583168L);
            case 3:
                SelectionRegistrarImpl selectionRegistrarImpl = selectionManager.selectionRegistrar;
                selectionManager.positionChangeState$delegate.getValue();
                if (selectionManager.getSelection() != null && (layoutCoordinates = selectionManager.containerLayoutCoordinates) != null && layoutCoordinates.isAttached()) {
                    ArrayList sort = selectionRegistrarImpl.sort(selectionManager.requireContainerCoordinates$foundation());
                    ArrayList arrayList2 = new ArrayList(sort.size());
                    int size = sort.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        MultiWidgetSelectionDelegate multiWidgetSelectionDelegate = (MultiWidgetSelectionDelegate) sort.get(i7);
                        Selection selection2 = (Selection) selectionRegistrarImpl.getSubselections().get(multiWidgetSelectionDelegate.selectableId);
                        Pair pair = selection2 != null ? new Pair(multiWidgetSelectionDelegate, selection2) : null;
                        if (pair != null) {
                            arrayList2.add(pair);
                        }
                    }
                    int size2 = arrayList2.size();
                    ArrayList arrayList3 = arrayList2;
                    arrayList3 = arrayList2;
                    if (size2 != 0 && size2 != 1) {
                        arrayList3 = CollectionsKt__CollectionsKt.listOf(CollectionsKt.first((List) arrayList2), CollectionsKt.last((List) arrayList2));
                    }
                    if (!arrayList3.isEmpty()) {
                        boolean isEmpty = arrayList3.isEmpty();
                        Rect rect4 = SimpleLayoutKt.invertedInfiniteRect;
                        if (isEmpty) {
                            rect2 = rect4;
                            rect = rect2;
                        } else {
                            int size3 = arrayList3.size();
                            int i8 = 0;
                            float f = Float.POSITIVE_INFINITY;
                            float f2 = Float.POSITIVE_INFINITY;
                            float f3 = Float.NEGATIVE_INFINITY;
                            float f4 = Float.NEGATIVE_INFINITY;
                            while (i8 < size3) {
                                Pair pair2 = (Pair) arrayList3.get(i8);
                                MultiWidgetSelectionDelegate multiWidgetSelectionDelegate2 = (MultiWidgetSelectionDelegate) pair2.first;
                                Selection selection3 = (Selection) pair2.second;
                                int i9 = selection3.start.offset;
                                int i10 = selection3.end.offset;
                                if (i9 == i10 || (layoutCoordinates2 = multiWidgetSelectionDelegate2.getLayoutCoordinates()) == null) {
                                    i = size3;
                                    rect3 = rect4;
                                } else {
                                    int min = Math.min(i9, i10);
                                    int max = Math.max(i9, i10) - r8;
                                    if (min == max) {
                                        iArr = new int[r8];
                                        iArr[i6] = min;
                                    } else {
                                        int[] iArr3 = new int[2];
                                        iArr3[i6] = min;
                                        iArr3[r8] = max;
                                        iArr = iArr3;
                                    }
                                    int length = iArr.length;
                                    int i11 = i6;
                                    float f5 = Float.POSITIVE_INFINITY;
                                    float f6 = Float.POSITIVE_INFINITY;
                                    float f7 = Float.NEGATIVE_INFINITY;
                                    float f8 = Float.NEGATIVE_INFINITY;
                                    while (i11 < length) {
                                        int i12 = iArr[i11];
                                        TextLayoutResult textLayoutResult = (TextLayoutResult) multiWidgetSelectionDelegate2.layoutResultCallback.invoke();
                                        Rect rect5 = Rect.Zero;
                                        if (textLayoutResult == null) {
                                            i2 = size3;
                                            iArr2 = iArr;
                                        } else {
                                            i2 = size3;
                                            int length2 = textLayoutResult.layoutInput.text.text.length();
                                            iArr2 = iArr;
                                            if (length2 >= 1) {
                                                r2 = false;
                                                boundingBox = textLayoutResult.getBoundingBox(RangesKt___RangesKt.coerceIn(i12, 0, length2 - 1));
                                                f5 = Math.min(f5, boundingBox.left);
                                                f6 = Math.min(f6, boundingBox.top);
                                                f7 = Math.max(f7, boundingBox.right);
                                                f8 = Math.max(f8, boundingBox.bottom);
                                                i11++;
                                                i6 = r2;
                                                size3 = i2;
                                                iArr = iArr2;
                                            }
                                        }
                                        boundingBox = rect5;
                                        r2 = false;
                                        f5 = Math.min(f5, boundingBox.left);
                                        f6 = Math.min(f6, boundingBox.top);
                                        f7 = Math.max(f7, boundingBox.right);
                                        f8 = Math.max(f8, boundingBox.bottom);
                                        i11++;
                                        i6 = r2;
                                        size3 = i2;
                                        iArr = iArr2;
                                    }
                                    i = size3;
                                    rect3 = rect4;
                                    long floatToRawIntBits = (Float.floatToRawIntBits(f6) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f5) << 32);
                                    long floatToRawIntBits2 = Float.floatToRawIntBits(f7);
                                    long floatToRawIntBits3 = Float.floatToRawIntBits(f8) & BodyPartID.bodyIdMax;
                                    long mo839localPositionOfR5De75A = layoutCoordinates.mo839localPositionOfR5De75A(layoutCoordinates2, floatToRawIntBits);
                                    long mo839localPositionOfR5De75A2 = layoutCoordinates.mo839localPositionOfR5De75A(layoutCoordinates2, floatToRawIntBits3 | (floatToRawIntBits2 << 32));
                                    f = Math.min(f, Float.intBitsToFloat((int) (mo839localPositionOfR5De75A >> 32)));
                                    f2 = Math.min(f2, Float.intBitsToFloat((int) (mo839localPositionOfR5De75A & BodyPartID.bodyIdMax)));
                                    f3 = Math.max(f3, Float.intBitsToFloat((int) (mo839localPositionOfR5De75A2 >> 32)));
                                    f4 = Math.max(f4, Float.intBitsToFloat((int) (mo839localPositionOfR5De75A2 & BodyPartID.bodyIdMax)));
                                }
                                i8++;
                                rect4 = rect3;
                                size3 = i;
                                i6 = 0;
                                r8 = 1;
                            }
                            rect = rect4;
                            rect2 = new Rect(f, f2, f3, f4);
                        }
                        if (!rect2.equals(rect)) {
                            Rect intersect = SimpleLayoutKt.visibleBounds(layoutCoordinates).intersect(rect2);
                            if (intersect.right - intersect.left >= RecyclerView.DECELERATION_RATE && intersect.bottom - intersect.top >= RecyclerView.DECELERATION_RATE) {
                                Rect m637translatek4lQ0M = intersect.m637translatek4lQ0M(layoutCoordinates.mo841localToRootMKHz9U(0L));
                                float f9 = m637translatek4lQ0M.bottom;
                                SemanticsPropertyKey semanticsPropertyKey = SelectionHandlesKt.SelectionHandleInfoKey;
                                return Rect.copy$default(m637translatek4lQ0M, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f9 + 100.0f, 7);
                            }
                        }
                    }
                }
                return null;
            case 4:
                SelectionManager selectionManager2 = this.f$0;
                selectionManager2.showToolbar = true;
                selectionManager2.updateSelectionToolbar();
                selectionManager2.draggingHandle$delegate.setValue(null);
                selectionManager2.currentDragPosition$delegate.setValue(null);
                if (selectionManager2.isLongPressOrClickSelection && selectionManager2.isNonEmptySelection$foundation()) {
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    Ref$LongRef ref$LongRef = new Ref$LongRef();
                    SelectionRegistrarImpl selectionRegistrarImpl2 = selectionManager2.selectionRegistrar;
                    ArrayList sort2 = selectionRegistrarImpl2.sort(selectionManager2.requireContainerCoordinates$foundation());
                    ListIterator listIterator = sort2.listIterator(sort2.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            Selection selection4 = (Selection) selectionRegistrarImpl2.getSubselections().get(((MultiWidgetSelectionDelegate) listIterator.previous()).selectableId);
                            if (selection4 != null && selection4.start.offset != selection4.end.offset) {
                                i3 = listIterator.nextIndex();
                            }
                        } else {
                            i3 = -1;
                        }
                    }
                    if (i3 != -1) {
                        int size4 = sort2.size();
                        int i13 = 0;
                        while (i13 < size4) {
                            MultiWidgetSelectionDelegate multiWidgetSelectionDelegate3 = (MultiWidgetSelectionDelegate) sort2.get(i13);
                            j = 0;
                            Selection selection5 = (Selection) selectionRegistrarImpl2.getSubselections().get(multiWidgetSelectionDelegate3.selectableId);
                            if (selection5 != null) {
                                AnnotatedString text = multiWidgetSelectionDelegate3.getText();
                                long TextRange = SizeKt.TextRange(selection5.start.offset, selection5.end.offset);
                                r8 = i13 < i3 ? 0 : 1;
                                long j2 = multiWidgetSelectionDelegate3.selectableId;
                                if (r8 != 0) {
                                    ref$ObjectRef.element = text;
                                    ref$ObjectRef2.element = new TextRange(TextRange);
                                    ref$LongRef.element = j2;
                                }
                                obj = ref$ObjectRef.element;
                                if (obj != null && ref$ObjectRef2.element != null && ref$LongRef.element != j && ((CharSequence) obj).length() > 0 && (coroutineScope = selectionManager2.coroutineScope) != null) {
                                    JobKt.launch$default(coroutineScope, null, null, new FlowExtKt$simpleScan$1(14, selectionManager2, ref$ObjectRef, ref$ObjectRef2, ref$LongRef, null, false), 3);
                                }
                            } else {
                                i13++;
                            }
                        }
                    }
                    j = 0;
                    obj = ref$ObjectRef.element;
                    if (obj != null) {
                        JobKt.launch$default(coroutineScope, null, null, new FlowExtKt$simpleScan$1(14, selectionManager2, ref$ObjectRef, ref$ObjectRef2, ref$LongRef, null, false), 3);
                    }
                }
                selectionManager2.isLongPressOrClickSelection = false;
                return Unit.INSTANCE;
            case 5:
                selectionManager.copy$foundation();
                if (selectionManager.isInTouchMode()) {
                    selectionManager.onRelease();
                }
                return Unit.INSTANCE;
            case 6:
                return Boolean.valueOf((selectionManager.showToolbar && selectionManager.isInTouchMode()) ? false : true);
            default:
                SelectionRegistrarImpl selectionRegistrarImpl3 = selectionManager.selectionRegistrar;
                ArrayList sort3 = selectionRegistrarImpl3.sort(selectionManager.requireContainerCoordinates$foundation());
                if (!sort3.isEmpty()) {
                    MutableLongObjectMap mutableLongObjectMap = LongObjectMapKt.EmptyLongObjectMap;
                    MutableLongObjectMap mutableLongObjectMap2 = new MutableLongObjectMap();
                    int size5 = sort3.size();
                    int i14 = 0;
                    Selection selection6 = null;
                    Selection selection7 = null;
                    while (i14 < size5) {
                        MultiWidgetSelectionDelegate multiWidgetSelectionDelegate4 = (MultiWidgetSelectionDelegate) sort3.get(i14);
                        long j3 = multiWidgetSelectionDelegate4.selectableId;
                        TextLayoutResult textLayoutResult2 = (TextLayoutResult) multiWidgetSelectionDelegate4.layoutResultCallback.invoke();
                        if (textLayoutResult2 == null) {
                            arrayList = sort3;
                            i4 = size5;
                            selection = null;
                        } else {
                            int length3 = textLayoutResult2.layoutInput.text.text.length();
                            arrayList = sort3;
                            i4 = size5;
                            selection = new Selection(new Selection.AnchorInfo(textLayoutResult2.getBidiRunDirection(0), 0, j3), new Selection.AnchorInfo(textLayoutResult2.getBidiRunDirection(Math.max(length3 - 1, 0)), length3, j3), false);
                        }
                        if (selection != null) {
                            if (selection6 == null) {
                                selection6 = selection;
                            }
                            long j4 = multiWidgetSelectionDelegate4.selectableId;
                            int findAbsoluteInsertIndex = mutableLongObjectMap2.findAbsoluteInsertIndex(j4);
                            Object[] objArr = mutableLongObjectMap2.values;
                            Object obj2 = objArr[findAbsoluteInsertIndex];
                            mutableLongObjectMap2.keys[findAbsoluteInsertIndex] = j4;
                            objArr[findAbsoluteInsertIndex] = selection;
                            selection7 = selection;
                        }
                        i14++;
                        sort3 = arrayList;
                        size5 = i4;
                    }
                    if (mutableLongObjectMap2._size != 0) {
                        if (selection6 != selection7) {
                            selection6.getClass();
                            Selection.AnchorInfo anchorInfo = selection6.start;
                            selection7.getClass();
                            selection6 = new Selection(anchorInfo, selection7.end, false);
                        }
                        selectionRegistrarImpl3.subselections$delegate.setValue(mutableLongObjectMap2);
                        selectionManager.onSelectionChange.invoke(selection6);
                        selectionManager.previousSelectionLayout = null;
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
