package com.fidesmo.sec.delivery;

import android.util.Log;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import app.cash.local.views.cart.CartBannerViewKt$$ExternalSyntheticLambda2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fidesmo.sec.core.models.RequiredField;
import com.fidesmo.sec.delivery.ErrorReportResult;
import com.fidesmo.sec.delivery.TransceiveResult;
import com.fidesmo.sec.delivery.UiResponseError;
import com.fidesmo.sec.delivery.models.DataRequirement;
import com.fidesmo.sec.delivery.models.DeliveryUpdate;
import com.fidesmo.sec.delivery.models.RetryConfig;
import com.fidesmo.sec.delivery.models.ServiceDeliveryRequired;
import com.fidesmo.sec.devices.Device;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.observers.LambdaObserver;
import io.reactivex.rxjava3.internal.operators.mixed.SingleFlatMapObservable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableDoOnEach;
import io.reactivex.rxjava3.internal.operators.observable.ObservableEmpty;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFilter;
import io.reactivex.rxjava3.internal.operators.observable.ObservableHide;
import io.reactivex.rxjava3.internal.operators.observable.ObservableJust;
import io.reactivex.rxjava3.internal.operators.observable.ObservableMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRange;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.rxjava3.internal.operators.observable.ObservableTimer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableZip;
import io.reactivex.rxjava3.internal.schedulers.ComputationScheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.ReplaySubject;
import io.reactivex.rxjava3.subjects.Subject;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;
import net.idrnd.face.iad.capture.internal.y0;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okhttp3.OkHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.HttpException;

/* loaded from: classes4.dex */
public class ServiceDeliveryClient {
    private DeliverySecClient client;
    private CompositeDisposable compositeDisposable;
    private Observable<Device> connectionSignal;
    private Observable<Pair<Map<String, String>, byte[]>> encryptedUserDataSignal;
    private Boolean firstError;
    private Boolean ignoresFirstError;
    private final Logger logger;
    private RetryConfig retryConfig;
    private UUID sessionId;
    private Observable<?> userActionSignal;
    private Observable<Map<String, String>> userDataSignal;
    private Boolean usesExternalEncryption;
    private Boolean usesHandlers;
    private Boolean waitsForErrors;

    /* renamed from: com.fidesmo.sec.delivery.ServiceDeliveryClient$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fidesmo$sec$delivery$DeliveryStep;
        static final /* synthetic */ int[] $SwitchMap$com$fidesmo$sec$delivery$OperationType;

