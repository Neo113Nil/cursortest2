package androidx.paging;

import android.os.Build;
import android.util.Log;
import androidx.compose.material3.SliderState$drag$2;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.emoji2.text.MetadataRepo;
import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import androidx.paging.PageFetcherSnapshotState;
import androidx.paging.PagingSource;
import androidx.paging.ViewportHint;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class PageFetcherSnapshot {
    public final PagingConfig config;
    public final HintHandler hintHandler;
    public final Object initialKey;
    public final int initialLoadSize;
    public final Function0 jumpCallback;
    public final BufferedChannel pageEventCh;
    public final AtomicBoolean pageEventChCollected;
    public final JobImpl pageEventChannelFlowJob;
    public final FlowKt__MergeKt$flatMapConcat$$inlined$map$1 pageEventFlow;
    public final PagingSource pagingSource;
    public final Flow retryFlow;
    public final PageFetcherSnapshotState.Holder stateHolder;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                LoadType loadType = LoadType.REFRESH;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LoadType loadType2 = LoadType.REFRESH;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LoadType loadType3 = LoadType.REFRESH;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PageFetcherSnapshot(Object obj, PagingSource pagingSource, PagingConfig pagingConfig, CachedPagingDataKt$cachedIn$$inlined$map$1 cachedPagingDataKt$cachedIn$$inlined$map$1, int i, PagingState pagingState, Function0 function0) {
        pagingSource.getClass();
        cachedPagingDataKt$cachedIn$$inlined$map$1.getClass();
        this.initialKey = obj;
        this.pagingSource = pagingSource;
        this.config = pagingConfig;
        this.retryFlow = cachedPagingDataKt$cachedIn$$inlined$map$1;
        this.initialLoadSize = i;
        this.jumpCallback = function0;
        this.hintHandler = new HintHandler(0);
        this.pageEventChCollected = new AtomicBoolean(false);
        Continuation continuation = null;
        this.pageEventCh = PapaEvent.Channel$default(-2, null, null, 6);
        this.stateHolder = new PageFetcherSnapshotState.Holder(pagingConfig);
        JobImpl Job$default = JobKt.Job$default();
        this.pageEventChannelFlowJob = Job$default;
        this.pageEventFlow = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new FlowExtKt$simpleScan$1(this, continuation, 26), FlowExtKt.simpleChannelFlow(new SliderState$drag$2(Job$default, new FlowExtKt$simpleScan$1(this, continuation, 25), continuation, 8)));
    }

    public static final Object access$collectAsGenerationalViewportHints(PageFetcherSnapshot pageFetcherSnapshot, FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1, LoadType loadType, SuspendLambda suspendLambda) {
        pageFetcherSnapshot.getClass();
        Continuation continuation = null;
        int i = 1;
        Flow simpleChannelFlow = FlowExtKt.simpleChannelFlow(new FlowExtKt$simpleRunningReduce$1(flowKt__MergeKt$flatMapConcat$$inlined$map$1, new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(null, pageFetcherSnapshot, loadType), continuation, i));
        CardModelView$getActiveHeat$2$2 cardModelView$getActiveHeat$2$2 = new CardModelView$getActiveHeat$2$2(loadType, continuation, i);
        simpleChannelFlow.getClass();
        Object collect = FlowKt.buffer$default(new SafeFlow(new FlowExtKt$simpleRunningReduce$1(simpleChannelFlow, cardModelView$getActiveHeat$2$2, continuation, 0)), -1, 2).collect(new ThumbNode$onAttach$1.AnonymousClass1(8, pageFetcherSnapshot, loadType), suspendLambda);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0330, code lost:
    
        r3 = r11;
        r9 = r12;
        r10 = r14;
        r12 = r15;
        r5 = r19;
        r14 = r0;
        r15 = r2;
        r0 = r4;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0302 A[Catch: all -> 0x0320, TRY_LEAVE, TryCatch #0 {all -> 0x0320, blocks: (B:183:0x02ea, B:185:0x0302), top: B:182:0x02ea }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04d3 A[Catch: all -> 0x04e2, TryCatch #1 {all -> 0x04e2, blocks: (B:73:0x04ab, B:74:0x04bc, B:76:0x04d3, B:78:0x04db, B:80:0x04df, B:81:0x04e8, B:82:0x04e6, B:83:0x04eb), top: B:72:0x04ab }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04df A[Catch: all -> 0x04e2, TryCatch #1 {all -> 0x04e2, blocks: (B:73:0x04ab, B:74:0x04bc, B:76:0x04d3, B:78:0x04db, B:80:0x04df, B:81:0x04e8, B:82:0x04e6, B:83:0x04eb), top: B:72:0x04ab }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04e6 A[Catch: all -> 0x04e2, TryCatch #1 {all -> 0x04e2, blocks: (B:73:0x04ab, B:74:0x04bc, B:76:0x04d3, B:78:0x04db, B:80:0x04df, B:81:0x04e8, B:82:0x04e6, B:83:0x04eb), top: B:72:0x04ab }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /* JADX WARN: Type inference failed for: r11v15, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.paging.LoadType] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v39, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v43, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r4v17, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v33, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r9v14, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r9v19, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$doLoad(PageFetcherSnapshot pageFetcherSnapshot, LoadType loadType, GenerationalViewportHint generationalViewportHint, Continuation continuation) {
        PageFetcherSnapshot$doLoad$1 pageFetcherSnapshot$doLoad$1;
        Ref$IntRef ref$IntRef;
        GenerationalViewportHint generationalViewportHint2;
        int i;
        LoadType loadType2;
        Mutex mutex;
        PageFetcherSnapshotState.Holder holder;
        int ordinal;
        Ref$ObjectRef ref$ObjectRef;
        MutexImpl mutexImpl;
        Ref$IntRef ref$IntRef2;
        LoadType loadType3;
        Ref$ObjectRef ref$ObjectRef2;
        GenerationalViewportHint generationalViewportHint3;
        PageFetcherSnapshotState.Holder holder2;
        ?? r9;
        String str;
        Object nextLoadKeyOrNull;
        Object obj;
        MutexImpl mutexImpl2;
        Ref$BooleanRef ref$BooleanRef;
        GenerationalViewportHint generationalViewportHint4;
        PagingSource.LoadParams loadParams;
        LoadType loadType4;
        Ref$ObjectRef ref$ObjectRef3;
        Object obj2;
        Ref$IntRef ref$IntRef3;
        PageFetcherSnapshotState.Holder holder3;
        PagingSource.LoadResult loadResult;
        Ref$BooleanRef ref$BooleanRef2;
        LoadType loadType5;
        GenerationalViewportHint generationalViewportHint5;
        PagingSource.LoadParams loadParams2;
        Mutex mutex2;
        PagingSource.LoadResult loadResult2;
        LoadType loadType6;
        PageFetcherSnapshotState pageFetcherSnapshotState;
        GenerationalViewportHint generationalViewportHint6;
        LoadType loadType7;
        Object obj3;
        BufferedChannel bufferedChannel;
        PageFetcherSnapshotState.Holder holder4;
        PagingSource pagingSource;
        MutexImpl mutexImpl3;
        PagingSource.LoadParams loadParams3;
        MutexImpl mutexImpl4;
        GenerationalViewportHint generationalViewportHint7;
        PageFetcherSnapshotState pageFetcherSnapshotState2;
        PageFetcherSnapshot pageFetcherSnapshot2;
        Object obj4;
        MutexImpl mutexImpl5;
        BufferedChannel bufferedChannel2;
        Object obj5;
        Mutex mutex3;
        PageFetcherSnapshotState pageFetcherSnapshotState3;
        LoadState.Error error;
        Object obj6;
        Object nextLoadKeyOrNull2;
        SingleRunner$Holder singleRunner$Holder;
        PageEvent.Insert pageEvent$paging_common;
        ?? r11;
        PagingSource.LoadResult loadResult3;
        Object obj7;
        Object obj8;
        Object obj9;
        boolean z;
        boolean z2;
        PageFetcherSnapshot pageFetcherSnapshot3 = pageFetcherSnapshot;
        ?? r1 = loadType;
        BufferedChannel bufferedChannel3 = pageFetcherSnapshot3.pageEventCh;
        int i2 = pageFetcherSnapshot3.config.pageSize;
        PagingSource pagingSource2 = pageFetcherSnapshot3.pagingSource;
        PageFetcherSnapshotState.Holder holder5 = pageFetcherSnapshot3.stateHolder;
        try {
            if (continuation instanceof PageFetcherSnapshot$doLoad$1) {
                pageFetcherSnapshot$doLoad$1 = (PageFetcherSnapshot$doLoad$1) continuation;
                int i3 = pageFetcherSnapshot$doLoad$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    pageFetcherSnapshot$doLoad$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj10 = pageFetcherSnapshot$doLoad$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    switch (pageFetcherSnapshot$doLoad$1.label) {
                        case 0:
                            SafeTrace.throwOnFailure(obj10);
                            if (r1 == LoadType.REFRESH) {
                                a$$ExternalSyntheticBUOutline0.m$3("Use doInitialLoad for LoadType == REFRESH");
                                return null;
                            }
                            ref$IntRef = new Ref$IntRef();
                            MutexImpl mutexImpl6 = holder5.lock;
                            pageFetcherSnapshot$doLoad$1.L$0 = r1;
                            generationalViewportHint2 = generationalViewportHint;
                            pageFetcherSnapshot$doLoad$1.L$1 = generationalViewportHint2;
                            pageFetcherSnapshot$doLoad$1.L$2 = ref$IntRef;
                            pageFetcherSnapshot$doLoad$1.L$3 = holder5;
                            pageFetcherSnapshot$doLoad$1.L$4 = mutexImpl6;
                            i = 1;
                            pageFetcherSnapshot$doLoad$1.label = 1;
                            if (mutexImpl6.lock(pageFetcherSnapshot$doLoad$1) != coroutineSingletons) {
                                loadType2 = r1;
                                mutex = mutexImpl6;
                                holder = holder5;
                                try {
                                    PageFetcherSnapshotState pageFetcherSnapshotState4 = holder.state;
                                    ordinal = loadType2.ordinal();
                                    if (ordinal != 0) {
                                        throw new IllegalStateException("Use doInitialLoad for LoadType == REFRESH");
                                    }
                                    if (ordinal == i) {
                                        int i4 = pageFetcherSnapshotState4.initialPageIndex;
                                        ArrayList arrayList = pageFetcherSnapshotState4.pages;
                                        int i5 = (i4 + generationalViewportHint2.hint.originalPageOffsetFirst) - 1;
                                        if (i5 > CollectionsKt__CollectionsKt.getLastIndex(arrayList)) {
                                            ref$IntRef.element = ((i5 - (arrayList.size() - 1)) * i2) + ref$IntRef.element;
                                            i5 = arrayList.size() - 1;
                                        }
                                        if (i5 >= 0) {
                                            int i6 = 0;
                                            while (true) {
                                                ArrayList arrayList2 = arrayList;
                                                ref$IntRef.element += ((PagingSource.LoadResult.Page) arrayList.get(i6)).data.size();
                                                if (i6 != i5) {
                                                    i6++;
                                                    arrayList = arrayList2;
                                                }
                                            }
                                        }
                                    } else {
                                        if (ordinal != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i7 = pageFetcherSnapshotState4.initialPageIndex;
                                        ArrayList arrayList3 = pageFetcherSnapshotState4.pages;
                                        int i8 = i7 + generationalViewportHint2.hint.originalPageOffsetLast + 1;
                                        if (i8 < 0) {
                                            ref$IntRef.element = (i2 * (-i8)) + ref$IntRef.element;
                                            i8 = 0;
                                        }
                                        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList3);
                                        if (i8 <= lastIndex) {
                                            while (true) {
                                                ArrayList arrayList4 = arrayList3;
                                                ref$IntRef.element += ((PagingSource.LoadResult.Page) arrayList3.get(i8)).data.size();
                                                if (i8 != lastIndex) {
                                                    i8++;
                                                    arrayList3 = arrayList4;
                                                }
                                            }
                                        }
                                    }
                                    mutex.unlock(null);
                                    ref$ObjectRef = new Ref$ObjectRef();
                                    mutexImpl = holder5.lock;
                                    pageFetcherSnapshot$doLoad$1.L$0 = loadType2;
                                    pageFetcherSnapshot$doLoad$1.L$1 = generationalViewportHint2;
                                    pageFetcherSnapshot$doLoad$1.L$2 = ref$IntRef;
                                    pageFetcherSnapshot$doLoad$1.L$3 = ref$ObjectRef;
                                    pageFetcherSnapshot$doLoad$1.L$4 = holder5;
                                    pageFetcherSnapshot$doLoad$1.L$5 = mutexImpl;
                                    pageFetcherSnapshot$doLoad$1.L$6 = ref$ObjectRef;
                                    pageFetcherSnapshot$doLoad$1.label = 2;
                                    if (mutexImpl.lock(pageFetcherSnapshot$doLoad$1) != coroutineSingletons) {
                                        ref$IntRef2 = ref$IntRef;
                                        loadType3 = loadType2;
                                        ref$ObjectRef2 = ref$ObjectRef;
                                        generationalViewportHint3 = generationalViewportHint2;
                                        holder2 = holder5;
                                        try {
                                            PageFetcherSnapshotState pageFetcherSnapshotState5 = holder2.state;
                                            str = "Use doInitialLoad for LoadType == REFRESH";
                                            nextLoadKeyOrNull = pageFetcherSnapshot3.nextLoadKeyOrNull(pageFetcherSnapshotState5, loadType3, generationalViewportHint3.generationId, generationalViewportHint3.hint.presentedItemsBeyondAnchor$paging_common(loadType3) + ref$IntRef2.element);
                                            if (nextLoadKeyOrNull != null) {
                                                obj = null;
                                                mutexImpl.unlock(null);
                                                ref$ObjectRef.element = obj;
                                                ref$BooleanRef = new Ref$BooleanRef();
                                                obj8 = ref$ObjectRef2.element;
                                                if (obj8 != null) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            pageFetcherSnapshot$doLoad$1.L$0 = loadType3;
                                            pageFetcherSnapshot$doLoad$1.L$1 = generationalViewportHint3;
                                            pageFetcherSnapshot$doLoad$1.L$2 = ref$IntRef2;
                                            pageFetcherSnapshot$doLoad$1.L$3 = ref$ObjectRef2;
                                            pageFetcherSnapshot$doLoad$1.L$4 = mutexImpl;
                                            pageFetcherSnapshot$doLoad$1.L$5 = nextLoadKeyOrNull;
                                            pageFetcherSnapshot$doLoad$1.L$6 = ref$ObjectRef;
                                            pageFetcherSnapshot$doLoad$1.label = 3;
                                            if (pageFetcherSnapshot3.setLoading(pageFetcherSnapshotState5, loadType3, pageFetcherSnapshot$doLoad$1) != coroutineSingletons) {
                                                obj = nextLoadKeyOrNull;
                                                mutexImpl2 = mutexImpl;
                                                mutexImpl = mutexImpl2;
                                                mutexImpl.unlock(null);
                                                ref$ObjectRef.element = obj;
                                                ref$BooleanRef = new Ref$BooleanRef();
                                                obj8 = ref$ObjectRef2.element;
                                                if (obj8 != null) {
                                                    PagingSource.LoadParams loadParams4 = pageFetcherSnapshot3.loadParams(loadType3, obj8);
                                                    if (Build.ID == null || !Log.isLoggable("Paging", 3)) {
                                                        obj9 = null;
                                                    } else {
                                                        obj9 = null;
                                                        Log.d("Paging", "Start " + loadType3 + " with loadKey " + ref$ObjectRef2.element + " on " + pagingSource2, null);
                                                    }
                                                    pageFetcherSnapshot$doLoad$1.L$0 = loadType3;
                                                    pageFetcherSnapshot$doLoad$1.L$1 = generationalViewportHint3;
                                                    pageFetcherSnapshot$doLoad$1.L$2 = ref$IntRef2;
                                                    pageFetcherSnapshot$doLoad$1.L$3 = ref$ObjectRef2;
                                                    pageFetcherSnapshot$doLoad$1.L$4 = ref$BooleanRef;
                                                    pageFetcherSnapshot$doLoad$1.L$5 = loadParams4;
                                                    pageFetcherSnapshot$doLoad$1.L$6 = obj9;
                                                    pageFetcherSnapshot$doLoad$1.L$7 = obj9;
                                                    pageFetcherSnapshot$doLoad$1.label = 4;
                                                    Object load = pagingSource2.load(loadParams4, pageFetcherSnapshot$doLoad$1);
                                                    if (load != coroutineSingletons) {
                                                        obj2 = load;
                                                        loadParams = loadParams4;
                                                        loadType4 = loadType3;
                                                        ref$IntRef3 = ref$IntRef2;
                                                        generationalViewportHint4 = generationalViewportHint3;
                                                        ref$ObjectRef3 = ref$ObjectRef2;
                                                        loadResult3 = (PagingSource.LoadResult) obj2;
                                                        if (loadResult3 instanceof PagingSource.LoadResult.Page) {
                                                            int ordinal2 = loadType4.ordinal();
                                                            if (ordinal2 == 1) {
                                                                obj7 = ((PagingSource.LoadResult.Page) loadResult3).prevKey;
                                                            } else {
                                                                if (ordinal2 != 2) {
                                                                    a$$ExternalSyntheticBUOutline0.m$3(str);
                                                                    return null;
                                                                }
                                                                obj7 = ((PagingSource.LoadResult.Page) loadResult3).nextKey;
                                                            }
                                                            if (!pagingSource2.getKeyReuseSupported() && Intrinsics.areEqual(obj7, ref$ObjectRef3.element)) {
                                                                Path$$ExternalSyntheticBUOutline0.m((Object) StringsKt__IndentKt.trimMargin$default("The same value, " + ref$ObjectRef3.element + ", was passed as the " + (loadType4 == LoadType.PREPEND ? "prevKey" : "nextKey") + " in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            "));
                                                                return null;
                                                            }
                                                            mutex2 = holder5.lock;
                                                            pageFetcherSnapshot$doLoad$1.L$0 = loadType4;
                                                            pageFetcherSnapshot$doLoad$1.L$1 = generationalViewportHint4;
                                                            pageFetcherSnapshot$doLoad$1.L$2 = ref$IntRef3;
                                                            pageFetcherSnapshot$doLoad$1.L$3 = ref$ObjectRef3;
                                                            pageFetcherSnapshot$doLoad$1.L$4 = ref$BooleanRef;
                                                            pageFetcherSnapshot$doLoad$1.L$5 = loadParams;
                                                            pageFetcherSnapshot$doLoad$1.L$6 = loadResult3;
                                                            pageFetcherSnapshot$doLoad$1.L$7 = holder5;
                                                            pageFetcherSnapshot$doLoad$1.L$8 = mutex2;
                                                            pageFetcherSnapshot$doLoad$1.label = 5;
                                                            if (mutex2.lock(pageFetcherSnapshot$doLoad$1) != coroutineSingletons) {
                                                                loadParams2 = loadParams;
                                                                loadType5 = loadType4;
                                                                generationalViewportHint5 = generationalViewportHint4;
                                                                ref$BooleanRef2 = ref$BooleanRef;
                                                                loadResult = loadResult3;
                                                                holder3 = holder5;
                                                                try {
                                                                    pagingSource = pagingSource2;
                                                                    bufferedChannel = bufferedChannel3;
                                                                    if (holder3.state.insert(generationalViewportHint5.generationId, loadType5, (PagingSource.LoadResult.Page) loadResult, ref$ObjectRef3.element)) {
                                                                        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                                                                            Log.d("Paging", loadResultLog(loadType5, ref$ObjectRef3.element, loadResult), null);
                                                                        }
                                                                        PagingSource.LoadResult.Page page = (PagingSource.LoadResult.Page) loadResult;
                                                                        ref$IntRef3.element = page.data.size() + ref$IntRef3.element;
                                                                        LoadType loadType8 = LoadType.PREPEND;
                                                                        if ((loadType5 == loadType8 && page.prevKey == null) || (loadType5 == LoadType.APPEND && page.nextKey == null)) {
                                                                            ref$BooleanRef2.element = true;
                                                                        }
                                                                        if (WhenMappings.$EnumSwitchMapping$0[loadType5.ordinal()] == 2) {
                                                                            loadType8 = LoadType.APPEND;
                                                                        }
                                                                        mutexImpl3 = holder5.lock;
                                                                        pageFetcherSnapshot$doLoad$1.L$0 = loadType5;
                                                                        pageFetcherSnapshot$doLoad$1.L$1 = generationalViewportHint5;
                                                                        pageFetcherSnapshot$doLoad$1.L$2 = ref$IntRef3;
                                                                        pageFetcherSnapshot$doLoad$1.L$3 = ref$ObjectRef3;
                                                                        pageFetcherSnapshot$doLoad$1.L$4 = ref$BooleanRef2;
                                                                        pageFetcherSnapshot$doLoad$1.L$5 = loadParams2;
                                                                        pageFetcherSnapshot$doLoad$1.L$6 = loadResult;
                                                                        pageFetcherSnapshot$doLoad$1.L$7 = loadType8;
                                                                        pageFetcherSnapshot$doLoad$1.L$8 = holder5;
                                                                        pageFetcherSnapshot$doLoad$1.L$9 = mutexImpl3;
                                                                        pageFetcherSnapshot$doLoad$1.label = 8;
                                                                        if (mutexImpl3.lock(pageFetcherSnapshot$doLoad$1) != coroutineSingletons) {
                                                                            obj3 = loadResult;
                                                                            loadType7 = loadType8;
                                                                            holder4 = holder5;
                                                                            try {
                                                                                PageFetcherSnapshotState pageFetcherSnapshotState6 = holder4.state;
                                                                                ViewportHint viewportHint = generationalViewportHint5.hint;
                                                                                pageFetcherSnapshotState6.getClass();
                                                                                loadType7.getClass();
                                                                                viewportHint.getClass();
                                                                                generationalViewportHint7 = generationalViewportHint5;
                                                                                pageFetcherSnapshotState2 = pageFetcherSnapshotState6;
                                                                                obj6 = obj3;
                                                                                loadParams3 = loadParams2;
                                                                                pageFetcherSnapshot2 = pageFetcherSnapshot;
                                                                                nextLoadKeyOrNull2 = pageFetcherSnapshot2.nextLoadKeyOrNull(pageFetcherSnapshotState2, loadType5, generationalViewportHint7.generationId, generationalViewportHint7.hint.presentedItemsBeyondAnchor$paging_common(loadType5) + ref$IntRef3.element);
                                                                                singleRunner$Holder = pageFetcherSnapshotState2.sourceLoadStates;
                                                                                ref$ObjectRef3.element = nextLoadKeyOrNull2;
                                                                                if (nextLoadKeyOrNull2 == null && !(singleRunner$Holder.get(loadType5) instanceof LoadState.Error)) {
                                                                                    singleRunner$Holder.set(loadType5, !ref$BooleanRef2.element ? LoadState.NotLoading.Complete : LoadState.NotLoading.Incomplete);
                                                                                }
                                                                                pageEvent$paging_common = pageFetcherSnapshotState2.toPageEvent$paging_common((PagingSource.LoadResult.Page) obj6, loadType5);
                                                                                pageFetcherSnapshot$doLoad$1.L$0 = loadType5;
                                                                                pageFetcherSnapshot$doLoad$1.L$1 = generationalViewportHint7;
                                                                                pageFetcherSnapshot$doLoad$1.L$2 = ref$IntRef3;
                                                                                pageFetcherSnapshot$doLoad$1.L$3 = ref$ObjectRef3;
                                                                                pageFetcherSnapshot$doLoad$1.L$4 = ref$BooleanRef2;
                                                                                pageFetcherSnapshot$doLoad$1.L$5 = loadParams3;
                                                                                pageFetcherSnapshot$doLoad$1.L$6 = obj6;
                                                                                pageFetcherSnapshot$doLoad$1.L$7 = mutexImpl3;
                                                                                obj5 = null;
                                                                                pageFetcherSnapshot$doLoad$1.L$8 = null;
                                                                                pageFetcherSnapshot$doLoad$1.L$9 = null;
                                                                                pageFetcherSnapshot$doLoad$1.label = 10;
                                                                                r11 = bufferedChannel;
                                                                                if (r11.send(pageEvent$paging_common, pageFetcherSnapshot$doLoad$1) != coroutineSingletons) {
                                                                                    mutexImpl5 = mutexImpl3;
                                                                                    obj4 = obj6;
                                                                                    bufferedChannel2 = r11;
                                                                                    mutexImpl5.unlock(obj5);
                                                                                    if (loadParams3 instanceof PagingSource.LoadParams.Prepend) {
                                                                                        Object obj11 = ((PagingSource.LoadResult.Page) obj4).prevKey;
                                                                                    }
                                                                                    if (loadParams3 instanceof PagingSource.LoadParams.Append) {
                                                                                        Object obj12 = ((PagingSource.LoadResult.Page) obj4).nextKey;
                                                                                    }
                                                                                    bufferedChannel3 = bufferedChannel2;
                                                                                    ref$BooleanRef = ref$BooleanRef2;
                                                                                    ref$ObjectRef2 = ref$ObjectRef3;
                                                                                    ref$IntRef2 = ref$IntRef3;
                                                                                    pagingSource2 = pagingSource;
                                                                                    generationalViewportHint3 = generationalViewportHint7;
                                                                                    loadType3 = loadType5;
                                                                                    pageFetcherSnapshot3 = pageFetcherSnapshot2;
                                                                                    obj8 = ref$ObjectRef2.element;
                                                                                    if (obj8 != null) {
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th) {
                                                                                th = th;
                                                                                mutexImpl4 = mutexImpl3;
                                                                                mutexImpl4.unlock(null);
                                                                                throw th;
                                                                            }
                                                                        }
                                                                    } else if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                                                                        Log.v("Paging", loadResultLog(loadType5, ref$ObjectRef3.element, z ? 1 : 0), z2 ? 1 : 0);
                                                                    }
                                                                } finally {
                                                                    mutex2.unlock(null);
                                                                }
                                                            }
                                                        } else {
                                                            PagingSource pagingSource3 = pagingSource2;
                                                            if (!(loadResult3 instanceof PagingSource.LoadResult.Error)) {
                                                                if (!(loadResult3 instanceof PagingSource.LoadResult.Invalid)) {
                                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                    return null;
                                                                }
                                                                if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                                                                    Log.v("Paging", loadResultLog(loadType4, ref$ObjectRef3.element, loadResult3), null);
                                                                }
                                                                pageFetcherSnapshot3.pageEventChannelFlowJob.cancel(null);
                                                                pagingSource3.invalidate();
                                                                return Unit.INSTANCE;
                                                            }
                                                            if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                                                                Log.v("Paging", loadResultLog(loadType4, ref$ObjectRef3.element, loadResult3), null);
                                                            }
                                                            MutexImpl mutexImpl7 = holder5.lock;
                                                            pageFetcherSnapshot$doLoad$1.L$0 = loadType4;
                                                            pageFetcherSnapshot$doLoad$1.L$1 = generationalViewportHint4;
                                                            pageFetcherSnapshot$doLoad$1.L$2 = loadResult3;
                                                            pageFetcherSnapshot$doLoad$1.L$3 = holder5;
                                                            pageFetcherSnapshot$doLoad$1.L$4 = mutexImpl7;
                                                            pageFetcherSnapshot$doLoad$1.L$5 = null;
                                                            pageFetcherSnapshot$doLoad$1.label = 6;
                                                            if (mutexImpl7.lock(pageFetcherSnapshot$doLoad$1) != coroutineSingletons) {
                                                                loadType6 = loadType4;
                                                                mutex3 = mutexImpl7;
                                                                loadResult2 = loadResult3;
                                                                pageFetcherSnapshotState3 = holder5.state;
                                                                error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult2).throwable);
                                                                pageFetcherSnapshot$doLoad$1.L$0 = loadType6;
                                                                pageFetcherSnapshot$doLoad$1.L$1 = generationalViewportHint4;
                                                                pageFetcherSnapshot$doLoad$1.L$2 = mutex3;
                                                                pageFetcherSnapshot$doLoad$1.L$3 = pageFetcherSnapshotState3;
                                                                pageFetcherSnapshot$doLoad$1.L$4 = null;
                                                                pageFetcherSnapshot$doLoad$1.label = 7;
                                                                if (pageFetcherSnapshot3.setError(pageFetcherSnapshotState3, loadType6, error, pageFetcherSnapshot$doLoad$1) != coroutineSingletons) {
                                                                    pageFetcherSnapshotState = pageFetcherSnapshotState3;
                                                                    generationalViewportHint6 = generationalViewportHint4;
                                                                    r1 = mutex3;
                                                                    pageFetcherSnapshotState.failedHintsByLoadType.put(loadType6, generationalViewportHint6.hint);
                                                                    r1.unlock(null);
                                                                    return Unit.INSTANCE;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r9 = mutexImpl;
                                            r9.unlock(null);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    mutex.unlock(null);
                                    throw th3;
                                }
                            }
                            return coroutineSingletons;
                        case 1:
                            mutex = (Mutex) pageFetcherSnapshot$doLoad$1.L$4;
                            PageFetcherSnapshotState.Holder holder6 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.L$3;
                            ref$IntRef = (Ref$IntRef) pageFetcherSnapshot$doLoad$1.L$2;
                            GenerationalViewportHint generationalViewportHint8 = pageFetcherSnapshot$doLoad$1.L$1;
                            loadType2 = pageFetcherSnapshot$doLoad$1.L$0;
                            SafeTrace.throwOnFailure(obj10);
                            holder = holder6;
                            generationalViewportHint2 = generationalViewportHint8;
                            i = 1;
                            PageFetcherSnapshotState pageFetcherSnapshotState42 = holder.state;
                            ordinal = loadType2.ordinal();
                            if (ordinal != 0) {
                            }
                            break;
                        case 2:
                            ref$ObjectRef = (Ref$ObjectRef) pageFetcherSnapshot$doLoad$1.L$6;
                            ?? r4 = (Mutex) pageFetcherSnapshot$doLoad$1.L$5;
                            holder2 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.L$4;
                            ref$ObjectRef2 = (Ref$ObjectRef) pageFetcherSnapshot$doLoad$1.L$3;
                            ref$IntRef2 = (Ref$IntRef) pageFetcherSnapshot$doLoad$1.L$2;
                            generationalViewportHint3 = pageFetcherSnapshot$doLoad$1.L$1;
                            loadType3 = pageFetcherSnapshot$doLoad$1.L$0;
                            SafeTrace.throwOnFailure(obj10);
                            mutexImpl = r4;
                            PageFetcherSnapshotState pageFetcherSnapshotState52 = holder2.state;
                            str = "Use doInitialLoad for LoadType == REFRESH";
                            nextLoadKeyOrNull = pageFetcherSnapshot3.nextLoadKeyOrNull(pageFetcherSnapshotState52, loadType3, generationalViewportHint3.generationId, generationalViewportHint3.hint.presentedItemsBeyondAnchor$paging_common(loadType3) + ref$IntRef2.element);
                            if (nextLoadKeyOrNull != null) {
                            }
                            break;
                        case 3:
                            ref$ObjectRef = (Ref$ObjectRef) pageFetcherSnapshot$doLoad$1.L$6;
                            obj = pageFetcherSnapshot$doLoad$1.L$5;
                            r9 = (Mutex) pageFetcherSnapshot$doLoad$1.L$4;
                            ref$ObjectRef2 = (Ref$ObjectRef) pageFetcherSnapshot$doLoad$1.L$3;
                            ref$IntRef2 = (Ref$IntRef) pageFetcherSnapshot$doLoad$1.L$2;
                            generationalViewportHint3 = pageFetcherSnapshot$doLoad$1.L$1;
                            loadType3 = pageFetcherSnapshot$doLoad$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj10);
                                str = "Use doInitialLoad for LoadType == REFRESH";
                                mutexImpl2 = r9;
                                mutexImpl = mutexImpl2;
                                mutexImpl.unlock(null);
                                ref$ObjectRef.element = obj;
                                ref$BooleanRef = new Ref$BooleanRef();
                                obj8 = ref$ObjectRef2.element;
                                if (obj8 != null) {
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th4) {
                                th = th4;
                                r9.unlock(null);
                                throw th;
                            }
                        case 4:
                            PagingSource.LoadParams loadParams5 = (PagingSource.LoadParams) pageFetcherSnapshot$doLoad$1.L$5;
                            Ref$BooleanRef ref$BooleanRef3 = (Ref$BooleanRef) pageFetcherSnapshot$doLoad$1.L$4;
                            Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) pageFetcherSnapshot$doLoad$1.L$3;
                            Ref$IntRef ref$IntRef4 = (Ref$IntRef) pageFetcherSnapshot$doLoad$1.L$2;
                            generationalViewportHint4 = pageFetcherSnapshot$doLoad$1.L$1;
                            LoadType loadType9 = pageFetcherSnapshot$doLoad$1.L$0;
                            SafeTrace.throwOnFailure(obj10);
                            loadParams = loadParams5;
                            loadType4 = loadType9;
                            ref$ObjectRef3 = ref$ObjectRef4;
                            ref$BooleanRef = ref$BooleanRef3;
                            obj2 = obj10;
                            ref$IntRef3 = ref$IntRef4;
                            str = "Use doInitialLoad for LoadType == REFRESH";
                            loadResult3 = (PagingSource.LoadResult) obj2;
                            if (loadResult3 instanceof PagingSource.LoadResult.Page) {
                            }
                            return coroutineSingletons;
                        case 5:
                            Mutex mutex4 = (Mutex) pageFetcherSnapshot$doLoad$1.L$8;
                            holder3 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.L$7;
                            loadResult = (PagingSource.LoadResult) pageFetcherSnapshot$doLoad$1.L$6;
                            PagingSource.LoadParams loadParams6 = (PagingSource.LoadParams) pageFetcherSnapshot$doLoad$1.L$5;
                            ref$BooleanRef2 = (Ref$BooleanRef) pageFetcherSnapshot$doLoad$1.L$4;
                            ref$ObjectRef3 = (Ref$ObjectRef) pageFetcherSnapshot$doLoad$1.L$3;
                            ref$IntRef3 = (Ref$IntRef) pageFetcherSnapshot$doLoad$1.L$2;
                            GenerationalViewportHint generationalViewportHint9 = pageFetcherSnapshot$doLoad$1.L$1;
                            LoadType loadType10 = pageFetcherSnapshot$doLoad$1.L$0;
                            SafeTrace.throwOnFailure(obj10);
                            loadType5 = loadType10;
                            generationalViewportHint5 = generationalViewportHint9;
                            str = "Use doInitialLoad for LoadType == REFRESH";
                            loadParams2 = loadParams6;
                            mutex2 = mutex4;
                            pagingSource = pagingSource2;
                            bufferedChannel = bufferedChannel3;
                            if (holder3.state.insert(generationalViewportHint5.generationId, loadType5, (PagingSource.LoadResult.Page) loadResult, ref$ObjectRef3.element)) {
                            }
                            break;
                        case 6:
                            Mutex mutex5 = (Mutex) pageFetcherSnapshot$doLoad$1.L$4;
                            holder5 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.L$3;
                            loadResult2 = (PagingSource.LoadResult) pageFetcherSnapshot$doLoad$1.L$2;
                            GenerationalViewportHint generationalViewportHint10 = pageFetcherSnapshot$doLoad$1.L$1;
                            LoadType loadType11 = pageFetcherSnapshot$doLoad$1.L$0;
                            SafeTrace.throwOnFailure(obj10);
                            generationalViewportHint4 = generationalViewportHint10;
                            loadType6 = loadType11;
                            mutex3 = mutex5;
                            pageFetcherSnapshotState3 = holder5.state;
                            error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult2).throwable);
                            pageFetcherSnapshot$doLoad$1.L$0 = loadType6;
                            pageFetcherSnapshot$doLoad$1.L$1 = generationalViewportHint4;
                            pageFetcherSnapshot$doLoad$1.L$2 = mutex3;
                            pageFetcherSnapshot$doLoad$1.L$3 = pageFetcherSnapshotState3;
                            pageFetcherSnapshot$doLoad$1.L$4 = null;
                            pageFetcherSnapshot$doLoad$1.label = 7;
                            if (pageFetcherSnapshot3.setError(pageFetcherSnapshotState3, loadType6, error, pageFetcherSnapshot$doLoad$1) != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        case 7:
                            pageFetcherSnapshotState = (PageFetcherSnapshotState) pageFetcherSnapshot$doLoad$1.L$3;
                            Mutex mutex6 = (Mutex) pageFetcherSnapshot$doLoad$1.L$2;
                            generationalViewportHint6 = pageFetcherSnapshot$doLoad$1.L$1;
                            loadType6 = pageFetcherSnapshot$doLoad$1.L$0;
                            SafeTrace.throwOnFailure(obj10);
                            r1 = mutex6;
                            pageFetcherSnapshotState.failedHintsByLoadType.put(loadType6, generationalViewportHint6.hint);
                            r1.unlock(null);
                            return Unit.INSTANCE;
                        case 8:
                            MutexImpl mutexImpl8 = pageFetcherSnapshot$doLoad$1.L$9;
                            PageFetcherSnapshotState.Holder holder7 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.L$8;
                            loadType7 = (LoadType) pageFetcherSnapshot$doLoad$1.L$7;
                            obj3 = (PagingSource.LoadResult) pageFetcherSnapshot$doLoad$1.L$6;
                            PagingSource.LoadParams loadParams7 = (PagingSource.LoadParams) pageFetcherSnapshot$doLoad$1.L$5;
                            Ref$BooleanRef ref$BooleanRef4 = (Ref$BooleanRef) pageFetcherSnapshot$doLoad$1.L$4;
                            Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) pageFetcherSnapshot$doLoad$1.L$3;
                            Ref$IntRef ref$IntRef5 = (Ref$IntRef) pageFetcherSnapshot$doLoad$1.L$2;
                            GenerationalViewportHint generationalViewportHint11 = pageFetcherSnapshot$doLoad$1.L$1;
                            LoadType loadType12 = pageFetcherSnapshot$doLoad$1.L$0;
                            SafeTrace.throwOnFailure(obj10);
                            loadType5 = loadType12;
                            bufferedChannel = bufferedChannel3;
                            holder4 = holder7;
                            pagingSource = pagingSource2;
                            generationalViewportHint5 = generationalViewportHint11;
                            mutexImpl3 = mutexImpl8;
                            str = "Use doInitialLoad for LoadType == REFRESH";
                            loadParams2 = loadParams7;
                            ref$BooleanRef2 = ref$BooleanRef4;
                            ref$ObjectRef3 = ref$ObjectRef5;
                            ref$IntRef3 = ref$IntRef5;
                            PageFetcherSnapshotState pageFetcherSnapshotState62 = holder4.state;
                            ViewportHint viewportHint2 = generationalViewportHint5.hint;
                            pageFetcherSnapshotState62.getClass();
                            loadType7.getClass();
                            viewportHint2.getClass();
                            generationalViewportHint7 = generationalViewportHint5;
                            pageFetcherSnapshotState2 = pageFetcherSnapshotState62;
                            obj6 = obj3;
                            loadParams3 = loadParams2;
                            pageFetcherSnapshot2 = pageFetcherSnapshot;
                            nextLoadKeyOrNull2 = pageFetcherSnapshot2.nextLoadKeyOrNull(pageFetcherSnapshotState2, loadType5, generationalViewportHint7.generationId, generationalViewportHint7.hint.presentedItemsBeyondAnchor$paging_common(loadType5) + ref$IntRef3.element);
                            singleRunner$Holder = pageFetcherSnapshotState2.sourceLoadStates;
                            ref$ObjectRef3.element = nextLoadKeyOrNull2;
                            if (nextLoadKeyOrNull2 == null) {
                                singleRunner$Holder.set(loadType5, !ref$BooleanRef2.element ? LoadState.NotLoading.Complete : LoadState.NotLoading.Incomplete);
                                break;
                            }
                            pageEvent$paging_common = pageFetcherSnapshotState2.toPageEvent$paging_common((PagingSource.LoadResult.Page) obj6, loadType5);
                            pageFetcherSnapshot$doLoad$1.L$0 = loadType5;
                            pageFetcherSnapshot$doLoad$1.L$1 = generationalViewportHint7;
                            pageFetcherSnapshot$doLoad$1.L$2 = ref$IntRef3;
                            pageFetcherSnapshot$doLoad$1.L$3 = ref$ObjectRef3;
                            pageFetcherSnapshot$doLoad$1.L$4 = ref$BooleanRef2;
                            pageFetcherSnapshot$doLoad$1.L$5 = loadParams3;
                            pageFetcherSnapshot$doLoad$1.L$6 = obj6;
                            pageFetcherSnapshot$doLoad$1.L$7 = mutexImpl3;
                            obj5 = null;
                            pageFetcherSnapshot$doLoad$1.L$8 = null;
                            pageFetcherSnapshot$doLoad$1.L$9 = null;
                            pageFetcherSnapshot$doLoad$1.label = 10;
                            r11 = bufferedChannel;
                            if (r11.send(pageEvent$paging_common, pageFetcherSnapshot$doLoad$1) != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        case 9:
                            PageFetcherSnapshotState pageFetcherSnapshotState7 = (PageFetcherSnapshotState) pageFetcherSnapshot$doLoad$1.L$8;
                            ?? r42 = (Mutex) pageFetcherSnapshot$doLoad$1.L$7;
                            Object obj13 = (PagingSource.LoadResult) pageFetcherSnapshot$doLoad$1.L$6;
                            loadParams3 = (PagingSource.LoadParams) pageFetcherSnapshot$doLoad$1.L$5;
                            ref$BooleanRef2 = (Ref$BooleanRef) pageFetcherSnapshot$doLoad$1.L$4;
                            ref$ObjectRef3 = (Ref$ObjectRef) pageFetcherSnapshot$doLoad$1.L$3;
                            ref$IntRef3 = (Ref$IntRef) pageFetcherSnapshot$doLoad$1.L$2;
                            GenerationalViewportHint generationalViewportHint12 = pageFetcherSnapshot$doLoad$1.L$1;
                            LoadType loadType13 = pageFetcherSnapshot$doLoad$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj10);
                                generationalViewportHint7 = generationalViewportHint12;
                                loadType5 = loadType13;
                                bufferedChannel = bufferedChannel3;
                                pagingSource = pagingSource2;
                                str = "Use doInitialLoad for LoadType == REFRESH";
                                pageFetcherSnapshotState2 = pageFetcherSnapshotState7;
                                mutexImpl3 = r42;
                                obj6 = obj13;
                                pageFetcherSnapshot2 = pageFetcherSnapshot;
                                nextLoadKeyOrNull2 = pageFetcherSnapshot2.nextLoadKeyOrNull(pageFetcherSnapshotState2, loadType5, generationalViewportHint7.generationId, generationalViewportHint7.hint.presentedItemsBeyondAnchor$paging_common(loadType5) + ref$IntRef3.element);
                                singleRunner$Holder = pageFetcherSnapshotState2.sourceLoadStates;
                                ref$ObjectRef3.element = nextLoadKeyOrNull2;
                                if (nextLoadKeyOrNull2 == null) {
                                }
                                pageEvent$paging_common = pageFetcherSnapshotState2.toPageEvent$paging_common((PagingSource.LoadResult.Page) obj6, loadType5);
                                pageFetcherSnapshot$doLoad$1.L$0 = loadType5;
                                pageFetcherSnapshot$doLoad$1.L$1 = generationalViewportHint7;
                                pageFetcherSnapshot$doLoad$1.L$2 = ref$IntRef3;
                                pageFetcherSnapshot$doLoad$1.L$3 = ref$ObjectRef3;
                                pageFetcherSnapshot$doLoad$1.L$4 = ref$BooleanRef2;
                                pageFetcherSnapshot$doLoad$1.L$5 = loadParams3;
                                pageFetcherSnapshot$doLoad$1.L$6 = obj6;
                                pageFetcherSnapshot$doLoad$1.L$7 = mutexImpl3;
                                obj5 = null;
                                pageFetcherSnapshot$doLoad$1.L$8 = null;
                                pageFetcherSnapshot$doLoad$1.L$9 = null;
                                pageFetcherSnapshot$doLoad$1.label = 10;
                                r11 = bufferedChannel;
                                if (r11.send(pageEvent$paging_common, pageFetcherSnapshot$doLoad$1) != coroutineSingletons) {
                                }
                                return coroutineSingletons;
                            } catch (Throwable th5) {
                                th = th5;
                                mutexImpl4 = r42;
                                mutexImpl4.unlock(null);
                                throw th;
                            }
                        case 10:
                            ?? r12 = (Mutex) pageFetcherSnapshot$doLoad$1.L$7;
                            Object obj14 = (PagingSource.LoadResult) pageFetcherSnapshot$doLoad$1.L$6;
                            PagingSource.LoadParams loadParams8 = (PagingSource.LoadParams) pageFetcherSnapshot$doLoad$1.L$5;
                            Ref$BooleanRef ref$BooleanRef5 = (Ref$BooleanRef) pageFetcherSnapshot$doLoad$1.L$4;
                            Ref$ObjectRef ref$ObjectRef6 = (Ref$ObjectRef) pageFetcherSnapshot$doLoad$1.L$3;
                            Ref$IntRef ref$IntRef6 = (Ref$IntRef) pageFetcherSnapshot$doLoad$1.L$2;
                            GenerationalViewportHint generationalViewportHint13 = pageFetcherSnapshot$doLoad$1.L$1;
                            LoadType loadType14 = pageFetcherSnapshot$doLoad$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj10);
                                pageFetcherSnapshot2 = pageFetcherSnapshot3;
                                generationalViewportHint7 = generationalViewportHint13;
                                ref$IntRef3 = ref$IntRef6;
                                ref$ObjectRef3 = ref$ObjectRef6;
                                ref$BooleanRef2 = ref$BooleanRef5;
                                loadParams3 = loadParams8;
                                obj4 = obj14;
                                loadType5 = loadType14;
                                pagingSource = pagingSource2;
                                str = "Use doInitialLoad for LoadType == REFRESH";
                                mutexImpl5 = r12;
                                bufferedChannel2 = bufferedChannel3;
                                obj5 = null;
                                mutexImpl5.unlock(obj5);
                                if (loadParams3 instanceof PagingSource.LoadParams.Prepend) {
                                }
                                if (loadParams3 instanceof PagingSource.LoadParams.Append) {
                                }
                                bufferedChannel3 = bufferedChannel2;
                                ref$BooleanRef = ref$BooleanRef2;
                                ref$ObjectRef2 = ref$ObjectRef3;
                                ref$IntRef2 = ref$IntRef3;
                                pagingSource2 = pagingSource;
                                generationalViewportHint3 = generationalViewportHint7;
                                loadType3 = loadType5;
                                pageFetcherSnapshot3 = pageFetcherSnapshot2;
                                obj8 = ref$ObjectRef2.element;
                                if (obj8 != null) {
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th6) {
                                th = th6;
                                mutexImpl4 = r12;
                                mutexImpl4.unlock(null);
                                throw th;
                            }
                        case 11:
                            Mutex mutex7 = (Mutex) pageFetcherSnapshot$doLoad$1.L$6;
                            PageFetcherSnapshotState.Holder holder8 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.L$5;
                            ref$BooleanRef = (Ref$BooleanRef) pageFetcherSnapshot$doLoad$1.L$4;
                            ref$ObjectRef2 = (Ref$ObjectRef) pageFetcherSnapshot$doLoad$1.L$3;
                            ref$IntRef2 = (Ref$IntRef) pageFetcherSnapshot$doLoad$1.L$2;
                            generationalViewportHint3 = pageFetcherSnapshot$doLoad$1.L$1;
                            loadType3 = pageFetcherSnapshot$doLoad$1.L$0;
                            SafeTrace.throwOnFailure(obj10);
                            try {
                                holder8.state.currentPagingState$paging_common((ViewportHint.Access) ((MetadataRepo) pageFetcherSnapshot3.hintHandler.state).mRootNode);
                                mutex7.unlock(null);
                                str = "Use doInitialLoad for LoadType == REFRESH";
                                obj8 = ref$ObjectRef2.element;
                                if (obj8 != null) {
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th7) {
                                mutex7.unlock(null);
                                throw th7;
                            }
                        default:
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            switch (pageFetcherSnapshot$doLoad$1.label) {
            }
        } catch (Throwable th8) {
            r1.unlock(null);
            throw th8;
        }
        pageFetcherSnapshot$doLoad$1 = new PageFetcherSnapshot$doLoad$1(pageFetcherSnapshot3, continuation);
        Object obj102 = pageFetcherSnapshot$doLoad$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    public static final Object access$retryLoadError(PageFetcherSnapshot pageFetcherSnapshot, LoadType loadType, ViewportHint viewportHint, PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) {
        pageFetcherSnapshot.getClass();
        if (WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 1) {
            Object doInitialLoad = pageFetcherSnapshot.doInitialLoad(pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
            return doInitialLoad == CoroutineSingletons.COROUTINE_SUSPENDED ? doInitialLoad : Unit.INSTANCE;
        }
        if (viewportHint != null) {
            pageFetcherSnapshot.hintHandler.forceSetHint(loadType, viewportHint);
            return Unit.INSTANCE;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        return null;
    }

    public static final void access$startConsumingHints(PageFetcherSnapshot pageFetcherSnapshot, CoroutineScope coroutineScope) {
        PagingConfig pagingConfig = pageFetcherSnapshot.config;
        Continuation continuation = null;
        JobKt.launch$default(coroutineScope, null, null, new PageFetcherSnapshot$startConsumingHints$2(pageFetcherSnapshot, continuation, 0), 3);
        JobKt.launch$default(coroutineScope, null, null, new PageFetcherSnapshot$startConsumingHints$2(pageFetcherSnapshot, continuation, 1), 3);
    }

    public static String loadResultLog(LoadType loadType, Object obj, PagingSource.LoadResult loadResult) {
        if (loadResult == null) {
            return "End " + loadType + " with loadkey " + obj + ". Load CANCELLED.";
        }
        return "End " + loadType + " with loadKey " + obj + ". Returned " + loadResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object currentPagingState(ContinuationImpl continuationImpl) {
        PageFetcherSnapshot$currentPagingState$1 pageFetcherSnapshot$currentPagingState$1;
        int i;
        PageFetcherSnapshotState.Holder holder;
        MutexImpl mutexImpl;
        try {
            if (continuationImpl instanceof PageFetcherSnapshot$currentPagingState$1) {
                pageFetcherSnapshot$currentPagingState$1 = (PageFetcherSnapshot$currentPagingState$1) continuationImpl;
                int i2 = pageFetcherSnapshot$currentPagingState$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    pageFetcherSnapshot$currentPagingState$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = pageFetcherSnapshot$currentPagingState$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pageFetcherSnapshot$currentPagingState$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        PageFetcherSnapshotState.Holder holder2 = this.stateHolder;
                        MutexImpl mutexImpl2 = holder2.lock;
                        pageFetcherSnapshot$currentPagingState$1.L$0 = holder2;
                        pageFetcherSnapshot$currentPagingState$1.L$1 = mutexImpl2;
                        pageFetcherSnapshot$currentPagingState$1.label = 1;
                        if (mutexImpl2.lock(pageFetcherSnapshot$currentPagingState$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        holder = holder2;
                        mutexImpl = mutexImpl2;
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutexImpl = pageFetcherSnapshot$currentPagingState$1.L$1;
                        holder = pageFetcherSnapshot$currentPagingState$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    return holder.state.currentPagingState$paging_common((ViewportHint.Access) ((MetadataRepo) this.hintHandler.state).mRootNode);
                }
            }
            return holder.state.currentPagingState$paging_common((ViewportHint.Access) ((MetadataRepo) this.hintHandler.state).mRootNode);
        } finally {
            mutexImpl.unlock(null);
        }
        pageFetcherSnapshot$currentPagingState$1 = new PageFetcherSnapshot$currentPagingState$1(this, continuationImpl);
        Object obj2 = pageFetcherSnapshot$currentPagingState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pageFetcherSnapshot$currentPagingState$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x012c, code lost:
    
        if (r15 == r1) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00f4, code lost:
    
        if (setLoading(r15, r10, r0) != r1) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0166 A[Catch: all -> 0x016c, TRY_ENTER, TryCatch #5 {all -> 0x016c, blocks: (B:65:0x014a, B:68:0x0166, B:69:0x016f, B:71:0x0176), top: B:64:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0176 A[Catch: all -> 0x016c, TRY_LEAVE, TryCatch #5 {all -> 0x016c, blocks: (B:65:0x014a, B:68:0x0166, B:69:0x016f, B:71:0x0176), top: B:64:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r14v0, types: [androidx.paging.PageFetcherSnapshot] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInitialLoad(ContinuationImpl continuationImpl) {
        PageFetcherSnapshot$doInitialLoad$1 pageFetcherSnapshot$doInitialLoad$1;
        Mutex mutex;
        Mutex mutex2;
        PageFetcherSnapshotState.Holder holder;
        PagingSource.LoadResult loadResult;
        MutexImpl mutexImpl;
        PagingSource.LoadResult loadResult2;
        MutexImpl mutexImpl2;
        PageFetcherSnapshotState.Holder holder2;
        boolean insert;
        Object obj;
        MutexImpl mutexImpl3;
        PagingSource.LoadResult loadResult3;
        Mutex mutex3;
        BufferedChannel bufferedChannel;
        PageEvent.Insert pageEvent$paging_common;
        Mutex mutex4;
        PageFetcherSnapshotState pageFetcherSnapshotState;
        LoadState.Error error;
        LoadType loadType;
        try {
            if (continuationImpl instanceof PageFetcherSnapshot$doInitialLoad$1) {
                pageFetcherSnapshot$doInitialLoad$1 = (PageFetcherSnapshot$doInitialLoad$1) continuationImpl;
                int i = pageFetcherSnapshot$doInitialLoad$1.label;
                if ((i & PKIFailureInfo.systemUnavail) != 0) {
                    pageFetcherSnapshot$doInitialLoad$1.label = i - PKIFailureInfo.systemUnavail;
                    Object obj2 = pageFetcherSnapshot$doInitialLoad$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    mutex = pageFetcherSnapshot$doInitialLoad$1.label;
                    PagingSource pagingSource = this.pagingSource;
                    PageFetcherSnapshotState.Holder holder3 = this.stateHolder;
                    Object obj3 = this.initialKey;
                    switch (mutex) {
                        case 0:
                            SafeTrace.throwOnFailure(obj2);
                            MutexImpl mutexImpl4 = holder3.lock;
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = holder3;
                            pageFetcherSnapshot$doInitialLoad$1.L$1 = mutexImpl4;
                            pageFetcherSnapshot$doInitialLoad$1.label = 1;
                            if (mutexImpl4.lock(pageFetcherSnapshot$doInitialLoad$1) != coroutineSingletons) {
                                mutex2 = mutexImpl4;
                                holder = holder3;
                                PageFetcherSnapshotState pageFetcherSnapshotState2 = holder.state;
                                LoadType loadType2 = LoadType.REFRESH;
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = mutex2;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = null;
                                pageFetcherSnapshot$doInitialLoad$1.label = 2;
                                break;
                            }
                            return coroutineSingletons;
                        case 1:
                            mutex2 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.L$1;
                            holder = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.L$0;
                            SafeTrace.throwOnFailure(obj2);
                            PageFetcherSnapshotState pageFetcherSnapshotState22 = holder.state;
                            LoadType loadType22 = LoadType.REFRESH;
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = mutex2;
                            pageFetcherSnapshot$doInitialLoad$1.L$1 = null;
                            pageFetcherSnapshot$doInitialLoad$1.label = 2;
                            break;
                        case 2:
                            mutex2 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.L$0;
                            SafeTrace.throwOnFailure(obj2);
                            mutex2.unlock(null);
                            PagingSource.LoadParams loadParams = loadParams(LoadType.REFRESH, obj3);
                            mutex = Build.ID;
                            if (mutex != 0 && Log.isLoggable("Paging", 3)) {
                                Log.d("Paging", "Start REFRESH with loadKey " + obj3 + " on " + pagingSource, null);
                            }
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = null;
                            pageFetcherSnapshot$doInitialLoad$1.label = 3;
                            obj2 = pagingSource.load(loadParams, pageFetcherSnapshot$doInitialLoad$1);
                            break;
                        case 3:
                            SafeTrace.throwOnFailure(obj2);
                            loadResult = (PagingSource.LoadResult) obj2;
                            if (loadResult instanceof PagingSource.LoadResult.Page) {
                                mutexImpl2 = holder3.lock;
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = loadResult;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = holder3;
                                pageFetcherSnapshot$doInitialLoad$1.L$2 = mutexImpl2;
                                pageFetcherSnapshot$doInitialLoad$1.label = 4;
                                if (mutexImpl2.lock(pageFetcherSnapshot$doInitialLoad$1) != coroutineSingletons) {
                                    holder2 = holder3;
                                    try {
                                        PageFetcherSnapshotState pageFetcherSnapshotState3 = holder2.state;
                                        LoadType loadType3 = LoadType.REFRESH;
                                        insert = pageFetcherSnapshotState3.insert(0, loadType3, (PagingSource.LoadResult.Page) loadResult, obj3);
                                        SingleRunner$Holder singleRunner$Holder = pageFetcherSnapshotState3.sourceLoadStates;
                                        singleRunner$Holder.set(loadType3, LoadState.NotLoading.Incomplete);
                                        obj = ((PagingSource.LoadResult.Page) loadResult).prevKey;
                                        LoadState.NotLoading notLoading = LoadState.NotLoading.Complete;
                                        if (obj == null) {
                                            singleRunner$Holder.set(LoadType.PREPEND, notLoading);
                                        }
                                        if (((PagingSource.LoadResult.Page) loadResult).nextKey == null) {
                                            singleRunner$Holder.set(LoadType.APPEND, notLoading);
                                        }
                                        if (insert) {
                                            if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                                                Log.v("Paging", loadResultLog(loadType3, obj3, null), null);
                                            }
                                            return Unit.INSTANCE;
                                        }
                                        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                                            Log.d("Paging", loadResultLog(loadType3, obj3, loadResult), null);
                                        }
                                        mutexImpl3 = holder3.lock;
                                        pageFetcherSnapshot$doInitialLoad$1.L$0 = loadResult;
                                        pageFetcherSnapshot$doInitialLoad$1.L$1 = holder3;
                                        pageFetcherSnapshot$doInitialLoad$1.L$2 = mutexImpl3;
                                        pageFetcherSnapshot$doInitialLoad$1.label = 5;
                                        if (mutexImpl3.lock(pageFetcherSnapshot$doInitialLoad$1) != coroutineSingletons) {
                                            loadResult3 = loadResult;
                                            try {
                                                PageFetcherSnapshotState pageFetcherSnapshotState4 = holder3.state;
                                                bufferedChannel = this.pageEventCh;
                                                pageEvent$paging_common = pageFetcherSnapshotState4.toPageEvent$paging_common((PagingSource.LoadResult.Page) loadResult3, LoadType.REFRESH);
                                                pageFetcherSnapshot$doInitialLoad$1.L$0 = loadResult3;
                                                pageFetcherSnapshot$doInitialLoad$1.L$1 = mutexImpl3;
                                                pageFetcherSnapshot$doInitialLoad$1.L$2 = null;
                                                pageFetcherSnapshot$doInitialLoad$1.label = 6;
                                                if (bufferedChannel.send(pageEvent$paging_common, pageFetcherSnapshot$doInitialLoad$1) != coroutineSingletons) {
                                                    mutex3 = mutexImpl3;
                                                    return Unit.INSTANCE;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                mutex3 = mutexImpl3;
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            } else {
                                if (!(loadResult instanceof PagingSource.LoadResult.Error)) {
                                    if (!(loadResult instanceof PagingSource.LoadResult.Invalid)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                                        Log.v("Paging", loadResultLog(LoadType.REFRESH, obj3, loadResult), null);
                                    }
                                    this.pageEventChannelFlowJob.cancel(null);
                                    pagingSource.invalidate();
                                    return Unit.INSTANCE;
                                }
                                if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                                    Log.v("Paging", loadResultLog(LoadType.REFRESH, obj3, loadResult), null);
                                }
                                mutexImpl = holder3.lock;
                                pageFetcherSnapshot$doInitialLoad$1.L$0 = loadResult;
                                pageFetcherSnapshot$doInitialLoad$1.L$1 = holder3;
                                pageFetcherSnapshot$doInitialLoad$1.L$2 = mutexImpl;
                                pageFetcherSnapshot$doInitialLoad$1.label = 8;
                                if (mutexImpl.lock(pageFetcherSnapshot$doInitialLoad$1) != coroutineSingletons) {
                                    loadResult2 = loadResult;
                                    try {
                                        pageFetcherSnapshotState = holder3.state;
                                        error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult2).throwable);
                                        loadType = LoadType.REFRESH;
                                        pageFetcherSnapshot$doInitialLoad$1.L$0 = mutexImpl;
                                        pageFetcherSnapshot$doInitialLoad$1.L$1 = null;
                                        pageFetcherSnapshot$doInitialLoad$1.L$2 = null;
                                        pageFetcherSnapshot$doInitialLoad$1.label = 9;
                                        if (setError(pageFetcherSnapshotState, loadType, error, pageFetcherSnapshot$doInitialLoad$1) != coroutineSingletons) {
                                            mutex4 = mutexImpl;
                                            mutex4.unlock(null);
                                            return Unit.INSTANCE;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        mutex4 = mutexImpl;
                                        throw th;
                                    }
                                }
                            }
                            return coroutineSingletons;
                        case 4:
                            mutexImpl2 = pageFetcherSnapshot$doInitialLoad$1.L$2;
                            holder2 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.L$1;
                            PagingSource.LoadResult loadResult4 = (PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.L$0;
                            SafeTrace.throwOnFailure(obj2);
                            loadResult = loadResult4;
                            PageFetcherSnapshotState pageFetcherSnapshotState32 = holder2.state;
                            LoadType loadType32 = LoadType.REFRESH;
                            insert = pageFetcherSnapshotState32.insert(0, loadType32, (PagingSource.LoadResult.Page) loadResult, obj3);
                            SingleRunner$Holder singleRunner$Holder2 = pageFetcherSnapshotState32.sourceLoadStates;
                            singleRunner$Holder2.set(loadType32, LoadState.NotLoading.Incomplete);
                            obj = ((PagingSource.LoadResult.Page) loadResult).prevKey;
                            LoadState.NotLoading notLoading2 = LoadState.NotLoading.Complete;
                            if (obj == null) {
                            }
                            if (((PagingSource.LoadResult.Page) loadResult).nextKey == null) {
                            }
                            if (insert) {
                            }
                            break;
                        case 5:
                            mutexImpl3 = pageFetcherSnapshot$doInitialLoad$1.L$2;
                            holder3 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.L$1;
                            loadResult3 = (PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.L$0;
                            SafeTrace.throwOnFailure(obj2);
                            PageFetcherSnapshotState pageFetcherSnapshotState42 = holder3.state;
                            bufferedChannel = this.pageEventCh;
                            pageEvent$paging_common = pageFetcherSnapshotState42.toPageEvent$paging_common((PagingSource.LoadResult.Page) loadResult3, LoadType.REFRESH);
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = loadResult3;
                            pageFetcherSnapshot$doInitialLoad$1.L$1 = mutexImpl3;
                            pageFetcherSnapshot$doInitialLoad$1.L$2 = null;
                            pageFetcherSnapshot$doInitialLoad$1.label = 6;
                            if (bufferedChannel.send(pageEvent$paging_common, pageFetcherSnapshot$doInitialLoad$1) != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        case 6:
                            mutex3 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.L$1;
                            try {
                                SafeTrace.throwOnFailure(obj2);
                                return Unit.INSTANCE;
                            } catch (Throwable th4) {
                                th = th4;
                                throw th;
                            }
                        case 7:
                            MutexImpl mutexImpl5 = pageFetcherSnapshot$doInitialLoad$1.L$2;
                            PageFetcherSnapshotState.Holder holder4 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.L$1;
                            PagingSource.LoadResult loadResult5 = (PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.L$0;
                            SafeTrace.throwOnFailure(obj2);
                            try {
                                holder4.state.currentPagingState$paging_common((ViewportHint.Access) ((MetadataRepo) this.hintHandler.state).mRootNode);
                                mutexImpl5.unlock(null);
                                PagingSource.LoadResult.Page page = (PagingSource.LoadResult.Page) loadResult5;
                                if (page.prevKey == null) {
                                    LoadType loadType4 = LoadType.REFRESH;
                                    throw null;
                                }
                                if (page.nextKey == null) {
                                    LoadType loadType5 = LoadType.REFRESH;
                                    throw null;
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th5) {
                                mutexImpl5.unlock(null);
                                throw th5;
                            }
                        case 8:
                            mutexImpl = pageFetcherSnapshot$doInitialLoad$1.L$2;
                            holder3 = (PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.L$1;
                            loadResult2 = (PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.L$0;
                            SafeTrace.throwOnFailure(obj2);
                            pageFetcherSnapshotState = holder3.state;
                            error = new LoadState.Error(((PagingSource.LoadResult.Error) loadResult2).throwable);
                            loadType = LoadType.REFRESH;
                            pageFetcherSnapshot$doInitialLoad$1.L$0 = mutexImpl;
                            pageFetcherSnapshot$doInitialLoad$1.L$1 = null;
                            pageFetcherSnapshot$doInitialLoad$1.L$2 = null;
                            pageFetcherSnapshot$doInitialLoad$1.label = 9;
                            if (setError(pageFetcherSnapshotState, loadType, error, pageFetcherSnapshot$doInitialLoad$1) != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        case 9:
                            mutex4 = (Mutex) pageFetcherSnapshot$doInitialLoad$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj2);
                                mutex4.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th6) {
                                th = th6;
                                throw th;
                            }
                        default:
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            switch (mutex) {
            }
        } finally {
            mutex.unlock(null);
        }
        pageFetcherSnapshot$doInitialLoad$1 = new PageFetcherSnapshot$doInitialLoad$1(this, continuationImpl);
        Object obj22 = pageFetcherSnapshot$doInitialLoad$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        mutex = pageFetcherSnapshot$doInitialLoad$1.label;
        PagingSource pagingSource2 = this.pagingSource;
        PageFetcherSnapshotState.Holder holder32 = this.stateHolder;
        Object obj32 = this.initialKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:11:0x0051, B:13:0x0065, B:14:0x0094, B:19:0x0084), top: B:10:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:11:0x0051, B:13:0x0065, B:14:0x0094, B:19:0x0084), top: B:10:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object forceSetHint(LoadType loadType, ContinuationImpl continuationImpl) {
        PageFetcherSnapshot$forceSetHint$1 pageFetcherSnapshot$forceSetHint$1;
        int i;
        MutexImpl mutexImpl;
        PageFetcherSnapshotState.Holder holder;
        try {
            if (continuationImpl instanceof PageFetcherSnapshot$forceSetHint$1) {
                pageFetcherSnapshot$forceSetHint$1 = (PageFetcherSnapshot$forceSetHint$1) continuationImpl;
                int i2 = pageFetcherSnapshot$forceSetHint$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    pageFetcherSnapshot$forceSetHint$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = pageFetcherSnapshot$forceSetHint$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pageFetcherSnapshot$forceSetHint$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (loadType == LoadType.REFRESH) {
                            a$$ExternalSyntheticBUOutline0.m$3("Called for REFRESH but this should only be called for either APPEND or PREPEND loads. This error indicates a bug in the Paging library. Please file a bug report in Buganizer.");
                            return null;
                        }
                        PageFetcherSnapshotState.Holder holder2 = this.stateHolder;
                        mutexImpl = holder2.lock;
                        pageFetcherSnapshot$forceSetHint$1.L$0 = loadType;
                        pageFetcherSnapshot$forceSetHint$1.L$1 = holder2;
                        pageFetcherSnapshot$forceSetHint$1.L$2 = mutexImpl;
                        pageFetcherSnapshot$forceSetHint$1.label = 1;
                        if (mutexImpl.lock(pageFetcherSnapshot$forceSetHint$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        holder = holder2;
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        MutexImpl mutexImpl2 = pageFetcherSnapshot$forceSetHint$1.L$2;
                        holder = pageFetcherSnapshot$forceSetHint$1.L$1;
                        LoadType loadType2 = pageFetcherSnapshot$forceSetHint$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = mutexImpl2;
                        loadType = loadType2;
                    }
                    PageFetcherSnapshotState pageFetcherSnapshotState = holder.state;
                    int i3 = pageFetcherSnapshotState.initialPageIndex;
                    ArrayList arrayList = pageFetcherSnapshotState.pages;
                    int i4 = -i3;
                    int size = (arrayList.size() - pageFetcherSnapshotState.initialPageIndex) - 1;
                    this.hintHandler.forceSetHint(loadType, loadType != LoadType.APPEND ? new ViewportHint.Access(size, CollectionsKt__CollectionsKt.getLastIndex(((PagingSource.LoadResult.Page) CollectionsKt.last((List) arrayList)).data), pageFetcherSnapshotState.getStorageCount$paging_common() - 1, 0, i4, size) : new ViewportHint.Access(i4, 0, 0, pageFetcherSnapshotState.getStorageCount$paging_common() - 1, i4, size));
                    mutexImpl.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            PageFetcherSnapshotState pageFetcherSnapshotState2 = holder.state;
            int i32 = pageFetcherSnapshotState2.initialPageIndex;
            ArrayList arrayList2 = pageFetcherSnapshotState2.pages;
            int i42 = -i32;
            int size2 = (arrayList2.size() - pageFetcherSnapshotState2.initialPageIndex) - 1;
            this.hintHandler.forceSetHint(loadType, loadType != LoadType.APPEND ? new ViewportHint.Access(size2, CollectionsKt__CollectionsKt.getLastIndex(((PagingSource.LoadResult.Page) CollectionsKt.last((List) arrayList2)).data), pageFetcherSnapshotState2.getStorageCount$paging_common() - 1, 0, i42, size2) : new ViewportHint.Access(i42, 0, 0, pageFetcherSnapshotState2.getStorageCount$paging_common() - 1, i42, size2));
            mutexImpl.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutexImpl.unlock(null);
            throw th;
        }
        pageFetcherSnapshot$forceSetHint$1 = new PageFetcherSnapshot$forceSetHint$1(this, continuationImpl);
        Object obj2 = pageFetcherSnapshot$forceSetHint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pageFetcherSnapshot$forceSetHint$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065 A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:11:0x004d, B:13:0x0065, B:17:0x006e), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:11:0x004d, B:13:0x0065, B:17:0x006e), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getLoadKey$paging_common(PagingSource.LoadResult.Page page, ContinuationImpl continuationImpl) {
        PageFetcherSnapshot$getLoadKey$1 pageFetcherSnapshot$getLoadKey$1;
        int i;
        PagingSource.LoadResult.Page page2;
        PageFetcherSnapshotState.Holder holder;
        MutexImpl mutexImpl;
        int hashCode;
        LinkedHashMap linkedHashMap;
        Object obj;
        try {
            if (continuationImpl instanceof PageFetcherSnapshot$getLoadKey$1) {
                pageFetcherSnapshot$getLoadKey$1 = (PageFetcherSnapshot$getLoadKey$1) continuationImpl;
                int i2 = pageFetcherSnapshot$getLoadKey$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    pageFetcherSnapshot$getLoadKey$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj2 = pageFetcherSnapshot$getLoadKey$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pageFetcherSnapshot$getLoadKey$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        PageFetcherSnapshotState.Holder holder2 = this.stateHolder;
                        MutexImpl mutexImpl2 = holder2.lock;
                        pageFetcherSnapshot$getLoadKey$1.L$0 = page;
                        pageFetcherSnapshot$getLoadKey$1.L$1 = holder2;
                        pageFetcherSnapshot$getLoadKey$1.L$2 = mutexImpl2;
                        pageFetcherSnapshot$getLoadKey$1.label = 1;
                        if (mutexImpl2.lock(pageFetcherSnapshot$getLoadKey$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        page2 = page;
                        holder = holder2;
                        mutexImpl = mutexImpl2;
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutexImpl = pageFetcherSnapshot$getLoadKey$1.L$2;
                        holder = pageFetcherSnapshot$getLoadKey$1.L$1;
                        page2 = pageFetcherSnapshot$getLoadKey$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                    }
                    PageFetcherSnapshotState pageFetcherSnapshotState = holder.state;
                    pageFetcherSnapshotState.getClass();
                    page2.getClass();
                    hashCode = page2.hashCode();
                    linkedHashMap = pageFetcherSnapshotState.pageKeys;
                    if (linkedHashMap.containsKey(Integer.valueOf(hashCode))) {
                        OptionalProvider$$ExternalSyntheticLambda0.m$2("Load key not found for Page ", page2, ". This likely indicates an error in the library. Please file a bug in the Buganizer.");
                        obj = null;
                    } else {
                        obj = linkedHashMap.get(Integer.valueOf(hashCode));
                    }
                    return obj;
                }
            }
            PageFetcherSnapshotState pageFetcherSnapshotState2 = holder.state;
            pageFetcherSnapshotState2.getClass();
            page2.getClass();
            hashCode = page2.hashCode();
            linkedHashMap = pageFetcherSnapshotState2.pageKeys;
            if (linkedHashMap.containsKey(Integer.valueOf(hashCode))) {
            }
            return obj;
        } finally {
            mutexImpl.unlock(null);
        }
        pageFetcherSnapshot$getLoadKey$1 = new PageFetcherSnapshot$getLoadKey$1(this, continuationImpl);
        Object obj22 = pageFetcherSnapshot$getLoadKey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pageFetcherSnapshot$getLoadKey$1.label;
        if (i != 0) {
        }
    }

    public final PagingSource.LoadParams loadParams(LoadType loadType, Object obj) {
        int i = loadType == LoadType.REFRESH ? this.initialLoadSize : this.config.pageSize;
        loadType.getClass();
        int ordinal = loadType.ordinal();
        if (ordinal == 0) {
            return new PagingSource.LoadParams.Refresh(obj, i);
        }
        if (ordinal == 1) {
            if (obj != null) {
                return new PagingSource.LoadParams.Prepend(obj, i);
            }
            a$$ExternalSyntheticBUOutline0.m$3("key cannot be null for prepend");
            return null;
        }
        if (ordinal != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        if (obj != null) {
            return new PagingSource.LoadParams.Append(obj, i);
        }
        a$$ExternalSyntheticBUOutline0.m$3("key cannot be null for append");
        return null;
    }

    public final Object nextLoadKeyOrNull(PageFetcherSnapshotState pageFetcherSnapshotState, LoadType loadType, int i, int i2) {
        pageFetcherSnapshotState.getClass();
        int ordinal = loadType.ordinal();
        if (ordinal == 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Cannot get loadId for loadType: REFRESH");
            return null;
        }
        if (ordinal != 1 && ordinal != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        if (i != 0 || (pageFetcherSnapshotState.sourceLoadStates.get(loadType) instanceof LoadState.Error) || i2 >= this.config.prefetchDistance) {
            return null;
        }
        LoadType loadType2 = LoadType.PREPEND;
        ArrayList arrayList = pageFetcherSnapshotState.pages;
        return loadType == loadType2 ? ((PagingSource.LoadResult.Page) CollectionsKt.first((List) arrayList)).prevKey : ((PagingSource.LoadResult.Page) CollectionsKt.last((List) arrayList)).nextKey;
    }

    public final Object setError(PageFetcherSnapshotState pageFetcherSnapshotState, LoadType loadType, LoadState.Error error, ContinuationImpl continuationImpl) {
        SingleRunner$Holder singleRunner$Holder = pageFetcherSnapshotState.sourceLoadStates;
        if (singleRunner$Holder.get(loadType).equals(error)) {
            return Unit.INSTANCE;
        }
        singleRunner$Holder.set(loadType, error);
        Object send = this.pageEventCh.send(new PageEvent.LoadStateUpdate(singleRunner$Holder.snapshot(), null), continuationImpl);
        return send == CoroutineSingletons.COROUTINE_SUSPENDED ? send : Unit.INSTANCE;
    }

    public final Object setLoading(PageFetcherSnapshotState pageFetcherSnapshotState, LoadType loadType, ContinuationImpl continuationImpl) {
        SingleRunner$Holder singleRunner$Holder = pageFetcherSnapshotState.sourceLoadStates;
        LoadState loadState = singleRunner$Holder.get(loadType);
        LoadState.Loading loading = LoadState.Loading.INSTANCE;
        if (loadState.equals(loading)) {
            return Unit.INSTANCE;
        }
        singleRunner$Holder.set(loadType, loading);
        Object send = this.pageEventCh.send(new PageEvent.LoadStateUpdate(singleRunner$Holder.snapshot(), null), continuationImpl);
        return send == CoroutineSingletons.COROUTINE_SUSPENDED ? send : Unit.INSTANCE;
    }
}
