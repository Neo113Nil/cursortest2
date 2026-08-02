package app.cash.local.store.real;

import app.cash.local.db.LocalFulfillmentConfigurationQueries;
import app.cash.local.db.Local_fulfillment_configuration;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.LocalMoneyKt;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class RealLocalInstalledStore$updateFulfillmentConfiguration$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $brandToken;
    public final /* synthetic */ FulfillmentConfiguration $fulfillmentConfiguration;
    public final /* synthetic */ RealLocalInstalledStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealLocalInstalledStore$updateFulfillmentConfiguration$2(RealLocalInstalledStore realLocalInstalledStore, String str, FulfillmentConfiguration fulfillmentConfiguration, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realLocalInstalledStore;
        this.$brandToken = str;
        this.$fulfillmentConfiguration = fulfillmentConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealLocalInstalledStore$updateFulfillmentConfiguration$2(this.this$0, this.$brandToken, this.$fulfillmentConfiguration, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealLocalInstalledStore$updateFulfillmentConfiguration$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        LocalFulfillment localFulfillment;
        LocalFulfillment localFulfillment2;
        LocalFulfillment localFulfillment3;
        FulfillmentConfiguration.Delivery asDelivery;
        LocalMoney localMoney;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        RealLocalInstalledStore realLocalInstalledStore = this.this$0;
        Local_fulfillment_configuration local_fulfillment_configuration = (Local_fulfillment_configuration) realLocalInstalledStore.fulfillmentConfigurationQueries.select(this.$brandToken).executeAsOneOrNull();
        FulfillmentConfiguration fulfillmentConfiguration = this.$fulfillmentConfiguration;
        LocalFulfillment protoFulfillment = FulfillmentConfigurationKt.toProtoFulfillment(fulfillmentConfiguration);
        LocalFulfillment.SchedulingDetails.SchedulingMode schedulingMode = FulfillmentConfigurationKt.getSchedulingMode(fulfillmentConfiguration);
        LocalFulfillmentConfigurationQueries localFulfillmentConfigurationQueries = realLocalInstalledStore.fulfillmentConfigurationQueries;
        LocalFulfillmentType type2 = FulfillmentConfigurationKt.getType(fulfillmentConfiguration);
        String mo1238getLocationTokenVSCKlZI = fulfillmentConfiguration.mo1238getLocationTokenVSCKlZI();
        com.squareup.protos.cash.local.client.v1.LocalMoney localMoney2 = null;
        if (mo1238getLocationTokenVSCKlZI == null) {
            if (local_fulfillment_configuration == null) {
                str = null;
                localFulfillment = schedulingMode != LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_ASAP ? protoFulfillment : null;
                if (localFulfillment == null) {
                    if (local_fulfillment_configuration == null) {
                        localFulfillment2 = null;
                        if (schedulingMode != LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_SCHEDULED) {
                            protoFulfillment = null;
                        }
                        if (protoFulfillment == null) {
                            if (local_fulfillment_configuration == null) {
                                localFulfillment3 = null;
                                asDelivery = FulfillmentConfigurationKt.getAsDelivery(fulfillmentConfiguration);
                                if (asDelivery == null && (localMoney = asDelivery.deliveryFee) != null) {
                                    localMoney2 = LocalMoneyKt.toLocalMoneyProto(localMoney);
                                } else if (local_fulfillment_configuration != null) {
                                    localMoney2 = local_fulfillment_configuration.delivery_fee;
                                }
                                return localFulfillmentConfigurationQueries.insertOrReplace(this.$brandToken, type2, str, schedulingMode, localFulfillment2, localFulfillment3, localMoney2);
                            }
                            protoFulfillment = local_fulfillment_configuration.scheduled_fulfillment;
                        }
                        localFulfillment3 = protoFulfillment;
                        asDelivery = FulfillmentConfigurationKt.getAsDelivery(fulfillmentConfiguration);
                        if (asDelivery == null) {
                        }
                        if (local_fulfillment_configuration != null) {
                        }
                        return localFulfillmentConfigurationQueries.insertOrReplace(this.$brandToken, type2, str, schedulingMode, localFulfillment2, localFulfillment3, localMoney2);
                    }
                    localFulfillment = local_fulfillment_configuration.asap_fulfillment;
                }
                localFulfillment2 = localFulfillment;
                if (schedulingMode != LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_SCHEDULED) {
                }
                if (protoFulfillment == null) {
                }
                localFulfillment3 = protoFulfillment;
                asDelivery = FulfillmentConfigurationKt.getAsDelivery(fulfillmentConfiguration);
                if (asDelivery == null) {
                }
                if (local_fulfillment_configuration != null) {
                }
                return localFulfillmentConfigurationQueries.insertOrReplace(this.$brandToken, type2, str, schedulingMode, localFulfillment2, localFulfillment3, localMoney2);
            }
            mo1238getLocationTokenVSCKlZI = local_fulfillment_configuration.location_token;
        }
        str = mo1238getLocationTokenVSCKlZI;
        if (schedulingMode != LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_ASAP) {
        }
        if (localFulfillment == null) {
        }
        localFulfillment2 = localFulfillment;
        if (schedulingMode != LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_SCHEDULED) {
        }
        if (protoFulfillment == null) {
        }
        localFulfillment3 = protoFulfillment;
        asDelivery = FulfillmentConfigurationKt.getAsDelivery(fulfillmentConfiguration);
        if (asDelivery == null) {
        }
        if (local_fulfillment_configuration != null) {
        }
        return localFulfillmentConfigurationQueries.insertOrReplace(this.$brandToken, type2, str, schedulingMode, localFulfillment2, localFulfillment3, localMoney2);
    }
}
