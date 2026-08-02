package com.squareup.cash.payments.views;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2 implements MeasurePolicy {
    public final /* synthetic */ ConstraintSetForInlineDsl $constraintSet;
    public final /* synthetic */ MutableState $contentTracker;
    public final /* synthetic */ Measurer2 $measurer;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $remeasureRequesterState;

    /* renamed from: com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements Function1 {
        public final /* synthetic */ List $measurables;
        public final /* synthetic */ Measurer2 $measurer;
        public final /* synthetic */ LinkedHashMap $placeableMap;
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Measurer2 measurer2, List list, LinkedHashMap linkedHashMap, int i) {
            super(1);
            this.$r8$classId = i;
            this.$measurer = measurer2;
            this.$measurables = list;
            this.$placeableMap = linkedHashMap;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            int i = this.$r8$classId;
            LinkedHashMap linkedHashMap = this.$placeableMap;
            List list = this.$measurables;
            Measurer2 measurer2 = this.$measurer;
            switch (i) {
                case 0:
                    measurer2.performLayout((Placeable.PlacementScope) obj, list, linkedHashMap);
                    break;
                case 1:
                    measurer2.performLayout((Placeable.PlacementScope) obj, list, linkedHashMap);
                    break;
                case 2:
                    measurer2.performLayout((Placeable.PlacementScope) obj, list, linkedHashMap);
                    break;
                case 3:
                    measurer2.performLayout((Placeable.PlacementScope) obj, list, linkedHashMap);
                    break;
                case 4:
                    measurer2.performLayout((Placeable.PlacementScope) obj, list, linkedHashMap);
                    break;
                case 5:
                    measurer2.performLayout((Placeable.PlacementScope) obj, list, linkedHashMap);
                    break;
                case 6:
                    measurer2.performLayout((Placeable.PlacementScope) obj, list, linkedHashMap);
                    break;
                case 7:
                    measurer2.performLayout((Placeable.PlacementScope) obj, list, linkedHashMap);
                    break;
                default:
                    measurer2.performLayout((Placeable.PlacementScope) obj, list, linkedHashMap);
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2(MutableState mutableState, Measurer2 measurer2, ConstraintSetForInlineDsl constraintSetForInlineDsl, MutableState mutableState2, int i) {
        this.$r8$classId = i;
        this.$contentTracker = mutableState;
        this.$measurer = measurer2;
        this.$constraintSet = constraintSetForInlineDsl;
        this.$remeasureRequesterState = mutableState2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
        int i = this.$r8$classId;
        Measurer2 measurer2 = this.$measurer;
        MutableState mutableState = this.$remeasureRequesterState;
        MutableState mutableState2 = this.$contentTracker;
        switch (i) {
            case 0:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                mutableState2.getValue();
                long m1080performMeasureDjhGOtQ = this.$measurer.m1080performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), this.$constraintSet, list, linkedHashMap);
                mutableState.getValue();
                return MeasureScope.layout$default(measureScope, (int) (m1080performMeasureDjhGOtQ >> 32), (int) (m1080performMeasureDjhGOtQ & BodyPartID.bodyIdMax), new AnonymousClass1(measurer2, list, linkedHashMap, 0));
            case 1:
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                mutableState2.getValue();
                long m1080performMeasureDjhGOtQ2 = this.$measurer.m1080performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), this.$constraintSet, list, linkedHashMap2);
                mutableState.getValue();
                return MeasureScope.layout$default(measureScope, (int) (m1080performMeasureDjhGOtQ2 >> 32), (int) (m1080performMeasureDjhGOtQ2 & BodyPartID.bodyIdMax), new AnonymousClass1(measurer2, list, linkedHashMap2, 1));
            case 2:
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                mutableState2.getValue();
                long m1080performMeasureDjhGOtQ3 = this.$measurer.m1080performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), this.$constraintSet, list, linkedHashMap3);
                mutableState.getValue();
                return MeasureScope.layout$default(measureScope, (int) (m1080performMeasureDjhGOtQ3 >> 32), (int) (m1080performMeasureDjhGOtQ3 & BodyPartID.bodyIdMax), new AnonymousClass1(measurer2, list, linkedHashMap3, 2));
            case 3:
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                mutableState2.getValue();
                long m1080performMeasureDjhGOtQ4 = this.$measurer.m1080performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), this.$constraintSet, list, linkedHashMap4);
                mutableState.getValue();
                return MeasureScope.layout$default(measureScope, (int) (m1080performMeasureDjhGOtQ4 >> 32), (int) (m1080performMeasureDjhGOtQ4 & BodyPartID.bodyIdMax), new AnonymousClass1(measurer2, list, linkedHashMap4, 3));
            case 4:
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                mutableState2.getValue();
                long m1080performMeasureDjhGOtQ5 = this.$measurer.m1080performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), this.$constraintSet, list, linkedHashMap5);
                mutableState.getValue();
                return MeasureScope.layout$default(measureScope, (int) (m1080performMeasureDjhGOtQ5 >> 32), (int) (m1080performMeasureDjhGOtQ5 & BodyPartID.bodyIdMax), new AnonymousClass1(measurer2, list, linkedHashMap5, 4));
            case 5:
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                mutableState2.getValue();
                long m1080performMeasureDjhGOtQ6 = this.$measurer.m1080performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), this.$constraintSet, list, linkedHashMap6);
                mutableState.getValue();
                return MeasureScope.layout$default(measureScope, (int) (m1080performMeasureDjhGOtQ6 >> 32), (int) (m1080performMeasureDjhGOtQ6 & BodyPartID.bodyIdMax), new AnonymousClass1(measurer2, list, linkedHashMap6, 5));
            case 6:
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                mutableState2.getValue();
                long m1080performMeasureDjhGOtQ7 = this.$measurer.m1080performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), this.$constraintSet, list, linkedHashMap7);
                mutableState.getValue();
                return MeasureScope.layout$default(measureScope, (int) (m1080performMeasureDjhGOtQ7 >> 32), (int) (m1080performMeasureDjhGOtQ7 & BodyPartID.bodyIdMax), new AnonymousClass1(measurer2, list, linkedHashMap7, 6));
            default:
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                mutableState2.getValue();
                long m1080performMeasureDjhGOtQ8 = this.$measurer.m1080performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), this.$constraintSet, list, linkedHashMap8);
                mutableState.getValue();
                return MeasureScope.layout$default(measureScope, (int) (m1080performMeasureDjhGOtQ8 >> 32), (int) (m1080performMeasureDjhGOtQ8 & BodyPartID.bodyIdMax), new AnonymousClass1(measurer2, list, linkedHashMap8, 7));
        }
    }
}
