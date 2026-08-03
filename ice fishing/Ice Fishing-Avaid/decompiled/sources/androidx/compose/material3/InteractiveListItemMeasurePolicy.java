package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: ListItem.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\b\u001a\u00020\t*\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\f2\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J(\u0010\u0017\u001a\u00020\u0013*\u00020\u00142\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\f2\u0006\u0010\u0018\u001a\u00020\u0013H\u0016J(\u0010\u0019\u001a\u00020\u0013*\u00020\u00142\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\f2\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J(\u0010\u001a\u001a\u00020\u0013*\u00020\u00142\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\f2\u0006\u0010\u0018\u001a\u00020\u0013H\u0016JR\u0010\u001b\u001a\u00020\u00132\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\f2\u0006\u0010\u0018\u001a\u00020\u00132,\u0010\u001c\u001a(\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00130\u001d¢\u0006\u0002\b H\u0002JR\u0010!\u001a\u00020\u00132\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f0\f2\u0006\u0010\u0016\u001a\u00020\u00132,\u0010\u001c\u001a(\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00130\u001d¢\u0006\u0002\b H\u0002JN\u0010\"\u001a\u00020\t*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010$2\b\u0010(\u001a\u0004\u0018\u00010$H\u0002J?\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b/\u00100J?\u00101\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b7\u00100R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u00068"}, d2 = {"Landroidx/compose/material3/InteractiveListItemMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "<init>", "(Landroidx/compose/ui/Alignment$Vertical;)V", "getVerticalAlignment", "()Landroidx/compose/ui/Alignment$Vertical;", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "minIntrinsicHeight", "minIntrinsicWidth", "calculateIntrinsicWidth", "intrinsicMeasure", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "Lkotlin/ExtensionFunctionType;", "calculateIntrinsicHeight", "place", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "contentPlaceable", "overlinePlaceable", "supportingPlaceable", "calculateWidth", "leadingWidth", "trailingWidth", "overlineWidth", "supportingWidth", "contentWidth", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "calculateHeight", "leadingHeight", "trailingHeight", "overlineHeight", "supportingHeight", "contentHeight", "calculateHeight-VsPV1Ek", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class InteractiveListItemMeasurePolicy implements MultiContentMeasurePolicy {
    private final Alignment.Vertical verticalAlignment;

    public InteractiveListItemMeasurePolicy(Alignment.Vertical vertical) {
        this.verticalAlignment = vertical;
    }

    public final Alignment.Vertical getVerticalAlignment() {
        return this.verticalAlignment;
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1062measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j) {
        List<? extends Measurable> list2 = list.get(0);
        List<? extends Measurable> list3 = list.get(1);
        List<? extends Measurable> list4 = list.get(2);
        List<? extends Measurable> list5 = list.get(3);
        List<? extends Measurable> list6 = list.get(4);
        long m9665copyZbe2FdA$default = Constraints.m9665copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        Measurable measurable = (Measurable) CollectionsKt.firstOrNull((List) list2);
        Placeable mo8285measureBRTryo0 = measurable != null ? measurable.mo8285measureBRTryo0(m9665copyZbe2FdA$default) : null;
        int widthOrZero = LayoutUtilKt.getWidthOrZero(mo8285measureBRTryo0);
        Measurable measurable2 = (Measurable) CollectionsKt.firstOrNull((List) list3);
        Placeable mo8285measureBRTryo02 = measurable2 != null ? measurable2.mo8285measureBRTryo0(ConstraintsKt.m9695offsetNN6EwU$default(m9665copyZbe2FdA$default, -widthOrZero, 0, 2, null)) : null;
        int widthOrZero2 = widthOrZero + LayoutUtilKt.getWidthOrZero(mo8285measureBRTryo02);
        Measurable measurable3 = (Measurable) CollectionsKt.firstOrNull((List) list4);
        Placeable mo8285measureBRTryo03 = measurable3 != null ? measurable3.mo8285measureBRTryo0(ConstraintsKt.m9695offsetNN6EwU$default(m9665copyZbe2FdA$default, -widthOrZero2, 0, 2, null)) : null;
        int heightOrZero = LayoutUtilKt.getHeightOrZero(mo8285measureBRTryo03);
        Measurable measurable4 = (Measurable) CollectionsKt.firstOrNull((List) list6);
        Placeable mo8285measureBRTryo04 = measurable4 != null ? measurable4.mo8285measureBRTryo0(ConstraintsKt.m9694offsetNN6EwU(m9665copyZbe2FdA$default, -widthOrZero2, -heightOrZero)) : null;
        int heightOrZero2 = heightOrZero + LayoutUtilKt.getHeightOrZero(mo8285measureBRTryo04);
        Measurable measurable5 = (Measurable) CollectionsKt.firstOrNull((List) list5);
        Placeable mo8285measureBRTryo05 = measurable5 != null ? measurable5.mo8285measureBRTryo0(ConstraintsKt.m9694offsetNN6EwU(m9665copyZbe2FdA$default, -widthOrZero2, -heightOrZero2)) : null;
        return place(measureScope, m3384calculateWidthVsPV1Ek(LayoutUtilKt.getWidthOrZero(mo8285measureBRTryo0), LayoutUtilKt.getWidthOrZero(mo8285measureBRTryo02), LayoutUtilKt.getWidthOrZero(mo8285measureBRTryo03), LayoutUtilKt.getWidthOrZero(mo8285measureBRTryo05), LayoutUtilKt.getWidthOrZero(mo8285measureBRTryo04), j), m3383calculateHeightVsPV1Ek(LayoutUtilKt.getHeightOrZero(mo8285measureBRTryo0), LayoutUtilKt.getHeightOrZero(mo8285measureBRTryo02), LayoutUtilKt.getHeightOrZero(mo8285measureBRTryo03), LayoutUtilKt.getHeightOrZero(mo8285measureBRTryo05), LayoutUtilKt.getHeightOrZero(mo8285measureBRTryo04), j), mo8285measureBRTryo0, mo8285measureBRTryo02, mo8285measureBRTryo04, mo8285measureBRTryo03, mo8285measureBRTryo05);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        return calculateIntrinsicHeight(list, i, InteractiveListItemMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        return calculateIntrinsicWidth(list, i, InteractiveListItemMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        return calculateIntrinsicHeight(list, i, InteractiveListItemMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i) {
        return calculateIntrinsicWidth(list, i, InteractiveListItemMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }

    private final int calculateIntrinsicWidth(List<? extends List<? extends IntrinsicMeasurable>> measurables, int height, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> intrinsicMeasure) {
        List<? extends IntrinsicMeasurable> list = measurables.get(0);
        List<? extends IntrinsicMeasurable> list2 = measurables.get(1);
        List<? extends IntrinsicMeasurable> list3 = measurables.get(2);
        List<? extends IntrinsicMeasurable> list4 = measurables.get(3);
        List<? extends IntrinsicMeasurable> list5 = measurables.get(4);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list);
        int intValue = intrinsicMeasurable != null ? intrinsicMeasure.invoke(intrinsicMeasurable, Integer.valueOf(height)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list2);
        int intValue2 = intrinsicMeasurable2 != null ? intrinsicMeasure.invoke(intrinsicMeasurable2, Integer.valueOf(height)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list3);
        int intValue3 = intrinsicMeasurable3 != null ? intrinsicMeasure.invoke(intrinsicMeasurable3, Integer.valueOf(height)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list4);
        int intValue4 = intrinsicMeasurable4 != null ? intrinsicMeasure.invoke(intrinsicMeasurable4, Integer.valueOf(height)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list5);
        return m3384calculateWidthVsPV1Ek(intValue, intValue2, intValue3, intValue4, intrinsicMeasurable5 != null ? intrinsicMeasure.invoke(intrinsicMeasurable5, Integer.valueOf(height)).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }

    private final int calculateIntrinsicHeight(List<? extends List<? extends IntrinsicMeasurable>> measurables, int width, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> intrinsicMeasure) {
        int i;
        int i2;
        int i3;
        List<? extends IntrinsicMeasurable> list = measurables.get(0);
        List<? extends IntrinsicMeasurable> list2 = measurables.get(1);
        List<? extends IntrinsicMeasurable> list3 = measurables.get(2);
        List<? extends IntrinsicMeasurable> list4 = measurables.get(3);
        List<? extends IntrinsicMeasurable> list5 = measurables.get(4);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list);
        if (intrinsicMeasurable != null) {
            int intValue = intrinsicMeasure.invoke(intrinsicMeasurable, Integer.valueOf(width)).intValue();
            i = LayoutUtilKt.subtractConstraintSafely(width, intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE));
            i2 = intValue;
        } else {
            i = width;
            i2 = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list2);
        if (intrinsicMeasurable2 != null) {
            int intValue2 = intrinsicMeasure.invoke(intrinsicMeasurable2, Integer.valueOf(i)).intValue();
            i = LayoutUtilKt.subtractConstraintSafely(i, intrinsicMeasurable2.maxIntrinsicWidth(Integer.MAX_VALUE));
            i3 = intValue2;
        } else {
            i3 = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list3);
        int intValue3 = intrinsicMeasurable3 != null ? intrinsicMeasure.invoke(intrinsicMeasurable3, Integer.valueOf(i)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list4);
        int intValue4 = intrinsicMeasurable4 != null ? intrinsicMeasure.invoke(intrinsicMeasurable4, Integer.valueOf(i)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list5);
        return m3383calculateHeightVsPV1Ek(i2, i3, intValue3, intValue4, intrinsicMeasurable5 != null ? intrinsicMeasure.invoke(intrinsicMeasurable5, Integer.valueOf(i)).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }

    private final MeasureResult place(MeasureScope measureScope, final int i, final int i2, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, final Placeable placeable5) {
        return MeasureScope.CC.layout$default(measureScope, i, i2, null, new Function1() { // from class: androidx.compose.material3.InteractiveListItemMeasurePolicy$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit place$lambda$0;
                place$lambda$0 = InteractiveListItemMeasurePolicy.place$lambda$0(Placeable.this, this, i2, placeable3, placeable4, placeable5, placeable2, i, (Placeable.PlacementScope) obj);
                return place$lambda$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit place$lambda$0(Placeable placeable, InteractiveListItemMeasurePolicy interactiveListItemMeasurePolicy, int i, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, int i2, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, interactiveListItemMeasurePolicy.verticalAlignment.align(placeable.getHeight(), i), 0.0f, 4, null);
        }
        int widthOrZero = LayoutUtilKt.getWidthOrZero(placeable);
        int align = interactiveListItemMeasurePolicy.verticalAlignment.align(LayoutUtilKt.getHeightOrZero(placeable2) + LayoutUtilKt.getHeightOrZero(placeable3) + LayoutUtilKt.getHeightOrZero(placeable4), i);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, widthOrZero, align, 0.0f, 4, null);
        }
        int heightOrZero = align + LayoutUtilKt.getHeightOrZero(placeable3);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, widthOrZero, heightOrZero, 0.0f, 4, null);
        }
        int heightOrZero2 = heightOrZero + LayoutUtilKt.getHeightOrZero(placeable2);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, widthOrZero, heightOrZero2, 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i2 - placeable5.getWidth(), interactiveListItemMeasurePolicy.verticalAlignment.align(placeable5.getHeight(), i), 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    private final int m3384calculateWidthVsPV1Ek(int leadingWidth, int trailingWidth, int overlineWidth, int supportingWidth, int contentWidth, long constraints) {
        if (Constraints.m9671getHasBoundedWidthimpl(constraints)) {
            return Constraints.m9675getMaxWidthimpl(constraints);
        }
        return leadingWidth + Math.max(contentWidth, Math.max(overlineWidth, supportingWidth)) + trailingWidth;
    }

    /* renamed from: calculateHeight-VsPV1Ek, reason: not valid java name */
    private final int m3383calculateHeightVsPV1Ek(int leadingHeight, int trailingHeight, int overlineHeight, int supportingHeight, int contentHeight, long constraints) {
        return ConstraintsKt.m9691constrainHeightK40F9xA(constraints, Math.max(leadingHeight, Math.max(contentHeight + overlineHeight + supportingHeight, trailingHeight)));
    }
}
