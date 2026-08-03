package androidx.compose.material3;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: Menu.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u00020\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0013J'\u0010\u0016\u001a\u00020\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0013J'\u0010\u0018\u001a\u00020\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u0013J'\u0010\u001a\u001a\u00020\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/DropdownMenuItemMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "hasLeadingIcon", "", "hasTrailingIcon", "<init>", "(ZZ)V", "getHasLeadingIcon", "()Z", "getHasTrailingIcon", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "JustTextMeasureResult", "JustTextMeasureResult-3p2s80s", "NoLeadingIconMeasureResult", "NoLeadingIconMeasureResult-3p2s80s", "NoTrailingIconMeasureResult", "NoTrailingIconMeasureResult-3p2s80s", "DefaultMeasureResult", "DefaultMeasureResult-3p2s80s", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class DropdownMenuItemMeasurePolicy implements MeasurePolicy {
    private final boolean hasLeadingIcon;
    private final boolean hasTrailingIcon;

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i);
    }

    public DropdownMenuItemMeasurePolicy(boolean z, boolean z2) {
        this.hasLeadingIcon = z;
        this.hasTrailingIcon = z2;
    }

    public final boolean getHasLeadingIcon() {
        return this.hasLeadingIcon;
    }

    public final boolean getHasTrailingIcon() {
        return this.hasTrailingIcon;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo81measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        boolean z = this.hasLeadingIcon;
        if (!z && !this.hasTrailingIcon) {
            return m3076JustTextMeasureResult3p2s80s(measureScope, list, j);
        }
        if (!this.hasTrailingIcon) {
            return m3078NoTrailingIconMeasureResult3p2s80s(measureScope, list, j);
        }
        if (!z) {
            return m3077NoLeadingIconMeasureResult3p2s80s(measureScope, list, j);
        }
        return m3075DefaultMeasureResult3p2s80s(measureScope, list, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JustTextMeasureResult_3p2s80s$lambda$1(Placeable placeable, int i, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i), 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoLeadingIconMeasureResult_3p2s80s$lambda$2(Placeable placeable, int i, Placeable placeable2, int i2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i), 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2 - placeable2.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i), 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoTrailingIconMeasureResult_3p2s80s$lambda$3(Placeable placeable, int i, Placeable placeable2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i), 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, placeable.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i), 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultMeasureResult_3p2s80s$lambda$4(Placeable placeable, int i, Placeable placeable2, Placeable placeable3, int i2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i), 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, placeable.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i), 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i2 - placeable3.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), i), 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* renamed from: JustTextMeasureResult-3p2s80s, reason: not valid java name */
    public final MeasureResult m3076JustTextMeasureResult3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int width;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Measurable measurable = list.get(i);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "text")) {
                final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null));
                if (Constraints.m9671getHasBoundedWidthimpl(j)) {
                    width = Constraints.m9675getMaxWidthimpl(j);
                } else {
                    width = mo8285measureBRTryo0.getWidth();
                }
                int i2 = width;
                final int max = Math.max(Constraints.m9676getMinHeightimpl(j), mo8285measureBRTryo0.getHeight());
                return MeasureScope.CC.layout$default(measureScope, i2, max, null, new Function1() { // from class: androidx.compose.material3.DropdownMenuItemMeasurePolicy$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit JustTextMeasureResult_3p2s80s$lambda$1;
                        JustTextMeasureResult_3p2s80s$lambda$1 = DropdownMenuItemMeasurePolicy.JustTextMeasureResult_3p2s80s$lambda$1(Placeable.this, max, (Placeable.PlacementScope) obj);
                        return JustTextMeasureResult_3p2s80s$lambda$1;
                    }
                }, 4, null);
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* renamed from: NoLeadingIconMeasureResult-3p2s80s, reason: not valid java name */
    public final MeasureResult m3077NoLeadingIconMeasureResult3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        long m9665copyZbe2FdA$default;
        int width;
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Measurable measurable = list.get(i);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "trailingIcon")) {
                final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null));
                if (Constraints.m9671getHasBoundedWidthimpl(j)) {
                    m9665copyZbe2FdA$default = Constraints.INSTANCE.m9687fixedWidthOenEA2s(RangesKt.coerceAtLeast(Constraints.m9675getMaxWidthimpl(j) - mo8285measureBRTryo0.getWidth(), 0));
                } else {
                    m9665copyZbe2FdA$default = Constraints.m9665copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null);
                }
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Measurable measurable2 = list.get(i2);
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "text")) {
                        final Placeable mo8285measureBRTryo02 = measurable2.mo8285measureBRTryo0(m9665copyZbe2FdA$default);
                        if (Constraints.m9671getHasBoundedWidthimpl(j)) {
                            width = Constraints.m9675getMaxWidthimpl(j);
                        } else {
                            width = mo8285measureBRTryo0.getWidth() + mo8285measureBRTryo02.getWidth();
                        }
                        final int i3 = width;
                        final int max = Math.max(Constraints.m9676getMinHeightimpl(j), Math.max(mo8285measureBRTryo0.getHeight(), mo8285measureBRTryo02.getHeight()));
                        return MeasureScope.CC.layout$default(measureScope, i3, max, null, new Function1() { // from class: androidx.compose.material3.DropdownMenuItemMeasurePolicy$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit NoLeadingIconMeasureResult_3p2s80s$lambda$2;
                                NoLeadingIconMeasureResult_3p2s80s$lambda$2 = DropdownMenuItemMeasurePolicy.NoLeadingIconMeasureResult_3p2s80s$lambda$2(Placeable.this, max, mo8285measureBRTryo0, i3, (Placeable.PlacementScope) obj);
                                return NoLeadingIconMeasureResult_3p2s80s$lambda$2;
                            }
                        }, 4, null);
                    }
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* renamed from: NoTrailingIconMeasureResult-3p2s80s, reason: not valid java name */
    public final MeasureResult m3078NoTrailingIconMeasureResult3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        long m9665copyZbe2FdA$default;
        int width;
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Measurable measurable = list.get(i);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "leadingIcon")) {
                final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null));
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Measurable measurable2 = list.get(i2);
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "ghostLeadingIcon")) {
                        Placeable mo8285measureBRTryo02 = measurable2.mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null));
                        if (Constraints.m9671getHasBoundedWidthimpl(j)) {
                            m9665copyZbe2FdA$default = Constraints.INSTANCE.m9687fixedWidthOenEA2s(RangesKt.coerceAtLeast(Constraints.m9675getMaxWidthimpl(j) - mo8285measureBRTryo02.getWidth(), 0));
                        } else {
                            m9665copyZbe2FdA$default = Constraints.m9665copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null);
                        }
                        int size3 = list2.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            Measurable measurable3 = list.get(i3);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "text")) {
                                final Placeable mo8285measureBRTryo03 = measurable3.mo8285measureBRTryo0(m9665copyZbe2FdA$default);
                                if (Constraints.m9671getHasBoundedWidthimpl(j)) {
                                    width = Constraints.m9675getMaxWidthimpl(j);
                                } else {
                                    width = mo8285measureBRTryo02.getWidth() + mo8285measureBRTryo03.getWidth();
                                }
                                int i4 = width;
                                final int max = Math.max(Constraints.m9676getMinHeightimpl(j), Math.max(mo8285measureBRTryo0.getHeight(), mo8285measureBRTryo03.getHeight()));
                                return MeasureScope.CC.layout$default(measureScope, i4, max, null, new Function1() { // from class: androidx.compose.material3.DropdownMenuItemMeasurePolicy$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit NoTrailingIconMeasureResult_3p2s80s$lambda$3;
                                        NoTrailingIconMeasureResult_3p2s80s$lambda$3 = DropdownMenuItemMeasurePolicy.NoTrailingIconMeasureResult_3p2s80s$lambda$3(Placeable.this, max, mo8285measureBRTryo03, (Placeable.PlacementScope) obj);
                                        return NoTrailingIconMeasureResult_3p2s80s$lambda$3;
                                    }
                                }, 4, null);
                            }
                        }
                        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                        throw new KotlinNothingValueException();
                    }
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* renamed from: DefaultMeasureResult-3p2s80s, reason: not valid java name */
    public final MeasureResult m3075DefaultMeasureResult3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        long m9665copyZbe2FdA$default;
        int width;
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Measurable measurable = list.get(i);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "leadingIcon")) {
                final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null));
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Measurable measurable2 = list.get(i2);
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "trailingIcon")) {
                        final Placeable mo8285measureBRTryo02 = measurable2.mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null));
                        int size3 = list2.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            Measurable measurable3 = list.get(i3);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "ghostLeadingIcon")) {
                                Placeable mo8285measureBRTryo03 = measurable3.mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null));
                                if (Constraints.m9671getHasBoundedWidthimpl(j)) {
                                    m9665copyZbe2FdA$default = Constraints.INSTANCE.m9687fixedWidthOenEA2s(RangesKt.coerceAtLeast((Constraints.m9675getMaxWidthimpl(j) - mo8285measureBRTryo03.getWidth()) - mo8285measureBRTryo02.getWidth(), 0));
                                } else {
                                    m9665copyZbe2FdA$default = Constraints.m9665copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null);
                                }
                                int size4 = list2.size();
                                for (int i4 = 0; i4 < size4; i4++) {
                                    Measurable measurable4 = list.get(i4);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), "text")) {
                                        final Placeable mo8285measureBRTryo04 = measurable4.mo8285measureBRTryo0(m9665copyZbe2FdA$default);
                                        if (Constraints.m9671getHasBoundedWidthimpl(j)) {
                                            width = Constraints.m9675getMaxWidthimpl(j);
                                        } else {
                                            width = mo8285measureBRTryo03.getWidth() + mo8285measureBRTryo04.getWidth() + mo8285measureBRTryo02.getWidth();
                                        }
                                        final int i5 = width;
                                        final int max = Math.max(Constraints.m9676getMinHeightimpl(j), Math.max(mo8285measureBRTryo0.getHeight(), Math.max(mo8285measureBRTryo04.getHeight(), mo8285measureBRTryo02.getHeight())));
                                        return MeasureScope.CC.layout$default(measureScope, i5, max, null, new Function1() { // from class: androidx.compose.material3.DropdownMenuItemMeasurePolicy$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit DefaultMeasureResult_3p2s80s$lambda$4;
                                                DefaultMeasureResult_3p2s80s$lambda$4 = DropdownMenuItemMeasurePolicy.DefaultMeasureResult_3p2s80s$lambda$4(Placeable.this, max, mo8285measureBRTryo04, mo8285measureBRTryo02, i5, (Placeable.PlacementScope) obj);
                                                return DefaultMeasureResult_3p2s80s$lambda$4;
                                            }
                                        }, 4, null);
                                    }
                                }
                                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                                throw new KotlinNothingValueException();
                            }
                        }
                        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                        throw new KotlinNothingValueException();
                    }
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
