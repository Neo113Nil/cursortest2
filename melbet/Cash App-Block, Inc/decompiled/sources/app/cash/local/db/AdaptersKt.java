package app.cash.local.db;

import app.cash.local.db.Local_fulfillment_configuration;
import app.cash.sqldelight.EnumColumnAdapter;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.protos.cash.local.client.app.v1.MarketTilesScreen;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalCashActivity;
import com.squareup.protos.cash.local.client.v1.LocalCashInformationalContent;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import com.squareup.wire.GrpcMethod;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes.dex */
public abstract class AdaptersKt {
    public static final Local_fulfillment_configuration.Adapter localFulfillmentConfigurationAdapter;
    public static final BlockersConfig.Adapter localMarketScreen = new BlockersConfig.Adapter(new WireAdapter(MarketTilesScreen.ADAPTER));
    public static final GrpcMethod localCashDetailContentAdapter = new GrpcMethod(new WireAdapter(LocalCashInformationalContent.ADAPTER), new WireAdapter(LocalCashActivity.ADAPTER), new WireAdapter(GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.ADAPTER));

    static {
        EnumColumnAdapter enumColumnAdapter = new EnumColumnAdapter(LocalFulfillmentType.values());
        EnumColumnAdapter enumColumnAdapter2 = new EnumColumnAdapter(LocalFulfillment.SchedulingDetails.SchedulingMode.values());
        ProtoAdapter protoAdapter = LocalFulfillment.ADAPTER;
        localFulfillmentConfigurationAdapter = new Local_fulfillment_configuration.Adapter(enumColumnAdapter, enumColumnAdapter2, new WireAdapter(protoAdapter), new WireAdapter(protoAdapter), new WireAdapter(LocalMoney.ADAPTER));
    }
}
