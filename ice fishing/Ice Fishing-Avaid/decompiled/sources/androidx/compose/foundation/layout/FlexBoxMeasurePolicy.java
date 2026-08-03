package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlexAlignContent;
import androidx.compose.foundation.layout.FlexAlignItems;
import androidx.compose.foundation.layout.FlexAlignSelf;
import androidx.compose.foundation.layout.FlexDirection;
import androidx.compose.foundation.layout.FlexJustifyContent;
import androidx.compose.foundation.layout.FlexWrap;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* compiled from: FlexBox.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\t\u001a\u00020\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0013\u001a\u00020\n*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019Jl\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\"0\u001ej\b\u0012\u0004\u0012\u00020\"` 2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J+\u0010)\u001a\u00020\"*\u00020\u000b2\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\u00020\u0017*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b.\u0010/Jt\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 2\u0006\u0010\u0014\u001a\u00020\b2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\"0\u001ej\b\u0012\u0004\u0012\u00020\"` 2\u0006\u0010\u000f\u001a\u00020\u00152\u0006\u0010(\u001a\u00020&2\u0006\u00101\u001a\u00020&2\u0006\u00102\u001a\u00020\u00172\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u001b04H\u0082\b¢\u0006\u0004\b5\u00106JW\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001f2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\"0\u001ej\b\u0012\u0004\u0012\u00020\"` 2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u00109\u001a\u00020&2\u0006\u00102\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00152\u0006\u0010:\u001a\u00020&H\u0002¢\u0006\u0004\b;\u0010<JP\u0010=\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u00172\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\"0\u001ej\b\u0012\u0004\u0012\u00020\"` 2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020&2\u0006\u0010A\u001a\u00020&H\u0002JG\u0010B\u001a\u00020&2\u0006\u0010\u0014\u001a\u00020\b2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 2\u0006\u0010\u000f\u001a\u00020\u00152\u0006\u0010C\u001a\u00020&2\u0006\u00101\u001a\u00020&H\u0002¢\u0006\u0004\bD\u0010EJ_\u0010F\u001a\u00020&2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\"0\u001ej\b\u0012\u0004\u0012\u00020\"` 2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010C\u001a\u00020&2\u0006\u00102\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0015H\u0002¢\u0006\u0004\bG\u0010HJ@\u0010I\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010J\u001a\u00020&2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 2\u0006\u0010C\u001a\u00020&2\u0006\u00101\u001a\u00020&H\u0002J$\u0010K\u001a\u00020&*\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 2\u0006\u0010L\u001a\u00020\u0017H\u0002JH\u0010M\u001a\u00020\u001b2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\"0\u001ej\b\u0012\u0004\u0012\u00020\"` 2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010A\u001a\u00020&2\u0006\u00108\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020&2\u0006\u0010N\u001a\u00020\u0017H\u0002J?\u0010O\u001a\u00020&2\u0006\u0010P\u001a\u00020\"2\u0006\u0010Q\u001a\u00020&2\u0006\u0010R\u001a\u00020&2\u0006\u0010S\u001a\u00020&2\u0006\u0010T\u001a\u00020&2\u0006\u0010U\u001a\u00020VH\u0002¢\u0006\u0004\bW\u0010XJ\u0018\u0010Y\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010#\u001a\u00020$H\u0002J8\u0010Z\u001a\u00020\u001b2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\"0\u001ej\b\u0012\u0004\u0012\u00020\"` 2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u00108\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020&H\u0002J0\u0010[\u001a\u00020&2\u0006\u0010\\\u001a\u00020\"2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010T\u001a\u00020&2\u0006\u0010]\u001a\u00020\u00172\u0006\u0010:\u001a\u00020&H\u0002J\"\u0010^\u001a\u00020&*\u00020_2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020`0\r2\u0006\u0010a\u001a\u00020&H\u0016J\"\u0010b\u001a\u00020&*\u00020_2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020`0\r2\u0006\u0010c\u001a\u00020&H\u0016J\"\u0010d\u001a\u00020&*\u00020_2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020`0\r2\u0006\u0010a\u001a\u00020&H\u0016J\"\u0010e\u001a\u00020&*\u00020_2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020`0\r2\u0006\u0010c\u001a\u00020&H\u0016J'\u0010f\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010g\u001a\u00020h2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¢\u0006\u0004\bi\u0010jR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006k"}, d2 = {"Landroidx/compose/foundation/layout/FlexBoxMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "flexBoxConfigState", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/layout/FlexBoxConfig;", "<init>", "(Landroidx/compose/runtime/State;)V", "resolvedFlexBoxConfig", "Landroidx/compose/foundation/layout/ResolvedFlexBoxConfig;", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measureFlexBox", "flexBoxConfig", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "isHorizontal", "", "measureFlexBox-w1Onq5I", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/ResolvedFlexBoxConfig;Ljava/util/List;JZ)Landroidx/compose/ui/layout/MeasureResult;", "placeFlexItems", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "lines", "Ljava/util/ArrayList;", "Landroidx/compose/foundation/layout/FlexLine;", "Lkotlin/collections/ArrayList;", "items", "Landroidx/compose/foundation/layout/ResolvedFlexItemInfo;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutWidth", "", "layoutHeight", "mainAxisGap", "createFlexItem", "measurable", "createFlexItem-XsoA538", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;ZJ)Landroidx/compose/foundation/layout/ResolvedFlexItemInfo;", "needUpfrontCrossAxisCalculation", "needUpfrontCrossAxisCalculation-RMq0m1M", "(Landroidx/compose/foundation/layout/ResolvedFlexBoxConfig;J)Z", "buildFlexLines", "crossAxisGap", "needsUpfrontCrossAxisCalculation", "updateTotalCrossSize", "Lkotlin/Function1;", "buildFlexLines-JlE-8fw", "(Landroidx/compose/foundation/layout/ResolvedFlexBoxConfig;Ljava/util/ArrayList;JIIZLkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;", "processFlexLine", "line", "currentLineHypotheticalMainAxisSize", "remainingCrossAxisSize", "processFlexLine-7gjidqw", "(Landroidx/compose/foundation/layout/FlexLine;Ljava/util/ArrayList;Landroidx/compose/foundation/layout/ResolvedFlexBoxConfig;IZJI)V", "resolveFlexibleLengths", "startIndex", "endIndex", "hypotheticalLineSize", "containerMainAxisSize", "applyAlignContentStretch", "totalLinesCrossSize", "applyAlignContentStretch-WWvErGg", "(Landroidx/compose/foundation/layout/ResolvedFlexBoxConfig;Ljava/util/ArrayList;JII)I", "measureFlexItems", "measureFlexItems-HjG58DU", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/compose/foundation/layout/ResolvedFlexBoxConfig;IZJ)I", "calculateLineCrossPositions", "totalCrossAxisSpace", "totalCrossAxisSize", "isReverse", "positionItemsOnMainAxis", "isMainAxisReverse", "calculateItemCrossPosition", "flexConfig", "itemBaseline", "lineMaxAboveBaseline", "itemCrossAxisSize", "lineCrossAxisSize", "containerAlignItems", "Landroidx/compose/foundation/layout/FlexAlignItems;", "calculateItemCrossPosition-sT6f14c", "(Landroidx/compose/foundation/layout/ResolvedFlexItemInfo;IIIII)I", "isMainAxisReversedForLayout", "calculateLineCrossAxisSize", "measureItem", "item", "shouldStretch", "minIntrinsicWidth", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicHeight", "width", "maxIntrinsicWidth", "maxIntrinsicHeight", "resolveFlexBoxConfig", "density", "Landroidx/compose/ui/unit/Density;", "resolveFlexBoxConfig-3p2s80s", "(Landroidx/compose/foundation/layout/FlexBoxConfig;Landroidx/compose/ui/unit/Density;J)Landroidx/compose/foundation/layout/ResolvedFlexBoxConfig;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class FlexBoxMeasurePolicy implements MeasurePolicy {
    private final State<FlexBoxConfig> flexBoxConfigState;
    private final ResolvedFlexBoxConfig resolvedFlexBoxConfig = new ResolvedFlexBoxConfig();

    /* JADX WARN: Multi-variable type inference failed */
    public FlexBoxMeasurePolicy(State<? extends FlexBoxConfig> state) {
        this.flexBoxConfigState = state;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0076, code lost:
    
        if (androidx.compose.foundation.layout.FlexDirection.m997equalsimpl0(r9, androidx.compose.foundation.layout.FlexDirection.m995constructorimpl(2)) != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MeasureResult mo81measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        LayoutOrientation layoutOrientation;
        int direction;
        if (list.isEmpty()) {
            return MeasureScope.CC.layout$default(measureScope, Constraints.m9677getMinWidthimpl(j), Constraints.m9676getMinHeightimpl(j), null, new Function1() { // from class: androidx.compose.foundation.layout.FlexBoxMeasurePolicy$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit measure_3p2s80s$lambda$0;
                    measure_3p2s80s$lambda$0 = FlexBoxMeasurePolicy.measure_3p2s80s$lambda$0((Placeable.PlacementScope) obj);
                    return measure_3p2s80s$lambda$0;
                }
            }, 4, null);
        }
        ResolvedFlexBoxConfig m990resolveFlexBoxConfig3p2s80s = m990resolveFlexBoxConfig3p2s80s(this.flexBoxConfigState.getValue(), measureScope, j);
        int direction2 = m990resolveFlexBoxConfig3p2s80s.getDirection();
        FlexDirection.Companion companion = FlexDirection.INSTANCE;
        boolean z = false;
        if (!FlexDirection.m997equalsimpl0(direction2, FlexDirection.m995constructorimpl(0))) {
            int direction3 = m990resolveFlexBoxConfig3p2s80s.getDirection();
            FlexDirection.Companion companion2 = FlexDirection.INSTANCE;
            if (!FlexDirection.m997equalsimpl0(direction3, FlexDirection.m995constructorimpl(2))) {
                layoutOrientation = LayoutOrientation.Vertical;
                long m1169constructorimpl = OrientationIndependentConstraints.m1169constructorimpl(j, layoutOrientation);
                direction = m990resolveFlexBoxConfig3p2s80s.getDirection();
                FlexDirection.Companion companion3 = FlexDirection.INSTANCE;
                if (!FlexDirection.m997equalsimpl0(direction, FlexDirection.m995constructorimpl(0))) {
                    int direction4 = m990resolveFlexBoxConfig3p2s80s.getDirection();
                    FlexDirection.Companion companion4 = FlexDirection.INSTANCE;
                }
                z = true;
                return m986measureFlexBoxw1Onq5I(measureScope, m990resolveFlexBoxConfig3p2s80s, list, m1169constructorimpl, z);
            }
        }
        layoutOrientation = LayoutOrientation.Horizontal;
        long m1169constructorimpl2 = OrientationIndependentConstraints.m1169constructorimpl(j, layoutOrientation);
        direction = m990resolveFlexBoxConfig3p2s80s.getDirection();
        FlexDirection.Companion companion32 = FlexDirection.INSTANCE;
        if (!FlexDirection.m997equalsimpl0(direction, FlexDirection.m995constructorimpl(0))) {
        }
        z = true;
        return m986measureFlexBoxw1Onq5I(measureScope, m990resolveFlexBoxConfig3p2s80s, list, m1169constructorimpl2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$0(Placeable.PlacementScope placementScope) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cf, code lost:
    
        if (androidx.compose.foundation.layout.FlexWrap.m1021equalsimpl0(r6, androidx.compose.foundation.layout.FlexWrap.m1019constructorimpl(2)) != false) goto L27;
     */
    /* renamed from: measureFlexBox-w1Onq5I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final MeasureResult m986measureFlexBoxw1Onq5I(final MeasureScope measureScope, final ResolvedFlexBoxConfig resolvedFlexBoxConfig, List<? extends Measurable> list, long j, final boolean z) {
        int i;
        ArrayList<ResolvedFlexItemInfo> arrayList;
        boolean z2;
        FlexLine flexLine;
        int i2;
        int i3;
        boolean z3;
        int i4;
        int i5;
        ArrayList<ResolvedFlexItemInfo> arrayList2;
        int i6;
        FlexBoxMeasurePolicy flexBoxMeasurePolicy = this;
        ArrayList<ResolvedFlexItemInfo> arrayList3 = new ArrayList<>(list.size());
        long j2 = j;
        boolean m988needUpfrontCrossAxisCalculationRMq0m1M = flexBoxMeasurePolicy.m988needUpfrontCrossAxisCalculationRMq0m1M(resolvedFlexBoxConfig, j2);
        int size = list.size();
        boolean z4 = m988needUpfrontCrossAxisCalculationRMq0m1M;
        int i7 = 0;
        boolean z5 = false;
        while (true) {
            i = 1;
            if (i7 >= size) {
                break;
            }
            ResolvedFlexItemInfo m985createFlexItemXsoA538 = flexBoxMeasurePolicy.m985createFlexItemXsoA538(measureScope, list.get(i7), z, j2);
            if (m985createFlexItemXsoA538.getOrder() != 0) {
                z5 = true;
            }
            int alignSelf = m985createFlexItemXsoA538.getAlignSelf();
            FlexAlignSelf.Companion companion = FlexAlignSelf.INSTANCE;
            if (!FlexAlignSelf.m947equalsimpl0(alignSelf, FlexAlignSelf.m945constructorimpl(5))) {
                int alignSelf2 = m985createFlexItemXsoA538.getAlignSelf();
                FlexAlignSelf.Companion companion2 = FlexAlignSelf.INSTANCE;
                if (!FlexAlignSelf.m947equalsimpl0(alignSelf2, FlexAlignSelf.m945constructorimpl(4))) {
                    arrayList3.add(m985createFlexItemXsoA538);
                    i7++;
                    flexBoxMeasurePolicy = this;
                    j2 = j;
                }
            }
            z4 = true;
            arrayList3.add(m985createFlexItemXsoA538);
            i7++;
            flexBoxMeasurePolicy = this;
            j2 = j;
        }
        if (z5) {
            ArrayList<ResolvedFlexItemInfo> arrayList4 = arrayList3;
            if (arrayList4.size() > 1) {
                CollectionsKt.sortWith(arrayList4, new Comparator() { // from class: androidx.compose.foundation.layout.FlexBoxMeasurePolicy$measureFlexBox-w1Onq5I$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Integer.valueOf(((ResolvedFlexItemInfo) t).getOrder()), Integer.valueOf(((ResolvedFlexItemInfo) t2).getOrder()));
                    }
                });
            }
        }
        final int mainAxisGap = resolvedFlexBoxConfig.mainAxisGap();
        int crossAxisGap = resolvedFlexBoxConfig.crossAxisGap();
        final ArrayList<FlexLine> arrayList5 = new ArrayList<>(8);
        FlexLine flexLine2 = new FlexLine();
        int m9674getMaxHeightimpl = Constraints.m9674getMaxHeightimpl(j);
        ArrayList<ResolvedFlexItemInfo> arrayList6 = arrayList3;
        int size2 = arrayList6.size();
        int i8 = m9674getMaxHeightimpl;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        FlexLine flexLine3 = flexLine2;
        int i13 = 0;
        while (i13 < size2) {
            ResolvedFlexItemInfo resolvedFlexItemInfo = arrayList6.get(i13);
            int wrap = resolvedFlexBoxConfig.getWrap();
            FlexWrap.Companion companion3 = FlexWrap.INSTANCE;
            if (!FlexWrap.m1021equalsimpl0(wrap, FlexWrap.m1019constructorimpl(1))) {
                int wrap2 = resolvedFlexBoxConfig.getWrap();
                FlexWrap.Companion companion4 = FlexWrap.INSTANCE;
            }
            if (i13 > i9 && resolvedFlexItemInfo.getHypotheticalMainSize() + i10 > Constraints.m9675getMaxWidthimpl(j)) {
                flexLine3.setStartIndex(i9);
                flexLine3.setEndIndex(i13);
                boolean z6 = z4;
                int i14 = i11;
                z3 = z6;
                i4 = i13;
                i5 = size2;
                arrayList2 = arrayList3;
                m989processFlexLine7gjidqw(flexLine3, arrayList2, resolvedFlexBoxConfig, i10 - mainAxisGap, z3, j, i8);
                i12 += flexLine3.getCrossAxisSize();
                flexLine3.setCrossStart(i14);
                int crossAxisSize = flexLine3.getCrossAxisSize() + crossAxisGap + i14;
                int crossAxisSize2 = i8 - (flexLine3.getCrossAxisSize() + crossAxisGap);
                if (crossAxisSize2 < 0) {
                    crossAxisSize2 = 0;
                }
                arrayList5.add(flexLine3);
                flexLine3 = new FlexLine();
                i10 = resolvedFlexItemInfo.getHypotheticalMainSize() + mainAxisGap;
                i6 = crossAxisSize;
                i8 = crossAxisSize2;
                i9 = i4;
                i13 = i4 + 1;
                int i15 = i6;
                z4 = z3;
                i11 = i15;
                arrayList3 = arrayList2;
                size2 = i5;
            }
            boolean z7 = z4;
            i6 = i11;
            z3 = z7;
            i4 = i13;
            i5 = size2;
            arrayList2 = arrayList3;
            i10 += resolvedFlexItemInfo.getHypotheticalMainSize() + mainAxisGap;
            i13 = i4 + 1;
            int i152 = i6;
            z4 = z3;
            i11 = i152;
            arrayList3 = arrayList2;
            size2 = i5;
        }
        boolean z8 = z4;
        int i16 = i11;
        ArrayList<ResolvedFlexItemInfo> arrayList7 = arrayList3;
        if (i9 < arrayList7.size()) {
            flexLine3.setStartIndex(i9);
            flexLine3.setEndIndex(arrayList7.size());
            m989processFlexLine7gjidqw(flexLine3, arrayList7, resolvedFlexBoxConfig, i10 - mainAxisGap, z8, j, i8);
            arrayList = arrayList7;
            z2 = z8;
            i12 += flexLine3.getCrossAxisSize();
            flexLine3.setCrossStart(i16);
            arrayList5.add(flexLine3);
        } else {
            arrayList = arrayList7;
            z2 = z8;
        }
        int i17 = i12;
        if (arrayList5.size() == 1) {
            arrayList5.get(0).setCrossAxisSize(Math.max(arrayList5.get(0).getCrossAxisSize(), Constraints.m9676getMinHeightimpl(j)));
        }
        final ArrayList<ResolvedFlexItemInfo> arrayList8 = arrayList;
        int m987measureFlexItemsHjG58DU = m987measureFlexItemsHjG58DU(arrayList5, arrayList8, resolvedFlexBoxConfig, m982applyAlignContentStretchWWvErGg(resolvedFlexBoxConfig, arrayList5, j, i17, crossAxisGap), z2, j);
        calculateLineCrossPositions(resolvedFlexBoxConfig, Math.max(m987measureFlexItemsHjG58DU, Constraints.m9676getMinHeightimpl(j)), arrayList5, m987measureFlexItemsHjG58DU, crossAxisGap);
        int wrap3 = resolvedFlexBoxConfig.getWrap();
        FlexWrap.Companion companion5 = FlexWrap.INSTANCE;
        int max = Math.max(totalCrossAxisSize(arrayList5, FlexWrap.m1021equalsimpl0(wrap3, FlexWrap.m1019constructorimpl(2))), Constraints.m9676getMinHeightimpl(j));
        ArrayList<FlexLine> arrayList9 = arrayList5;
        if (arrayList9.isEmpty()) {
            flexLine = null;
        } else {
            flexLine = arrayList9.get(0);
            int mainAxisSize = flexLine.getMainAxisSize();
            int lastIndex = CollectionsKt.getLastIndex(arrayList9);
            if (1 <= lastIndex) {
                while (true) {
                    FlexLine flexLine4 = arrayList9.get(i);
                    int mainAxisSize2 = flexLine4.getMainAxisSize();
                    if (mainAxisSize < mainAxisSize2) {
                        flexLine = flexLine4;
                        mainAxisSize = mainAxisSize2;
                    }
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
        }
        FlexLine flexLine5 = flexLine;
        int max2 = Math.max(flexLine5 != null ? flexLine5.getMainAxisSize() : Constraints.m9677getMinWidthimpl(j), Constraints.m9677getMinWidthimpl(j));
        int m9677getMinWidthimpl = Constraints.m9677getMinWidthimpl(j);
        int m9675getMaxWidthimpl = Constraints.m9675getMaxWidthimpl(j);
        if (max2 < m9677getMinWidthimpl) {
            max2 = m9677getMinWidthimpl;
        }
        if (max2 <= m9675getMaxWidthimpl) {
            m9675getMaxWidthimpl = max2;
        }
        if (z) {
            int m9676getMinHeightimpl = Constraints.m9676getMinHeightimpl(j);
            int m9674getMaxHeightimpl2 = Constraints.m9674getMaxHeightimpl(j);
            if (max < m9676getMinHeightimpl) {
                max = m9676getMinHeightimpl;
            }
            if (max <= m9674getMaxHeightimpl2) {
                m9674getMaxHeightimpl2 = max;
            }
            i3 = m9674getMaxHeightimpl2;
            i2 = m9675getMaxWidthimpl;
        } else {
            int m9676getMinHeightimpl2 = Constraints.m9676getMinHeightimpl(j);
            int m9674getMaxHeightimpl3 = Constraints.m9674getMaxHeightimpl(j);
            if (max < m9676getMinHeightimpl2) {
                max = m9676getMinHeightimpl2;
            }
            if (max <= m9674getMaxHeightimpl3) {
                m9674getMaxHeightimpl3 = max;
            }
            i2 = m9674getMaxHeightimpl3;
            i3 = m9675getMaxWidthimpl;
        }
        final int i18 = i2;
        final int i19 = i3;
        return MeasureScope.CC.layout$default(measureScope, i2, i3, null, new Function1() { // from class: androidx.compose.foundation.layout.FlexBoxMeasurePolicy$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit measureFlexBox_w1Onq5I$lambda$4;
                measureFlexBox_w1Onq5I$lambda$4 = FlexBoxMeasurePolicy.measureFlexBox_w1Onq5I$lambda$4(FlexBoxMeasurePolicy.this, arrayList5, arrayList8, measureScope, resolvedFlexBoxConfig, i18, i19, mainAxisGap, z, (Placeable.PlacementScope) obj);
                return measureFlexBox_w1Onq5I$lambda$4;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measureFlexBox_w1Onq5I$lambda$4(FlexBoxMeasurePolicy flexBoxMeasurePolicy, ArrayList arrayList, ArrayList arrayList2, MeasureScope measureScope, ResolvedFlexBoxConfig resolvedFlexBoxConfig, int i, int i2, int i3, boolean z, Placeable.PlacementScope placementScope) {
        flexBoxMeasurePolicy.placeFlexItems(placementScope, arrayList, arrayList2, measureScope.getLayoutDirection(), resolvedFlexBoxConfig, i, i2, i3, z);
        return Unit.INSTANCE;
    }

    private final void placeFlexItems(Placeable.PlacementScope placementScope, ArrayList<FlexLine> arrayList, ArrayList<ResolvedFlexItemInfo> arrayList2, LayoutDirection layoutDirection, ResolvedFlexBoxConfig resolvedFlexBoxConfig, int i, int i2, int i3, boolean z) {
        int crossPosition;
        int mainPosition;
        ArrayList<FlexLine> arrayList3 = arrayList;
        int size = arrayList3.size();
        for (int i4 = 0; i4 < size; i4++) {
            FlexLine flexLine = arrayList3.get(i4);
            positionItemsOnMainAxis(arrayList2, resolvedFlexBoxConfig, z ? i : i2, flexLine, i3, isMainAxisReversedForLayout(resolvedFlexBoxConfig, layoutDirection));
            int startIndex = flexLine.getStartIndex();
            int endIndex = flexLine.getEndIndex();
            if (startIndex < 0 || startIndex > arrayList2.size()) {
                throw new IndexOutOfBoundsException("fromIndex (" + startIndex + ") is out of bounds [0, " + arrayList2.size() + ']');
            }
            if (endIndex < 0 || endIndex > arrayList2.size()) {
                throw new IndexOutOfBoundsException("toIndex (" + endIndex + ") is out of bounds [0, " + arrayList2.size() + ']');
            }
            while (startIndex < endIndex) {
                ResolvedFlexItemInfo resolvedFlexItemInfo = arrayList2.get(startIndex);
                if (z) {
                    crossPosition = resolvedFlexItemInfo.getMainPosition();
                } else {
                    crossPosition = resolvedFlexItemInfo.getCrossPosition();
                }
                int i5 = crossPosition;
                if (z) {
                    mainPosition = resolvedFlexItemInfo.getCrossPosition();
                } else {
                    mainPosition = resolvedFlexItemInfo.getMainPosition();
                }
                int i6 = mainPosition;
                Placeable placeable = resolvedFlexItemInfo.getPlaceable();
                if (placeable != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i5, i6, 0.0f, 4, null);
                }
                startIndex++;
            }
        }
    }

    /* renamed from: createFlexItem-XsoA538, reason: not valid java name */
    private final ResolvedFlexItemInfo m985createFlexItemXsoA538(MeasureScope measureScope, Measurable measurable, boolean z, long j) {
        int maxContentSize$foundation_layout;
        Object parentData = measurable.getParentData();
        FlexBoxChildDataNode flexBoxChildDataNode = parentData instanceof FlexBoxChildDataNode ? (FlexBoxChildDataNode) parentData : null;
        ResolvedFlexItemInfo resolvedFlexItemInfo = new ResolvedFlexItemInfo();
        if (flexBoxChildDataNode != null) {
            resolvedFlexItemInfo.m1245prepareRMq0m1M(measureScope, j);
            flexBoxChildDataNode.getConfig().configure(resolvedFlexItemInfo);
        }
        resolvedFlexItemInfo.setMeasurable(measurable);
        int minMainAxisSize$foundation_layout = resolvedFlexItemInfo.getMinMainAxisSize$foundation_layout(z);
        if (FlexBasis.m964isDpimpl$foundation_layout(resolvedFlexItemInfo.getBasis())) {
            maxContentSize$foundation_layout = measureScope.mo522roundToPx0680j_4(Dp.m9732constructorimpl(FlexBasis.m961getValueimpl$foundation_layout(resolvedFlexItemInfo.getBasis())));
        } else if (!FlexBasis.m965isPercentimpl$foundation_layout(resolvedFlexItemInfo.getBasis())) {
            maxContentSize$foundation_layout = FlexBasis.m963isAutoimpl$foundation_layout(resolvedFlexItemInfo.getBasis()) ? resolvedFlexItemInfo.getMaxContentSize$foundation_layout(z) : resolvedFlexItemInfo.getMaxContentSize$foundation_layout(z);
        } else if (Constraints.m9675getMaxWidthimpl(j) == Integer.MAX_VALUE || Float.isNaN(FlexBasis.m961getValueimpl$foundation_layout(resolvedFlexItemInfo.getBasis()))) {
            maxContentSize$foundation_layout = resolvedFlexItemInfo.getMaxContentSize$foundation_layout(z);
        } else {
            maxContentSize$foundation_layout = (int) (Constraints.m9675getMaxWidthimpl(j) * FlexBasis.m961getValueimpl$foundation_layout(resolvedFlexItemInfo.getBasis()));
        }
        resolvedFlexItemInfo.setFlexBaseSize(maxContentSize$foundation_layout);
        if (maxContentSize$foundation_layout >= minMainAxisSize$foundation_layout) {
            minMainAxisSize$foundation_layout = maxContentSize$foundation_layout;
        }
        resolvedFlexItemInfo.setHypotheticalMainSize(minMainAxisSize$foundation_layout);
        resolvedFlexItemInfo.setTargetMainSize(resolvedFlexItemInfo.getHypotheticalMainSize());
        return resolvedFlexItemInfo;
    }

    /* renamed from: needUpfrontCrossAxisCalculation-RMq0m1M, reason: not valid java name */
    private final boolean m988needUpfrontCrossAxisCalculationRMq0m1M(ResolvedFlexBoxConfig resolvedFlexBoxConfig, long j) {
        int alignItems = resolvedFlexBoxConfig.getAlignItems();
        FlexAlignItems.Companion companion = FlexAlignItems.INSTANCE;
        if (!FlexAlignItems.m935equalsimpl0(alignItems, FlexAlignItems.m933constructorimpl(3))) {
            int alignItems2 = resolvedFlexBoxConfig.getAlignItems();
            FlexAlignItems.Companion companion2 = FlexAlignItems.INSTANCE;
            if (!FlexAlignItems.m935equalsimpl0(alignItems2, FlexAlignItems.m933constructorimpl(4))) {
                int wrap = resolvedFlexBoxConfig.getWrap();
                FlexWrap.Companion companion3 = FlexWrap.INSTANCE;
                if (!FlexWrap.m1021equalsimpl0(wrap, FlexWrap.m1019constructorimpl(1))) {
                    int wrap2 = resolvedFlexBoxConfig.getWrap();
                    FlexWrap.Companion companion4 = FlexWrap.INSTANCE;
                    if (!FlexWrap.m1021equalsimpl0(wrap2, FlexWrap.m1019constructorimpl(2))) {
                        return false;
                    }
                }
                int alignContent = resolvedFlexBoxConfig.getAlignContent();
                FlexAlignContent.Companion companion5 = FlexAlignContent.INSTANCE;
                if (!FlexAlignContent.m922equalsimpl0(alignContent, FlexAlignContent.m920constructorimpl(3)) || Constraints.m9674getMaxHeightimpl(j) == Integer.MAX_VALUE) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004d, code lost:
    
        if (androidx.compose.foundation.layout.FlexWrap.m1021equalsimpl0(r9, androidx.compose.foundation.layout.FlexWrap.m1019constructorimpl(2)) != false) goto L8;
     */
    /* renamed from: buildFlexLines-JlE-8fw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ArrayList<FlexLine> m983buildFlexLinesJlE8fw(ResolvedFlexBoxConfig flexBoxConfig, ArrayList<ResolvedFlexItemInfo> items, long constraints, int mainAxisGap, int crossAxisGap, boolean needsUpfrontCrossAxisCalculation, Function1<? super Integer, Unit> updateTotalCrossSize) {
        ArrayList<FlexLine> arrayList = new ArrayList<>(8);
        FlexLine flexLine = new FlexLine();
        int m9674getMaxHeightimpl = Constraints.m9674getMaxHeightimpl(constraints);
        ArrayList<ResolvedFlexItemInfo> arrayList2 = items;
        int size = arrayList2.size();
        FlexLine flexLine2 = flexLine;
        int i = m9674getMaxHeightimpl;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            ResolvedFlexItemInfo resolvedFlexItemInfo = arrayList2.get(i6);
            int wrap = flexBoxConfig.getWrap();
            FlexWrap.Companion companion = FlexWrap.INSTANCE;
            if (!FlexWrap.m1021equalsimpl0(wrap, FlexWrap.m1019constructorimpl(1))) {
                int wrap2 = flexBoxConfig.getWrap();
                FlexWrap.Companion companion2 = FlexWrap.INSTANCE;
            }
            if (i6 > i2 && resolvedFlexItemInfo.getHypotheticalMainSize() + i3 > Constraints.m9675getMaxWidthimpl(constraints)) {
                flexLine2.setStartIndex(i2);
                flexLine2.setEndIndex(i6);
                int i7 = i4;
                m989processFlexLine7gjidqw(flexLine2, items, flexBoxConfig, i3 - mainAxisGap, needsUpfrontCrossAxisCalculation, constraints, i);
                i5 += flexLine2.getCrossAxisSize();
                flexLine2.setCrossStart(i7);
                i4 = i7 + flexLine2.getCrossAxisSize() + crossAxisGap;
                i -= flexLine2.getCrossAxisSize() + crossAxisGap;
                if (i < 0) {
                    i = 0;
                }
                arrayList.add(flexLine2);
                FlexLine flexLine3 = new FlexLine();
                i3 = resolvedFlexItemInfo.getHypotheticalMainSize() + mainAxisGap;
                flexLine2 = flexLine3;
                i2 = i6;
            }
            i3 += resolvedFlexItemInfo.getHypotheticalMainSize() + mainAxisGap;
        }
        if (i2 < items.size()) {
            flexLine2.setStartIndex(i2);
            flexLine2.setEndIndex(items.size());
            m989processFlexLine7gjidqw(flexLine2, items, flexBoxConfig, i3 - mainAxisGap, needsUpfrontCrossAxisCalculation, constraints, i);
            i5 += flexLine2.getCrossAxisSize();
            flexLine2.setCrossStart(i4);
            arrayList.add(flexLine2);
        }
        updateTotalCrossSize.invoke(Integer.valueOf(i5));
        return arrayList;
    }

    private final int resolveFlexibleLengths(boolean isHorizontal, ArrayList<ResolvedFlexItemInfo> items, ResolvedFlexBoxConfig flexBoxConfig, int startIndex, int endIndex, int hypotheticalLineSize, int containerMainAxisSize) {
        int i;
        boolean z;
        ArrayList<ResolvedFlexItemInfo> arrayList = items;
        int i2 = startIndex;
        int i3 = containerMainAxisSize;
        int i4 = endIndex - i2;
        int mainAxisGap = i4 > 0 ? (i4 - 1) * flexBoxConfig.mainAxisGap() : 0;
        if (i3 == Integer.MAX_VALUE) {
            if (i2 < 0 || i2 > arrayList.size()) {
                throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is out of bounds [0, " + arrayList.size() + ']');
            }
            if (endIndex < 0 || endIndex > arrayList.size()) {
                throw new IndexOutOfBoundsException("toIndex (" + endIndex + ") is out of bounds [0, " + arrayList.size() + ']');
            }
            while (i2 < endIndex) {
                ResolvedFlexItemInfo resolvedFlexItemInfo = arrayList.get(i2);
                resolvedFlexItemInfo.setTargetMainSize(resolvedFlexItemInfo.getHypotheticalMainSize());
                mainAxisGap += resolvedFlexItemInfo.getTargetMainSize();
                i2++;
            }
            return mainAxisGap;
        }
        boolean z2 = hypotheticalLineSize < i3;
        if (i2 < 0 || i2 > arrayList.size()) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is out of bounds [0, " + items.size() + ']');
        }
        if (endIndex < 0 || endIndex > arrayList.size()) {
            throw new IndexOutOfBoundsException("toIndex (" + endIndex + ") is out of bounds [0, " + items.size() + ']');
        }
        int i5 = 0;
        int i6 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        int i7 = 0;
        float f3 = 0.0f;
        for (int i8 = i2; i8 < endIndex; i8++) {
            ResolvedFlexItemInfo resolvedFlexItemInfo2 = arrayList.get(i8);
            float grow = z2 ? resolvedFlexItemInfo2.getGrow() : resolvedFlexItemInfo2.getShrink();
            if (grow == 0.0f || (!z2 && resolvedFlexItemInfo2.getFlexBaseSize() < resolvedFlexItemInfo2.getHypotheticalMainSize())) {
                resolvedFlexItemInfo2.setTargetMainSize(resolvedFlexItemInfo2.getHypotheticalMainSize());
                resolvedFlexItemInfo2.setFrozen(true);
                i5 += resolvedFlexItemInfo2.getTargetMainSize();
            } else {
                resolvedFlexItemInfo2.setFrozen(false);
                i7++;
                i6 += resolvedFlexItemInfo2.getFlexBaseSize();
                f += grow;
                if (z2) {
                    f2 += resolvedFlexItemInfo2.getGrow();
                } else {
                    f3 += resolvedFlexItemInfo2.getShrink() * resolvedFlexItemInfo2.getFlexBaseSize();
                }
            }
        }
        int i9 = 0;
        float f4 = ((i3 - mainAxisGap) - i5) - i6;
        float f5 = 1.0f;
        if (z2) {
            float f6 = i3 - ((mainAxisGap + i5) + i6);
            if (f < 1.0f) {
                float f7 = f4 * f;
                if (Math.abs(f7) < Math.abs(f6)) {
                    f6 = f7;
                }
            }
            if (i2 < 0 || i2 > arrayList.size()) {
                throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is out of bounds [0, " + arrayList.size() + ']');
            }
            if (endIndex < 0 || endIndex > arrayList.size()) {
                throw new IndexOutOfBoundsException("toIndex (" + endIndex + ") is out of bounds [0, " + arrayList.size() + ']');
            }
            while (i2 < endIndex) {
                ResolvedFlexItemInfo resolvedFlexItemInfo3 = arrayList.get(i2);
                if (!resolvedFlexItemInfo3.getIsFrozen()) {
                    int round = Math.round((f2 > 0.0f ? resolvedFlexItemInfo3.getGrow() / f2 : 0.0f) * f6);
                    f6 -= round;
                    f2 -= resolvedFlexItemInfo3.getGrow();
                    resolvedFlexItemInfo3.setTargetMainSize(resolvedFlexItemInfo3.getFlexBaseSize() + round);
                    i9 += resolvedFlexItemInfo3.getTargetMainSize();
                }
                i2++;
            }
        } else {
            int i10 = 0;
            int i11 = 0;
            boolean z3 = true;
            while (z3 && i10 < i4) {
                i10++;
                if (i7 == 0) {
                    i9 = 0;
                    break;
                }
                float f8 = i3 - ((mainAxisGap + i5) + i6);
                if (f < f5) {
                    float f9 = f4 * f;
                    if (Math.abs(f9) < Math.abs(f8)) {
                        f8 = f9;
                    }
                }
                float abs = Math.abs(f8);
                if (i2 < 0 || i2 > arrayList.size()) {
                    throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is out of bounds [0, " + items.size() + ']');
                }
                if (endIndex < 0 || endIndex > arrayList.size()) {
                    throw new IndexOutOfBoundsException("toIndex (" + endIndex + ") is out of bounds [0, " + items.size() + ']');
                }
                int i12 = i2;
                float f10 = abs;
                float f11 = f3;
                z3 = false;
                i11 = 0;
                while (i12 < endIndex) {
                    ResolvedFlexItemInfo resolvedFlexItemInfo4 = arrayList.get(i12);
                    if (resolvedFlexItemInfo4.getIsFrozen()) {
                        i = i4;
                        z = true;
                    } else {
                        float shrink = resolvedFlexItemInfo4.getShrink() * resolvedFlexItemInfo4.getFlexBaseSize();
                        int round2 = Math.round((f11 > 0.0f ? shrink / f11 : 0.0f) * f10);
                        int flexBaseSize = resolvedFlexItemInfo4.getFlexBaseSize() - round2;
                        i = i4;
                        float f12 = f10;
                        int minMainAxisSize$foundation_layout = resolvedFlexItemInfo4.getMinMainAxisSize$foundation_layout(isHorizontal);
                        if (flexBaseSize < minMainAxisSize$foundation_layout) {
                            z = true;
                            resolvedFlexItemInfo4.setFrozen(true);
                            f11 -= shrink;
                            resolvedFlexItemInfo4.setTargetMainSize(minMainAxisSize$foundation_layout);
                            i7--;
                            i5 += minMainAxisSize$foundation_layout;
                            i6 -= resolvedFlexItemInfo4.getFlexBaseSize();
                            f3 -= shrink;
                            f -= resolvedFlexItemInfo4.getShrink();
                            f10 = f12 - (resolvedFlexItemInfo4.getFlexBaseSize() - minMainAxisSize$foundation_layout);
                            z3 = true;
                        } else {
                            z = true;
                            f10 = f12 - round2;
                            f11 -= shrink;
                            resolvedFlexItemInfo4.setTargetMainSize(flexBaseSize);
                            i11 += resolvedFlexItemInfo4.getTargetMainSize();
                        }
                    }
                    i12++;
                    arrayList = items;
                    i4 = i;
                }
                arrayList = items;
                i3 = containerMainAxisSize;
                f5 = 1.0f;
            }
            i9 = i11;
        }
        return mainAxisGap + i5 + i9;
    }

    /* renamed from: applyAlignContentStretch-WWvErGg, reason: not valid java name */
    private final int m982applyAlignContentStretchWWvErGg(ResolvedFlexBoxConfig flexBoxConfig, ArrayList<FlexLine> lines, long constraints, int totalLinesCrossSize, int crossAxisGap) {
        int alignContent = flexBoxConfig.getAlignContent();
        FlexAlignContent.Companion companion = FlexAlignContent.INSTANCE;
        if (FlexAlignContent.m922equalsimpl0(alignContent, FlexAlignContent.m920constructorimpl(3)) && Constraints.m9676getMinHeightimpl(constraints) != Integer.MAX_VALUE && !lines.isEmpty() && lines.size() != 1) {
            int size = (lines.size() - 1) * crossAxisGap;
            int m9676getMinHeightimpl = Constraints.m9676getMinHeightimpl(constraints);
            if (totalLinesCrossSize + size < m9676getMinHeightimpl) {
                int i = (m9676getMinHeightimpl - totalLinesCrossSize) - size;
                if (i < 0) {
                    i = 0;
                }
                int size2 = i / lines.size();
                ArrayList<FlexLine> arrayList = lines;
                int size3 = arrayList.size();
                int i2 = totalLinesCrossSize;
                int i3 = 0;
                for (int i4 = 0; i4 < size3; i4++) {
                    FlexLine flexLine = arrayList.get(i4);
                    flexLine.setCrossStart(i3);
                    flexLine.setCrossAxisSize(flexLine.getCrossAxisSize() + size2);
                    i3 += flexLine.getCrossAxisSize() + crossAxisGap;
                    i2 += size2;
                }
                return i2;
            }
        }
        return totalLinesCrossSize;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
    
        if (androidx.compose.foundation.layout.FlexWrap.m1021equalsimpl0(r0, androidx.compose.foundation.layout.FlexWrap.m1019constructorimpl(2)) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
    
        if (androidx.compose.foundation.layout.FlexWrap.m1021equalsimpl0(r0, androidx.compose.foundation.layout.FlexWrap.m1019constructorimpl(2)) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void calculateLineCrossPositions(ResolvedFlexBoxConfig flexBoxConfig, int totalCrossAxisSpace, ArrayList<FlexLine> lines, int totalLinesCrossSize, int crossAxisGap) {
        int size;
        if (lines.isEmpty() || lines.size() == 1) {
            return;
        }
        int size2 = (totalCrossAxisSpace - totalLinesCrossSize) - ((lines.size() - 1) * crossAxisGap);
        int alignContent = flexBoxConfig.getAlignContent();
        FlexAlignContent.Companion companion = FlexAlignContent.INSTANCE;
        if (FlexAlignContent.m922equalsimpl0(alignContent, FlexAlignContent.m920constructorimpl(5))) {
            size = size2 / lines.size();
        } else {
            FlexAlignContent.Companion companion2 = FlexAlignContent.INSTANCE;
            size = FlexAlignContent.m922equalsimpl0(alignContent, FlexAlignContent.m920constructorimpl(4)) ? size2 / (lines.size() - 1) : 0;
        }
        int alignContent2 = flexBoxConfig.getAlignContent();
        FlexAlignContent.Companion companion3 = FlexAlignContent.INSTANCE;
        if (!FlexAlignContent.m922equalsimpl0(alignContent2, FlexAlignContent.m920constructorimpl(1))) {
            FlexAlignContent.Companion companion4 = FlexAlignContent.INSTANCE;
            if (FlexAlignContent.m922equalsimpl0(alignContent2, FlexAlignContent.m920constructorimpl(2))) {
                size2 /= 2;
            } else {
                FlexAlignContent.Companion companion5 = FlexAlignContent.INSTANCE;
                if (FlexAlignContent.m922equalsimpl0(alignContent2, FlexAlignContent.m920constructorimpl(5))) {
                    size2 = size / 2;
                } else {
                    int wrap = flexBoxConfig.getWrap();
                    FlexWrap.Companion companion6 = FlexWrap.INSTANCE;
                }
            }
            int wrap2 = flexBoxConfig.getWrap();
            FlexWrap.Companion companion7 = FlexWrap.INSTANCE;
            IntRange reversed = FlexWrap.m1021equalsimpl0(wrap2, FlexWrap.m1019constructorimpl(2)) ? RangesKt.reversed(CollectionsKt.getIndices(lines)) : CollectionsKt.getIndices(lines);
            int first = reversed.getFirst();
            int last = reversed.getLast();
            int step = reversed.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return;
            }
            while (true) {
                FlexLine flexLine = lines.get(first);
                flexLine.setCrossStart(size2);
                size2 += flexLine.getCrossAxisSize() + size + crossAxisGap;
                if (first == last) {
                    return;
                } else {
                    first += step;
                }
            }
        } else {
            int wrap3 = flexBoxConfig.getWrap();
            FlexWrap.Companion companion8 = FlexWrap.INSTANCE;
        }
    }

    private final int totalCrossAxisSize(ArrayList<FlexLine> arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            return 0;
        }
        int lastIndex = z ? 0 : CollectionsKt.getLastIndex(arrayList);
        return arrayList.get(lastIndex).getCrossStart() + arrayList.get(lastIndex).getCrossAxisSize();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        if (r19 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005e, code lost:
    
        if (r19 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0060, code lost:
    
        r1 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void positionItemsOnMainAxis(ArrayList<ResolvedFlexItemInfo> items, ResolvedFlexBoxConfig flexBoxConfig, int containerMainAxisSize, FlexLine line, int mainAxisGap, boolean isMainAxisReverse) {
        int i;
        IntRange until;
        int endIndex = line.getEndIndex() - line.getStartIndex();
        if (endIndex == 0) {
            return;
        }
        int mainAxisSize = containerMainAxisSize - line.getMainAxisSize();
        int justifyContent = flexBoxConfig.getJustifyContent();
        FlexJustifyContent.Companion companion = FlexJustifyContent.INSTANCE;
        if (FlexJustifyContent.m1008equalsimpl0(justifyContent, FlexJustifyContent.m1006constructorimpl(4))) {
            i = mainAxisSize / endIndex;
        } else {
            FlexJustifyContent.Companion companion2 = FlexJustifyContent.INSTANCE;
            if (FlexJustifyContent.m1008equalsimpl0(justifyContent, FlexJustifyContent.m1006constructorimpl(3))) {
                if (endIndex > 1) {
                    i = mainAxisSize / (endIndex - 1);
                }
                i = 0;
            } else {
                FlexJustifyContent.Companion companion3 = FlexJustifyContent.INSTANCE;
                if (FlexJustifyContent.m1008equalsimpl0(justifyContent, FlexJustifyContent.m1006constructorimpl(5))) {
                    i = mainAxisSize / (endIndex + 1);
                }
                i = 0;
            }
        }
        int justifyContent2 = flexBoxConfig.getJustifyContent();
        FlexJustifyContent.Companion companion4 = FlexJustifyContent.INSTANCE;
        if (!FlexJustifyContent.m1008equalsimpl0(justifyContent2, FlexJustifyContent.m1006constructorimpl(1))) {
            FlexJustifyContent.Companion companion5 = FlexJustifyContent.INSTANCE;
            if (FlexJustifyContent.m1008equalsimpl0(justifyContent2, FlexJustifyContent.m1006constructorimpl(2))) {
                mainAxisSize /= 2;
            } else {
                FlexJustifyContent.Companion companion6 = FlexJustifyContent.INSTANCE;
                if (FlexJustifyContent.m1008equalsimpl0(justifyContent2, FlexJustifyContent.m1006constructorimpl(4))) {
                    mainAxisSize = i / 2;
                } else {
                    FlexJustifyContent.Companion companion7 = FlexJustifyContent.INSTANCE;
                    if (FlexJustifyContent.m1008equalsimpl0(justifyContent2, FlexJustifyContent.m1006constructorimpl(5))) {
                        mainAxisSize = i;
                    }
                }
            }
            if (isMainAxisReverse) {
                until = RangesKt.downTo(line.getEndIndex() - 1, line.getStartIndex());
            } else {
                until = RangesKt.until(line.getStartIndex(), line.getEndIndex());
            }
            int first = until.getFirst();
            int last = until.getLast();
            int step = until.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return;
            }
            while (true) {
                ResolvedFlexItemInfo resolvedFlexItemInfo = items.get(first);
                resolvedFlexItemInfo.setMainPosition(mainAxisSize);
                mainAxisSize += resolvedFlexItemInfo.getTargetMainSize() + i + mainAxisGap;
                resolvedFlexItemInfo.setCrossPosition(line.getCrossStart() + m984calculateItemCrossPositionsT6f14c(resolvedFlexItemInfo, resolvedFlexItemInfo.getBaseline(), line.getMaxAboveBaseline(), resolvedFlexItemInfo.getCrossAxisSize(), line.getCrossAxisSize(), flexBoxConfig.getAlignItems()));
                if (first == last) {
                    return;
                } else {
                    first += step;
                }
            }
        }
    }

    /* renamed from: calculateItemCrossPosition-sT6f14c, reason: not valid java name */
    private final int m984calculateItemCrossPositionsT6f14c(ResolvedFlexItemInfo flexConfig, int itemBaseline, int lineMaxAboveBaseline, int itemCrossAxisSize, int lineCrossAxisSize, int containerAlignItems) {
        int m945constructorimpl;
        int alignSelf = flexConfig.getAlignSelf();
        FlexAlignSelf.Companion companion = FlexAlignSelf.INSTANCE;
        if (!FlexAlignSelf.m947equalsimpl0(alignSelf, FlexAlignSelf.m945constructorimpl(0))) {
            m945constructorimpl = flexConfig.getAlignSelf();
        } else {
            FlexAlignItems.Companion companion2 = FlexAlignItems.INSTANCE;
            if (!FlexAlignItems.m935equalsimpl0(containerAlignItems, FlexAlignItems.m933constructorimpl(0))) {
                FlexAlignItems.Companion companion3 = FlexAlignItems.INSTANCE;
                if (!FlexAlignItems.m935equalsimpl0(containerAlignItems, FlexAlignItems.m933constructorimpl(1))) {
                    FlexAlignItems.Companion companion4 = FlexAlignItems.INSTANCE;
                    if (!FlexAlignItems.m935equalsimpl0(containerAlignItems, FlexAlignItems.m933constructorimpl(2))) {
                        FlexAlignItems.Companion companion5 = FlexAlignItems.INSTANCE;
                        if (!FlexAlignItems.m935equalsimpl0(containerAlignItems, FlexAlignItems.m933constructorimpl(3))) {
                            FlexAlignItems.Companion companion6 = FlexAlignItems.INSTANCE;
                            if (!FlexAlignItems.m935equalsimpl0(containerAlignItems, FlexAlignItems.m933constructorimpl(4))) {
                                FlexAlignSelf.Companion companion7 = FlexAlignSelf.INSTANCE;
                                m945constructorimpl = FlexAlignSelf.m945constructorimpl(1);
                            } else {
                                FlexAlignSelf.Companion companion8 = FlexAlignSelf.INSTANCE;
                                m945constructorimpl = FlexAlignSelf.m945constructorimpl(5);
                            }
                        } else {
                            FlexAlignSelf.Companion companion9 = FlexAlignSelf.INSTANCE;
                            m945constructorimpl = FlexAlignSelf.m945constructorimpl(4);
                        }
                    } else {
                        FlexAlignSelf.Companion companion10 = FlexAlignSelf.INSTANCE;
                        m945constructorimpl = FlexAlignSelf.m945constructorimpl(3);
                    }
                } else {
                    FlexAlignSelf.Companion companion11 = FlexAlignSelf.INSTANCE;
                    m945constructorimpl = FlexAlignSelf.m945constructorimpl(2);
                }
            } else {
                FlexAlignSelf.Companion companion12 = FlexAlignSelf.INSTANCE;
                m945constructorimpl = FlexAlignSelf.m945constructorimpl(1);
            }
        }
        FlexAlignSelf.Companion companion13 = FlexAlignSelf.INSTANCE;
        if (FlexAlignSelf.m947equalsimpl0(m945constructorimpl, FlexAlignSelf.m945constructorimpl(1))) {
            return 0;
        }
        FlexAlignSelf.Companion companion14 = FlexAlignSelf.INSTANCE;
        if (FlexAlignSelf.m947equalsimpl0(m945constructorimpl, FlexAlignSelf.m945constructorimpl(2))) {
            return lineCrossAxisSize - itemCrossAxisSize;
        }
        FlexAlignSelf.Companion companion15 = FlexAlignSelf.INSTANCE;
        if (FlexAlignSelf.m947equalsimpl0(m945constructorimpl, FlexAlignSelf.m945constructorimpl(3))) {
            return (lineCrossAxisSize - itemCrossAxisSize) / 2;
        }
        FlexAlignSelf.Companion companion16 = FlexAlignSelf.INSTANCE;
        if (FlexAlignSelf.m947equalsimpl0(m945constructorimpl, FlexAlignSelf.m945constructorimpl(4))) {
            return 0;
        }
        FlexAlignSelf.Companion companion17 = FlexAlignSelf.INSTANCE;
        if (!FlexAlignSelf.m947equalsimpl0(m945constructorimpl, FlexAlignSelf.m945constructorimpl(5)) || itemBaseline == Integer.MIN_VALUE) {
            return 0;
        }
        return lineMaxAboveBaseline - itemBaseline;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean isMainAxisReversedForLayout(ResolvedFlexBoxConfig flexBoxConfig, LayoutDirection layoutDirection) {
        boolean z;
        int direction;
        int direction2 = flexBoxConfig.getDirection();
        FlexDirection.Companion companion = FlexDirection.INSTANCE;
        if (!FlexDirection.m997equalsimpl0(direction2, FlexDirection.m995constructorimpl(2))) {
            int direction3 = flexBoxConfig.getDirection();
            FlexDirection.Companion companion2 = FlexDirection.INSTANCE;
            if (!FlexDirection.m997equalsimpl0(direction3, FlexDirection.m995constructorimpl(3))) {
                z = false;
                direction = flexBoxConfig.getDirection();
                FlexDirection.Companion companion3 = FlexDirection.INSTANCE;
                if (!FlexDirection.m997equalsimpl0(direction, FlexDirection.m995constructorimpl(0))) {
                    int direction4 = flexBoxConfig.getDirection();
                    FlexDirection.Companion companion4 = FlexDirection.INSTANCE;
                    if (!FlexDirection.m997equalsimpl0(direction4, FlexDirection.m995constructorimpl(2))) {
                        return z;
                    }
                }
                return layoutDirection != LayoutDirection.Rtl ? !z : z;
            }
        }
        z = true;
        direction = flexBoxConfig.getDirection();
        FlexDirection.Companion companion32 = FlexDirection.INSTANCE;
        if (!FlexDirection.m997equalsimpl0(direction, FlexDirection.m995constructorimpl(0))) {
        }
        if (layoutDirection != LayoutDirection.Rtl) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0091, code lost:
    
        if (androidx.compose.foundation.layout.FlexWrap.m1021equalsimpl0(r6, androidx.compose.foundation.layout.FlexWrap.m1019constructorimpl(r18)) != false) goto L16;
     */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        ResolvedFlexBoxConfig m990resolveFlexBoxConfig3p2s80s = m990resolveFlexBoxConfig3p2s80s(this.flexBoxConfigState.getValue(), intrinsicMeasureScope, ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
        int direction = m990resolveFlexBoxConfig3p2s80s.getDirection();
        FlexDirection.Companion companion = FlexDirection.INSTANCE;
        int i2 = 0;
        int i3 = 2;
        if (!FlexDirection.m997equalsimpl0(direction, FlexDirection.m995constructorimpl(0))) {
            int direction2 = m990resolveFlexBoxConfig3p2s80s.getDirection();
            FlexDirection.Companion companion2 = FlexDirection.INSTANCE;
            if (!FlexDirection.m997equalsimpl0(direction2, FlexDirection.m995constructorimpl(2))) {
                if (list.isEmpty()) {
                    return 0;
                }
                int mainAxisGap = m990resolveFlexBoxConfig3p2s80s.mainAxisGap();
                int crossAxisGap = m990resolveFlexBoxConfig3p2s80s.crossAxisGap();
                int size = list.size();
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (i2 < size) {
                    IntrinsicMeasurable intrinsicMeasurable = list.get(i2);
                    int minIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(Integer.MAX_VALUE);
                    int minIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(minIntrinsicHeight);
                    int wrap = m990resolveFlexBoxConfig3p2s80s.getWrap();
                    FlexWrap.Companion companion3 = FlexWrap.INSTANCE;
                    int i7 = i3;
                    if (!FlexWrap.m1021equalsimpl0(wrap, FlexWrap.m1019constructorimpl(1))) {
                        int wrap2 = m990resolveFlexBoxConfig3p2s80s.getWrap();
                        FlexWrap.Companion companion4 = FlexWrap.INSTANCE;
                    }
                    if (i6 != 0 && i6 + minIntrinsicHeight > i) {
                        i4 += i5 + crossAxisGap;
                        i5 = minIntrinsicWidth;
                        i6 = minIntrinsicHeight + mainAxisGap;
                        i2++;
                        i3 = i7;
                    }
                    i6 += minIntrinsicHeight + mainAxisGap;
                    i5 = Math.max(i5, minIntrinsicWidth);
                    i2++;
                    i3 = i7;
                }
                return i4 + i5;
            }
        }
        if (list.isEmpty()) {
            return 0;
        }
        int mainAxisGap2 = m990resolveFlexBoxConfig3p2s80s.mainAxisGap();
        int wrap3 = m990resolveFlexBoxConfig3p2s80s.getWrap();
        FlexWrap.Companion companion5 = FlexWrap.INSTANCE;
        if (!FlexWrap.m1021equalsimpl0(wrap3, FlexWrap.m1019constructorimpl(1))) {
            int wrap4 = m990resolveFlexBoxConfig3p2s80s.getWrap();
            FlexWrap.Companion companion6 = FlexWrap.INSTANCE;
            if (!FlexWrap.m1021equalsimpl0(wrap4, FlexWrap.m1019constructorimpl(2))) {
                int size2 = list.size();
                int i8 = 0;
                for (int i9 = 0; i9 < size2; i9++) {
                    i8 += list.get(i9).minIntrinsicWidth(i);
                }
                return i8 + (RangesKt.coerceAtLeast(list.size() - 1, 0) * mainAxisGap2);
            }
        }
        int size3 = list.size();
        int i10 = 0;
        while (i2 < size3) {
            i10 = Math.max(i10, list.get(i2).minIntrinsicWidth(i));
            i2++;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ff, code lost:
    
        if (androidx.compose.foundation.layout.FlexWrap.m1021equalsimpl0(r6, androidx.compose.foundation.layout.FlexWrap.m1019constructorimpl(r18)) != false) goto L33;
     */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        ResolvedFlexBoxConfig m990resolveFlexBoxConfig3p2s80s = m990resolveFlexBoxConfig3p2s80s(this.flexBoxConfigState.getValue(), intrinsicMeasureScope, ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
        int direction = m990resolveFlexBoxConfig3p2s80s.getDirection();
        FlexDirection.Companion companion = FlexDirection.INSTANCE;
        int i2 = 0;
        int i3 = 2;
        if (!FlexDirection.m997equalsimpl0(direction, FlexDirection.m995constructorimpl(0))) {
            int direction2 = m990resolveFlexBoxConfig3p2s80s.getDirection();
            FlexDirection.Companion companion2 = FlexDirection.INSTANCE;
            if (!FlexDirection.m997equalsimpl0(direction2, FlexDirection.m995constructorimpl(2))) {
                if (list.isEmpty()) {
                    return 0;
                }
                int mainAxisGap = m990resolveFlexBoxConfig3p2s80s.mainAxisGap();
                int wrap = m990resolveFlexBoxConfig3p2s80s.getWrap();
                FlexWrap.Companion companion3 = FlexWrap.INSTANCE;
                if (!FlexWrap.m1021equalsimpl0(wrap, FlexWrap.m1019constructorimpl(1))) {
                    int wrap2 = m990resolveFlexBoxConfig3p2s80s.getWrap();
                    FlexWrap.Companion companion4 = FlexWrap.INSTANCE;
                    if (!FlexWrap.m1021equalsimpl0(wrap2, FlexWrap.m1019constructorimpl(2))) {
                        int size = list.size();
                        int i4 = 0;
                        for (int i5 = 0; i5 < size; i5++) {
                            i4 += list.get(i5).minIntrinsicHeight(i);
                        }
                        return i4 + (RangesKt.coerceAtLeast(list.size() - 1, 0) * mainAxisGap);
                    }
                }
                int size2 = list.size();
                int i6 = 0;
                while (i2 < size2) {
                    i6 = Math.max(i6, list.get(i2).minIntrinsicHeight(i));
                    i2++;
                }
                return i6;
            }
        }
        if (list.isEmpty()) {
            return 0;
        }
        int mainAxisGap2 = m990resolveFlexBoxConfig3p2s80s.mainAxisGap();
        int crossAxisGap = m990resolveFlexBoxConfig3p2s80s.crossAxisGap();
        int size3 = list.size();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i2 < size3) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i2);
            int minIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(Integer.MAX_VALUE);
            int minIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(minIntrinsicWidth);
            int wrap3 = m990resolveFlexBoxConfig3p2s80s.getWrap();
            FlexWrap.Companion companion5 = FlexWrap.INSTANCE;
            int i10 = i3;
            if (!FlexWrap.m1021equalsimpl0(wrap3, FlexWrap.m1019constructorimpl(1))) {
                int wrap4 = m990resolveFlexBoxConfig3p2s80s.getWrap();
                FlexWrap.Companion companion6 = FlexWrap.INSTANCE;
            }
            if (i9 != 0 && i9 + minIntrinsicWidth > i) {
                i7 += i8 + crossAxisGap;
                i8 = minIntrinsicHeight;
                i9 = minIntrinsicWidth + mainAxisGap2;
                i2++;
                i3 = i10;
            }
            i9 += minIntrinsicWidth + mainAxisGap2;
            i8 = Math.max(i8, minIntrinsicHeight);
            i2++;
            i3 = i10;
        }
        return i7 + i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0091, code lost:
    
        if (androidx.compose.foundation.layout.FlexWrap.m1021equalsimpl0(r6, androidx.compose.foundation.layout.FlexWrap.m1019constructorimpl(r18)) != false) goto L16;
     */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        ResolvedFlexBoxConfig m990resolveFlexBoxConfig3p2s80s = m990resolveFlexBoxConfig3p2s80s(this.flexBoxConfigState.getValue(), intrinsicMeasureScope, ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
        int direction = m990resolveFlexBoxConfig3p2s80s.getDirection();
        FlexDirection.Companion companion = FlexDirection.INSTANCE;
        int i2 = 0;
        int i3 = 2;
        if (!FlexDirection.m997equalsimpl0(direction, FlexDirection.m995constructorimpl(0))) {
            int direction2 = m990resolveFlexBoxConfig3p2s80s.getDirection();
            FlexDirection.Companion companion2 = FlexDirection.INSTANCE;
            if (!FlexDirection.m997equalsimpl0(direction2, FlexDirection.m995constructorimpl(2))) {
                if (list.isEmpty()) {
                    return 0;
                }
                int mainAxisGap = m990resolveFlexBoxConfig3p2s80s.mainAxisGap();
                int crossAxisGap = m990resolveFlexBoxConfig3p2s80s.crossAxisGap();
                int size = list.size();
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (i2 < size) {
                    IntrinsicMeasurable intrinsicMeasurable = list.get(i2);
                    int maxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE);
                    int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(maxIntrinsicHeight);
                    int wrap = m990resolveFlexBoxConfig3p2s80s.getWrap();
                    FlexWrap.Companion companion3 = FlexWrap.INSTANCE;
                    int i7 = i3;
                    if (!FlexWrap.m1021equalsimpl0(wrap, FlexWrap.m1019constructorimpl(1))) {
                        int wrap2 = m990resolveFlexBoxConfig3p2s80s.getWrap();
                        FlexWrap.Companion companion4 = FlexWrap.INSTANCE;
                    }
                    if (i6 != 0 && i6 + maxIntrinsicHeight > i) {
                        i4 += i5 + crossAxisGap;
                        i5 = maxIntrinsicWidth;
                        i6 = maxIntrinsicHeight + mainAxisGap;
                        i2++;
                        i3 = i7;
                    }
                    i6 += maxIntrinsicHeight + mainAxisGap;
                    i5 = Math.max(i5, maxIntrinsicWidth);
                    i2++;
                    i3 = i7;
                }
                return i4 + i5;
            }
        }
        if (list.isEmpty()) {
            return 0;
        }
        int mainAxisGap2 = m990resolveFlexBoxConfig3p2s80s.mainAxisGap();
        int wrap3 = m990resolveFlexBoxConfig3p2s80s.getWrap();
        FlexWrap.Companion companion5 = FlexWrap.INSTANCE;
        if (!FlexWrap.m1021equalsimpl0(wrap3, FlexWrap.m1019constructorimpl(1))) {
            int wrap4 = m990resolveFlexBoxConfig3p2s80s.getWrap();
            FlexWrap.Companion companion6 = FlexWrap.INSTANCE;
            if (!FlexWrap.m1021equalsimpl0(wrap4, FlexWrap.m1019constructorimpl(2))) {
                int size2 = list.size();
                int i8 = 0;
                for (int i9 = 0; i9 < size2; i9++) {
                    i8 += list.get(i9).maxIntrinsicWidth(i);
                }
                return i8 + (RangesKt.coerceAtLeast(list.size() - 1, 0) * mainAxisGap2);
            }
        }
        int size3 = list.size();
        int i10 = 0;
        while (i2 < size3) {
            i10 = Math.max(i10, list.get(i2).maxIntrinsicWidth(i));
            i2++;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ff, code lost:
    
        if (androidx.compose.foundation.layout.FlexWrap.m1021equalsimpl0(r6, androidx.compose.foundation.layout.FlexWrap.m1019constructorimpl(r18)) != false) goto L33;
     */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        ResolvedFlexBoxConfig m990resolveFlexBoxConfig3p2s80s = m990resolveFlexBoxConfig3p2s80s(this.flexBoxConfigState.getValue(), intrinsicMeasureScope, ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
        int direction = m990resolveFlexBoxConfig3p2s80s.getDirection();
        FlexDirection.Companion companion = FlexDirection.INSTANCE;
        int i2 = 0;
        int i3 = 2;
        if (!FlexDirection.m997equalsimpl0(direction, FlexDirection.m995constructorimpl(0))) {
            int direction2 = m990resolveFlexBoxConfig3p2s80s.getDirection();
            FlexDirection.Companion companion2 = FlexDirection.INSTANCE;
            if (!FlexDirection.m997equalsimpl0(direction2, FlexDirection.m995constructorimpl(2))) {
                if (list.isEmpty()) {
                    return 0;
                }
                int mainAxisGap = m990resolveFlexBoxConfig3p2s80s.mainAxisGap();
                int wrap = m990resolveFlexBoxConfig3p2s80s.getWrap();
                FlexWrap.Companion companion3 = FlexWrap.INSTANCE;
                if (!FlexWrap.m1021equalsimpl0(wrap, FlexWrap.m1019constructorimpl(1))) {
                    int wrap2 = m990resolveFlexBoxConfig3p2s80s.getWrap();
                    FlexWrap.Companion companion4 = FlexWrap.INSTANCE;
                    if (!FlexWrap.m1021equalsimpl0(wrap2, FlexWrap.m1019constructorimpl(2))) {
                        int size = list.size();
                        int i4 = 0;
                        for (int i5 = 0; i5 < size; i5++) {
                            i4 += list.get(i5).maxIntrinsicHeight(i);
                        }
                        return i4 + (RangesKt.coerceAtLeast(list.size() - 1, 0) * mainAxisGap);
                    }
                }
                int size2 = list.size();
                int i6 = 0;
                while (i2 < size2) {
                    i6 = Math.max(i6, list.get(i2).maxIntrinsicHeight(i));
                    i2++;
                }
                return i6;
            }
        }
        if (list.isEmpty()) {
            return 0;
        }
        int mainAxisGap2 = m990resolveFlexBoxConfig3p2s80s.mainAxisGap();
        int crossAxisGap = m990resolveFlexBoxConfig3p2s80s.crossAxisGap();
        int size3 = list.size();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i2 < size3) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i2);
            int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE);
            int maxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(maxIntrinsicWidth);
            int wrap3 = m990resolveFlexBoxConfig3p2s80s.getWrap();
            FlexWrap.Companion companion5 = FlexWrap.INSTANCE;
            int i10 = i3;
            if (!FlexWrap.m1021equalsimpl0(wrap3, FlexWrap.m1019constructorimpl(1))) {
                int wrap4 = m990resolveFlexBoxConfig3p2s80s.getWrap();
                FlexWrap.Companion companion6 = FlexWrap.INSTANCE;
            }
            if (i9 != 0 && i9 + maxIntrinsicWidth > i) {
                i7 += i8 + crossAxisGap;
                i8 = maxIntrinsicHeight;
                i9 = maxIntrinsicWidth + mainAxisGap2;
                i2++;
                i3 = i10;
            }
            i9 += maxIntrinsicWidth + mainAxisGap2;
            i8 = Math.max(i8, maxIntrinsicHeight);
            i2++;
            i3 = i10;
        }
        return i7 + i8;
    }

    /* renamed from: resolveFlexBoxConfig-3p2s80s, reason: not valid java name */
    private final ResolvedFlexBoxConfig m990resolveFlexBoxConfig3p2s80s(FlexBoxConfig flexBoxConfig, Density density, long constraints) {
        this.resolvedFlexBoxConfig.m1235prepare0kLqBqw(density, constraints);
        flexBoxConfig.configure(this.resolvedFlexBoxConfig);
        return this.resolvedFlexBoxConfig;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (androidx.compose.foundation.layout.FlexDirection.m997equalsimpl0(r0, androidx.compose.foundation.layout.FlexDirection.m995constructorimpl(2)) != false) goto L6;
     */
    /* renamed from: processFlexLine-7gjidqw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m989processFlexLine7gjidqw(FlexLine line, ArrayList<ResolvedFlexItemInfo> items, ResolvedFlexBoxConfig flexBoxConfig, int currentLineHypotheticalMainAxisSize, boolean needsUpfrontCrossAxisCalculation, long constraints, int remainingCrossAxisSize) {
        int direction = flexBoxConfig.getDirection();
        FlexDirection.Companion companion = FlexDirection.INSTANCE;
        boolean z = false;
        if (!FlexDirection.m997equalsimpl0(direction, FlexDirection.m995constructorimpl(0))) {
            int direction2 = flexBoxConfig.getDirection();
            FlexDirection.Companion companion2 = FlexDirection.INSTANCE;
        }
        z = true;
        line.setMainAxisSize(resolveFlexibleLengths(z, items, flexBoxConfig, line.getStartIndex(), line.getEndIndex(), currentLineHypotheticalMainAxisSize, Constraints.m9675getMaxWidthimpl(constraints)));
        if (needsUpfrontCrossAxisCalculation) {
            calculateLineCrossAxisSize(items, flexBoxConfig, line, remainingCrossAxisSize);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
    
        if (androidx.compose.foundation.layout.FlexAlignContent.m922equalsimpl0(r4, androidx.compose.foundation.layout.FlexAlignContent.m920constructorimpl(3)) != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* renamed from: measureFlexItems-HjG58DU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int m987measureFlexItemsHjG58DU(ArrayList<FlexLine> lines, ArrayList<ResolvedFlexItemInfo> items, ResolvedFlexBoxConfig flexBoxConfig, int totalLinesCrossSize, boolean needsUpfrontCrossAxisCalculation, long constraints) {
        boolean z;
        int i;
        FlexBoxMeasurePolicy flexBoxMeasurePolicy;
        int i2;
        int m9674getMaxHeightimpl = Constraints.m9674getMaxHeightimpl(constraints);
        ArrayList<FlexLine> arrayList = lines;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = totalLinesCrossSize;
        int i5 = m9674getMaxHeightimpl;
        int i6 = 0;
        while (i6 < size) {
            FlexLine flexLine = arrayList.get(i6);
            int crossAxisSize = needsUpfrontCrossAxisCalculation ? flexLine.getCrossAxisSize() : i3;
            int startIndex = flexLine.getStartIndex();
            int endIndex = flexLine.getEndIndex();
            if (startIndex < 0 || startIndex > items.size()) {
                throw new IndexOutOfBoundsException("fromIndex (" + startIndex + ") is out of bounds [0, " + items.size() + ']');
            }
            if (endIndex >= 0 && endIndex <= items.size()) {
                int i7 = crossAxisSize;
                int i8 = startIndex;
                while (i8 < endIndex) {
                    ResolvedFlexItemInfo resolvedFlexItemInfo = items.get(i8);
                    if (resolvedFlexItemInfo.getPlaceable() == null) {
                        int alignSelf = resolvedFlexItemInfo.getAlignSelf();
                        FlexAlignSelf.Companion companion = FlexAlignSelf.INSTANCE;
                        if (!FlexAlignSelf.m947equalsimpl0(alignSelf, FlexAlignSelf.m945constructorimpl(4))) {
                            int alignSelf2 = resolvedFlexItemInfo.getAlignSelf();
                            FlexAlignSelf.Companion companion2 = FlexAlignSelf.INSTANCE;
                            if (FlexAlignSelf.m947equalsimpl0(alignSelf2, FlexAlignSelf.m945constructorimpl(i3))) {
                                int alignItems = flexBoxConfig.getAlignItems();
                                FlexAlignItems.Companion companion3 = FlexAlignItems.INSTANCE;
                                if (!FlexAlignItems.m935equalsimpl0(alignItems, FlexAlignItems.m933constructorimpl(3))) {
                                    int alignContent = flexBoxConfig.getAlignContent();
                                    FlexAlignContent.Companion companion4 = FlexAlignContent.INSTANCE;
                                }
                            }
                            z = i3;
                            if (z) {
                                i = i3;
                                flexBoxMeasurePolicy = this;
                                i2 = 1;
                            } else {
                                i = flexLine.getCrossAxisSize();
                                i2 = 1;
                                flexBoxMeasurePolicy = this;
                            }
                            int measureItem = flexBoxMeasurePolicy.measureItem(resolvedFlexItemInfo, flexBoxConfig, i, z, i5);
                            if (!needsUpfrontCrossAxisCalculation) {
                                i7 = Math.max(i7, measureItem);
                            }
                            if (lines.size() != i2) {
                                i7 = Math.max(i7, Constraints.m9676getMinHeightimpl(constraints));
                            }
                        }
                        z = true;
                        if (z) {
                        }
                        int measureItem2 = flexBoxMeasurePolicy.measureItem(resolvedFlexItemInfo, flexBoxConfig, i, z, i5);
                        if (!needsUpfrontCrossAxisCalculation) {
                        }
                        if (lines.size() != i2) {
                        }
                    } else if (!needsUpfrontCrossAxisCalculation) {
                        i7 = Math.max(i7, resolvedFlexItemInfo.getCrossAxisSize());
                    }
                    i8++;
                    i3 = 0;
                }
                if (!needsUpfrontCrossAxisCalculation) {
                    flexLine.setCrossAxisSize(i7);
                    i4 += i7;
                }
                i5 = (i5 - flexLine.getCrossAxisSize()) - flexBoxConfig.crossAxisGap();
                if (i5 < 0) {
                    i5 = 0;
                }
                i6++;
                i3 = 0;
            } else {
                throw new IndexOutOfBoundsException("toIndex (" + endIndex + ") is out of bounds [0, " + items.size() + ']');
            }
        }
        return needsUpfrontCrossAxisCalculation ? totalLinesCrossSize : i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        if (androidx.compose.foundation.layout.FlexAlignSelf.m947equalsimpl0(r9, androidx.compose.foundation.layout.FlexAlignSelf.m945constructorimpl(0)) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void calculateLineCrossAxisSize(ArrayList<ResolvedFlexItemInfo> items, ResolvedFlexBoxConfig flexBoxConfig, FlexLine line, int remainingCrossAxisSize) {
        boolean z;
        int startIndex;
        int i;
        int maxIntrinsicWidth;
        int direction = flexBoxConfig.getDirection();
        FlexDirection.Companion companion = FlexDirection.INSTANCE;
        if (!FlexDirection.m997equalsimpl0(direction, FlexDirection.m995constructorimpl(0))) {
            int direction2 = flexBoxConfig.getDirection();
            FlexDirection.Companion companion2 = FlexDirection.INSTANCE;
            if (!FlexDirection.m997equalsimpl0(direction2, FlexDirection.m995constructorimpl(2))) {
                z = false;
                startIndex = line.getStartIndex();
                int endIndex = line.getEndIndex();
                if (startIndex >= 0 || startIndex > items.size()) {
                    throw new IndexOutOfBoundsException("fromIndex (" + startIndex + ") is out of bounds [0, " + items.size() + ']');
                }
                if (endIndex >= 0 && endIndex <= items.size()) {
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (startIndex < endIndex) {
                        ResolvedFlexItemInfo resolvedFlexItemInfo = items.get(startIndex);
                        if (!resolvedFlexItemInfo.getHasBaseline()) {
                            int alignItems = flexBoxConfig.getAlignItems();
                            FlexAlignItems.Companion companion3 = FlexAlignItems.INSTANCE;
                            if (FlexAlignItems.m935equalsimpl0(alignItems, FlexAlignItems.m933constructorimpl(4))) {
                                int alignSelf = resolvedFlexItemInfo.getAlignSelf();
                                FlexAlignSelf.Companion companion4 = FlexAlignSelf.INSTANCE;
                            }
                            if (z) {
                                Measurable measurable = resolvedFlexItemInfo.getMeasurable();
                                if (measurable != null) {
                                    maxIntrinsicWidth = measurable.maxIntrinsicHeight(resolvedFlexItemInfo.getTargetMainSize());
                                    resolvedFlexItemInfo.setCrossAxisSize(maxIntrinsicWidth);
                                    i = resolvedFlexItemInfo.getCrossAxisSize();
                                    i3 = Math.max(i3, i);
                                    startIndex++;
                                }
                                maxIntrinsicWidth = 0;
                                resolvedFlexItemInfo.setCrossAxisSize(maxIntrinsicWidth);
                                i = resolvedFlexItemInfo.getCrossAxisSize();
                                i3 = Math.max(i3, i);
                                startIndex++;
                            } else {
                                Measurable measurable2 = resolvedFlexItemInfo.getMeasurable();
                                if (measurable2 != null) {
                                    maxIntrinsicWidth = measurable2.maxIntrinsicWidth(resolvedFlexItemInfo.getTargetMainSize());
                                    resolvedFlexItemInfo.setCrossAxisSize(maxIntrinsicWidth);
                                    i = resolvedFlexItemInfo.getCrossAxisSize();
                                    i3 = Math.max(i3, i);
                                    startIndex++;
                                }
                                maxIntrinsicWidth = 0;
                                resolvedFlexItemInfo.setCrossAxisSize(maxIntrinsicWidth);
                                i = resolvedFlexItemInfo.getCrossAxisSize();
                                i3 = Math.max(i3, i);
                                startIndex++;
                            }
                        }
                        measureItem(resolvedFlexItemInfo, flexBoxConfig, 0, false, remainingCrossAxisSize);
                        Placeable placeable = resolvedFlexItemInfo.getPlaceable();
                        Intrinsics.checkNotNull(placeable);
                        int baseline = resolvedFlexItemInfo.getBaseline(placeable, flexBoxConfig);
                        resolvedFlexItemInfo.setBaseline(baseline);
                        i2 = Math.max(i2, baseline);
                        i4 = Math.max(i4, resolvedFlexItemInfo.getCrossAxisSize() - baseline);
                        i = i2 + i4;
                        i3 = Math.max(i3, i);
                        startIndex++;
                    }
                    line.setMaxAboveBaseline(i2);
                    line.setCrossAxisSize(i3);
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + endIndex + ") is out of bounds [0, " + items.size() + ']');
            }
        }
        z = true;
        startIndex = line.getStartIndex();
        int endIndex2 = line.getEndIndex();
        if (startIndex >= 0) {
        }
        throw new IndexOutOfBoundsException("fromIndex (" + startIndex + ") is out of bounds [0, " + items.size() + ']');
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int measureItem(ResolvedFlexItemInfo item, ResolvedFlexBoxConfig flexBoxConfig, int lineCrossAxisSize, boolean shouldStretch, int remainingCrossAxisSize) {
        boolean z;
        long m9683fitPrioritizingHeightZbe2FdA;
        int width;
        int i;
        int direction = flexBoxConfig.getDirection();
        FlexDirection.Companion companion = FlexDirection.INSTANCE;
        int i2 = 0;
        if (!FlexDirection.m997equalsimpl0(direction, FlexDirection.m995constructorimpl(0))) {
            int direction2 = flexBoxConfig.getDirection();
            FlexDirection.Companion companion2 = FlexDirection.INSTANCE;
            if (!FlexDirection.m997equalsimpl0(direction2, FlexDirection.m995constructorimpl(2))) {
                z = false;
                if (!shouldStretch && lineCrossAxisSize > 0) {
                    Constraints.Companion companion3 = Constraints.INSTANCE;
                    if (z) {
                        i = item.getTargetMainSize();
                    } else {
                        i = lineCrossAxisSize > remainingCrossAxisSize ? remainingCrossAxisSize : lineCrossAxisSize;
                    }
                    if (!z) {
                        lineCrossAxisSize = item.getTargetMainSize();
                    } else if (lineCrossAxisSize > remainingCrossAxisSize) {
                        lineCrossAxisSize = remainingCrossAxisSize;
                    }
                    m9683fitPrioritizingHeightZbe2FdA = companion3.m9685fixedJhjzzOo(i, lineCrossAxisSize);
                } else if (!z) {
                    m9683fitPrioritizingHeightZbe2FdA = Constraints.INSTANCE.m9684fitPrioritizingWidthZbe2FdA(item.getTargetMainSize(), item.getTargetMainSize(), 0, remainingCrossAxisSize);
                } else {
                    m9683fitPrioritizingHeightZbe2FdA = Constraints.INSTANCE.m9683fitPrioritizingHeightZbe2FdA(0, remainingCrossAxisSize, item.getTargetMainSize(), item.getTargetMainSize());
                }
                Measurable measurable = item.getMeasurable();
                item.setPlaceable(measurable == null ? measurable.mo8285measureBRTryo0(m9683fitPrioritizingHeightZbe2FdA) : null);
                if (!z) {
                    Placeable placeable = item.getPlaceable();
                    if (placeable != null) {
                        width = placeable.getHeight();
                    }
                    width = 0;
                } else {
                    Placeable placeable2 = item.getPlaceable();
                    if (placeable2 != null) {
                        width = placeable2.getWidth();
                    }
                    width = 0;
                }
                item.setCrossAxisSize(width);
                if (!z) {
                    Placeable placeable3 = item.getPlaceable();
                    if (placeable3 != null) {
                        i2 = placeable3.getWidth();
                    }
                } else {
                    Placeable placeable4 = item.getPlaceable();
                    if (placeable4 != null) {
                        i2 = placeable4.getHeight();
                    }
                }
                item.setMainAxisSize(i2);
                return item.getCrossAxisSize();
            }
        }
        z = true;
        if (!shouldStretch) {
        }
        if (!z) {
        }
        Measurable measurable2 = item.getMeasurable();
        item.setPlaceable(measurable2 == null ? measurable2.mo8285measureBRTryo0(m9683fitPrioritizingHeightZbe2FdA) : null);
        if (!z) {
        }
        item.setCrossAxisSize(width);
        if (!z) {
        }
        item.setMainAxisSize(i2);
        return item.getCrossAxisSize();
    }
}
