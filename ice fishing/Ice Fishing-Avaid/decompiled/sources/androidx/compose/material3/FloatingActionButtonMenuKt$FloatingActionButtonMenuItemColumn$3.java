package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.HorizontalRuler;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FloatingActionButtonMenu.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$3 implements MeasurePolicy {
    final /* synthetic */ Function0<Integer> $buttonHeight;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ MutableIntState $itemCount$delegate;
    final /* synthetic */ MutableState<Boolean> $itemsNeedVerticalScroll$delegate;
    final /* synthetic */ Ref.ObjectRef<Constraints> $originalConstraints;
    final /* synthetic */ MutableState<Animatable<Integer, AnimationVector1D>> $staggerAnim$delegate;
    final /* synthetic */ Ref.ObjectRef<FiniteAnimationSpec<Integer>> $staggerAnimSpec;

    FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$3(boolean z, Function0<Integer> function0, Ref.ObjectRef<Constraints> objectRef, MutableIntState mutableIntState, MutableState<Animatable<Integer, AnimationVector1D>> mutableState, CoroutineScope coroutineScope, Ref.ObjectRef<FiniteAnimationSpec<Integer>> objectRef2, MutableState<Boolean> mutableState2, Alignment.Horizontal horizontal) {
        this.$expanded = z;
        this.$buttonHeight = function0;
        this.$originalConstraints = objectRef;
        this.$itemCount$delegate = mutableIntState;
        this.$staggerAnim$delegate = mutableState;
        this.$coroutineScope = coroutineScope;
        this.$staggerAnimSpec = objectRef2;
        this.$itemsNeedVerticalScroll$delegate = mutableState2;
        this.$horizontalAlignment = horizontal;
    }

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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v21 */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo81measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Animatable FloatingActionButtonMenuItemColumn$lambda$7;
        float f;
        int i;
        int i2;
        boolean isVisible;
        int FloatingActionButtonMenuItemColumn$lambda$1;
        Animatable FloatingActionButtonMenuItemColumn$lambda$72;
        float f2;
        float f3;
        this.$itemCount$delegate.setIntValue(list.size());
        int FloatingActionButtonMenuItemColumn$lambda$12 = this.$expanded ? FloatingActionButtonMenuKt.FloatingActionButtonMenuItemColumn$lambda$1(this.$itemCount$delegate) : 0;
        MutableState<Animatable<Integer, AnimationVector1D>> mutableState = this.$staggerAnim$delegate;
        FloatingActionButtonMenuItemColumn$lambda$7 = FloatingActionButtonMenuKt.FloatingActionButtonMenuItemColumn$lambda$7(mutableState);
        Placeable placeable = null;
        if (FloatingActionButtonMenuItemColumn$lambda$7 != null) {
            CoroutineScope coroutineScope = this.$coroutineScope;
            Ref.ObjectRef<FiniteAnimationSpec<Integer>> objectRef = this.$staggerAnimSpec;
            if (((Number) FloatingActionButtonMenuItemColumn$lambda$7.getTargetValue()).intValue() != FloatingActionButtonMenuItemColumn$lambda$12) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$3$1$1(FloatingActionButtonMenuItemColumn$lambda$7, FloatingActionButtonMenuItemColumn$lambda$12, objectRef, null), 3, null);
            }
        } else {
            FloatingActionButtonMenuItemColumn$lambda$7 = new Animatable(Integer.valueOf(FloatingActionButtonMenuItemColumn$lambda$12), VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), null, null, 12, null);
        }
        mutableState.setValue(FloatingActionButtonMenuItemColumn$lambda$7);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(list.get(i3).mo8285measureBRTryo0(j));
        }
        final ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            ?? r3 = arrayList2.get(0);
            int width = ((Placeable) r3).getWidth();
            int lastIndex = CollectionsKt.getLastIndex(arrayList2);
            if (1 <= lastIndex) {
                int i4 = 1;
                boolean z = r3;
                while (true) {
                    Object obj = arrayList2.get(i4);
                    int width2 = ((Placeable) obj).getWidth();
                    r3 = z;
                    if (width < width2) {
                        r3 = obj;
                        width = width2;
                    }
                    if (i4 == lastIndex) {
                        break;
                    }
                    i4++;
                    z = r3;
                }
            }
            placeable = r3;
        }
        Placeable placeable2 = placeable;
        int width3 = placeable2 != null ? placeable2.getWidth() : 0;
        f = FloatingActionButtonMenuKt.FabMenuItemSpacingVertical;
        final int i5 = measureScope.mo522roundToPx0680j_4(f);
        ArrayList arrayList3 = arrayList2;
        int size2 = !arrayList3.isEmpty() ? (arrayList2.size() - 1) * i5 : 0;
        int intValue = this.$buttonHeight.invoke().intValue();
        if (intValue > 0) {
            f2 = FloatingActionButtonMenuKt.FabMenuButtonPaddingBottom;
            int i6 = intValue + measureScope.mo522roundToPx0680j_4(f2);
            f3 = FloatingActionButtonMenuKt.FabMenuPaddingBottom;
            i = i6 + measureScope.mo522roundToPx0680j_4(f3);
        } else {
            i = 0;
        }
        int size3 = arrayList3.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size3; i8++) {
            i7 += ((Placeable) arrayList2.get(i8)).getHeight();
        }
        final int i9 = i7 + size2 + i;
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = i;
        MutableIntState mutableIntState = this.$itemCount$delegate;
        MutableState<Animatable<Integer, AnimationVector1D>> mutableState2 = this.$staggerAnim$delegate;
        int size4 = arrayList3.size();
        for (int i10 = 0; i10 < size4; i10++) {
            Placeable placeable3 = (Placeable) arrayList2.get(i10);
            FloatingActionButtonMenuItemColumn$lambda$1 = FloatingActionButtonMenuKt.FloatingActionButtonMenuItemColumn$lambda$1(mutableIntState);
            FloatingActionButtonMenuItemColumn$lambda$72 = FloatingActionButtonMenuKt.FloatingActionButtonMenuItemColumn$lambda$7(mutableState2);
            if (i10 >= FloatingActionButtonMenuItemColumn$lambda$1 - (FloatingActionButtonMenuItemColumn$lambda$72 != null ? ((Number) FloatingActionButtonMenuItemColumn$lambda$72.getValue()).intValue() : 0)) {
                floatRef.element += placeable3.getHeight();
                if (i10 < arrayList2.size() - 1) {
                    floatRef.element += i5;
                }
            }
        }
        int size5 = arrayList3.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size5) {
                i2 = 0;
                break;
            }
            isVisible = FloatingActionButtonMenuKt.isVisible((Placeable) arrayList2.get(i11));
            if (isVisible) {
                i2 = i9;
                break;
            }
            i11++;
        }
        MutableState<Boolean> mutableState3 = this.$itemsNeedVerticalScroll$delegate;
        Constraints constraints = this.$originalConstraints.element;
        Intrinsics.checkNotNull(constraints);
        FloatingActionButtonMenuKt.FloatingActionButtonMenuItemColumn$lambda$5(mutableState3, i2 > Constraints.m9674getMaxHeightimpl(constraints.getValue()));
        Function1 function1 = new Function1() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$3$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit measure_3p2s80s$lambda$6;
                measure_3p2s80s$lambda$6 = FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$3.measure_3p2s80s$lambda$6(i9, floatRef, (RulerScope) obj2);
                return measure_3p2s80s$lambda$6;
            }
        };
        final int i12 = width3;
        final Alignment.Horizontal horizontal = this.$horizontalAlignment;
        return MeasureScope.CC.layout$default(measureScope, i12, i2, null, function1, new Function1() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$3$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit measure_3p2s80s$lambda$7;
                measure_3p2s80s$lambda$7 = FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$3.measure_3p2s80s$lambda$7(arrayList2, horizontal, i12, measureScope, i5, (Placeable.PlacementScope) obj2);
                return measure_3p2s80s$lambda$7;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$6(int i, Ref.FloatRef floatRef, RulerScope rulerScope) {
        HorizontalRuler horizontalRuler;
        horizontalRuler = FloatingActionButtonMenuKt.MenuItemRuler;
        rulerScope.provides(horizontalRuler, i - floatRef.element);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$7(List list, Alignment.Horizontal horizontal, int i, MeasureScope measureScope, int i2, Placeable.PlacementScope placementScope) {
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            Placeable placeable = (Placeable) list.get(i3);
            Placeable.PlacementScope placementScope2 = placementScope;
            Placeable.PlacementScope.place$default(placementScope2, placeable, horizontal.align(placeable.getWidth(), i, measureScope.getLayoutDirection()), i4, 0.0f, 4, null);
            i4 += placeable.getHeight();
            if (i3 < list.size() - 1) {
                i4 += i2;
            }
            i3++;
            placementScope = placementScope2;
        }
        return Unit.INSTANCE;
    }
}
