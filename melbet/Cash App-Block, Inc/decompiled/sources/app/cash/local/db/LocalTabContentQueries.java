package app.cash.local.db;

import androidx.datastore.core.SimpleActor;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.db.Local_tab_content;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import app.cash.sqldelight.driver.android.AndroidStatement;
import coil3.ComponentRegistry;
import coil3.ImageLoader$Builder;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda4;
import com.google.mlkit.common.internal.zze;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda7;
import com.squareup.cash.appmessages.db.PopupMessageQueries$popupMessagesByPriority$2;
import com.squareup.cash.appmessages.db.SheetMessageQueries$sheetMessagesByPriority$2;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.boost.db.RewardQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.db.CardStudioQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.card.onboarding.db.CardStudioQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.card.onboarding.db.CardStudioQueries$select$2;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.common.cashsearch.EntityType;
import com.squareup.cash.db.EnumListAdapter;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.db2.RecipientConfig$Adapter;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda24;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineV2Message;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.GrpcMethod;
import java.time.Instant;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.ConnectionPool;
import okio.AsyncTimeout;

/* loaded from: classes.dex */
public final class LocalTabContentQueries extends TransacterImpl {
    public final /* synthetic */ int $r8$classId;
    public final Object local_tab_contentAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, Local_tab_content.Adapter adapter, byte b) {
        super(androidSqliteDriver);
        this.$r8$classId = 18;
        adapter.getClass();
        this.local_tab_contentAdapter = adapter;
    }

    public QueryResult delete(String str) {
        int i = this.$r8$classId;
        int i2 = 28;
        SqlDriver sqlDriver = this.driver;
        str.getClass();
        switch (i) {
            case 6:
                QueryResult execute = sqlDriver.execute(-223771737, "DELETE FROM cardMessage\nWHERE messageToken = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(str, 18));
                notifyQueries(-223771737, new CardMessageQueries$$ExternalSyntheticLambda1(i2));
                return execute;
            case 7:
            case 8:
            default:
                QueryResult execute2 = sqlDriver.execute(-1184934842, "DELETE FROM tooltipMessage\nWHERE messageToken = ?", new BadgeKt$$ExternalSyntheticLambda3(str, 2));
                notifyQueries(-1184934842, new CardMessageQueries$$ExternalSyntheticLambda7(i2));
                return execute2;
            case 9:
                QueryResult execute3 = sqlDriver.execute(412364158, "DELETE FROM inlineMessage\nWHERE messageToken = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(str, 22));
                notifyQueries(412364158, new CardMessageQueries$$ExternalSyntheticLambda7(8));
                return execute3;
            case 10:
                QueryResult execute4 = sqlDriver.execute(336351194, "DELETE FROM inlineMessageV2\nWHERE messageToken = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(str, 25));
                notifyQueries(336351194, new CardMessageQueries$$ExternalSyntheticLambda7(14));
                return execute4;
        }
    }

    public QueryResult delete$2() {
        QueryResult execute = this.driver.execute(1986737940, "DELETE FROM cardStudio", null);
        notifyQueries(1986737940, new CardStudioQueries$$ExternalSyntheticLambda3(6));
        return execute;
    }

    public void deleteByMessageToken(String str) {
        int i = this.$r8$classId;
        int i2 = 20;
        SqlDriver sqlDriver = this.driver;
        str.getClass();
        switch (i) {
            case 7:
                sqlDriver.execute(-1374605243, "DELETE FROM fullScreenMessage WHERE messageToken = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(str, i2));
                notifyQueries(-1374605243, new CardMessageQueries$$ExternalSyntheticLambda7(2));
                break;
            case 11:
                sqlDriver.execute(341326470, "DELETE FROM popupMessage\nWHERE messageToken = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(str, 28));
                notifyQueries(341326470, new CardMessageQueries$$ExternalSyntheticLambda7(i2));
                break;
            default:
                sqlDriver.execute(1141929843, "DELETE FROM sheetMessage\nWHERE message_token = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(str, 29));
                notifyQueries(1141929843, new CardMessageQueries$$ExternalSyntheticLambda7(24));
                break;
        }
    }

    public QueryResult deleteForToken(String str) {
        str.getClass();
        QueryResult execute = this.driver.execute(-1502374713, "DELETE FROM rewardSelection\nWHERE token = ?", new BadgeKt$$ExternalSyntheticLambda3(str, 18));
        notifyQueries(-1502374713, new RewardQueries$$ExternalSyntheticLambda4(16));
        return execute;
    }

    public void deleteMessage(String str) {
        str.getClass();
        this.driver.execute(-970232347, "DELETE FROM inAppNotificationMessage\nWHERE messageToken = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(str, 21));
        notifyQueries(-970232347, new CardMessageQueries$$ExternalSyntheticLambda7(4));
    }

    public QueryResult deleteTemporaryState() {
        QueryResult execute = this.driver.execute(-642207500, "DELETE FROM cardStudio WHERE _id = 2", null);
        notifyQueries(-642207500, new CardStudioQueries$$ExternalSyntheticLambda3(4));
        return execute;
    }

    public QueryResult insert(final int i, final InlineV2Message.Placement placement, final UiAvatar uiAvatar, final String str, final String str2, final String str3, final String str4, final String str5, final Instant instant, final boolean z) {
        str.getClass();
        QueryResult execute = this.driver.execute(488017128, "INSERT INTO inlineMessageV2(\n  messageToken,\n  campaignToken,\n  isBadged,\n  placement,\n  avatar,\n  title,\n  subtitle,\n  url,\n  expiresAtUtc,\n  priority\n) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new Function1() { // from class: com.squareup.cash.appmessages.db.InlineMessageV2Queries$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AndroidStatement androidStatement = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, str, 1, str2);
                androidStatement.bindBoolean(2, Boolean.valueOf(z));
                InlineV2Message.Placement placement2 = placement;
                LocalTabContentQueries localTabContentQueries = this;
                androidStatement.bindString(3, placement2 != null ? (String) ((EnumColumnAdapter) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).path).encode(placement2) : null);
                UiAvatar uiAvatar2 = uiAvatar;
                androidStatement.bindBytes(4, uiAvatar2 != null ? (byte[]) ((WireAdapter) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).requestAdapter).encode(uiAvatar2) : null);
                androidStatement.bindString(5, str3);
                androidStatement.bindString(6, str4);
                androidStatement.bindString(7, str5);
                Instant instant2 = instant;
                androidStatement.bindLong(8, instant2 != null ? Long.valueOf(((Number) ((AsyncTimeout.Companion) ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).responseAdapter).encode(instant2)).longValue()) : null);
                ((GrpcMethod) localTabContentQueries.local_tab_contentAdapter).getClass();
                androidStatement.bindLong(9, Long.valueOf(i));
                return Unit.INSTANCE;
            }
        });
        notifyQueries(488017128, new CardMessageQueries$$ExternalSyntheticLambda7(12));
        return execute;
    }

    public void insertEntity(String str, String str2, EntityType entityType) {
        str.getClass();
        this.driver.execute(-643396512, "INSERT INTO entity_lookup\nVALUES (last_insert_rowid(), ?, ?, ?)", new BankingConfigQueries$$ExternalSyntheticLambda0(str, str2, this, entityType, 6));
        notifyQueries(-643396512, new SyncRangeQueries$$ExternalSyntheticLambda1(20));
    }

    public QueryResult insertInitialState(boolean z) {
        QueryResult execute = this.driver.execute(-184021777, "INSERT OR IGNORE INTO cardStudio (_id, cashtag_enabled) VALUES (1, ?)", new MoneyTabUIKt$$ExternalSyntheticLambda24(z, 9));
        notifyQueries(-184021777, new CardStudioQueries$$ExternalSyntheticLambda3(5));
        return execute;
    }

    public SimpleQuery popupMessagesByPriority() {
        PopupMessageQueries$popupMessagesByPriority$2 popupMessageQueries$popupMessagesByPriority$2 = PopupMessageQueries$popupMessagesByPriority$2.INSTANCE;
        CashApp$$ExternalSyntheticLambda2 cashApp$$ExternalSyntheticLambda2 = new CashApp$$ExternalSyntheticLambda2(this, (char) 0);
        SqlDriver sqlDriver = this.driver;
        sqlDriver.getClass();
        return new SimpleQuery(-114598335, new String[]{"popupMessage"}, sqlDriver, "PopupMessage.sq", "popupMessagesByPriority", "SELECT popupMessage.messageToken, popupMessage.campaignToken, popupMessage.isBadged, popupMessage.placement, popupMessage.image, popupMessage.title, popupMessage.subtitle, popupMessage.primaryNavigationAction, popupMessage.secondaryNavigationAction, popupMessage.animation, popupMessage.insertedAtUtc, popupMessage.priority, popupMessage.expiresAtUtc\nFROM popupMessage\nWHERE expiresAtUtc IS NULL OR expiresAtUtc > strftime('%s', 'now')\nORDER BY priority DESC", cashApp$$ExternalSyntheticLambda2);
    }

    public Query select$2() {
        CardStudioQueries$select$2 cardStudioQueries$select$2 = CardStudioQueries$select$2.INSTANCE;
        CardStudioQueries$$ExternalSyntheticLambda0 cardStudioQueries$$ExternalSyntheticLambda0 = new CardStudioQueries$$ExternalSyntheticLambda0(this, 1);
        SqlDriver sqlDriver = this.driver;
        sqlDriver.getClass();
        return new SimpleQuery(-1878792603, new String[]{"cardStudio"}, sqlDriver, "CardStudio.sq", "select", "SELECT cardStudio._id, cardStudio.touch_data, cardStudio.card_theme, cardStudio.cashtag_enabled FROM cardStudio WHERE _id = 1", cardStudioQueries$$ExternalSyntheticLambda0);
    }

    public SimpleQuery sheetMessagesByPriority() {
        SheetMessageQueries$sheetMessagesByPriority$2 sheetMessageQueries$sheetMessagesByPriority$2 = SheetMessageQueries$sheetMessagesByPriority$2.INSTANCE;
        CashApp$$ExternalSyntheticLambda2 cashApp$$ExternalSyntheticLambda2 = new CashApp$$ExternalSyntheticLambda2(this, 0);
        SqlDriver sqlDriver = this.driver;
        sqlDriver.getClass();
        return new SimpleQuery(-1928616921, new String[]{"sheetMessage"}, sqlDriver, "SheetMessage.sq", "sheetMessagesByPriority", "SELECT sheetMessage.message_token, sheetMessage.campaign_token, sheetMessage.is_badged, sheetMessage.message_format, sheetMessage.inserted_at_utc, sheetMessage.metadata_id, sheetMessage.priority, sheetMessage.expiresAtUtc FROM sheetMessage\nWHERE expiresAtUtc IS NULL OR expiresAtUtc > strftime('%s', 'now')\nORDER BY priority DESC", cashApp$$ExternalSyntheticLambda2);
    }

    public void updateCashtagState(boolean z) {
        this.driver.execute(1078845596, "UPDATE cardStudio SET cashtag_enabled = ? WHERE _id = 1", new MoneyTabUIKt$$ExternalSyntheticLambda24(z, 8));
        notifyQueries(1078845596, new CardStudioQueries$$ExternalSyntheticLambda3(0));
    }

    public QueryResult updateThemes(CardTheme cardTheme) {
        QueryResult execute = this.driver.execute(-580572004, "UPDATE cardStudio SET card_theme = ? WHERE _id = 1", new BorrowHomeKt$$ExternalSyntheticLambda1(19, cardTheme, this));
        notifyQueries(-580572004, new CardStudioQueries$$ExternalSyntheticLambda3(2));
        return execute;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, Object obj, int i) {
        super(androidSqliteDriver);
        this.$r8$classId = i;
        this.local_tab_contentAdapter = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, BlockersConfig.Adapter adapter) {
        super(androidSqliteDriver);
        this.$r8$classId = 3;
        adapter.getClass();
        this.local_tab_contentAdapter = adapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, EnumListAdapter enumListAdapter) {
        super(androidSqliteDriver);
        this.$r8$classId = 15;
        enumListAdapter.getClass();
        this.local_tab_contentAdapter = enumListAdapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, BlockersConfig.Adapter adapter, int i) {
        super(androidSqliteDriver);
        this.$r8$classId = 19;
        adapter.getClass();
        this.local_tab_contentAdapter = adapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, BlockersConfig.Adapter adapter, short s) {
        super(androidSqliteDriver);
        this.$r8$classId = 20;
        adapter.getClass();
        this.local_tab_contentAdapter = adapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, Local_tab_content.Adapter adapter) {
        super(androidSqliteDriver);
        this.$r8$classId = 4;
        adapter.getClass();
        this.local_tab_contentAdapter = adapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, zze zzeVar) {
        super(androidSqliteDriver);
        this.$r8$classId = 14;
        zzeVar.getClass();
        this.local_tab_contentAdapter = zzeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, BlockersConfig.Adapter adapter, byte b) {
        super(androidSqliteDriver);
        this.$r8$classId = 5;
        adapter.getClass();
        this.local_tab_contentAdapter = adapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, BlockersConfig.Adapter adapter, char c) {
        super(androidSqliteDriver);
        this.$r8$classId = 17;
        adapter.getClass();
        this.local_tab_contentAdapter = adapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, RecipientConfig$Adapter recipientConfig$Adapter) {
        super(androidSqliteDriver);
        this.$r8$classId = 21;
        recipientConfig$Adapter.getClass();
        this.local_tab_contentAdapter = recipientConfig$Adapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, GrpcMethod grpcMethod) {
        super(androidSqliteDriver);
        this.$r8$classId = 2;
        grpcMethod.getClass();
        this.local_tab_contentAdapter = grpcMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, ConnectionPool connectionPool) {
        super(androidSqliteDriver);
        this.$r8$classId = 24;
        connectionPool.getClass();
        this.local_tab_contentAdapter = connectionPool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, GrpcMethod grpcMethod, char c) {
        super(androidSqliteDriver);
        this.$r8$classId = 12;
        grpcMethod.getClass();
        this.local_tab_contentAdapter = grpcMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, GrpcMethod grpcMethod, int i) {
        super(androidSqliteDriver);
        this.$r8$classId = 16;
        grpcMethod.getClass();
        this.local_tab_contentAdapter = grpcMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, SimpleActor simpleActor) {
        super(androidSqliteDriver);
        this.$r8$classId = 13;
        simpleActor.getClass();
        this.local_tab_contentAdapter = simpleActor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, ComponentRegistry.Builder builder, byte b) {
        super(androidSqliteDriver);
        this.$r8$classId = 8;
        builder.getClass();
        this.local_tab_contentAdapter = builder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, GrpcMethod grpcMethod, byte b) {
        super(androidSqliteDriver);
        this.$r8$classId = 10;
        grpcMethod.getClass();
        this.local_tab_contentAdapter = grpcMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, ComponentRegistry.Builder builder) {
        super(androidSqliteDriver);
        this.$r8$classId = 6;
        builder.getClass();
        this.local_tab_contentAdapter = builder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, ImageLoader$Builder imageLoader$Builder) {
        super(androidSqliteDriver);
        this.$r8$classId = 7;
        imageLoader$Builder.getClass();
        this.local_tab_contentAdapter = imageLoader$Builder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, Reward$Adapter reward$Adapter, byte b) {
        super(androidSqliteDriver);
        this.$r8$classId = 11;
        reward$Adapter.getClass();
        this.local_tab_contentAdapter = reward$Adapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTabContentQueries(AndroidSqliteDriver androidSqliteDriver, Reward$Adapter reward$Adapter) {
        super(androidSqliteDriver);
        this.$r8$classId = 9;
        reward$Adapter.getClass();
        this.local_tab_contentAdapter = reward$Adapter;
    }
}
