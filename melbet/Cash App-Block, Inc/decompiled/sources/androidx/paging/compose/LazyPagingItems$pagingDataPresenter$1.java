package androidx.paging.compose;

import android.os.Build;
import android.util.Log;
import androidx.paging.HintHandler;
import androidx.paging.HintReceiver;
import androidx.paging.ItemSnapshotList;
import androidx.paging.LoadStates;
import androidx.paging.PageEvent;
import androidx.paging.PageStore;
import androidx.paging.PagingData;
import androidx.paging.PagingDataPresenter$InitialUiReceiver;
import androidx.paging.PagingDataPresenter$presentNewList$1;
import androidx.paging.SingleRunner$Holder;
import androidx.paging.TransformablePage;
import androidx.paging.UiReceiver;
import androidx.paging.ViewportHint;
import androidx.paging.internal.CopyOnWriteArrayList;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LazyPagingItems$pagingDataPresenter$1 {
    public final SharedFlowImpl _onPagesUpdatedFlow;
    public final HintHandler collectFromRunner;
    public final SingleRunner$Holder combinedLoadStatesCollection;
    public HintReceiver hintReceiver;
    public final StateFlowImpl inGetItem;
    public volatile int lastAccessedIndex;
    public volatile boolean lastAccessedIndexUnfulfilled;
    public final ReadonlyStateFlow loadStateFlow;
    public final CoroutineContext mainContext;
    public final CopyOnWriteArrayList onPagesUpdatedListeners;
    public PageStore pageStore;
    public final /* synthetic */ LazyPagingItems this$0;
    public UiReceiver uiReceiver;

    public LazyPagingItems$pagingDataPresenter$1(LazyPagingItems lazyPagingItems, CoroutineContext coroutineContext, PagingData pagingData) {
        PageStore pageStore;
        PageEvent.Insert insert;
        this.this$0 = lazyPagingItems;
        coroutineContext.getClass();
        this.mainContext = coroutineContext;
        this.uiReceiver = new PagingDataPresenter$InitialUiReceiver();
        PageStore pageStore2 = PageStore.INITIAL;
        PageEvent.Insert insert2 = pagingData != null ? (PageEvent.Insert) pagingData.cachedPageEvent.invoke() : null;
        if (insert2 != null) {
            pageStore = new PageStore(insert2);
        } else {
            pageStore = PageStore.INITIAL;
            pageStore.getClass();
        }
        this.pageStore = pageStore;
        SingleRunner$Holder singleRunner$Holder = new SingleRunner$Holder(1);
        if (pagingData != null && (insert = (PageEvent.Insert) pagingData.cachedPageEvent.invoke()) != null) {
            singleRunner$Holder.set(insert.sourceLoadStates, insert.mediatorLoadStates);
        }
        this.combinedLoadStatesCollection = singleRunner$Holder;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.onPagesUpdatedListeners = copyOnWriteArrayList;
        this.collectFromRunner = new HintHandler(1);
        this.inGetItem = FlowKt.MutableStateFlow(Boolean.FALSE);
        this.loadStateFlow = (ReadonlyStateFlow) singleRunner$Holder.previous;
        this._onPagesUpdatedFlow = FlowKt.MutableSharedFlow(0, 64, BufferOverflow.DROP_OLDEST);
        ((java.util.concurrent.CopyOnWriteArrayList) copyOnWriteArrayList.delegate).add(new Worker$$ExternalSyntheticLambda0(this, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x012b A[Catch: CancellationException -> 0x005d, TryCatch #1 {CancellationException -> 0x005d, blocks: (B:11:0x0054, B:13:0x00c1, B:15:0x00c5, B:17:0x00cc, B:19:0x00d9, B:21:0x00dd, B:22:0x00e3, B:24:0x00f3, B:26:0x00f7, B:27:0x00fd, B:29:0x012b, B:30:0x0145, B:34:0x0153, B:35:0x015b, B:37:0x0161, B:39:0x0165), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0153 A[Catch: CancellationException -> 0x005d, TryCatch #1 {CancellationException -> 0x005d, blocks: (B:11:0x0054, B:13:0x00c1, B:15:0x00c5, B:17:0x00cc, B:19:0x00d9, B:21:0x00dd, B:22:0x00e3, B:24:0x00f3, B:26:0x00f7, B:27:0x00fd, B:29:0x012b, B:30:0x0145, B:34:0x0153, B:35:0x015b, B:37:0x0161, B:39:0x0165), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$presentNewList(LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$1, List list, int i, int i2, boolean z, LoadStates loadStates, LoadStates loadStates2, HintReceiver hintReceiver, ContinuationImpl continuationImpl) {
        PagingDataPresenter$presentNewList$1 pagingDataPresenter$presentNewList$1;
        int i3;
        PageStore pageStore;
        HintReceiver hintReceiver2;
        LoadStates loadStates3;
        LoadStates loadStates4;
        List list2;
        boolean z2;
        HintReceiver hintReceiver3;
        PageStore pageStore2;
        HintReceiver hintReceiver4;
        List list3;
        List list4;
        int i4 = i;
        int i5 = i2;
        lazyPagingItems$pagingDataPresenter$1.getClass();
        if (continuationImpl instanceof PagingDataPresenter$presentNewList$1) {
            pagingDataPresenter$presentNewList$1 = (PagingDataPresenter$presentNewList$1) continuationImpl;
            int i6 = pagingDataPresenter$presentNewList$1.label;
            if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                pagingDataPresenter$presentNewList$1.label = i6 - PKIFailureInfo.systemUnavail;
                Object obj = pagingDataPresenter$presentNewList$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = pagingDataPresenter$presentNewList$1.label;
                if (i3 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (z && loadStates == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set.");
                        return null;
                    }
                    lazyPagingItems$pagingDataPresenter$1.lastAccessedIndexUnfulfilled = false;
                    PageStore pageStore3 = lazyPagingItems$pagingDataPresenter$1.pageStore;
                    HintReceiver hintReceiver5 = lazyPagingItems$pagingDataPresenter$1.hintReceiver;
                    PageStore pageStore4 = new PageStore(i4, i5, list);
                    lazyPagingItems$pagingDataPresenter$1.pageStore.getClass();
                    lazyPagingItems$pagingDataPresenter$1.pageStore = pageStore4;
                    lazyPagingItems$pagingDataPresenter$1.hintReceiver = hintReceiver;
                    try {
                        pagingDataPresenter$presentNewList$1.L$0 = list;
                        pagingDataPresenter$presentNewList$1.L$1 = loadStates;
                        pagingDataPresenter$presentNewList$1.L$2 = loadStates2;
                        pagingDataPresenter$presentNewList$1.L$3 = hintReceiver;
                        pagingDataPresenter$presentNewList$1.L$4 = pageStore3;
                        pagingDataPresenter$presentNewList$1.L$5 = hintReceiver5;
                        pagingDataPresenter$presentNewList$1.L$6 = pageStore4;
                        pagingDataPresenter$presentNewList$1.I$0 = i4;
                        pagingDataPresenter$presentNewList$1.I$1 = i5;
                        pagingDataPresenter$presentNewList$1.Z$0 = z;
                        pagingDataPresenter$presentNewList$1.label = 1;
                        LazyPagingItems lazyPagingItems = lazyPagingItems$pagingDataPresenter$1.this$0;
                        lazyPagingItems.itemSnapshotList$delegate.setValue(lazyPagingItems.pagingDataPresenter.snapshot());
                        if (Unit.INSTANCE == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        loadStates3 = loadStates;
                        hintReceiver2 = hintReceiver5;
                        loadStates4 = loadStates2;
                        list2 = list;
                        z2 = z;
                        hintReceiver3 = hintReceiver;
                        pageStore = pageStore3;
                        pageStore2 = pageStore4;
                    } catch (CancellationException e) {
                        e = e;
                        pageStore = pageStore3;
                        hintReceiver2 = hintReceiver5;
                        lazyPagingItems$pagingDataPresenter$1.pageStore = pageStore;
                        lazyPagingItems$pagingDataPresenter$1.hintReceiver = hintReceiver2;
                        throw e;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = pagingDataPresenter$presentNewList$1.Z$0;
                    int i7 = pagingDataPresenter$presentNewList$1.I$1;
                    int i8 = pagingDataPresenter$presentNewList$1.I$0;
                    pageStore2 = pagingDataPresenter$presentNewList$1.L$6;
                    hintReceiver2 = pagingDataPresenter$presentNewList$1.L$5;
                    pageStore = pagingDataPresenter$presentNewList$1.L$4;
                    hintReceiver3 = pagingDataPresenter$presentNewList$1.L$3;
                    loadStates4 = pagingDataPresenter$presentNewList$1.L$2;
                    loadStates3 = pagingDataPresenter$presentNewList$1.L$1;
                    list2 = pagingDataPresenter$presentNewList$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        i5 = i7;
                        i4 = i8;
                    } catch (CancellationException e2) {
                        e = e2;
                        lazyPagingItems$pagingDataPresenter$1.pageStore = pageStore;
                        lazyPagingItems$pagingDataPresenter$1.hintReceiver = hintReceiver2;
                        throw e;
                    }
                }
                if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                    StringBuilder sb = new StringBuilder("Presenting data (\n                            |   first item: ");
                    TransformablePage transformablePage = (TransformablePage) CollectionsKt.firstOrNull(list2);
                    sb.append((transformablePage != null || (list4 = transformablePage.data) == null) ? null : CollectionsKt.firstOrNull(list4));
                    sb.append("\n                            |   last item: ");
                    TransformablePage transformablePage2 = (TransformablePage) CollectionsKt.lastOrNull(list2);
                    sb.append((transformablePage2 != null || (list3 = transformablePage2.data) == null) ? null : CollectionsKt.lastOrNull(list3));
                    sb.append("\n                            |   placeholdersBefore: ");
                    sb.append(i4);
                    sb.append("\n                            |   placeholdersAfter: ");
                    sb.append(i5);
                    sb.append("\n                            |   hintReceiver: ");
                    sb.append(hintReceiver3);
                    sb.append("\n                            |   sourceLoadStates: ");
                    sb.append(loadStates3);
                    sb.append("\n                        ");
                    String sb2 = sb.toString();
                    if (loadStates4 != null) {
                        sb2 = sb2 + "|   mediatorLoadStates: " + loadStates4 + '\n';
                    }
                    Log.d("Paging", StringsKt__IndentKt.trimMargin$default(sb2.concat("|)")), null);
                }
                if (z2) {
                    SingleRunner$Holder singleRunner$Holder = lazyPagingItems$pagingDataPresenter$1.combinedLoadStatesCollection;
                    loadStates3.getClass();
                    singleRunner$Holder.set(loadStates3, loadStates4);
                }
                if (pageStore2.getSize() == 0 && (hintReceiver4 = lazyPagingItems$pagingDataPresenter$1.hintReceiver) != null) {
                    int i9 = pageStore2.dataCount / 2;
                    hintReceiver4.processHint(new ViewportHint.Initial(i9, i9, pageStore2.getOriginalPageOffsetFirst(), pageStore2.getOriginalPageOffsetLast()));
                }
                return Unit.INSTANCE;
            }
        }
        pagingDataPresenter$presentNewList$1 = new PagingDataPresenter$presentNewList$1(lazyPagingItems$pagingDataPresenter$1, continuationImpl);
        Object obj2 = pagingDataPresenter$presentNewList$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = pagingDataPresenter$presentNewList$1.label;
        if (i3 != 0) {
        }
        if (Build.ID != null) {
            StringBuilder sb3 = new StringBuilder("Presenting data (\n                            |   first item: ");
            TransformablePage transformablePage3 = (TransformablePage) CollectionsKt.firstOrNull(list2);
            sb3.append((transformablePage3 != null || (list4 = transformablePage3.data) == null) ? null : CollectionsKt.firstOrNull(list4));
            sb3.append("\n                            |   last item: ");
            TransformablePage transformablePage22 = (TransformablePage) CollectionsKt.lastOrNull(list2);
            sb3.append((transformablePage22 != null || (list3 = transformablePage22.data) == null) ? null : CollectionsKt.lastOrNull(list3));
            sb3.append("\n                            |   placeholdersBefore: ");
            sb3.append(i4);
            sb3.append("\n                            |   placeholdersAfter: ");
            sb3.append(i5);
            sb3.append("\n                            |   hintReceiver: ");
            sb3.append(hintReceiver3);
            sb3.append("\n                            |   sourceLoadStates: ");
            sb3.append(loadStates3);
            sb3.append("\n                        ");
            String sb22 = sb3.toString();
            if (loadStates4 != null) {
            }
            Log.d("Paging", StringsKt__IndentKt.trimMargin$default(sb22.concat("|)")), null);
        }
        if (z2) {
        }
        if (pageStore2.getSize() == 0) {
            int i92 = pageStore2.dataCount / 2;
            hintReceiver4.processHint(new ViewportHint.Initial(i92, i92, pageStore2.getOriginalPageOffsetFirst(), pageStore2.getOriginalPageOffsetLast()));
        }
        return Unit.INSTANCE;
    }

    public final ItemSnapshotList snapshot() {
        PageStore pageStore = this.pageStore;
        int i = pageStore.placeholdersBefore;
        int i2 = pageStore.placeholdersAfter;
        ArrayList arrayList = pageStore.pages;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(((TransformablePage) it.next()).data, arrayList2);
        }
        return new ItemSnapshotList(arrayList2, i, i2);
    }
}
