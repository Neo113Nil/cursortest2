package com.squareup.cash.fidesmo.real;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fidesmo.sec.core.models.ParametrisedTranslation;
import com.fidesmo.sec.delivery.ServiceDeliveryClient;
import com.fidesmo.sec.delivery.models.DataRequirement;
import com.fidesmo.sec.delivery.models.DeliveryProgress;
import com.fidesmo.sec.delivery.models.DeliveryUpdate;
import com.fidesmo.sec.delivery.models.ServiceDeliveryRequired;
import com.fidesmo.sec.devices.Device;
import com.fidesmo.sec.local.DeviceUtilsKt;
import com.fidesmo.sec.local.models.DeviceDescription;
import com.fidesmo.sec.utils.Hex;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$CashTagActivationErrorOverrideV2;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fidesmo.api.FidesmoActivationData;
import com.squareup.cash.fidesmo.api.FidesmoCardEncryptionData;
import com.squareup.cash.fidesmo.api.FidesmoDeviceState;
import com.squareup.cash.fidesmo.api.FidesmoProvisioningData;
import com.squareup.cash.fidesmo.api.FidesmoProvisioningError;
import com.squareup.cash.fidesmo.api.FidesmoServiceType;
import com.squareup.cash.fidesmo.real.RealFidesmoClient;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.observable.ObservableHide;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.rx3.RxAwaitKt;
import kotlinx.coroutines.rx3.RxConvertKt$asFlow$1;
import okio.ByteString;
import okio.Okio;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ProducerScope $$this$callbackFlow;
    public final /* synthetic */ long $connectionId;
    public final /* synthetic */ Device $device;
    public final /* synthetic */ FidesmoServiceType $serviceType;
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public Ref$ObjectRef L$1;
    public Ref$ObjectRef L$2;
    public DeviceDescription L$3;
    public FidesmoActivationData L$4;
    public Object L$6;
    public int label;
    public final /* synthetic */ RealFidesmoClient this$0;

    /* renamed from: com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ ProducerScope $$this$callbackFlow;
        public final /* synthetic */ RealFidesmoClient.DeliveryService $availableService;
        public final /* synthetic */ long $connectionId;
        public final /* synthetic */ ServiceDeliveryClient $deliveryManager;
        public final /* synthetic */ Ref$ObjectRef $lastSeenCurrentStep;
        public final /* synthetic */ Ref$ObjectRef $lastSeenTotalSteps;
        public final /* synthetic */ RealFidesmoClient this$0;

        /* renamed from: com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends SuspendLambda implements Function2 {
            public final /* synthetic */ ProducerScope $$this$callbackFlow;
            public final /* synthetic */ int $r8$classId;
            public /* synthetic */ Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ AnonymousClass1(ProducerScope producerScope, Continuation continuation, int i) {
                super(2, continuation);
                this.$r8$classId = i;
                this.$$this$callbackFlow = producerScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                switch (this.$r8$classId) {
                    case 0:
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$callbackFlow, continuation, 0);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    default:
                        AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.$$this$callbackFlow, continuation, 1);
                        anonymousClass12.L$0 = obj;
                        return anonymousClass12;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                FidesmoDeviceState fidesmoDeviceState = (FidesmoDeviceState) obj;
                Continuation continuation = (Continuation) obj2;
                switch (this.$r8$classId) {
                }
                return ((AnonymousClass1) create(fidesmoDeviceState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.$r8$classId;
                ProducerScope producerScope = this.$$this$callbackFlow;
                switch (i) {
                    case 0:
                        FidesmoDeviceState fidesmoDeviceState = (FidesmoDeviceState) this.L$0;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = this.label;
                        if (i2 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            this.L$0 = null;
                            this.label = 1;
                            if (((ProducerCoroutine) producerScope)._channel.send(fidesmoDeviceState, this) == coroutineSingletons) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj);
                        }
                        break;
                    default:
                        FidesmoDeviceState fidesmoDeviceState2 = (FidesmoDeviceState) this.L$0;
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i3 = this.label;
                        if (i3 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            this.L$0 = null;
                            this.label = 1;
                            if (((ProducerCoroutine) producerScope)._channel.send(fidesmoDeviceState2, this) == coroutineSingletons2) {
                                break;
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass2(RealFidesmoClient realFidesmoClient, ServiceDeliveryClient serviceDeliveryClient, ProducerScope producerScope, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, CoroutineScope coroutineScope, RealFidesmoClient.DeliveryService deliveryService, long j) {
            this.this$0 = realFidesmoClient;
            this.$deliveryManager = serviceDeliveryClient;
            this.$$this$callbackFlow = producerScope;
            this.$lastSeenCurrentStep = ref$ObjectRef;
            this.$lastSeenTotalSteps = ref$ObjectRef2;
            this.$availableService = deliveryService;
            this.$connectionId = j;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))(1:282)|281|6|7|8|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:278:0x0083, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:279:0x0084, code lost:
        
            r11 = r33;
            r4 = "stage";
            r29 = "fidesmo_provisioning_delivery_error";
            r6 = r25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:280:0x0422, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x074c, code lost:
        
            if (com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.invokeSuspend$sendIfCurrent(r15, r0, r15, r2, r5) == r8) goto L256;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x007e A[Catch: Exception -> 0x0083, TRY_ENTER, TryCatch #9 {Exception -> 0x0083, blocks: (B:15:0x007e, B:16:0x008c, B:19:0x0093, B:35:0x009d, B:38:0x00a7, B:41:0x00b1, B:46:0x00bb), top: B:7:0x0070 }] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x008c A[Catch: Exception -> 0x0083, TryCatch #9 {Exception -> 0x0083, blocks: (B:15:0x007e, B:16:0x008c, B:19:0x0093, B:35:0x009d, B:38:0x00a7, B:41:0x00b1, B:46:0x00bb), top: B:7:0x0070 }] */
        /* JADX WARN: Removed duplicated region for block: B:177:0x0653 A[Catch: Exception -> 0x0629, TryCatch #3 {Exception -> 0x0629, blocks: (B:159:0x060b, B:163:0x0635, B:177:0x0653, B:179:0x0661, B:180:0x0667, B:181:0x0694, B:183:0x06ba, B:185:0x06c8, B:186:0x06ce, B:192:0x0683, B:193:0x068c, B:204:0x06f1, B:205:0x06f2, B:115:0x04a7, B:117:0x04ab, B:121:0x04ba, B:122:0x04d2, B:199:0x04d0), top: B:114:0x04a7, inners: #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:188:0x06f0 A[DONT_GENERATE] */
        /* JADX WARN: Removed duplicated region for block: B:191:0x0681  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0093 A[Catch: Exception -> 0x0083, TryCatch #9 {Exception -> 0x0083, blocks: (B:15:0x007e, B:16:0x008c, B:19:0x0093, B:35:0x009d, B:38:0x00a7, B:41:0x00b1, B:46:0x00bb), top: B:7:0x0070 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x06f7  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0752  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009d A[Catch: Exception -> 0x0083, TryCatch #9 {Exception -> 0x0083, blocks: (B:15:0x007e, B:16:0x008c, B:19:0x0093, B:35:0x009d, B:38:0x00a7, B:41:0x00b1, B:46:0x00bb), top: B:7:0x0070 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a7 A[Catch: Exception -> 0x0083, TryCatch #9 {Exception -> 0x0083, blocks: (B:15:0x007e, B:16:0x008c, B:19:0x0093, B:35:0x009d, B:38:0x00a7, B:41:0x00b1, B:46:0x00bb), top: B:7:0x0070 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00b1 A[Catch: Exception -> 0x0083, TRY_LEAVE, TryCatch #9 {Exception -> 0x0083, blocks: (B:15:0x007e, B:16:0x008c, B:19:0x0093, B:35:0x009d, B:38:0x00a7, B:41:0x00b1, B:46:0x00bb), top: B:7:0x0070 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(DeliveryUpdate deliveryUpdate, Continuation continuation) {
            String str;
            RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1 realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1;
            AnonymousClass2 anonymousClass2;
            String str2;
            AnonymousClass2 anonymousClass22;
            RealObservabilityManager realObservabilityManager;
            FidesmoProvisioningData fidesmoProvisioningData;
            RealObservabilityManager realObservabilityManager2;
            FidesmoCardEncryptionData fidesmoCardEncryptionData;
            String encodeHex;
            RealObservabilityManager realObservabilityManager3;
            byte[] decodeHex;
            Pair pair;
            RealObservabilityManager realObservabilityManager4;
            RealFidesmoClient.ActiveDelivery activeDelivery;
            FidesmoProvisioningError fidesmoProvisioningError;
            boolean z;
            RealObservabilityManager realObservabilityManager5;
            FidesmoDeviceState.ServiceDelivered serviceDelivered;
            ParametrisedTranslation message;
            RealObservabilityManager realObservabilityManager6;
            FidesmoProvisioningError genericDeliveryFailed;
            String str3;
            String str4;
            FidesmoDeviceState.ServiceDeliveryFailed serviceDeliveryFailed;
            String id;
            Pair pair2;
            String str5 = "encrypted_user_interaction";
            Ref$ObjectRef ref$ObjectRef = this.$lastSeenTotalSteps;
            Ref$ObjectRef ref$ObjectRef2 = this.$lastSeenCurrentStep;
            ProducerScope producerScope = this.$$this$callbackFlow;
            ServiceDeliveryClient serviceDeliveryClient = this.$deliveryManager;
            RealFidesmoClient realFidesmoClient = this.this$0;
            StateFlowImpl stateFlowImpl = realFidesmoClient._provisioningData;
            String str6 = "Service delivery needs user interaction (";
            String str7 = "Fidesmo delivery update: ";
            if (continuation instanceof RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1) {
                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1 = (RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1) continuation;
                str = BreadcrumbHelper.Category.ERROR;
                int i = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1.label;
                if ((i & PKIFailureInfo.systemUnavail) != 0) {
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1.label = i - PKIFailureInfo.systemUnavail;
                    Object obj = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1.result;
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    switch (realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1.label) {
                        case 0:
                            SafeTrace.throwOnFailure(obj);
                            Timber.Forest forest = Timber.Forest;
                            try {
                                forest.d("Fidesmo delivery update: " + Reflection.getOrCreateKotlinClass(deliveryUpdate.getClass()).getSimpleName(), new Object[0]);
                            } catch (Exception e) {
                                e = e;
                                anonymousClass2 = this;
                                str2 = "fidesmo_provisioning_delivery_error";
                                str5 = str;
                                str6 = "stage";
                            }
                            if (!RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.invokeSuspend$isCurrentConnection(this.$connectionId, realFidesmoClient) && !RealFidesmoClient.access$isActiveDelivery(realFidesmoClient, serviceDeliveryClient)) {
                                forest.d("Ignoring stale Fidesmo delivery update", new Object[0]);
                                return Unit.INSTANCE;
                            }
                            int i2 = 1;
                            if (deliveryUpdate instanceof DeliveryUpdate.NotStarted) {
                                forest.i("Service delivery not yet started", new Object[0]);
                                FidesmoDeviceState.DeliveringService deliveringService = new FidesmoDeviceState.DeliveringService(null, null);
                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1.label = 1;
                                if (((ProducerCoroutine) producerScope).send(deliveringService, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                return Unit.INSTANCE;
                            }
                            if (deliveryUpdate instanceof DeliveryUpdate.OperationInProgress) {
                                DeliveryProgress progress = ((DeliveryUpdate.OperationInProgress) deliveryUpdate).getProgress();
                                Integer boxInt = progress != null ? Okio.boxInt(progress.getCurrentStep()) : null;
                                DeliveryProgress progress2 = ((DeliveryUpdate.OperationInProgress) deliveryUpdate).getProgress();
                                Integer boxInt2 = progress2 != null ? Okio.boxInt(progress2.getTotalSteps()) : null;
                                if (boxInt != null) {
                                    ref$ObjectRef2.element = boxInt;
                                }
                                if (boxInt2 != null) {
                                    ref$ObjectRef.element = boxInt2;
                                }
                                forest.i("Service delivery progress: step " + boxInt + " of " + boxInt2, new Object[0]);
                                if (boxInt != null && boxInt2 != null) {
                                    FidesmoDeviceState.DeliveringService deliveringService2 = new FidesmoDeviceState.DeliveringService(boxInt, boxInt2);
                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1.label = 2;
                                    if (((ProducerCoroutine) producerScope).send(deliveringService2, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            if (deliveryUpdate instanceof DeliveryUpdate.NeedsUserInteractionUsingHandler) {
                                forest.d("Service delivery needs user interaction (" + ((DeliveryUpdate.NeedsUserInteractionUsingHandler) deliveryUpdate).getRequirements().size() + " requirements)", new Object[0]);
                                if (RealFidesmoClient.access$hasSdkRetryRequirement(realFidesmoClient, ((DeliveryUpdate.NeedsUserInteractionUsingHandler) deliveryUpdate).getRequirements())) {
                                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(producerScope, null, 0);
                                    ArcadeModal$$ExternalSyntheticLambda2 arcadeModal$$ExternalSyntheticLambda2 = new ArcadeModal$$ExternalSyntheticLambda2(deliveryUpdate, 24);
                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1.label = 3;
                                    if (RealFidesmoClient.access$handleSdkRetryInteraction(realFidesmoClient, serviceDeliveryClient, anonymousClass1, arcadeModal$$ExternalSyntheticLambda2, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    return Unit.INSTANCE;
                                }
                                FidesmoProvisioningData fidesmoProvisioningData2 = (FidesmoProvisioningData) stateFlowImpl.getValue();
                                List<DataRequirement> requirements = ((DeliveryUpdate.NeedsUserInteractionUsingHandler) deliveryUpdate).getRequirements();
                                ArrayList arrayList = new ArrayList();
                                for (DataRequirement dataRequirement : requirements) {
                                    Timber.Forest.d("Processing requirement: " + Reflection.getOrCreateKotlinClass(dataRequirement.getClass()).getSimpleName(), new Object[0]);
                                    RealFidesmoClient.RequirementAnswer requirementAnswer = RealFidesmoClient.getRequirementAnswer(dataRequirement, fidesmoProvisioningData2, null);
                                    if (requirementAnswer == null) {
                                        Timber.Forest.w(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("No auto answer for Fidesmo user interaction requirement (id=", dataRequirement.getId(), ", type=", Reflection.factory.getOrCreateKotlinClass(dataRequirement.getClass()).getSimpleName(), ", encrypted="), false, "). Leaving unanswered for SDK classification."), new Object[0]);
                                        pair2 = null;
                                    } else {
                                        if (requirementAnswer.activationLaterSelected) {
                                            RealFidesmoClient.access$markActivationLaterSelected(realFidesmoClient, serviceDeliveryClient);
                                        }
                                        pair2 = TuplesKt.to(dataRequirement.getId(), requirementAnswer.value);
                                    }
                                    if (pair2 != null) {
                                        arrayList.add(pair2);
                                    }
                                }
                                ((DeliveryUpdate.NeedsUserInteractionUsingHandler) deliveryUpdate).getHandler().invoke(MapsKt__MapsKt.toMap(arrayList));
                                return Unit.INSTANCE;
                            }
                            if (deliveryUpdate instanceof DeliveryUpdate.NeedsEncryptedUserInteraction) {
                                try {
                                    forest.i("Service delivery needs encrypted user interaction", new Object[0]);
                                    fidesmoProvisioningData = (FidesmoProvisioningData) stateFlowImpl.getValue();
                                } catch (Exception e2) {
                                    e = e2;
                                    str7 = "fidesmo_provisioning_delivery_error";
                                    str5 = str;
                                    str6 = "stage";
                                    anonymousClass22 = this;
                                    str2 = str7;
                                    anonymousClass2 = anonymousClass22;
                                    if (!(e instanceof CancellationException)) {
                                    }
                                }
                                if (fidesmoProvisioningData == null || (fidesmoCardEncryptionData = fidesmoProvisioningData.cardEncryptionData) == null) {
                                    String str8 = str;
                                    forest.e("No encrypted card data available in provisioning data", new Object[0]);
                                    realObservabilityManager2 = realFidesmoClient.observabilityManager;
                                    realObservabilityManager2.logEvent("fidesmo_provisioning_delivery_error", MapsKt__MapsKt.mapOf(TuplesKt.to("stage", "encrypted_user_interaction"), TuplesKt.to(str8, "missing_card_data"), TuplesKt.to("completed_steps", ref$ObjectRef2.element), TuplesKt.to("total_steps", ref$ObjectRef.element)));
                                    RealFidesmoClient.access$markDeliveryFailed(realFidesmoClient, serviceDeliveryClient, "Missing encrypted card data");
                                    FidesmoDeviceState.Error error = new FidesmoDeviceState.Error(FidesmoProvisioningError.MissingEncryptedData.INSTANCE);
                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1.label = 4;
                                    if (((ProducerCoroutine) producerScope).send(error, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1) == coroutineSingletons) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                ByteString byteString = fidesmoCardEncryptionData.encryptedCardInfo;
                                if (byteString != null) {
                                    try {
                                        encodeHex = Hex.encodeHex(byteString.toByteArray());
                                    } catch (Exception e3) {
                                        e = e3;
                                        str7 = "fidesmo_provisioning_delivery_error";
                                        str5 = str;
                                        str6 = "stage";
                                    }
                                    if (encodeHex != null) {
                                        String str9 = fidesmoCardEncryptionData.encryptedEphemeralKey;
                                        if (str9 != null && (decodeHex = Hex.decodeHex(str9)) != null) {
                                            if (RealFidesmoClient.access$hasSdkRetryRequirement(realFidesmoClient, ((DeliveryUpdate.NeedsEncryptedUserInteraction) deliveryUpdate).getRequirements())) {
                                                AnonymousClass1 anonymousClass12 = new AnonymousClass1(producerScope, null, i2);
                                                GLSceneScope$$ExternalSyntheticLambda4 gLSceneScope$$ExternalSyntheticLambda4 = new GLSceneScope$$ExternalSyntheticLambda4(11, deliveryUpdate, decodeHex);
                                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1.label = 7;
                                                if (RealFidesmoClient.access$handleSdkRetryInteraction(realFidesmoClient, serviceDeliveryClient, anonymousClass12, gLSceneScope$$ExternalSyntheticLambda4, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1) == coroutineSingletons) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            forest.d("Processing " + ((DeliveryUpdate.NeedsEncryptedUserInteraction) deliveryUpdate).getRequirements().size() + " encrypted requirements", new Object[0]);
                                            List<DataRequirement> requirements2 = ((DeliveryUpdate.NeedsEncryptedUserInteraction) deliveryUpdate).getRequirements();
                                            ArrayList arrayList2 = new ArrayList();
                                            for (DataRequirement dataRequirement2 : requirements2) {
                                                Timber.Forest.d("Processing encrypted requirement: " + Reflection.getOrCreateKotlinClass(dataRequirement2.getClass()).getSimpleName(), new Object[0]);
                                                RealFidesmoClient.RequirementAnswer requirementAnswer2 = RealFidesmoClient.getRequirementAnswer(dataRequirement2, fidesmoProvisioningData, encodeHex);
                                                if (requirementAnswer2 == null) {
                                                    Timber.Forest.w(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("No auto answer for Fidesmo user interaction requirement (id=", dataRequirement2.getId(), ", type=", Reflection.factory.getOrCreateKotlinClass(dataRequirement2.getClass()).getSimpleName(), ", encrypted="), true, "). Leaving unanswered for SDK classification."), new Object[0]);
                                                    pair = null;
                                                } else {
                                                    if (requirementAnswer2.activationLaterSelected) {
                                                        RealFidesmoClient.access$markActivationLaterSelected(realFidesmoClient, serviceDeliveryClient);
                                                    }
                                                    pair = TuplesKt.to(dataRequirement2.getId(), requirementAnswer2.value);
                                                }
                                                if (pair != null) {
                                                    arrayList2.add(pair);
                                                }
                                            }
                                            Map map = MapsKt__MapsKt.toMap(arrayList2);
                                            Timber.Forest.i("Submitting encrypted data to Fidesmo SDK", new Object[0]);
                                            ((DeliveryUpdate.NeedsEncryptedUserInteraction) deliveryUpdate).getHandler().invoke(map, decodeHex);
                                            return Unit.INSTANCE;
                                        }
                                        forest.e("Encrypted ephemeral key is null or cannot be decoded", new Object[0]);
                                        realObservabilityManager3 = realFidesmoClient.observabilityManager;
                                        str6 = "stage";
                                        try {
                                            str5 = str;
                                        } catch (Exception e4) {
                                            e = e4;
                                            str7 = "fidesmo_provisioning_delivery_error";
                                            str5 = str;
                                        }
                                        try {
                                            str7 = "fidesmo_provisioning_delivery_error";
                                            try {
                                                realObservabilityManager3.logEvent(str7, MapsKt__MapsKt.mapOf(TuplesKt.to(str6, "encrypted_user_interaction"), TuplesKt.to(str5, "missing_ephemeral_key"), TuplesKt.to("completed_steps", ref$ObjectRef2.element), TuplesKt.to("total_steps", ref$ObjectRef.element)));
                                                RealFidesmoClient.access$markDeliveryFailed(realFidesmoClient, serviceDeliveryClient, "Missing ephemeral key");
                                                FidesmoDeviceState.Error error2 = new FidesmoDeviceState.Error(FidesmoProvisioningError.MissingEphemeralKey.INSTANCE);
                                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1.label = 6;
                                                if (((ProducerCoroutine) producerScope).send(error2, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1) == coroutineSingletons) {
                                                }
                                                return Unit.INSTANCE;
                                            } catch (Exception e5) {
                                                e = e5;
                                                anonymousClass22 = this;
                                                str2 = str7;
                                                anonymousClass2 = anonymousClass22;
                                                if (!(e instanceof CancellationException)) {
                                                }
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            str7 = "fidesmo_provisioning_delivery_error";
                                            anonymousClass22 = this;
                                            str2 = str7;
                                            anonymousClass2 = anonymousClass22;
                                            if (!(e instanceof CancellationException)) {
                                            }
                                        }
                                    }
                                }
                                String str10 = str;
                                forest.e("Encrypted card info is null or cannot be converted to hex", new Object[0]);
                                realObservabilityManager4 = realFidesmoClient.observabilityManager;
                                realObservabilityManager4.logEvent("fidesmo_provisioning_delivery_error", MapsKt__MapsKt.mapOf(TuplesKt.to("stage", "encrypted_user_interaction"), TuplesKt.to(str10, "missing_card_info"), TuplesKt.to("completed_steps", ref$ObjectRef2.element), TuplesKt.to("total_steps", ref$ObjectRef.element)));
                                RealFidesmoClient.access$markDeliveryFailed(realFidesmoClient, serviceDeliveryClient, "Missing encrypted card info");
                                FidesmoDeviceState.Error error3 = new FidesmoDeviceState.Error(FidesmoProvisioningError.MissingEncryptedData.INSTANCE);
                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1.label = 5;
                                if (((ProducerCoroutine) producerScope).send(error3, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1) == coroutineSingletons) {
                                }
                                return Unit.INSTANCE;
                                return coroutineSingletons;
                            }
                            str5 = str;
                            str6 = "stage";
                            if (deliveryUpdate instanceof DeliveryUpdate.NeedsUserActionUsingHandler) {
                                forest.d("Service delivery needs user action, auto-accepting", new Object[0]);
                                ((DeliveryUpdate.NeedsUserActionUsingHandler) deliveryUpdate).getHandler().invoke(Okio.boxBoolean(true));
                            } else if (deliveryUpdate instanceof DeliveryUpdate.Finished) {
                                synchronized (realFidesmoClient.nfcDiscoveryLock) {
                                    try {
                                        try {
                                            RealFidesmoClient.ActiveDelivery activeDelivery2 = realFidesmoClient.activeDelivery;
                                            if (activeDelivery2 != null) {
                                                RealFidesmoClient.ActiveDelivery activeDelivery3 = activeDelivery2.client.equals(serviceDeliveryClient) ? activeDelivery2 : null;
                                                if (activeDelivery3 != null) {
                                                    str2 = null;
                                                    activeDelivery = RealFidesmoClient.ActiveDelivery.copy$default(activeDelivery3, RealFidesmoClient.ActiveDeliveryState.SdkFinished.INSTANCE, false, 0, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                                                    realFidesmoClient.activeDelivery = activeDelivery;
                                                }
                                            }
                                            activeDelivery = realFidesmoClient.activeDelivery;
                                            realFidesmoClient.activeDelivery = activeDelivery;
                                        } catch (Exception e7) {
                                            e = e7;
                                            anonymousClass2 = ref$ObjectRef;
                                        }
                                    } finally {
                                    }
                                }
                                boolean enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) realFidesmoClient.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$CashTagActivationErrorOverrideV2.INSTANCE)).enabled();
                                ParametrisedTranslation message2 = ((DeliveryUpdate.Finished) deliveryUpdate).getStatus().getMessage();
                                if (message2 == null || (id = message2.getId()) == null) {
                                    fidesmoProvisioningError = null;
                                } else {
                                    FidesmoProvisioningError.Companion.getClass();
                                    fidesmoProvisioningError = FidesmoProvisioningError.Companion.fromDeliveryStatusId(id);
                                }
                                boolean z2 = enabled && fidesmoProvisioningError != null && fidesmoProvisioningError.isYellowPath();
                                boolean access$wasActivationLaterSelected = RealFidesmoClient.access$wasActivationLaterSelected(realFidesmoClient, serviceDeliveryClient);
                                if (!z2 && (!Intrinsics.areEqual(((DeliveryUpdate.Finished) deliveryUpdate).getStatus().getSuccess(), Okio.boxBoolean(true)) || !access$wasActivationLaterSelected)) {
                                    z = false;
                                    if (!Intrinsics.areEqual(((DeliveryUpdate.Finished) deliveryUpdate).getStatus().getSuccess(), Okio.boxBoolean(true)) || z) {
                                        if (!z2) {
                                            ParametrisedTranslation message3 = ((DeliveryUpdate.Finished) deliveryUpdate).getStatus().getMessage();
                                            forest.i("Service delivery failed with " + (message3 != null ? message3.getId() : null) + " but treating as success due to feature flag", new Object[0]);
                                        } else if (access$wasActivationLaterSelected) {
                                            forest.i("Service delivery completed after selecting Activate Later; token activation required", new Object[0]);
                                        } else {
                                            forest.i("Service delivery completed successfully", new Object[0]);
                                        }
                                        realObservabilityManager5 = realFidesmoClient.observabilityManager;
                                        realObservabilityManager5.logEvent("fidesmo_provisioning_delivery_finished", MapsKt__MapsKt.mapOf(TuplesKt.to("success", Okio.boxBoolean(true)), TuplesKt.to("error_override_applied", Okio.boxBoolean(z2)), TuplesKt.to("activate_later_selected", Okio.boxBoolean(access$wasActivationLaterSelected)), TuplesKt.to("overridden_error_id", (z2 || (message = ((DeliveryUpdate.Finished) deliveryUpdate).getStatus().getMessage()) == null) ? null : message.getId())));
                                        serviceDelivered = new FidesmoDeviceState.ServiceDelivered(z);
                                        realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1.label = 8;
                                        if (((ProducerCoroutine) producerScope).send(serviceDelivered, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else {
                                        ParametrisedTranslation message4 = ((DeliveryUpdate.Finished) deliveryUpdate).getStatus().getMessage();
                                        String id2 = message4 != null ? message4.getId() : null;
                                        ParametrisedTranslation message5 = ((DeliveryUpdate.Finished) deliveryUpdate).getStatus().getMessage();
                                        String text = message5 != null ? message5.getText() : null;
                                        str2 = "fidesmo_provisioning_delivery_error";
                                        try {
                                            forest.e("Service delivery failed (errorId=" + id2 + ", errorText=" + text + ", lastStep=" + ref$ObjectRef2.element + ", totalSteps=" + ref$ObjectRef.element + ")", new Object[0]);
                                            realObservabilityManager6 = realFidesmoClient.observabilityManager;
                                            realObservabilityManager6.logEvent("fidesmo_provisioning_delivery_finished", MapsKt__MapsKt.mapOf(TuplesKt.to("success", Okio.boxBoolean(false)), TuplesKt.to("error_id", id2), TuplesKt.to("error_text", text), TuplesKt.to("last_step", ref$ObjectRef2.element), TuplesKt.to("total_steps", ref$ObjectRef.element)));
                                            if (id2 != null) {
                                                FidesmoProvisioningError.Companion.getClass();
                                                genericDeliveryFailed = FidesmoProvisioningError.Companion.fromDeliveryStatusId(id2);
                                            } else {
                                                genericDeliveryFailed = new FidesmoProvisioningError.GenericDeliveryFailed();
                                            }
                                            String str11 = id2;
                                            String str12 = text;
                                            FidesmoProvisioningError.WithSdkContext withSdkContext = new FidesmoProvisioningError.WithSdkContext(genericDeliveryFailed, str11, str12, realFidesmoClient.appId, this.$availableService.serviceId);
                                            realFidesmoClient.markDeliveryCancellationSent(serviceDeliveryClient);
                                            if (str12 != null) {
                                                str3 = "Delivery failed: ";
                                                str4 = str12;
                                            } else if (str11 == null) {
                                                str4 = "unknown";
                                                str3 = "Delivery failed: ";
                                            } else {
                                                str3 = "Delivery failed: ";
                                                str4 = str11;
                                            }
                                            RealFidesmoClient.cancelDelivery(serviceDeliveryClient, str3.concat(str4), "Fidesmo delivery finished unsuccessfully.");
                                            serviceDeliveryFailed = new FidesmoDeviceState.ServiceDeliveryFailed(withSdkContext);
                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1.label = 9;
                                        } catch (Exception e8) {
                                            e = e8;
                                            anonymousClass2 = this;
                                            if (!(e instanceof CancellationException)) {
                                                throw e;
                                            }
                                            Timber.Forest.e("Exception during delivery update handling", new Object[0], e);
                                            realObservabilityManager = realFidesmoClient.observabilityManager;
                                            Pair pair3 = TuplesKt.to(str6, "delivery_collect");
                                            String message6 = e.getMessage();
                                            if (message6 == null) {
                                                message6 = Reflection.getOrCreateKotlinClass(e.getClass()).getSimpleName();
                                            }
                                            realObservabilityManager.logEvent(str2, MapsKt__MapsKt.mapOf(pair3, TuplesKt.to(str5, message6)));
                                            ProducerScope producerScope2 = anonymousClass2.$$this$callbackFlow;
                                            long j = anonymousClass2.$connectionId;
                                            FidesmoDeviceState.Error error4 = new FidesmoDeviceState.Error(new FidesmoProvisioningError.GenericDeliveryFailed());
                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1.label = 10;
                                            break;
                                        }
                                        if (((ProducerCoroutine) producerScope).send(serviceDeliveryFailed, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    }
                                }
                                z = true;
                                if (Intrinsics.areEqual(((DeliveryUpdate.Finished) deliveryUpdate).getStatus().getSuccess(), Okio.boxBoolean(true))) {
                                }
                                if (!z2) {
                                }
                                realObservabilityManager5 = realFidesmoClient.observabilityManager;
                                realObservabilityManager5.logEvent("fidesmo_provisioning_delivery_finished", MapsKt__MapsKt.mapOf(TuplesKt.to("success", Okio.boxBoolean(true)), TuplesKt.to("error_override_applied", Okio.boxBoolean(z2)), TuplesKt.to("activate_later_selected", Okio.boxBoolean(access$wasActivationLaterSelected)), TuplesKt.to("overridden_error_id", (z2 || (message = ((DeliveryUpdate.Finished) deliveryUpdate).getStatus().getMessage()) == null) ? null : message.getId())));
                                serviceDelivered = new FidesmoDeviceState.ServiceDelivered(z);
                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1.label = 8;
                                if (((ProducerCoroutine) producerScope).send(serviceDelivered, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1) == coroutineSingletons) {
                                }
                            }
                            return Unit.INSTANCE;
                        case 1:
                        case 2:
                        case 8:
                        case 9:
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        case 3:
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        case 4:
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        case 5:
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        case 6:
                            SafeTrace.throwOnFailure(obj);
                            str6 = "stage";
                            str7 = "fidesmo_provisioning_delivery_error";
                            str5 = str;
                            return Unit.INSTANCE;
                        case 7:
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        case 10:
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        default:
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            } else {
                str = BreadcrumbHelper.Category.ERROR;
            }
            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1 = new RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1(this, continuation);
            Object obj2 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1.result;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            switch (realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$2$emit$1.label) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1(RealFidesmoClient realFidesmoClient, Device device, ProducerScope producerScope, FidesmoServiceType fidesmoServiceType, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realFidesmoClient;
        this.$device = device;
        this.$$this$callbackFlow = producerScope;
        this.$serviceType = fidesmoServiceType;
        this.$connectionId = j;
    }

    public static final boolean invokeSuspend$isCurrentConnection(long j, RealFidesmoClient realFidesmoClient) {
        return j == realFidesmoClient.activeConnectionId.get();
    }

    public static final Object invokeSuspend$sendIfCurrent(ProducerScope producerScope, long j, RealFidesmoClient realFidesmoClient, FidesmoDeviceState fidesmoDeviceState, ContinuationImpl continuationImpl) {
        Object send;
        return (invokeSuspend$isCurrentConnection(j, realFidesmoClient) && (send = ((ProducerCoroutine) producerScope)._channel.send(fidesmoDeviceState, continuationImpl)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? send : Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1 realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1 = new RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1(this.this$0, this.$device, this.$$this$callbackFlow, this.$serviceType, this.$connectionId, continuation);
        realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$0 = obj;
        return realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0240, code lost:
    
        if (invokeSuspend$sendIfCurrent(r0, r6, r3, r4, r5) == r11) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0637, code lost:
    
        if (invokeSuspend$sendIfCurrent(r0, r2, r3, r4, r5) == r11) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0174, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r0)._channel.send(r1, r5) == r11) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0413, code lost:
    
        if (r14.collect(r1, r13) == r11) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0533, code lost:
    
        if (invokeSuspend$sendIfCurrent(r2, r4, r6, r4, r13) != r11) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0562, code lost:
    
        if (invokeSuspend$sendIfCurrent(r2, r3, r3, r4, r5) == r11) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x05d4, code lost:
    
        if (invokeSuspend$sendIfCurrent(r0, r2, r3, r4, r5) != r11) goto L176;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0389 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c3  */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r2v48, types: [com.squareup.cash.fidesmo.api.FidesmoProvisioningError] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object access$awaitInitialConnectionStabilityCheck;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$ObjectRef ref$ObjectRef4;
        ?? r13;
        int i;
        Object await;
        Ref$ObjectRef ref$ObjectRef5;
        Ref$ObjectRef ref$ObjectRef6;
        Object access$getActivationData;
        DeviceDescription deviceDescription;
        Ref$ObjectRef ref$ObjectRef7;
        int i2;
        FidesmoActivationData fidesmoActivationData;
        RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1 realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1;
        int i3;
        Object access$getAvailableService;
        Ref$ObjectRef ref$ObjectRef8;
        DeviceDescription deviceDescription2;
        FidesmoActivationData fidesmoActivationData2;
        Ref$ObjectRef ref$ObjectRef9;
        FidesmoProvisioningError.WithSdkContext withSdkContext;
        Object first;
        FidesmoProvisioningError.WithSdkContext withSdkContext2;
        int i4;
        Object first2;
        RealFidesmoClient.DeliveryService deliveryService;
        int i5;
        Object obj2;
        RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1 realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12 = this;
        CoroutineScope coroutineScope = (CoroutineScope) realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.label) {
            case 0:
                Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                Ref$ObjectRef ref$ObjectRef10 = new Ref$ObjectRef();
                RealFidesmoClient realFidesmoClient = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0;
                Device device = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$device;
                RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$isConnectionStable$1 realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$isConnectionStable$1 = new RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$isConnectionStable$1(realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$$this$callbackFlow, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$connectionId, realFidesmoClient, null);
                RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$isConnectionStable$2 realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$isConnectionStable$2 = new RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$isConnectionStable$2(realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$connectionId, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0);
                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$0 = coroutineScope;
                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$1 = m;
                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$2 = ref$ObjectRef10;
                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.label = 1;
                access$awaitInitialConnectionStabilityCheck = RealFidesmoClient.access$awaitInitialConnectionStabilityCheck(realFidesmoClient, device, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$isConnectionStable$1, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$isConnectionStable$2, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12);
                if (access$awaitInitialConnectionStabilityCheck != coroutineSingletons) {
                    ref$ObjectRef = m;
                    ref$ObjectRef2 = ref$ObjectRef10;
                    boolean booleanValue = ((Boolean) access$awaitInitialConnectionStabilityCheck).booleanValue();
                    if (!invokeSuspend$isCurrentConnection(realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$connectionId, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0)) {
                        if (!booleanValue) {
                            Timber.Forest.w("Fidesmo device became unstable before provisioning started", new Object[0]);
                            RealObservabilityManager realObservabilityManager = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0.observabilityManager;
                            Pair pair = new Pair("stage", "stability_check");
                            FidesmoProvisioningError.ConnectionUnstable connectionUnstable = FidesmoProvisioningError.ConnectionUnstable.INSTANCE;
                            realObservabilityManager.logEvent("fidesmo_provisioning_delivery_error", MapsKt__MapsKt.mapOf(pair, new Pair(BreadcrumbHelper.Category.ERROR, FidesmoProvisioningError.ConnectionUnstable.cdfShortName)));
                            RealFidesmoClient realFidesmoClient2 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0;
                            if (!invokeSuspend$isCurrentConnection(realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$connectionId, realFidesmoClient2)) {
                                return Unit.INSTANCE;
                            }
                            realFidesmoClient2.incrementActiveConnectionId();
                            realFidesmoClient2._activationData.setValue(null);
                            ProducerScope producerScope = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$$this$callbackFlow;
                            FidesmoDeviceState.Error error = new FidesmoDeviceState.Error(connectionUnstable);
                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$0 = null;
                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$1 = null;
                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$2 = null;
                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.I$0 = booleanValue ? 1 : 0;
                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.label = 2;
                            break;
                        } else {
                            ProducerScope producerScope2 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$$this$callbackFlow;
                            long j = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$connectionId;
                            RealFidesmoClient realFidesmoClient3 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0;
                            FidesmoDeviceState.PreparingDelivery preparingDelivery = FidesmoDeviceState.PreparingDelivery.INSTANCE;
                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$0 = coroutineScope;
                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$1 = ref$ObjectRef;
                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$2 = ref$ObjectRef2;
                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.I$0 = booleanValue ? 1 : 0;
                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.label = 3;
                            if (invokeSuspend$sendIfCurrent(producerScope2, j, realFidesmoClient3, preparingDelivery, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12) != coroutineSingletons) {
                                ref$ObjectRef3 = ref$ObjectRef2;
                                ref$ObjectRef4 = ref$ObjectRef;
                                r13 = booleanValue;
                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0._activationData.setValue(null);
                                try {
                                    Single description = DeviceUtilsKt.getDescription(realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$device, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0.deviceInfoClient);
                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$0 = coroutineScope;
                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$1 = ref$ObjectRef4;
                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$2 = ref$ObjectRef3;
                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.I$0 = r13;
                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.label = 4;
                                    await = RxAwaitKt.await(description, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12);
                                    if (await != coroutineSingletons) {
                                        ref$ObjectRef5 = ref$ObjectRef4;
                                        ref$ObjectRef6 = ref$ObjectRef3;
                                        i = r13;
                                        DeviceDescription deviceDescription3 = (DeviceDescription) await;
                                        deviceDescription3.getClass();
                                        if (invokeSuspend$isCurrentConnection(realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$connectionId, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0)) {
                                            return Unit.INSTANCE;
                                        }
                                        Timber.Forest.i("Device info obtained successfully", new Object[0]);
                                        RealFidesmoClient realFidesmoClient4 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0;
                                        String cin = deviceDescription3.getCin();
                                        realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$0 = coroutineScope;
                                        realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$1 = ref$ObjectRef5;
                                        realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$2 = ref$ObjectRef6;
                                        realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$3 = deviceDescription3;
                                        realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.I$0 = i;
                                        realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.label = 6;
                                        access$getActivationData = RealFidesmoClient.access$getActivationData(realFidesmoClient4, cin, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12);
                                        if (access$getActivationData != coroutineSingletons) {
                                            int i6 = i;
                                            deviceDescription = deviceDescription3;
                                            ref$ObjectRef7 = ref$ObjectRef6;
                                            i2 = i6;
                                            fidesmoActivationData = (FidesmoActivationData) access$getActivationData;
                                            if (fidesmoActivationData != null) {
                                                RealFidesmoClient realFidesmoClient5 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0;
                                                ProducerScope producerScope3 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$$this$callbackFlow;
                                                long j2 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$connectionId;
                                                Timber.Forest.e("Failed to obtain activation data", new Object[0]);
                                                realFidesmoClient5.observabilityManager.logEvent("fidesmo_provisioning_delivery_error", MapsKt__MapsJVMKt.mapOf(new Pair("stage", "activation_data")));
                                                FidesmoDeviceState.Error error2 = new FidesmoDeviceState.Error(FidesmoProvisioningError.ActivationDataUnavailable.INSTANCE);
                                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$0 = null;
                                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$1 = null;
                                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$2 = null;
                                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$3 = null;
                                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$4 = null;
                                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.I$0 = i2;
                                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.I$1 = 0;
                                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.label = 7;
                                                break;
                                            } else {
                                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12;
                                                if (!invokeSuspend$isCurrentConnection(realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$connectionId, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0)) {
                                                    return Unit.INSTANCE;
                                                }
                                                Timber.Forest forest = Timber.Forest;
                                                forest.i(Fragment$5$$ExternalSyntheticOutline0.m("Activation data obtained (isProvisioned=", ")", fidesmoActivationData.isProvisioned), new Object[0]);
                                                FidesmoServiceType fidesmoServiceType = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$serviceType;
                                                FidesmoServiceType fidesmoServiceType2 = FidesmoServiceType.UNINSTALL;
                                                if (fidesmoServiceType == fidesmoServiceType2) {
                                                    StateFlowImpl stateFlowImpl = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0._activationData;
                                                    stateFlowImpl.getClass();
                                                    stateFlowImpl.updateState(null, fidesmoActivationData);
                                                }
                                                if (realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$serviceType == fidesmoServiceType2 && fidesmoActivationData.installedAppsCount == 0) {
                                                    forest.i("No installed Cash app found; skipping uninstall service lookup", new Object[0]);
                                                    return Unit.INSTANCE;
                                                }
                                                forest.d("Getting available service...", new Object[0]);
                                                try {
                                                    RealFidesmoClient realFidesmoClient6 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0;
                                                    String cin2 = deviceDescription.getCin();
                                                    FidesmoServiceType fidesmoServiceType3 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$serviceType;
                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$0 = coroutineScope;
                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$1 = ref$ObjectRef5;
                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$2 = ref$ObjectRef7;
                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$3 = deviceDescription;
                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$4 = fidesmoActivationData;
                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.I$0 = i2;
                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.label = 8;
                                                    access$getAvailableService = RealFidesmoClient.access$getAvailableService(realFidesmoClient6, cin2, fidesmoServiceType3, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1);
                                                    if (access$getAvailableService != coroutineSingletons) {
                                                        ref$ObjectRef8 = ref$ObjectRef5;
                                                        deviceDescription2 = deviceDescription;
                                                        i3 = i2;
                                                        fidesmoActivationData2 = fidesmoActivationData;
                                                        ref$ObjectRef9 = ref$ObjectRef7;
                                                        try {
                                                            RealFidesmoClient.ServiceLookupResult serviceLookupResult = (RealFidesmoClient.ServiceLookupResult) access$getAvailableService;
                                                            if (invokeSuspend$isCurrentConnection(realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$connectionId, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0)) {
                                                                return Unit.INSTANCE;
                                                            }
                                                            if (serviceLookupResult instanceof RealFidesmoClient.ServiceLookupResult.Available) {
                                                                RealFidesmoClient.DeliveryService deliveryService2 = ((RealFidesmoClient.ServiceLookupResult.Available) serviceLookupResult).service;
                                                                Timber.Forest forest2 = Timber.Forest;
                                                                forest2.i(Recorder$$ExternalSyntheticOutline2.m("Service available for delivery: ", deliveryService2.serviceId), new Object[0]);
                                                                StateFlowImpl stateFlowImpl2 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0._activationData;
                                                                FidesmoActivationData copy$default = FidesmoActivationData.copy$default(fidesmoActivationData2, deliveryService2.certificate);
                                                                stateFlowImpl2.getClass();
                                                                stateFlowImpl2.updateState(null, copy$default);
                                                                forest2.i("Waiting for provisioning data from backend...", new Object[0]);
                                                                RealFidesmoClient realFidesmoClient7 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0;
                                                                long j3 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$connectionId;
                                                                String str = fidesmoActivationData2.fidesmoId;
                                                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$0 = coroutineScope;
                                                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$1 = ref$ObjectRef8;
                                                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$2 = ref$ObjectRef9;
                                                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$3 = deviceDescription2;
                                                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$4 = fidesmoActivationData2;
                                                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$6 = deliveryService2;
                                                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.I$0 = i3;
                                                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.label = 13;
                                                                first2 = FlowKt.first(FlowKt.merge(new FormCashtag$8$invokeSuspend$$inlined$map$1(new Transform$special$$inlined$map$1(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(realFidesmoClient7._provisioningData, 24), str, 10), 6), new FormCashtag$8$invokeSuspend$$inlined$map$1(new RealFidesmoClient$getActivationData$$inlined$filter$1(realFidesmoClient7.activeConnectionIdState, j3, 1), 7)), realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1);
                                                                if (first2 != coroutineSingletons) {
                                                                    int i7 = i3;
                                                                    deliveryService = deliveryService2;
                                                                    i5 = i7;
                                                                    if (!(((RealFidesmoClient.ProvisioningDataWaitResult) first2) instanceof RealFidesmoClient.ProvisioningDataWaitResult.ConnectionInvalidated) && invokeSuspend$isCurrentConnection(realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$connectionId, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0)) {
                                                                        realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0.observabilityManager.logEvent("fidesmo_provisioning_delivery_started", MapsKt__MapsJVMKt.mapOf(new Pair("is_provisioned", Boolean.valueOf(fidesmoActivationData2.isProvisioned))));
                                                                        Device device2 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$device;
                                                                        Objects.requireNonNull(device2, "defaultValue is null");
                                                                        BehaviorSubject behaviorSubject = new BehaviorSubject(device2);
                                                                        ServiceDeliveryClient serviceDeliveryClient = new ServiceDeliveryClient(new ObservableHide(behaviorSubject, 0), "en");
                                                                        RealFidesmoClient realFidesmoClient8 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0;
                                                                        ServiceDeliveryRequired build = ServiceDeliveryRequired.INSTANCE.builder(realFidesmoClient8.appId, deliveryService.serviceId, deviceDescription2.getCin()).setServicePublicKey(deliveryService.servicePublicKey).setClientInfo(realFidesmoClient8.clientInfo).setUseExternalEncryption(true).build();
                                                                        RealFidesmoClient realFidesmoClient9 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0;
                                                                        obj2 = realFidesmoClient9.nfcDiscoveryLock;
                                                                        long j4 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$connectionId;
                                                                        synchronized (obj2) {
                                                                            if (realFidesmoClient9.nfcDiscoveryStarted && invokeSuspend$isCurrentConnection(j4, realFidesmoClient9)) {
                                                                                realFidesmoClient9.activeDelivery = new RealFidesmoClient.ActiveDelivery(serviceDeliveryClient, behaviorSubject, RealFidesmoClient.ActiveDeliveryState.InProgress.INSTANCE, true, 0, 0, false);
                                                                            } else {
                                                                                r6 = 0;
                                                                            }
                                                                        }
                                                                        if (r6 != 0) {
                                                                            Timber.Forest.i(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Starting Fidesmo service delivery with live NFC device stream (device=", RealFidesmoClient.logId(realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$device), ")"), new Object[0]);
                                                                            Observable<DeliveryUpdate> deliverUsingHandlers = serviceDeliveryClient.deliverUsingHandlers(build);
                                                                            deliverUsingHandlers.getClass();
                                                                            FinishSetupTileBadgeCounter finishSetupTileBadgeCounter = new FinishSetupTileBadgeCounter(21, FlowKt.callbackFlow(new RxConvertKt$asFlow$1(deliverUsingHandlers, null, 0)), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0, serviceDeliveryClient, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$$this$callbackFlow, (Continuation) null));
                                                                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0, serviceDeliveryClient, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$$this$callbackFlow, ref$ObjectRef8, ref$ObjectRef9, coroutineScope, deliveryService, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$connectionId);
                                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$0 = null;
                                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$1 = null;
                                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$2 = null;
                                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$3 = null;
                                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$4 = null;
                                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$6 = null;
                                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.I$0 = i5;
                                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.label = 14;
                                                                            break;
                                                                        } else {
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            } else {
                                                                if (!(serviceLookupResult instanceof RealFidesmoClient.ServiceLookupResult.Unavailable)) {
                                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                    return null;
                                                                }
                                                                FidesmoServiceType fidesmoServiceType4 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$serviceType;
                                                                FidesmoServiceType fidesmoServiceType5 = FidesmoServiceType.INSTALL;
                                                                r6 = (fidesmoServiceType4 == fidesmoServiceType5 && fidesmoActivationData2.isProvisioned) ? 1 : 0;
                                                                if (r6 != 0) {
                                                                    FidesmoProvisioningError.WithSdkContext withSdkContext3 = ((RealFidesmoClient.ServiceLookupResult.Unavailable) serviceLookupResult).error;
                                                                    withSdkContext = new FidesmoProvisioningError.WithSdkContext(FidesmoProvisioningError.TagAlreadyActivated.INSTANCE, withSdkContext3.sdkMessageId, withSdkContext3.sdkMessageText, withSdkContext3.sdkAppId, withSdkContext3.sdkServiceId);
                                                                } else {
                                                                    withSdkContext = ((RealFidesmoClient.ServiceLookupResult.Unavailable) serviceLookupResult).error;
                                                                }
                                                                String m2 = Recorder$$ExternalSyntheticOutline2.m("No available service found for delivery: ", withSdkContext.getCdfShortName());
                                                                Timber.Forest forest3 = Timber.Forest;
                                                                forest3.w(m2, new Object[0]);
                                                                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0.observabilityManager.logEvent("fidesmo_provisioning_delivery_error", MapsKt__MapsKt.mapOf(new Pair("stage", "service_lookup"), new Pair(BreadcrumbHelper.Category.ERROR, withSdkContext.getCdfShortName()), new Pair("http_status", withSdkContext.getSdkMessageId()), new Pair("reason", withSdkContext.getSdkMessageText())));
                                                                if (realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$serviceType != fidesmoServiceType5 || !Intrinsics.areEqual(withSdkContext.getSdkMessageId(), "412")) {
                                                                    RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1 realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$13 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1;
                                                                    ProducerScope producerScope4 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$13.$$this$callbackFlow;
                                                                    long j5 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$13.$connectionId;
                                                                    RealFidesmoClient realFidesmoClient10 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$13.this$0;
                                                                    FidesmoDeviceState.Error error3 = new FidesmoDeviceState.Error(withSdkContext);
                                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$13.L$0 = null;
                                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$13.L$1 = null;
                                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$13.L$2 = null;
                                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$13.L$3 = null;
                                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$13.L$4 = null;
                                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$13.L$6 = null;
                                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$13.I$0 = i3;
                                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$13.I$1 = r6;
                                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$13.label = 12;
                                                                    break;
                                                                } else {
                                                                    forest3.w("Install service unavailable; checking backend before surfacing error", new Object[0]);
                                                                    StateFlowImpl stateFlowImpl3 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0._activationData;
                                                                    FidesmoActivationData copy$default2 = FidesmoActivationData.copy$default(fidesmoActivationData2, null);
                                                                    stateFlowImpl3.getClass();
                                                                    stateFlowImpl3.updateState(null, copy$default2);
                                                                    RealFidesmoClient realFidesmoClient11 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0;
                                                                    long j6 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$connectionId;
                                                                    String str2 = fidesmoActivationData2.fidesmoId;
                                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$0 = null;
                                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$1 = null;
                                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$2 = null;
                                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$3 = null;
                                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$4 = null;
                                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$6 = withSdkContext;
                                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.I$0 = i3;
                                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.I$1 = r6;
                                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.label = 10;
                                                                    first = FlowKt.first(FlowKt.merge(new FormCashtag$8$invokeSuspend$$inlined$map$1(new Transform$special$$inlined$map$1(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(realFidesmoClient11._provisioningData, 24), str2, 10), 6), new FormCashtag$8$invokeSuspend$$inlined$map$1(new RealFidesmoClient$getActivationData$$inlined$filter$1(realFidesmoClient11.activeConnectionIdState, j6, 1), 7)), realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1);
                                                                    if (first != coroutineSingletons) {
                                                                        withSdkContext2 = withSdkContext;
                                                                        i4 = r6;
                                                                        if (!(((RealFidesmoClient.ProvisioningDataWaitResult) first) instanceof RealFidesmoClient.ProvisioningDataWaitResult.ConnectionInvalidated) && invokeSuspend$isCurrentConnection(realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$connectionId, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0)) {
                                                                            Timber.Forest.w("Backend allowed provisioning after install service was unavailable", new Object[0]);
                                                                            ProducerScope producerScope5 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$$this$callbackFlow;
                                                                            long j7 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$connectionId;
                                                                            RealFidesmoClient realFidesmoClient12 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0;
                                                                            FidesmoDeviceState.Error error4 = new FidesmoDeviceState.Error(withSdkContext2);
                                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$0 = null;
                                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$1 = null;
                                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$2 = null;
                                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$3 = null;
                                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$4 = null;
                                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$6 = null;
                                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.I$0 = i3;
                                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.I$1 = i4;
                                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.label = 11;
                                                                            break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                }
                                                            }
                                                        } catch (Exception e) {
                                                            e = e;
                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1;
                                                            Timber.Forest.e("Failed to obtain service descriptions", new Object[0], e);
                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0.observabilityManager.logEvent("fidesmo_provisioning_delivery_error", MapsKt__MapsKt.mapOf(new Pair("stage", "service_descriptions"), new Pair(BreadcrumbHelper.Category.ERROR, Reflection.factory.getOrCreateKotlinClass(e.getClass()).getSimpleName())));
                                                            ProducerScope producerScope6 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$$this$callbackFlow;
                                                            long j8 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$connectionId;
                                                            RealFidesmoClient realFidesmoClient13 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0;
                                                            FidesmoDeviceState.Error error5 = new FidesmoDeviceState.Error(FidesmoProvisioningError.ServiceLookupFailed.INSTANCE);
                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$0 = null;
                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$1 = null;
                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$2 = null;
                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$3 = null;
                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$4 = null;
                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.I$0 = i3;
                                                            realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.label = 9;
                                                            break;
                                                        }
                                                    }
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1;
                                                    i3 = i2;
                                                    Timber.Forest.e("Failed to obtain service descriptions", new Object[0], e);
                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0.observabilityManager.logEvent("fidesmo_provisioning_delivery_error", MapsKt__MapsKt.mapOf(new Pair("stage", "service_descriptions"), new Pair(BreadcrumbHelper.Category.ERROR, Reflection.factory.getOrCreateKotlinClass(e.getClass()).getSimpleName())));
                                                    ProducerScope producerScope62 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$$this$callbackFlow;
                                                    long j82 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$connectionId;
                                                    RealFidesmoClient realFidesmoClient132 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0;
                                                    FidesmoDeviceState.Error error52 = new FidesmoDeviceState.Error(FidesmoProvisioningError.ServiceLookupFailed.INSTANCE);
                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$0 = null;
                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$1 = null;
                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$2 = null;
                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$3 = null;
                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$4 = null;
                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.I$0 = i3;
                                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.label = 9;
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    i = r13;
                                    Timber.Forest.e("Failed to obtain device info", new Object[0], e);
                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0.observabilityManager.logEvent("fidesmo_provisioning_delivery_error", MapsKt__MapsKt.mapOf(new Pair("stage", "device_info"), new Pair(BreadcrumbHelper.Category.ERROR, Reflection.factory.getOrCreateKotlinClass(e.getClass()).getSimpleName())));
                                    ProducerScope producerScope7 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$$this$callbackFlow;
                                    long j9 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$connectionId;
                                    RealFidesmoClient realFidesmoClient14 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0;
                                    FidesmoDeviceState.Error error6 = new FidesmoDeviceState.Error(FidesmoProvisioningError.DeviceInfoUnavailable.INSTANCE);
                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$0 = null;
                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$1 = null;
                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$2 = null;
                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$3 = null;
                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.I$0 = i;
                                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.label = 5;
                                    break;
                                }
                            }
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                }
                return coroutineSingletons;
            case 1:
                Ref$ObjectRef ref$ObjectRef11 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$2;
                Ref$ObjectRef ref$ObjectRef12 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$1;
                SafeTrace.throwOnFailure(obj);
                access$awaitInitialConnectionStabilityCheck = obj;
                ref$ObjectRef2 = ref$ObjectRef11;
                ref$ObjectRef = ref$ObjectRef12;
                boolean booleanValue2 = ((Boolean) access$awaitInitialConnectionStabilityCheck).booleanValue();
                if (!invokeSuspend$isCurrentConnection(realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$connectionId, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0)) {
                }
                break;
            case 2:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 3:
                int i8 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.I$0;
                ref$ObjectRef3 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$2;
                ref$ObjectRef4 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$1;
                SafeTrace.throwOnFailure(obj);
                r13 = i8;
                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0._activationData.setValue(null);
                Single description2 = DeviceUtilsKt.getDescription(realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$device, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0.deviceInfoClient);
                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$0 = coroutineScope;
                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$1 = ref$ObjectRef4;
                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$2 = ref$ObjectRef3;
                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.I$0 = r13;
                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.label = 4;
                await = RxAwaitKt.await(description2, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12);
                if (await != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 4:
                i = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.I$0;
                Ref$ObjectRef ref$ObjectRef13 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$2;
                Ref$ObjectRef ref$ObjectRef14 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$1;
                try {
                    SafeTrace.throwOnFailure(obj);
                    ref$ObjectRef5 = ref$ObjectRef14;
                    ref$ObjectRef6 = ref$ObjectRef13;
                    await = obj;
                    DeviceDescription deviceDescription32 = (DeviceDescription) await;
                    deviceDescription32.getClass();
                    if (invokeSuspend$isCurrentConnection(realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$connectionId, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0)) {
                    }
                } catch (Exception e4) {
                    e = e4;
                    Timber.Forest.e("Failed to obtain device info", new Object[0], e);
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0.observabilityManager.logEvent("fidesmo_provisioning_delivery_error", MapsKt__MapsKt.mapOf(new Pair("stage", "device_info"), new Pair(BreadcrumbHelper.Category.ERROR, Reflection.factory.getOrCreateKotlinClass(e.getClass()).getSimpleName())));
                    ProducerScope producerScope72 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$$this$callbackFlow;
                    long j92 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$connectionId;
                    RealFidesmoClient realFidesmoClient142 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0;
                    FidesmoDeviceState.Error error62 = new FidesmoDeviceState.Error(FidesmoProvisioningError.DeviceInfoUnavailable.INSTANCE);
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$0 = null;
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$1 = null;
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$2 = null;
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$3 = null;
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.I$0 = i;
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.label = 5;
                    break;
                }
                break;
            case 5:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 6:
                int i9 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.I$0;
                deviceDescription = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$3;
                Ref$ObjectRef ref$ObjectRef15 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$2;
                ref$ObjectRef5 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$1;
                SafeTrace.throwOnFailure(obj);
                i2 = i9;
                ref$ObjectRef7 = ref$ObjectRef15;
                access$getActivationData = obj;
                fidesmoActivationData = (FidesmoActivationData) access$getActivationData;
                if (fidesmoActivationData != null) {
                }
                return coroutineSingletons;
            case 7:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 8:
                i3 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.I$0;
                FidesmoActivationData fidesmoActivationData3 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$4;
                DeviceDescription deviceDescription4 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$3;
                Ref$ObjectRef ref$ObjectRef16 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$2;
                Ref$ObjectRef ref$ObjectRef17 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$1;
                try {
                    SafeTrace.throwOnFailure(obj);
                    ref$ObjectRef8 = ref$ObjectRef17;
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12;
                    access$getAvailableService = obj;
                    ref$ObjectRef9 = ref$ObjectRef16;
                    deviceDescription2 = deviceDescription4;
                    fidesmoActivationData2 = fidesmoActivationData3;
                    RealFidesmoClient.ServiceLookupResult serviceLookupResult2 = (RealFidesmoClient.ServiceLookupResult) access$getAvailableService;
                    if (invokeSuspend$isCurrentConnection(realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$connectionId, realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0)) {
                    }
                } catch (Exception e5) {
                    e = e5;
                    Timber.Forest.e("Failed to obtain service descriptions", new Object[0], e);
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0.observabilityManager.logEvent("fidesmo_provisioning_delivery_error", MapsKt__MapsKt.mapOf(new Pair("stage", "service_descriptions"), new Pair(BreadcrumbHelper.Category.ERROR, Reflection.factory.getOrCreateKotlinClass(e.getClass()).getSimpleName())));
                    ProducerScope producerScope622 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$$this$callbackFlow;
                    long j822 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.$connectionId;
                    RealFidesmoClient realFidesmoClient1322 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.this$0;
                    FidesmoDeviceState.Error error522 = new FidesmoDeviceState.Error(FidesmoProvisioningError.ServiceLookupFailed.INSTANCE);
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$0 = null;
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$1 = null;
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$2 = null;
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$3 = null;
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$4 = null;
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.I$0 = i3;
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.label = 9;
                    break;
                }
                break;
            case 9:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 10:
                i4 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.I$1;
                i3 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.I$0;
                ?? r2 = (FidesmoProvisioningError) realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$6;
                SafeTrace.throwOnFailure(obj);
                withSdkContext2 = r2;
                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12;
                first = obj;
                if (!(((RealFidesmoClient.ProvisioningDataWaitResult) first) instanceof RealFidesmoClient.ProvisioningDataWaitResult.ConnectionInvalidated)) {
                    Timber.Forest.w("Backend allowed provisioning after install service was unavailable", new Object[0]);
                    ProducerScope producerScope52 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$$this$callbackFlow;
                    long j72 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$connectionId;
                    RealFidesmoClient realFidesmoClient122 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0;
                    FidesmoDeviceState.Error error42 = new FidesmoDeviceState.Error(withSdkContext2);
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$0 = null;
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$1 = null;
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$2 = null;
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$3 = null;
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$4 = null;
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.L$6 = null;
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.I$0 = i3;
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.I$1 = i4;
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.label = 11;
                    break;
                } else {
                    return Unit.INSTANCE;
                }
            case 11:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 12:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 13:
                i5 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.I$0;
                deliveryService = (RealFidesmoClient.DeliveryService) realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$6;
                fidesmoActivationData2 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$4;
                deviceDescription2 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$3;
                ref$ObjectRef9 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$2;
                ref$ObjectRef8 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12.L$1;
                SafeTrace.throwOnFailure(obj);
                realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$12;
                first2 = obj;
                if (!(((RealFidesmoClient.ProvisioningDataWaitResult) first2) instanceof RealFidesmoClient.ProvisioningDataWaitResult.ConnectionInvalidated)) {
                    realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0.observabilityManager.logEvent("fidesmo_provisioning_delivery_started", MapsKt__MapsJVMKt.mapOf(new Pair("is_provisioned", Boolean.valueOf(fidesmoActivationData2.isProvisioned))));
                    Device device22 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$device;
                    Objects.requireNonNull(device22, "defaultValue is null");
                    BehaviorSubject behaviorSubject2 = new BehaviorSubject(device22);
                    ServiceDeliveryClient serviceDeliveryClient2 = new ServiceDeliveryClient(new ObservableHide(behaviorSubject2, 0), "en");
                    RealFidesmoClient realFidesmoClient82 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0;
                    ServiceDeliveryRequired build2 = ServiceDeliveryRequired.INSTANCE.builder(realFidesmoClient82.appId, deliveryService.serviceId, deviceDescription2.getCin()).setServicePublicKey(deliveryService.servicePublicKey).setClientInfo(realFidesmoClient82.clientInfo).setUseExternalEncryption(true).build();
                    RealFidesmoClient realFidesmoClient92 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.this$0;
                    obj2 = realFidesmoClient92.nfcDiscoveryLock;
                    long j42 = realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.$connectionId;
                    synchronized (obj2) {
                    }
                    break;
                } else {
                    return Unit.INSTANCE;
                }
                break;
            case 14:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
