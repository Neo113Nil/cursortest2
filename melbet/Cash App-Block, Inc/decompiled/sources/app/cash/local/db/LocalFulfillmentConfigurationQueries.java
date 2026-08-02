package app.cash.local.db;

import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import androidx.work.Data$$ExternalSyntheticLambda0;
import app.cash.local.db.Local_fulfillment_configuration;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.maps.presenter.CashMapPresenter$$ExternalSyntheticLambda4;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalMoney;

/* loaded from: classes.dex */
public final class LocalFulfillmentConfigurationQueries extends TransacterImpl {
    public final Local_fulfillment_configuration.Adapter local_fulfillment_configurationAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalFulfillmentConfigurationQueries(AndroidSqliteDriver androidSqliteDriver, Local_fulfillment_configuration.Adapter adapter) {
        super(androidSqliteDriver);
        adapter.getClass();
        this.local_fulfillment_configurationAdapter = adapter;
    }

    public final QueryResult insertOrReplace(String str, LocalFulfillmentType localFulfillmentType, String str2, LocalFulfillment.SchedulingDetails.SchedulingMode schedulingMode, LocalFulfillment localFulfillment, LocalFulfillment localFulfillment2, LocalMoney localMoney) {
        str.getClass();
        localFulfillmentType.getClass();
        schedulingMode.getClass();
        QueryResult execute = this.driver.execute(282994674, "INSERT OR REPLACE INTO local_fulfillment_configuration (brand_token, type, location_token, current_scheduling_mode, asap_fulfillment, scheduled_fulfillment, delivery_fee)\nVALUES (?, ?, ?, ?, ?, ?, ?)", new CashMapPresenter$$ExternalSyntheticLambda4(str, this, localFulfillmentType, str2, schedulingMode, localFulfillment, localFulfillment2, localMoney, 1));
        notifyQueries(282994674, new Data$$ExternalSyntheticLambda0(13));
        return execute;
    }

    public final Query select(String str) {
        str.getClass();
        LocalFulfillmentConfigurationQueries$select$2 localFulfillmentConfigurationQueries$select$2 = LocalFulfillmentConfigurationQueries$select$2.INSTANCE;
        return new RewardQueries.ForIdsQuery(this, str, new CachedPageEventFlow$$ExternalSyntheticLambda0(this));
    }
}
