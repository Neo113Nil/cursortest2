package app.cash.local.store.real;

import androidx.compose.material.IconKt$$ExternalSyntheticLambda0;
import androidx.work.Data$$ExternalSyntheticLambda0;
import app.cash.local.db.LocalFulfillmentConfigurationQueries;
import app.cash.sqldelight.db.QueryResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class RealLocalInstalledStore$clearFulfillmentConfiguration$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $brandToken;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealLocalInstalledStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealLocalInstalledStore$clearFulfillmentConfiguration$2(RealLocalInstalledStore realLocalInstalledStore, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realLocalInstalledStore;
        this.$brandToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.$brandToken;
        RealLocalInstalledStore realLocalInstalledStore = this.this$0;
        switch (i) {
            case 0:
                return new RealLocalInstalledStore$clearFulfillmentConfiguration$2(realLocalInstalledStore, str, continuation, 0);
            default:
                return new RealLocalInstalledStore$clearFulfillmentConfiguration$2(realLocalInstalledStore, str, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealLocalInstalledStore$clearFulfillmentConfiguration$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$brandToken;
        RealLocalInstalledStore realLocalInstalledStore = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalFulfillmentConfigurationQueries localFulfillmentConfigurationQueries = realLocalInstalledStore.fulfillmentConfigurationQueries;
                localFulfillmentConfigurationQueries.getClass();
                str.getClass();
                QueryResult execute = localFulfillmentConfigurationQueries.driver.execute(914967807, "DELETE FROM local_fulfillment_configuration\nWHERE brand_token = ?", new IconKt$$ExternalSyntheticLambda0(str, 20));
                localFulfillmentConfigurationQueries.notifyQueries(914967807, new Data$$ExternalSyntheticLambda0(15));
                return execute;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalFulfillmentConfigurationQueries localFulfillmentConfigurationQueries2 = realLocalInstalledStore.fulfillmentConfigurationQueries;
                localFulfillmentConfigurationQueries2.getClass();
                str.getClass();
                QueryResult execute2 = localFulfillmentConfigurationQueries2.driver.execute(-1778567240, "UPDATE local_fulfillment_configuration\nSET scheduled_fulfillment = NULL,\n    current_scheduling_mode = \"SCHEDULING_MODE_ASAP\"\nWHERE brand_token = ?", new IconKt$$ExternalSyntheticLambda0(str, 19));
                localFulfillmentConfigurationQueries2.notifyQueries(-1778567240, new Data$$ExternalSyntheticLambda0(14));
                return execute2;
        }
    }
}
