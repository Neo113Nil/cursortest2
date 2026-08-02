package com.squareup.cash.db;

import android.app.Application;
import androidx.core.util.Supplier;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.internal.Random;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.EngineWrapper;
import com.google.crypto.tink.util.Bytes;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.DefaultPageRequestHandler$WhenMappings;
import com.squareup.cash.activity.backend.loader.DefaultPageRequestHandler$requestPage$1;
import com.squareup.cash.attribution.types.AdvertisingInfo;
import com.squareup.cash.attribution.wrappers.AppsFlyerStartError;
import com.squareup.cash.attribution.wrappers.ProductionAppsFlyerClient;
import com.squareup.cash.clientsync.network.ClientSyncApiResult;
import com.squareup.cash.clientsync.network.GatewayRequest;
import com.squareup.cash.clientsync.network.RealClientSyncGatewayService$getSyncEntities$1;
import com.squareup.cash.keystore.RealAttestedKeyService;
import com.squareup.cash.keystore.RealAttestedKeyService$RecreateKeyStrategy$initializeAndLoadKey$1;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.util.money.Moneys$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityOffset;
import com.squareup.protos.cash.activity.api.v1.ActivityPageRequest;
import com.squareup.protos.cash.activity.api.v1.ActivityPageResponse;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.syncentitygateway.api.BatchSyncTopicEntitiesClientRequest;
import com.squareup.protos.cash.syncentitygateway.api.BatchSyncTopicEntitiesClientResponse;
import com.squareup.protos.cash.syncentitygateway.api.SyncEntityGatewayApp;
import com.squareup.util.android.Uris;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.Serializable;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.ConnectionPool;
import okhttp3.Request;
import okhttp3.internal._UtilJvmKt$$ExternalSyntheticLambda1;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.intellij.markdown.MarkdownElementType;
import papa.SafeTrace;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.HttpException;
import retrofit2.Invocation;
import retrofit2.Response;
import timber.log.Timber;

/* loaded from: classes.dex */
public class WireAdapter implements EngineFactory.Policy, ActivitiesManager.ActivityPageHandler, Supplier, AppsFlyerRequestListener, Callback {
    public final Object adapter;

    public WireAdapter(int i) {
        switch (i) {
            case 22:
                this.adapter = new ConcurrentHashMap(16);
                break;
            default:
                this.adapter = new ConnectionPool(100);
                break;
        }
    }

    public static ActivityPageRequest buildPageRequest(ActivitiesManager.ActivityContext activityContext, ActivitiesManager.ActivityPage.PageOffset pageOffset) {
        activityContext.getClass();
        ActivityOffset activityOffset = pageOffset != null ? new ActivityOffset(pageOffset.getOffset()) : null;
        ActivityScope activityScope = activityContext.activityScope;
        ActivityToken activityToken = activityContext.activityToken;
        activityScope.getClass();
        return new ActivityPageRequest(activityOffset, activityScope, activityToken, Integer.valueOf(DefaultPageRequestHandler$WhenMappings.$EnumSwitchMapping$0[activityScope.ordinal()] == 1 ? 20 : 25), EmptyList.INSTANCE, ByteString.EMPTY);
    }

