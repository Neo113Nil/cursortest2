package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: NavigationItem.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\"\u0010'\u001a\u00020(*\u00020)2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020*0!2\u0006\u0010+\u001a\u00020(H\u0016R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u00020\u000b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u00020\u000b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\r\u001a\u00020\u000b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001c\u0010\u0019¨\u0006,"}, d2 = {"Landroidx/compose/material3/AnimatedMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "iconPosition", "Landroidx/compose/material3/NavigationItemIconPosition;", "iconPositionProgress", "Lkotlin/Function0;", "", "indicatorAnimationProgress", "indicatorPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "topIconIndicatorToLabelVerticalPadding", "Landroidx/compose/ui/unit/Dp;", "startIconToLabelHorizontalPadding", "itemHorizontalPadding", "<init>", "(ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIconPosition--xw1Ddg", "()I", "I", "getIconPositionProgress", "()Lkotlin/jvm/functions/Function0;", "getIndicatorAnimationProgress", "getIndicatorPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "getTopIconIndicatorToLabelVerticalPadding-D9Ej5fM", "()F", "F", "getStartIconToLabelHorizontalPadding-D9Ej5fM", "getItemHorizontalPadding-D9Ej5fM", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "maxIntrinsicWidth", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class AnimatedMeasurePolicy implements MeasurePolicy {
    private final int iconPosition;
    private final Function0<Float> iconPositionProgress;
    private final Function0<Float> indicatorAnimationProgress;
    private final PaddingValues indicatorPadding;
    private final float itemHorizontalPadding;
    private final float startIconToLabelHorizontalPadding;
    private final float topIconIndicatorToLabelVerticalPadding;

    public /* synthetic */ AnimatedMeasurePolicy(int i, Function0 function0, Function0 function02, PaddingValues paddingValues, float f, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, function0, function02, paddingValues, f, f2, f3);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i);
    }

    private AnimatedMeasurePolicy(int i, Function0<Float> function0, Function0<Float> function02, PaddingValues paddingValues, float f, float f2, float f3) {
        this.iconPosition = i;
        this.iconPositionProgress = function0;
        this.indicatorAnimationProgress = function02;
        this.indicatorPadding = paddingValues;
        this.topIconIndicatorToLabelVerticalPadding = f;
        this.startIconToLabelHorizontalPadding = f2;
        this.itemHorizontalPadding = f3;
    }

    /* renamed from: getIconPosition--xw1Ddg, reason: not valid java name and from getter */
    public final int getIconPosition() {
        return this.iconPosition;
    }

    public final Function0<Float> getIconPositionProgress() {
        return this.iconPositionProgress;
    }

    public final Function0<Float> getIndicatorAnimationProgress() {
        return this.indicatorAnimationProgress;
    }

    public final PaddingValues getIndicatorPadding() {
        return this.indicatorPadding;
    }

    /* renamed from: getTopIconIndicatorToLabelVerticalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTopIconIndicatorToLabelVerticalPadding() {
        return this.topIconIndicatorToLabelVerticalPadding;
    }

    /* renamed from: getStartIconToLabelHorizontalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStartIconToLabelHorizontalPadding() {
        return this.startIconToLabelHorizontalPadding;
    }

    /* renamed from: getItemHorizontalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getItemHorizontalPadding() {
        return this.itemHorizontalPadding;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo81measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        MeasureResult m3673placeAnimatedLabelAndIconPXWvyXQ;
        MeasureScope measureScope2 = measureScope;
        float floatValue = this.indicatorAnimationProgress.invoke().floatValue();
        float floatValue2 = this.iconPositionProgress.invoke().floatValue();
        long m9665copyZbe2FdA$default = Constraints.m9665copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        int i = 0;
        while (i < size) {
            Measurable measurable = list.get(i);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "icon")) {
                Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(m9665copyZbe2FdA$default);
                int size2 = list2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Measurable measurable2 = list.get(i2);
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "label")) {
                        Placeable mo8285measureBRTryo02 = measurable2.mo8285measureBRTryo0(m9665copyZbe2FdA$default);
                        PaddingValues paddingValues = this.indicatorPadding;
                        if (paddingValues instanceof DynamicPaddingValues) {
                            ((DynamicPaddingValues) paddingValues).setProgress(floatValue2);
                        }
                        float m9732constructorimpl = Dp.m9732constructorimpl(PaddingKt.calculateStartPadding(this.indicatorPadding, measureScope2.getLayoutDirection()) + PaddingKt.calculateEndPadding(this.indicatorPadding, measureScope2.getLayoutDirection()));
                        float m9732constructorimpl2 = Dp.m9732constructorimpl(this.indicatorPadding.getTop() + this.indicatorPadding.getBottom());
                        int width = mo8285measureBRTryo0.getWidth();
                        int height = mo8285measureBRTryo0.getHeight();
                        int width2 = mo8285measureBRTryo0.getWidth() + mo8285measureBRTryo02.getWidth() + measureScope2.mo522roundToPx0680j_4(this.startIconToLabelHorizontalPadding);
                        int max = Math.max(mo8285measureBRTryo0.getHeight(), mo8285measureBRTryo02.getHeight());
                        int lerp = MathHelpersKt.lerp(width, width2, floatValue2) + measureScope2.mo522roundToPx0680j_4(m9732constructorimpl);
                        int roundToInt = MathKt.roundToInt(lerp * floatValue);
                        int lerp2 = MathHelpersKt.lerp(height, max, floatValue2) + measureScope2.mo522roundToPx0680j_4(m9732constructorimpl2);
                        int size3 = list2.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            Measurable measurable3 = list.get(i3);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                Placeable mo8285measureBRTryo03 = measurable3.mo8285measureBRTryo0(ConstraintsKt.m9690constrainN9IONVI(m9665copyZbe2FdA$default, Constraints.INSTANCE.m9685fixedJhjzzOo(lerp, lerp2)));
                                int size4 = list2.size();
                                int i4 = 0;
                                while (i4 < size4) {
                                    Measurable measurable4 = list.get(i4);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), "indicator")) {
                                        Placeable placeable = mo8285measureBRTryo0;
                                        Placeable placeable2 = mo8285measureBRTryo03;
                                        m3673placeAnimatedLabelAndIconPXWvyXQ = NavigationItemKt.m3673placeAnimatedLabelAndIconPXWvyXQ(measureScope, this.iconPosition, this.iconPositionProgress, mo8285measureBRTryo02, placeable, placeable2, measurable4.mo8285measureBRTryo0(ConstraintsKt.m9690constrainN9IONVI(m9665copyZbe2FdA$default, Constraints.INSTANCE.m9685fixedJhjzzOo(roundToInt, lerp2))), width, m9665copyZbe2FdA$default, this.topIconIndicatorToLabelVerticalPadding, this.indicatorPadding, this.startIconToLabelHorizontalPadding, this.itemHorizontalPadding);
                                        return m3673placeAnimatedLabelAndIconPXWvyXQ;
                                    }
                                    i4++;
                                    mo8285measureBRTryo0 = mo8285measureBRTryo0;
                                    mo8285measureBRTryo03 = mo8285measureBRTryo03;
                                }
                                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                                throw new KotlinNothingValueException();
                            }
                        }
                        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                        throw new KotlinNothingValueException();
                    }
                    i2++;
                    measureScope2 = measureScope;
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            i++;
            measureScope2 = measureScope;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        List<? extends IntrinsicMeasurable> list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i2);
            if (Intrinsics.areEqual(LayoutUtilKt.getLayoutId(intrinsicMeasurable), "icon")) {
                int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i);
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = list.get(i3);
                    if (Intrinsics.areEqual(LayoutUtilKt.getLayoutId(intrinsicMeasurable2), "label")) {
                        int maxIntrinsicWidth2 = intrinsicMeasurable2.maxIntrinsicWidth(i);
                        int i4 = intrinsicMeasureScope.mo522roundToPx0680j_4(Dp.m9732constructorimpl(PaddingKt.calculateStartPadding(this.indicatorPadding, intrinsicMeasureScope.getLayoutDirection()) + PaddingKt.calculateEndPadding(this.indicatorPadding, intrinsicMeasureScope.getLayoutDirection())));
                        if (NavigationItemIconPosition.m3653equalsimpl0(this.iconPosition, NavigationItemIconPosition.INSTANCE.m3658getTopxw1Ddg())) {
                            return Math.max(maxIntrinsicWidth2, maxIntrinsicWidth + i4 + intrinsicMeasureScope.mo522roundToPx0680j_4(Dp.m9732constructorimpl(this.itemHorizontalPadding * 2)));
                        }
                        return maxIntrinsicWidth + maxIntrinsicWidth2 + i4 + intrinsicMeasureScope.mo522roundToPx0680j_4(Dp.m9732constructorimpl(this.startIconToLabelHorizontalPadding + this.itemHorizontalPadding));
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
