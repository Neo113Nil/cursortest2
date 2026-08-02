package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.LazyListIntervalContent$$ExternalSyntheticLambda0;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda2;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.squareup.cash.arcade.components.FilterBarKt$$ExternalSyntheticLambda8;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes3.dex */
public final class LazyGridIntervalContent extends LazyLayoutKt {
    public static final SnackbarHostKt$$ExternalSyntheticLambda2 DefaultSpan = new SnackbarHostKt$$ExternalSyntheticLambda2(2);
    public boolean hasCustomSpans;
    public final LazyGridSpanLayoutProvider spanLayoutProvider = new LazyGridSpanLayoutProvider(this);
    public final HuffmanTreeGroup intervals = new HuffmanTreeGroup(4);

    public LazyGridIntervalContent(Function1 function1) {
        function1.invoke(this);
    }

    public static /* synthetic */ void item$default(LazyGridIntervalContent lazyGridIntervalContent, Object obj, Function1 function1, ComposableLambdaImpl composableLambdaImpl, int i) {
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        lazyGridIntervalContent.item(obj, function1, (i & 4) == 0 ? "content_type_item_carousel" : null, composableLambdaImpl);
    }

    public static /* synthetic */ void items$default(LazyGridIntervalContent lazyGridIntervalContent, int i, Function1 function1, OffersStyledTextKt$$ExternalSyntheticLambda0 offersStyledTextKt$$ExternalSyntheticLambda0, ComposableLambdaImpl composableLambdaImpl, int i2) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        Function1 function13 = offersStyledTextKt$$ExternalSyntheticLambda0;
        if ((i2 & 8) != 0) {
            function13 = LazyGridScope$items$1.INSTANCE;
        }
        lazyGridIntervalContent.items(i, function12, null, function13, composableLambdaImpl);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKt
    public final HuffmanTreeGroup getIntervals() {
        return this.intervals;
    }

    public final void item(Object obj, Function1 function1, Object obj2, ComposableLambdaImpl composableLambdaImpl) {
        LazyListIntervalContent$$ExternalSyntheticLambda0 lazyListIntervalContent$$ExternalSyntheticLambda0 = obj != null ? new LazyListIntervalContent$$ExternalSyntheticLambda0(obj, 0) : null;
        int i = 1;
        this.intervals.addInterval(1, new LazyGridInterval(lazyListIntervalContent$$ExternalSyntheticLambda0, function1 != null ? new SwipeToDismissKt$$ExternalSyntheticLambda4(i, function1) : DefaultSpan, new LazyListIntervalContent$$ExternalSyntheticLambda0(obj2, 0), new ComposableLambdaImpl(new FilterBarKt$$ExternalSyntheticLambda8(composableLambdaImpl, i), true, -291643851)));
        if (function1 != null) {
            this.hasCustomSpans = true;
        }
    }

    public final void items(int i, Function1 function1, Function2 function2, Function1 function12, ComposableLambdaImpl composableLambdaImpl) {
        this.intervals.addInterval(i, new LazyGridInterval(function1, function2 == null ? DefaultSpan : function2, function12, composableLambdaImpl));
        if (function2 != null) {
            this.hasCustomSpans = true;
        }
    }
}
