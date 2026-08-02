package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.jg$$ExternalSyntheticLambda1;
import coil3.size.SizeKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public abstract class LazyListStateKt {
    public static final LazyListMeasureResult EmptyLazyListMeasureResult = new LazyListMeasureResult(null, 0, false, RecyclerView.DECELERATION_RATE, new PagerStateKt$EmptyLayoutInfo$1(1), RecyclerView.DECELERATION_RATE, false, JobKt.CoroutineScope(EmptyCoroutineContext.INSTANCE), SizeKt.Density$default(), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15), EmptyList.INSTANCE, 0, 0, 0, Orientation.Vertical, 0, 0);

    public static final LazyListState rememberLazyListState(int i, int i2, Composer composer) {
        int i3 = 1;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        WorkLauncherImpl workLauncherImpl = LazyListState.Saver;
        boolean changed = ((GapComposer) composer).changed(i) | ((GapComposer) composer).changed(0);
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new jg$$ExternalSyntheticLambda1(i, i3);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (LazyListState) SaverKt.m581rememberSaveable(objArr, (Saver) workLauncherImpl, (Function0) rememberedValue, (Composer) gapComposer, 0);
    }
}
