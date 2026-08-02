package com.squareup.cash.globalsearch.backend.real;

import androidx.camera.camera2.pipe.core.Threads$runBlockingCheckedOrNull$1$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$GlobalSearchNetworkLoadingTimeoutSeconds;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.globalsearch.backend.api.SearchResult;
import com.squareup.cash.globalsearch.backend.real.RealGlobalSearchRepository;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseSectionModel;
import com.squareup.cash.recipients.backend.api.RecipientSuggestionsProvider$RecipientWithAnalyticsData;
import com.squareup.cash.recipients.backend.api.RecipientSuggestionsProvider$SuggestionType;
import com.squareup.cash.recipients.backend.real.RealRecipientSuggestionsProvider;
import com.squareup.protos.cash.discover.api.app.v2.api.SearchRequest;
import com.squareup.protos.franklin.common.Orientation;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealGlobalSearchRepository$getInitialResults$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ProducerScope $$this$channelFlow;
    public final /* synthetic */ String $externalId;
    public final /* synthetic */ String $globalSearchFlowToken;
    public final /* synthetic */ SearchRequest.Origin $origin;
    public final /* synthetic */ String $query;
    public long J$0;
    public /* synthetic */ Object L$0;
    public List L$2;
    public List L$3;
    public Deferred L$4;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ RealGlobalSearchRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGlobalSearchRepository$getInitialResults$1$1(RealGlobalSearchRepository realGlobalSearchRepository, String str, String str2, ProducerScope producerScope, String str3, SearchRequest.Origin origin, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realGlobalSearchRepository;
        this.$query = str;
        this.$globalSearchFlowToken = str2;
        this.$$this$channelFlow = producerScope;
        this.$externalId = str3;
        this.$origin = origin;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealGlobalSearchRepository$getInitialResults$1$1 realGlobalSearchRepository$getInitialResults$1$1 = new RealGlobalSearchRepository$getInitialResults$1$1(this.this$0, this.$query, this.$globalSearchFlowToken, this.$$this$channelFlow, this.$externalId, this.$origin, continuation);
        realGlobalSearchRepository$getInitialResults$1$1.L$0 = obj;
        return realGlobalSearchRepository$getInitialResults$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealGlobalSearchRepository$getInitialResults$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f5, code lost:
    
        if (r3 == r2) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x036a, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r16)._channel.send(r5, r23) == r2) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x032a, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r16)._channel.send(r5, r23) == r2) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0304, code lost:
    
        if (r4 == r2) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x023a, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r16)._channel.send(r1, r23) == r2) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0298, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r16)._channel.send(r5, r23) == r2) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02ec, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r16)._channel.send(r4, r23) == r2) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0341, code lost:
    
        if (r4 == r2) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019f, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r9)._channel.send(r1, r23) == r2) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x023e  */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r1v18, types: [kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, java.util.List, kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object, java.util.List, kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.Object, java.util.List, kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object, java.util.List, kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object first;
        ArrayList arrayList;
        Object obj3;
        ProducerScope producerScope;
        Object awaitInternal;
        long j;
        Object m4185withTimeoutOrNullKLykuaI;
        ArrayList arrayList2;
        Object obj4;
        DeferredCoroutine deferredCoroutine;
        List list;
        ArrayList arrayList3;
        ?? r3;
        DeferredCoroutine deferredCoroutine2;
        Deferred deferred;
        boolean isCompleted;
        Object await;
        Object obj5;
        ArrayList arrayList4;
        DeferredCoroutine deferredCoroutine3;
        ?? r32;
        Object await2;
        ?? r33;
        ?? r34;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj6 = SearchResult.Error.INSTANCE;
        String str = this.$query;
        ProducerScope producerScope2 = this.$$this$channelFlow;
        String str2 = this.$globalSearchFlowToken;
        RealGlobalSearchRepository realGlobalSearchRepository = this.this$0;
        switch (i) {
            case 0:
                SafeTrace.throwOnFailure(obj);
                obj2 = obj6;
                ChannelFlowTransformLatest sections$default = RealRecipientSuggestionsProvider.sections$default(realGlobalSearchRepository.recipientProvider, new AppLockMonitor$special$$inlined$map$2(str, 19), Orientation.CASH, false, null, true, new AppLockMonitor$special$$inlined$map$2(new Long(Long.MAX_VALUE), 19), 12);
                this.L$0 = coroutineScope;
                this.label = 1;
                first = FlowKt.first(sections$default, this);
                break;
            case 1:
                SafeTrace.throwOnFailure(obj);
                first = obj;
                obj2 = obj6;
                Iterable iterable = (List) ((Map) first).get(RecipientSuggestionsProvider$SuggestionType.RESULTS);
                if (iterable == null) {
                    iterable = EmptyList.INSTANCE;
                }
                Iterable iterable2 = iterable;
                ArrayList arrayList5 = new ArrayList();
                arrayList = new ArrayList();
                for (Object obj7 : iterable2) {
                    RecipientSuggestionsProvider$RecipientWithAnalyticsData recipientSuggestionsProvider$RecipientWithAnalyticsData = (RecipientSuggestionsProvider$RecipientWithAnalyticsData) obj7;
                    Recipient recipient = recipientSuggestionsProvider$RecipientWithAnalyticsData.recipient;
                    recipient.getClass();
                    String str3 = recipient.customerId;
                    if ((str3 == null || !GlobalSearchResponseMappingKt.isMerchantOrBrand(str3)) && recipientSuggestionsProvider$RecipientWithAnalyticsData.recipient.merchantData == null) {
                        arrayList.add(obj7);
                    } else {
                        arrayList5.add(obj7);
                    }
                }
                if ((str.length() <= 1 && !Character.isDigit(StringsKt___StringsKt.first(str))) || StringsKt.isBlank(str)) {
                    ListBuilder access$buildLocalSections = RealGlobalSearchRepository.access$buildLocalSections(realGlobalSearchRepository, arrayList5, arrayList, str2);
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(access$buildLocalSections, 10));
                    ListIterator listIterator = access$buildLocalSections.listIterator(0);
                    while (true) {
                        ListBuilder.Itr itr = (ListBuilder.Itr) listIterator;
                        if (!itr.hasNext()) {
                            SearchResult.LocalFirst localFirst = new SearchResult.LocalFirst(arrayList6);
                            this.L$0 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.label = 2;
                            break;
                        } else {
                            arrayList6.add(new RealGlobalSearchRepository.RealSectionHandle(realGlobalSearchRepository, (GlobalSearchResponseSectionModel) itr.next()));
                        }
                    }
                } else {
                    obj3 = null;
                    obj4 = null;
                    DeferredCoroutine async$default = JobKt.async$default(coroutineScope, null, null, new ZiplineLoader$load$2(realGlobalSearchRepository, arrayList5, arrayList, this.$globalSearchFlowToken, this.$query, this.$origin, this.$externalId, iterable2, null, 19), 3);
                    long j2 = ((FeatureFlag$LongFeatureFlag.Value) ((RealFeatureFlagManager) realGlobalSearchRepository.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$GlobalSearchNetworkLoadingTimeoutSeconds.INSTANCE)).value;
                    if (j2 > 0) {
                        Duration.Companion companion = Duration.Companion;
                        producerScope = producerScope2;
                        long duration = DurationKt.toDuration(j2, DurationUnit.SECONDS);
                        Threads$runBlockingCheckedOrNull$1$1 threads$runBlockingCheckedOrNull$1$1 = new Threads$runBlockingCheckedOrNull$1$1(async$default, null, 1);
                        this.L$0 = null;
                        this.L$2 = arrayList5;
                        this.L$3 = arrayList;
                        this.L$4 = async$default;
                        this.J$0 = j2;
                        this.label = 3;
                        m4185withTimeoutOrNullKLykuaI = JobKt.m4185withTimeoutOrNullKLykuaI(duration, threads$runBlockingCheckedOrNull$1$1, this);
                        if (m4185withTimeoutOrNullKLykuaI != coroutineSingletons) {
                            j = j2;
                            deferredCoroutine = async$default;
                            arrayList2 = arrayList5;
                            list = (List) m4185withTimeoutOrNullKLykuaI;
                            deferredCoroutine2 = deferredCoroutine;
                            r3 = obj4;
                            arrayList3 = arrayList2;
                            deferred = deferredCoroutine2;
                            if (list == null) {
                                SearchResult.Success success = new SearchResult.Success(list);
                                this.L$0 = r3;
                                this.L$2 = r3;
                                this.L$3 = r3;
                                this.L$4 = r3;
                                this.J$0 = j;
                                this.label = 5;
                                break;
                            } else {
                                isCompleted = deferred.isCompleted();
                                if (isCompleted) {
                                    ListBuilder access$buildLocalSections2 = RealGlobalSearchRepository.access$buildLocalSections(realGlobalSearchRepository, arrayList3, arrayList, str2);
                                    if (access$buildLocalSections2.isEmpty()) {
                                        obj5 = obj2;
                                    } else {
                                        ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(access$buildLocalSections2, 10));
                                        ListIterator listIterator2 = access$buildLocalSections2.listIterator(0);
                                        while (true) {
                                            ListBuilder.Itr itr2 = (ListBuilder.Itr) listIterator2;
                                            if (itr2.hasNext()) {
                                                arrayList7.add(new RealGlobalSearchRepository.RealSectionHandle(realGlobalSearchRepository, (GlobalSearchResponseSectionModel) itr2.next()));
                                            } else {
                                                obj5 = new SearchResult.LocalOnly(arrayList7);
                                            }
                                        }
                                    }
                                    this.L$0 = r3;
                                    this.L$2 = r3;
                                    this.L$3 = r3;
                                    this.L$4 = r3;
                                    this.J$0 = j;
                                    this.Z$0 = isCompleted;
                                    this.label = 6;
                                    break;
                                } else {
                                    ListBuilder access$buildLocalSections3 = RealGlobalSearchRepository.access$buildLocalSections(realGlobalSearchRepository, arrayList3, arrayList, str2);
                                    if (access$buildLocalSections3.isEmpty()) {
                                        this.L$0 = r3;
                                        this.L$2 = r3;
                                        this.L$3 = r3;
                                        this.L$4 = r3;
                                        this.J$0 = j;
                                        this.Z$0 = isCompleted;
                                        this.label = 10;
                                        await = deferred.await(this);
                                        r34 = r3;
                                        break;
                                    } else {
                                        ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(access$buildLocalSections3, 10));
                                        ListIterator listIterator3 = access$buildLocalSections3.listIterator(0);
                                        while (true) {
                                            ListBuilder.Itr itr3 = (ListBuilder.Itr) listIterator3;
                                            if (!itr3.hasNext()) {
                                                SearchResult.LocalFirst localFirst2 = new SearchResult.LocalFirst(arrayList8);
                                                this.L$0 = r3;
                                                this.L$2 = r3;
                                                this.L$3 = r3;
                                                this.L$4 = deferred;
                                                this.J$0 = j;
                                                this.Z$0 = isCompleted;
                                                this.label = 7;
                                                r32 = r3;
                                                break;
                                            } else {
                                                arrayList8.add(new RealGlobalSearchRepository.RealSectionHandle(realGlobalSearchRepository, (GlobalSearchResponseSectionModel) itr3.next()));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        producerScope = producerScope2;
                        this.L$0 = null;
                        this.L$2 = arrayList5;
                        this.L$3 = arrayList;
                        this.L$4 = async$default;
                        this.J$0 = j2;
                        this.label = 4;
                        awaitInternal = async$default.awaitInternal(this);
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (awaitInternal != coroutineSingletons) {
                            j = j2;
                            deferredCoroutine3 = async$default;
                            arrayList4 = arrayList5;
                            list = (List) awaitInternal;
                            deferredCoroutine2 = deferredCoroutine3;
                            r3 = obj3;
                            arrayList3 = arrayList4;
                            deferred = deferredCoroutine2;
                            if (list == null) {
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                List list2 = this.L$3;
                List list3 = this.L$2;
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 3:
                j = this.J$0;
                ?? r1 = this.L$4;
                List list4 = this.L$3;
                List list5 = this.L$2;
                SafeTrace.throwOnFailure(obj);
                m4185withTimeoutOrNullKLykuaI = obj;
                arrayList = list4;
                obj2 = obj6;
                producerScope = producerScope2;
                obj4 = null;
                deferredCoroutine = r1;
                arrayList2 = list5;
                list = (List) m4185withTimeoutOrNullKLykuaI;
                deferredCoroutine2 = deferredCoroutine;
                r3 = obj4;
                arrayList3 = arrayList2;
                deferred = deferredCoroutine2;
                if (list == null) {
                }
                break;
            case 4:
                j = this.J$0;
                ?? r12 = this.L$4;
                List list6 = this.L$3;
                List list7 = this.L$2;
                SafeTrace.throwOnFailure(obj);
                awaitInternal = obj;
                arrayList = list6;
                obj2 = obj6;
                producerScope = producerScope2;
                obj3 = null;
                deferredCoroutine3 = r12;
                arrayList4 = list7;
                list = (List) awaitInternal;
                deferredCoroutine2 = deferredCoroutine3;
                r3 = obj3;
                arrayList3 = arrayList4;
                deferred = deferredCoroutine2;
                if (list == null) {
                }
                break;
            case 5:
            case 6:
            case 9:
            case 11:
                List list8 = this.L$3;
                List list9 = this.L$2;
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 7:
                isCompleted = this.Z$0;
                long j3 = this.J$0;
                deferred = this.L$4;
                List list10 = this.L$3;
                List list11 = this.L$2;
                SafeTrace.throwOnFailure(obj);
                j = j3;
                producerScope = producerScope2;
                r32 = 0;
                this.L$0 = r32;
                this.L$2 = r32;
                this.L$3 = r32;
                this.L$4 = r32;
                this.J$0 = j;
                this.Z$0 = isCompleted;
                this.label = 8;
                await2 = deferred.await(this);
                r33 = r32;
                break;
            case 8:
                isCompleted = this.Z$0;
                long j4 = this.J$0;
                List list12 = this.L$3;
                List list13 = this.L$2;
                SafeTrace.throwOnFailure(obj);
                j = j4;
                producerScope = producerScope2;
                r33 = 0;
                await2 = obj;
                List list14 = (List) await2;
                if (list14 != null) {
                    SearchResult.Success success2 = new SearchResult.Success(list14);
                    this.L$0 = r33;
                    this.L$2 = r33;
                    this.L$3 = r33;
                    this.L$4 = r33;
                    this.J$0 = j;
                    this.Z$0 = isCompleted;
                    this.label = 9;
                    break;
                }
                return Unit.INSTANCE;
            case 10:
                isCompleted = this.Z$0;
                long j5 = this.J$0;
                List list15 = this.L$3;
                List list16 = this.L$2;
                SafeTrace.throwOnFailure(obj);
                j = j5;
                obj2 = obj6;
                producerScope = producerScope2;
                r34 = 0;
                await = obj;
                List list17 = (List) await;
                Object success3 = list17 != null ? new SearchResult.Success(list17) : obj2;
                this.L$0 = r34;
                this.L$2 = r34;
                this.L$3 = r34;
                this.L$4 = r34;
                this.J$0 = j;
                this.Z$0 = isCompleted;
                this.label = 11;
                break;
            default:
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
