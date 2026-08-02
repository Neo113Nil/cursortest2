package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1;
import androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda14;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.jg$$ExternalSyntheticLambda1;
import coil3.size.SizeKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public abstract class LazyGridStateKt {
    public static final LazyGridMeasureResult EmptyLazyGridLayoutInfo;

    static {
        PagerStateKt$EmptyLayoutInfo$1 pagerStateKt$EmptyLayoutInfo$1 = new PagerStateKt$EmptyLayoutInfo$1(2);
        EmptyList emptyList = EmptyList.INSTANCE;
        Orientation orientation = Orientation.Vertical;
        EmptyLazyGridLayoutInfo = new LazyGridMeasureResult(null, 0, false, RecyclerView.DECELERATION_RATE, pagerStateKt$EmptyLayoutInfo$1, RecyclerView.DECELERATION_RATE, false, JobKt.CoroutineScope(EmptyCoroutineContext.INSTANCE), SizeKt.Density$default(), 0, new BasicTextKt$$ExternalSyntheticLambda14(8), new BasicTextKt$$ExternalSyntheticLambda14(9), emptyList, 0, 0, 0, orientation, 0, 0);
    }

    public static final LazyGridState rememberLazyGridState(int i, int i2, Composer composer) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        WorkLauncherImpl workLauncherImpl = LazyGridState.Saver;
        boolean changed = ((GapComposer) composer).changed(i) | ((GapComposer) composer).changed(0);
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new jg$$ExternalSyntheticLambda1(i, 2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (LazyGridState) SaverKt.m581rememberSaveable(objArr, (Saver) workLauncherImpl, (Function0) rememberedValue, (Composer) gapComposer, 0);
    }
}
