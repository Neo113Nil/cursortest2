package androidx.compose.material3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.viewfinder.compose.ViewfinderKt$$ExternalSyntheticLambda8;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.InlineClassHelperKt;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.components.avatar.DiagonalAvatarValues;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.core.instancing.CardScreenBounds;
import com.squareup.cash.moneybot.views.plugins.SlottedProgressRingKt$StackedBubbles$1$2$1;
import com.squareup.cash.offers.views.OffersCollapsibleHeaderScaffoldState;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$$ExternalSyntheticLambda13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.io.TextStreamsKt$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes3.dex */
public final class SliderKt$SliderImpl$2$1 implements MeasurePolicy {
    public final /* synthetic */ int $r8$classId;
    public final Object $state;

    public /* synthetic */ SliderKt$SliderImpl$2$1(Object obj, int i) {
        this.$r8$classId = i;
        this.$state = obj;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
        int i;
        Float valueOf;
        int i2;
        int max;
        int i3;
        int i4;
        int roundToInt;
        int i5;
        long createConstraints;
        int m1024getMaxHeightimpl;
        int i6 = this.$r8$classId;
        Object obj = this.$state;
        int i7 = 1;
        switch (i6) {
            case 0:
                SliderState sliderState = (SliderState) obj;
                int i8 = sliderState.steps;
                float[] fArr = sliderState.tickFractions;
                Orientation orientation = sliderState.orientation;
                int size = list.size();
                for (int i9 = 0; i9 < size; i9++) {
                    Measurable measurable = (Measurable) list.get(i9);
                    if (RulerKt.getLayoutId(measurable) == SliderComponents.THUMB) {
                        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
                        int size2 = list.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            Measurable measurable2 = (Measurable) list.get(i10);
                            if (RulerKt.getLayoutId(measurable2) == SliderComponents.TRACK) {
                                Orientation orientation2 = Orientation.Vertical;
                                Placeable mo833measureBRTryo02 = orientation == orientation2 ? measurable2.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(ConstraintsKt.m1035offsetNN6EwU$default(0, -mo833measureBRTryo0.height, 1, j), 0, 0, 0, 0, 14)) : measurable2.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(ConstraintsKt.m1035offsetNN6EwU$default(-mo833measureBRTryo0.width, 0, 2, j), 0, 0, 0, 0, 11));
                                Ref$IntRef ref$IntRef = new Ref$IntRef();
                                float coercedValueAsFraction = sliderState.getCoercedValueAsFraction();
                                fArr.getClass();
                                if (fArr.length == 0) {
                                    valueOf = null;
                                    i = 0;
                                } else {
                                    i = 0;
                                    valueOf = Float.valueOf(fArr[0]);
                                }
                                if (!Intrinsics.areEqual(coercedValueAsFraction, valueOf) && !Intrinsics.areEqual(coercedValueAsFraction, ArraysKt___ArraysKt.lastOrNull(fArr))) {
                                    i7 = i;
                                }
                                int i11 = mo833measureBRTryo02.get(SliderKt.CornerSizeAlignmentLine);
                                int i12 = i11 != Integer.MIN_VALUE ? i11 : i;
                                if (orientation == orientation2) {
                                    i2 = Math.max(mo833measureBRTryo02.width, mo833measureBRTryo0.width);
                                    int i13 = mo833measureBRTryo0.height;
                                    int i14 = mo833measureBRTryo02.height;
                                    max = i13 + i14;
                                    i3 = (i2 - mo833measureBRTryo02.width) / 2;
                                    i4 = i13 / 2;
                                    roundToInt = (i2 - mo833measureBRTryo0.width) / 2;
                                    ref$IntRef.element = (i8 <= 0 || i7 != 0) ? MathKt__MathJVMKt.roundToInt(i14 * coercedValueAsFraction) : MathKt__MathJVMKt.roundToInt((i14 - (i12 * 2)) * coercedValueAsFraction) + i12;
                                } else {
                                    i2 = mo833measureBRTryo0.width + mo833measureBRTryo02.width;
                                    max = Math.max(mo833measureBRTryo02.height, mo833measureBRTryo0.height);
                                    i3 = mo833measureBRTryo0.width / 2;
                                    i4 = (max - mo833measureBRTryo02.height) / 2;
                                    roundToInt = (i8 <= 0 || i7 != 0) ? MathKt__MathJVMKt.roundToInt(mo833measureBRTryo02.width * coercedValueAsFraction) : MathKt__MathJVMKt.roundToInt((mo833measureBRTryo02.width - (i12 * 2)) * coercedValueAsFraction) + i12;
                                    ref$IntRef.element = (max - mo833measureBRTryo0.height) / 2;
                                }
                                int i15 = i4;
                                int i16 = i3;
                                int i17 = roundToInt;
                                sliderState.totalWidth$delegate.setIntValue(i2);
                                sliderState.totalHeight$delegate.setIntValue(max);
                                return MeasureScope.layout$default(measureScope, i2, max, new ViewfinderKt$$ExternalSyntheticLambda8(mo833measureBRTryo02, i16, i15, mo833measureBRTryo0, i17, ref$IntRef, 1));
                            }
                        }
                        throw Recorder$$ExternalSyntheticOutline1.m("Collection contains no element matching the predicate.");
                    }
                }
                throw Recorder$$ExternalSyntheticOutline1.m("Collection contains no element matching the predicate.");
            case 1:
                return MeasureScope.layout$default(measureScope, Constraints.m1025getMaxWidthimpl(j), Constraints.m1024getMaxHeightimpl(j), new Navigator$$ExternalSyntheticLambda0(1, list, this));
            case 2:
                measureScope.getClass();
                list.getClass();
                Measurable measurable3 = (Measurable) list.get(0);
                Placeable mo833measureBRTryo03 = ((Measurable) list.get(1)).mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, Constraints.m1025getMaxWidthimpl(j), 0, 0, 0, 14));
                int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j) / ((ImmutableList) obj).size();
                int i18 = mo833measureBRTryo03.height;
                if (((m1025getMaxWidthimpl >= 0 ? 1 : 0) & (i18 >= 0 ? 1 : 0)) == 0) {
                    InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
                }
                return MeasureScope.layout$default(measureScope, Constraints.m1025getMaxWidthimpl(j), mo833measureBRTryo03.height, new BadgeQueries$$ExternalSyntheticLambda0(8, measurable3.mo833measureBRTryo0(ConstraintsKt.createConstraints(m1025getMaxWidthimpl, m1025getMaxWidthimpl, i18, i18)), mo833measureBRTryo03));
            case 3:
                measureScope.getClass();
                list.getClass();
                List<Measurable> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (Measurable measurable4 : list2) {
                    int minIntrinsicWidth = measurable4.minIntrinsicWidth(0);
                    int minIntrinsicHeight = measurable4.minIntrinsicHeight(0);
                    if (!((minIntrinsicWidth >= 0) & (minIntrinsicHeight >= 0))) {
                        InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
                    }
                    arrayList.add(measurable4.mo833measureBRTryo0(ConstraintsKt.createConstraints(minIntrinsicWidth, minIntrinsicWidth, minIntrinsicHeight, minIntrinsicHeight)));
                }
                int mo230roundToPx0680j_4 = measureScope.mo230roundToPx0680j_4(((DiagonalAvatarValues) obj).size);
                return MeasureScope.layout$default(measureScope, mo230roundToPx0680j_4, mo230roundToPx0680j_4, new SlottedProgressRingKt$StackedBubbles$1$2$1.AnonymousClass1(arrayList, mo230roundToPx0680j_4, 1));
            case 4:
                measureScope.getClass();
                list.getClass();
                List list3 = list;
                State state = (State) obj;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                int i19 = 0;
                for (Object obj2 : list3) {
                    int i20 = i19 + 1;
                    if (i19 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    Measurable measurable5 = (Measurable) obj2;
                    if (i19 >= ((List) state.getValue()).size() || (i5 = MathKt__MathJVMKt.roundToInt(((CardScreenBounds) ((List) state.getValue()).get(i19)).right - ((CardScreenBounds) ((List) state.getValue()).get(i19)).left)) < 1) {
                        i5 = 1;
                    }
                    arrayList2.add(measurable5.mo833measureBRTryo0(ConstraintsKt.Constraints$default(0, i5, 0, 0, 13)));
                    i19 = i20;
                }
                return MeasureScope.layout$default(measureScope, Constraints.m1025getMaxWidthimpl(j), Constraints.m1024getMaxHeightimpl(j), new BorrowHomeKt$$ExternalSyntheticLambda1(18, arrayList2, state));
            case 5:
                measureScope.getClass();
                list.getClass();
                final int mo230roundToPx0680j_42 = measureScope.mo230roundToPx0680j_4(208.0f);
                int mo230roundToPx0680j_43 = measureScope.mo230roundToPx0680j_4(140.0f);
                if (((List) obj).size() == 1) {
                    if (((mo230roundToPx0680j_42 >= 0 ? 1 : 0) & (mo230roundToPx0680j_42 >= 0 ? 1 : 0)) == 0) {
                        InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
                    }
                    createConstraints = ConstraintsKt.createConstraints(mo230roundToPx0680j_42, mo230roundToPx0680j_42, mo230roundToPx0680j_42, mo230roundToPx0680j_42);
                } else {
                    if (((mo230roundToPx0680j_43 >= 0 ? 1 : 0) & (mo230roundToPx0680j_43 >= 0 ? 1 : 0)) == 0) {
                        InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
                    }
                    createConstraints = ConstraintsKt.createConstraints(mo230roundToPx0680j_43, mo230roundToPx0680j_43, mo230roundToPx0680j_43, mo230roundToPx0680j_43);
                }
                final int i21 = mo230roundToPx0680j_42 - mo230roundToPx0680j_43;
                List list4 = list;
                final ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((Measurable) it.next()).mo833measureBRTryo0(createConstraints));
                }
                return MeasureScope.layout$default(measureScope, mo230roundToPx0680j_42, mo230roundToPx0680j_42, new Function1() { // from class: com.squareup.cash.moneybot.views.plugins.SlottedStackedImageKt$SlottedStackedImage$3$1$1$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj3;
                        placementScope.getClass();
                        ArrayList arrayList4 = arrayList3;
                        int size3 = arrayList4.size();
                        if (size3 == 1) {
                            Placeable placeable = (Placeable) arrayList4.get(0);
                            int i22 = placeable.width;
                            int i23 = mo230roundToPx0680j_42;
                            placementScope.placeRelative(placeable, (i23 - i22) / 2, (i23 - placeable.height) / 2, RecyclerView.DECELERATION_RATE);
                        } else if (size3 == 2) {
                            Placeable placeable2 = (Placeable) arrayList4.get(0);
                            Placeable placeable3 = (Placeable) arrayList4.get(1);
                            placementScope.placeRelative(placeable2, 0, 0, RecyclerView.DECELERATION_RATE);
                            int i24 = i21;
                            placementScope.placeRelative(placeable3, i24, i24, RecyclerView.DECELERATION_RATE);
                        }
                        return Unit.INSTANCE;
                    }
                });
            case 6:
                OffersCollapsibleHeaderScaffoldState offersCollapsibleHeaderScaffoldState = (OffersCollapsibleHeaderScaffoldState) obj;
                measureScope.getClass();
                list.getClass();
                if (list.size() < 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("there should at least be 2 children, a header and at least one content");
                    return null;
                }
                Placeable mo833measureBRTryo04 = ((Measurable) list.get(1)).mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, 0, 0, 0, 10));
                offersCollapsibleHeaderScaffoldState.headerHeightInPx$delegate.setFloatValue(mo833measureBRTryo04.height);
                Placeable mo833measureBRTryo05 = ((Measurable) list.get(0)).mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, 0, 0, Constraints.m1024getMaxHeightimpl(j) - (MathKt__MathJVMKt.roundToInt(offersCollapsibleHeaderScaffoldState.headerYOffsetInPx$delegate.getFloatValue()) + mo833measureBRTryo04.height), 2));
                if (Constraints.m1022getHasFixedHeightimpl(j)) {
                    m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j);
                } else {
                    m1024getMaxHeightimpl = Constraints.m1020getHasBoundedHeightimpl(j) ? Constraints.m1024getMaxHeightimpl(j) : Integer.MAX_VALUE;
                    int i22 = mo833measureBRTryo04.height + mo833measureBRTryo05.height;
                    if (i22 <= m1024getMaxHeightimpl) {
                        m1024getMaxHeightimpl = i22;
                    }
                }
                return MeasureScope.layout$default(measureScope, Constraints.m1025getMaxWidthimpl(j), m1024getMaxHeightimpl, new Hero3DCardViewKt$$ExternalSyntheticLambda13(mo833measureBRTryo04, mo833measureBRTryo05, m1024getMaxHeightimpl, offersCollapsibleHeaderScaffoldState));
            default:
                measureScope.getClass();
                list.getClass();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i23 = 0;
                for (Object obj3 : list) {
                    int i24 = i23 + 1;
                    if (i23 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    if (i23 != 1) {
                        arrayList5.add(obj3);
                    }
                    i23 = i24;
                }
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((Measurable) it2.next()).mo833measureBRTryo0(j));
                }
                int intValue = ((ScrollState) obj).viewportSize$delegate.getIntValue();
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    r11 += ((Placeable) it3.next()).height;
                }
                int coerceIn = RangesKt___RangesKt.coerceIn(intValue - r11, (int) measureScope.mo236toPx0680j_4(120.0f), (int) measureScope.mo236toPx0680j_4(250.0f));
                arrayList4.add(1, ((Measurable) list.get(1)).mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, 0, coerceIn, coerceIn, 3)));
                return MeasureScope.layout$default(measureScope, Constraints.m1025getMaxWidthimpl(j), coerceIn + r11, new TextStreamsKt$$ExternalSyntheticLambda0(9, arrayList4));
        }
    }
}
