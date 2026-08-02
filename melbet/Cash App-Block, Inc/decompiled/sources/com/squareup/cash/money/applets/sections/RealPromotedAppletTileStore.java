package com.squareup.cash.money.applets.sections;

import androidx.room.util.DBUtil;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.applets.db.PromotedAppletTileQueries$selectAll$2;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class RealPromotedAppletTileStore {
    public final CashAccountDatabaseImpl database;
    public final CoroutineContext ioDispatcher;

    public RealPromotedAppletTileStore(CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext) {
        this.database = cashAccountDatabaseImpl;
        this.ioDispatcher = coroutineContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RealContactRepository$contacts$$inlined$map$1 getPromotedAppletTiles() {
        GpsConfigQueries gpsConfigQueries = this.database.promotedAppletTileQueries;
        gpsConfigQueries.getClass();
        PromotedAppletTileQueries$selectAll$2 promotedAppletTileQueries$selectAll$2 = PromotedAppletTileQueries$selectAll$2.INSTANCE;
        SqlDriver sqlDriver = gpsConfigQueries.driver;
        TooltipBoxKt$$ExternalSyntheticLambda2 tooltipBoxKt$$ExternalSyntheticLambda2 = new TooltipBoxKt$$ExternalSyntheticLambda2(gpsConfigQueries, (byte) 0, 0 == true ? 1 : 0);
        sqlDriver.getClass();
        return new RealContactRepository$contacts$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(276612516, new String[]{"promotedAppletTiles"}, sqlDriver, "PromotedAppletTile.sq", "selectAll", "SELECT promotedAppletTiles.appletId, promotedAppletTiles.sortOrder, promotedAppletTiles.title, promotedAppletTiles.subtitle, promotedAppletTiles.image FROM promotedAppletTiles ORDER BY sortOrder ASC", tooltipBoxKt$$ExternalSyntheticLambda2)), this.ioDispatcher), 19);
    }
}
