package app.cash.local.backend.real;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.SliderState$drag$2;
import androidx.core.os.BundleKt;
import app.cash.api.ApiResult;
import app.cash.local.backend.BuyerIntentManager;
import app.cash.local.backend.BuyerIntentManagerKt;
import app.cash.local.backend.BuyerIntentScope;
import app.cash.local.backend.BuyerIntentState;
import app.cash.local.backend.BuyerIntentType;
import app.cash.local.backend.CartBuilder;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.service.LocalService;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda0;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda3;
import coil3.ImageLoader$Builder;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import coil3.RealImageLoader;
import coil3.Uri;
import coil3.decode.Decoder;
import coil3.network.NetworkFetcher;
import com.google.android.gms.internal.mlkit_vision_common.zzja;
import com.google.android.gms.internal.mlkit_vision_common.zzjh;
import com.google.android.gms.internal.mlkit_vision_common.zzji;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.wallet.presenters.RealNextUpCandidateDismisser;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.cash.local.client.v1.LocalInStoreOrderingIntent;
import com.squareup.protos.cash.local.client.v1.LocalRemoteOrderingIntent;
import com.squareup.protos.cash.local.client.v1.LocalShoppingCart;
import com.squareup.protos.cash.local.client.v1.LocalUserIntent;
import com.squareup.protos.cash.local.client.v1.LocalUserIntent$Intent$InStoreOrdering;
import com.squareup.protos.cash.local.client.v1.LocalUserIntent$Intent$RemoteOrdering;
import com.squareup.protos.cash.local.client.v1.UpdateUserIntentRequest;
import com.squareup.protos.cash.local.client.v1.UpdateUserIntentRequest$Update$InStoreOrdering;
import com.squareup.protos.cash.local.client.v1.UpdateUserIntentRequest$Update$RemoteOrdering;
import com.squareup.protos.cash.local.client.v1.UpdateUserIntentResponse;
import com.squareup.protos.cash.local.client.v1.UpdateUserIntentResponse$Response$ErrorResponse;
import com.squareup.protos.cash.local.client.v1.UpdateUserIntentResponse$Response$Success;
import com.squareup.protos.cash.weaver.api.WeaverApi;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.StateFlowImpl;
import okhttp3.Call;
import okio.AsyncTimeout;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import papa.internal.Perfs$$ExternalSyntheticLambda4;

/* loaded from: classes3.dex */
public final class BuyerIntentSyncManager {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long debounceInterval;
    public final BuyerIntentManager buyerIntentManager;
    public final CoroutineScope scope;
    public final LocalService service;
    public final SessionManager sessionManager;
    public final ConcurrentHashMap requestIds = new ConcurrentHashMap();
    public final Object lock = new Object();
    public final ConcurrentHashMap syncJobs = new ConcurrentHashMap();

    public final class Combination {
        public final List discountCodes;
        public final FulfillmentConfiguration fulfillmentConfiguration;
        public final List selections;

