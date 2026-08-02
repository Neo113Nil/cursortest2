package com.squareup.cash.activity.backend.loader;

import app.cash.badging.api.Badger2;
import app.cash.badging.backend.RealBadger2;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkFetcher$doFetch$2;
import com.google.crypto.tink.KeysetHandle;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.ZiplineActivityItemFormatter;
import com.squareup.cash.activity.backend.contacts.DeviceContactItemTransformer;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.badging.api.ItemType;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealActivitiesManager implements ActivitiesManager {
    public final SharedFlowImpl activities;
    public final ActivitiesManager.ActivityContext activityContext;
    public final Badger2 badger2;
    public final ActivitiesCache cache;
    public final ErrorReporter errorReporter;
    public final SharedFlowImpl firstServerPagesFlow;
    public final CoroutineContext ioDispatcher;
    public final GrpcMethod requestHandler;

    public RealActivitiesManager(ActivitiesManager.ActivityContext activityContext, ActivitiesCache activitiesCache, CoroutineContext coroutineContext, Badger2 badger2, ErrorReporter errorReporter, ActivityClientService activityClientService, DefaultGetRequestHandler$Factory defaultGetRequestHandler$Factory, FormattingPageRequestHandler$Factory$Impl formattingPageRequestHandler$Factory$Impl) {
        activityContext.getClass();
        activitiesCache.getClass();
        this.activityContext = activityContext;
        this.cache = activitiesCache;
        this.ioDispatcher = coroutineContext;
        this.badger2 = badger2;
        this.errorReporter = errorReporter;
        Object obj = activityContext.requestHandler;
        obj = obj == null ? new WireAdapter(activityClientService) : obj;
        KeysetHandle keysetHandle = formattingPageRequestHandler$Factory$Impl.delegateFactory;
        ZiplineActivityItemFormatter ziplineActivityItemFormatter = (ZiplineActivityItemFormatter) ((Provider) keysetHandle.entries).invoke();
        DeviceContactItemTransformer deviceContactItemTransformer = (DeviceContactItemTransformer) ((RealPasscodeFlowStarter.MetroFactory) keysetHandle.annotationsMap).invoke();
        ziplineActivityItemFormatter.getClass();
        this.requestHandler = new GrpcMethod(ziplineActivityItemFormatter, obj, deviceContactItemTransformer);
        defaultGetRequestHandler$Factory.create();
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(1, 0, bufferOverflow, 2);
        Activities activities = activitiesCache.get();
        if (activities != null) {
            StateFlowKt.emitOrThrow(MutableSharedFlow$default, activities);
        }
        this.activities = MutableSharedFlow$default;
        this.firstServerPagesFlow = FlowKt.MutableSharedFlow$default(1, 0, bufferOverflow, 2);
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager
    public final Flow activities() {
        return FlowKt.callbackFlow(new NetworkFetcher$doFetch$2(this, null, 17));
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager
    public final void clear() {
        StateFlowKt.emitOrThrow(this.activities, new Activities(EmptyList.INSTANCE, LoadingState.LOADED, 14));
        this.firstServerPagesFlow.resetReplayCache();
        this.cache.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x020b, code lost:
    
        if (r20.firstServerPagesFlow.emit(r4, r2) == r3) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c8, code lost:
    
        if (r7.emit(r0, r2) == r3) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00a3, code lost:
    
        if (r1 == r3) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x008b, code lost:
    
        if (r7.emit(r1, r2) == r3) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doLoad(ActivitiesManager.ActivityPage.PageOffset pageOffset, Continuation continuation) {
        RealActivitiesManager$doLoad$1 realActivitiesManager$doLoad$1;
        int i;
        Activities activities;
        ActivitiesManager.ActivityPage.PageOffset pageOffset2;
        Activities activities2;
        ActivitiesManager.ActivityPage activityPage;
        List activities3;
        List recentActivities;
        Activities activities4;
        ActivitiesManager.ActivityPage.PageOffset pageOffset3;
        Activities activities5;
        if (continuation instanceof RealActivitiesManager$doLoad$1) {
            realActivitiesManager$doLoad$1 = (RealActivitiesManager$doLoad$1) continuation;
            int i2 = realActivitiesManager$doLoad$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realActivitiesManager$doLoad$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realActivitiesManager$doLoad$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realActivitiesManager$doLoad$1.label;
                int i3 = 4;
                SharedFlowImpl sharedFlowImpl = this.activities;
                Continuation continuation2 = null;
                switch (i) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        activities = (Activities) CollectionsKt.firstOrNull(sharedFlowImpl.getReplayCache());
                        Activities copy$default = activities != null ? Activities.copy$default(activities, null, LoadingState.LOADING, 15) : new Activities(null, LoadingState.LOADING, 15);
                        pageOffset2 = pageOffset;
                        realActivitiesManager$doLoad$1.L$0 = pageOffset2;
                        realActivitiesManager$doLoad$1.L$1 = activities;
                        realActivitiesManager$doLoad$1.label = 1;
                        break;
                    case 1:
                        activities = realActivitiesManager$doLoad$1.L$1;
                        pageOffset2 = realActivitiesManager$doLoad$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        NetworkFetcher$doFetch$2 networkFetcher$doFetch$2 = new NetworkFetcher$doFetch$2(this, pageOffset2, continuation2, 18);
                        realActivitiesManager$doLoad$1.L$0 = pageOffset2;
                        realActivitiesManager$doLoad$1.L$1 = activities;
                        realActivitiesManager$doLoad$1.label = 2;
                        obj = JobKt.withContext(this.ioDispatcher, networkFetcher$doFetch$2, realActivitiesManager$doLoad$1);
                        break;
                    case 2:
                        activities = realActivitiesManager$doLoad$1.L$1;
                        pageOffset2 = realActivitiesManager$doLoad$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        ActivitiesManager.ActivityPage activityPage2 = (ActivitiesManager.ActivityPage) obj;
                        if (activityPage2 != null) {
                            realActivitiesManager$doLoad$1.L$0 = pageOffset2;
                            realActivitiesManager$doLoad$1.L$1 = activities;
                            realActivitiesManager$doLoad$1.L$2 = activityPage2;
                            realActivitiesManager$doLoad$1.label = 4;
                            List<ActivityData> activities6 = activityPage2.getActivities();
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(activities6, 10));
                            for (ActivityData activityData : activities6) {
                                arrayList.add(new Badger2.BadgingInfo(activityData.getRowId(), activityData.getVersion(), activityData.isBadged(), CollectionsKt__CollectionsJVMKt.listOf("ACTIVITY"), ItemType.ACTIVITY));
                            }
                            Object updateBadgingInfo = ((RealBadger2) this.badger2).updateBadgingInfo(arrayList, realActivitiesManager$doLoad$1);
                            if (updateBadgingInfo != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                updateBadgingInfo = Unit.INSTANCE;
                            }
                            if (updateBadgingInfo != coroutineSingletons) {
                                activities2 = activities;
                                activityPage = activityPage2;
                                if (pageOffset2 != null) {
                                    activities3 = activityPage.getActivities();
                                } else if (activities2 == null || (recentActivities = activities2.getRecentActivities()) == null) {
                                    activities3 = activityPage.getActivities();
                                } else {
                                    List list = recentActivities;
                                    List activities7 = activityPage.getActivities();
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    Iterator it = recentActivities.iterator();
                                    while (it.hasNext()) {
                                        linkedHashSet.add(((ActivityItem) it.next()).getRowId());
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj2 : activities7) {
                                        if (linkedHashSet.contains(((ActivityItem) obj2).getRowId())) {
                                            arrayList3.add(obj2);
                                        } else {
                                            arrayList2.add(obj2);
                                        }
                                    }
                                    if (!arrayList3.isEmpty()) {
                                        this.errorReporter.report(new ActivitiesManagerError(this.activityContext, new Pair("Duplicate Row IDs", CollectionsKt.joinToString$default(arrayList3, null, null, null, 0, null, new ActivityTabViewKt$$ExternalSyntheticLambda17(i3), 31))), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                                    }
                                    activities3 = CollectionsKt.plus((Iterable) arrayList2, (Collection) list);
                                }
                                activities4 = new Activities(activities3, null, activityPage.getNextPageCursor(), activityPage.getHasNextPage(), LoadingState.LOADED);
                                realActivitiesManager$doLoad$1.L$0 = pageOffset2;
                                realActivitiesManager$doLoad$1.L$1 = null;
                                realActivitiesManager$doLoad$1.L$2 = null;
                                realActivitiesManager$doLoad$1.L$4 = activities4;
                                realActivitiesManager$doLoad$1.label = 5;
                                if (sharedFlowImpl.emit(activities4, realActivitiesManager$doLoad$1) != coroutineSingletons) {
                                    pageOffset3 = pageOffset2;
                                    activities5 = activities4;
                                    this.cache.set(activities5);
                                    if (pageOffset3 == null) {
                                        return Unit.INSTANCE;
                                    }
                                    realActivitiesManager$doLoad$1.L$0 = null;
                                    realActivitiesManager$doLoad$1.L$1 = null;
                                    realActivitiesManager$doLoad$1.L$2 = null;
                                    realActivitiesManager$doLoad$1.L$4 = null;
                                    realActivitiesManager$doLoad$1.label = 6;
                                    break;
                                }
                            }
                        } else {
                            Activities copy$default2 = activities != null ? Activities.copy$default(activities, null, LoadingState.ERROR, 15) : new Activities(null, LoadingState.ERROR, 15);
                            realActivitiesManager$doLoad$1.L$0 = null;
                            realActivitiesManager$doLoad$1.L$1 = null;
                            realActivitiesManager$doLoad$1.L$2 = null;
                            realActivitiesManager$doLoad$1.label = 3;
                            break;
                        }
                        return coroutineSingletons;
                    case 3:
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 4:
                        activityPage = realActivitiesManager$doLoad$1.L$2;
                        activities2 = realActivitiesManager$doLoad$1.L$1;
                        pageOffset2 = realActivitiesManager$doLoad$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        if (pageOffset2 != null) {
                        }
                        activities4 = new Activities(activities3, null, activityPage.getNextPageCursor(), activityPage.getHasNextPage(), LoadingState.LOADED);
                        realActivitiesManager$doLoad$1.L$0 = pageOffset2;
                        realActivitiesManager$doLoad$1.L$1 = null;
                        realActivitiesManager$doLoad$1.L$2 = null;
                        realActivitiesManager$doLoad$1.L$4 = activities4;
                        realActivitiesManager$doLoad$1.label = 5;
                        if (sharedFlowImpl.emit(activities4, realActivitiesManager$doLoad$1) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 5:
                        activities5 = realActivitiesManager$doLoad$1.L$4;
                        pageOffset3 = realActivitiesManager$doLoad$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        this.cache.set(activities5);
                        if (pageOffset3 == null) {
                        }
                        break;
                    case 6:
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        realActivitiesManager$doLoad$1 = new RealActivitiesManager$doLoad$1(this, continuation);
        Object obj3 = realActivitiesManager$doLoad$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realActivitiesManager$doLoad$1.label;
        int i32 = 4;
        SharedFlowImpl sharedFlowImpl2 = this.activities;
        Continuation continuation22 = null;
        switch (i) {
        }
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager
    public final Flow firstServerPages() {
        return this.firstServerPagesFlow;
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager
    public final Object load(ActivitiesManager.LoadMode loadMode, Continuation continuation) {
        Activities activities = (Activities) CollectionsKt.firstOrNull(this.activities.getReplayCache());
        int ordinal = loadMode.ordinal();
        if (ordinal == 0) {
            Object doLoad = doLoad(null, continuation);
            return doLoad == CoroutineSingletons.COROUTINE_SUSPENDED ? doLoad : Unit.INSTANCE;
        }
        if (ordinal != 1) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        if (activities != null && !activities.getHasMore()) {
            return Unit.INSTANCE;
        }
        Object doLoad2 = doLoad(activities != null ? activities.getNextPageCursor() : null, continuation);
        return doLoad2 == CoroutineSingletons.COROUTINE_SUSPENDED ? doLoad2 : Unit.INSTANCE;
    }

    public final class MetroFactory {
        public final Provider appService;
        public final Provider badger2;
        public final Provider defaultGetRequestHandlerFactory;
        public final Provider errorReporter;
        public final InstanceFactory formattingPageRequestHandlerFactory;
        public final Provider ioDispatcher;

        public MetroFactory(RealMessageSigner.MetroFactory metroFactory, InstanceFactory instanceFactory, RealKeyStoreProvider.MetroFactory metroFactory2, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory) {
            this.ioDispatcher = metroFactory;
            this.formattingPageRequestHandlerFactory = instanceFactory;
            this.badger2 = metroFactory2;
            this.errorReporter = lambdaProvider;
            this.appService = lambdaProvider2;
            this.defaultGetRequestHandlerFactory = musicViewFactory$MetroFactory;
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, InstanceFactory instanceFactory) {
            this.ioDispatcher = provider;
            this.badger2 = provider2;
            this.errorReporter = provider3;
            this.appService = provider4;
            this.defaultGetRequestHandlerFactory = provider5;
            this.formattingPageRequestHandlerFactory = instanceFactory;
        }

        public /* synthetic */ MetroFactory(Provider provider, DoubleCheck doubleCheck, Provider provider2, DoubleCheck doubleCheck2, InstanceFactory instanceFactory, Provider provider3) {
            this.ioDispatcher = provider;
            this.badger2 = doubleCheck;
            this.errorReporter = provider2;
            this.appService = doubleCheck2;
            this.formattingPageRequestHandlerFactory = instanceFactory;
            this.defaultGetRequestHandlerFactory = provider3;
        }

        public MetroFactory(DoubleCheck doubleCheck, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5) {
            this.ioDispatcher = doubleCheck;
            this.badger2 = instanceFactory;
            this.errorReporter = instanceFactory2;
            this.formattingPageRequestHandlerFactory = instanceFactory3;
            this.appService = instanceFactory4;
            this.defaultGetRequestHandlerFactory = instanceFactory5;
        }
    }
}
