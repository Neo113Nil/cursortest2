package com.squareup.cash.fidesmo.real;

import android.app.Activity;
import android.nfc.NfcAdapter;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.fidesmo.sec.core.AppStoreClient;
import com.fidesmo.sec.core.models.ClientInfo;
import com.fidesmo.sec.core.models.ParametrisedTranslation;
import com.fidesmo.sec.core.models.ServiceDescriptionResponse;
import com.fidesmo.sec.delivery.ServiceDeliveryClient;
import com.fidesmo.sec.delivery.models.DataRequirement;
import com.fidesmo.sec.devices.Device;
import com.fidesmo.sec.local.DeviceInfoClient;
import com.fidesmo.sec.local.Utils;
import com.fidesmo.sec.local.models.DeviceApp;
import com.fidesmo.sec.local.models.DeviceAppStatus;
import com.fidesmo.sec.nfc.DeviceListener;
import com.fidesmo.sec.nfc.NfcDevice;
import com.fidesmo.sec.nfc.NfcDevicesManager;
import com.google.mlkit.vision.text.zzc;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.card.onboarding.CardModelView$lighting$$inlined$map$1;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$2;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.fidesmo.api.FidesmoActivationData;
import com.squareup.cash.fidesmo.api.FidesmoClient;
import com.squareup.cash.fidesmo.api.FidesmoDeviceState;
import com.squareup.cash.fidesmo.api.FidesmoProvisioningData;
import com.squareup.cash.fidesmo.api.FidesmoProvisioningError;
import com.squareup.cash.fidesmo.api.FidesmoServiceType;
import com.squareup.cash.fidesmo.api.FidesmoShutdownReason;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.gps.backend.real.AndroidLocationSettingsChecker$check$2$1;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableSingleSingle;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.io.Serializable;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.rx3.RxAwaitKt;
import okhttp3.ResponseBody;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.HttpException;
import retrofit2.Response;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealFidesmoClient implements FidesmoClient {
    public final StateFlowImpl _activationData;
    public final StateFlowImpl _provisioningData;
    public final AtomicLong activeConnectionId;
    public final StateFlowImpl activeConnectionIdState;
    public ActiveDelivery activeDelivery;
    public final AtomicLong activeDeliveryReconnectAttempt;
    public final SharedFlowImpl activeDeliveryReconnects;
    public RealFidesmoClient$observeDeviceState$1$listener$1 activeDeviceListener;
    public final String appId;
    public final AppStoreClient appStoreClient;
    public final ClientInfo clientInfo;
    public final DeviceInfoClient deviceInfoClient;
    public final NfcDevicesManager devicesManager;
    public final FeatureFlagManager featureFlagManager;
    public final CoroutineContext ioDispatcher;
    public final Object nfcDiscoveryLock;
    public boolean nfcDiscoveryStarted;
    public final RealObservabilityManager observabilityManager;
    public final CoroutineScope scope;

    public interface ActivationDataWaitResult {

        public final class ConnectionInvalidated implements ActivationDataWaitResult {
            public static final ConnectionInvalidated INSTANCE = new ConnectionInvalidated();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ConnectionInvalidated);
            }

            public final int hashCode() {
                return -887738720;
            }

            public final String toString() {
                return "ConnectionInvalidated";
            }
        }

        public final class Received implements ActivationDataWaitResult {
            public final FidesmoActivationData activationData;

            public Received(FidesmoActivationData fidesmoActivationData) {
                fidesmoActivationData.getClass();
                this.activationData = fidesmoActivationData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Received) && Intrinsics.areEqual(this.activationData, ((Received) obj).activationData);
            }

            public final int hashCode() {
                return this.activationData.hashCode();
            }

            public final String toString() {
                return "Received(activationData=" + this.activationData + ")";
            }
        }
    }

    public final class ActiveDelivery {
        public final boolean activationLaterSelected;
        public final ServiceDeliveryClient client;
        public final BehaviorSubject deviceSubject;
        public final boolean isDeviceConnected;
        public final int reconnectCount;
        public final int sdkRetryCount;
        public final ActiveDeliveryState state;

        public ActiveDelivery(ServiceDeliveryClient serviceDeliveryClient, BehaviorSubject behaviorSubject, ActiveDeliveryState activeDeliveryState, boolean z, int i, int i2, boolean z2) {
            activeDeliveryState.getClass();
            this.client = serviceDeliveryClient;
            this.deviceSubject = behaviorSubject;
            this.state = activeDeliveryState;
            this.isDeviceConnected = z;
            this.reconnectCount = i;
            this.sdkRetryCount = i2;
            this.activationLaterSelected = z2;
        }

        public static ActiveDelivery copy$default(ActiveDelivery activeDelivery, ActiveDeliveryState activeDeliveryState, boolean z, int i, int i2, int i3) {
            ServiceDeliveryClient serviceDeliveryClient = activeDelivery.client;
            BehaviorSubject behaviorSubject = activeDelivery.deviceSubject;
            if ((i3 & 4) != 0) {
                activeDeliveryState = activeDelivery.state;
            }
            ActiveDeliveryState activeDeliveryState2 = activeDeliveryState;
            if ((i3 & 8) != 0) {
                z = activeDelivery.isDeviceConnected;
            }
            boolean z2 = z;
            if ((i3 & 16) != 0) {
                i = activeDelivery.reconnectCount;
            }
            int i4 = i;
            if ((i3 & 32) != 0) {
                i2 = activeDelivery.sdkRetryCount;
            }
            int i5 = i2;
            boolean z3 = (i3 & 64) != 0 ? activeDelivery.activationLaterSelected : true;
            activeDeliveryState2.getClass();
            return new ActiveDelivery(serviceDeliveryClient, behaviorSubject, activeDeliveryState2, z2, i4, i5, z3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ActiveDelivery) {
                ActiveDelivery activeDelivery = (ActiveDelivery) obj;
                if (this.client.equals(activeDelivery.client) && this.deviceSubject == activeDelivery.deviceSubject && Intrinsics.areEqual(this.state, activeDelivery.state) && this.isDeviceConnected == activeDelivery.isDeviceConnected && this.reconnectCount == activeDelivery.reconnectCount && this.sdkRetryCount == activeDelivery.sdkRetryCount && this.activationLaterSelected == activeDelivery.activationLaterSelected) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.activationLaterSelected) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sdkRetryCount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.reconnectCount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.state.hashCode() + ((this.deviceSubject.hashCode() + (this.client.hashCode() * 31)) * 31)) * 31, 31, this.isDeviceConnected), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActiveDelivery(client=");
            sb.append(this.client);
            sb.append(", deviceSubject=");
            sb.append(this.deviceSubject);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(", isDeviceConnected=");
            sb.append(this.isDeviceConnected);
            sb.append(", reconnectCount=");
            Recorder$$ExternalSyntheticOutline1.m105m(this.reconnectCount, this.sdkRetryCount, ", sdkRetryCount=", ", activationLaterSelected=", sb);
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.activationLaterSelected, ")");
        }
    }

    public final class ActiveDeliveryReconnect {
        public final ServiceDeliveryClient client;
        public final BehaviorSubject deviceSubject;
        public final int reconnectCount;
        public final int sdkRetryCount;
        public final ActiveDeliveryState state;
        public final boolean wasDeviceConnected;

        public ActiveDeliveryReconnect(ServiceDeliveryClient serviceDeliveryClient, BehaviorSubject behaviorSubject, boolean z, ActiveDeliveryState activeDeliveryState, int i, int i2) {
            activeDeliveryState.getClass();
            this.client = serviceDeliveryClient;
            this.deviceSubject = behaviorSubject;
            this.wasDeviceConnected = z;
            this.state = activeDeliveryState;
            this.reconnectCount = i;
            this.sdkRetryCount = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ActiveDeliveryReconnect) {
                ActiveDeliveryReconnect activeDeliveryReconnect = (ActiveDeliveryReconnect) obj;
                if (this.client.equals(activeDeliveryReconnect.client) && this.deviceSubject == activeDeliveryReconnect.deviceSubject && this.wasDeviceConnected == activeDeliveryReconnect.wasDeviceConnected && Intrinsics.areEqual(this.state, activeDeliveryReconnect.state) && this.reconnectCount == activeDeliveryReconnect.reconnectCount && this.sdkRetryCount == activeDeliveryReconnect.sdkRetryCount) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.sdkRetryCount) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.reconnectCount, (this.state.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.deviceSubject.hashCode() + (this.client.hashCode() * 31)) * 31, 31, this.wasDeviceConnected)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActiveDeliveryReconnect(client=");
            sb.append(this.client);
            sb.append(", deviceSubject=");
            sb.append(this.deviceSubject);
            sb.append(", wasDeviceConnected=");
            sb.append(this.wasDeviceConnected);
            sb.append(", state=");
            sb.append(this.state);
            sb.append(", reconnectCount=");
            return Recorder$$ExternalSyntheticOutline1.m(this.reconnectCount, this.sdkRetryCount, ", sdkRetryCount=", ")", sb);
        }
    }

    public final class ActiveDeliveryReconnectEvent {
        public final ServiceDeliveryClient client;
        public final boolean deliveryEnded;
        public final int reconnectCount;

        public ActiveDeliveryReconnectEvent(ServiceDeliveryClient serviceDeliveryClient, int i, boolean z) {
            this.client = serviceDeliveryClient;
            this.reconnectCount = i;
            this.deliveryEnded = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActiveDeliveryReconnectEvent)) {
                return false;
            }
            ActiveDeliveryReconnectEvent activeDeliveryReconnectEvent = (ActiveDeliveryReconnectEvent) obj;
            return this.client.equals(activeDeliveryReconnectEvent.client) && this.reconnectCount == activeDeliveryReconnectEvent.reconnectCount && this.deliveryEnded == activeDeliveryReconnectEvent.deliveryEnded;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.deliveryEnded) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.reconnectCount, this.client.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActiveDeliveryReconnectEvent(client=");
            sb.append(this.client);
            sb.append(", reconnectCount=");
            sb.append(this.reconnectCount);
            sb.append(", deliveryEnded=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.deliveryEnded, ")");
        }
    }

    public interface ActiveDeliveryState {

        public final class CancellationSent implements ActiveDeliveryState {
            public static final CancellationSent INSTANCE = new CancellationSent();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CancellationSent);
            }

            public final int hashCode() {
                return -1771941629;
            }

            public final String toString() {
                return "CancellationSent";
            }
        }

        public final class Failed implements ActiveDeliveryState {
            public final String cancellationMessage;

            public Failed(String str) {
                this.cancellationMessage = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failed) && this.cancellationMessage.equals(((Failed) obj).cancellationMessage);
            }

            public final int hashCode() {
                return this.cancellationMessage.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed(cancellationMessage=", this.cancellationMessage, ")");
            }
        }

        public final class InProgress implements ActiveDeliveryState {
            public static final InProgress INSTANCE = new InProgress();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InProgress);
            }

            public final int hashCode() {
                return 112652858;
            }

            public final String toString() {
                return "InProgress";
            }
        }

        public final class SdkFinished implements ActiveDeliveryState {
            public static final SdkFinished INSTANCE = new SdkFinished();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SdkFinished);
            }

            public final int hashCode() {
                return -1395667964;
            }

            public final String toString() {
                return "SdkFinished";
            }
        }
    }

    public final class DeliveryService {
        public final byte[] certificate;
        public final String serviceId;
        public final PublicKey servicePublicKey;

        public DeliveryService(String str, PublicKey publicKey, byte[] bArr) {
            str.getClass();
            this.serviceId = str;
            this.servicePublicKey = publicKey;
            this.certificate = bArr;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryService)) {
                return false;
            }
            DeliveryService deliveryService = (DeliveryService) obj;
            return Intrinsics.areEqual(this.serviceId, deliveryService.serviceId) && Intrinsics.areEqual(this.servicePublicKey, deliveryService.servicePublicKey) && Intrinsics.areEqual(this.certificate, deliveryService.certificate);
        }

        public final int hashCode() {
            int hashCode = this.serviceId.hashCode() * 31;
            PublicKey publicKey = this.servicePublicKey;
            int hashCode2 = (hashCode + (publicKey == null ? 0 : publicKey.hashCode())) * 31;
            byte[] bArr = this.certificate;
            return hashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0);
        }

        public final String toString() {
            String arrays = Arrays.toString(this.certificate);
            StringBuilder sb = new StringBuilder("DeliveryService(serviceId=");
            sb.append(this.serviceId);
            sb.append(", servicePublicKey=");
            sb.append(this.servicePublicKey);
            sb.append(", certificate=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, arrays, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FidesmoActivationTranslationId {
        public static final /* synthetic */ FidesmoActivationTranslationId[] $VALUES = {new FidesmoActivationTranslationId("ACTIVATE_LATER", 0), new FidesmoActivationTranslationId("ACTIVATION_3DS", 1), new FidesmoActivationTranslationId("CALL_AUTOMATED_BANK_NUMBER", 2), new FidesmoActivationTranslationId("CALL_MANNED_BANK_NUMBER", 3), new FidesmoActivationTranslationId("CODE_IN_THE_BANK_APP", 4), new FidesmoActivationTranslationId("EMAIL_TO_ADDRESS", 5), new FidesmoActivationTranslationId("INCOMING_CALL", 6), new FidesmoActivationTranslationId("MOBILE_BANK_APP", 7), new FidesmoActivationTranslationId("MOBILE_BANK_ID_APP", 8), new FidesmoActivationTranslationId("SMS_TO_NUMBER", 9), new FidesmoActivationTranslationId("VISIT_BANK_URL", 10)};

        /* JADX INFO: Fake field, exist only in values array */
        FidesmoActivationTranslationId EF5;

        public static FidesmoActivationTranslationId valueOf(String str) {
            return (FidesmoActivationTranslationId) Enum.valueOf(FidesmoActivationTranslationId.class, str);
        }

        public static FidesmoActivationTranslationId[] values() {
            return (FidesmoActivationTranslationId[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FidesmoOptionAnswer {
        public static final /* synthetic */ FidesmoOptionAnswer[] $VALUES = {new FidesmoOptionAnswer("FIRST", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        FidesmoOptionAnswer EF5;

        public static FidesmoOptionAnswer valueOf(String str) {
            return (FidesmoOptionAnswer) Enum.valueOf(FidesmoOptionAnswer.class, str);
        }

        public static FidesmoOptionAnswer[] values() {
            return (FidesmoOptionAnswer[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FidesmoRequirementId {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ FidesmoRequirementId[] $VALUES;
        public static final zzc Companion;
        public static final FidesmoRequirementId SDK_RETRY;
        public final String rawValue;

        static {
            FidesmoRequirementId fidesmoRequirementId = new FidesmoRequirementId("ACCEPT", 0, "accept");
            FidesmoRequirementId fidesmoRequirementId2 = new FidesmoRequirementId("DEVICE_PRESENT", 1, "device-present");
            FidesmoRequirementId fidesmoRequirementId3 = new FidesmoRequirementId("SDK_RETRY", 2, "retry");
            SDK_RETRY = fidesmoRequirementId3;
            FidesmoRequirementId[] fidesmoRequirementIdArr = {fidesmoRequirementId, fidesmoRequirementId2, fidesmoRequirementId3, new FidesmoRequirementId("AUTH_METHOD", 3, "auth-method")};
            $VALUES = fidesmoRequirementIdArr;
            $ENTRIES = new EnumEntriesList(fidesmoRequirementIdArr);
            Companion = new zzc(24);
        }

        public FidesmoRequirementId(String str, int i, String str2) {
            this.rawValue = str2;
        }

        public static FidesmoRequirementId valueOf(String str) {
            return (FidesmoRequirementId) Enum.valueOf(FidesmoRequirementId.class, str);
        }

        public static FidesmoRequirementId[] values() {
            return (FidesmoRequirementId[]) $VALUES.clone();
        }
    }

    public interface ProvisioningDataWaitResult {

        public final class ConnectionInvalidated implements ProvisioningDataWaitResult {
            public static final ConnectionInvalidated INSTANCE = new ConnectionInvalidated();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ConnectionInvalidated);
            }

            public final int hashCode() {
                return 1763944631;
            }

            public final String toString() {
                return "ConnectionInvalidated";
            }
        }

        public final class Received implements ProvisioningDataWaitResult {
            public static final Received INSTANCE = new Received();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Received);
            }

            public final int hashCode() {
                return 390896245;
            }

            public final String toString() {
                return "Received";
            }
        }
    }

    public final class RequirementAnswer {
        public final boolean activationLaterSelected;
        public final String value;

        public RequirementAnswer(String str, boolean z) {
            str.getClass();
            this.value = str;
            this.activationLaterSelected = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequirementAnswer)) {
                return false;
            }
            RequirementAnswer requirementAnswer = (RequirementAnswer) obj;
            return Intrinsics.areEqual(this.value, requirementAnswer.value) && this.activationLaterSelected == requirementAnswer.activationLaterSelected;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.activationLaterSelected) + (this.value.hashCode() * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("RequirementAnswer(value=", this.value, ", activationLaterSelected=", ")", this.activationLaterSelected);
        }
    }

    public interface SdkRetryDecision {

        public final class Accepted implements SdkRetryDecision {
            public final int acceptedCount;

            public Accepted(int i) {
                this.acceptedCount = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Accepted) && this.acceptedCount == ((Accepted) obj).acceptedCount;
            }

            public final int hashCode() {
                return Integer.hashCode(this.acceptedCount);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.acceptedCount, "Accepted(acceptedCount=", ")");
            }
        }

        public final class LimitExceeded implements SdkRetryDecision {
            public final int acceptedCount;

            public LimitExceeded(int i) {
                this.acceptedCount = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LimitExceeded) && this.acceptedCount == ((LimitExceeded) obj).acceptedCount;
            }

            public final int hashCode() {
                return Integer.hashCode(this.acceptedCount);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.acceptedCount, "LimitExceeded(acceptedCount=", ")");
            }
        }
    }

    public interface ServiceLookupResult {

        public final class Available implements ServiceLookupResult {
            public final DeliveryService service;

            public Available(DeliveryService deliveryService) {
                this.service = deliveryService;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Available) && this.service.equals(((Available) obj).service);
            }

            public final int hashCode() {
                return this.service.hashCode();
            }

            public final String toString() {
                return "Available(service=" + this.service + ")";
            }
        }

        public final class Unavailable implements ServiceLookupResult {
            public final FidesmoProvisioningError.WithSdkContext error;

            public Unavailable(FidesmoProvisioningError.WithSdkContext withSdkContext) {
                this.error = withSdkContext;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unavailable) && this.error.equals(((Unavailable) obj).error);
            }

            public final int hashCode() {
                return this.error.hashCode();
            }

            public final String toString() {
                return "Unavailable(error=" + this.error + ")";
            }
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FidesmoShutdownReason.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FidesmoShutdownReason fidesmoShutdownReason = FidesmoShutdownReason.FLOW_CLOSED;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[FidesmoRequirementId.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zzc zzcVar = FidesmoRequirementId.Companion;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zzc zzcVar2 = FidesmoRequirementId.Companion;
                iArr2[3] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zzc zzcVar3 = FidesmoRequirementId.Companion;
                iArr2[2] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public RealFidesmoClient(CoroutineScope coroutineScope, CoroutineContext coroutineContext, String str, String str2, RealObservabilityManager realObservabilityManager, FeatureFlagManager featureFlagManager) {
        this.scope = coroutineScope;
        this.ioDispatcher = coroutineContext;
        this.appId = str;
        this.observabilityManager = realObservabilityManager;
        this.featureFlagManager = featureFlagManager;
        ClientInfo clientInfo = new ClientInfo("cash-app", str2, null, 4, null);
        this.clientInfo = clientInfo;
        this.deviceInfoClient = DeviceInfoClient.Companion.getClient$default(DeviceInfoClient.INSTANCE, null, null, clientInfo, "en", 3, null);
        this.appStoreClient = AppStoreClient.Companion.getClient$default(AppStoreClient.INSTANCE, null, null, clientInfo, "en", 3, null);
        this.devicesManager = new NfcDevicesManager();
        this.nfcDiscoveryLock = new Object();
        this.activeConnectionId = new AtomicLong(0L);
        this.activeConnectionIdState = FlowKt.MutableStateFlow(0L);
        this.activeDeliveryReconnects = FlowKt.MutableSharedFlow$default(1, 1, null, 4);
        this.activeDeliveryReconnectAttempt = new AtomicLong(0L);
        this._activationData = FlowKt.MutableStateFlow(null);
        this._provisioningData = FlowKt.MutableStateFlow(null);
    }

    public static final Object access$awaitInitialConnectionStabilityCheck(RealFidesmoClient realFidesmoClient, Device device, Function3 function3, Function0 function0, SuspendLambda suspendLambda) {
        NfcDevice nfcDevice = device instanceof NfcDevice ? (NfcDevice) device : null;
        if (nfcDevice == null) {
            return Boolean.TRUE;
        }
        if (!((Boolean) function0.invoke()).booleanValue()) {
            return Boolean.FALSE;
        }
        Timber.Forest.d("Verifying NFC connection stability before provisioning", new Object[0]);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(suspendLambda));
        cancellableContinuationImpl.initCancellability();
        int i = 4;
        nfcDevice.isConnectionStable(0, 4, 500L, nfcDevice, new AndroidLocationSettingsChecker$check$2$1(cancellableContinuationImpl, i), new VerifyCheckDepositPresenter$models$3$2(i, realFidesmoClient, function3));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|7|(1:(1:(19:11|12|13|(3:60|(3:63|(2:65|66)(1:67)|61)|68)|17|(3:51|(3:54|(2:56|57)(1:58)|52)|59)|21|22|(2:25|23)|26|27|(1:50)(1:30)|(4:32|(2:35|33)|36|37)|38|39|40|(1:42)|43|(1:48)(2:45|46))(2:69|70))(3:71|72|73))(3:101|102|(2:104|98)(1:105))|74|(2:77|75)|78|79|(4:82|(3:87|88|89)|90|80)|93|94|(3:96|(25:99|13|(1:15)|60|(1:61)|68|17|(1:19)|51|(1:52)|59|21|22|(1:23)|26|27|(0)|50|(0)|38|39|40|(0)|43|(0)(0))|98)(6:100|39|40|(0)|43|(0)(0))))|108|6|7|(0)(0)|74|(1:75)|78|79|(1:80)|93|94|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x003b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x023f, code lost:
    
        r1 = kotlin.Result.Companion;
        r0 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01be A[Catch: all -> 0x003b, LOOP:0: B:23:0x01b8->B:25:0x01be, LOOP_END, TryCatch #0 {all -> 0x003b, blocks: (B:12:0x0036, B:13:0x0150, B:15:0x015b, B:19:0x0186, B:22:0x01a7, B:23:0x01b8, B:25:0x01be, B:27:0x01d0, B:32:0x01f6, B:33:0x0205, B:35:0x020b, B:37:0x021d, B:39:0x0237, B:51:0x018e, B:52:0x0192, B:54:0x0198, B:60:0x0166, B:61:0x016a, B:63:0x0170, B:72:0x004a, B:74:0x008f, B:75:0x00b7, B:77:0x00bd, B:79:0x00f0, B:80:0x00fb, B:82:0x0101, B:85:0x0114, B:88:0x011c, B:94:0x0120, B:96:0x0126, B:102:0x0056), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f6 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:12:0x0036, B:13:0x0150, B:15:0x015b, B:19:0x0186, B:22:0x01a7, B:23:0x01b8, B:25:0x01be, B:27:0x01d0, B:32:0x01f6, B:33:0x0205, B:35:0x020b, B:37:0x021d, B:39:0x0237, B:51:0x018e, B:52:0x0192, B:54:0x0198, B:60:0x0166, B:61:0x016a, B:63:0x0170, B:72:0x004a, B:74:0x008f, B:75:0x00b7, B:77:0x00bd, B:79:0x00f0, B:80:0x00fb, B:82:0x0101, B:85:0x0114, B:88:0x011c, B:94:0x0120, B:96:0x0126, B:102:0x0056), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0198 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:12:0x0036, B:13:0x0150, B:15:0x015b, B:19:0x0186, B:22:0x01a7, B:23:0x01b8, B:25:0x01be, B:27:0x01d0, B:32:0x01f6, B:33:0x0205, B:35:0x020b, B:37:0x021d, B:39:0x0237, B:51:0x018e, B:52:0x0192, B:54:0x0198, B:60:0x0166, B:61:0x016a, B:63:0x0170, B:72:0x004a, B:74:0x008f, B:75:0x00b7, B:77:0x00bd, B:79:0x00f0, B:80:0x00fb, B:82:0x0101, B:85:0x0114, B:88:0x011c, B:94:0x0120, B:96:0x0126, B:102:0x0056), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0170 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:12:0x0036, B:13:0x0150, B:15:0x015b, B:19:0x0186, B:22:0x01a7, B:23:0x01b8, B:25:0x01be, B:27:0x01d0, B:32:0x01f6, B:33:0x0205, B:35:0x020b, B:37:0x021d, B:39:0x0237, B:51:0x018e, B:52:0x0192, B:54:0x0198, B:60:0x0166, B:61:0x016a, B:63:0x0170, B:72:0x004a, B:74:0x008f, B:75:0x00b7, B:77:0x00bd, B:79:0x00f0, B:80:0x00fb, B:82:0x0101, B:85:0x0114, B:88:0x011c, B:94:0x0120, B:96:0x0126, B:102:0x0056), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00bd A[Catch: all -> 0x003b, LOOP:4: B:75:0x00b7->B:77:0x00bd, LOOP_END, TryCatch #0 {all -> 0x003b, blocks: (B:12:0x0036, B:13:0x0150, B:15:0x015b, B:19:0x0186, B:22:0x01a7, B:23:0x01b8, B:25:0x01be, B:27:0x01d0, B:32:0x01f6, B:33:0x0205, B:35:0x020b, B:37:0x021d, B:39:0x0237, B:51:0x018e, B:52:0x0192, B:54:0x0198, B:60:0x0166, B:61:0x016a, B:63:0x0170, B:72:0x004a, B:74:0x008f, B:75:0x00b7, B:77:0x00bd, B:79:0x00f0, B:80:0x00fb, B:82:0x0101, B:85:0x0114, B:88:0x011c, B:94:0x0120, B:96:0x0126, B:102:0x0056), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0101 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:12:0x0036, B:13:0x0150, B:15:0x015b, B:19:0x0186, B:22:0x01a7, B:23:0x01b8, B:25:0x01be, B:27:0x01d0, B:32:0x01f6, B:33:0x0205, B:35:0x020b, B:37:0x021d, B:39:0x0237, B:51:0x018e, B:52:0x0192, B:54:0x0198, B:60:0x0166, B:61:0x016a, B:63:0x0170, B:72:0x004a, B:74:0x008f, B:75:0x00b7, B:77:0x00bd, B:79:0x00f0, B:80:0x00fb, B:82:0x0101, B:85:0x0114, B:88:0x011c, B:94:0x0120, B:96:0x0126, B:102:0x0056), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0126 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:12:0x0036, B:13:0x0150, B:15:0x015b, B:19:0x0186, B:22:0x01a7, B:23:0x01b8, B:25:0x01be, B:27:0x01d0, B:32:0x01f6, B:33:0x0205, B:35:0x020b, B:37:0x021d, B:39:0x0237, B:51:0x018e, B:52:0x0192, B:54:0x0198, B:60:0x0166, B:61:0x016a, B:63:0x0170, B:72:0x004a, B:74:0x008f, B:75:0x00b7, B:77:0x00bd, B:79:0x00f0, B:80:0x00fb, B:82:0x0101, B:85:0x0114, B:88:0x011c, B:94:0x0120, B:96:0x0126, B:102:0x0056), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$getActivationData(RealFidesmoClient realFidesmoClient, String str, ContinuationImpl continuationImpl) {
        RealFidesmoClient$getActivationData$2 realFidesmoClient$getActivationData$2;
        int i;
        Object failure;
        Throwable m4120exceptionOrNullimpl;
        Object obj;
        int i2;
        String str2;
        int size;
        int i3;
        ArrayList arrayList;
        String str3;
        List list;
        Iterator it;
        boolean z;
        Iterator it2;
        Object[] objArr;
        Iterator it3;
        RealFidesmoClient realFidesmoClient2 = realFidesmoClient;
        if (continuationImpl instanceof RealFidesmoClient$getActivationData$2) {
            realFidesmoClient$getActivationData$2 = (RealFidesmoClient$getActivationData$2) continuationImpl;
            int i4 = realFidesmoClient$getActivationData$2.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                realFidesmoClient$getActivationData$2.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj2 = realFidesmoClient$getActivationData$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realFidesmoClient$getActivationData$2.label;
                boolean z2 = true;
                char c = 1;
                char c2 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    Result.Companion companion = Result.Companion;
                    Timber.Forest.d("Querying device apps for app ID: ".concat(realFidesmoClient2.appId), new Object[0]);
                    Observable deviceAppsFromServer$default = Utils.getDeviceAppsFromServer$default(Utils.INSTANCE, str, null, null, 6, null);
                    deviceAppsFromServer$default.getClass();
                    ObservableSingleSingle observableSingleSingle = new ObservableSingleSingle(deviceAppsFromServer$default, c == true ? 1 : 0);
                    realFidesmoClient$getActivationData$2.L$0 = str;
                    realFidesmoClient$getActivationData$2.L$1 = realFidesmoClient2;
                    realFidesmoClient$getActivationData$2.I$0 = 0;
                    realFidesmoClient$getActivationData$2.label = 1;
                    Object await = RxAwaitKt.await(observableSingleSingle, realFidesmoClient$getActivationData$2);
                    if (await == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = await;
                    i2 = 0;
                    str2 = str;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = realFidesmoClient$getActivationData$2.I$1;
                        arrayList = realFidesmoClient$getActivationData$2.L$2;
                        str3 = realFidesmoClient$getActivationData$2.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        obj2.getClass();
                        list = (List) obj2;
                        if ((list instanceof Collection) || !list.isEmpty()) {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (Intrinsics.areEqual(((ServiceDescriptionResponse) it.next()).getServiceId(), "uninstall")) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        if (arrayList != null || !arrayList.isEmpty()) {
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                if (((DeviceApp) it2.next()).getStatus() != DeviceAppStatus.Uninstalling) {
                                    objArr = true;
                                    break;
                                }
                            }
                        }
                        objArr = false;
                        Timber.Forest forest = Timber.Forest;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                        it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((DeviceApp) it3.next()).getStatus().name());
                        }
                        forest.d("Cash app present, statuses=" + arrayList2 + ", hasUninstallService=" + z, new Object[0]);
                        if (objArr != false || !z) {
                            z2 = false;
                        }
                        if (!z2) {
                            Timber.Forest forest2 = Timber.Forest;
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(((DeviceApp) it4.next()).getStatus().name());
                            }
                            forest2.w("Half-state app detected: statuses=" + arrayList3, new Object[0]);
                        }
                        size = i3;
                        str2 = str3;
                        failure = new FidesmoActivationData(str2, z2, size, null);
                        Result.Companion companion2 = Result.Companion;
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                            Timber.Forest.e("Failed to get Fidesmo activation data", new Object[0], m4120exceptionOrNullimpl);
                        }
                        if (failure instanceof Result.Failure) {
                            return null;
                        }
                        return failure;
                    }
                    int i5 = realFidesmoClient$getActivationData$2.I$0;
                    RealFidesmoClient realFidesmoClient3 = realFidesmoClient$getActivationData$2.L$1;
                    String str4 = realFidesmoClient$getActivationData$2.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    i2 = i5;
                    realFidesmoClient2 = realFidesmoClient3;
                    obj = obj2;
                    str2 = str4;
                }
                obj.getClass();
                List<DeviceApp> list2 = (List) obj;
                Timber.Forest.d("Found " + list2.size() + " apps on device", new Object[0]);
                for (DeviceApp deviceApp : list2) {
                    Timber.Forest.d("\t" + deviceApp.getAppId() + ": " + deviceApp.getStatus().name(), new Object[0]);
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list2) {
                    DeviceApp deviceApp2 = (DeviceApp) obj3;
                    if (Intrinsics.areEqual(deviceApp2.getAppId(), realFidesmoClient2.appId) && deviceApp2.getStatus() != DeviceAppStatus.Installing) {
                        arrayList4.add(obj3);
                    }
                }
                size = arrayList4.size();
                if (size <= 0) {
                    Observable serviceDescriptions$default = AppStoreClient.DefaultImpls.getServiceDescriptions$default(realFidesmoClient2.appStoreClient, realFidesmoClient2.appId, str2, null, 4, null);
                    serviceDescriptions$default.getClass();
                    ObservableSingleSingle observableSingleSingle2 = new ObservableSingleSingle(serviceDescriptions$default, c2 == true ? 1 : 0);
                    realFidesmoClient$getActivationData$2.L$0 = str2;
                    realFidesmoClient$getActivationData$2.L$1 = null;
                    realFidesmoClient$getActivationData$2.L$2 = arrayList4;
                    realFidesmoClient$getActivationData$2.I$0 = i2;
                    realFidesmoClient$getActivationData$2.I$1 = size;
                    realFidesmoClient$getActivationData$2.label = 2;
                    obj2 = RxAwaitKt.await(observableSingleSingle2, realFidesmoClient$getActivationData$2);
                    if (obj2 != coroutineSingletons) {
                        i3 = size;
                        arrayList = arrayList4;
                        str3 = str2;
                        obj2.getClass();
                        list = (List) obj2;
                        if (list instanceof Collection) {
                        }
                        it = list.iterator();
                        while (it.hasNext()) {
                        }
                        z = false;
                        if (arrayList != null) {
                        }
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                        }
                        objArr = false;
                        Timber.Forest forest3 = Timber.Forest;
                        ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                        it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                        }
                        forest3.d("Cash app present, statuses=" + arrayList22 + ", hasUninstallService=" + z, new Object[0]);
                        if (objArr != false) {
                        }
                        z2 = false;
                        if (!z2) {
                        }
                        size = i3;
                        str2 = str3;
                        failure = new FidesmoActivationData(str2, z2, size, null);
                        Result.Companion companion22 = Result.Companion;
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                        if (failure instanceof Result.Failure) {
                        }
                    }
                    return coroutineSingletons;
                }
                z2 = false;
                failure = new FidesmoActivationData(str2, z2, size, null);
                Result.Companion companion222 = Result.Companion;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                }
                if (failure instanceof Result.Failure) {
                }
            }
        }
        realFidesmoClient$getActivationData$2 = new RealFidesmoClient$getActivationData$2(realFidesmoClient2, continuationImpl);
        Object obj22 = realFidesmoClient$getActivationData$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realFidesmoClient$getActivationData$2.label;
        boolean z22 = true;
        char c3 = 1;
        char c22 = 1;
        if (i != 0) {
        }
        obj.getClass();
        List<DeviceApp> list22 = (List) obj;
        Timber.Forest.d("Found " + list22.size() + " apps on device", new Object[0]);
        while (r3.hasNext()) {
        }
        ArrayList arrayList42 = new ArrayList();
        while (r2.hasNext()) {
        }
        size = arrayList42.size();
        if (size <= 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$getAvailableService(RealFidesmoClient realFidesmoClient, String str, FidesmoServiceType fidesmoServiceType, ContinuationImpl continuationImpl) {
        RealFidesmoClient$getAvailableService$1 realFidesmoClient$getAvailableService$1;
        int i;
        HttpException e;
        int i2;
        Object failure;
        ResponseBody responseBody;
        ServiceDescriptionResponse serviceDescriptionResponse;
        byte[] certificate;
        ServiceDescriptionResponse serviceDescriptionResponse2;
        String str2 = str;
        FidesmoServiceType fidesmoServiceType2 = fidesmoServiceType;
        String str3 = realFidesmoClient.appId;
        if (continuationImpl instanceof RealFidesmoClient$getAvailableService$1) {
            realFidesmoClient$getAvailableService$1 = (RealFidesmoClient$getAvailableService$1) continuationImpl;
            int i3 = realFidesmoClient$getAvailableService$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realFidesmoClient$getAvailableService$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = realFidesmoClient$getAvailableService$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realFidesmoClient$getAvailableService$1.label;
                int i4 = 1;
                String str4 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    try {
                        Observable<ServiceDescriptionResponse> serviceDescription = realFidesmoClient.appStoreClient.getServiceDescription(str3, fidesmoServiceType2.serviceId, str2);
                        serviceDescription.getClass();
                        ObservableSingleSingle observableSingleSingle = new ObservableSingleSingle(serviceDescription, i4);
                        realFidesmoClient$getAvailableService$1.L$0 = str2;
                        realFidesmoClient$getAvailableService$1.L$1 = fidesmoServiceType2;
                        realFidesmoClient$getAvailableService$1.label = 1;
                        obj = RxAwaitKt.await(observableSingleSingle, realFidesmoClient$getAvailableService$1);
                        if (obj == serializable) {
                            return serializable;
                        }
                    } catch (HttpException e2) {
                        e = e2;
                        HttpException httpException = e;
                        i2 = httpException.code;
                        if (i2 == 412) {
                            throw httpException;
                        }
                        String str5 = httpException.message;
                        str5.getClass();
                        String str6 = !StringsKt.isBlank(str5) ? str5 : null;
                        try {
                            Result.Companion companion = Result.Companion;
                            Response response = httpException.response;
                            failure = (response == null || (responseBody = response.errorBody) == null) ? null : responseBody.string();
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            failure = new Result.Failure(th);
                        }
                        if (failure instanceof Result.Failure) {
                            failure = null;
                        }
                        String str7 = (String) failure;
                        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "HTTP ");
                        if (str7 != null && !StringsKt.isBlank(str7)) {
                            str4 = str7;
                        }
                        String joinToString$default = CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{m, str6, str4}), " | ", null, null, 0, null, null, 62);
                        Timber.Forest.w(CameraSelector$$ExternalSyntheticOutline0.m("Service ", fidesmoServiceType2.serviceId, " not available for ", str2), new Object[0], httpException);
                        return new ServiceLookupResult.Unavailable(new FidesmoProvisioningError.WithSdkContext(FidesmoProvisioningError.NoServiceAvailable.INSTANCE, String.valueOf(i2), joinToString$default, str3, fidesmoServiceType2.serviceId));
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        serviceDescriptionResponse2 = realFidesmoClient$getAvailableService$1.L$2;
                        SafeTrace.throwOnFailure(obj);
                        certificate = (byte[]) obj;
                        serviceDescriptionResponse = serviceDescriptionResponse2;
                        return new ServiceLookupResult.Available(new DeliveryService(serviceDescriptionResponse.getServiceId(), serviceDescriptionResponse.getDescription().getPublicKey(), certificate));
                    }
                    FidesmoServiceType fidesmoServiceType3 = realFidesmoClient$getAvailableService$1.L$1;
                    String str8 = realFidesmoClient$getAvailableService$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        fidesmoServiceType2 = fidesmoServiceType3;
                        str2 = str8;
                    } catch (HttpException e3) {
                        e = e3;
                        fidesmoServiceType2 = fidesmoServiceType3;
                        str2 = str8;
                        HttpException httpException2 = e;
                        i2 = httpException2.code;
                        if (i2 == 412) {
                        }
                    }
                }
                serviceDescriptionResponse = (ServiceDescriptionResponse) obj;
                serviceDescriptionResponse.getClass();
                Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("Found service: ", serviceDescriptionResponse.getServiceId()), new Object[0]);
                certificate = serviceDescriptionResponse.getDescription().getCertificate();
                if (certificate == null) {
                    String serviceId = serviceDescriptionResponse.getServiceId();
                    realFidesmoClient$getAvailableService$1.L$0 = null;
                    realFidesmoClient$getAvailableService$1.L$1 = null;
                    realFidesmoClient$getAvailableService$1.L$2 = serviceDescriptionResponse;
                    realFidesmoClient$getAvailableService$1.label = 2;
                    Serializable installServiceCertificate = realFidesmoClient.getInstallServiceCertificate(str2, serviceId, realFidesmoClient$getAvailableService$1);
                    if (installServiceCertificate != serializable) {
                        obj = installServiceCertificate;
                        serviceDescriptionResponse2 = serviceDescriptionResponse;
                        certificate = (byte[]) obj;
                        serviceDescriptionResponse = serviceDescriptionResponse2;
                    }
                    return serializable;
                }
                return new ServiceLookupResult.Available(new DeliveryService(serviceDescriptionResponse.getServiceId(), serviceDescriptionResponse.getDescription().getPublicKey(), certificate));
            }
        }
        realFidesmoClient$getAvailableService$1 = new RealFidesmoClient$getAvailableService$1(realFidesmoClient, continuationImpl);
        Object obj2 = realFidesmoClient$getAvailableService$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realFidesmoClient$getAvailableService$1.label;
        int i42 = 1;
        String str42 = null;
        if (i != 0) {
        }
        serviceDescriptionResponse = (ServiceDescriptionResponse) obj2;
        serviceDescriptionResponse.getClass();
        Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("Found service: ", serviceDescriptionResponse.getServiceId()), new Object[0]);
        certificate = serviceDescriptionResponse.getDescription().getCertificate();
        if (certificate == null) {
        }
        return new ServiceLookupResult.Available(new DeliveryService(serviceDescriptionResponse.getServiceId(), serviceDescriptionResponse.getDescription().getPublicKey(), certificate));
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0214, code lost:
    
        if (r2.invoke(r0, r4) == r5) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleSdkRetryInteraction(RealFidesmoClient realFidesmoClient, ServiceDeliveryClient serviceDeliveryClient, Function2 function2, Function0 function0, ContinuationImpl continuationImpl) {
        RealFidesmoClient$handleSdkRetryInteraction$1 realFidesmoClient$handleSdkRetryInteraction$1;
        Object obj;
        int i;
        SdkRetryDecision sdkRetryDecision;
        boolean isActiveDeliveryDeviceConnected;
        Function0 function02;
        SdkRetryDecision sdkRetryDecision2;
        Object awaitActiveDeliveryReconnect;
        boolean z;
        SdkRetryDecision sdkRetryDecision3;
        FidesmoDeviceState.DeliveringService deliveringService;
        Function0 function03;
        ServiceDeliveryClient serviceDeliveryClient2 = serviceDeliveryClient;
        Function2 function22 = function2;
        if (continuationImpl instanceof RealFidesmoClient$handleSdkRetryInteraction$1) {
            realFidesmoClient$handleSdkRetryInteraction$1 = (RealFidesmoClient$handleSdkRetryInteraction$1) continuationImpl;
            int i2 = realFidesmoClient$handleSdkRetryInteraction$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realFidesmoClient$handleSdkRetryInteraction$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realFidesmoClient$handleSdkRetryInteraction$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realFidesmoClient$handleSdkRetryInteraction$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    synchronized (realFidesmoClient.nfcDiscoveryLock) {
                        try {
                            ActiveDelivery activeDelivery = realFidesmoClient.activeDelivery;
                            if (activeDelivery != null) {
                                if (!activeDelivery.client.equals(serviceDeliveryClient2)) {
                                    activeDelivery = null;
                                }
                                if (activeDelivery != null) {
                                    ActiveDelivery activeDelivery2 = keepsSdkSessionActive(activeDelivery.state) ? activeDelivery : null;
                                    if (activeDelivery2 != null) {
                                        int i3 = activeDelivery2.sdkRetryCount;
                                        if (i3 >= 3) {
                                            sdkRetryDecision = new SdkRetryDecision.LimitExceeded(i3);
                                        } else {
                                            int i4 = i3 + 1;
                                            realFidesmoClient.activeDelivery = ActiveDelivery.copy$default(activeDelivery2, null, false, 0, i4, 95);
                                            sdkRetryDecision = new SdkRetryDecision.Accepted(i4);
                                        }
                                    }
                                }
                            }
                            sdkRetryDecision = null;
                        } finally {
                        }
                    }
                    if (sdkRetryDecision == null) {
                        return Unit.INSTANCE;
                    }
                    if (sdkRetryDecision instanceof SdkRetryDecision.Accepted) {
                        isActiveDeliveryDeviceConnected = realFidesmoClient.isActiveDeliveryDeviceConnected(serviceDeliveryClient);
                        Timber.Forest forest = Timber.Forest;
                        forest.i("Auto-accepting Fidesmo SDK retry " + ((SdkRetryDecision.Accepted) sdkRetryDecision).acceptedCount + "/3 (deviceConnected=" + isActiveDeliveryDeviceConnected + ")", new Object[0]);
                        if (isActiveDeliveryDeviceConnected) {
                            function02 = function0;
                            sdkRetryDecision2 = sdkRetryDecision;
                        } else {
                            forest.i("Waiting for Fidesmo device reconnect before answering SDK retry", new Object[0]);
                            FidesmoDeviceState.Disconnected disconnected = FidesmoDeviceState.Disconnected.INSTANCE;
                            realFidesmoClient$handleSdkRetryInteraction$1.L$0 = serviceDeliveryClient2;
                            realFidesmoClient$handleSdkRetryInteraction$1.L$1 = function22;
                            realFidesmoClient$handleSdkRetryInteraction$1.L$2 = function0;
                            realFidesmoClient$handleSdkRetryInteraction$1.L$3 = sdkRetryDecision;
                            realFidesmoClient$handleSdkRetryInteraction$1.Z$0 = isActiveDeliveryDeviceConnected;
                            realFidesmoClient$handleSdkRetryInteraction$1.label = 1;
                            if (function22.invoke(disconnected, realFidesmoClient$handleSdkRetryInteraction$1) != obj) {
                                function02 = function0;
                                realFidesmoClient$handleSdkRetryInteraction$1.L$0 = null;
                                realFidesmoClient$handleSdkRetryInteraction$1.L$1 = function22;
                                realFidesmoClient$handleSdkRetryInteraction$1.L$2 = function02;
                                realFidesmoClient$handleSdkRetryInteraction$1.L$3 = sdkRetryDecision;
                                realFidesmoClient$handleSdkRetryInteraction$1.Z$0 = isActiveDeliveryDeviceConnected;
                                realFidesmoClient$handleSdkRetryInteraction$1.label = 2;
                                awaitActiveDeliveryReconnect = realFidesmoClient.awaitActiveDeliveryReconnect(serviceDeliveryClient2, realFidesmoClient$handleSdkRetryInteraction$1);
                                if (awaitActiveDeliveryReconnect != obj) {
                                }
                            }
                        }
                    } else {
                        if (!(sdkRetryDecision instanceof SdkRetryDecision.LimitExceeded)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        FidesmoProvisioningError.SdkRetryLimitExceeded sdkRetryLimitExceeded = FidesmoProvisioningError.SdkRetryLimitExceeded.INSTANCE;
                        SdkRetryDecision.LimitExceeded limitExceeded = (SdkRetryDecision.LimitExceeded) sdkRetryDecision;
                        Timber.Forest.w(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(limitExceeded.acceptedCount, "Fidesmo SDK retry limit exceeded (accepted=", ", max=3)"), new Object[0]);
                        realFidesmoClient.observabilityManager.logEvent("fidesmo_provisioning_delivery_error", MapsKt__MapsKt.mapOf(new Pair("stage", "sdk_retry"), new Pair(BreadcrumbHelper.Category.ERROR, FidesmoProvisioningError.SdkRetryLimitExceeded.cdfShortName), new Pair("accepted_retry_count", new Integer(limitExceeded.acceptedCount)), new Pair("max_retries", new Integer(3))));
                        realFidesmoClient.markDeliveryCancellationSent(serviceDeliveryClient);
                        cancelDelivery(serviceDeliveryClient2, FidesmoProvisioningError.SdkRetryLimitExceeded.fidesmoMessage, "Fidesmo delivery cancelled after " + limitExceeded.acceptedCount + " SDK retries.");
                        realFidesmoClient.incrementActiveConnectionId();
                        FidesmoDeviceState.ServiceDeliveryFailed serviceDeliveryFailed = new FidesmoDeviceState.ServiceDeliveryFailed(sdkRetryLimitExceeded);
                        realFidesmoClient$handleSdkRetryInteraction$1.L$0 = null;
                        realFidesmoClient$handleSdkRetryInteraction$1.L$1 = null;
                        realFidesmoClient$handleSdkRetryInteraction$1.L$2 = null;
                        realFidesmoClient$handleSdkRetryInteraction$1.L$3 = null;
                        realFidesmoClient$handleSdkRetryInteraction$1.label = 4;
                    }
                    return obj;
                }
                if (i == 1) {
                    boolean z2 = realFidesmoClient$handleSdkRetryInteraction$1.Z$0;
                    SdkRetryDecision sdkRetryDecision4 = realFidesmoClient$handleSdkRetryInteraction$1.L$3;
                    function02 = realFidesmoClient$handleSdkRetryInteraction$1.L$2;
                    Function2 function23 = realFidesmoClient$handleSdkRetryInteraction$1.L$1;
                    ServiceDeliveryClient serviceDeliveryClient3 = realFidesmoClient$handleSdkRetryInteraction$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    isActiveDeliveryDeviceConnected = z2;
                    sdkRetryDecision = sdkRetryDecision4;
                    function22 = function23;
                    serviceDeliveryClient2 = serviceDeliveryClient3;
                    realFidesmoClient$handleSdkRetryInteraction$1.L$0 = null;
                    realFidesmoClient$handleSdkRetryInteraction$1.L$1 = function22;
                    realFidesmoClient$handleSdkRetryInteraction$1.L$2 = function02;
                    realFidesmoClient$handleSdkRetryInteraction$1.L$3 = sdkRetryDecision;
                    realFidesmoClient$handleSdkRetryInteraction$1.Z$0 = isActiveDeliveryDeviceConnected;
                    realFidesmoClient$handleSdkRetryInteraction$1.label = 2;
                    awaitActiveDeliveryReconnect = realFidesmoClient.awaitActiveDeliveryReconnect(serviceDeliveryClient2, realFidesmoClient$handleSdkRetryInteraction$1);
                    if (awaitActiveDeliveryReconnect != obj) {
                        boolean z3 = isActiveDeliveryDeviceConnected;
                        obj2 = awaitActiveDeliveryReconnect;
                        z = z3;
                        sdkRetryDecision3 = sdkRetryDecision;
                        if (((Boolean) obj2).booleanValue()) {
                        }
                    }
                    return obj;
                }
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            SafeTrace.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sdkRetryDecision2 = realFidesmoClient$handleSdkRetryInteraction$1.L$3;
                    function03 = realFidesmoClient$handleSdkRetryInteraction$1.L$2;
                    SafeTrace.throwOnFailure(obj2);
                    function03.invoke();
                    Timber.Forest.i(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((SdkRetryDecision.Accepted) sdkRetryDecision2).acceptedCount, "Answered Fidesmo SDK retry "), new Object[0]);
                    return Unit.INSTANCE;
                }
                z = realFidesmoClient$handleSdkRetryInteraction$1.Z$0;
                sdkRetryDecision3 = realFidesmoClient$handleSdkRetryInteraction$1.L$3;
                Function0 function04 = realFidesmoClient$handleSdkRetryInteraction$1.L$2;
                Function2 function24 = realFidesmoClient$handleSdkRetryInteraction$1.L$1;
                SafeTrace.throwOnFailure(obj2);
                function02 = function04;
                function22 = function24;
                if (((Boolean) obj2).booleanValue()) {
                    Timber.Forest.w("Active Fidesmo delivery ended before SDK retry could be answered", new Object[0]);
                    return Unit.INSTANCE;
                }
                Timber.Forest.i("Fidesmo device reconnected; answering SDK retry now", new Object[0]);
                isActiveDeliveryDeviceConnected = z;
                sdkRetryDecision2 = sdkRetryDecision3;
                deliveringService = new FidesmoDeviceState.DeliveringService(null, null);
                realFidesmoClient$handleSdkRetryInteraction$1.L$0 = null;
                realFidesmoClient$handleSdkRetryInteraction$1.L$1 = null;
                realFidesmoClient$handleSdkRetryInteraction$1.L$2 = function02;
                realFidesmoClient$handleSdkRetryInteraction$1.L$3 = sdkRetryDecision2;
                realFidesmoClient$handleSdkRetryInteraction$1.Z$0 = isActiveDeliveryDeviceConnected;
                realFidesmoClient$handleSdkRetryInteraction$1.label = 3;
                if (function22.invoke(deliveringService, realFidesmoClient$handleSdkRetryInteraction$1) != obj) {
                    function03 = function02;
                    function03.invoke();
                    Timber.Forest.i(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((SdkRetryDecision.Accepted) sdkRetryDecision2).acceptedCount, "Answered Fidesmo SDK retry "), new Object[0]);
                    return Unit.INSTANCE;
                }
                return obj;
            }
        }
        realFidesmoClient$handleSdkRetryInteraction$1 = new RealFidesmoClient$handleSdkRetryInteraction$1(realFidesmoClient, continuationImpl);
        Object obj22 = realFidesmoClient$handleSdkRetryInteraction$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realFidesmoClient$handleSdkRetryInteraction$1.label;
        if (i != 0) {
        }
        deliveringService = new FidesmoDeviceState.DeliveringService(null, null);
        realFidesmoClient$handleSdkRetryInteraction$1.L$0 = null;
        realFidesmoClient$handleSdkRetryInteraction$1.L$1 = null;
        realFidesmoClient$handleSdkRetryInteraction$1.L$2 = function02;
        realFidesmoClient$handleSdkRetryInteraction$1.L$3 = sdkRetryDecision2;
        realFidesmoClient$handleSdkRetryInteraction$1.Z$0 = isActiveDeliveryDeviceConnected;
        realFidesmoClient$handleSdkRetryInteraction$1.label = 3;
        if (function22.invoke(deliveringService, realFidesmoClient$handleSdkRetryInteraction$1) != obj) {
        }
        return obj;
    }

    public static final boolean access$hasSdkRetryRequirement(RealFidesmoClient realFidesmoClient, List list) {
        List<DataRequirement> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (DataRequirement dataRequirement : list2) {
            if (dataRequirement instanceof DataRequirement.OptionsAsButton) {
                zzc zzcVar = FidesmoRequirementId.Companion;
                String id = dataRequirement.getId();
                zzcVar.getClass();
                if (zzc.from(id) == FidesmoRequirementId.SDK_RETRY) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean access$isActiveDelivery(RealFidesmoClient realFidesmoClient, ServiceDeliveryClient serviceDeliveryClient) {
        boolean z;
        ActiveDeliveryState activeDeliveryState;
        synchronized (realFidesmoClient.nfcDiscoveryLock) {
            ActiveDelivery activeDelivery = realFidesmoClient.activeDelivery;
            z = false;
            if (activeDelivery != null) {
                if (!activeDelivery.client.equals(serviceDeliveryClient)) {
                    activeDelivery = null;
                }
                if (activeDelivery != null && (activeDeliveryState = activeDelivery.state) != null) {
                    if (keepsSdkSessionActive(activeDeliveryState)) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public static final void access$markActivationLaterSelected(RealFidesmoClient realFidesmoClient, ServiceDeliveryClient serviceDeliveryClient) {
        ActiveDelivery activeDelivery;
        synchronized (realFidesmoClient.nfcDiscoveryLock) {
            try {
                ActiveDelivery activeDelivery2 = realFidesmoClient.activeDelivery;
                if (activeDelivery2 != null) {
                    if (!activeDelivery2.client.equals(serviceDeliveryClient)) {
                        activeDelivery2 = null;
                    }
                    ActiveDelivery activeDelivery3 = activeDelivery2;
                    if (activeDelivery3 != null) {
                        activeDelivery = ActiveDelivery.copy$default(activeDelivery3, null, false, 0, 0, 63);
                        realFidesmoClient.activeDelivery = activeDelivery;
                    }
                }
                activeDelivery = realFidesmoClient.activeDelivery;
                realFidesmoClient.activeDelivery = activeDelivery;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void access$markDeliveryFailed(RealFidesmoClient realFidesmoClient, ServiceDeliveryClient serviceDeliveryClient, String str) {
        ActiveDelivery activeDelivery;
        synchronized (realFidesmoClient.nfcDiscoveryLock) {
            try {
                ActiveDelivery activeDelivery2 = realFidesmoClient.activeDelivery;
                if (activeDelivery2 != null) {
                    if (!activeDelivery2.client.equals(serviceDeliveryClient)) {
                        activeDelivery2 = null;
                    }
                    ActiveDelivery activeDelivery3 = activeDelivery2;
                    if (activeDelivery3 != null) {
                        activeDelivery = ActiveDelivery.copy$default(activeDelivery3, new ActiveDeliveryState.Failed(str), false, 0, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                        realFidesmoClient.activeDelivery = activeDelivery;
                    }
                }
                activeDelivery = realFidesmoClient.activeDelivery;
                realFidesmoClient.activeDelivery = activeDelivery;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final boolean access$publishDeviceToActiveDelivery(RealFidesmoClient realFidesmoClient, Device device) {
        ActiveDeliveryReconnect activeDeliveryReconnect;
        synchronized (realFidesmoClient.nfcDiscoveryLock) {
            ActiveDelivery activeDelivery = realFidesmoClient.activeDelivery;
            activeDeliveryReconnect = null;
            if (activeDelivery != null) {
                ActiveDelivery activeDelivery2 = keepsSdkSessionActive(activeDelivery.state) ? activeDelivery : null;
                if (activeDelivery2 != null) {
                    int i = activeDelivery2.reconnectCount + 1;
                    realFidesmoClient.activeDelivery = ActiveDelivery.copy$default(activeDelivery2, null, true, i, 0, 103);
                    activeDeliveryReconnect = new ActiveDeliveryReconnect(activeDelivery2.client, activeDelivery2.deviceSubject, activeDelivery2.isDeviceConnected, activeDelivery2.state, i, activeDelivery2.sdkRetryCount);
                }
            }
        }
        if (activeDeliveryReconnect == null) {
            return false;
        }
        activeDeliveryReconnect.deviceSubject.onNext(device);
        if (!realFidesmoClient.activeDeliveryReconnects.tryEmit(new ActiveDeliveryReconnectEvent(activeDeliveryReconnect.client, activeDeliveryReconnect.reconnectCount, false))) {
            Timber.Forest.w("Failed to publish Fidesmo reconnect event", new Object[0]);
        }
        Timber.Forest forest = Timber.Forest;
        String logId = logId(device);
        boolean z = activeDeliveryReconnect.wasDeviceConnected;
        ActiveDeliveryState activeDeliveryState = activeDeliveryReconnect.state;
        int i2 = activeDeliveryReconnect.reconnectCount;
        int i3 = activeDeliveryReconnect.sdkRetryCount;
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("Published Fidesmo reconnect to active SDK delivery (device=", logId, ", wasConnected=", ", state=", z);
        m1540m.append(activeDeliveryState);
        m1540m.append(", reconnectCount=");
        m1540m.append(i2);
        m1540m.append(", sdkRetryCount=");
        forest.i(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, ")", m1540m), new Object[0]);
        return true;
    }

    public static final boolean access$wasActivationLaterSelected(RealFidesmoClient realFidesmoClient, ServiceDeliveryClient serviceDeliveryClient) {
        boolean z;
        synchronized (realFidesmoClient.nfcDiscoveryLock) {
            ActiveDelivery activeDelivery = realFidesmoClient.activeDelivery;
            z = false;
            if (activeDelivery != null) {
                if (!activeDelivery.client.equals(serviceDeliveryClient)) {
                    activeDelivery = null;
                }
                if (activeDelivery != null) {
                    if (activeDelivery.activationLaterSelected) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public static void cancelDelivery(ServiceDeliveryClient serviceDeliveryClient, String str, String str2) {
        Object failure;
        Timber.Forest.i(Recorder$$ExternalSyntheticOutline2.m("Cancelling active Fidesmo service delivery: ", str), new Object[0]);
        try {
            Result.Companion companion = Result.Companion;
            serviceDeliveryClient.cancelDelivery(str, str2);
            failure = Unit.INSTANCE;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
            Timber.Forest.w("Failed to cancel active Fidesmo service delivery", new Object[0], m4120exceptionOrNullimpl);
        }
    }

    public static RequirementAnswer getRequirementAnswer(DataRequirement dataRequirement, FidesmoProvisioningData fidesmoProvisioningData, String str) {
        String str2;
        if (dataRequirement instanceof DataRequirement.EditEmail) {
            if (fidesmoProvisioningData != null && (str2 = fidesmoProvisioningData.customerTokenHashEmail) != null) {
                return new RequirementAnswer(str2, false);
            }
        } else if (dataRequirement instanceof DataRequirement.PaymentCard) {
            if (str != null) {
                return new RequirementAnswer(str, false);
            }
        } else if (dataRequirement instanceof DataRequirement.OptionsAsButton) {
            zzc zzcVar = FidesmoRequirementId.Companion;
            String id = dataRequirement.getId();
            zzcVar.getClass();
            FidesmoRequirementId from = zzc.from(id);
            int i = -1;
            int i2 = from == null ? -1 : WhenMappings.$EnumSwitchMapping$1[from.ordinal()];
            if (i2 != -1) {
                if (i2 == 1 || i2 == 2) {
                    FidesmoOptionAnswer[] fidesmoOptionAnswerArr = FidesmoOptionAnswer.$VALUES;
                    return new RequirementAnswer("0", false);
                }
                if (i2 == 3) {
                    DataRequirement.OptionsAsButton optionsAsButton = (DataRequirement.OptionsAsButton) dataRequirement;
                    ParametrisedTranslation[] labels = optionsAsButton.getLabels();
                    int length = labels.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        String id2 = labels[i3].getId();
                        FidesmoActivationTranslationId[] fidesmoActivationTranslationIdArr = FidesmoActivationTranslationId.$VALUES;
                        if (Intrinsics.areEqual(id2, "FidesmoPay.activation.activateLater")) {
                            i = i3;
                            break;
                        }
                        i3++;
                    }
                    if (i < 0) {
                        Timber.Forest forest = Timber.Forest;
                        ParametrisedTranslation[] labels2 = optionsAsButton.getLabels();
                        ArrayList arrayList = new ArrayList(labels2.length);
                        for (ParametrisedTranslation parametrisedTranslation : labels2) {
                            arrayList.add(new Pair(parametrisedTranslation.getId(), parametrisedTranslation.getFormattedText()));
                        }
                        forest.w(Request$Priority$EnumUnboxingLocalUtility.m("Fidesmo auth-method requirement did not include Activate Later option (labels=", ")", arrayList), new Object[0]);
                        return null;
                    }
                    Timber.Forest forest2 = Timber.Forest;
                    ParametrisedTranslation[] labels3 = optionsAsButton.getLabels();
                    ArrayList arrayList2 = new ArrayList(labels3.length);
                    for (ParametrisedTranslation parametrisedTranslation2 : labels3) {
                        arrayList2.add(parametrisedTranslation2.getId());
                    }
                    forest2.i("Answering Fidesmo auth-method requirement with Activate Later (index=" + i + ", labels=" + arrayList2 + ")", new Object[0]);
                    return new RequirementAnswer(String.valueOf(i), true);
                }
                if (i2 != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
            }
        }
        return null;
    }

    public static boolean keepsSdkSessionActive(ActiveDeliveryState activeDeliveryState) {
        if (Intrinsics.areEqual(activeDeliveryState, ActiveDeliveryState.InProgress.INSTANCE) || Intrinsics.areEqual(activeDeliveryState, ActiveDeliveryState.SdkFinished.INSTANCE)) {
            return true;
        }
        if (!Intrinsics.areEqual(activeDeliveryState, ActiveDeliveryState.CancellationSent.INSTANCE) && !(activeDeliveryState instanceof ActiveDeliveryState.Failed)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
        return false;
    }

    public static String logId(Device device) {
        String simpleName = device.getClass().getSimpleName();
        String num = Integer.toString(System.identityHashCode(device), CharsKt.checkRadix(16));
        num.getClass();
        return Recorder$$ExternalSyntheticOutline2.m(simpleName, "@", num);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitActiveDeliveryReconnect(ServiceDeliveryClient serviceDeliveryClient, ContinuationImpl continuationImpl) {
        RealFidesmoClient$awaitActiveDeliveryReconnect$1 realFidesmoClient$awaitActiveDeliveryReconnect$1;
        int i;
        Integer num;
        if (continuationImpl instanceof RealFidesmoClient$awaitActiveDeliveryReconnect$1) {
            realFidesmoClient$awaitActiveDeliveryReconnect$1 = (RealFidesmoClient$awaitActiveDeliveryReconnect$1) continuationImpl;
            int i2 = realFidesmoClient$awaitActiveDeliveryReconnect$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realFidesmoClient$awaitActiveDeliveryReconnect$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realFidesmoClient$awaitActiveDeliveryReconnect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realFidesmoClient$awaitActiveDeliveryReconnect$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    synchronized (this.nfcDiscoveryLock) {
                        ActiveDelivery activeDelivery = this.activeDelivery;
                        if (activeDelivery != null) {
                            if (!activeDelivery.client.equals(serviceDeliveryClient)) {
                                activeDelivery = null;
                            }
                            if (activeDelivery != null) {
                                if (!keepsSdkSessionActive(activeDelivery.state)) {
                                    activeDelivery = null;
                                }
                                if (activeDelivery != null) {
                                    num = Integer.valueOf(activeDelivery.reconnectCount);
                                }
                            }
                        }
                        num = null;
                    }
                    if (num == null) {
                        return Boolean.FALSE;
                    }
                    int intValue = num.intValue();
                    if (isActiveDeliveryDeviceConnected(serviceDeliveryClient)) {
                        return Boolean.TRUE;
                    }
                    SharedFlowImpl sharedFlowImpl = this.activeDeliveryReconnects;
                    AnimationsKt$takeUntil$1$1.AnonymousClass1 anonymousClass1 = new AnimationsKt$takeUntil$1$1.AnonymousClass1(serviceDeliveryClient, intValue, this, (Continuation) null);
                    realFidesmoClient$awaitActiveDeliveryReconnect$1.L$0 = serviceDeliveryClient;
                    realFidesmoClient$awaitActiveDeliveryReconnect$1.label = 1;
                    if (FlowKt.first(sharedFlowImpl, anonymousClass1, realFidesmoClient$awaitActiveDeliveryReconnect$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    serviceDeliveryClient = realFidesmoClient$awaitActiveDeliveryReconnect$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.valueOf(isActiveDeliveryDeviceConnected(serviceDeliveryClient));
            }
        }
        realFidesmoClient$awaitActiveDeliveryReconnect$1 = new RealFidesmoClient$awaitActiveDeliveryReconnect$1(this, continuationImpl);
        Object obj2 = realFidesmoClient$awaitActiveDeliveryReconnect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realFidesmoClient$awaitActiveDeliveryReconnect$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(isActiveDeliveryDeviceConnected(serviceDeliveryClient));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getActivationData(Activity activity, ContinuationImpl continuationImpl) {
        RealFidesmoClient$getActivationData$1 realFidesmoClient$getActivationData$1;
        int i;
        ActivationDataWaitResult activationDataWaitResult;
        if (continuationImpl instanceof RealFidesmoClient$getActivationData$1) {
            realFidesmoClient$getActivationData$1 = (RealFidesmoClient$getActivationData$1) continuationImpl;
            int i2 = realFidesmoClient$getActivationData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realFidesmoClient$getActivationData$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realFidesmoClient$getActivationData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realFidesmoClient$getActivationData$1.label;
                int i3 = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(activity);
                    if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
                        Timber.Forest.w("NFC is not enabled, cannot get activation data", new Object[0]);
                        return null;
                    }
                    Timber.Forest.d("Waiting for activation data from NFC session...", new Object[0]);
                    ChannelFlowBuilder merge = FlowKt.merge(new CardModelView$lighting$$inlined$map$1(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(this._activationData, 24), 14), new FormCashtag$8$invokeSuspend$$inlined$map$1(new RealFidesmoClient$getActivationData$$inlined$filter$1(this.activeConnectionIdState, this.activeConnectionId.get(), i3), 5));
                    realFidesmoClient$getActivationData$1.label = 1;
                    obj = FlowKt.first(merge, realFidesmoClient$getActivationData$1);
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
                activationDataWaitResult = (ActivationDataWaitResult) obj;
                if (!(activationDataWaitResult instanceof ActivationDataWaitResult.Received)) {
                    Timber.Forest.i("Activation data retrieved", new Object[0]);
                    return ((ActivationDataWaitResult.Received) activationDataWaitResult).activationData;
                }
                if (Intrinsics.areEqual(activationDataWaitResult, ActivationDataWaitResult.ConnectionInvalidated.INSTANCE)) {
                    Timber.Forest.w("Activation data wait ended because the NFC session was invalidated", new Object[0]);
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realFidesmoClient$getActivationData$1 = new RealFidesmoClient$getActivationData$1(this, continuationImpl);
        Object obj2 = realFidesmoClient$getActivationData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realFidesmoClient$getActivationData$1.label;
        int i32 = 0;
        if (i != 0) {
        }
        activationDataWaitResult = (ActivationDataWaitResult) obj2;
        if (!(activationDataWaitResult instanceof ActivationDataWaitResult.Received)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r7v5, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable getInstallServiceCertificate(String str, String str2, ContinuationImpl continuationImpl) {
        RealFidesmoClient$getInstallServiceCertificate$1 realFidesmoClient$getInstallServiceCertificate$1;
        int i;
        try {
            if (continuationImpl instanceof RealFidesmoClient$getInstallServiceCertificate$1) {
                realFidesmoClient$getInstallServiceCertificate$1 = (RealFidesmoClient$getInstallServiceCertificate$1) continuationImpl;
                int i2 = realFidesmoClient$getInstallServiceCertificate$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realFidesmoClient$getInstallServiceCertificate$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realFidesmoClient$getInstallServiceCertificate$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realFidesmoClient$getInstallServiceCertificate$1.label;
                    int i3 = 1;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Service ", str2, " missing certificate, trying install service fallback"), new Object[0]);
                        AppStoreClient appStoreClient = this.appStoreClient;
                        String str3 = this.appId;
                        FidesmoServiceType fidesmoServiceType = FidesmoServiceType.INSTALL;
                        Observable<ServiceDescriptionResponse> serviceDescription = appStoreClient.getServiceDescription(str3, "install", null);
                        serviceDescription.getClass();
                        ObservableSingleSingle observableSingleSingle = new ObservableSingleSingle(serviceDescription, i3);
                        realFidesmoClient$getInstallServiceCertificate$1.L$0 = str;
                        realFidesmoClient$getInstallServiceCertificate$1.label = 1;
                        obj = RxAwaitKt.await(observableSingleSingle, realFidesmoClient$getInstallServiceCertificate$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = realFidesmoClient$getInstallServiceCertificate$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    return ((ServiceDescriptionResponse) obj).getDescription().getCertificate();
                }
            }
            if (i != 0) {
            }
            return ((ServiceDescriptionResponse) obj).getDescription().getCertificate();
        } catch (Exception e) {
            Timber.Forest.w(Recorder$$ExternalSyntheticOutline2.m("Install service certificate fallback failed for ", str), new Object[0], e);
            return null;
        }
        realFidesmoClient$getInstallServiceCertificate$1 = new RealFidesmoClient$getInstallServiceCertificate$1(this, continuationImpl);
        Object obj2 = realFidesmoClient$getInstallServiceCertificate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realFidesmoClient$getInstallServiceCertificate$1.label;
        int i32 = 1;
    }

    public final long incrementActiveConnectionId() {
        long incrementAndGet = this.activeConnectionId.incrementAndGet();
        Long valueOf = Long.valueOf(incrementAndGet);
        StateFlowImpl stateFlowImpl = this.activeConnectionIdState;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, valueOf);
        return incrementAndGet;
    }

    public final boolean isActiveDeliveryDeviceConnected(ServiceDeliveryClient serviceDeliveryClient) {
        boolean z;
        synchronized (this.nfcDiscoveryLock) {
            ActiveDelivery activeDelivery = this.activeDelivery;
            z = false;
            if (activeDelivery != null) {
                if (!activeDelivery.client.equals(serviceDeliveryClient)) {
                    activeDelivery = null;
                }
                if (activeDelivery != null) {
                    ActiveDelivery activeDelivery2 = keepsSdkSessionActive(activeDelivery.state) ? activeDelivery : null;
                    if (activeDelivery2 != null) {
                        if (activeDelivery2.isDeviceConnected) {
                            z = true;
                        }
                    }
                }
            }
        }
        return z;
    }

    public final void markDeliveryCancellationSent(ServiceDeliveryClient serviceDeliveryClient) {
        ActiveDelivery activeDelivery;
        synchronized (this.nfcDiscoveryLock) {
            try {
                ActiveDelivery activeDelivery2 = this.activeDelivery;
                if (activeDelivery2 != null) {
                    if (!activeDelivery2.client.equals(serviceDeliveryClient)) {
                        activeDelivery2 = null;
                    }
                    ActiveDelivery activeDelivery3 = activeDelivery2;
                    if (activeDelivery3 != null) {
                        activeDelivery = ActiveDelivery.copy$default(activeDelivery3, ActiveDeliveryState.CancellationSent.INSTANCE, false, 0, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                        this.activeDelivery = activeDelivery;
                    }
                }
                activeDelivery = this.activeDelivery;
                this.activeDelivery = activeDelivery;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ReadonlyStateFlow observeDeviceState(Activity activity, FidesmoServiceType fidesmoServiceType) {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(activity);
        if (defaultAdapter == null) {
            return FlowKt.asStateFlow(FlowKt.MutableStateFlow(FidesmoDeviceState.NfcUnavailable.INSTANCE));
        }
        if (!defaultAdapter.isEnabled()) {
            return FlowKt.asStateFlow(FlowKt.MutableStateFlow(FidesmoDeviceState.NfcDisabled.INSTANCE));
        }
        Timber.Forest.i("Starting Fidesmo device state observation for ".concat(fidesmoServiceType.serviceId), new Object[0]);
        return FlowKt.stateIn(FlowKt.callbackFlow(new RealFidesmoClient$observeDeviceState$1(this, fidesmoServiceType, activity, (Continuation) null, 0)), this.scope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), FidesmoDeviceState.Disconnected.INSTANCE);
    }

    public final void setProvisioningData(FidesmoProvisioningData fidesmoProvisioningData) {
        this._provisioningData.setValue(fidesmoProvisioningData);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0081 A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0011, B:6:0x0015, B:8:0x001e, B:11:0x0027, B:13:0x002b, B:14:0x005d, B:16:0x0062, B:18:0x0074, B:19:0x007d, B:21:0x0081, B:52:0x0030, B:54:0x0038, B:55:0x003b, B:57:0x0043, B:61:0x004d, B:62:0x0054, B:63:0x0057, B:64:0x005c), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void shutdown(Activity activity, DeviceListener deviceListener, FidesmoShutdownReason fidesmoShutdownReason) {
        String str;
        ActiveDelivery activeDelivery;
        ServiceDeliveryClient serviceDeliveryClient;
        this._activationData.setValue(null);
        this._provisioningData.setValue(null);
        incrementActiveConnectionId();
        synchronized (this.nfcDiscoveryLock) {
            try {
                ActiveDelivery activeDelivery2 = this.activeDelivery;
                ActiveDeliveryState activeDeliveryState = activeDelivery2 != null ? activeDelivery2.state : null;
                if (activeDeliveryState != null && !activeDeliveryState.equals(ActiveDeliveryState.CancellationSent.INSTANCE)) {
                    if (activeDeliveryState instanceof ActiveDeliveryState.Failed) {
                        str = ((ActiveDeliveryState.Failed) activeDeliveryState).cancellationMessage;
                    } else if (activeDeliveryState.equals(ActiveDeliveryState.InProgress.INSTANCE)) {
                        str = fidesmoShutdownReason.fidesmoCancellationMessage;
                    } else {
                        if (!activeDeliveryState.equals(ActiveDeliveryState.SdkFinished.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int ordinal = fidesmoShutdownReason.ordinal();
                        if (ordinal == 2) {
                            str = fidesmoShutdownReason.fidesmoCancellationMessage;
                        } else if (ordinal != 3) {
                            FidesmoShutdownReason fidesmoShutdownReason2 = FidesmoShutdownReason.FLOW_CLOSED;
                            str = "flow_exited_before_success_screen";
                        }
                    }
                    activeDelivery = this.activeDelivery;
                    if (activeDelivery != null && !this.activeDeliveryReconnects.tryEmit(new ActiveDeliveryReconnectEvent(activeDelivery.client, activeDelivery.reconnectCount, true))) {
                        Timber.Forest.w("Failed to publish Fidesmo delivery-ended reconnect event", new Object[0]);
                    }
                    this.activeDelivery = null;
                    serviceDeliveryClient = activeDelivery2 == null ? activeDelivery2.client : null;
                }
                str = null;
                activeDelivery = this.activeDelivery;
                if (activeDelivery != null) {
                    Timber.Forest.w("Failed to publish Fidesmo delivery-ended reconnect event", new Object[0]);
                }
                this.activeDelivery = null;
                if (activeDelivery2 == null) {
                }
            } finally {
            }
        }
        if (serviceDeliveryClient != null && str != null) {
            cancelDelivery(serviceDeliveryClient, str, "Fidesmo delivery cancelled: ".concat(str));
        }
        synchronized (this.nfcDiscoveryLock) {
            try {
                if (this.nfcDiscoveryStarted) {
                    if (activity.isDestroyed() || activity.isFinishing()) {
                        Timber.Forest.w("Skipping NFC discovery stop - activity is destroyed or finishing", new Object[0]);
                    } else {
                        this.devicesManager.stopNfcDiscovery(activity);
                    }
                    this.nfcDiscoveryStarted = false;
                }
                if (deviceListener == null) {
                    deviceListener = this.activeDeviceListener;
                }
                if (deviceListener != null && deviceListener.equals(this.activeDeviceListener)) {
                    this.activeDeviceListener = null;
                    this.devicesManager.removeDeviceListener(deviceListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