        static {
            int[] iArr = new int[DeliveryStep.values().length];
            $SwitchMap$com$fidesmo$sec$delivery$DeliveryStep = iArr;
            try {
                iArr[DeliveryStep.readyToStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fidesmo$sec$delivery$DeliveryStep[DeliveryStep.fetchNextOperation.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fidesmo$sec$delivery$DeliveryStep[DeliveryStep.sendUserAction.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fidesmo$sec$delivery$DeliveryStep[DeliveryStep.sendUserData.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fidesmo$sec$delivery$DeliveryStep[DeliveryStep.transceiving.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$fidesmo$sec$delivery$DeliveryStep[DeliveryStep.fetchRemoteCommands.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$fidesmo$sec$delivery$DeliveryStep[DeliveryStep.requestUserData.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$fidesmo$sec$delivery$DeliveryStep[DeliveryStep.newRequestUserData.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$fidesmo$sec$delivery$DeliveryStep[DeliveryStep.requestEncryptedUserData.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$fidesmo$sec$delivery$DeliveryStep[DeliveryStep.requestUserAction.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$fidesmo$sec$delivery$DeliveryStep[DeliveryStep.newRequestUserAction.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$fidesmo$sec$delivery$DeliveryStep[DeliveryStep.reportError.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr2 = new int[OperationType.values().length];
            $SwitchMap$com$fidesmo$sec$delivery$OperationType = iArr2;
            try {
                iArr2[OperationType.TRANSCEIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$fidesmo$sec$delivery$OperationType[OperationType.USER_INTERACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$fidesmo$sec$delivery$OperationType[OperationType.ACTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public ServiceDeliveryClient(Observable<Device> observable, DeliverySecClient deliverySecClient, RetryConfig retryConfig) {
        this.logger = LoggerFactory.getLogger("fidesmo-ServiceDelivery");
        this.userDataSignal = null;
        this.encryptedUserDataSignal = null;
        this.userActionSignal = null;
        this.compositeDisposable = new CompositeDisposable();
        RetryConfig.defaultConfig();
        Boolean bool = Boolean.FALSE;
        this.firstError = bool;
        Boolean bool2 = Boolean.TRUE;
        this.ignoresFirstError = bool2;
        this.waitsForErrors = bool2;
        this.usesHandlers = bool;
        this.usesExternalEncryption = bool;
        this.client = deliverySecClient;
        this.connectionSignal = observable;
        this.retryConfig = retryConfig;
    }

    private Observable<?> asyncCallCreator(DeliveryState deliveryState) {
        switch (AnonymousClass1.$SwitchMap$com$fidesmo$sec$delivery$DeliveryStep[deliveryState.getStep().ordinal()]) {
            case 1:
                return getDeliveryRequestCall(deliveryState.getInitialRequest());
            case 2:
                return getFetchOperationCall(deliveryState.getSession().getUuid(), null);
            case 3:
                return getSendActionCall(deliveryState.getSession().getUuid(), deliveryState.getOperation().getUuid());
            case 4:
                return getSendUserDataCall(deliveryState.getSession().getUuid(), deliveryState.getOperation().getUuid(), deliveryState.getDataRequirements(), deliveryState.getUserResponse(), deliveryState.getSession().getPublicKey(), Boolean.valueOf(Boolean.TRUE.equals(deliveryState.getIsEncrypted()) || isPaymentCardRequirement(deliveryState.getDataRequirements()).booleanValue()), deliveryState.getEphKey());
            case 5:
                return getTransceiveCall(deliveryState.getCommands());
            case 6:
                return getFetchRemoteCommandsCall(deliveryState.getOperation().getUuid(), deliveryState.getAnswers());
            case 7:
            case 8:
                return this.userDataSignal;
            case 9:
                return this.encryptedUserDataSignal;
            case 10:
            case 11:
                return this.userActionSignal;
            case 12:
                return getReportClientErrorCall(deliveryState.getSession().getUuid(), deliveryState.getErrorMessage(), deliveryState.getFatal(), deliveryState.getDetails());
            default:
                return null;
        }
    }

    private void execUtil(DeliveryState deliveryState, Observable<?> observable, PublishSubject publishSubject) {
        this.logger.info("State:" + deliveryState.getStep().toString() + "-" + Thread.currentThread().getId());
        if (observable == null) {
            this.compositeDisposable.dispose();
            return;
        }
        Scheduler scheduler = Schedulers.IO;
        Objects.requireNonNull(scheduler, "scheduler is null");
        ObservableMap map = new ObservableHide(new ObservableSubscribeOn(observable, scheduler, 0), 1).map(new y0());
        LambdaObserver lambdaObserver = new LambdaObserver(new PreviewView$1$$ExternalSyntheticLambda2(9, this, deliveryState, publishSubject), new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(21, this, publishSubject));
        map.subscribe(lambdaObserver);
        this.compositeDisposable.add(lambdaObserver);
    }

    private Observable<ServiceDeliveryResponse> getDeliveryRequestCall(ServiceDeliveryRequired serviceDeliveryRequired) {
        Observable<ServiceDeliveryResponse> singleFlatMapObservable;
        String uuid = UUID.randomUUID().toString();
        if (serviceDeliveryRequired.getAuthHeader() == null) {
            singleFlatMapObservable = this.client.serviceDeliver(serviceDeliveryRequired, uuid);
        } else {
            Single authHeader = serviceDeliveryRequired.getAuthHeader();
            PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2 = new PreviewView$1$$ExternalSyntheticLambda2(8, this, serviceDeliveryRequired, uuid);
            authHeader.getClass();
            singleFlatMapObservable = new SingleFlatMapObservable(authHeader, previewView$1$$ExternalSyntheticLambda2, 0);
        }
        return singleFlatMapObservable.compose(retryCall("getDeliveryRequestCall", uuid));
    }

    private Observable<FetchOperationResponse> getFetchOperationCall(UUID uuid, OperationResult operationResult) {
        FetchOperationRequest fetchOperationRequest = new FetchOperationRequest(uuid, operationResult);
        String uuid2 = UUID.randomUUID().toString();
        return this.client.serviceFetch(fetchOperationRequest, uuid2).flatMap(new ServiceDeliveryClient$$ExternalSyntheticLambda4(this, fetchOperationRequest, 0)).compose(retryCall("getFetchOperationCall", uuid2));
    }

    private Observable<SecResponse> getFetchRemoteCommandsCall(UUID uuid, List<byte[]> list) {
        SecRequest secRequest = new SecRequest(uuid, list);
        String uuid2 = UUID.randomUUID().toString();
        return this.client.connector(secRequest, uuid2).compose(retryCall("getFetchRemoteCommandsCall", uuid2));
    }

    private Observable<ErrorReportResult> getReportClientErrorCall(UUID uuid, String str, Boolean bool, String str2) {
        return this.client.serviceError(new ServiceErrorRequest(uuid, str, bool, str2), UUID.randomUUID().toString()).map(new ExoPlayerImplInternal$$ExternalSyntheticLambda2(bool, 26));
    }

    private Observable<FetchOperationResponse> getSendActionCall(UUID uuid, UUID uuid2) {
        FetchOperationRequest fetchOperationRequest = new FetchOperationRequest(uuid, new OperationResult(uuid2, null, null));
        String uuid3 = UUID.randomUUID().toString();
        return this.client.serviceFetch(fetchOperationRequest, uuid3).flatMap(new ServiceDeliveryClient$$ExternalSyntheticLambda4(this, fetchOperationRequest, 1)).compose(retryCall("getSendActionCall", uuid3));
    }

    private Observable<?> getSendUserDataCall(UUID uuid, UUID uuid2, List<DataRequirement> list, Map<String, String> map, PublicKey publicKey, Boolean bool, byte[] bArr) {
        if (bArr == null) {
            UserInteractionValidator userInteractionValidator = UserInteractionValidator.INSTANCE;
            boolean noExtraResponses = userInteractionValidator.noExtraResponses(list, map);
            boolean validateDataRequirementResponses = userInteractionValidator.validateDataRequirementResponses(list, map);
            if (!noExtraResponses) {
                return Observable.just(new UiResponseError.NotValidResponse("Attempted to send a response for a non-requested field"));
            }
            if (!validateDataRequirementResponses) {
                return Observable.just(new UiResponseError.NotValidResponse("A response to a field is not valid"));
            }
        } else if (!UserInteractionValidator.INSTANCE.validateExternalEncryptedResponse(list, map)) {
            Log.d("ExternalEncryption", "User interaction response did not passed external response check");
            return Observable.just(new UiResponseError.NotValidResponse("Security error: Real PAN detected in unencrypted field"));
        }
        OperationResult operationResult = new OperationResult(uuid2, map, null);
        if (bool.booleanValue() && bArr != null) {
            operationResult = new OperationResult(uuid2, map, bArr);
        } else if (bool.booleanValue() && publicKey != null) {
            try {
                EncryptedUserResponse encryptUserResponse = Encryption.encryptUserResponse(map, publicKey);
                operationResult = new OperationResult(uuid2, encryptUserResponse.getResponse(), encryptUserResponse.getKey());
            } catch (Exception e) {
                return Observable.error(e);
            }
        }
        if (bool.booleanValue() && ((!bool.booleanValue() || publicKey == null) && (!bool.booleanValue() || bArr == null))) {
            return Observable.just(new UiResponseError.UnencryptedField("Tried to respond to sensitive field with unencrypted input"));
        }
        FetchOperationRequest fetchOperationRequest = new FetchOperationRequest(uuid, operationResult);
        return this.client.serviceFetch(fetchOperationRequest, UUID.randomUUID().toString()).flatMap(new ServiceDeliveryClient$$ExternalSyntheticLambda4(this, fetchOperationRequest, 2));
    }

    private Observable<TransceiveResult> getTransceiveCall(List<byte[]> list) {
        Observable<Device> observable = this.connectionSignal;
        ComputationScheduler computationScheduler = Schedulers.COMPUTATION;
        observable.getClass();
        Objects.requireNonNull(TimeUnit.SECONDS, "unit is null");
        Objects.requireNonNull(computationScheduler, "scheduler is null");
        int i = 1;
        ObservableSubscribeOn observableSubscribeOn = new ObservableSubscribeOn(observable, computationScheduler, i);
        ObservableJust just = Observable.just(list);
        int i2 = 16;
        return this.firstError.booleanValue() ? new ObservableMap(Observable.combineLatest(observableSubscribeOn, just, new TransportImpl$$ExternalSyntheticLambda0(i2)).flatMap(new TransportImpl$$ExternalSyntheticLambda0(11)).map(new ServiceDeliveryClient$$ExternalSyntheticLambda5(this, i)), new ServiceDeliveryClient$$ExternalSyntheticLambda5(this, 2), i) : Observable.combineLatest(observableSubscribeOn, just, new TransportImpl$$ExternalSyntheticLambda0(i2)).flatMap(new TransportImpl$$ExternalSyntheticLambda0(12)).map(new ServiceDeliveryClient$$ExternalSyntheticLambda5(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleNoContentResponse, reason: merged with bridge method [inline-methods] */
    public Observable<FetchOperationResponse> lambda$handleNoContentResponse$27(FetchOperationRequest fetchOperationRequest, FetchOperationResponse fetchOperationResponse, Integer num) {
        if (fetchOperationResponse != null || num.intValue() > this.retryConfig.getMaxRetries()) {
            return Observable.just(fetchOperationResponse);
        }
        Integer valueOf = Integer.valueOf(num.intValue() + 1);
        this.logger.debug("Getting null response...");
        long min = (long) Math.min(Math.pow(2.0d, num.intValue()) + this.retryConfig.getRetryDelay(), this.retryConfig.getMaxRetryInterval());
        ComputationScheduler computationScheduler = Schedulers.COMPUTATION;
        Objects.requireNonNull(TimeUnit.SECONDS, "unit is null");
        Objects.requireNonNull(computationScheduler, "scheduler is null");
        return new ObservableTimer(Math.max(min, 0L), computationScheduler).flatMap(new ServiceDeliveryClient$$ExternalSyntheticLambda20(this, fetchOperationRequest, valueOf, 0));
    }

    private Boolean isPaymentCardRequirement(List<DataRequirement> list) {
        Iterator<DataRequirement> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof DataRequirement.PaymentCard) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deliverUsingHandlers$0(ServiceDeliveryRequired serviceDeliveryRequired, PublishSubject publishSubject, Disposable disposable) {
        DeliveryState deliveryState = new DeliveryState(serviceDeliveryRequired);
        execUtil(deliveryState, asyncCallCreator(deliveryState), publishSubject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execUtil$4(DeliveryState deliveryState, PublishSubject publishSubject, Object obj) {
        DeliveryState reducer = reducer(deliveryState, obj);
        Observable<?> asyncCallCreator = asyncCallCreator(reducer);
        publishSubject.onNext(reducer.getUpdate());
        execUtil(reducer, asyncCallCreator, publishSubject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execUtil$5(PublishSubject publishSubject, Throwable th) {
        serviceError("Delivery Observable errored with: " + th.toString(), Boolean.TRUE, Arrays.toString(th.getStackTrace()));
        publishSubject.onError(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource lambda$getDeliveryRequestCall$6(ServiceDeliveryRequired serviceDeliveryRequired, String str, String str2) {
        return this.client.serviceDeliver(serviceDeliveryRequired, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource lambda$getFetchOperationCall$14(FetchOperationRequest fetchOperationRequest, FetchOperationResponse fetchOperationResponse) {
        return lambda$handleNoContentResponse$27(fetchOperationRequest, fetchOperationResponse, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ErrorReportResult lambda$getReportClientErrorCall$17(Boolean bool, SecResponse secResponse) {
        return secResponse == null ? bool.booleanValue() ? ErrorReportResult.FatalError.INSTANCE : ErrorReportResult.NonFatalError.INSTANCE : new ErrorReportResult.NextOperation(secResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource lambda$getSendActionCall$16(FetchOperationRequest fetchOperationRequest, FetchOperationResponse fetchOperationResponse) {
        return lambda$handleNoContentResponse$27(fetchOperationRequest, fetchOperationResponse, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource lambda$getSendUserDataCall$15(FetchOperationRequest fetchOperationRequest, FetchOperationResponse fetchOperationResponse) {
        return lambda$handleNoContentResponse$27(fetchOperationRequest, fetchOperationResponse, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource lambda$getTransceiveCall$10(Throwable th) {
        this.firstError = Boolean.valueOf(!this.waitsForErrors.booleanValue());
        return Observable.just(new TransceiveResult.ApduError("Client failure on transceive", false, th.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getTransceiveCall$11(List list) {
        return list.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ObservableSource lambda$getTransceiveCall$12(Observable observable) {
        List list = Collections.EMPTY_LIST;
        observable.getClass();
        Objects.requireNonNull(list, "item is null");
        return new ObservableFilter(new ObservableMap(observable, new Functions.JustValue(list), 2), new TransportImpl$$ExternalSyntheticLambda0(13), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ TransceiveResult lambda$getTransceiveCall$13(List list) {
        this.firstError = Boolean.TRUE;
        return new TransceiveResult.ApduResponse(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getTransceiveCall$7(List list) {
        return !list.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ObservableSource lambda$getTransceiveCall$8(Observable observable) {
        TransportImpl$$ExternalSyntheticLambda0 transportImpl$$ExternalSyntheticLambda0 = new TransportImpl$$ExternalSyntheticLambda0(14);
        observable.getClass();
        return new ObservableFilter(observable, transportImpl$$ExternalSyntheticLambda0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ TransceiveResult lambda$getTransceiveCall$9(List list) {
        this.firstError = Boolean.TRUE;
        return new TransceiveResult.ApduResponse(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource lambda$handleNoContentResponse$28(FetchOperationRequest fetchOperationRequest, Integer num, Long l) {
        return this.client.serviceFetch(fetchOperationRequest, UUID.randomUUID().toString()).flatMap(new ServiceDeliveryClient$$ExternalSyntheticLambda20(this, fetchOperationRequest, num, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$reducer$1(Map map, byte[] bArr) {
        ((Subject) this.encryptedUserDataSignal).onNext(new Pair(map, bArr));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$reducer$2(Map map) {
        ((Subject) this.userDataSignal).onNext(map);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$reducer$3(Boolean bool) {
        ((Subject) this.userActionSignal).onNext(bool);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$retryCall$18(Throwable th) {
        this.logger.warn("Error caught inside retryWhen: " + th.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Observable lambda$retryCall$19(Throwable th, Integer num) {
        if (num.intValue() > this.retryConfig.getMaxRetries() || !shouldRetryCall(th).booleanValue()) {
            return Observable.error(th);
        }
        long min = (long) Math.min(Math.pow(2.0d, num.intValue()) + this.retryConfig.getRetryDelay(), this.retryConfig.getMaxRetryInterval());
        ComputationScheduler computationScheduler = Schedulers.COMPUTATION;
        Objects.requireNonNull(TimeUnit.SECONDS, "unit is null");
        Objects.requireNonNull(computationScheduler, "scheduler is null");
        return new ObservableTimer(Math.max(min, 0L), computationScheduler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ObservableSource lambda$retryCall$20(Observable observable) {
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$retryCall$21(String str, String str2, Object obj) {
        this.logger.info("RETRYING " + str + " with Request ID " + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObservableSource lambda$retryCall$22(String str, String str2, Observable observable) {
        ObservableSource observableRange;
        int i = 0;
        ServiceDeliveryClient$$ExternalSyntheticLambda5 serviceDeliveryClient$$ExternalSyntheticLambda5 = new ServiceDeliveryClient$$ExternalSyntheticLambda5(this, i);
        observable.getClass();
        POPMatchingFactory pOPMatchingFactory = Functions.EMPTY_CONSUMER;
        ObservableDoOnEach observableDoOnEach = new ObservableDoOnEach(observable, serviceDeliveryClient$$ExternalSyntheticLambda5, pOPMatchingFactory);
        int maxRetries = this.retryConfig.getMaxRetries();
        int i2 = maxRetries + 1;
        if (i2 < 0) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "count >= 0 required but it was "));
            return null;
        }
        if (i2 == 0) {
            observableRange = ObservableEmpty.INSTANCE;
        } else if (i2 == 1) {
            observableRange = Observable.just(1);
        } else {
            if (1 + maxRetries > 2147483647L) {
                a$$ExternalSyntheticBUOutline0.m$3("Integer overflow");
                return null;
            }
            observableRange = new ObservableRange(i2);
        }
        MatchResult.Destructured destructured = new MatchResult.Destructured(new ServiceDeliveryClient$$ExternalSyntheticLambda5(this, 6));
        int i3 = Flowable.BUFFER_SIZE;
        ObservableSource[] observableSourceArr = {observableDoOnEach, observableRange};
        Functions.verifyPositive(i3, "bufferSize");
        return new ObservableDoOnEach(new ObservableZip(observableSourceArr, destructured, i3, i).flatMap(new TransportImpl$$ExternalSyntheticLambda0(15)), new ServiceDeliveryClient$$ExternalSyntheticLambda8(this, str, str2), pOPMatchingFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$retryCall$23(Throwable th) {
        this.logger.warn("Error happened in ServiceDeliveryClient: " + th.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObservableSource lambda$retryCall$24(String str, String str2, Observable observable) {
        ServiceDeliveryClient$$ExternalSyntheticLambda8 serviceDeliveryClient$$ExternalSyntheticLambda8 = new ServiceDeliveryClient$$ExternalSyntheticLambda8(this, str, str2);
        observable.getClass();
        return new ObservableDoOnEach(new ObservableFilter(observable, serviceDeliveryClient$$ExternalSyntheticLambda8, 2), Functions.EMPTY_CONSUMER, new ServiceDeliveryClient$$ExternalSyntheticLambda5(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$serviceError$25(String str, SecResponse secResponse) {
        this.logger.info("Successfully stopped session: " + this.sessionId + ", message: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$serviceError$26(Throwable th) {
        this.logger.info("Failure stopping session: " + this.sessionId + ", error: " + th);
    }

    private <T> ObservableTransformer retryCall(String str, String str2) {
        return new ServiceDeliveryClient$$ExternalSyntheticLambda8(this, str, str2);
    }

    private void serviceError(String str, Boolean bool, String str2) {
        if (this.sessionId != null) {
            String uuid = UUID.randomUUID().toString();
            Observable compose = this.client.serviceError(new ServiceErrorRequest(this.sessionId, str, bool, str2), uuid).compose(retryCall("serviceError", uuid));
            Scheduler scheduler = Schedulers.IO;
            Objects.requireNonNull(scheduler, "scheduler is null");
            new ObservableSubscribeOn(compose, scheduler, 0).subscribe(new LambdaObserver(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(22, this, str), new ServiceDeliveryClient$$ExternalSyntheticLambda5(this, 5)));
        }
    }

    private Boolean shouldRetryCall(Throwable th) {
        return ((th instanceof ConnectException) || (th instanceof UnknownHostException)) ? Boolean.TRUE : th instanceof HttpException ? Boolean.valueOf(this.retryConfig.getHttpErrorCodes().contains(Integer.valueOf(((HttpException) th).code))) : Boolean.FALSE;
    }

    public void cancelDelivery() {
        serviceError("Cancelled by user", Boolean.TRUE, "Delivery was cancelled by the user.");
    }

    public Observable<DeliveryUpdate> deliverUsingHandlers(ServiceDeliveryRequired serviceDeliveryRequired) {
        PublishSubject publishSubject = new PublishSubject();
        this.userDataSignal = ReplaySubject.createWithSize();
        this.encryptedUserDataSignal = ReplaySubject.createWithSize();
        this.userActionSignal = new PublishSubject();
        this.usesHandlers = Boolean.TRUE;
        this.usesExternalEncryption = serviceDeliveryRequired.getUseExternalEncryption();
        return new ObservableFilter(publishSubject, new PreviewView$1$$ExternalSyntheticLambda2(10, this, serviceDeliveryRequired, publishSubject), 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public DeliveryState reducer(DeliveryState deliveryState, Object obj) {
        final int i = 1;
        switch (AnonymousClass1.$SwitchMap$com$fidesmo$sec$delivery$DeliveryStep[deliveryState.getStep().ordinal()]) {
            case 1:
                if (obj instanceof ServiceDeliveryResponse) {
                    Session session = new Session(((ServiceDeliveryResponse) obj).getSessionId(), deliveryState.getInitialRequest().getPublicKey());
                    this.firstError = Boolean.valueOf(!deliveryState.getInitialRequest().getIgnoreFirstError());
                    this.ignoresFirstError = Boolean.valueOf(deliveryState.getInitialRequest().getIgnoreFirstError());
                    if (deliveryState.getInitialRequest().getWaitForErrors() != null) {
                        this.waitsForErrors = deliveryState.getInitialRequest().getWaitForErrors();
                    } else {
                        this.waitsForErrors = this.ignoresFirstError;
                    }
                    this.sessionId = session.getUuid();
                    this.logger.info("Session ID: " + session.getUuid().toString());
                    deliveryState.goToFetchNextOperation(session);
                }
                return deliveryState;
            case 2:
            case 3:
            case 4:
                if (obj instanceof FetchOperationResponse) {
                    FetchOperationResponse fetchOperationResponse = (FetchOperationResponse) obj;
                    Boolean bool = Boolean.TRUE;
                    if (bool.equals(fetchOperationResponse.getCompleted())) {
                        deliveryState.goToFinished(fetchOperationResponse.getStatus());
                        return deliveryState;
                    }
                    Operation operation2 = new Operation(fetchOperationResponse.getOperationId(), fetchOperationResponse.getProgress());
                    int[] iArr = AnonymousClass1.$SwitchMap$com$fidesmo$sec$delivery$OperationType;
                    OperationType operationType = fetchOperationResponse.getOperationType();
                    Objects.requireNonNull(operationType);
                    int i2 = iArr[operationType.ordinal()];
                    if (i2 == 1) {
                        deliveryState.goToFetchRemoteCommands(operation2, Collections.EMPTY_LIST);
                        return deliveryState;
                    }
                    if (i2 == 2) {
                        if (!this.usesHandlers.booleanValue()) {
                            DataRequirement.Companion companion = DataRequirement.INSTANCE;
                            List<RequiredField> fields = fetchOperationResponse.getFields();
                            Objects.requireNonNull(fields);
                            deliveryState.goToRequestUserData(operation2, companion.requirementsFromField(fields), fetchOperationResponse.getEncrypted());
                            return deliveryState;
                        }
                        this.userDataSignal = ReplaySubject.createWithSize();
                        this.encryptedUserDataSignal = ReplaySubject.createWithSize();
                        if (bool.equals(fetchOperationResponse.getEncrypted()) && this.usesExternalEncryption.booleanValue()) {
                            DataRequirement.Companion companion2 = DataRequirement.INSTANCE;
                            List<RequiredField> fields2 = fetchOperationResponse.getFields();
                            Objects.requireNonNull(fields2);
                            deliveryState.goToRequesEncryptedtUserData(operation2, companion2.requirementsFromField(fields2), fetchOperationResponse.getEncrypted(), new CartBannerViewKt$$ExternalSyntheticLambda2(this, 14));
                            return deliveryState;
                        }
                        DataRequirement.Companion companion3 = DataRequirement.INSTANCE;
                        List<RequiredField> fields3 = fetchOperationResponse.getFields();
                        Objects.requireNonNull(fields3);
                        final int i3 = 0;
                        deliveryState.newGoToRequestUserData(operation2, companion3.requirementsFromField(fields3), fetchOperationResponse.getEncrypted(), new Function1(this) { // from class: com.fidesmo.sec.delivery.ServiceDeliveryClient$$ExternalSyntheticLambda1
                            public final /* synthetic */ ServiceDeliveryClient f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit lambda$reducer$2;
                                Unit lambda$reducer$3;
                                int i4 = i3;
                                ServiceDeliveryClient serviceDeliveryClient = this.f$0;
                                switch (i4) {
                                    case 0:
                                        lambda$reducer$2 = serviceDeliveryClient.lambda$reducer$2((Map) obj2);
                                        return lambda$reducer$2;
                                    default:
                                        lambda$reducer$3 = serviceDeliveryClient.lambda$reducer$3((Boolean) obj2);
                                        return lambda$reducer$3;
                                }
                            }
                        });
                        return deliveryState;
                    }
                    if (i2 == 3) {
                        if (this.usesHandlers.booleanValue()) {
                            deliveryState.newGoToRequestUserAction(operation2, fetchOperationResponse.getActions(), new Function1(this) { // from class: com.fidesmo.sec.delivery.ServiceDeliveryClient$$ExternalSyntheticLambda1
                                public final /* synthetic */ ServiceDeliveryClient f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    Unit lambda$reducer$2;
                                    Unit lambda$reducer$3;
                                    int i4 = i;
                                    ServiceDeliveryClient serviceDeliveryClient = this.f$0;
                                    switch (i4) {
                                        case 0:
                                            lambda$reducer$2 = serviceDeliveryClient.lambda$reducer$2((Map) obj2);
                                            return lambda$reducer$2;
                                        default:
                                            lambda$reducer$3 = serviceDeliveryClient.lambda$reducer$3((Boolean) obj2);
                                            return lambda$reducer$3;
                                    }
                                }
                            });
                            return deliveryState;
                        }
                        deliveryState.goToRequestUserAction(operation2, fetchOperationResponse.getActions());
                        return deliveryState;
                    }
                } else if (obj instanceof UiResponseError) {
                    if (obj instanceof UiResponseError.NotValidResponse) {
                        deliveryState.goToReportError(((UiResponseError.NotValidResponse) obj).getReason(), Boolean.TRUE, "Not valid response to user interaction fields.");
                        return deliveryState;
                    }
                    if (obj instanceof UiResponseError.UnencryptedField) {
                        deliveryState.goToReportError(((UiResponseError.UnencryptedField) obj).getMessage(), Boolean.TRUE, "Unencrypted Field");
                        return deliveryState;
                    }
                }
                return deliveryState;
            case 5:
                if (obj instanceof TransceiveResult.ApduResponse) {
                    deliveryState.goToFetchRemoteCommands(deliveryState.getOperation(), ((TransceiveResult.ApduResponse) obj).getApduResponse());
                    return deliveryState;
                }
                if (obj instanceof TransceiveResult.ApduError) {
                    TransceiveResult.ApduError apduError = (TransceiveResult.ApduError) obj;
                    deliveryState.goToReportError(apduError.getMessage(), Boolean.valueOf(apduError.getFatal()), apduError.getDescription());
                    return deliveryState;
                }
                return deliveryState;
            case 6:
                if (obj instanceof SecResponse) {
                    List<byte[]> commands = ((SecResponse) obj).getCommands();
                    if (commands.isEmpty()) {
                        deliveryState.goToFetchNextOperation(deliveryState.getSession());
                        return deliveryState;
                    }
                    deliveryState.goToTransceiving(commands);
                    return deliveryState;
                }
                return deliveryState;
            case 7:
            case 8:
                if (obj instanceof Map) {
                    deliveryState.goToSendUserData((Map) obj, null);
                    return deliveryState;
                }
                return deliveryState;
            case 9:
                if (obj instanceof Pair) {
                    Pair pair = (Pair) obj;
                    deliveryState.goToSendUserData((Map) pair.first, (byte[]) pair.second);
                    return deliveryState;
                }
                return deliveryState;
            case 10:
            case 11:
                deliveryState.goToSendUserAction();
                return deliveryState;
            case 12:
                if (!(obj instanceof ErrorReportResult.NextOperation)) {
                    deliveryState.goToFetchNextOperation(deliveryState.getSession());
                    return deliveryState;
                }
                List<byte[]> commands2 = ((ErrorReportResult.NextOperation) obj).getSecResponse().getCommands();
                if (commands2.isEmpty()) {
                    deliveryState.goToFetchNextOperation(deliveryState.getSession());
                    return deliveryState;
                }
                deliveryState.goToTransceiving(commands2);
                return deliveryState;
            default:
                return deliveryState;
        }
    }

    public void cancelDelivery(String str, String str2) {
        serviceError(str, Boolean.TRUE, str2);
    }

    public ServiceDeliveryClient(Observable<Device> observable, String str) {
        this(observable, DeliverySecClient.INSTANCE.getClient(str), RetryConfig.defaultConfig());
    }

    public ServiceDeliveryClient(Observable<Device> observable, RetryConfig retryConfig) {
        this(observable, DeliverySecClient.INSTANCE.getClient(), retryConfig);
    }

    public ServiceDeliveryClient(Observable<Device> observable, RetryConfig retryConfig, String str) {
        this(observable, DeliverySecClient.INSTANCE.getClient(str), retryConfig);
    }

    public ServiceDeliveryClient(Observable<Device> observable, DeliverySecClient deliverySecClient) {
        this(observable, deliverySecClient, RetryConfig.defaultConfig());
    }

    public ServiceDeliveryClient(Observable<Device> observable) {
        this(observable, DeliverySecClient.INSTANCE.getClient(), RetryConfig.defaultConfig());
    }

    public ServiceDeliveryClient(Observable<Device> observable, OkHttpClient okHttpClient) {
        this(observable, DeliverySecClient.INSTANCE.getClient(null, okHttpClient), RetryConfig.defaultConfig());
    }

    public ServiceDeliveryClient(String str, Observable<Device> observable) {
        this(observable, DeliverySecClient.INSTANCE.getClient(null, null, str), RetryConfig.defaultConfig());
    }

    public ServiceDeliveryClient(String str, Observable<Device> observable, String str2) {
        this(observable, DeliverySecClient.INSTANCE.getClient(str2, null, str), RetryConfig.defaultConfig());
    }

    public ServiceDeliveryClient(String str, Observable<Device> observable, OkHttpClient okHttpClient) {
        this(observable, DeliverySecClient.INSTANCE.getClient(null, okHttpClient, str), RetryConfig.defaultConfig());
    }

    public ServiceDeliveryClient(String str, Observable<Device> observable, OkHttpClient okHttpClient, RetryConfig retryConfig) {
        this(observable, DeliverySecClient.INSTANCE.getClient(null, okHttpClient, str), retryConfig);
    }
}
