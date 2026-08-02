package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition$Start;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class PagerStateKt {
    public static final PagerMeasureResult EmptyLayoutInfo;
    public static final PagerStateKt$UnitDensity$1 UnitDensity;

    static {
        PagerStateKt$UnitDensity$1 pagerStateKt$UnitDensity$1 = new PagerStateKt$UnitDensity$1();
        UnitDensity = pagerStateKt$UnitDensity$1;
        EmptyLayoutInfo = new PagerMeasureResult(EmptyList.INSTANCE, 0, 0, 0, Orientation.Horizontal, 0, 0, 0, SnapPosition$Start.INSTANCE, new PagerStateKt$EmptyLayoutInfo$1(0), JobKt.CoroutineScope(EmptyCoroutineContext.INSTANCE), pagerStateKt$UnitDensity$1, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15));
    }

    public static final long calculateNewMaxScrollOffset(PagerMeasureResult pagerMeasureResult, int i) {
        int i2 = pagerMeasureResult.pageSpacing;
        int i3 = pagerMeasureResult.pageSize;
        long j = i * (i2 + i3);
        int i4 = -pagerMeasureResult.viewportStartOffset;
        long j2 = ((j + i4) + pagerMeasureResult.afterContentPadding) - i2;
        int m332getViewportSizeYbymL2g = (int) (pagerMeasureResult.orientation == Orientation.Horizontal ? pagerMeasureResult.m332getViewportSizeYbymL2g() >> 32 : pagerMeasureResult.m332getViewportSizeYbymL2g() & BodyPartID.bodyIdMax);
        long coerceIn = j2 - (m332getViewportSizeYbymL2g - RangesKt___RangesKt.coerceIn(pagerMeasureResult.snapPosition.position(m332getViewportSizeYbymL2g, i3, i4, r2), 0, m332getViewportSizeYbymL2g));
        if (coerceIn < 0) {
            return 0L;
        }
        return coerceIn;
    }

    public static final DefaultPagerState rememberPagerState(final int i, final Function0 function0, Composer composer, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        WorkLauncherImpl workLauncherImpl = DefaultPagerState.Saver;
        boolean z2 = (((i2 & 14) ^ 6) > 4 && ((GapComposer) composer).changed(i)) || (i2 & 6) == 4;
        int i4 = (i2 & 112) ^ 48;
        final float f = RecyclerView.DECELERATION_RATE;
        boolean z3 = z2 | ((i4 > 32 && ((GapComposer) composer).changed(RecyclerView.DECELERATION_RATE)) || (i2 & 48) == 32);
        if ((((i2 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 || !((GapComposer) composer).changed(function0)) && (i2 & MLKEMEngine.KyberPolyBytes) != 256) {
            z = false;
        }
        boolean z4 = z3 | z;
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (z4 || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new Function0() { // from class: androidx.compose.foundation.pager.PagerStateKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new DefaultPagerState(i, f, function0);
                }
            };
            gapComposer.updateRememberedValue(rememberedValue);
        }
        DefaultPagerState defaultPagerState = (DefaultPagerState) SaverKt.m581rememberSaveable(objArr, (Saver) workLauncherImpl, (Function0) rememberedValue, (Composer) gapComposer, 0);
        defaultPagerState.pageCountState.setValue(function0);
        return defaultPagerState;
    }
}
