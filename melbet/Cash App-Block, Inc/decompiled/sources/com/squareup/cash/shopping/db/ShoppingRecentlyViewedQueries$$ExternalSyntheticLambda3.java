package com.squareup.cash.shopping.db;

import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.investing.db.categories.Category$Adapter;
import com.squareup.cash.sheet.RealSheetState$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.cash.ui.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShoppingRecentlyViewedQueries$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ GpsConfigQueries f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ ImageType f$10;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;
    public final /* synthetic */ Color f$5;
    public final /* synthetic */ String f$6;
    public final /* synthetic */ long f$7;
    public final /* synthetic */ String f$8;
    public final /* synthetic */ Metadata.EntityType f$9;

    public /* synthetic */ ShoppingRecentlyViewedQueries$$ExternalSyntheticLambda3(GpsConfigQueries gpsConfigQueries, String str, String str2, String str3, String str4, Color color, String str5, long j, String str6, Metadata.EntityType entityType, ImageType imageType) {
        this.f$0 = gpsConfigQueries;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = str3;
        this.f$4 = str4;
        this.f$5 = color;
        this.f$6 = str5;
        this.f$7 = j;
        this.f$8 = str6;
        this.f$9 = entityType;
        this.f$10 = imageType;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((TransactionWrapper) obj).getClass();
                GpsConfigQueries gpsConfigQueries = this.f$0;
                gpsConfigQueries.driver.execute(-1742727680, "INSERT OR REPLACE INTO shoppingRecentlyViewed(token, title, light_image_url, dark_image_url, accent_color, action_url, updated_at, subtitle, type, imageType)\n  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new ShoppingRecentlyViewedQueries$$ExternalSyntheticLambda3(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, gpsConfigQueries, this.f$9, this.f$10));
                return gpsConfigQueries.driver.execute(-1742727679, "DELETE FROM shoppingRecentlyViewed\n  WHERE rowid IN (\n    SELECT rowid\n    FROM shoppingRecentlyViewed\n    ORDER BY updated_at DESC\n    LIMIT -1 OFFSET ?\n  )", new RealSheetState$$ExternalSyntheticLambda0(20));
            default:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, this.f$1, 1, this.f$2);
                androidStatement.bindString(2, this.f$3);
                androidStatement.bindString(3, this.f$4);
                Color color = this.f$5;
                GpsConfigQueries gpsConfigQueries2 = this.f$0;
                androidStatement.bindBytes(4, color != null ? (byte[]) ((Category$Adapter) gpsConfigQueries2.gpsConfigAdapter).category_colorAdapter.encode(color) : null);
                androidStatement.bindString(5, this.f$6);
                androidStatement.bindLong(6, Long.valueOf(this.f$7));
                androidStatement.bindString(7, this.f$8);
                androidStatement.bindString(8, (String) ((Category$Adapter) gpsConfigQueries2.gpsConfigAdapter).prefix_iconAdapter.encode(this.f$9));
                androidStatement.bindString(9, (String) ((Category$Adapter) gpsConfigQueries2.gpsConfigAdapter).typeAdapter.encode(this.f$10));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ShoppingRecentlyViewedQueries$$ExternalSyntheticLambda3(String str, String str2, String str3, String str4, Color color, String str5, long j, String str6, GpsConfigQueries gpsConfigQueries, Metadata.EntityType entityType, ImageType imageType) {
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = str3;
        this.f$4 = str4;
        this.f$5 = color;
        this.f$6 = str5;
        this.f$7 = j;
        this.f$8 = str6;
        this.f$0 = gpsConfigQueries;
        this.f$9 = entityType;
        this.f$10 = imageType;
    }
}