    public static WireAdapter randomBytes(int i) {
        return new WireAdapter(Bytes.copyFrom(Random.randBytes(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object requestPage$suspendImpl(WireAdapter wireAdapter, ActivitiesManager.ActivityContext activityContext, ActivitiesManager.ActivityPage.PageOffset pageOffset, ContinuationImpl continuationImpl) {
        DefaultPageRequestHandler$requestPage$1 defaultPageRequestHandler$requestPage$1;
        int i;
        ActivityPageResponse activityPageResponse;
        if (continuationImpl instanceof DefaultPageRequestHandler$requestPage$1) {
            defaultPageRequestHandler$requestPage$1 = (DefaultPageRequestHandler$requestPage$1) continuationImpl;
            int i2 = defaultPageRequestHandler$requestPage$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                defaultPageRequestHandler$requestPage$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = defaultPageRequestHandler$requestPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultPageRequestHandler$requestPage$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityPageRequest buildPageRequest = buildPageRequest(activityContext, pageOffset);
                    ActivityClientService activityClientService = (ActivityClientService) wireAdapter.adapter;
                    defaultPageRequestHandler$requestPage$1.label = 1;
                    obj = activityClientService.activityPage(buildPageRequest, defaultPageRequestHandler$requestPage$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                activityPageResponse = (ActivityPageResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
                if (activityPageResponse == null) {
                    return ActivitiesManager.ActivityPage.Companion.toActivityPage(activityPageResponse);
                }
                return null;
            }
        }
        defaultPageRequestHandler$requestPage$1 = new DefaultPageRequestHandler$requestPage$1(wireAdapter, continuationImpl);
        Object obj2 = defaultPageRequestHandler$requestPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultPageRequestHandler$requestPage$1.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        activityPageResponse = (ActivityPageResponse) (!(apiResult2 instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult2).response : null);
        if (activityPageResponse == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object decode(Serializable serializable) {
        try {
            return (Message) ((ProtoAdapter) this.adapter).decode((byte[]) serializable);
        } catch (IOException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m(e);
            return null;
        }
    }

    public Object encode(Object obj) {
        Message message = (Message) obj;
        message.getClass();
        return ((ProtoAdapter) this.adapter).encode(message);
    }

    @Override // androidx.core.util.Supplier
    public Object get() {
        try {
            MarkdownElementType advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo((Application) this.adapter);
            return new AdvertisingInfo(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
        } catch (Exception e) {
            Timber.Forest.w("Failed to retrieve Google Play Advertising ID", new Object[0], e);
            return null;
        }
    }

    @Override // com.google.crypto.tink.subtle.EngineFactory.Policy
    public Object getInstance(String str) {
        EngineWrapper engineWrapper = (EngineWrapper) this.adapter;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return engineWrapper.getInstance(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        return engineWrapper.getInstance(str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getSyncEntities(GatewayRequest gatewayRequest, ContinuationImpl continuationImpl) {
        RealClientSyncGatewayService$getSyncEntities$1 realClientSyncGatewayService$getSyncEntities$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealClientSyncGatewayService$getSyncEntities$1) {
            realClientSyncGatewayService$getSyncEntities$1 = (RealClientSyncGatewayService$getSyncEntities$1) continuationImpl;
            int i2 = realClientSyncGatewayService$getSyncEntities$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realClientSyncGatewayService$getSyncEntities$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realClientSyncGatewayService$getSyncEntities$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realClientSyncGatewayService$getSyncEntities$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SyncEntityGatewayApp syncEntityGatewayApp = (SyncEntityGatewayApp) this.adapter;
                    BatchSyncTopicEntitiesClientRequest proto = Uris.toProto(gatewayRequest);
                    realClientSyncGatewayService$getSyncEntities$1.label = 1;
                    obj = syncEntityGatewayApp.batchTopicSync(proto, realClientSyncGatewayService$getSyncEntities$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
                    return new ClientSyncApiResult.Failure.HttpFailure(((ApiResult.Failure.HttpFailure) apiResult).code);
                }
                if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                    return new ClientSyncApiResult.Failure.NetworkFailure(((ApiResult.Failure.NetworkFailure) apiResult).error);
                }
                if (apiResult instanceof ApiResult.Success) {
                    return new ClientSyncApiResult.Success(Uris.toMultiplatform((BatchSyncTopicEntitiesClientResponse) ((ApiResult.Success) apiResult).response));
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realClientSyncGatewayService$getSyncEntities$1 = new RealClientSyncGatewayService$getSyncEntities$1(this, continuationImpl);
        Object obj2 = realClientSyncGatewayService$getSyncEntities$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realClientSyncGatewayService$getSyncEntities$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if (com.squareup.cash.keystore.RealAttestedKeyService.access$generateAndFetchWhenKeyIsMissing(r0, r1) == r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (com.squareup.cash.keystore.RealAttestedKeyService.access$eraseKey(r0, r1) == r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r6 == r7) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object initializeAndLoadKey(ContinuationImpl continuationImpl) {
        RealAttestedKeyService$RecreateKeyStrategy$initializeAndLoadKey$1 realAttestedKeyService$RecreateKeyStrategy$initializeAndLoadKey$1;
        Object obj;
        int i;
        RealAttestedKeyService realAttestedKeyService = (RealAttestedKeyService) this.adapter;
        if (continuationImpl instanceof RealAttestedKeyService$RecreateKeyStrategy$initializeAndLoadKey$1) {
            realAttestedKeyService$RecreateKeyStrategy$initializeAndLoadKey$1 = (RealAttestedKeyService$RecreateKeyStrategy$initializeAndLoadKey$1) continuationImpl;
            int i2 = realAttestedKeyService$RecreateKeyStrategy$initializeAndLoadKey$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAttestedKeyService$RecreateKeyStrategy$initializeAndLoadKey$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realAttestedKeyService$RecreateKeyStrategy$initializeAndLoadKey$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAttestedKeyService$RecreateKeyStrategy$initializeAndLoadKey$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealKeyStoreProvider realKeyStoreProvider = realAttestedKeyService.keyStore;
                    String str = realAttestedKeyService.keyAlias;
                    realAttestedKeyService$RecreateKeyStrategy$initializeAndLoadKey$1.label = 1;
                    obj = realKeyStoreProvider.containsAlias(str, realAttestedKeyService$RecreateKeyStrategy$initializeAndLoadKey$1);
                } else if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    realAttestedKeyService$RecreateKeyStrategy$initializeAndLoadKey$1.label = 3;
                }
                if (((Boolean) obj).booleanValue()) {
                    realAttestedKeyService$RecreateKeyStrategy$initializeAndLoadKey$1.label = 2;
                }
                realAttestedKeyService$RecreateKeyStrategy$initializeAndLoadKey$1.label = 3;
            }
        }
        realAttestedKeyService$RecreateKeyStrategy$initializeAndLoadKey$1 = new RealAttestedKeyService$RecreateKeyStrategy$initializeAndLoadKey$1(this, continuationImpl);
        obj = realAttestedKeyService$RecreateKeyStrategy$initializeAndLoadKey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAttestedKeyService$RecreateKeyStrategy$initializeAndLoadKey$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        realAttestedKeyService$RecreateKeyStrategy$initializeAndLoadKey$1.label = 3;
    }

    public boolean matchNationalNumber(CharSequence charSequence, Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc) {
        String str = phonemetadata$PhoneNumberDesc.nationalNumberPattern_;
        if (str.length() != 0) {
            Matcher matcher = ((ConnectionPool) this.adapter).getPatternForRegex(str).matcher(charSequence);
            return matcher.lookingAt() && matcher.matches();
        }
        return false;
    }

    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
    public void onError(int i, String str) {
        ProductionAppsFlyerClient productionAppsFlyerClient = (ProductionAppsFlyerClient) this.adapter;
        str.getClass();
        if (ProductionAppsFlyerClient.EXPECTED_START_ERROR_CODES.contains(Integer.valueOf(i))) {
            Timber.Forest.i("AppsFlyerLib start failed with expected error. errorCode: %d; errorMessage: %s", Integer.valueOf(i), str);
        } else {
            productionAppsFlyerClient.errorReporter.report(new AppsFlyerStartError(i, str), productionAppsFlyerClient.oneErrorPerAppSessionStrategy);
        }
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.adapter;
        Result.Companion companion = Result.Companion;
        cancellableContinuationImpl.resumeWith(new Result.Failure(th));
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.adapter;
        call.getClass();
        if (!response.rawResponse.isSuccessful) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(new Result.Failure(new HttpException(response)));
            return;
        }
        Object obj = response.body;
        if (obj != null) {
            Result.Companion companion2 = Result.Companion;
            cancellableContinuationImpl.resumeWith(obj);
            return;
        }
        Request request = call.request();
        request.getClass();
        Object tag = request.tag(Reflection.factory.getOrCreateKotlinClass(Invocation.class));
        tag.getClass();
        Invocation invocation = (Invocation) tag;
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException("Response from " + invocation.service.getName() + '.' + invocation.method.getName() + " was null but response body type was declared as non-null");
        Result.Companion companion3 = Result.Companion;
        cancellableContinuationImpl.resumeWith(new Result.Failure(kotlinNullPointerException));
    }

    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
    public void onSuccess() {
    }

    public Object requestPage(ActivitiesManager.ActivityContext activityContext, ActivitiesManager.ActivityPage.PageOffset pageOffset, Continuation continuation) {
        return requestPage$suspendImpl(this, activityContext, pageOffset, (ContinuationImpl) continuation);
    }

    public WireAdapter(ProtoAdapter protoAdapter) {
        protoAdapter.getClass();
        this.adapter = protoAdapter;
    }

    public /* synthetic */ WireAdapter(Object obj) {
        this.adapter = obj;
    }

    public WireAdapter(HybridEncrypt hybridEncrypt, int i) {
        this.adapter = hybridEncrypt;
    }

    public WireAdapter(Moneys$$ExternalSyntheticLambda0 moneys$$ExternalSyntheticLambda0, ProductionAppsFlyerClient productionAppsFlyerClient) {
        this.adapter = productionAppsFlyerClient;
    }

    public WireAdapter(List list) {
        list.getClass();
        this.adapter = list;
    }

    public WireAdapter(_UtilJvmKt$$ExternalSyntheticLambda1 _utiljvmkt__externalsyntheticlambda1) {
        this.adapter = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), _utiljvmkt__externalsyntheticlambda1);
    }
}
