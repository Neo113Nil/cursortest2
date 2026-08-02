package com.squareup.cash.attribution;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.core.util.Supplier;
import androidx.datastore.core.DataStoreImpl$data$1;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.advertising.service.PeddleAppService;
import com.squareup.cash.attribution.types.AdvertisingInfo;
import com.squareup.cash.attribution.wrappers.AppsFlyerClient;
import com.squareup.cash.attribution.wrappers.ProductionAppsFlyerClient;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.cash.peddle.app.UpdateAdvertiseIdRequest;
import com.squareup.util.coroutines.SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.UiSetupTeardown;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class InstallAttributer implements UiSetupTeardown {
    public final Supplier advertisingIds;
    public final AppsFlyerClient appsFlyerClient;
    public final CoroutineContext ioDispatcher;
    public final PeddleAppService peddle;
    public final SessionManager sessionManager;
    public State state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AppsFlyerClientState {
        public static final /* synthetic */ AppsFlyerClientState[] $VALUES;
        public static final AppsFlyerClientState Started;
        public static final AppsFlyerClientState Stopped;

        static {
            AppsFlyerClientState appsFlyerClientState = new AppsFlyerClientState("Started", 0);
            Started = appsFlyerClientState;
            AppsFlyerClientState appsFlyerClientState2 = new AppsFlyerClientState("Stopped", 1);
            Stopped = appsFlyerClientState2;
            $VALUES = new AppsFlyerClientState[]{appsFlyerClientState, appsFlyerClientState2};
        }

        public static AppsFlyerClientState valueOf(String str) {
            return (AppsFlyerClientState) Enum.valueOf(AppsFlyerClientState.class, str);
        }

        public static AppsFlyerClientState[] values() {
            return (AppsFlyerClientState[]) $VALUES.clone();
        }
    }

    public final class State {
        public final InstallAttributer$AdvertisingIdState$Settled advertisingIdState;
        public final String appToken;
        public final String appsFlyerId;
        public final AppsFlyerClientState clientState;

        public State(AppsFlyerClientState appsFlyerClientState, InstallAttributer$AdvertisingIdState$Settled installAttributer$AdvertisingIdState$Settled, String str, String str2) {
            this.clientState = appsFlyerClientState;
            this.advertisingIdState = installAttributer$AdvertisingIdState$Settled;
            this.appToken = str;
            this.appsFlyerId = str2;
        }

        public static State copy$default(State state, InstallAttributer$AdvertisingIdState$Settled installAttributer$AdvertisingIdState$Settled, String str, String str2, int i) {
            AppsFlyerClientState appsFlyerClientState = AppsFlyerClientState.Started;
            if ((i & 1) != 0) {
                appsFlyerClientState = state.clientState;
            }
            if ((i & 2) != 0) {
                installAttributer$AdvertisingIdState$Settled = state.advertisingIdState;
            }
            if ((i & 4) != 0) {
                str = state.appToken;
            }
            if ((i & 8) != 0) {
                str2 = state.appsFlyerId;
            }
            state.getClass();
            return new State(appsFlyerClientState, installAttributer$AdvertisingIdState$Settled, str, str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.clientState == state.clientState && this.advertisingIdState.equals(state.advertisingIdState) && Intrinsics.areEqual(this.appToken, state.appToken) && Intrinsics.areEqual(this.appsFlyerId, state.appsFlyerId);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.clientState.hashCode() * 31, 31, this.advertisingIdState.isSet);
            String str = this.appToken;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.appsFlyerId;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(clientState=");
            sb.append(this.clientState);
            sb.append(", advertisingIdState=");
            sb.append(this.advertisingIdState);
            sb.append(", appToken=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.appToken, ", appsFlyerId=", this.appsFlyerId, ")");
        }
    }

    public InstallAttributer(PeddleAppService peddleAppService, SessionManager sessionManager, AppsFlyerClient appsFlyerClient, Supplier supplier, CoroutineContext coroutineContext) {
        this.peddle = peddleAppService;
        this.sessionManager = sessionManager;
        this.appsFlyerClient = appsFlyerClient;
        this.advertisingIds = supplier;
        this.ioDispatcher = coroutineContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleClearAdvertisingId(State state, String str, ContinuationImpl continuationImpl) {
        InstallAttributer$handleClearAdvertisingId$1 installAttributer$handleClearAdvertisingId$1;
        int i;
        if (continuationImpl instanceof InstallAttributer$handleClearAdvertisingId$1) {
            installAttributer$handleClearAdvertisingId$1 = (InstallAttributer$handleClearAdvertisingId$1) continuationImpl;
            int i2 = installAttributer$handleClearAdvertisingId$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                installAttributer$handleClearAdvertisingId$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = installAttributer$handleClearAdvertisingId$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = installAttributer$handleClearAdvertisingId$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Pair pair = new Pair(null, str);
                    installAttributer$handleClearAdvertisingId$1.L$0 = state;
                    installAttributer$handleClearAdvertisingId$1.label = 1;
                    obj = sendToPeddle(pair, null, installAttributer$handleClearAdvertisingId$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    state = installAttributer$handleClearAdvertisingId$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                SizeKt.access$handlePeddleResponse((ApiResult) obj);
                return State.copy$default(state, new InstallAttributer$AdvertisingIdState$Settled(false), null, null, 13);
            }
        }
        installAttributer$handleClearAdvertisingId$1 = new InstallAttributer$handleClearAdvertisingId$1(this, continuationImpl);
        Object obj3 = installAttributer$handleClearAdvertisingId$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = installAttributer$handleClearAdvertisingId$1.label;
        if (i != 0) {
        }
        SizeKt.access$handlePeddleResponse((ApiResult) obj3);
        return State.copy$default(state, new InstallAttributer$AdvertisingIdState$Settled(false), null, null, 13);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleSetAdvertisingId(State state, String str, String str2, ContinuationImpl continuationImpl) {
        InstallAttributer$handleSetAdvertisingId$1 installAttributer$handleSetAdvertisingId$1;
        int i;
        if (continuationImpl instanceof InstallAttributer$handleSetAdvertisingId$1) {
            installAttributer$handleSetAdvertisingId$1 = (InstallAttributer$handleSetAdvertisingId$1) continuationImpl;
            int i2 = installAttributer$handleSetAdvertisingId$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                installAttributer$handleSetAdvertisingId$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = installAttributer$handleSetAdvertisingId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = installAttributer$handleSetAdvertisingId$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1(this, str, str2, continuation, 21);
                    installAttributer$handleSetAdvertisingId$1.L$0 = state;
                    installAttributer$handleSetAdvertisingId$1.label = 1;
                    obj = JobKt.withContext(this.ioDispatcher, dataStoreImpl$data$1, installAttributer$handleSetAdvertisingId$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    state = installAttributer$handleSetAdvertisingId$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                SizeKt.access$handlePeddleResponse((ApiResult) obj);
                return State.copy$default(state, new InstallAttributer$AdvertisingIdState$Settled(true), null, null, 13);
            }
        }
        installAttributer$handleSetAdvertisingId$1 = new InstallAttributer$handleSetAdvertisingId$1(this, continuationImpl);
        Object obj2 = installAttributer$handleSetAdvertisingId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = installAttributer$handleSetAdvertisingId$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        SizeKt.access$handlePeddleResponse((ApiResult) obj2);
        return State.copy$default(state, new InstallAttributer$AdvertisingIdState$Settled(true), null, null, 13);
    }

    public final Object sendToPeddle(Pair pair, String str, ContinuationImpl continuationImpl) {
        AdvertisingInfo advertisingInfo = (AdvertisingInfo) pair.first;
        UpdateAdvertiseIdRequest updateAdvertiseIdRequest = new UpdateAdvertiseIdRequest((String) pair.second, (advertisingInfo == null || advertisingInfo.optedOut) ? null : advertisingInfo.id, str, ByteString.EMPTY);
        Timber.Forest.d("Going to Peddle with " + updateAdvertiseIdRequest, new Object[0]);
        return this.peddle.updateAdvertiseId(updateAdvertiseIdRequest, continuationImpl);
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        this.state = new State(AppsFlyerClientState.Stopped, new InstallAttributer$AdvertisingIdState$Settled(false), null, null);
        ProductionAppsFlyerClient productionAppsFlyerClient = (ProductionAppsFlyerClient) this.appsFlyerClient;
        productionAppsFlyerClient.getAppsFlyerLib().init("xkvAHP4a6YwdTapN6DcZcn", productionAppsFlyerClient.listener, productionAppsFlyerClient.f1049app.getApplicationContext());
        productionAppsFlyerClient.timestampOnInitialization = Long.valueOf(System.currentTimeMillis());
        productionAppsFlyerClient.getAppsFlyerLib().subscribeForDeepLink(new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(productionAppsFlyerClient, 8), 60000L);
        JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new CashApp$onCreate$4$1$1(this, null, 13), 1);
        return new SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0(new RealBrazeManager$$ExternalSyntheticLambda0(this, 5));
    }
}
