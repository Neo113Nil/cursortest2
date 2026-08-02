package com.squareup.cash.moneybot.views.plugins;

import androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.InlineClassHelperKt;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class SlottedProgressRingKt$StackedBubbles$1$2$1 implements MeasurePolicy {
    public static final SlottedProgressRingKt$StackedBubbles$1$2$1 INSTANCE = new SlottedProgressRingKt$StackedBubbles$1$2$1();

    /* renamed from: com.squareup.cash.moneybot.views.plugins.SlottedProgressRingKt$StackedBubbles$1$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements Function1 {
        public final /* synthetic */ int $frontPadding;
        public final /* synthetic */ Object $placeables;
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass1(Object obj, int i, int i2) {
            this.$r8$classId = i2;
            this.$placeables = obj;
            this.$frontPadding = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            int i = this.$r8$classId;
            int i2 = this.$frontPadding;
            Object obj2 = this.$placeables;
            switch (i) {
                case 0:
                    Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                    placementScope.getClass();
                    ArrayList arrayList = (ArrayList) obj2;
                    Placeable placeable = (Placeable) arrayList.get(0);
                    Placeable placeable2 = (Placeable) arrayList.get(1);
                    placementScope.placeRelative(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                    placementScope.placeRelative(placeable2, i2, i2, RecyclerView.DECELERATION_RATE);
                    return Unit.INSTANCE;
                case 1:
                    Placeable.PlacementScope placementScope2 = (Placeable.PlacementScope) obj;
                    placementScope2.getClass();
                    int i3 = 0;
                    for (Object obj3 : (ArrayList) obj2) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        Placeable placeable3 = (Placeable) obj3;
                        placementScope2.placeRelative(placeable3, i3 == 1 ? i2 - placeable3.width : 0, i3 == 1 ? i2 - placeable3.width : 0, RecyclerView.DECELERATION_RATE);
                        i3 = i4;
                    }
                    return Unit.INSTANCE;
                default:
                    LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) obj;
                    lazyGridMeasuredItem.getClass();
                    return Boolean.valueOf(lazyGridMeasuredItem.key.equals(((Overlay$$ExternalSyntheticLambda0) obj2).invoke(Integer.valueOf(i2))));
            }
        }
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
        measureScope.getClass();
        list.getClass();
        int mo230roundToPx0680j_4 = measureScope.mo230roundToPx0680j_4(96.0f);
        int mo230roundToPx0680j_42 = measureScope.mo230roundToPx0680j_4(70.0f);
        int i = 0;
        if (!((mo230roundToPx0680j_42 >= 0) & (mo230roundToPx0680j_42 >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
        }
        long createConstraints = ConstraintsKt.createConstraints(mo230roundToPx0680j_42, mo230roundToPx0680j_42, mo230roundToPx0680j_42, mo230roundToPx0680j_42);
        int i2 = mo230roundToPx0680j_4 - mo230roundToPx0680j_42;
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Measurable) it.next()).mo833measureBRTryo0(createConstraints));
        }
        return MeasureScope.layout$default(measureScope, mo230roundToPx0680j_4, mo230roundToPx0680j_4, new AnonymousClass1(arrayList, i2, i));
    }
}
