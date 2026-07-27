package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import com.facebook.internal.ServerProtocol;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyStaggeredGridMeasure.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082\b\u001a5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\n0\u000e¢\u0006\u0002\b\u000fH\u0083\b¢\u0006\u0002\u0010\u0010\u001aR\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u000e2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u0001H\u0083\b\u001a;\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\"\u001a\u001d\u0010#\u001a\u00020\b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e0\u001dH\u0002¢\u0006\u0002\u0010$\u001a\u001c\u0010%\u001a\u00020\u0005*\u00020\u00142\u0006\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020\u0003H\u0002\u001a7\u0010(\u001a\u00020\u0005\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00122\b\b\u0002\u0010)\u001a\u00020\u00012\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\b\u001a\u001c\u0010+\u001a\u00020\u0003*\u00020\u00142\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0002\u001a+\u0010.\u001a\u00020\u0005*\u00020/2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\bø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\f\u00102\u001a\u00020\u0003*\u00020 H\u0002\u001a2\u00103\u001a\u00020\u0003\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u001d2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b¢\u0006\u0002\u00104\u001a\u0016\u00105\u001a\u00020\u0003*\u00020 2\b\b\u0002\u00106\u001a\u00020\u0003H\u0000\u001a\u001e\u00107\u001a\u00020\u0003*\u00020 2\u0006\u00108\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a,\u0010;\u001a\u00020<*\u00020\u00142\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020 2\u0006\u0010?\u001a\u00020 2\u0006\u0010@\u001a\u00020\u0001H\u0003\u001a\u0084\u0001\u0010A\u001a\u00020<*\u00020\f2\u0006\u0010B\u001a\u00020C2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020\u00012\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010R\u001a\u00020\u00032\u0006\u0010S\u001a\u00020TH\u0001ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001a\u0014\u0010W\u001a\u00020\u0005*\u00020 2\u0006\u0010X\u001a\u00020\u0003H\u0002\u001a!\u0010Y\u001a\u00020 *\u00020 2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Z"}, d2 = {"DebugLoggingEnabled", "", "Unset", "", "debugLog", "", "message", "Lkotlin/Function0;", "", "withDebugLogging", "T", "scope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "calculateExtraItems", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "position", "filter", "Lkotlin/ParameterName;", "name", "itemIndex", "beforeVisibleBounds", "calculateVisibleItems", "measuredItems", "", "Lkotlin/collections/ArrayDeque;", "itemScrollOffsets", "", "mainAxisLayoutSize", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[II)Ljava/util/List;", "debugRender", "([Lkotlin/collections/ArrayDeque;)Ljava/lang/String;", "ensureIndicesInRange", "indices", "itemCount", "fastForEach", "reverse", "action", "findPreviousItemIndex", "item", "lane", "forEach", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "forEach-nIS5qE8", "(JLkotlin/jvm/functions/Function1;)V", "indexOfMaxValue", "indexOfMinBy", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "indexOfMinValue", "minBound", "maxInRange", "indexRange", "maxInRange-jy6DScQ", "([IJ)I", "measure", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "initialScrollDelta", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "measureStaggeredGrid", ServerProtocol.DIALOG_PARAM_STATE, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "pinnedItems", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "resolvedSlots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "isVertical", "reverseLayout", "contentOffset", "Landroidx/compose/ui/unit/IntOffset;", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "measureStaggeredGrid-sdzDtKU", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIIILkotlinx/coroutines/CoroutineScope;)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "offsetBy", "delta", "transform", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;
    private static final int Unset = Integer.MIN_VALUE;

    private static final void debugLog(Function0<String> function0) {
    }

    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, Function1<? super LazyLayoutMeasureScope, ? extends T> function1) {
        return function1.invoke(lazyLayoutMeasureScope);
    }

    private static final String debugRender(ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr) {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: measureStaggeredGrid-sdzDtKU, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m763measureStaggeredGridsdzDtKU(LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j, boolean z, boolean z2, long j2, int i, int i2, int i3, int i4, CoroutineScope coroutineScope) {
        T t;
        int m762maxInRangejy6DScQ;
        T t2;
        int i5;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j, z, lazyLayoutMeasureScope, i, j2, i3, i4, z2, i2, coroutineScope, null);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Snapshot createNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getScrollPosition().getIndices());
                int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition().getScrollOffsets();
                if (updateScrollPositionIfTheFirstItemWasMoved$foundation_release.length == lazyStaggeredGridMeasureContext.getLaneCount()) {
                    t = updateScrollPositionIfTheFirstItemWasMoved$foundation_release;
                } else {
                    lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                    int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
                    int[] iArr = new int[laneCount];
                    int i6 = 0;
                    while (i6 < laneCount) {
                        if (i6 >= updateScrollPositionIfTheFirstItemWasMoved$foundation_release.length || (m762maxInRangejy6DScQ = updateScrollPositionIfTheFirstItemWasMoved$foundation_release[i6]) == -1) {
                            m762maxInRangejy6DScQ = i6 == 0 ? 0 : m762maxInRangejy6DScQ(iArr, SpanRange.m772constructorimpl(0, i6)) + 1;
                        }
                        iArr[i6] = m762maxInRangejy6DScQ;
                        lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i6], i6);
                        i6++;
                    }
                    t = iArr;
                }
                objectRef.element = t;
                if (scrollOffsets.length == lazyStaggeredGridMeasureContext.getLaneCount()) {
                    t2 = scrollOffsets;
                } else {
                    int laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
                    int[] iArr2 = new int[laneCount2];
                    int i7 = 0;
                    while (i7 < laneCount2) {
                        if (i7 < scrollOffsets.length) {
                            i5 = scrollOffsets[i7];
                        } else {
                            i5 = i7 == 0 ? 0 : iArr2[i7 - 1];
                        }
                        iArr2[i7] = i5;
                        i7++;
                    }
                    t2 = iArr2;
                }
                objectRef2.element = t2;
                Unit unit = Unit.INSTANCE;
                createNonObservableSnapshot.dispose();
                return measure(lazyStaggeredGridMeasureContext, MathKt.roundToInt(lazyStaggeredGridState.getScrollToBeConsumed()), (int[]) objectRef.element, (int[]) objectRef2.element, true);
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:235:0x055c, code lost:
    
        if (r7[r6] > r11) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x02f5, code lost:
    
        r2 = indexOfMinValue$default(r5, 0, 1, null);
        r4 = indexOfMaxValue(r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0300, code lost:
    
        if (r2 == r4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0306, code lost:
    
        if (r5[r2] != r5[r4]) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0308, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x030a, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x030b, code lost:
    
        r4 = r29[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x030e, code lost:
    
        if (r4 != (-1)) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0310, code lost:
    
        r8 = r37;
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0316, code lost:
    
        r4 = findPreviousItemIndex(r8, r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x031a, code lost:
    
        if (r4 >= 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x035c, code lost:
    
        r14 = r28;
        r7 = r29;
        r39 = r3;
        r2 = r8.m759getSpanRangelOCCd4c(r37.getItemProvider(), r4, r2);
        r13 = r37.getLaneInfo();
        r24 = r10;
        r25 = r11;
        r10 = (int) (r2 & 4294967295L);
        r29 = r0;
        r28 = r1;
        r0 = (int) (r2 >> 32);
        r1 = r10 - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0386, code lost:
    
        if (r1 == 1) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0388, code lost:
    
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x038d, code lost:
    
        if (r20 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x038f, code lost:
    
        r11 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0392, code lost:
    
        r13.setLane(r4, r11);
        r11 = r37.getMeasuredItemProvider().m767getAndMeasurejy6DScQ(r4, r2);
        r2 = m762maxInRangejy6DScQ(r5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x03a2, code lost:
    
        if (r1 == 1) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x03a4, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x03a7, code lost:
    
        if (r1 == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x03a9, code lost:
    
        r1 = r37.getLaneInfo().getGaps(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x03b3, code lost:
    
        if (r0 >= r10) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x03b7, code lost:
    
        if (r5[r0] == r2) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x03b9, code lost:
    
        r29 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x03bb, code lost:
    
        r9[r0].addFirst(r11);
        r7[r0] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x03c2, code lost:
    
        if (r1 != null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x03c4, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x03c8, code lost:
    
        r5[r0] = (r11.getSizeWithSpacings() + r2) + r3;
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x03c6, code lost:
    
        r3 = r1[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x03b2, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x03a6, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0391, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x038b, code lost:
    
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x031c, code lost:
    
        r7 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x031e, code lost:
    
        if (r0 != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0324, code lost:
    
        if (measure$lambda$38$misalignedStart(r7, r8, r5, r2) == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0350, code lost:
    
        r14 = r28;
        r28 = r1;
        r39 = r3;
        r24 = r10;
        r25 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0326, code lost:
    
        if (r41 == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0328, code lost:
    
        r37.getLaneInfo().reset();
        r0 = r7.length;
        r1 = new int[r0];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0333, code lost:
    
        if (r3 >= r0) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0335, code lost:
    
        r1[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x033b, code lost:
    
        r0 = r5.length;
        r3 = new int[r0];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x033f, code lost:
    
        if (r4 >= r0) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0341, code lost:
    
        r3[r4] = r5[r2];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x034f, code lost:
    
        return measure(r8, r28, r1, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0314, code lost:
    
        r8 = r37;
     */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x064a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final LazyStaggeredGridMeasureResult measure(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int[] iArr, int[] iArr2, boolean z) {
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr3;
        final LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2;
        int i6;
        int[] iArr4;
        int i7;
        int i8;
        int[] iArr5;
        int i9;
        int i10;
        int i11;
        int[] iArr6;
        int i12;
        int[] iArr7;
        int i13;
        boolean z3;
        int i14;
        int m5704constrainWidthK40F9xA;
        int m5689getMaxHeightimpl;
        int i15;
        int i16;
        int[] iArr8;
        ArrayList arrayList;
        boolean z4;
        boolean z5;
        boolean z6;
        int[] iArr9;
        List<Integer> list;
        int i17;
        boolean z7;
        int[] iArr10;
        boolean z8;
        int i18;
        int[] iArr11;
        boolean z9;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext3 = lazyStaggeredGridMeasureContext;
        int i19 = i;
        LazyLayoutMeasureScope measureScope = lazyStaggeredGridMeasureContext.getMeasureScope();
        int itemCount = lazyStaggeredGridMeasureContext.getItemProvider().getItemCount();
        if (itemCount <= 0 || lazyStaggeredGridMeasureContext.getLaneCount() == 0) {
            return new LazyStaggeredGridMeasureResult(iArr, iArr2, 0.0f, MeasureScope.layout$default(measureScope, Constraints.m5692getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints()), Constraints.m5691getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints()), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null), false, lazyStaggeredGridMeasureContext.getIsVertical(), false, itemCount, CollectionsKt.emptyList(), IntSizeKt.IntSize(Constraints.m5692getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints()), Constraints.m5691getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints())), -lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), null);
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        String str = "copyOf(this, size)";
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] copyOf2 = Arrays.copyOf(iArr2, iArr2.length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
        ensureIndicesInRange(lazyStaggeredGridMeasureContext3, copyOf, itemCount);
        offsetBy(copyOf2, -i19);
        int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[laneCount];
        for (int i20 = 0; i20 < laneCount; i20++) {
            arrayDequeArr[i20] = new ArrayDeque(16);
        }
        offsetBy(copyOf2, -lazyStaggeredGridMeasureContext.getBeforeContentPadding());
        boolean z10 = false;
        while (true) {
            if (!measure$lambda$38$hasSpaceBeforeFirst(copyOf, copyOf2, lazyStaggeredGridMeasureContext3)) {
                z2 = z10;
                i2 = itemCount;
                i3 = -1;
                break;
            }
            i3 = indexOfMaxValue(copyOf);
            int i21 = copyOf[i3];
            int length = copyOf2.length;
            for (int i22 = 0; i22 < length; i22++) {
                if (copyOf[i22] != copyOf[i3]) {
                    int i23 = copyOf2[i22];
                    int i24 = copyOf2[i3];
                    if (i23 < i24) {
                        copyOf2[i22] = i24;
                    }
                }
            }
            int findPreviousItemIndex = findPreviousItemIndex(lazyStaggeredGridMeasureContext3, i21, i3);
            if (findPreviousItemIndex < 0) {
                z2 = z10;
                i2 = itemCount;
                break;
            }
            long m759getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext3.m759getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), findPreviousItemIndex, i3);
            int i25 = (int) (4294967295L & m759getSpanRangelOCCd4c);
            int i26 = itemCount;
            int i27 = (int) (m759getSpanRangelOCCd4c >> 32);
            int i28 = i25 - i27;
            boolean z11 = z10;
            lazyStaggeredGridMeasureContext.getLaneInfo().setLane(findPreviousItemIndex, i28 != 1 ? -2 : i27);
            LazyStaggeredGridMeasuredItem m767getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m767getAndMeasurejy6DScQ(findPreviousItemIndex, m759getSpanRangelOCCd4c);
            int m762maxInRangejy6DScQ = m762maxInRangejy6DScQ(copyOf2, m759getSpanRangelOCCd4c);
            int[] gaps = i28 != 1 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(findPreviousItemIndex) : null;
            boolean z12 = z11;
            while (i27 < i25) {
                copyOf[i27] = findPreviousItemIndex;
                int sizeWithSpacings = m762maxInRangejy6DScQ + m767getAndMeasurejy6DScQ.getSizeWithSpacings() + (gaps == null ? 0 : gaps[i27]);
                copyOf2[i27] = sizeWithSpacings;
                if (lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + sizeWithSpacings <= 0) {
                    z12 = true;
                }
                i27++;
            }
            z10 = z12;
            itemCount = i26;
        }
        int i29 = -lazyStaggeredGridMeasureContext.getBeforeContentPadding();
        int i30 = copyOf2[0];
        if (i30 < i29) {
            i19 += i30;
            offsetBy(copyOf2, i29 - i30);
        }
        offsetBy(copyOf2, lazyStaggeredGridMeasureContext.getBeforeContentPadding());
        int i31 = -1;
        if (i3 == -1) {
            i3 = ArraysKt.indexOf(copyOf, 0);
        }
        if (i3 != -1 && measure$lambda$38$misalignedStart(copyOf, lazyStaggeredGridMeasureContext3, copyOf2, i3) && z) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int length2 = copyOf.length;
            int[] iArr12 = new int[length2];
            int i32 = 0;
            while (i32 < length2) {
                iArr12[i32] = i31;
                i32++;
                i31 = -1;
            }
            int length3 = copyOf2.length;
            int[] iArr13 = new int[length3];
            for (int i33 = 0; i33 < length3; i33++) {
                iArr13[i33] = copyOf2[i3];
            }
            return measure(lazyStaggeredGridMeasureContext3, i19, iArr12, iArr13, false);
        }
        int[] copyOf3 = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(copyOf3, "copyOf(this, size)");
        int length4 = copyOf2.length;
        int[] iArr14 = new int[length4];
        for (int i34 = 0; i34 < length4; i34++) {
            iArr14[i34] = -copyOf2[i34];
        }
        int mainAxisSpacing = i29 + lazyStaggeredGridMeasureContext.getMainAxisSpacing();
        int coerceAtLeast = RangesKt.coerceAtLeast(lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext.getAfterContentPadding(), 0);
        boolean z13 = z2;
        int indexOfMinValue$default = indexOfMinValue$default(copyOf3, 0, 1, null);
        int i35 = 0;
        int i36 = -1;
        while (indexOfMinValue$default != i36 && i35 < lazyStaggeredGridMeasureContext.getLaneCount()) {
            int i37 = copyOf3[indexOfMinValue$default];
            int indexOfMinValue = indexOfMinValue(copyOf3, i37);
            i35++;
            if (i37 >= 0) {
                LazyLayoutMeasureScope lazyLayoutMeasureScope = measureScope;
                String str2 = str;
                long m759getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext3.m759getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), i37, indexOfMinValue$default);
                LazyStaggeredGridMeasuredItem m767getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m767getAndMeasurejy6DScQ(i37, m759getSpanRangelOCCd4c2);
                int i38 = i19;
                int i39 = (int) (m759getSpanRangelOCCd4c2 & 4294967295L);
                int[] iArr15 = copyOf;
                int[] iArr16 = copyOf2;
                int i40 = (int) (m759getSpanRangelOCCd4c2 >> 32);
                int i41 = i39 - i40;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(i37, i41 != 1 ? -2 : i40);
                int m762maxInRangejy6DScQ2 = m762maxInRangejy6DScQ(iArr14, m759getSpanRangelOCCd4c2);
                for (int i42 = i40; i42 < i39; i42++) {
                    iArr14[i42] = m767getAndMeasurejy6DScQ2.getSizeWithSpacings() + m762maxInRangejy6DScQ2;
                    copyOf3[i42] = i37;
                    arrayDequeArr[i42].addLast(m767getAndMeasurejy6DScQ2);
                }
                if (m762maxInRangejy6DScQ2 >= mainAxisSpacing || iArr14[i40] > mainAxisSpacing) {
                    z9 = z13;
                } else {
                    m767getAndMeasurejy6DScQ2.setVisible(false);
                    z9 = true;
                }
                i35 = i41 != 1 ? lazyStaggeredGridMeasureContext.getLaneCount() : i35;
                z13 = z9;
                indexOfMinValue$default = indexOfMinValue;
                measureScope = lazyLayoutMeasureScope;
                str = str2;
                i19 = i38;
                copyOf = iArr15;
                copyOf2 = iArr16;
                i36 = -1;
                lazyStaggeredGridMeasureContext3 = lazyStaggeredGridMeasureContext;
            } else {
                i36 = -1;
                lazyStaggeredGridMeasureContext3 = lazyStaggeredGridMeasureContext;
                indexOfMinValue$default = indexOfMinValue;
            }
        }
        int i43 = i19;
        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = measureScope;
        String str3 = str;
        int[] iArr17 = copyOf;
        int[] iArr18 = copyOf2;
        loop9: while (true) {
            int i44 = 0;
            while (true) {
                if (i44 < length4) {
                    int i45 = iArr14[i44];
                    if (i45 < coerceAtLeast || i45 <= 0) {
                        break;
                    }
                    i44++;
                } else {
                    for (int i46 = 0; i46 < laneCount; i46++) {
                        if (!arrayDequeArr[i46].isEmpty()) {
                            i4 = i2;
                            i5 = 1;
                            break loop9;
                        }
                    }
                }
            }
            i5 = 1;
            int indexOfMinValue$default2 = indexOfMinValue$default(iArr14, 0, 1, null);
            int maxOrThrow = ArraysKt.maxOrThrow(copyOf3) + 1;
            i4 = i2;
            if (maxOrThrow >= i4) {
                break;
            }
            int i47 = coerceAtLeast;
            int[] iArr19 = copyOf3;
            int i48 = length4;
            int[] iArr20 = iArr14;
            String str4 = str3;
            int i49 = i43;
            int[] iArr21 = iArr17;
            int[] iArr22 = iArr18;
            long m759getSpanRangelOCCd4c3 = lazyStaggeredGridMeasureContext.m759getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), maxOrThrow, indexOfMinValue$default2);
            int i50 = (int) (m759getSpanRangelOCCd4c3 & 4294967295L);
            int i51 = laneCount;
            int i52 = (int) (m759getSpanRangelOCCd4c3 >> 32);
            int i53 = i50 - i52;
            lazyStaggeredGridMeasureContext.getLaneInfo().setLane(maxOrThrow, i53 != 1 ? -2 : i52);
            LazyStaggeredGridMeasuredItem m767getAndMeasurejy6DScQ3 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m767getAndMeasurejy6DScQ(maxOrThrow, m759getSpanRangelOCCd4c3);
            iArr14 = iArr20;
            int m762maxInRangejy6DScQ3 = m762maxInRangejy6DScQ(iArr14, m759getSpanRangelOCCd4c3);
            if (i53 != 1) {
                iArr11 = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(maxOrThrow);
                if (iArr11 == null) {
                    iArr11 = new int[lazyStaggeredGridMeasureContext.getLaneCount()];
                }
            } else {
                iArr11 = null;
            }
            int i54 = i52;
            while (i54 < i50) {
                if (iArr11 != null) {
                    iArr11[i54] = m762maxInRangejy6DScQ3 - iArr14[i54];
                }
                iArr19[i54] = maxOrThrow;
                iArr14[i54] = m762maxInRangejy6DScQ3 + m767getAndMeasurejy6DScQ3.getSizeWithSpacings();
                arrayDequeArr[i54].addLast(m767getAndMeasurejy6DScQ3);
                i54++;
                iArr19 = iArr19;
            }
            int[] iArr23 = iArr19;
            lazyStaggeredGridMeasureContext.getLaneInfo().setGaps(maxOrThrow, iArr11);
            if (m762maxInRangejy6DScQ3 < mainAxisSpacing && iArr14[i52] <= mainAxisSpacing) {
                m767getAndMeasurejy6DScQ3.setVisible(false);
            }
            coerceAtLeast = i47;
            iArr17 = iArr21;
            str3 = str4;
            i43 = i49;
            laneCount = i51;
            copyOf3 = iArr23;
            length4 = i48;
            iArr18 = iArr22;
            i2 = i4;
        }
        int i55 = 0;
        while (i55 < laneCount) {
            ArrayDeque arrayDeque = arrayDequeArr[i55];
            while (arrayDeque.size() > i5 && !((LazyStaggeredGridMeasuredItem) arrayDeque.first()).getIsVisible()) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) arrayDeque.removeFirst();
                int[] gaps2 = lazyStaggeredGridMeasuredItem.getSpan() != i5 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem.getIndex()) : null;
                iArr18[i55] = iArr18[i55] - (lazyStaggeredGridMeasuredItem.getSizeWithSpacings() + (gaps2 == null ? 0 : gaps2[i55]));
                i5 = 1;
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) arrayDeque.firstOrNull();
            iArr17[i55] = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getIndex() : -1;
            i55++;
            i5 = 1;
        }
        int length5 = copyOf3.length;
        int i56 = 0;
        while (true) {
            if (i56 >= length5) {
                break;
            }
            if (copyOf3[i56] == i4 - 1) {
                offsetBy(iArr14, -lazyStaggeredGridMeasureContext.getMainAxisSpacing());
                break;
            }
            i56++;
        }
        int i57 = 0;
        while (true) {
            if (i57 < length4) {
                if (iArr14[i57] >= lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) {
                    lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
                    i6 = coerceAtLeast;
                    iArr4 = copyOf3;
                    i7 = length4;
                    i10 = i43;
                    iArr5 = iArr17;
                    iArr3 = iArr18;
                    break;
                }
                i57++;
            } else {
                int mainAxisAvailableSize = lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() - iArr14[indexOfMaxValue(iArr14)];
                iArr3 = iArr18;
                offsetBy(iArr3, -mainAxisAvailableSize);
                offsetBy(iArr14, mainAxisAvailableSize);
                boolean z14 = false;
                loop25: while (true) {
                    int length6 = iArr3.length;
                    int i58 = 0;
                    while (true) {
                        if (i58 >= length6) {
                            lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
                            i6 = coerceAtLeast;
                            iArr4 = copyOf3;
                            i7 = length4;
                            i8 = i43;
                            iArr5 = iArr17;
                            i9 = mainAxisAvailableSize;
                            break loop25;
                        }
                        if (iArr3[i58] < lazyStaggeredGridMeasureContext.getBeforeContentPadding()) {
                            break;
                        }
                        i58++;
                        i43 = i43;
                    }
                    coerceAtLeast = i12;
                    copyOf3 = iArr7;
                    length4 = i13;
                    mainAxisAvailableSize = i14;
                    z14 = z3;
                    iArr17 = iArr6;
                    i43 = i11;
                }
                if (z14 && z) {
                    lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                    return measure(lazyStaggeredGridMeasureContext2, i8, iArr5, iArr3, false);
                }
                i10 = i8 + i9;
                int i59 = iArr3[indexOfMinValue$default(iArr3, 0, 1, null)];
                if (i59 < 0) {
                    i10 += i59;
                    offsetBy(iArr14, i59);
                    offsetBy(iArr3, -i59);
                }
            }
        }
        float scrollToBeConsumed = (MathKt.getSign(MathKt.roundToInt(lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed())) != MathKt.getSign(i10) || Math.abs(MathKt.roundToInt(lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed())) < Math.abs(i10)) ? lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed() : i10;
        int[] copyOf4 = Arrays.copyOf(iArr3, iArr3.length);
        Intrinsics.checkNotNullExpressionValue(copyOf4, str3);
        int length7 = copyOf4.length;
        for (int i60 = 0; i60 < length7; i60++) {
            copyOf4[i60] = -copyOf4[i60];
        }
        if (lazyStaggeredGridMeasureContext.getBeforeContentPadding() > lazyStaggeredGridMeasureContext.getMainAxisSpacing()) {
            for (int i61 = 0; i61 < laneCount; i61++) {
                ArrayDeque arrayDeque2 = arrayDequeArr[i61];
                int size = arrayDeque2.size();
                int i62 = 0;
                while (i62 < size) {
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = (LazyStaggeredGridMeasuredItem) arrayDeque2.get(i62);
                    int[] gaps3 = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem3.getIndex());
                    int sizeWithSpacings2 = lazyStaggeredGridMeasuredItem3.getSizeWithSpacings() + (gaps3 == null ? 0 : gaps3[i61]);
                    if (i62 != CollectionsKt.getLastIndex(arrayDeque2) && (i18 = iArr3[i61]) != 0 && i18 >= sizeWithSpacings2) {
                        iArr3[i61] = i18 - sizeWithSpacings2;
                        i62++;
                        iArr5[i61] = ((LazyStaggeredGridMeasuredItem) arrayDeque2.get(i62)).getIndex();
                    }
                }
            }
        }
        int beforeContentPadding = lazyStaggeredGridMeasureContext.getBeforeContentPadding() + lazyStaggeredGridMeasureContext.getAfterContentPadding();
        if (lazyStaggeredGridMeasureContext.getIsVertical()) {
            m5704constrainWidthK40F9xA = Constraints.m5690getMaxWidthimpl(lazyStaggeredGridMeasureContext.getConstraints());
        } else {
            m5704constrainWidthK40F9xA = ConstraintsKt.m5704constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), ArraysKt.maxOrThrow(iArr14) + beforeContentPadding);
        }
        if (lazyStaggeredGridMeasureContext.getIsVertical()) {
            m5689getMaxHeightimpl = ConstraintsKt.m5703constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), ArraysKt.maxOrThrow(iArr14) + beforeContentPadding);
        } else {
            m5689getMaxHeightimpl = Constraints.m5689getMaxHeightimpl(lazyStaggeredGridMeasureContext.getConstraints());
        }
        int min = (Math.min(lazyStaggeredGridMeasureContext.getIsVertical() ? m5689getMaxHeightimpl : m5704constrainWidthK40F9xA, lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) - lazyStaggeredGridMeasureContext.getBeforeContentPadding()) + lazyStaggeredGridMeasureContext.getAfterContentPadding();
        int i63 = copyOf4[0];
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size2 = pinnedItems.size() - 1;
        if (size2 >= 0) {
            arrayList = null;
            while (true) {
                int i64 = size2 - 1;
                int intValue = pinnedItems.get(size2).intValue();
                List<Integer> list2 = pinnedItems;
                int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(intValue);
                iArr8 = iArr3;
                if (lane == -2 || lane == -1) {
                    int length8 = iArr5.length;
                    int i65 = 0;
                    while (i65 < length8) {
                        int i66 = length8;
                        if (!(iArr5[i65] > intValue)) {
                            z8 = false;
                            break;
                        }
                        i65++;
                        length8 = i66;
                    }
                    z8 = true;
                }
                if (z8) {
                    i15 = m5689getMaxHeightimpl;
                    i16 = m5704constrainWidthK40F9xA;
                    long m759getSpanRangelOCCd4c4 = lazyStaggeredGridMeasureContext2.m759getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem m767getAndMeasurejy6DScQ4 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m767getAndMeasurejy6DScQ(intValue, m759getSpanRangelOCCd4c4);
                    i63 -= m767getAndMeasurejy6DScQ4.getSizeWithSpacings();
                    m767getAndMeasurejy6DScQ4.position(i63, 0, min);
                    arrayList.add(m767getAndMeasurejy6DScQ4);
                } else {
                    i15 = m5689getMaxHeightimpl;
                    i16 = m5704constrainWidthK40F9xA;
                }
                if (i64 < 0) {
                    break;
                }
                pinnedItems = list2;
                size2 = i64;
                m5704constrainWidthK40F9xA = i16;
                m5689getMaxHeightimpl = i15;
                iArr3 = iArr8;
            }
        } else {
            i15 = m5689getMaxHeightimpl;
            i16 = m5704constrainWidthK40F9xA;
            iArr8 = iArr3;
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = CollectionsKt.emptyList();
        }
        List<LazyStaggeredGridMeasuredItem> calculateVisibleItems = calculateVisibleItems(lazyStaggeredGridMeasureContext2, arrayDequeArr, copyOf4, min);
        int i67 = copyOf4[0];
        List<Integer> pinnedItems2 = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size3 = pinnedItems2.size();
        int i68 = 0;
        ArrayList arrayList2 = null;
        while (i68 < size3) {
            int intValue2 = pinnedItems2.get(i68).intValue();
            if (intValue2 < i4) {
                int lane2 = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(intValue2);
                if (lane2 != -2 && lane2 != -1) {
                    if (iArr4[lane2] < intValue2) {
                        list = pinnedItems2;
                        i17 = size3;
                        iArr9 = iArr4;
                    }
                } else {
                    iArr9 = iArr4;
                    int length9 = iArr9.length;
                    list = pinnedItems2;
                    int i69 = 0;
                    while (i69 < length9) {
                        i17 = size3;
                        if (!(iArr9[i69] < intValue2)) {
                            z7 = false;
                            break;
                        }
                        i69++;
                        size3 = i17;
                    }
                    i17 = size3;
                }
                z7 = true;
                if (z7) {
                    iArr10 = iArr14;
                } else {
                    iArr10 = iArr14;
                    long m759getSpanRangelOCCd4c5 = lazyStaggeredGridMeasureContext2.m759getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue2, 0);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem m767getAndMeasurejy6DScQ5 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m767getAndMeasurejy6DScQ(intValue2, m759getSpanRangelOCCd4c5);
                    m767getAndMeasurejy6DScQ5.position(i67, 0, min);
                    i67 += m767getAndMeasurejy6DScQ5.getSizeWithSpacings();
                    arrayList2.add(m767getAndMeasurejy6DScQ5);
                }
                i68++;
                pinnedItems2 = list;
                size3 = i17;
                iArr14 = iArr10;
                iArr4 = iArr9;
            }
            list = pinnedItems2;
            i17 = size3;
            iArr9 = iArr4;
            z7 = false;
            if (z7) {
            }
            i68++;
            pinnedItems2 = list;
            size3 = i17;
            iArr14 = iArr10;
            iArr4 = iArr9;
        }
        int[] iArr24 = iArr4;
        int[] iArr25 = iArr14;
        if (arrayList2 == null) {
            arrayList2 = CollectionsKt.emptyList();
        }
        final ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList);
        arrayList3.addAll(calculateVisibleItems);
        arrayList3.addAll(arrayList2);
        lazyStaggeredGridMeasureContext.getState().getPlacementAnimator().onMeasured((int) scrollToBeConsumed, i16, i15, arrayList3, lazyStaggeredGridMeasureContext.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext.getIsVertical(), lazyStaggeredGridMeasureContext.getLaneCount(), lazyStaggeredGridMeasureContext.getCoroutineScope());
        int i70 = i7;
        int i71 = 0;
        while (true) {
            if (i71 >= i70) {
                z4 = false;
                break;
            }
            if (iArr25[i71] > lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) {
                z4 = true;
                break;
            }
            i71++;
        }
        if (!z4) {
            int length10 = iArr24.length;
            int i72 = 0;
            while (true) {
                if (i72 >= length10) {
                    z6 = true;
                    break;
                }
                if (!(iArr24[i72] < i4 + (-1))) {
                    z6 = false;
                    break;
                }
                i72++;
            }
            if (!z6) {
                z5 = false;
                return new LazyStaggeredGridMeasureResult(iArr5, iArr8, scrollToBeConsumed, MeasureScope.layout$default(lazyLayoutMeasureScope2, i16, i15, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$29
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope) {
                        List<LazyStaggeredGridMeasuredItem> list3 = arrayList3;
                        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext4 = lazyStaggeredGridMeasureContext2;
                        int size4 = list3.size();
                        for (int i73 = 0; i73 < size4; i73++) {
                            list3.get(i73).place(placementScope, lazyStaggeredGridMeasureContext4);
                        }
                        ObservableScopeInvalidator.m730attachToScopeimpl(lazyStaggeredGridMeasureContext2.getState().m770getPlacementScopeInvalidatorzYiylxw$foundation_release());
                    }
                }, 4, null), z5, lazyStaggeredGridMeasureContext.getIsVertical(), z13, i4, calculateVisibleItems, IntSizeKt.IntSize(i16, i15), i29, i6, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), null);
            }
        }
        z5 = true;
        return new LazyStaggeredGridMeasureResult(iArr5, iArr8, scrollToBeConsumed, MeasureScope.layout$default(lazyLayoutMeasureScope2, i16, i15, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$29
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                List<LazyStaggeredGridMeasuredItem> list3 = arrayList3;
                LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext4 = lazyStaggeredGridMeasureContext2;
                int size4 = list3.size();
                for (int i73 = 0; i73 < size4; i73++) {
                    list3.get(i73).place(placementScope, lazyStaggeredGridMeasureContext4);
                }
                ObservableScopeInvalidator.m730attachToScopeimpl(lazyStaggeredGridMeasureContext2.getState().m770getPlacementScopeInvalidatorzYiylxw$foundation_release());
            }
        }, 4, null), z5, lazyStaggeredGridMeasureContext.getIsVertical(), z13, i4, calculateVisibleItems, IntSizeKt.IntSize(i16, i15), i29, i6, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), null);
    }

    private static final boolean measure$lambda$38$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (iArr2[i] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i2 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$38$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateVisibleItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr, int[] iArr, int i) {
        int i2 = 0;
        for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque : arrayDequeArr) {
            i2 += arrayDeque.size();
        }
        ArrayList arrayList = new ArrayList(i2);
        while (true) {
            for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque2 : arrayDequeArr) {
                if (!arrayDeque2.isEmpty()) {
                    int length = arrayDequeArr.length;
                    int i3 = -1;
                    int i4 = Integer.MAX_VALUE;
                    for (int i5 = 0; i5 < length; i5++) {
                        LazyStaggeredGridMeasuredItem firstOrNull = arrayDequeArr[i5].firstOrNull();
                        int index = firstOrNull != null ? firstOrNull.getIndex() : Integer.MAX_VALUE;
                        if (i4 > index) {
                            i3 = i5;
                            i4 = index;
                        }
                    }
                    LazyStaggeredGridMeasuredItem removeFirst = arrayDequeArr[i3].removeFirst();
                    if (removeFirst.getLane() == i3) {
                        long m772constructorimpl = SpanRange.m772constructorimpl(removeFirst.getLane(), removeFirst.getSpan());
                        int m762maxInRangejy6DScQ = m762maxInRangejy6DScQ(iArr, m772constructorimpl);
                        int i6 = lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i3];
                        if (removeFirst.getPlaceablesCount() != 0) {
                            removeFirst.position(m762maxInRangejy6DScQ, i6, i);
                            arrayList.add(removeFirst);
                            int i7 = (int) (m772constructorimpl & 4294967295L);
                            for (int i8 = (int) (m772constructorimpl >> 32); i8 < i7; i8++) {
                                iArr[i8] = removeFirst.getSizeWithSpacings() + m762maxInRangejy6DScQ;
                            }
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, Function1<? super LazyStaggeredGridMeasuredItem, Unit> function1, Function1<? super Integer, Boolean> function12, boolean z) {
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        ArrayList arrayList = null;
        if (z) {
            int size = pinnedItems.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    int intValue = pinnedItems.get(size).intValue();
                    if (function12.invoke(Integer.valueOf(intValue)).booleanValue()) {
                        long m759getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m759getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue, 0);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        LazyStaggeredGridMeasuredItem m767getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m767getAndMeasurejy6DScQ(intValue, m759getSpanRangelOCCd4c);
                        function1.invoke(m767getAndMeasurejy6DScQ);
                        arrayList.add(m767getAndMeasurejy6DScQ);
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
        } else {
            int size2 = pinnedItems.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int intValue2 = pinnedItems.get(i2).intValue();
                if (function12.invoke(Integer.valueOf(intValue2)).booleanValue()) {
                    long m759getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext.m759getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue2, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem m767getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m767getAndMeasurejy6DScQ(intValue2, m759getSpanRangelOCCd4c2);
                    function1.invoke(m767getAndMeasurejy6DScQ2);
                    arrayList.add(m767getAndMeasurejy6DScQ2);
                }
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    /* renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m761forEachnIS5qE8(long j, Function1<? super Integer, Unit> function1) {
        int i = (int) (j & 4294967295L);
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            function1.invoke(Integer.valueOf(i2));
        }
    }

    private static final void offsetBy(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    /* renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m762maxInRangejy6DScQ(int[] iArr, long j) {
        int i = (int) (j & 4294967295L);
        int i2 = Integer.MIN_VALUE;
        for (int i3 = (int) (j >> 32); i3 < i; i3++) {
            i2 = Math.max(i2, iArr[i3]);
        }
        return i2;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i);
    }

    public static final int indexOfMinValue(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i + 1;
            int i6 = iArr[i4];
            if (i5 <= i6 && i6 < i3) {
                i2 = i4;
                i3 = i6;
            }
        }
        return i2;
    }

    private static final <T> int indexOfMinBy(T[] tArr, Function1<? super T, Integer> function1) {
        int length = tArr.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int intValue = function1.invoke(tArr[i3]).intValue();
            if (i2 > intValue) {
                i = i3;
                i2 = intValue;
            }
        }
        return i;
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    private static final int[] transform(int[] iArr, Function1<? super Integer, Integer> function1) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = function1.invoke(Integer.valueOf(iArr[i])).intValue();
        }
        return iArr;
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            while (true) {
                if (iArr[length] < i && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
            }
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int i2) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i, i2);
    }

    private static final <T> void fastForEach(List<? extends T> list, boolean z, Function1<? super T, Unit> function1) {
        if (z) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i = size - 1;
                function1.invoke(list.get(size));
                if (i < 0) {
                    return;
                } else {
                    size = i;
                }
            }
        } else {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                function1.invoke(list.get(i2));
            }
        }
    }

    static /* synthetic */ void fastForEach$default(List list, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if (z) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i2 = size - 1;
                function1.invoke(list.get(size));
                if (i2 < 0) {
                    return;
                } else {
                    size = i2;
                }
            }
        } else {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                function1.invoke(list.get(i3));
            }
        }
    }
}
