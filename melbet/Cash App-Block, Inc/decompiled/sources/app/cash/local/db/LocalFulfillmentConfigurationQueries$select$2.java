package app.cash.local.db;

import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import java.io.Serializable;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalFulfillmentConfigurationQueries$select$2 extends FunctionReferenceImpl implements Function7 {
    public static final LocalFulfillmentConfigurationQueries$select$2 INSTANCE = new LocalFulfillmentConfigurationQueries$select$2(7, Local_fulfillment_configuration.class, "<init>", "<init>(Ljava/lang/String;Lcom/squareup/protos/cash/local/client/v1/LocalFulfillmentType;Ljava/lang/String;Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment$SchedulingDetails$SchedulingMode;Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment;Lcom/squareup/protos/cash/local/client/v1/LocalFulfillment;Lcom/squareup/protos/cash/local/client/v1/LocalMoney;)V", 0);

    @Override // kotlin.jvm.functions.Function7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        String str = (String) obj;
        LocalFulfillmentType localFulfillmentType = (LocalFulfillmentType) obj2;
        LocalFulfillment.SchedulingDetails.SchedulingMode schedulingMode = (LocalFulfillment.SchedulingDetails.SchedulingMode) obj4;
        str.getClass();
        localFulfillmentType.getClass();
        schedulingMode.getClass();
        return new Local_fulfillment_configuration(str, localFulfillmentType, (String) obj3, schedulingMode, (LocalFulfillment) obj5, (LocalFulfillment) obj6, (LocalMoney) serializable);
    }
}
