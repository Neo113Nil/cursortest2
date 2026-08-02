package androidx.paging.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.paging.LoadState;
import androidx.paging.LoadStates;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public abstract class LazyPagingItemsKt {
    public static final LoadStates InitialLoadStates;

    static {
        LoadState.NotLoading notLoading = new LoadState.NotLoading(false);
        InitialLoadStates = new LoadStates(LoadState.Loading.INSTANCE, notLoading, notLoading);
    }

    public static final LazyPagingItems collectAsLazyPagingItems(Flow flow, Composer composer) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        GapComposer gapComposer = (GapComposer) composer;
        boolean changed = gapComposer.changed(flow);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changed || rememberedValue == neverEqualPolicy) {
            rememberedValue = new LazyPagingItems(flow);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        LazyPagingItems lazyPagingItems = (LazyPagingItems) rememberedValue;
        boolean changedInstance = gapComposer.changedInstance(emptyCoroutineContext) | gapComposer.changedInstance(lazyPagingItems);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new LazyPagingItemsKt$collectAsLazyPagingItems$1$1(emptyCoroutineContext, lazyPagingItems, null, 0);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, lazyPagingItems, (Function2) rememberedValue2);
        boolean changedInstance2 = gapComposer.changedInstance(emptyCoroutineContext) | gapComposer.changedInstance(lazyPagingItems);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new LazyPagingItemsKt$collectAsLazyPagingItems$1$1(emptyCoroutineContext, lazyPagingItems, null, 1);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, lazyPagingItems, (Function2) rememberedValue3);
        return lazyPagingItems;
    }
}
