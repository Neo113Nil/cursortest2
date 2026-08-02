package androidx.paging.compose;

import android.os.Build;
import android.util.Log;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.paging.CombinedLoadStates;
import androidx.paging.HintReceiver;
import androidx.paging.ItemSnapshotList;
import androidx.paging.LoadStates;
import androidx.paging.PageStore;
import androidx.paging.PagingData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class LazyPagingItems {
    public final Flow flow;
    public final ParcelableSnapshotMutableState itemSnapshotList$delegate;
    public final ParcelableSnapshotMutableState loadState$delegate;
    public final CoroutineContext mainDispatcher;
    public final LazyPagingItems$pagingDataPresenter$1 pagingDataPresenter;

    public LazyPagingItems(Flow flow) {
        this.flow = flow;
        CoroutineContext coroutineContext = UiDispatcher_androidKt.uiDispatcher;
        this.mainDispatcher = coroutineContext;
        LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$1 = new LazyPagingItems$pagingDataPresenter$1(this, coroutineContext, flow instanceof SharedFlow ? (PagingData) CollectionsKt.firstOrNull(((SharedFlow) flow).getReplayCache()) : null);
        this.pagingDataPresenter = lazyPagingItems$pagingDataPresenter$1;
        this.itemSnapshotList$delegate = Updater.mutableStateOf$default(lazyPagingItems$pagingDataPresenter$1.snapshot());
        CombinedLoadStates combinedLoadStates = (CombinedLoadStates) lazyPagingItems$pagingDataPresenter$1.loadStateFlow.$$delegate_0.getValue();
        if (combinedLoadStates == null) {
            LoadStates loadStates = LazyPagingItemsKt.InitialLoadStates;
            combinedLoadStates = new CombinedLoadStates(loadStates.refresh, loadStates.prepend, loadStates.append, loadStates, null);
        }
        this.loadState$delegate = Updater.mutableStateOf$default(combinedLoadStates);
    }

    public final Object collectLoadState$paging_compose(SuspendLambda suspendLambda) {
        Object collect = this.pagingDataPresenter.loadStateFlow.$$delegate_0.collect(new FlowKt__MergeKt$flattenConcat$1$1(new LazyPagingItems$collectLoadState$2(this, 0), 16), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (collect != coroutineSingletons) {
            collect = Unit.INSTANCE;
        }
        return collect == coroutineSingletons ? collect : Unit.INSTANCE;
    }

    public final Object get(int i) {
        Object value;
        Object value2;
        LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$1 = this.pagingDataPresenter;
        StateFlowImpl stateFlowImpl = lazyPagingItems$pagingDataPresenter$1.inGetItem;
        do {
            value = stateFlowImpl.getValue();
            ((Boolean) value).getClass();
        } while (!stateFlowImpl.compareAndSet(value, Boolean.TRUE));
        lazyPagingItems$pagingDataPresenter$1.lastAccessedIndexUnfulfilled = true;
        lazyPagingItems$pagingDataPresenter$1.lastAccessedIndex = i;
        if (Build.ID != null && Log.isLoggable("Paging", 2)) {
            Log.v("Paging", "Accessing item index[" + i + ']', null);
        }
        HintReceiver hintReceiver = lazyPagingItems$pagingDataPresenter$1.hintReceiver;
        if (hintReceiver != null) {
            hintReceiver.processHint(lazyPagingItems$pagingDataPresenter$1.pageStore.createAccessHintForIndex(i));
        }
        PageStore pageStore = lazyPagingItems$pagingDataPresenter$1.pageStore;
        if (i < 0) {
            pageStore.getClass();
        } else if (i < pageStore.getSize()) {
            int i2 = i - pageStore.placeholdersBefore;
            if (i2 >= 0 && i2 < pageStore.dataCount) {
                pageStore.getItem(i2);
            }
            StateFlowImpl stateFlowImpl2 = lazyPagingItems$pagingDataPresenter$1.inGetItem;
            do {
                value2 = stateFlowImpl2.getValue();
                ((Boolean) value2).getClass();
            } while (!stateFlowImpl2.compareAndSet(value2, Boolean.FALSE));
            return ((ItemSnapshotList) this.itemSnapshotList$delegate.getValue()).get(i);
        }
        Path$$ExternalSyntheticBUOutline0.m(pageStore.getSize(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Index: ", ", Size: "));
        return null;
    }
}
