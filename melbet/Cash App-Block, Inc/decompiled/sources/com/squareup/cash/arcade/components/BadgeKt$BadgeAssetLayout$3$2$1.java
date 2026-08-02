package com.squareup.cash.arcade.components;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.compose.DslConstraintSet;
import androidx.constraintlayout.compose.Measurer2;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarState;
import com.squareup.cash.collapsingtoolbar.views.ScrollStrategy;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public final class BadgeKt$BadgeAssetLayout$3$2$1 implements MeasurePolicy {
    public final /* synthetic */ Object $badge;
    public final /* synthetic */ Object $density;
    public final /* synthetic */ Object $placement;
    public final /* synthetic */ int $r8$classId;

    public BadgeKt$BadgeAssetLayout$3$2$1(CollapsingToolbarState collapsingToolbarState, CollapsingToolbarScaffoldState collapsingToolbarScaffoldState, LayoutDirection layoutDirection) {
        this.$r8$classId = 1;
        ScrollStrategy[] scrollStrategyArr = ScrollStrategy.$VALUES;
        this.$badge = collapsingToolbarState;
        this.$density = collapsingToolbarScaffoldState;
        this.$placement = layoutDirection;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(final MeasureScope measureScope, List list, long j) {
        final int i;
        final int mo230roundToPx0680j_4;
        Object obj;
        Object obj2;
        int i2 = this.$r8$classId;
        int i3 = 1;
        Object obj3 = this.$placement;
        Object obj4 = this.$badge;
        Object obj5 = this.$density;
        switch (i2) {
            case 0:
                BadgePlacement badgePlacement = (BadgePlacement) obj3;
                Density density = (Density) obj5;
                measureScope.getClass();
                list.getClass();
                final Placeable mo833measureBRTryo0 = ((Measurable) list.get(0)).mo833measureBRTryo0(j);
                final Placeable mo833measureBRTryo02 = ((Measurable) list.get(1)).mo833measureBRTryo0(ConstraintsKt.Constraints$default(0, 0, 0, 0, 15));
                Badge badge = (Badge) obj4;
                boolean z = badge instanceof Badge.Small;
                if (z) {
                    i = density.mo230roundToPx0680j_4(DpOffset.m1039getXD9Ej5fM(badgePlacement.smallOffset)) + (mo833measureBRTryo0.width - mo833measureBRTryo02.width);
                } else {
                    if (!(badge instanceof Badge.Large)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    i = mo833measureBRTryo0.width - (mo833measureBRTryo02.width / 2);
                }
                if (z) {
                    mo230roundToPx0680j_4 = density.mo230roundToPx0680j_4(DpOffset.m1040getYD9Ej5fM(badgePlacement.smallOffset));
                } else {
                    if (!(badge instanceof Badge.Large)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    mo230roundToPx0680j_4 = density.mo230roundToPx0680j_4(DpOffset.m1040getYD9Ej5fM(badgePlacement.largeOffset));
                }
                return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new Function1() { // from class: com.squareup.cash.arcade.components.BadgeKt$BadgeAssetLayout$3$2$1.1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj6;
                        placementScope.getClass();
                        placementScope.placeRelative(Placeable.this, 0, 0, RecyclerView.DECELERATION_RATE);
                        placementScope.placeRelative(mo833measureBRTryo02, i, mo230roundToPx0680j_4, RecyclerView.DECELERATION_RATE);
                        return Unit.INSTANCE;
                    }
                });
            case 1:
                ScrollStrategy[] scrollStrategyArr = ScrollStrategy.$VALUES;
                measureScope.getClass();
                list.getClass();
                if (list.size() < 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("the number of children should be at least 2: toolbar, (at least one) body");
                    return null;
                }
                final Placeable mo833measureBRTryo03 = ((Measurable) list.get(0)).mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, 0, 0, 0, 10));
                int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j) - ((CollapsingToolbarState) obj4).minHeightState$delegate.getIntValue();
                long m1018copyZbe2FdA$default = Constraints.m1018copyZbe2FdA$default(j, 0, 0, 0, m1024getMaxHeightimpl < 0 ? 0 : m1024getMaxHeightimpl, 2);
                List subList = list.subList(1, list.size());
                final ArrayList arrayList = new ArrayList(subList.size());
                List list2 = subList;
                int size = list2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((Measurable) subList.get(i4)).getParentData();
                    arrayList.add(null);
                }
                final ArrayList arrayList2 = new ArrayList(subList.size());
                int size2 = list2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    arrayList2.add(((Measurable) subList.get(i5)).mo833measureBRTryo0(m1018copyZbe2FdA$default));
                }
                final int i6 = mo833measureBRTryo03.height;
                int i7 = mo833measureBRTryo03.width;
                if (arrayList2.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList2.get(0);
                    int i8 = ((Placeable) obj).width;
                    int size3 = arrayList2.size() - 1;
                    if (1 <= size3) {
                        int i9 = 1;
                        while (true) {
                            Object obj6 = arrayList2.get(i9);
                            int i10 = ((Placeable) obj6).width;
                            if (i8 < i10) {
                                i8 = i10;
                                obj = obj6;
                            }
                            if (i9 != size3) {
                                i9++;
                            }
                        }
                    }
                }
                Placeable placeable = (Placeable) obj;
                final int coerceIn = RangesKt___RangesKt.coerceIn(Math.max(i7, placeable != null ? placeable.width : 0), Constraints.m1027getMinWidthimpl(j), Constraints.m1025getMaxWidthimpl(j));
                ScrollStrategy[] scrollStrategyArr2 = ScrollStrategy.$VALUES;
                if (arrayList2.isEmpty()) {
                    obj2 = null;
                } else {
                    obj2 = arrayList2.get(0);
                    int i11 = ((Placeable) obj2).height;
                    int size4 = arrayList2.size() - 1;
                    if (1 <= size4) {
                        while (true) {
                            Object obj7 = arrayList2.get(i3);
                            int i12 = ((Placeable) obj7).height;
                            if (i11 < i12) {
                                obj2 = obj7;
                                i11 = i12;
                            }
                            if (i3 != size4) {
                                i3++;
                            }
                        }
                    }
                }
                Placeable placeable2 = (Placeable) obj2;
                final int coerceIn2 = RangesKt___RangesKt.coerceIn(Math.max(i6, (placeable2 != null ? placeable2.height : 0) + i6), Constraints.m1026getMinHeightimpl(j), Constraints.m1024getMaxHeightimpl(j));
                final CollapsingToolbarScaffoldState collapsingToolbarScaffoldState = (CollapsingToolbarScaffoldState) obj5;
                final LayoutDirection layoutDirection = (LayoutDirection) obj3;
                return MeasureScope.layout$default(measureScope, coerceIn, coerceIn2, new Function1() { // from class: com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldKt$CollapsingToolbarScaffold$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj8;
                        placementScope.getClass();
                        CollapsingToolbarScaffoldState collapsingToolbarScaffoldState2 = collapsingToolbarScaffoldState;
                        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = collapsingToolbarScaffoldState2.offsetYState;
                        parcelableSnapshotMutableIntState.getClass();
                        int intValue = parcelableSnapshotMutableIntState.getIntValue();
                        Placeable placeable3 = Placeable.this;
                        int i13 = 0;
                        float f = RecyclerView.DECELERATION_RATE;
                        placementScope.placeRelative(placeable3, 0, intValue, RecyclerView.DECELERATION_RATE);
                        ArrayList arrayList3 = arrayList2;
                        int size5 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size5) {
                            Placeable placeable4 = (Placeable) arrayList3.get(i14);
                            Alignment alignment = (Alignment) arrayList.get(i14);
                            if (alignment == null) {
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = collapsingToolbarScaffoldState2.offsetYState;
                                parcelableSnapshotMutableIntState2.getClass();
                                placementScope.placeRelative(placeable4, i13, parcelableSnapshotMutableIntState2.getIntValue() + i6, f);
                            } else {
                                Placeable.PlacementScope.m854place70tqf50$default(placementScope, placeable4, alignment.mo584alignKFBX0sM((placeable4.width << 32) | (placeable4.height & BodyPartID.bodyIdMax), (coerceIn << 32) | (coerceIn2 & BodyPartID.bodyIdMax), layoutDirection));
                            }
                            i14++;
                            i13 = 0;
                            f = RecyclerView.DECELERATION_RATE;
                        }
                        return Unit.INSTANCE;
                    }
                });
            case 2:
                measureScope.getClass();
                list.getClass();
                if (list.size() > 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("Content slots can only have 1 child composable for startContent, textContent, and endContent.");
                    return null;
                }
                final Placeable placeable3 = null;
                Measurable measurable = ((Function3) obj4) != null ? (Measurable) list.get(0) : null;
                Iterator it = list.iterator();
                int i13 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i13 = -1;
                    } else if (!Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) it.next()), "text")) {
                        i13++;
                    }
                }
                Measurable measurable2 = i13 >= 0 ? (Measurable) list.get(i13) : null;
                Placeable mo833measureBRTryo04 = measurable != null ? measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, 0, 0, 0, 10)) : null;
                Placeable mo833measureBRTryo05 = measurable2 != null ? measurable2.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, (Constraints.m1025getMaxWidthimpl(j) - 0) - (mo833measureBRTryo04 != null ? mo833measureBRTryo04.width : 0), 0, 0, 8)) : null;
                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                TextLayoutResult textLayoutResult = (TextLayoutResult) ((MutableState) obj5).getValue();
                int mo230roundToPx0680j_42 = measureScope.mo230roundToPx0680j_4(((PaddingValues) obj3).mo267calculateTopPaddingD9Ej5fM());
                final Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                if (textLayoutResult != null) {
                    int access$calculateYOffset = KeypadKt.access$calculateYOffset(mo833measureBRTryo04, textLayoutResult) + mo230roundToPx0680j_42;
                    int access$calculateYOffset2 = KeypadKt.access$calculateYOffset(null, textLayoutResult) + mo230roundToPx0680j_42;
                    int max = Math.max(Math.abs(Math.min(access$calculateYOffset, 0)), Math.abs(Math.min(access$calculateYOffset2, 0)));
                    ref$IntRef3.element = max;
                    ref$IntRef.element = access$calculateYOffset + max;
                    ref$IntRef2.element = access$calculateYOffset2 + ref$IntRef3.element;
                }
                int max2 = Math.max(mo833measureBRTryo04 != null ? mo833measureBRTryo04.height + ref$IntRef.element : 0, Math.max(mo833measureBRTryo05 != null ? mo833measureBRTryo05.height + ref$IntRef3.element : 0, 0));
                final int max3 = Math.max((mo833measureBRTryo04 != null ? mo833measureBRTryo04.width : 0) + (mo833measureBRTryo05 != null ? mo833measureBRTryo05.width : 0) + 0, Constraints.m1027getMinWidthimpl(j));
                final Placeable placeable4 = mo833measureBRTryo04;
                final Placeable placeable5 = mo833measureBRTryo05;
                return MeasureScope.layout$default(measureScope, max3, max2, new Function1() { // from class: com.squareup.cash.mooncake.compose_ui.components.CenterLineAlignmentRowKt$CenterLineAlignmentRow$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj8;
                        placementScope.getClass();
                        Placeable placeable6 = Placeable.this;
                        int i14 = 0;
                        int i15 = placeable6 != null ? placeable6.width : 0;
                        Placeable placeable7 = placeable3;
                        int i16 = placeable7 != null ? placeable7.width : 0;
                        int i17 = max3;
                        int i18 = i17 - i16;
                        if (measureScope.getLayoutDirection() == LayoutDirection.Rtl) {
                            int i19 = i17 - (placeable6 != null ? placeable6.width : 0);
                            i15 = placeable7 != null ? placeable7.width : 0;
                            i18 = 0;
                            i14 = i19;
                        }
                        if (placeable6 != null) {
                            placementScope.place(placeable6, i14, ref$IntRef.element, RecyclerView.DECELERATION_RATE);
                        }
                        Placeable placeable8 = placeable5;
                        if (placeable8 != null) {
                            placementScope.place(placeable8, i15, ref$IntRef3.element, RecyclerView.DECELERATION_RATE);
                        }
                        if (placeable7 != null) {
                            placementScope.place(placeable7, i18, ref$IntRef2.element, RecyclerView.DECELERATION_RATE);
                        }
                        return Unit.INSTANCE;
                    }
                });
            default:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ((MutableState) obj4).getValue();
                long m1080performMeasureDjhGOtQ = ((Measurer2) obj5).m1080performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), (DslConstraintSet) obj3, list, linkedHashMap);
                return MeasureScope.layout$default(measureScope, (int) (m1080performMeasureDjhGOtQ >> 32), (int) (m1080performMeasureDjhGOtQ & BodyPartID.bodyIdMax), new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2.AnonymousClass1((Measurer2) obj5, list, linkedHashMap, 8));
        }
    }

    public /* synthetic */ BadgeKt$BadgeAssetLayout$3$2$1(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.$badge = obj;
        this.$density = obj2;
        this.$placement = obj3;
    }
}
