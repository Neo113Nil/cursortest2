package app.cash.local.store.real;

import app.cash.local.db.LocalFulfillmentConfigurationQueries;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.FulfillmentConfigurations;
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
public final class RealLocalInstalledStore$updateFulfillmentConfigurations$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $brandToken;
    public final /* synthetic */ FulfillmentConfigurations $fulfillmentConfigurations;
    public final /* synthetic */ RealLocalInstalledStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealLocalInstalledStore$updateFulfillmentConfigurations$2(RealLocalInstalledStore realLocalInstalledStore, String str, FulfillmentConfigurations fulfillmentConfigurations, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realLocalInstalledStore;
        this.$brandToken = str;
        this.$fulfillmentConfigurations = fulfillmentConfigurations;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealLocalInstalledStore$updateFulfillmentConfigurations$2(this.this$0, this.$brandToken, this.$fulfillmentConfigurations, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealLocalInstalledStore$updateFulfillmentConfigurations$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [app.cash.local.primitives.FulfillmentConfiguration] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LocalFulfillment localFulfillment;
        LocalMoney localMoney;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        LocalFulfillmentConfigurationQueries localFulfillmentConfigurationQueries = this.this$0.fulfillmentConfigurationQueries;
        FulfillmentConfigurations fulfillmentConfigurations = this.$fulfillmentConfigurations;
        FulfillmentConfiguration fulfillmentConfiguration = fulfillmentConfigurations.asap;
        LocalFulfillmentType type2 = FulfillmentConfigurationKt.getType(fulfillmentConfiguration);
        String mo1238getLocationTokenVSCKlZI = fulfillmentConfiguration.mo1238getLocationTokenVSCKlZI();
        if (mo1238getLocationTokenVSCKlZI == null) {
            mo1238getLocationTokenVSCKlZI = null;
            localFulfillment = null;
        } else {
            localFulfillment = null;
        }
        LocalFulfillment.SchedulingDetails.SchedulingMode schedulingMode = fulfillmentConfigurations.currentSchedulingMode;
        LocalFulfillment localFulfillment2 = localFulfillment;
        LocalFulfillment protoFulfillment = FulfillmentConfigurationKt.toProtoFulfillment(fulfillmentConfiguration);
        FulfillmentConfiguration fulfillmentConfiguration2 = fulfillmentConfigurations.scheduled;
        boolean z = fulfillmentConfiguration2 instanceof FulfillmentConfiguration.Unspecified;
        ?? r9 = fulfillmentConfiguration2;
        if (z) {
            r9 = localFulfillment2;
        }
        LocalFulfillment protoFulfillment2 = r9 != 0 ? FulfillmentConfigurationKt.toProtoFulfillment(r9) : localFulfillment2;
        FulfillmentConfiguration.Delivery asDelivery = FulfillmentConfigurationKt.getAsDelivery(fulfillmentConfiguration);
        return localFulfillmentConfigurationQueries.insertOrReplace(this.$brandToken, type2, mo1238getLocationTokenVSCKlZI, schedulingMode, protoFulfillment, protoFulfillment2, (asDelivery == null || (localMoney = asDelivery.deliveryFee) == null) ? localFulfillment2 : LocalMoneyKt.toLocalMoneyProto(localMoney));
    }
}
