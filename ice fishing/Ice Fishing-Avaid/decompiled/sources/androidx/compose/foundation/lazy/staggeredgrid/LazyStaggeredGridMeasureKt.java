package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyStaggeredGridMeasure.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a5\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00030\u0007¢\u0006\u0002\b\bH\u0082\b¢\u0006\u0002\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0002¢\u0006\u0002\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013H\u0082\b\u001a£\u0001\u0010\u0014\u001a\u00020\u0015*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u00012\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u000200H\u0000¢\u0006\u0004\b1\u00102\u001a,\u00103\u001a\u00020\u0015*\u0002042\u0006\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u0001H\u0002\u001aK\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019*\u0002042\u0012\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010<\u001a\u0002072\u0006\u0010=\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u001aH\u0002¢\u0006\u0002\u0010@\u001aG\u0010A\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0019*\u0002042\u0006\u0010B\u001a\u00020\u001a2\u0006\u0010C\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u00012\u0018\u0010D\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00110EH\u0082\b\u001aR\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019*\u0002042\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u00072!\u0010G\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010K\u001a\u00020\u0001H\u0082\b\u001a7\u0010L\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00192\b\b\u0002\u0010M\u001a\u00020\u00012\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u00110\u0007H\u0082\b\u001a(\u0010O\u001a\u00020\u0011*\u00020P2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00110\u0007H\u0082\b¢\u0006\u0004\bQ\u0010R\u001a\u0014\u0010S\u001a\u00020\u0011*\u0002072\u0006\u0010T\u001a\u00020\u001aH\u0002\u001a\u001b\u0010U\u001a\u00020\u001a*\u0002072\u0006\u0010V\u001a\u00020PH\u0002¢\u0006\u0004\bW\u0010X\u001a\u0016\u0010Y\u001a\u00020\u001a*\u0002072\b\b\u0002\u0010Z\u001a\u00020\u001aH\u0000\u001a2\u0010[\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u001a0\u0007H\u0082\b¢\u0006\u0002\u0010\\\u001a\f\u0010]\u001a\u00020\u001a*\u000207H\u0002\u001a!\u0010^\u001a\u000207*\u0002072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u0007H\u0082\b\u001a\u001c\u0010_\u001a\u00020\u0011*\u0002042\u0006\u0010`\u001a\u0002072\u0006\u0010a\u001a\u00020\u001aH\u0002\u001a\u001c\u0010b\u001a\u00020\u001a*\u0002042\u0006\u0010c\u001a\u00020\u001a2\u0006\u0010d\u001a\u00020\u001aH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010e\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000¨\u0006f"}, d2 = {"DebugLoggingEnabled", "", "withDebugLogging", "T", "scope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "debugRender", "", "", "Lkotlin/collections/ArrayDeque;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "([Lkotlin/collections/ArrayDeque;)Ljava/lang/String;", "debugLog", "", "message", "Lkotlin/Function0;", "measureStaggeredGrid", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "pinnedItems", "", "", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "resolvedSlots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "isVertical", "reverseLayout", "contentOffset", "Landroidx/compose/ui/unit/IntOffset;", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "isInLookaheadScope", "isLookingAhead", "approachLayoutInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "measureStaggeredGrid-C6celF4", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIIILkotlinx/coroutines/CoroutineScope;ZZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;Landroidx/compose/ui/graphics/GraphicsContext;)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measure", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "initialScrollDelta", "initialItemIndices", "", "initialItemOffsets", "canRestartMeasure", "calculateVisibleItems", "measuredItems", "itemScrollOffsets", "mainAxisLayoutSize", "minOffset", "maxOffset", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[IIII)Ljava/util/List;", "itemsRetainedForLookahead", "lastVisibleItemIndex", "itemsCount", "position", "Lkotlin/Function2;", "calculateExtraItems", "filter", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "itemIndex", "beforeVisibleBounds", "fastForEach", "reverse", "action", "forEach", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "forEach-nIS5qE8", "(JLkotlin/jvm/functions/Function1;)V", "offsetBy", "delta", "maxInRange", "indexRange", "maxInRange-jy6DScQ", "([IJ)I", "indexOfMinValue", "minBound", "indexOfMinBy", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "indexOfMaxValue", "transform", "ensureIndicesInRange", "indices", "itemCount", "findPreviousItemIndex", "item", "lane", "Unset", "foundation"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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

    /* renamed from: measureStaggeredGrid-C6celF4, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m1487measureStaggeredGridC6celF4(LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j, boolean z, boolean z2, long j2, int i, int i2, int i3, int i4, CoroutineScope coroutineScope, boolean z3, boolean z4, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, GraphicsContext graphicsContext) {
        int i5;
        int m1486maxInRangejy6DScQ;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j, z, lazyLayoutMeasureScope, i, j2, i3, i4, z2, i2, coroutineScope, z3, z4, lazyStaggeredGridLayoutInfo != null ? lazyStaggeredGridLayoutInfo.getVisibleItemsInfo() : null, graphicsContext, null);
        int[] updateScrollPositionIfTheFirstItemWasMoved$foundation = lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getScrollPosition().getIndices());
        int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition().getScrollOffsets();
        if (updateScrollPositionIfTheFirstItemWasMoved$foundation.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr = new int[laneCount];
            int i6 = 0;
            while (i6 < laneCount) {
                if (i6 >= updateScrollPositionIfTheFirstItemWasMoved$foundation.length || (m1486maxInRangejy6DScQ = updateScrollPositionIfTheFirstItemWasMoved$foundation[i6]) == -1) {
                    m1486maxInRangejy6DScQ = i6 == 0 ? 0 : m1486maxInRangejy6DScQ(iArr, SpanRange.m1497constructorimpl(0, i6)) + 1;
                }
                iArr[i6] = m1486maxInRangejy6DScQ;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i6], i6);
                i6++;
            }
            updateScrollPositionIfTheFirstItemWasMoved$foundation = iArr;
        }
        if (scrollOffsets.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
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
            scrollOffsets = iArr2;
        }
        return measure(lazyStaggeredGridMeasureContext, Math.round(lazyStaggeredGridState.scrollToBeConsumed$foundation(z4)), updateScrollPositionIfTheFirstItemWasMoved$foundation, scrollOffsets, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x057b, code lost:
    
        if ((r1 != null ? r1.getIndex() : -1) > r13) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0797, code lost:
    
        if (r8[r1] < r11) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x02f6, code lost:
    
        r6 = indexOfMinValue$default(r9, 0, 1, null);
        r7 = indexOfMaxValue(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0301, code lost:
    
        if (r6 == r7) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0307, code lost:
    
        if (r9[r6] != r9[r7]) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0309, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x030b, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x030c, code lost:
    
        r7 = r28[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x030f, code lost:
    
        if (r7 != (-1)) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0311, code lost:
    
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0312, code lost:
    
        r7 = findPreviousItemIndex(r0, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0316, code lost:
    
        if (r7 >= 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0357, code lost:
    
        r11 = r27;
        r10 = r28;
        r26 = r1;
        r47 = r2;
        r1 = r0.m1481getSpanRangelOCCd4c(r0.getItemProvider(), r7, r6);
        r6 = r0.getLaneInfo();
        r30 = r12;
        r27 = r13;
        r12 = (int) (r1 & 4294967295L);
        r28 = r3;
        r13 = r4;
        r3 = (int) (r1 >> r18);
        r4 = r12 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x037b, code lost:
    
        if (r4 == 1) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x037d, code lost:
    
        r29 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0382, code lost:
    
        if (r29 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0384, code lost:
    
        r15 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0387, code lost:
    
        r6.setLane(r7, r15);
        r6 = r0.getMeasuredItemProvider().m1490getAndMeasurejy6DScQ(r7, r1);
        r1 = m1486maxInRangejy6DScQ(r9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0397, code lost:
    
        if (r4 == 1) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0399, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x039c, code lost:
    
        if (r2 == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x039e, code lost:
    
        r2 = r0.getLaneInfo().getGaps(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x03a8, code lost:
    
        if (r3 >= r12) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x03ac, code lost:
    
        if (r9[r3] == r1) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x03ae, code lost:
    
        r26 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x03b0, code lost:
    
        r48[r3].addFirst(r6);
        r10[r3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x03b7, code lost:
    
        if (r2 != null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x03b9, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x03bd, code lost:
    
        r9[r3] = (r1 + r6.getMainAxisSizeWithSpacings()) + r4;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x03bb, code lost:
    
        r4 = r2[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x03a7, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x039b, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0386, code lost:
    
        r15 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0380, code lost:
    
        r29 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0318, code lost:
    
        r10 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x031a, code lost:
    
        if (r1 != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0320, code lost:
    
        if (measure$lambda$0$misalignedStart(r10, r0, r9, r6) == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x034d, code lost:
    
        r11 = r27;
        r47 = r2;
        r28 = r3;
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0322, code lost:
    
        if (r50 == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0324, code lost:
    
        r0.getLaneInfo().reset();
        r1 = r10.length;
        r2 = new int[r1];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x032f, code lost:
    
        if (r3 >= r1) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0331, code lost:
    
        r2[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0338, code lost:
    
        r1 = r9.length;
        r3 = new int[r1];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x033c, code lost:
    
        if (r4 >= r1) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x033e, code lost:
    
        r3[r4] = r9[r6];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x034c, code lost:
    
        return measure(r0, r27, r2, r3, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x071f A[LOOP:21: B:275:0x0671->B:307:0x071f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0731 A[EDGE_INSN: B:308:0x0731->B:309:0x0731 BREAK  A[LOOP:21: B:275:0x0671->B:307:0x071f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x08f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0715  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final LazyStaggeredGridMeasureResult measure(final LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int[] iArr, int[] iArr2, boolean z) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr3;
        int i7;
        int[] iArr4;
        int i8;
        int i9;
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        int[] iArr5;
        boolean z2;
        int i14;
        int i15;
        int i16;
        int i17;
        String str2;
        int[] iArr6;
        float f;
        int m9692constrainWidthK40F9xA;
        int m9674getMaxHeightimpl;
        int[] iArr7;
        List list;
        int i18;
        List list2;
        List<LazyStaggeredGridMeasuredItem> list3;
        int i19;
        ArrayList arrayList;
        int size;
        int i20;
        ArrayList arrayList2;
        ArrayList arrayList3;
        float f2;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z3;
        boolean z4;
        boolean z5;
        ArrayList arrayList4;
        boolean z6;
        boolean z7;
        boolean z8;
        List<Integer> list4;
        int i25;
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo;
        int index;
        int min;
        ArrayList arrayList5;
        boolean z9;
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo2;
        boolean z10;
        boolean z11;
        int i26;
        int[] iArr8;
        int i27;
        int i28;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
        final LazyLayoutMeasureScope measureScope = lazyStaggeredGridMeasureContext2.getMeasureScope();
        int itemCount = lazyStaggeredGridMeasureContext2.getItemProvider().getItemCount();
        if (itemCount <= 0 || lazyStaggeredGridMeasureContext2.getLaneCount() == 0) {
            int m9677getMinWidthimpl = Constraints.m9677getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints());
            int m9676getMinHeightimpl = Constraints.m9676getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints());
            lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation().onMeasured(0, m9677getMinWidthimpl, m9676getMinHeightimpl, new ArrayList(), lazyStaggeredGridMeasureContext.getMeasuredItemProvider().getKeyIndexMap(), lazyStaggeredGridMeasureContext.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext.getIsVertical(), measureScope.isLookingAhead(), lazyStaggeredGridMeasureContext.getLaneCount(), lazyStaggeredGridMeasureContext.getIsInLookaheadScope(), 0, 0, lazyStaggeredGridMeasureContext.getCoroutineScope(), lazyStaggeredGridMeasureContext.getGraphicsContext());
            if (!measureScope.isLookingAhead()) {
                long m1419getMinSizeToFitDisappearingItemsYbymL2g = lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation().m1419getMinSizeToFitDisappearingItemsYbymL2g();
                if (!IntSize.m9905equalsimpl0(m1419getMinSizeToFitDisappearingItemsYbymL2g, IntSize.INSTANCE.m9912getZeroYbymL2g())) {
                    m9677getMinWidthimpl = ConstraintsKt.m9692constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), (int) (m1419getMinSizeToFitDisappearingItemsYbymL2g >> 32));
                    m9676getMinHeightimpl = ConstraintsKt.m9691constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), (int) (m1419getMinSizeToFitDisappearingItemsYbymL2g & 4294967295L));
                }
            }
            return new LazyStaggeredGridMeasureResult(iArr, iArr2, 0.0f, MeasureScope.CC.layout$default(measureScope, m9677getMinWidthimpl, m9676getMinHeightimpl, null, new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit measure$lambda$0$0;
                    measure$lambda$0$0 = LazyStaggeredGridMeasureKt.measure$lambda$0$0((Placeable.PlacementScope) obj);
                    return measure$lambda$0$0;
                }
            }, 4, null), 0.0f, false, lazyStaggeredGridMeasureContext.getIsVertical(), false, lazyStaggeredGridMeasureContext.getResolvedSlots(), lazyStaggeredGridMeasureContext.getItemProvider().getSpanProvider(), measureScope, itemCount, CollectionsKt.emptyList(), IntSize.m9902constructorimpl((Constraints.m9676getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints()) & 4294967295L) | (Constraints.m9677getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints()) << 32)), -lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), lazyStaggeredGridMeasureContext.getCoroutineScope(), null);
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        String str3 = "copyOf(...)";
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        int[] copyOf2 = Arrays.copyOf(iArr2, iArr2.length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
        ensureIndicesInRange(lazyStaggeredGridMeasureContext2, copyOf, itemCount);
        offsetBy(copyOf2, -i);
        int laneCount = lazyStaggeredGridMeasureContext2.getLaneCount();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[laneCount];
        for (int i29 = 0; i29 < laneCount; i29++) {
            arrayDequeArr[i29] = new ArrayDeque(16);
        }
        offsetBy(copyOf2, -lazyStaggeredGridMeasureContext2.getBeforeContentPadding());
        boolean z12 = false;
        while (true) {
            if (!measure$lambda$0$hasSpaceBeforeFirst(copyOf, copyOf2, lazyStaggeredGridMeasureContext2)) {
                c = ' ';
                i2 = 0;
                i3 = -1;
                break;
            }
            i3 = indexOfMaxValue(copyOf);
            c = ' ';
            int i30 = copyOf[i3];
            int length = copyOf2.length;
            for (int i31 = 0; i31 < length; i31++) {
                if (copyOf[i31] != copyOf[i3]) {
                    int i32 = copyOf2[i31];
                    int i33 = copyOf2[i3];
                    if (i32 < i33) {
                        copyOf2[i31] = i33;
                    }
                }
            }
            i2 = 0;
            int findPreviousItemIndex = findPreviousItemIndex(lazyStaggeredGridMeasureContext2, i30, i3);
            if (findPreviousItemIndex < 0) {
                break;
            }
            long m1481getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext2.m1481getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext2.getItemProvider(), findPreviousItemIndex, i3);
            int i34 = (int) (m1481getSpanRangelOCCd4c & 4294967295L);
            ArrayDeque[] arrayDequeArr2 = arrayDequeArr;
            boolean z13 = z12;
            int i35 = (int) (m1481getSpanRangelOCCd4c >> 32);
            int i36 = i34 - i35;
            lazyStaggeredGridMeasureContext2.getLaneInfo().setLane(findPreviousItemIndex, i36 != 1 ? -2 : i35);
            LazyStaggeredGridMeasuredItem m1490getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().m1490getAndMeasurejy6DScQ(findPreviousItemIndex, m1481getSpanRangelOCCd4c);
            int m1486maxInRangejy6DScQ = m1486maxInRangejy6DScQ(copyOf2, m1481getSpanRangelOCCd4c);
            int[] gaps = i36 != 1 ? lazyStaggeredGridMeasureContext2.getLaneInfo().getGaps(findPreviousItemIndex) : null;
            boolean z14 = z13;
            while (i35 < i34) {
                copyOf[i35] = findPreviousItemIndex;
                int mainAxisSizeWithSpacings = m1486maxInRangejy6DScQ + m1490getAndMeasurejy6DScQ.getMainAxisSizeWithSpacings() + (gaps == null ? 0 : gaps[i35]);
                copyOf2[i35] = mainAxisSizeWithSpacings;
                if (lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize() + mainAxisSizeWithSpacings <= 0) {
                    z14 = true;
                }
                i35++;
            }
            arrayDequeArr = arrayDequeArr2;
            z12 = z14;
        }
        ArrayDeque[] arrayDequeArr3 = arrayDequeArr;
        boolean z15 = z12;
        int i37 = -lazyStaggeredGridMeasureContext2.getBeforeContentPadding();
        int i38 = copyOf2[i2];
        if (i38 < i37) {
            offsetBy(copyOf2, i37 - i38);
            i4 = i - (i37 - i38);
        } else {
            i4 = i;
        }
        offsetBy(copyOf2, lazyStaggeredGridMeasureContext2.getBeforeContentPadding());
        int i39 = -1;
        if (i3 == -1) {
            i3 = ArraysKt.indexOf(copyOf, i2);
        }
        if (i3 != -1 && measure$lambda$0$misalignedStart(copyOf, lazyStaggeredGridMeasureContext2, copyOf2, i3) && z) {
            lazyStaggeredGridMeasureContext2.getLaneInfo().reset();
            int length2 = copyOf.length;
            int[] iArr9 = new int[length2];
            int i40 = 0;
            while (i40 < length2) {
                iArr9[i40] = i39;
                i40++;
                i39 = -1;
            }
            int length3 = copyOf2.length;
            int[] iArr10 = new int[length3];
            for (int i41 = 0; i41 < length3; i41++) {
                iArr10[i41] = copyOf2[i3];
            }
            return measure(lazyStaggeredGridMeasureContext2, i4, iArr9, iArr10, false);
        }
        int[] copyOf3 = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(copyOf3, "copyOf(...)");
        int length4 = copyOf2.length;
        int[] iArr11 = new int[length4];
        for (int i42 = 0; i42 < length4; i42++) {
            iArr11[i42] = -copyOf2[i42];
        }
        int mainAxisSpacing = lazyStaggeredGridMeasureContext2.getMainAxisSpacing() + i37;
        int coerceAtLeast = RangesKt.coerceAtLeast(lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext2.getAfterContentPadding(), 0);
        int indexOfMinValue$default = indexOfMinValue$default(copyOf3, 0, 1, null);
        int i43 = 0;
        boolean z16 = z15;
        for (int i44 = -1; indexOfMinValue$default != i44 && i43 < lazyStaggeredGridMeasureContext2.getLaneCount(); i44 = -1) {
            int i45 = copyOf3[indexOfMinValue$default];
            int indexOfMinValue = indexOfMinValue(copyOf3, i45);
            i43++;
            if (i45 >= 0) {
                int i46 = i4;
                long m1481getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext2.m1481getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext2.getItemProvider(), i45, indexOfMinValue$default);
                LazyStaggeredGridMeasuredItem m1490getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().m1490getAndMeasurejy6DScQ(i45, m1481getSpanRangelOCCd4c2);
                ArrayDeque[] arrayDequeArr4 = arrayDequeArr3;
                LazyStaggeredGridLaneInfo laneInfo = lazyStaggeredGridMeasureContext2.getLaneInfo();
                int[] iArr12 = copyOf;
                int[] iArr13 = copyOf2;
                int i47 = (int) (m1481getSpanRangelOCCd4c2 & 4294967295L);
                int i48 = itemCount;
                int i49 = (int) (m1481getSpanRangelOCCd4c2 >> c);
                int i50 = i47 - i49;
                if (i50 != 1) {
                    i27 = i45;
                    i28 = -2;
                } else {
                    i27 = i45;
                    i28 = i49;
                }
                laneInfo.setLane(i27, i28);
                int m1486maxInRangejy6DScQ2 = m1486maxInRangejy6DScQ(iArr11, m1481getSpanRangelOCCd4c2);
                for (int i51 = i49; i51 < i47; i51++) {
                    iArr11[i51] = m1490getAndMeasurejy6DScQ2.getMainAxisSizeWithSpacings() + m1486maxInRangejy6DScQ2;
                    copyOf3[i51] = i27;
                    arrayDequeArr4[i51].addLast(m1490getAndMeasurejy6DScQ2);
                }
                if (m1486maxInRangejy6DScQ2 < mainAxisSpacing && iArr11[i49] <= mainAxisSpacing) {
                    m1490getAndMeasurejy6DScQ2.setVisible(false);
                    z16 = true;
                }
                i43 = i50 != 1 ? lazyStaggeredGridMeasureContext2.getLaneCount() : i43;
                arrayDequeArr3 = arrayDequeArr4;
                indexOfMinValue$default = indexOfMinValue;
                i4 = i46;
                copyOf = iArr12;
                copyOf2 = iArr13;
                itemCount = i48;
            } else {
                indexOfMinValue$default = indexOfMinValue;
            }
        }
        int i52 = i4;
        ArrayDeque[] arrayDequeArr5 = arrayDequeArr3;
        int[] iArr14 = copyOf;
        int[] iArr15 = copyOf2;
        int i53 = itemCount;
        loop9: while (true) {
            int i54 = 0;
            while (true) {
                if (i54 < length4) {
                    int i55 = iArr11[i54];
                    if (i55 < coerceAtLeast || i55 <= 0) {
                        break;
                    }
                    i54++;
                } else {
                    for (int i56 = 0; i56 < laneCount; i56++) {
                        if (!arrayDequeArr5[i56].isEmpty()) {
                            i5 = i53;
                            i6 = 1;
                            break loop9;
                        }
                    }
                }
            }
            i6 = 1;
            int indexOfMinValue$default2 = indexOfMinValue$default(iArr11, 0, 1, null);
            int maxOrThrow = ArraysKt.maxOrThrow(copyOf3) + 1;
            i5 = i53;
            if (maxOrThrow >= i5) {
                break;
            }
            int i57 = length4;
            String str4 = str3;
            ArrayDeque[] arrayDequeArr6 = arrayDequeArr5;
            int i58 = coerceAtLeast;
            boolean z17 = z16;
            int i59 = i52;
            long m1481getSpanRangelOCCd4c3 = lazyStaggeredGridMeasureContext2.m1481getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext2.getItemProvider(), maxOrThrow, indexOfMinValue$default2);
            int[] iArr16 = copyOf3;
            int i60 = (int) (m1481getSpanRangelOCCd4c3 & 4294967295L);
            int i61 = (int) (m1481getSpanRangelOCCd4c3 >> c);
            int i62 = i60 - i61;
            lazyStaggeredGridMeasureContext2.getLaneInfo().setLane(maxOrThrow, i62 != 1 ? -2 : i61);
            LazyStaggeredGridMeasuredItem m1490getAndMeasurejy6DScQ3 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1490getAndMeasurejy6DScQ(maxOrThrow, m1481getSpanRangelOCCd4c3);
            int m1486maxInRangejy6DScQ3 = m1486maxInRangejy6DScQ(iArr11, m1481getSpanRangelOCCd4c3);
            if (i62 != 1) {
                iArr8 = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(maxOrThrow);
                if (iArr8 == null) {
                    iArr8 = new int[lazyStaggeredGridMeasureContext.getLaneCount()];
                }
            } else {
                iArr8 = null;
            }
            for (int i63 = i61; i63 < i60; i63++) {
                if (iArr8 != null) {
                    iArr8[i63] = m1486maxInRangejy6DScQ3 - iArr11[i63];
                }
                iArr16[i63] = maxOrThrow;
                iArr11[i63] = m1486maxInRangejy6DScQ3 + m1490getAndMeasurejy6DScQ3.getMainAxisSizeWithSpacings();
                arrayDequeArr6[i63].addLast(m1490getAndMeasurejy6DScQ3);
            }
            lazyStaggeredGridMeasureContext.getLaneInfo().setGaps(maxOrThrow, iArr8);
            if (m1486maxInRangejy6DScQ3 < mainAxisSpacing && iArr11[i61] <= mainAxisSpacing) {
                m1490getAndMeasurejy6DScQ3.setVisible(false);
            }
            lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
            copyOf3 = iArr16;
            coerceAtLeast = i58;
            i53 = i5;
            str3 = str4;
            z16 = z17;
            arrayDequeArr5 = arrayDequeArr6;
            length4 = i57;
            i52 = i59;
        }
        int i64 = 0;
        while (i64 < laneCount) {
            ArrayDeque arrayDeque = arrayDequeArr5[i64];
            while (arrayDeque.size() > i6 && !((LazyStaggeredGridMeasuredItem) arrayDeque.first()).getIsVisible()) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) arrayDeque.removeFirst();
                int[] gaps2 = lazyStaggeredGridMeasuredItem.getSpan() != i6 ? lazyStaggeredGridMeasureContext2.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem.getIndex()) : null;
                iArr15[i64] = iArr15[i64] - (lazyStaggeredGridMeasuredItem.getMainAxisSizeWithSpacings() + (gaps2 == null ? 0 : gaps2[i64]));
                i6 = 1;
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) arrayDeque.firstOrNull();
            iArr14[i64] = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getIndex() : -1;
            i64++;
            i6 = 1;
        }
        int length5 = copyOf3.length;
        int i65 = 0;
        while (true) {
            if (i65 >= length5) {
                break;
            }
            if (copyOf3[i65] == i5 - 1) {
                offsetBy(iArr11, -lazyStaggeredGridMeasureContext2.getMainAxisSpacing());
                break;
            }
            i65++;
        }
        int i66 = 0;
        while (true) {
            if (i66 < length4) {
                if (iArr11[i66] >= lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize()) {
                    i9 = i5;
                    i12 = i52;
                    i7 = i12;
                    iArr4 = iArr14;
                    iArr3 = iArr15;
                    i10 = coerceAtLeast;
                    i11 = length4;
                    str = str3;
                    break;
                }
                i66++;
            } else {
                int mainAxisAvailableSize = lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize() - iArr11[indexOfMaxValue(iArr11)];
                iArr3 = iArr15;
                offsetBy(iArr3, -mainAxisAvailableSize);
                offsetBy(iArr11, mainAxisAvailableSize);
                boolean z18 = false;
                loop31: while (true) {
                    int length6 = iArr3.length;
                    int i67 = 0;
                    while (true) {
                        if (i67 >= length6) {
                            i7 = i52;
                            iArr4 = iArr14;
                            i8 = mainAxisAvailableSize;
                            i9 = i5;
                            i10 = coerceAtLeast;
                            break loop31;
                        }
                        if (iArr3[i67] < lazyStaggeredGridMeasureContext2.getBeforeContentPadding()) {
                            break;
                        }
                        i67++;
                        length4 = length4;
                        iArr14 = iArr14;
                        i52 = i52;
                    }
                    mainAxisAvailableSize = i14;
                    str3 = str2;
                    z18 = z2;
                    length4 = i16;
                    coerceAtLeast = i17;
                    i5 = i15;
                    iArr14 = iArr5;
                    i52 = i13;
                }
                i11 = length4;
                str = str3;
                if (z18 && z) {
                    lazyStaggeredGridMeasureContext2.getLaneInfo().reset();
                    return measure(lazyStaggeredGridMeasureContext2, i7, iArr4, iArr3, false);
                }
                i12 = i7 + i8;
                int i68 = iArr3[indexOfMinValue$default(iArr3, 0, 1, null)];
                if (i68 < 0) {
                    i12 += i68;
                    offsetBy(iArr11, i68);
                    offsetBy(iArr3, -i68);
                }
            }
        }
        float scrollToBeConsumed$foundation = lazyStaggeredGridMeasureContext2.getState().scrollToBeConsumed$foundation(measureScope.isLookingAhead());
        if (MathKt.getSign(Math.round(scrollToBeConsumed$foundation)) != MathKt.getSign(i12) || Math.abs(Math.round(scrollToBeConsumed$foundation)) < Math.abs(i12)) {
            iArr6 = iArr4;
            f = scrollToBeConsumed$foundation;
        } else {
            iArr6 = iArr4;
            f = i12;
        }
        float f3 = scrollToBeConsumed$foundation - f;
        float f4 = 0.0f;
        if (measureScope.isLookingAhead() && i12 > i7 && f3 <= 0.0f) {
            f4 = (i12 - i7) + f3;
        }
        float f5 = f4;
        int[] copyOf4 = Arrays.copyOf(iArr3, iArr3.length);
        Intrinsics.checkNotNullExpressionValue(copyOf4, str);
        int length7 = copyOf4.length;
        for (int i69 = 0; i69 < length7; i69++) {
            copyOf4[i69] = -copyOf4[i69];
        }
        if (lazyStaggeredGridMeasureContext2.getBeforeContentPadding() > lazyStaggeredGridMeasureContext2.getMainAxisSpacing()) {
            for (int i70 = 0; i70 < laneCount; i70++) {
                ArrayDeque arrayDeque2 = arrayDequeArr5[i70];
                int size2 = arrayDeque2.size();
                int i71 = 0;
                while (i71 < size2) {
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = (LazyStaggeredGridMeasuredItem) arrayDeque2.get(i71);
                    int[] gaps3 = lazyStaggeredGridMeasureContext2.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem3.getIndex());
                    int mainAxisSizeWithSpacings2 = lazyStaggeredGridMeasuredItem3.getMainAxisSizeWithSpacings() + (gaps3 == null ? 0 : gaps3[i70]);
                    if (i71 != CollectionsKt.getLastIndex(arrayDeque2) && (i26 = iArr3[i70]) != 0 && i26 >= mainAxisSizeWithSpacings2) {
                        iArr3[i70] = i26 - mainAxisSizeWithSpacings2;
                        i71++;
                        iArr6[i70] = ((LazyStaggeredGridMeasuredItem) arrayDeque2.get(i71)).getIndex();
                    }
                }
            }
        }
        int beforeContentPadding = lazyStaggeredGridMeasureContext2.getBeforeContentPadding() + lazyStaggeredGridMeasureContext2.getAfterContentPadding();
        if (lazyStaggeredGridMeasureContext2.getIsVertical()) {
            m9692constrainWidthK40F9xA = Constraints.m9675getMaxWidthimpl(lazyStaggeredGridMeasureContext2.getConstraints());
        } else {
            m9692constrainWidthK40F9xA = ConstraintsKt.m9692constrainWidthK40F9xA(lazyStaggeredGridMeasureContext2.getConstraints(), ArraysKt.maxOrThrow(iArr11) + beforeContentPadding);
        }
        int i72 = m9692constrainWidthK40F9xA;
        if (lazyStaggeredGridMeasureContext2.getIsVertical()) {
            m9674getMaxHeightimpl = ConstraintsKt.m9691constrainHeightK40F9xA(lazyStaggeredGridMeasureContext2.getConstraints(), ArraysKt.maxOrThrow(iArr11) + beforeContentPadding);
        } else {
            m9674getMaxHeightimpl = Constraints.m9674getMaxHeightimpl(lazyStaggeredGridMeasureContext2.getConstraints());
        }
        int i73 = m9674getMaxHeightimpl;
        int afterContentPadding = lazyStaggeredGridMeasureContext2.getAfterContentPadding() + (Math.min(lazyStaggeredGridMeasureContext2.getIsVertical() ? i73 : i72, lazyStaggeredGridMeasureContext2.getMainAxisAvailableSize()) - lazyStaggeredGridMeasureContext2.getBeforeContentPadding());
        int i74 = copyOf4[0];
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext2.getPinnedItems();
        int i75 = -1;
        int size3 = pinnedItems.size() - 1;
        if (size3 >= 0) {
            int i76 = size3;
            ArrayList arrayList6 = null;
            while (true) {
                int i77 = i76 - 1;
                int intValue = pinnedItems.get(i76).intValue();
                int lane = lazyStaggeredGridMeasureContext2.getLaneInfo().getLane(intValue);
                int i78 = i74;
                if (lane == -2 || lane == i75) {
                    for (int i79 = 0; i79 < laneCount; i79++) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem4 = (LazyStaggeredGridMeasuredItem) arrayDequeArr5[i79].firstOrNull();
                        if (!((lazyStaggeredGridMeasuredItem4 != null ? lazyStaggeredGridMeasuredItem4.getIndex() : -1) > intValue)) {
                            z11 = false;
                            break;
                        }
                    }
                    z11 = true;
                } else {
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem5 = (LazyStaggeredGridMeasuredItem) arrayDequeArr5[lane].firstOrNull();
                }
                if (z11) {
                    iArr7 = copyOf4;
                    long m1481getSpanRangelOCCd4c4 = lazyStaggeredGridMeasureContext2.m1481getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext2.getItemProvider(), intValue, 0);
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem m1490getAndMeasurejy6DScQ4 = lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().m1490getAndMeasurejy6DScQ(intValue, m1481getSpanRangelOCCd4c4);
                    int mainAxisSizeWithSpacings3 = i78 - m1490getAndMeasurejy6DScQ4.getMainAxisSizeWithSpacings();
                    m1490getAndMeasurejy6DScQ4.position(mainAxisSizeWithSpacings3, 0, afterContentPadding);
                    arrayList6.add(m1490getAndMeasurejy6DScQ4);
                    i74 = mainAxisSizeWithSpacings3;
                } else {
                    iArr7 = copyOf4;
                    i74 = i78;
                }
                if (i77 < 0) {
                    break;
                }
                copyOf4 = iArr7;
                i76 = i77;
                i75 = -1;
            }
            list = arrayList6;
        } else {
            iArr7 = copyOf4;
            list = null;
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        int[] iArr17 = iArr7;
        List list5 = list;
        int i80 = i10;
        List<LazyStaggeredGridMeasuredItem> calculateVisibleItems = calculateVisibleItems(lazyStaggeredGridMeasureContext2, arrayDequeArr5, iArr17, afterContentPadding, i37, i80);
        int i81 = iArr17[0];
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem6 = (LazyStaggeredGridMeasuredItem) CollectionsKt.lastOrNull((List) calculateVisibleItems);
        int index2 = lazyStaggeredGridMeasuredItem6 != null ? lazyStaggeredGridMeasuredItem6.getIndex() : -1;
        if (measureScope.isLookingAhead() && lazyStaggeredGridMeasureContext2.getApproachVisibleItems() != null && !lazyStaggeredGridMeasureContext2.getApproachVisibleItems().isEmpty()) {
            List<LazyStaggeredGridItemInfo> approachVisibleItems = lazyStaggeredGridMeasureContext2.getApproachVisibleItems();
            for (int size4 = approachVisibleItems.size() - 1; -1 < size4; size4--) {
                if (approachVisibleItems.get(size4).getIndex() > index2 && (size4 == 0 || approachVisibleItems.get(size4 - 1).getIndex() <= index2)) {
                    lazyStaggeredGridItemInfo = approachVisibleItems.get(size4);
                    break;
                }
            }
            lazyStaggeredGridItemInfo = null;
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo3 = (LazyStaggeredGridItemInfo) CollectionsKt.last((List) lazyStaggeredGridMeasureContext2.getApproachVisibleItems());
            if (lazyStaggeredGridItemInfo != null && (index = lazyStaggeredGridItemInfo.getIndex()) <= (min = Math.min(lazyStaggeredGridItemInfo3.getIndex(), i9 - 1))) {
                int i82 = index;
                i19 = i81;
                arrayList = null;
                while (true) {
                    if (arrayList != null) {
                        int size5 = arrayList.size();
                        int i83 = 0;
                        while (true) {
                            if (i83 >= size5) {
                                arrayList5 = arrayList;
                                z10 = false;
                                break;
                            }
                            arrayList5 = arrayList;
                            if (((LazyStaggeredGridMeasuredItem) arrayList.get(i83)).getIndex() == i82) {
                                z10 = true;
                                break;
                            }
                            i83++;
                            arrayList = arrayList5;
                        }
                        if (z10) {
                            z9 = true;
                            if (z9) {
                                arrayList = arrayList5 == null ? new ArrayList() : arrayList5;
                                List<LazyStaggeredGridItemInfo> approachVisibleItems2 = lazyStaggeredGridMeasureContext2.getApproachVisibleItems();
                                int size6 = approachVisibleItems2.size();
                                i18 = beforeContentPadding;
                                int i84 = 0;
                                while (true) {
                                    if (i84 >= size6) {
                                        lazyStaggeredGridItemInfo2 = null;
                                        break;
                                    }
                                    lazyStaggeredGridItemInfo2 = approachVisibleItems2.get(i84);
                                    int i85 = i84;
                                    if (lazyStaggeredGridItemInfo2.getIndex() == i82) {
                                        break;
                                    }
                                    i84 = i85 + 1;
                                }
                                LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo4 = lazyStaggeredGridItemInfo2;
                                int lane2 = lazyStaggeredGridItemInfo4 != null ? lazyStaggeredGridItemInfo4.getLane() : 0;
                                list2 = list5;
                                list3 = calculateVisibleItems;
                                LazyStaggeredGridMeasuredItem m1490getAndMeasurejy6DScQ5 = lazyStaggeredGridMeasureContext2.getMeasuredItemProvider().m1490getAndMeasurejy6DScQ(i82, lazyStaggeredGridMeasureContext2.m1481getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext2.getItemProvider(), i82, lane2));
                                arrayList.add(m1490getAndMeasurejy6DScQ5);
                                int[] positions = lazyStaggeredGridMeasureContext2.getResolvedSlots().getPositions();
                                m1490getAndMeasurejy6DScQ5.position(i19, positions.length > lane2 ? positions[lane2] : 0, afterContentPadding);
                                i19 += m1490getAndMeasurejy6DScQ5.getMainAxisSizeWithSpacings();
                            } else {
                                i18 = beforeContentPadding;
                                list2 = list5;
                                list3 = calculateVisibleItems;
                                arrayList = arrayList5;
                            }
                            if (i82 != min) {
                                break;
                            }
                            i82++;
                            beforeContentPadding = i18;
                            list5 = list2;
                            calculateVisibleItems = list3;
                        }
                    } else {
                        arrayList5 = arrayList;
                    }
                    z9 = false;
                    if (z9) {
                    }
                    if (i82 != min) {
                    }
                }
                List<Integer> pinnedItems2 = lazyStaggeredGridMeasureContext2.getPinnedItems();
                size = pinnedItems2.size();
                i20 = 0;
                arrayList2 = null;
                while (i20 < size) {
                    int intValue2 = pinnedItems2.get(i20).intValue();
                    int i86 = i9;
                    if (intValue2 >= i86) {
                        arrayList4 = arrayList;
                    } else {
                        if (arrayList != null) {
                            int size7 = arrayList.size();
                            int i87 = 0;
                            while (true) {
                                if (i87 >= size7) {
                                    arrayList4 = arrayList;
                                    z8 = false;
                                    break;
                                }
                                arrayList4 = arrayList;
                                if (((LazyStaggeredGridMeasuredItem) arrayList.get(i87)).getIndex() == intValue2) {
                                    z8 = true;
                                    break;
                                }
                                i87++;
                                arrayList = arrayList4;
                            }
                            if (z8) {
                                z6 = true;
                                if (!z6) {
                                    int lane3 = lazyStaggeredGridMeasureContext2.getLaneInfo().getLane(intValue2);
                                    if (lane3 != -2 && lane3 != -1) {
                                    }
                                    for (int i88 : copyOf3) {
                                        if (i88 < intValue2) {
                                        }
                                    }
                                    z7 = true;
                                    if (z7) {
                                        list4 = pinnedItems2;
                                        i25 = size;
                                    } else {
                                        list4 = pinnedItems2;
                                        i25 = size;
                                        long m1481getSpanRangelOCCd4c5 = lazyStaggeredGridMeasureContext2.m1481getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext2.getItemProvider(), intValue2, 0);
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        List list6 = arrayList2;
                                        LazyStaggeredGridMeasuredItem m1490getAndMeasurejy6DScQ6 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1490getAndMeasurejy6DScQ(intValue2, m1481getSpanRangelOCCd4c5);
                                        m1490getAndMeasurejy6DScQ6.position(i19, 0, afterContentPadding);
                                        i19 += m1490getAndMeasurejy6DScQ6.getMainAxisSizeWithSpacings();
                                        list6.add(m1490getAndMeasurejy6DScQ6);
                                        arrayList2 = list6;
                                    }
                                    i20++;
                                    lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
                                    arrayList = arrayList4;
                                    pinnedItems2 = list4;
                                    size = i25;
                                    i9 = i86;
                                }
                            }
                        } else {
                            arrayList4 = arrayList;
                        }
                        z6 = false;
                        if (!z6) {
                        }
                    }
                    z7 = false;
                    if (z7) {
                    }
                    i20++;
                    lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
                    arrayList = arrayList4;
                    pinnedItems2 = list4;
                    size = i25;
                    i9 = i86;
                }
                arrayList3 = arrayList;
                int i89 = i9;
                if (arrayList2 == null) {
                    arrayList2 = CollectionsKt.emptyList();
                }
                final ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(list2);
                arrayList7.addAll(list3);
                if (arrayList3 != null) {
                    arrayList7.addAll(arrayList3);
                }
                arrayList7.addAll(arrayList2);
                lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation().onMeasured((int) f, i72, i73, arrayList7, lazyStaggeredGridMeasureContext.getMeasuredItemProvider().getKeyIndexMap(), lazyStaggeredGridMeasureContext.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext.getIsVertical(), measureScope.isLookingAhead(), lazyStaggeredGridMeasureContext.getLaneCount(), lazyStaggeredGridMeasureContext.getIsInLookaheadScope(), ArraysKt.minOrThrow(iArr3), ArraysKt.maxOrThrow(iArr11) + i18, lazyStaggeredGridMeasureContext.getCoroutineScope(), lazyStaggeredGridMeasureContext.getGraphicsContext());
                if (!measureScope.isLookingAhead()) {
                    long m1419getMinSizeToFitDisappearingItemsYbymL2g2 = lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation().m1419getMinSizeToFitDisappearingItemsYbymL2g();
                    if (!IntSize.m9905equalsimpl0(m1419getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.INSTANCE.m9912getZeroYbymL2g())) {
                        int i90 = lazyStaggeredGridMeasureContext.getIsVertical() ? i73 : i72;
                        f2 = f5;
                        int m9692constrainWidthK40F9xA2 = ConstraintsKt.m9692constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), Math.max(i72, (int) (m1419getMinSizeToFitDisappearingItemsYbymL2g2 >> c)));
                        int m9691constrainHeightK40F9xA = ConstraintsKt.m9691constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), Math.max(i73, (int) (m1419getMinSizeToFitDisappearingItemsYbymL2g2 & 4294967295L)));
                        int i91 = lazyStaggeredGridMeasureContext.getIsVertical() ? m9691constrainHeightK40F9xA : m9692constrainWidthK40F9xA2;
                        if (i91 != i90) {
                            int size8 = arrayList7.size();
                            for (int i92 = 0; i92 < size8; i92++) {
                                arrayList7.get(i92).updateMainAxisLayoutSize(i91);
                            }
                        }
                        i22 = m9692constrainWidthK40F9xA2;
                        i21 = m9691constrainHeightK40F9xA;
                        i23 = i11;
                        i24 = 0;
                        while (true) {
                            if (i24 >= i23) {
                                z3 = false;
                                break;
                            }
                            if (iArr11[i24] > lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) {
                                z3 = true;
                                break;
                            }
                            i24++;
                        }
                        if (!z3) {
                            int length8 = copyOf3.length;
                            int i93 = 0;
                            while (true) {
                                if (i93 >= length8) {
                                    z5 = true;
                                    break;
                                }
                                if (!(copyOf3[i93] < i89 + (-1))) {
                                    z5 = false;
                                    break;
                                }
                                i93++;
                            }
                            if (!z5) {
                                z4 = false;
                                final boolean reverseLayout = lazyStaggeredGridMeasureContext.getReverseLayout();
                                final long contentOffset = lazyStaggeredGridMeasureContext.getContentOffset();
                                return new LazyStaggeredGridMeasureResult(iArr6, iArr3, f, MeasureScope.CC.layout$default(measureScope, i22, i21, null, new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit measure$lambda$0$37;
                                        measure$lambda$0$37 = LazyStaggeredGridMeasureKt.measure$lambda$0$37(LazyStaggeredGridMeasureContext.this, arrayList7, reverseLayout, contentOffset, measureScope, (Placeable.PlacementScope) obj);
                                        return measure$lambda$0$37;
                                    }
                                }, 4, null), f2, z4, lazyStaggeredGridMeasureContext.getIsVertical(), z16, lazyStaggeredGridMeasureContext.getResolvedSlots(), lazyStaggeredGridMeasureContext.getItemProvider().getSpanProvider(), measureScope, i89, list3, IntSize.m9902constructorimpl((i22 << c) | (i21 & 4294967295L)), i37, i80, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), lazyStaggeredGridMeasureContext.getCoroutineScope(), null);
                            }
                        }
                        z4 = true;
                        final boolean reverseLayout2 = lazyStaggeredGridMeasureContext.getReverseLayout();
                        final long contentOffset2 = lazyStaggeredGridMeasureContext.getContentOffset();
                        return new LazyStaggeredGridMeasureResult(iArr6, iArr3, f, MeasureScope.CC.layout$default(measureScope, i22, i21, null, new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit measure$lambda$0$37;
                                measure$lambda$0$37 = LazyStaggeredGridMeasureKt.measure$lambda$0$37(LazyStaggeredGridMeasureContext.this, arrayList7, reverseLayout2, contentOffset2, measureScope, (Placeable.PlacementScope) obj);
                                return measure$lambda$0$37;
                            }
                        }, 4, null), f2, z4, lazyStaggeredGridMeasureContext.getIsVertical(), z16, lazyStaggeredGridMeasureContext.getResolvedSlots(), lazyStaggeredGridMeasureContext.getItemProvider().getSpanProvider(), measureScope, i89, list3, IntSize.m9902constructorimpl((i22 << c) | (i21 & 4294967295L)), i37, i80, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), lazyStaggeredGridMeasureContext.getCoroutineScope(), null);
                    }
                }
                f2 = f5;
                i21 = i73;
                i22 = i72;
                i23 = i11;
                i24 = 0;
                while (true) {
                    if (i24 >= i23) {
                    }
                    i24++;
                }
                if (!z3) {
                }
                z4 = true;
                final boolean reverseLayout22 = lazyStaggeredGridMeasureContext.getReverseLayout();
                final long contentOffset22 = lazyStaggeredGridMeasureContext.getContentOffset();
                return new LazyStaggeredGridMeasureResult(iArr6, iArr3, f, MeasureScope.CC.layout$default(measureScope, i22, i21, null, new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit measure$lambda$0$37;
                        measure$lambda$0$37 = LazyStaggeredGridMeasureKt.measure$lambda$0$37(LazyStaggeredGridMeasureContext.this, arrayList7, reverseLayout22, contentOffset22, measureScope, (Placeable.PlacementScope) obj);
                        return measure$lambda$0$37;
                    }
                }, 4, null), f2, z4, lazyStaggeredGridMeasureContext.getIsVertical(), z16, lazyStaggeredGridMeasureContext.getResolvedSlots(), lazyStaggeredGridMeasureContext.getItemProvider().getSpanProvider(), measureScope, i89, list3, IntSize.m9902constructorimpl((i22 << c) | (i21 & 4294967295L)), i37, i80, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), lazyStaggeredGridMeasureContext.getCoroutineScope(), null);
            }
        }
        i18 = beforeContentPadding;
        list2 = list5;
        list3 = calculateVisibleItems;
        i19 = i81;
        arrayList = null;
        List<Integer> pinnedItems22 = lazyStaggeredGridMeasureContext2.getPinnedItems();
        size = pinnedItems22.size();
        i20 = 0;
        arrayList2 = null;
        while (i20 < size) {
        }
        arrayList3 = arrayList;
        int i892 = i9;
        if (arrayList2 == null) {
        }
        final List arrayList72 = new ArrayList();
        arrayList72.addAll(list2);
        arrayList72.addAll(list3);
        if (arrayList3 != null) {
        }
        arrayList72.addAll(arrayList2);
        lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation().onMeasured((int) f, i72, i73, arrayList72, lazyStaggeredGridMeasureContext.getMeasuredItemProvider().getKeyIndexMap(), lazyStaggeredGridMeasureContext.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext.getIsVertical(), measureScope.isLookingAhead(), lazyStaggeredGridMeasureContext.getLaneCount(), lazyStaggeredGridMeasureContext.getIsInLookaheadScope(), ArraysKt.minOrThrow(iArr3), ArraysKt.maxOrThrow(iArr11) + i18, lazyStaggeredGridMeasureContext.getCoroutineScope(), lazyStaggeredGridMeasureContext.getGraphicsContext());
        if (!measureScope.isLookingAhead()) {
        }
        f2 = f5;
        i21 = i73;
        i22 = i72;
        i23 = i11;
        i24 = 0;
        while (true) {
            if (i24 >= i23) {
            }
            i24++;
        }
        if (!z3) {
        }
        z4 = true;
        final boolean reverseLayout222 = lazyStaggeredGridMeasureContext.getReverseLayout();
        final long contentOffset222 = lazyStaggeredGridMeasureContext.getContentOffset();
        return new LazyStaggeredGridMeasureResult(iArr6, iArr3, f, MeasureScope.CC.layout$default(measureScope, i22, i21, null, new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit measure$lambda$0$37;
                measure$lambda$0$37 = LazyStaggeredGridMeasureKt.measure$lambda$0$37(LazyStaggeredGridMeasureContext.this, arrayList72, reverseLayout222, contentOffset222, measureScope, (Placeable.PlacementScope) obj);
                return measure$lambda$0$37;
            }
        }, 4, null), f2, z4, lazyStaggeredGridMeasureContext.getIsVertical(), z16, lazyStaggeredGridMeasureContext.getResolvedSlots(), lazyStaggeredGridMeasureContext.getItemProvider().getSpanProvider(), measureScope, i892, list3, IntSize.m9902constructorimpl((i22 << c) | (i21 & 4294967295L)), i37, i80, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), lazyStaggeredGridMeasureContext.getCoroutineScope(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure$lambda$0$0(Placeable.PlacementScope placementScope) {
        return Unit.INSTANCE;
    }

    private static final boolean measure$lambda$0$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (iArr2[i] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i2 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$0$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure$lambda$0$37(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, final List list, final boolean z, final long j, final LazyLayoutMeasureScope lazyLayoutMeasureScope, Placeable.PlacementScope placementScope) {
        placementScope.withMotionFrameOfReferencePlacement(new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit measure$lambda$0$37$0;
                measure$lambda$0$37$0 = LazyStaggeredGridMeasureKt.measure$lambda$0$37$0(list, z, j, lazyLayoutMeasureScope, (Placeable.PlacementScope) obj);
                return measure$lambda$0$37$0;
            }
        });
        ObservableScopeInvalidator.m1443attachToScopeimpl(lazyStaggeredGridMeasureContext.getState().m1495getPlacementScopeInvalidatorzYiylxw$foundation());
        return Unit.INSTANCE;
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateVisibleItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr, int[] iArr, int i, int i2, int i3) {
        int i4 = 0;
        for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque : arrayDequeArr) {
            i4 += arrayDeque.size();
        }
        ArrayList arrayList = new ArrayList(i4);
        while (true) {
            for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque2 : arrayDequeArr) {
                if (!arrayDeque2.isEmpty()) {
                    int length = arrayDequeArr.length;
                    int i5 = -1;
                    int i6 = Integer.MAX_VALUE;
                    for (int i7 = 0; i7 < length; i7++) {
                        LazyStaggeredGridMeasuredItem firstOrNull = arrayDequeArr[i7].firstOrNull();
                        int index = firstOrNull != null ? firstOrNull.getIndex() : Integer.MAX_VALUE;
                        if (i6 > index) {
                            i5 = i7;
                            i6 = index;
                        }
                    }
                    LazyStaggeredGridMeasuredItem removeFirst = arrayDequeArr[i5].removeFirst();
                    if (removeFirst.getLane() == i5) {
                        long m1497constructorimpl = SpanRange.m1497constructorimpl(removeFirst.getLane(), removeFirst.getSpan());
                        int m1486maxInRangejy6DScQ = m1486maxInRangejy6DScQ(iArr, m1497constructorimpl);
                        int i8 = lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i5];
                        if (removeFirst.getMainAxisSize() + m1486maxInRangejy6DScQ >= i2 && m1486maxInRangejy6DScQ <= i3) {
                            removeFirst.position(m1486maxInRangejy6DScQ, i8, i);
                            arrayList.add(removeFirst);
                        }
                        int i9 = (int) (m1497constructorimpl & 4294967295L);
                        for (int i10 = (int) (m1497constructorimpl >> 32); i10 < i9; i10++) {
                            iArr[i10] = removeFirst.getMainAxisSizeWithSpacings() + m1486maxInRangejy6DScQ;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final List<LazyStaggeredGridMeasuredItem> itemsRetainedForLookahead(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int i2, boolean z, Function2<? super LazyStaggeredGridMeasuredItem, ? super Integer, Unit> function2) {
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo;
        int index;
        int min;
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo2;
        if (z && lazyStaggeredGridMeasureContext.getApproachVisibleItems() != null && !lazyStaggeredGridMeasureContext.getApproachVisibleItems().isEmpty()) {
            List<LazyStaggeredGridItemInfo> approachVisibleItems = lazyStaggeredGridMeasureContext.getApproachVisibleItems();
            int size = approachVisibleItems.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    lazyStaggeredGridItemInfo = null;
                    break;
                }
                if (approachVisibleItems.get(size).getIndex() <= i || (size != 0 && approachVisibleItems.get(size - 1).getIndex() > i)) {
                }
            }
            lazyStaggeredGridItemInfo = approachVisibleItems.get(size);
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo3 = (LazyStaggeredGridItemInfo) CollectionsKt.last((List) lazyStaggeredGridMeasureContext.getApproachVisibleItems());
            if (lazyStaggeredGridItemInfo != null && (index = lazyStaggeredGridItemInfo.getIndex()) <= (min = Math.min(lazyStaggeredGridItemInfo3.getIndex(), i2 - 1))) {
                ArrayList arrayList = null;
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            if (arrayList.get(i3).getIndex() == index) {
                                break;
                            }
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List<LazyStaggeredGridItemInfo> approachVisibleItems2 = lazyStaggeredGridMeasureContext.getApproachVisibleItems();
                    int size3 = approachVisibleItems2.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size3) {
                            lazyStaggeredGridItemInfo2 = null;
                            break;
                        }
                        lazyStaggeredGridItemInfo2 = approachVisibleItems2.get(i4);
                        if (lazyStaggeredGridItemInfo2.getIndex() == index) {
                            break;
                        }
                        i4++;
                    }
                    LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo4 = lazyStaggeredGridItemInfo2;
                    int lane = lazyStaggeredGridItemInfo4 != null ? lazyStaggeredGridItemInfo4.getLane() : 0;
                    LazyStaggeredGridMeasuredItem m1490getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1490getAndMeasurejy6DScQ(index, lazyStaggeredGridMeasureContext.m1481getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), index, lane));
                    arrayList.add(m1490getAndMeasurejy6DScQ);
                    int[] positions = lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions();
                    function2.invoke(m1490getAndMeasurejy6DScQ, Integer.valueOf(positions.length > lane ? positions[lane] : 0));
                    if (index == min) {
                        return arrayList;
                    }
                    index++;
                }
            }
        }
        return null;
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
                        long m1481getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m1481getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue, 0);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        LazyStaggeredGridMeasuredItem m1490getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1490getAndMeasurejy6DScQ(intValue, m1481getSpanRangelOCCd4c);
                        function1.invoke(m1490getAndMeasurejy6DScQ);
                        arrayList.add(m1490getAndMeasurejy6DScQ);
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
                    long m1481getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext.m1481getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue2, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem m1490getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1490getAndMeasurejy6DScQ(intValue2, m1481getSpanRangelOCCd4c2);
                    function1.invoke(m1490getAndMeasurejy6DScQ2);
                    arrayList.add(m1490getAndMeasurejy6DScQ2);
                }
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    /* renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m1485forEachnIS5qE8(long j, Function1<? super Integer, Unit> function1) {
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
    private static final int m1486maxInRangejy6DScQ(int[] iArr, long j) {
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
            int i3 = iArr[length];
            if (i3 >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), i3)) {
                if (lazyStaggeredGridMeasureContext.getLaneInfo().getLane(i3) == -2) {
                    int length2 = iArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i4 = -1;
                            break;
                        } else if (iArr[i4] == i3) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    int i5 = i4 + 1;
                    if (i5 <= length) {
                        while (true) {
                            if (iArr[i5] == i3) {
                                iArr[i5] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, i3, i5);
                            }
                            if (i5 == length) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    length = i4;
                }
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(i3, length);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure$lambda$0$37$0(List list, boolean z, long j, LazyLayoutMeasureScope lazyLayoutMeasureScope, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((LazyStaggeredGridMeasuredItem) list.get(i)).m1493placeGMOY1bU(placementScope, z, j, lazyLayoutMeasureScope.isLookingAhead());
        }
        return Unit.INSTANCE;
    }
}