        public Combination(List list, List list2, FulfillmentConfiguration fulfillmentConfiguration) {
            list.getClass();
            list2.getClass();
            fulfillmentConfiguration.getClass();
            this.selections = list;
            this.discountCodes = list2;
            this.fulfillmentConfiguration = fulfillmentConfiguration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Combination)) {
                return false;
            }
            Combination combination = (Combination) obj;
            return Intrinsics.areEqual(this.selections, combination.selections) && Intrinsics.areEqual(this.discountCodes, combination.discountCodes) && Intrinsics.areEqual(this.fulfillmentConfiguration, combination.fulfillmentConfiguration);
        }

        public final int hashCode() {
            return this.fulfillmentConfiguration.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.selections.hashCode() * 31, 31, this.discountCodes);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("Combination(selections=", ", discountCodes=", ", fulfillmentConfiguration=", this.selections, this.discountCodes);
            m.append(this.fulfillmentConfiguration);
            m.append(")");
            return m.toString();
        }
    }

    static {
        Duration.Companion companion = Duration.Companion;
        debounceInterval = DurationKt.toDuration(200, DurationUnit.MILLISECONDS);
    }

    public BuyerIntentSyncManager(LocalService localService, SessionManager sessionManager, BuyerIntentManager buyerIntentManager, CoroutineScope coroutineScope) {
        this.service = localService;
        this.sessionManager = sessionManager;
        this.buyerIntentManager = buyerIntentManager;
        this.scope = coroutineScope;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bc, code lost:
    
        if (r10.equals(r7.brand_token) == false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$performRequest(BuyerIntentSyncManager buyerIntentSyncManager, BuyerIntentScope buyerIntentScope, UpdateUserIntentRequest updateUserIntentRequest, long j, String str, FulfillmentConfiguration fulfillmentConfiguration, ContinuationImpl continuationImpl) {
        BuyerIntentSyncManager$performRequest$1 buyerIntentSyncManager$performRequest$1;
        int i;
        AtomicLong atomicLong;
        LocalShoppingCart localShoppingCart;
        if (continuationImpl instanceof BuyerIntentSyncManager$performRequest$1) {
            buyerIntentSyncManager$performRequest$1 = (BuyerIntentSyncManager$performRequest$1) continuationImpl;
            int i2 = buyerIntentSyncManager$performRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                buyerIntentSyncManager$performRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = buyerIntentSyncManager$performRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = buyerIntentSyncManager$performRequest$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalService localService = buyerIntentSyncManager.service;
                    buyerIntentSyncManager$performRequest$1.L$0 = buyerIntentScope;
                    buyerIntentSyncManager$performRequest$1.L$1 = updateUserIntentRequest;
                    buyerIntentSyncManager$performRequest$1.L$2 = str;
                    buyerIntentSyncManager$performRequest$1.L$3 = fulfillmentConfiguration;
                    buyerIntentSyncManager$performRequest$1.J$0 = j;
                    buyerIntentSyncManager$performRequest$1.label = 1;
                    obj = localService.updateUserIntent(updateUserIntentRequest, buyerIntentSyncManager$performRequest$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = buyerIntentSyncManager$performRequest$1.J$0;
                    fulfillmentConfiguration = buyerIntentSyncManager$performRequest$1.L$3;
                    str = buyerIntentSyncManager$performRequest$1.L$2;
                    updateUserIntentRequest = buyerIntentSyncManager$performRequest$1.L$1;
                    buyerIntentScope = buyerIntentSyncManager$performRequest$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                atomicLong = (AtomicLong) buyerIntentSyncManager.requestIds.get(buyerIntentScope);
                if (j == (atomicLong == null ? atomicLong.get() : 0L)) {
                    return BuyerIntentSyncResult.NoOp.INSTANCE;
                }
                BuyerIntentState current = ((RealBuyerIntentManager) buyerIntentSyncManager.buyerIntentManager).current(buyerIntentScope);
                if (current == null) {
                    return BuyerIntentSyncResult.ModeDisabled.INSTANCE;
                }
                if (!current.intentToken.equals(str)) {
                    return BuyerIntentSyncResult.NoOp.INSTANCE;
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    if ((apiResult instanceof ApiResult.Failure.HttpFailure) || (apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                        return new BuyerIntentSyncResult.RequestFailure((List) null, 3);
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                zzji zzjiVar = ((UpdateUserIntentResponse) ((ApiResult.Success) apiResult).response).response;
                if (!(zzjiVar instanceof UpdateUserIntentResponse$Response$Success)) {
                    if (!(zzjiVar instanceof UpdateUserIntentResponse$Response$ErrorResponse)) {
                        if (zzjiVar == null) {
                            return new BuyerIntentSyncResult.RequestFailure((List) null, 3);
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    List list = ((UpdateUserIntentResponse$Response$ErrorResponse) zzjiVar).value.errors;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str2 = ((LocalErrorResponse.Error) it.next()).message;
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                    }
                    return new BuyerIntentSyncResult.RequestFailure(list, arrayList);
                }
                LocalUserIntent localUserIntent = ((UpdateUserIntentResponse$Response$Success) zzjiVar).value.user_intent;
                if (localUserIntent == null) {
                    return new BuyerIntentSyncResult.RequestFailure(CollectionsKt__CollectionsJVMKt.listOf("missing user_intent"), 1);
                }
                String str3 = localUserIntent.brand_token;
                if (str3 != null) {
                    if (StringsKt.isBlank(str3)) {
                        str3 = null;
                    }
                    if (str3 != null) {
                    }
                }
                zzja zzjaVar = localUserIntent.intent;
                if (zzjaVar instanceof LocalUserIntent$Intent$RemoteOrdering) {
                    if (current.scope.intentType == BuyerIntentType.REMOTE_ORDERING) {
                        LocalRemoteOrderingIntent localRemoteOrderingIntent = ((LocalUserIntent$Intent$RemoteOrdering) zzjaVar).value;
                        zzjh zzjhVar = updateUserIntentRequest.update;
                        UpdateUserIntentRequest$Update$RemoteOrdering updateUserIntentRequest$Update$RemoteOrdering = zzjhVar instanceof UpdateUserIntentRequest$Update$RemoteOrdering ? (UpdateUserIntentRequest$Update$RemoteOrdering) zzjhVar : null;
                        if (updateUserIntentRequest$Update$RemoteOrdering != null && Intrinsics.areEqual(localRemoteOrderingIntent.location_token, updateUserIntentRequest$Update$RemoteOrdering.value.location_token) && localRemoteOrderingIntent.fulfillment != null) {
                            localShoppingCart = localRemoteOrderingIntent.cart;
                            if (localShoppingCart != null) {
                                return new BuyerIntentSyncResult.RequestFailure(CollectionsKt__CollectionsJVMKt.listOf("mismatched user_intent"), 1);
                            }
                            RealBuyerIntentManager realBuyerIntentManager = (RealBuyerIntentManager) buyerIntentSyncManager.buyerIntentManager;
                            BuyerIntentState buyerIntentState = BuyerIntentManagerKt.toBuyerIntentState(localUserIntent, buyerIntentScope.brandSpot, null, fulfillmentConfiguration);
                            if (buyerIntentState == null) {
                                realBuyerIntentManager.retire(buyerIntentScope);
                            } else {
                                if (!buyerIntentState.scope.equals(buyerIntentScope)) {
                                    realBuyerIntentManager.retire(buyerIntentScope);
                                }
                                synchronized (realBuyerIntentManager.lock) {
                                    ((StateFlowImpl) RealBuyerIntentManager.getOrPutStateFlow(realBuyerIntentManager.states, buyerIntentState.scope)).updateState(null, buyerIntentState);
                                    ((StateFlowImpl) RealBuyerIntentManager.getOrPutFulfillmentFlow(realBuyerIntentManager.fulfillmentConfigurations, buyerIntentState.scope)).setValue(buyerIntentState.fulfillmentConfiguration);
                                }
                            }
                            if (buyerIntentState == null) {
                                return new BuyerIntentSyncResult.RequestFailure(CollectionsKt__CollectionsJVMKt.listOf("invalid user_intent"), 1);
                            }
                            FulfillmentConfiguration fulfillmentConfiguration2 = buyerIntentState.fulfillmentConfiguration;
                            if (fulfillmentConfiguration2 != null) {
                                fulfillmentConfiguration = fulfillmentConfiguration2;
                            }
                            return new BuyerIntentSyncResult.RequestSuccess(buyerIntentState, localShoppingCart, fulfillmentConfiguration);
                        }
                    }
                    localShoppingCart = null;
                    if (localShoppingCart != null) {
                    }
                } else {
                    if (zzjaVar instanceof LocalUserIntent$Intent$InStoreOrdering) {
                        if (current.scope.intentType == BuyerIntentType.IN_STORE_ORDERING) {
                            LocalInStoreOrderingIntent localInStoreOrderingIntent = ((LocalUserIntent$Intent$InStoreOrdering) zzjaVar).value;
                            zzjh zzjhVar2 = updateUserIntentRequest.update;
                            UpdateUserIntentRequest$Update$InStoreOrdering updateUserIntentRequest$Update$InStoreOrdering = zzjhVar2 instanceof UpdateUserIntentRequest$Update$InStoreOrdering ? (UpdateUserIntentRequest$Update$InStoreOrdering) zzjhVar2 : null;
                            if (updateUserIntentRequest$Update$InStoreOrdering != null) {
                                LocalInStoreOrderingIntent localInStoreOrderingIntent2 = updateUserIntentRequest$Update$InStoreOrdering.value;
                                if (Intrinsics.areEqual(localInStoreOrderingIntent.location_token, localInStoreOrderingIntent2.location_token) && Intrinsics.areEqual(localInStoreOrderingIntent.ordering_station_token, localInStoreOrderingIntent2.ordering_station_token)) {
                                    localShoppingCart = localInStoreOrderingIntent.cart;
                                    if (localShoppingCart != null) {
                                    }
                                }
                            }
                        }
                    } else if (zzjaVar != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    localShoppingCart = null;
                    if (localShoppingCart != null) {
                    }
                }
            }
        }
        buyerIntentSyncManager$performRequest$1 = new BuyerIntentSyncManager$performRequest$1(buyerIntentSyncManager, continuationImpl);
        Object obj2 = buyerIntentSyncManager$performRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = buyerIntentSyncManager$performRequest$1.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        atomicLong = (AtomicLong) buyerIntentSyncManager.requestIds.get(buyerIntentScope);
        if (j == (atomicLong == null ? atomicLong.get() : 0L)) {
        }
    }

    public final void observeAndApplyMutations(BuyerIntentScope buyerIntentScope, CartBuilder cartBuilder) {
        buyerIntentScope.getClass();
        cartBuilder.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (this.lock) {
            Job job = (Job) this.syncJobs.get(buyerIntentScope);
            if (job == null || !job.isActive()) {
                StandaloneCoroutine launch$default = JobKt.launch$default(this.scope, null, null, new SliderState$drag$2(this, buyerIntentScope, cartBuilder, null, 19), 3);
                ref$ObjectRef.element = launch$default;
                this.syncJobs.put(buyerIntentScope, launch$default);
                if (job != null) {
                    job.cancel(null);
                }
                ((Job) ref$ObjectRef.element).invokeOnCompletion(new MenuKt$$ExternalSyntheticLambda0(27, this, buyerIntentScope, ref$ObjectRef));
            }
        }
    }

    public interface BuyerIntentSyncResult {

        public final class ModeDisabled implements BuyerIntentSyncResult {
            public static final ModeDisabled INSTANCE = new ModeDisabled();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ModeDisabled);
            }

            public final int hashCode() {
                return 305388332;
            }

            public final String toString() {
                return "ModeDisabled";
            }
        }

        public final class NoOp implements BuyerIntentSyncResult {
            public static final NoOp INSTANCE = new NoOp();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NoOp);
            }

            public final int hashCode() {
                return 1329675887;
            }

            public final String toString() {
                return "NoOp";
            }
        }

        public final class RequestSuccess implements BuyerIntentSyncResult {
            public final FulfillmentConfiguration fulfillmentConfiguration;
            public final LocalShoppingCart shoppingCart;
            public final BuyerIntentState state;

            public RequestSuccess(BuyerIntentState buyerIntentState, LocalShoppingCart localShoppingCart, FulfillmentConfiguration fulfillmentConfiguration) {
                fulfillmentConfiguration.getClass();
                this.state = buyerIntentState;
                this.shoppingCart = localShoppingCart;
                this.fulfillmentConfiguration = fulfillmentConfiguration;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RequestSuccess)) {
                    return false;
                }
                RequestSuccess requestSuccess = (RequestSuccess) obj;
                return this.state.equals(requestSuccess.state) && this.shoppingCart.equals(requestSuccess.shoppingCart) && Intrinsics.areEqual(this.fulfillmentConfiguration, requestSuccess.fulfillmentConfiguration);
            }

            public final int hashCode() {
                return this.fulfillmentConfiguration.hashCode() + ((this.shoppingCart.hashCode() + (this.state.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "RequestSuccess(state=" + this.state + ", shoppingCart=" + this.shoppingCart + ", fulfillmentConfiguration=" + this.fulfillmentConfiguration + ")";
            }
        }

        public final class RequestFailure implements BuyerIntentSyncResult {
            public final List errors;
            public final List messages;

            public RequestFailure(List list, List list2) {
                list.getClass();
                list2.getClass();
                this.errors = list;
                this.messages = list2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RequestFailure)) {
                    return false;
                }
                RequestFailure requestFailure = (RequestFailure) obj;
                return Intrinsics.areEqual(this.errors, requestFailure.errors) && Intrinsics.areEqual(this.messages, requestFailure.messages);
            }

            public final int hashCode() {
                return this.messages.hashCode() + (this.errors.hashCode() * 31);
            }

            public final String toString() {
                return "RequestFailure(errors=" + this.errors + ", messages=" + this.messages + ")";
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public RequestFailure(List list, int i) {
                this(r0, (i & 2) != 0 ? r0 : list);
                EmptyList emptyList = EmptyList.INSTANCE;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId = 1;
        public final Provider buyerIntentManager;
        public final InstanceFactory scope;
        public final DoubleCheck service;
        public final Provider sessionManager;

        public MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, InstanceFactory instanceFactory, LambdaProvider lambdaProvider2) {
            this.service = doubleCheck;
            this.sessionManager = lambdaProvider;
            this.scope = instanceFactory;
            this.buyerIntentManager = lambdaProvider2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.buyerIntentManager;
            Provider provider2 = this.sessionManager;
            DoubleCheck doubleCheck = this.service;
            InstanceFactory instanceFactory = this.scope;
            switch (i) {
                case 0:
                    LocalService localService = (LocalService) doubleCheck.getValue();
                    SessionManager sessionManager = (SessionManager) provider2.invoke();
                    BuyerIntentManager buyerIntentManager = (BuyerIntentManager) provider.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                    localService.getClass();
                    sessionManager.getClass();
                    buyerIntentManager.getClass();
                    coroutineScope.getClass();
                    return new BuyerIntentSyncManager(localService, sessionManager, buyerIntentManager, coroutineScope);
                case 1:
                    WeaverApi weaverApi = (WeaverApi) doubleCheck.getValue();
                    SessionManager sessionManager2 = (SessionManager) provider2.invoke();
                    CoroutineScope coroutineScope2 = (CoroutineScope) instanceFactory.value;
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    weaverApi.getClass();
                    sessionManager2.getClass();
                    coroutineScope2.getClass();
                    coroutineContext.getClass();
                    return new RealNextUpCandidateDismisser(weaverApi, sessionManager2, coroutineScope2, coroutineContext);
                default:
                    CoroutineScope coroutineScope3 = (CoroutineScope) instanceFactory.value;
                    RealImageLoader realImageLoader = (RealImageLoader) doubleCheck.getValue();
                    ComponentRegistry componentRegistry = (ComponentRegistry) provider2.invoke();
                    Call.Factory factory = (Call.Factory) provider.invoke();
                    coroutineScope3.getClass();
                    realImageLoader.getClass();
                    componentRegistry.getClass();
                    factory.getClass();
                    ArrayList mutableList = CollectionsKt.toMutableList((Collection) componentRegistry.interceptors);
                    ArrayList mutableList2 = CollectionsKt.toMutableList((Collection) componentRegistry.mappers);
                    ArrayList mutableList3 = CollectionsKt.toMutableList((Collection) componentRegistry.keyers);
                    List fetcherFactories = componentRegistry.getFetcherFactories();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = fetcherFactories.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new ImageLoader$Builder$$ExternalSyntheticLambda1((Pair) it.next(), 24));
                    }
                    List decoderFactories = componentRegistry.getDecoderFactories();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = decoderFactories.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new ComponentRegistry$Builder$$ExternalSyntheticLambda0((Decoder.Factory) it2.next(), 1));
                    }
                    arrayList.add(new ComponentRegistry$Builder$$ExternalSyntheticLambda3(0, new NetworkFetcher.Factory(new ImageLoader$Builder$$ExternalSyntheticLambda1(factory, 25)), Reflection.factory.getOrCreateKotlinClass(Uri.class)));
                    ComponentRegistry componentRegistry2 = new ComponentRegistry(BundleKt.toImmutableList(mutableList), BundleKt.toImmutableList(mutableList2), BundleKt.toImmutableList(mutableList3), BundleKt.toImmutableList(arrayList), BundleKt.toImmutableList(arrayList2));
                    ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder(realImageLoader.options);
                    imageLoader$Builder.componentRegistry = componentRegistry2;
                    RealImageLoader build = imageLoader$Builder.build();
                    StateFlowKt.closeWith(build, coroutineScope3, new Perfs$$ExternalSyntheticLambda4(14));
                    return build;
            }
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, InstanceFactory instanceFactory, LambdaProvider lambdaProvider) {
            this.service = doubleCheck;
            this.sessionManager = lambdaProvider;
            this.buyerIntentManager = doubleCheck2;
            this.scope = instanceFactory;
        }

        public MetroFactory(AsyncTimeout.Companion companion, InstanceFactory instanceFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DelegateFactory delegateFactory) {
            this.scope = instanceFactory;
            this.service = doubleCheck;
            this.sessionManager = lambdaProvider;
            this.buyerIntentManager = delegateFactory;
        }
    }
}
