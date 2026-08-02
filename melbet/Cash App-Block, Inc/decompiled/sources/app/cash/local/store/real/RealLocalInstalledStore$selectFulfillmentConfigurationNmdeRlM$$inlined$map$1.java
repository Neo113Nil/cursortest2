package app.cash.local.store.real;

import app.cash.local.db.Local_fulfillment_configuration;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurations;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* renamed from: app.cash.local.store.real.RealLocalInstalledStore$selectFulfillmentConfiguration-NmdeRlM$$inlined$map$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class RealLocalInstalledStore$selectFulfillmentConfigurationNmdeRlM$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowQuery$mapToList$$inlined$map$1 $this_unsafeTransform$inlined;
    public final /* synthetic */ RealLocalInstalledStore this$0;

    /* renamed from: app.cash.local.store.real.RealLocalInstalledStore$selectFulfillmentConfiguration-NmdeRlM$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;
        public final /* synthetic */ RealLocalInstalledStore this$0;

        /* renamed from: app.cash.local.store.real.RealLocalInstalledStore$selectFulfillmentConfiguration-NmdeRlM$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= PKIFailureInfo.systemUnavail;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, RealLocalInstalledStore realLocalInstalledStore, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
            this.this$0 = realLocalInstalledStore;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            LocalFulfillment localFulfillment;
            RealLocalInstalledStore$selectFulfillmentConfigurationsyV01Fno$$inlined$map$1$2$1 realLocalInstalledStore$selectFulfillmentConfigurationsyV01Fno$$inlined$map$1$2$1;
            int i2;
            Object fulfillmentConfigurations;
            int i3 = this.$r8$classId;
            FulfillmentConfiguration fulfillmentConfiguration = FulfillmentConfiguration.Unspecified.INSTANCE;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            RealLocalInstalledStore realLocalInstalledStore = this.this$0;
            Object[] objArr = 0;
            switch (i3) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i4 = anonymousClass1.label;
                        if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i4 - PKIFailureInfo.systemUnavail;
                            Object obj2 = anonymousClass1.result;
                            Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj2);
                                Local_fulfillment_configuration local_fulfillment_configuration = (Local_fulfillment_configuration) obj;
                                if (local_fulfillment_configuration != null) {
                                    LocalFulfillment.SchedulingDetails.SchedulingMode schedulingMode = local_fulfillment_configuration.current_scheduling_mode;
                                    int i5 = RealLocalInstalledStore.WhenMappings.$EnumSwitchMapping$0[schedulingMode.ordinal()];
                                    if (i5 != 1 && i5 != 2) {
                                        if (i5 != 3) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            break;
                                        } else {
                                            localFulfillment = local_fulfillment_configuration.scheduled_fulfillment;
                                        }
                                    } else {
                                        localFulfillment = local_fulfillment_configuration.asap_fulfillment;
                                    }
                                    if (schedulingMode != LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_SCHEDULED || !RealLocalInstalledStore.access$isExpired(realLocalInstalledStore, localFulfillment)) {
                                        fulfillmentConfiguration = RealLocalInstalledStore.access$toFulfillmentConfiguration(realLocalInstalledStore, localFulfillment, local_fulfillment_configuration.location_token, local_fulfillment_configuration.f910type, local_fulfillment_configuration.delivery_fee);
                                    }
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(fulfillmentConfiguration, anonymousClass1) == obj3) {
                                    break;
                                }
                            } else if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj2);
                            }
                            break;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    break;
                default:
                    if (continuation instanceof RealLocalInstalledStore$selectFulfillmentConfigurationsyV01Fno$$inlined$map$1$2$1) {
                        realLocalInstalledStore$selectFulfillmentConfigurationsyV01Fno$$inlined$map$1$2$1 = (RealLocalInstalledStore$selectFulfillmentConfigurationsyV01Fno$$inlined$map$1$2$1) continuation;
                        int i6 = realLocalInstalledStore$selectFulfillmentConfigurationsyV01Fno$$inlined$map$1$2$1.label;
                        if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                            realLocalInstalledStore$selectFulfillmentConfigurationsyV01Fno$$inlined$map$1$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                            Object obj4 = realLocalInstalledStore$selectFulfillmentConfigurationsyV01Fno$$inlined$map$1$2$1.result;
                            Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = realLocalInstalledStore$selectFulfillmentConfigurationsyV01Fno$$inlined$map$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj4);
                                Local_fulfillment_configuration local_fulfillment_configuration2 = (Local_fulfillment_configuration) obj;
                                if (local_fulfillment_configuration2 == null) {
                                    fulfillmentConfigurations = new FulfillmentConfigurations(objArr == true ? 1 : 0, 7);
                                } else {
                                    LocalMoney localMoney = local_fulfillment_configuration2.delivery_fee;
                                    LocalFulfillmentType localFulfillmentType = local_fulfillment_configuration2.f910type;
                                    String str = local_fulfillment_configuration2.location_token;
                                    LocalFulfillment localFulfillment2 = local_fulfillment_configuration2.scheduled_fulfillment;
                                    if (localFulfillment2 != null) {
                                        if (RealLocalInstalledStore.access$isExpired(realLocalInstalledStore, localFulfillment2)) {
                                            localFulfillment2 = null;
                                        }
                                        if (localFulfillment2 != null) {
                                            fulfillmentConfiguration = RealLocalInstalledStore.access$toFulfillmentConfiguration(realLocalInstalledStore, localFulfillment2, str, localFulfillmentType, localMoney);
                                        }
                                    }
                                    LocalFulfillment.SchedulingDetails.SchedulingMode schedulingMode2 = local_fulfillment_configuration2.current_scheduling_mode;
                                    LocalFulfillment.SchedulingDetails.SchedulingMode schedulingMode3 = (schedulingMode2 == LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_SCHEDULED && (fulfillmentConfiguration instanceof FulfillmentConfiguration.Unspecified)) ? null : schedulingMode2;
                                    if (schedulingMode3 == null) {
                                        schedulingMode3 = LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_ASAP;
                                    }
                                    fulfillmentConfigurations = new FulfillmentConfigurations(schedulingMode3, RealLocalInstalledStore.access$toFulfillmentConfiguration(realLocalInstalledStore, local_fulfillment_configuration2.asap_fulfillment, str, localFulfillmentType, localMoney), fulfillmentConfiguration);
                                }
                                realLocalInstalledStore$selectFulfillmentConfigurationsyV01Fno$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(fulfillmentConfigurations, realLocalInstalledStore$selectFulfillmentConfigurationsyV01Fno$$inlined$map$1$2$1) == obj5) {
                                    break;
                                }
                            } else if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj4);
                            }
                            break;
                        }
                    }
                    realLocalInstalledStore$selectFulfillmentConfigurationsyV01Fno$$inlined$map$1$2$1 = new RealLocalInstalledStore$selectFulfillmentConfigurationsyV01Fno$$inlined$map$1$2$1(this, continuation);
                    Object obj42 = realLocalInstalledStore$selectFulfillmentConfigurationsyV01Fno$$inlined$map$1$2$1.result;
                    Object obj52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = realLocalInstalledStore$selectFulfillmentConfigurationsyV01Fno$$inlined$map$1$2$1.label;
                    if (i2 != 0) {
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ RealLocalInstalledStore$selectFulfillmentConfigurationNmdeRlM$$inlined$map$1(FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1, RealLocalInstalledStore realLocalInstalledStore, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flowQuery$mapToList$$inlined$map$1;
        this.this$0 = realLocalInstalledStore;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        RealLocalInstalledStore realLocalInstalledStore = this.this$0;
        FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector, realLocalInstalledStore, 0), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector, realLocalInstalledStore, 1), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
