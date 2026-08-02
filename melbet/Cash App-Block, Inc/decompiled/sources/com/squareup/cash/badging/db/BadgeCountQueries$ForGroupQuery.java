package com.squareup.cash.badging.db;

import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.PopupMessage;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class BadgeCountQueries$ForGroupQuery extends Query {
    public final /* synthetic */ int $r8$classId;
    public final Object group_name;
    public final /* synthetic */ TransacterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeCountQueries$ForGroupQuery(LocalTabContentQueries localTabContentQueries, String str, StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8) {
        super(storageLinkQueries$$ExternalSyntheticLambda8);
        this.$r8$classId = 0;
        str.getClass();
        this.this$0 = localTabContentQueries;
        this.group_name = str;
    }

    @Override // app.cash.sqldelight.Query
    public final void addListener(Query.Listener listener) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.this$0;
        switch (i) {
            case 0:
                ((LocalTabContentQueries) transacterImpl).driver.addListener(new String[]{"badgeCount"}, listener);
                break;
            case 1:
                ((LocalTabContentQueries) transacterImpl).driver.addListener(new String[]{"inlineMessage"}, listener);
                break;
            case 2:
                ((LocalTabContentQueries) transacterImpl).driver.addListener(new String[]{"popupMessage"}, listener);
                break;
            default:
                ((GpsConfigQueries) transacterImpl).driver.addListener(new String[]{"treehouseAppConfigurations"}, listener);
                break;
        }
    }

    @Override // app.cash.sqldelight.ExecutableQuery
    public final QueryResult execute(Function1 function1) {
        int i = this.$r8$classId;
        Object obj = this.group_name;
        TransacterImpl transacterImpl = this.this$0;
        switch (i) {
            case 0:
                return ((LocalTabContentQueries) transacterImpl).driver.executeQuery(-323737940, "SELECT count\nFROM badgeCount\nWHERE group_name = ?", function1, 1, new StorageLinkQueries$$ExternalSyntheticLambda8(this, 2));
            case 1:
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) transacterImpl;
                return localTabContentQueries.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT\n    |  COUNT(*)\n    |FROM\n    |  inlineMessage\n    |WHERE\n    |  isBadged = 1\n    |AND\n    |  placement ", ((InlineMessage.Placement) obj) == null ? "IS" : "=", " ?\n    |AND\n    |  (expiresAtUtc IS NULL OR expiresAtUtc > strftime('%s', 'now'))\n    "), function1, 1, new Recomposer$$ExternalSyntheticLambda4(22, this, localTabContentQueries));
            case 2:
                LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) transacterImpl;
                return localTabContentQueries2.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT\n    |  COUNT(*)\n    |FROM\n    |  popupMessage\n    |WHERE\n    |  isBadged = 1\n    |AND\n    |  placement ", ((PopupMessage.Placement) obj) == null ? "IS" : "=", " ?\n    |AND\n    |  (expiresAtUtc IS NULL OR expiresAtUtc > strftime('%s', 'now'))\n    "), function1, 1, new Recomposer$$ExternalSyntheticLambda4(23, this, localTabContentQueries2));
            default:
                return ((GpsConfigQueries) transacterImpl).driver.executeQuery(1041907193, "SELECT treehouseAppConfigurations.id, treehouseAppConfigurations.endpoint_type, treehouseAppConfigurations.last_qr_code_manifest_url, treehouseAppConfigurations.last_qr_code_scanned_at\nFROM treehouseAppConfigurations\nWHERE id = ?\nLIMIT 1", function1, 1, new AlertBannerKt$$ExternalSyntheticLambda3(this, 3));
        }
    }

    @Override // app.cash.sqldelight.Query
    public final void removeListener(Query.Listener listener) {
        int i = this.$r8$classId;
        TransacterImpl transacterImpl = this.this$0;
        listener.getClass();
        switch (i) {
            case 0:
                ((LocalTabContentQueries) transacterImpl).driver.removeListener(new String[]{"badgeCount"}, listener);
                break;
            case 1:
                ((LocalTabContentQueries) transacterImpl).driver.removeListener(new String[]{"inlineMessage"}, listener);
                break;
            case 2:
                ((LocalTabContentQueries) transacterImpl).driver.removeListener(new String[]{"popupMessage"}, listener);
                break;
            default:
                ((GpsConfigQueries) transacterImpl).driver.removeListener(new String[]{"treehouseAppConfigurations"}, listener);
                break;
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "BadgeCount.sq:forGroup";
            case 1:
                return "InlineMessage.sq:badgedInlineMessagesCount";
            case 2:
                return "PopupMessage.sq:badgedPopupMessagesCount";
            default:
                return "TreehouseAppConfigurations.sq:forId";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BadgeCountQueries$ForGroupQuery(TransacterImpl transacterImpl, Object obj, Function1 function1, int i) {
        super(function1);
        this.$r8$classId = i;
        this.this$0 = transacterImpl;
        this.group_name = obj;
    }
}
