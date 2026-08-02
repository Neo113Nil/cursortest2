package com.squareup.cash.boost.db;

import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import app.cash.local.db.LocalFulfillmentConfigurationQueries;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.appmessages.db.FullScreenMessageQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.appmessages.db.InlineMessageV2Queries$$ExternalSyntheticLambda0;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda0;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.db2.ExpressivePaymentsBackgroundConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.ExpressivePaymentsStickerConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.InstrumentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.StampsConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.activity.CashActivityQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.db2.contacts.CustomerQueries$$ExternalSyntheticLambda7;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.payment.PendingPaymentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.payment.PendingTransferQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.profile.CustomerLimitsQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.mosaic.resources.api.v2.ReleaseState;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import com.squareup.protos.franklin.common.LimitedAction;
import com.squareup.protos.franklin.ui.BlockState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class RewardQueries extends TransacterImpl {
    public final Reward$Adapter rewardAdapter;
    public final BlockersConfig.Adapter rewardSelectionAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardQueries(AndroidSqliteDriver androidSqliteDriver, Reward$Adapter reward$Adapter, BlockersConfig.Adapter adapter, int i) {
        super(androidSqliteDriver);
        reward$Adapter.getClass();
        adapter.getClass();
        switch (i) {
            case 1:
                super(androidSqliteDriver);
                this.rewardAdapter = reward$Adapter;
                this.rewardSelectionAdapter = adapter;
                break;
            default:
                this.rewardAdapter = reward$Adapter;
                this.rewardSelectionAdapter = adapter;
                break;
        }
    }

    public SimpleQuery rewards() {
        SelectableRewardQueries$rewards$2 selectableRewardQueries$rewards$2 = SelectableRewardQueries$rewards$2.INSTANCE;
        SelectableRewardQueries$$ExternalSyntheticLambda3 selectableRewardQueries$$ExternalSyntheticLambda3 = new SelectableRewardQueries$$ExternalSyntheticLambda3(this, 1);
        SqlDriver sqlDriver = this.driver;
        sqlDriver.getClass();
        return new SimpleQuery(-1646917518, new String[]{"reward", "rewardSelection", "selectableReward"}, sqlDriver, "SelectableReward.sq", "rewards", "SELECT rewardWithSelection.token, rewardWithSelection.category, rewardWithSelection.avatars, rewardWithSelection.title, rewardWithSelection.main_text, rewardWithSelection.program_detail_rows, rewardWithSelection.footer_text, rewardWithSelection.boost_detail_rows, rewardWithSelection.boost_attributes, rewardWithSelection.full_title_text, rewardWithSelection.expiration_date_time_ms, rewardWithSelection.activation_date_time_ms, rewardWithSelection.discount_text, rewardWithSelection.reward_selection_state, rewardWithSelection.draggable, rewardWithSelection.affiliate_link_url, rewardWithSelection.user_agent, rewardWithSelection.offerly_token, rewardWithSelection.is_custom_offer, rewardWithSelection.boost_detail_bottom_upsell, rewardWithSelection.redeemable_with_cash_app_pay, rewardWithSelection.redeemable_with_cash_card, rewardWithSelection.app_links, rewardWithSelection.reward_selection\nFROM selectableReward\nINNER JOIN rewardWithSelection ON selectableReward.reward_token = rewardWithSelection.token", selectableRewardQueries$$ExternalSyntheticLambda3);
    }

    /* loaded from: classes5.dex */
    public final class ForIdQuery extends Query {
        public final /* synthetic */ int $r8$classId = 0;
        public final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForIdQuery(RewardQueries rewardQueries, String str, RewardQueries$$ExternalSyntheticLambda1 rewardQueries$$ExternalSyntheticLambda1) {
            super(rewardQueries$$ExternalSyntheticLambda1);
            str.getClass();
            RewardQueries.this = rewardQueries;
            this.token = str;
        }

        @Override // app.cash.sqldelight.Query
        public final void addListener(Query.Listener listener) {
            int i = this.$r8$classId;
            RewardQueries rewardQueries = RewardQueries.this;
            switch (i) {
                case 0:
                    rewardQueries.driver.addListener(new String[]{"reward", "rewardSelection"}, listener);
                    break;
                default:
                    rewardQueries.driver.addListener(new String[]{"reward", "rewardSelection"}, listener);
                    break;
            }
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult execute(Function1 function1) {
            int i = this.$r8$classId;
            RewardQueries rewardQueries = RewardQueries.this;
            switch (i) {
                case 0:
                    return rewardQueries.driver.executeQuery(764824840, "SELECT rewardWithSelection.token, rewardWithSelection.category, rewardWithSelection.avatars, rewardWithSelection.title, rewardWithSelection.main_text, rewardWithSelection.program_detail_rows, rewardWithSelection.footer_text, rewardWithSelection.boost_detail_rows, rewardWithSelection.boost_attributes, rewardWithSelection.full_title_text, rewardWithSelection.expiration_date_time_ms, rewardWithSelection.activation_date_time_ms, rewardWithSelection.discount_text, rewardWithSelection.reward_selection_state, rewardWithSelection.draggable, rewardWithSelection.affiliate_link_url, rewardWithSelection.user_agent, rewardWithSelection.offerly_token, rewardWithSelection.is_custom_offer, rewardWithSelection.boost_detail_bottom_upsell, rewardWithSelection.redeemable_with_cash_app_pay, rewardWithSelection.redeemable_with_cash_card, rewardWithSelection.app_links, rewardWithSelection.reward_selection\nFROM rewardWithSelection\nWHERE token = ?", function1, 1, new RewardSlotQueries$$ExternalSyntheticLambda0(this, 9));
                default:
                    return rewardQueries.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT token\n    |FROM rewardWithSelection\n    |WHERE offerly_token ", this.token == null ? "IS" : "=", " ?\n    "), function1, 1, new RewardSlotQueries$$ExternalSyntheticLambda0(this, 11));
            }
        }

        @Override // app.cash.sqldelight.Query
        public final void removeListener(Query.Listener listener) {
            int i = this.$r8$classId;
            RewardQueries rewardQueries = RewardQueries.this;
            listener.getClass();
            switch (i) {
                case 0:
                    rewardQueries.driver.removeListener(new String[]{"reward", "rewardSelection"}, listener);
                    break;
                default:
                    rewardQueries.driver.removeListener(new String[]{"reward", "rewardSelection"}, listener);
                    break;
            }
        }

        public final String toString() {
            switch (this.$r8$classId) {
                case 0:
                    return "Reward.sq:forId";
                default:
                    return "Reward.sq:forOfferlyToken";
            }
        }

        public ForIdQuery(String str, RewardQueries$$ExternalSyntheticLambda4 rewardQueries$$ExternalSyntheticLambda4) {
            super(rewardQueries$$ExternalSyntheticLambda4);
            this.token = str;
        }
    }

    /* loaded from: classes5.dex */
    public final class ForIdsQuery extends Query {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ TransacterImpl this$0;
        public final Object token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForIdsQuery(LocalTabContentQueries localTabContentQueries, String str, BadgeQueries$$ExternalSyntheticLambda5 badgeQueries$$ExternalSyntheticLambda5) {
            super(badgeQueries$$ExternalSyntheticLambda5);
            this.$r8$classId = 8;
            str.getClass();
            this.this$0 = localTabContentQueries;
            this.token = str;
        }

        @Override // app.cash.sqldelight.Query
        public final void addListener(Query.Listener listener) {
            int i = this.$r8$classId;
            TransacterImpl transacterImpl = this.this$0;
            switch (i) {
                case 0:
                    ((RewardQueries) transacterImpl).driver.addListener(new String[]{"reward", "rewardSelection"}, listener);
                    break;
                case 1:
                    ((LocalFulfillmentConfigurationQueries) transacterImpl).driver.addListener(new String[]{"local_fulfillment_configuration"}, listener);
                    break;
                case 2:
                    ((LocalTabContentQueries) transacterImpl).driver.addListener(new String[]{"afterpayAppletMerchantSheet"}, listener);
                    break;
                case 3:
                    ((LocalTabContentQueries) transacterImpl).driver.addListener(new String[]{"fullScreenMessage"}, listener);
                    break;
                case 4:
                    ((LocalTabContentQueries) transacterImpl).driver.addListener(new String[]{"inlineMessageV2"}, listener);
                    break;
                case 5:
                    ((LocalTabContentQueries) transacterImpl).driver.addListener(new String[]{"popupMessage"}, listener);
                    break;
                case 6:
                    ((LocalTabContentQueries) transacterImpl).driver.addListener(new String[]{"sheetMessage"}, listener);
                    break;
                case 7:
                    ((LocalTabContentQueries) transacterImpl).driver.addListener(new String[]{"tooltipMessage"}, listener);
                    break;
                case 8:
                    ((LocalTabContentQueries) transacterImpl).driver.addListener(new String[]{"multiBlockerRequests"}, listener);
                    break;
                case 9:
                    ((LocalTabContentQueries) transacterImpl).driver.addListener(new String[]{"rewardSelection"}, listener);
                    break;
                case 10:
                    ((RewardQueries) transacterImpl).driver.addListener(new String[]{"reward", "rewardSelection", "selectableReward"}, listener);
                    break;
                case 11:
                    ((SessionQueries) transacterImpl).driver.addListener(new String[]{"selectedReward"}, listener);
                    break;
                case 12:
                    ((SessionQueries) transacterImpl).driver.addListener(new String[]{"component_migration"}, listener);
                    break;
                case 13:
                    ((LocalTabContentQueries) transacterImpl).driver.addListener(new String[]{"sync_entity"}, listener);
                    break;
                case 14:
                    ((SessionQueries) transacterImpl).driver.addListener(new String[]{"storage_link"}, listener);
                    break;
                case 15:
                    ((LocalTabContentQueries) transacterImpl).driver.addListener(new String[]{"expressivePaymentsBackgroundConfig"}, listener);
                    break;
                case 16:
                    ((InstrumentQueries) transacterImpl).driver.addListener(new String[]{"expressivePaymentsStickerConfig"}, listener);
                    break;
                case 17:
                    ((InstrumentQueries) transacterImpl).driver.addListener(new String[]{"instrument", "profile"}, listener);
                    break;
                case 18:
                    ((SessionQueries) transacterImpl).driver.addListener(new String[]{"treehouseAppConfig"}, listener);
                    break;
                case 19:
                    ((PaymentQueries) transacterImpl).driver.addListener(new String[]{"payment", "customer", "bitcoinTransactionCustomerIds", "loyaltyProgram", "contact", "alias", "contact_alias", "itemizedReceipt", "loyaltyHiddenPaymentTypes", "transfer_customer_ids", "banking_transaction_customer_ids", "lending_transaction_customer_ids", "referral_customer_ids"}, listener);
                    break;
                case 20:
                    ((RewardSlotQueries) transacterImpl).driver.addListener(new String[]{"investment_entity", "payment", "customer"}, listener);
                    break;
                case 21:
                    ((ContactQueries) transacterImpl).driver.addListener(new String[]{"contact", "customer", "instrumentLinkingConfig", "alias", "contact_alias", "invitationEntity", "payment", "profile"}, listener);
                    break;
                case 22:
                    ((RewardSlotQueries) transacterImpl).driver.addListener(new String[]{"contact", "customer", "instrumentLinkingConfig", "alias", "contact_alias"}, listener);
                    break;
                case 23:
                    ((InstrumentQueries) transacterImpl).driver.addListener(new String[]{"sync_entity"}, listener);
                    break;
                case 24:
                    ((RewardSlotQueries) transacterImpl).driver.addListener(new String[]{"loyaltyAccount", "loyaltyProgram", "customer"}, listener);
                    break;
                case 25:
                    ((RewardSlotQueries) transacterImpl).driver.addListener(new String[]{"pendingTransfer"}, listener);
                    break;
                case 26:
                    ((InstrumentQueries) transacterImpl).driver.addListener(new String[]{"pendingPayment"}, listener);
                    break;
                case 27:
                    ((InstrumentQueries) transacterImpl).driver.addListener(new String[]{"pendingTransfer"}, listener);
                    break;
                case 28:
                    ((InstrumentQueries) transacterImpl).driver.addListener(new String[]{"effective_limits"}, listener);
                    break;
                default:
                    ((InstrumentQueries) transacterImpl).driver.addListener(new String[]{"effective_limits"}, listener);
                    break;
            }
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final QueryResult execute(Function1 function1) {
            int i = this.$r8$classId;
            int i2 = 19;
            int i3 = 20;
            int i4 = 14;
            int i5 = 10;
            int i6 = 2;
            int i7 = 13;
            Object obj = this.token;
            TransacterImpl transacterImpl = this.this$0;
            switch (i) {
                case 0:
                    RewardQueries rewardQueries = (RewardQueries) transacterImpl;
                    Collection collection = (Collection) obj;
                    int size = collection.size();
                    rewardQueries.getClass();
                    return rewardQueries.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n          |SELECT rewardWithSelection.token, rewardWithSelection.category, rewardWithSelection.avatars, rewardWithSelection.title, rewardWithSelection.main_text, rewardWithSelection.program_detail_rows, rewardWithSelection.footer_text, rewardWithSelection.boost_detail_rows, rewardWithSelection.boost_attributes, rewardWithSelection.full_title_text, rewardWithSelection.expiration_date_time_ms, rewardWithSelection.activation_date_time_ms, rewardWithSelection.discount_text, rewardWithSelection.reward_selection_state, rewardWithSelection.draggable, rewardWithSelection.affiliate_link_url, rewardWithSelection.user_agent, rewardWithSelection.offerly_token, rewardWithSelection.is_custom_offer, rewardWithSelection.boost_detail_bottom_upsell, rewardWithSelection.redeemable_with_cash_app_pay, rewardWithSelection.redeemable_with_cash_card, rewardWithSelection.app_links, rewardWithSelection.reward_selection\n          |FROM rewardWithSelection\n          |WHERE token IN ", TransacterImpl.createArguments(size), "\n          "), function1, collection.size(), new RewardSlotQueries$$ExternalSyntheticLambda0(this, i5));
                case 1:
                    return ((LocalFulfillmentConfigurationQueries) transacterImpl).driver.executeQuery(-768949150, "SELECT local_fulfillment_configuration.brand_token, local_fulfillment_configuration.type, local_fulfillment_configuration.location_token, local_fulfillment_configuration.current_scheduling_mode, local_fulfillment_configuration.asap_fulfillment, local_fulfillment_configuration.scheduled_fulfillment, local_fulfillment_configuration.delivery_fee\nFROM local_fulfillment_configuration\nWHERE brand_token = ?", function1, 1, new CachedPageEventFlow$$ExternalSyntheticLambda0(this, i2));
                case 2:
                    return ((LocalTabContentQueries) transacterImpl).driver.executeQuery(-2093220851, "SELECT afterpayAppletMerchantSheet.token, afterpayAppletMerchantSheet.last_updated_at_ms, afterpayAppletMerchantSheet.sheet_response\nFROM afterpayAppletMerchantSheet\nWHERE token = ?\nLIMIT 1", function1, 1, new ContextKt$$ExternalSyntheticLambda1(this, i6));
                case 3:
                    return ((LocalTabContentQueries) transacterImpl).driver.executeQuery(-251478619, "SELECT fullScreenMessage.messageToken, fullScreenMessage.campaignToken, fullScreenMessage.isBadged, fullScreenMessage.video, fullScreenMessage.primaryAction, fullScreenMessage.secondaryAction, fullScreenMessage.primaryActionColor, fullScreenMessage.secondaryActionColor, fullScreenMessage.priority, fullScreenMessage.insertedAtUtc, fullScreenMessage.placement, fullScreenMessage.expiresAtUtc FROM fullScreenMessage WHERE messageToken = ?", function1, 1, new ContextKt$$ExternalSyntheticLambda1(this, i2));
                case 4:
                    return ((LocalTabContentQueries) transacterImpl).driver.executeQuery(-1221578712, "SELECT inlineMessageV2.messageToken, inlineMessageV2.campaignToken, inlineMessageV2.isBadged, inlineMessageV2.placement, inlineMessageV2.avatar, inlineMessageV2.title, inlineMessageV2.subtitle, inlineMessageV2.url, inlineMessageV2.priority, inlineMessageV2.expiresAtUtc\nFROM inlineMessageV2\nWHERE messageToken = ?", function1, 1, new ContextKt$$ExternalSyntheticLambda1(this, i3));
                case 5:
                    return ((LocalTabContentQueries) transacterImpl).driver.executeQuery(586966623, "SELECT count(*) > 0 FROM popupMessage\nWHERE messageToken = ?", function1, 1, new ContextKt$$ExternalSyntheticLambda1(this, 22));
                case 6:
                    return ((LocalTabContentQueries) transacterImpl).driver.executeQuery(1652984282, "SELECT sheetMessage.message_token, sheetMessage.campaign_token, sheetMessage.is_badged, sheetMessage.message_format, sheetMessage.inserted_at_utc, sheetMessage.metadata_id, sheetMessage.priority, sheetMessage.expiresAtUtc FROM sheetMessage\nWHERE message_token = ?", function1, 1, new ContextKt$$ExternalSyntheticLambda1(this, 24));
                case 7:
                    LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) transacterImpl;
                    return localTabContentQueries.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT tooltipMessage.messageToken, tooltipMessage.campaignToken, tooltipMessage.isBadged, tooltipMessage.placement, tooltipMessage.arrowPosition, tooltipMessage.tooltip, tooltipMessage.priority, tooltipMessage.expiresAtUtc\n    |FROM tooltipMessage\n    |WHERE placement ", ((Placement) obj) == null ? "IS" : "=", " ?\n    |AND (expiresAtUtc IS NULL OR expiresAtUtc > strftime('%s', 'now'))\n    "), function1, 1, new BadgeQueries$$ExternalSyntheticLambda0(i6, this, localTabContentQueries));
                case 8:
                    return ((LocalTabContentQueries) transacterImpl).driver.executeQuery(-1586892536, "SELECT request\nFROM multiBlockerRequests\nWHERE group_id = ?", function1, 1, new BadgeQueries$$ExternalSyntheticLambda5(this, 21));
                case 9:
                    return ((LocalTabContentQueries) transacterImpl).driver.executeQuery(-1952158800, "SELECT COUNT(token)\nFROM rewardSelection\nWHERE reward_token = ?", function1, 1, new RewardSlotQueries$$ExternalSyntheticLambda0(this, 12));
                case 10:
                    return ((RewardQueries) transacterImpl).driver.executeQuery(-1572971477, "SELECT rewardWithSelection.token, rewardWithSelection.category, rewardWithSelection.avatars, rewardWithSelection.title, rewardWithSelection.main_text, rewardWithSelection.program_detail_rows, rewardWithSelection.footer_text, rewardWithSelection.boost_detail_rows, rewardWithSelection.boost_attributes, rewardWithSelection.full_title_text, rewardWithSelection.expiration_date_time_ms, rewardWithSelection.activation_date_time_ms, rewardWithSelection.discount_text, rewardWithSelection.reward_selection_state, rewardWithSelection.draggable, rewardWithSelection.affiliate_link_url, rewardWithSelection.user_agent, rewardWithSelection.offerly_token, rewardWithSelection.is_custom_offer, rewardWithSelection.boost_detail_bottom_upsell, rewardWithSelection.redeemable_with_cash_app_pay, rewardWithSelection.redeemable_with_cash_card, rewardWithSelection.app_links, rewardWithSelection.reward_selection\nFROM selectableReward\nINNER JOIN rewardWithSelection ON selectableReward.reward_token = rewardWithSelection.token\nWHERE selectableReward.reward_token != ?", function1, 1, new RewardSlotQueries$$ExternalSyntheticLambda0(this, i7));
                case 11:
                    return ((SessionQueries) transacterImpl).driver.executeQuery(389390809, "SELECT token\nFROM selectedReward\nWHERE reward_token = ?", function1, 1, new RewardSlotQueries$$ExternalSyntheticLambda0(this, i4));
                case 12:
                    return ((SessionQueries) transacterImpl).driver.executeQuery(-1603059193, "SELECT migration_version FROM component_migration\nWHERE component_key = ?", function1, 1, new CaptureCheckFaceKt$$ExternalSyntheticLambda12(this, 15));
                case 13:
                    LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) transacterImpl;
                    return localTabContentQueries2.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT sync_entity.topic, sync_entity.entity_id, sync_entity.entity_type, sync_entity.entity_data, sync_entity.entity_version, sync_entity.value_type\n    |FROM sync_entity\n    |WHERE value_type ", ((SyncValueType) obj) == null ? "IS" : "=", " ?\n    "), function1, 1, new BadgedBoxKt$$ExternalSyntheticLambda0(i6, this, localTabContentQueries2));
                case 14:
                    return ((SessionQueries) transacterImpl).driver.executeQuery(null, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SELECT id, signin_group_id, created_at_ms FROM storage_link WHERE account_token ", ((String) obj) == null ? "IS" : "=", " ?"), function1, 1, new StampsConfigQueries$$ExternalSyntheticLambda0(this, 8));
                case 15:
                    LocalTabContentQueries localTabContentQueries3 = (LocalTabContentQueries) transacterImpl;
                    return localTabContentQueries3.driver.executeQuery(1836465570, "SELECT expressivePaymentsBackgroundConfig.name, expressivePaymentsBackgroundConfig.main_url, expressivePaymentsBackgroundConfig.preview_url, expressivePaymentsBackgroundConfig.background_color, expressivePaymentsBackgroundConfig.default_text_format, expressivePaymentsBackgroundConfig.effects, expressivePaymentsBackgroundConfig.priority, expressivePaymentsBackgroundConfig.release_state, expressivePaymentsBackgroundConfig.tags, expressivePaymentsBackgroundConfig.is_default, expressivePaymentsBackgroundConfig.accessibility_description\nFROM expressivePaymentsBackgroundConfig\nWHERE release_state = ?\nORDER BY priority ASC", function1, 1, new InstrumentQueries$$ExternalSyntheticLambda0(i5, localTabContentQueries3, this));
                case 16:
                    InstrumentQueries instrumentQueries = (InstrumentQueries) transacterImpl;
                    return instrumentQueries.driver.executeQuery(-1798662594, "SELECT expressivePaymentsStickerConfig.name, expressivePaymentsStickerConfig.main_url, expressivePaymentsStickerConfig.preview_url, expressivePaymentsStickerConfig.effects, expressivePaymentsStickerConfig.priority, expressivePaymentsStickerConfig.release_state, expressivePaymentsStickerConfig.tags, expressivePaymentsStickerConfig.is_default, expressivePaymentsStickerConfig.accessibility_description\nFROM expressivePaymentsStickerConfig\nWHERE release_state = ?\nORDER BY priority ASC", function1, 1, new InstrumentQueries$$ExternalSyntheticLambda0(i7, instrumentQueries, this));
                case 17:
                    InstrumentQueries instrumentQueries2 = (InstrumentQueries) transacterImpl;
                    return instrumentQueries2.driver.executeQuery(-1457523794, "SELECT\n  token,\n  balance_amount,\n  balance_currency,\n  version\nFROM instrument\nJOIN profile\nWHERE balance_currency = profile.default_currency\nAND cash_instrument_type = ?", function1, 1, new InstrumentQueries$$ExternalSyntheticLambda0(instrumentQueries2, this, 16));
                case 18:
                    return ((SessionQueries) transacterImpl).driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT treehouseAppConfig.app_name, treehouseAppConfig.path, treehouseAppConfig.url, treehouseAppConfig.minimal_commit_timestamp\n    |FROM treehouseAppConfig\n    |WHERE app_name ", ((String) obj) == null ? "IS" : "=", " ?\n    |LIMIT 1\n    "), function1, 1, new StampsConfigQueries$$ExternalSyntheticLambda0(this, i7));
                case 19:
                    return ((PaymentQueries) transacterImpl).driver.executeQuery(889169599, "SELECT cashActivity.their_id, cashActivity.is_outstanding, cashActivity._id, cashActivity.token, cashActivity.payment_render_data, cashActivity.sender_render_data, cashActivity.recipient_render_data, cashActivity.loyalty_render_data, cashActivity.state, cashActivity.role, cashActivity.amount, cashActivity.amount_currency, cashActivity.is_badged, cashActivity.is_bitcoin, cashActivity.is_scheduled, cashActivity.scheduled_for, cashActivity.scheduled_payment_token, cashActivity.photo, cashActivity.themed_accent_color, cashActivity.lookup_key, cashActivity.display_name, cashActivity.merchant_data, cashActivity.email, cashActivity.sms, cashActivity.threaded_customer_id, cashActivity.is_cash_customer, cashActivity.can_accept_payments, cashActivity.is_business, cashActivity.display_date, cashActivity.receipt_render_data, cashActivity.rollup_type, cashActivity.investment_order_type, cashActivity.payment_type, cashActivity.gifted_investment_entity_token, cashActivity.lending_loan_token, cashActivity.associated_payment_token, cashActivity.sync_entity_version, cashActivity.loyalty_activity, cashActivity.isRegular, cashActivity.is_hidden, cashActivity.orientation, cashActivity.transaction_type\nFROM cashActivity\nWHERE token = ?\nAND (? OR is_hidden = 0)", function1, 2, new StampsConfigQueries$$ExternalSyntheticLambda0(this, 18));
                case 20:
                    return ((RewardSlotQueries) transacterImpl).driver.executeQuery(1595671118, "SELECT\n  investment_entity.color,\n  investment_entity.entity_color\nFROM payment\nJOIN customer ON their_id = customer_id\nJOIN investment_entity ON customer.investment_entity_token = investment_entity.token\nWHERE payment.token = ?", function1, 1, new StampsConfigQueries$$ExternalSyntheticLambda0(this, i3));
                case 21:
                    ContactQueries contactQueries = (ContactQueries) transacterImpl;
                    return contactQueries.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT recipients.contact_display_name, recipients.lookup_key, recipients.already_invited, recipients.has_multiple_customers, recipients.customer_id, recipients.threaded_customer_id, recipients.cashtag, recipients.is_cash_customer, recipients.is_verified, recipients.is_business, recipients.email, recipients.sms, recipients.photo, recipients.customer_display_name, recipients.email_addresses, recipients.sms_numbers, recipients.can_accept_payments, recipients.is_square, recipients.credit_card_fee, recipients.blocked, recipients.merchant_data, recipients.themed_accent_color, recipients.region, recipients.category, recipients.joined_on, recipients.is_recent\n    |FROM recipients\n    |WHERE lookup_key IS NOT NULL\n    |AND (blocked IS NULL OR blocked ", ((BlockState) obj) == null ? "IS NOT" : "!=", " ?)\n    |AND (customer_id IS NULL OR customer_id != (SELECT profile_id FROM profile))\n    "), function1, 1, new InstrumentQueries$$ExternalSyntheticLambda0(27, this, contactQueries));
                case 22:
                    Collection collection2 = (Collection) obj;
                    return ((RewardSlotQueries) transacterImpl).driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n          |SELECT activityRecipient.contact_display_name, activityRecipient.lookup_key, activityRecipient.already_invited, activityRecipient.has_multiple_customers, activityRecipient.customer_id, activityRecipient.threaded_customer_id, activityRecipient.cashtag, activityRecipient.is_cash_customer, activityRecipient.is_verified, activityRecipient.is_business, activityRecipient.email, activityRecipient.sms, activityRecipient.photo, activityRecipient.customer_display_name, activityRecipient.email_addresses, activityRecipient.sms_numbers, activityRecipient.can_accept_payments, activityRecipient.is_square, activityRecipient.credit_card_fee, activityRecipient.blocked, activityRecipient.merchant_data, activityRecipient.themed_accent_color, activityRecipient.region, activityRecipient.category, activityRecipient.investment_entity_token, activityRecipient.render_data\n          |FROM activityRecipient\n          |WHERE customer_id IN ", TransacterImpl.createArguments(collection2.size()), "\n          "), function1, collection2.size(), new StampsConfigQueries$$ExternalSyntheticLambda0(this, 29));
                case 23:
                    InstrumentQueries instrumentQueries3 = (InstrumentQueries) transacterImpl;
                    return instrumentQueries3.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT sync_entity.entity_id, sync_entity.type, sync_entity.entity, sync_entity.entity_processor_version, sync_entity.sync_value_type, sync_entity.sync_entity_version, sync_entity.topic\n    |FROM sync_entity\n    |WHERE sync_value_type ", ((Integer) obj) == null ? "IS" : "=", " ?\n    "), function1, 1, new ProfileQueries$$ExternalSyntheticLambda13(i6, this, instrumentQueries3));
                case 24:
                    return ((RewardSlotQueries) transacterImpl).driver.executeQuery(-867253678, "SELECT cash_merchant_token, customer_phone_number, account_status_url, points_earned, loyalty_unit,\n       program_rewards, themed_accent_color, photo, coalesce(customer_display_name, '') AS display_name,\n       merchant_data, program_details, loyalty_program_id, account_id\nFROM loyaltyData\nJOIN customer ON cash_merchant_token = customer_id\nWHERE cash_merchant_token = ?", function1, 1, new OfflineQueries$$ExternalSyntheticLambda0(this, i5));
                case 25:
                    RewardSlotQueries rewardSlotQueries = (RewardSlotQueries) transacterImpl;
                    return rewardSlotQueries.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n    |SELECT count(*) > 0\n    |FROM (\n    |  SELECT external_id\n    |  FROM pendingTransfer\n    |  WHERE succeeded = 0 AND type ", ((TransferType) obj) == null ? "IS" : "=", " ?\n    |)\n    "), function1, 1, new ProfileQueries$$ExternalSyntheticLambda13(3, this, rewardSlotQueries));
                case 26:
                    return ((InstrumentQueries) transacterImpl).driver.executeQuery(-1333218923, "SELECT pendingPayment.external_id, pendingPayment.created_at, pendingPayment.retry_at, pendingPayment.retry_count, pendingPayment.request, pendingPayment.amount, pendingPayment.orientation, pendingPayment.succeeded, pendingPayment.recipients, pendingPayment.invest_payment_data, pendingPayment.client_scenario, pendingPayment.personalization, pendingPayment.ready_for_removal\nFROM pendingPayment\nWHERE external_id = ?", function1, 1, new OfflineQueries$$ExternalSyntheticLambda0(this, i7));
                case 27:
                    return ((InstrumentQueries) transacterImpl).driver.executeQuery(-24158190, "SELECT pendingTransfer.external_id, pendingTransfer.created_at, pendingTransfer.retry_at, pendingTransfer.retry_count, pendingTransfer.request, pendingTransfer.succeeded, pendingTransfer.type, pendingTransfer.ready_for_removal, pendingTransfer.first_error_request_created_at, pendingTransfer.first_error_response_created_at, pendingTransfer.first_error_response_reason\nFROM pendingTransfer\nWHERE external_id = ?", function1, 1, new OfflineQueries$$ExternalSyntheticLambda0(this, i4));
                case 28:
                    InstrumentQueries instrumentQueries4 = (InstrumentQueries) transacterImpl;
                    return instrumentQueries4.driver.executeQuery(-1666000475, "SELECT effective_limits.limited_action, effective_limits.limit_amount, effective_limits.limit_exceeded_message\nFROM effective_limits\nWHERE limited_action = ?", function1, 1, new ProfileQueries$$ExternalSyntheticLambda13(5, instrumentQueries4, this));
                default:
                    InstrumentQueries instrumentQueries5 = (InstrumentQueries) transacterImpl;
                    Collection collection3 = (Collection) obj;
                    int size2 = collection3.size();
                    instrumentQueries5.getClass();
                    return instrumentQueries5.driver.executeQuery(null, re$$ExternalSyntheticOutline0.m("\n          |SELECT effective_limits.limited_action, effective_limits.limit_amount, effective_limits.limit_exceeded_message\n          |FROM effective_limits\n          |WHERE limited_action IN ", TransacterImpl.createArguments(size2), "\n          "), function1, collection3.size(), new ProfileQueries$$ExternalSyntheticLambda13(6, this, instrumentQueries5));
            }
        }

        @Override // app.cash.sqldelight.Query
        public final void removeListener(Query.Listener listener) {
            int i = this.$r8$classId;
            TransacterImpl transacterImpl = this.this$0;
            listener.getClass();
            switch (i) {
                case 0:
                    ((RewardQueries) transacterImpl).driver.removeListener(new String[]{"reward", "rewardSelection"}, listener);
                    break;
                case 1:
                    ((LocalFulfillmentConfigurationQueries) transacterImpl).driver.removeListener(new String[]{"local_fulfillment_configuration"}, listener);
                    break;
                case 2:
                    ((LocalTabContentQueries) transacterImpl).driver.removeListener(new String[]{"afterpayAppletMerchantSheet"}, listener);
                    break;
                case 3:
                    ((LocalTabContentQueries) transacterImpl).driver.removeListener(new String[]{"fullScreenMessage"}, listener);
                    break;
                case 4:
                    ((LocalTabContentQueries) transacterImpl).driver.removeListener(new String[]{"inlineMessageV2"}, listener);
                    break;
                case 5:
                    ((LocalTabContentQueries) transacterImpl).driver.removeListener(new String[]{"popupMessage"}, listener);
                    break;
                case 6:
                    ((LocalTabContentQueries) transacterImpl).driver.removeListener(new String[]{"sheetMessage"}, listener);
                    break;
                case 7:
                    ((LocalTabContentQueries) transacterImpl).driver.removeListener(new String[]{"tooltipMessage"}, listener);
                    break;
                case 8:
                    ((LocalTabContentQueries) transacterImpl).driver.removeListener(new String[]{"multiBlockerRequests"}, listener);
                    break;
                case 9:
                    ((LocalTabContentQueries) transacterImpl).driver.removeListener(new String[]{"rewardSelection"}, listener);
                    break;
                case 10:
                    ((RewardQueries) transacterImpl).driver.removeListener(new String[]{"reward", "rewardSelection", "selectableReward"}, listener);
                    break;
                case 11:
                    ((SessionQueries) transacterImpl).driver.removeListener(new String[]{"selectedReward"}, listener);
                    break;
                case 12:
                    ((SessionQueries) transacterImpl).driver.removeListener(new String[]{"component_migration"}, listener);
                    break;
                case 13:
                    ((LocalTabContentQueries) transacterImpl).driver.removeListener(new String[]{"sync_entity"}, listener);
                    break;
                case 14:
                    ((SessionQueries) transacterImpl).driver.removeListener(new String[]{"storage_link"}, listener);
                    break;
                case 15:
                    ((LocalTabContentQueries) transacterImpl).driver.removeListener(new String[]{"expressivePaymentsBackgroundConfig"}, listener);
                    break;
                case 16:
                    ((InstrumentQueries) transacterImpl).driver.removeListener(new String[]{"expressivePaymentsStickerConfig"}, listener);
                    break;
                case 17:
                    ((InstrumentQueries) transacterImpl).driver.removeListener(new String[]{"instrument", "profile"}, listener);
                    break;
                case 18:
                    ((SessionQueries) transacterImpl).driver.removeListener(new String[]{"treehouseAppConfig"}, listener);
                    break;
                case 19:
                    ((PaymentQueries) transacterImpl).driver.removeListener(new String[]{"payment", "customer", "bitcoinTransactionCustomerIds", "loyaltyProgram", "contact", "alias", "contact_alias", "itemizedReceipt", "loyaltyHiddenPaymentTypes", "transfer_customer_ids", "banking_transaction_customer_ids", "lending_transaction_customer_ids", "referral_customer_ids"}, listener);
                    break;
                case 20:
                    ((RewardSlotQueries) transacterImpl).driver.removeListener(new String[]{"investment_entity", "payment", "customer"}, listener);
                    break;
                case 21:
                    ((ContactQueries) transacterImpl).driver.removeListener(new String[]{"contact", "customer", "instrumentLinkingConfig", "alias", "contact_alias", "invitationEntity", "payment", "profile"}, listener);
                    break;
                case 22:
                    ((RewardSlotQueries) transacterImpl).driver.removeListener(new String[]{"contact", "customer", "instrumentLinkingConfig", "alias", "contact_alias"}, listener);
                    break;
                case 23:
                    ((InstrumentQueries) transacterImpl).driver.removeListener(new String[]{"sync_entity"}, listener);
                    break;
                case 24:
                    ((RewardSlotQueries) transacterImpl).driver.removeListener(new String[]{"loyaltyAccount", "loyaltyProgram", "customer"}, listener);
                    break;
                case 25:
                    ((RewardSlotQueries) transacterImpl).driver.removeListener(new String[]{"pendingTransfer"}, listener);
                    break;
                case 26:
                    ((InstrumentQueries) transacterImpl).driver.removeListener(new String[]{"pendingPayment"}, listener);
                    break;
                case 27:
                    ((InstrumentQueries) transacterImpl).driver.removeListener(new String[]{"pendingTransfer"}, listener);
                    break;
                case 28:
                    ((InstrumentQueries) transacterImpl).driver.removeListener(new String[]{"effective_limits"}, listener);
                    break;
                default:
                    ((InstrumentQueries) transacterImpl).driver.removeListener(new String[]{"effective_limits"}, listener);
                    break;
            }
        }

        public final String toString() {
            switch (this.$r8$classId) {
                case 0:
                    return "Reward.sq:forIds";
                case 1:
                    return "localFulfillmentConfiguration.sq:select";
                case 2:
                    return "AfterpayAppletMerchantSheet.sq:getForToken";
                case 3:
                    return "FullScreenMessage.sq:get";
                case 4:
                    return "InlineMessageV2.sq:inlineMessageByMessageToken";
                case 5:
                    return "PopupMessage.sq:hasMessage";
                case 6:
                    return "SheetMessage.sq:messageByToken";
                case 7:
                    return "TooltipMessage.sq:tooltipMessagesForPlacement";
                case 8:
                    return "MultiBlocker.sq:requestsForGroup";
                case 9:
                    return "RewardSelection.sq:countByRewardToken";
                case 10:
                    return "SelectableReward.sq:rewardsExcept";
                case 11:
                    return "SelectedReward.sq:getTokenByRewardToken";
                case 12:
                    return "ComponentMigration.sq:selectMigrationVersion";
                case 13:
                    return "SyncEntity.sq:selectAllWithValueType";
                case 14:
                    return "StorageLink.sq:getLinkForAccount";
                case 15:
                    return "ExpressivePaymentsBackgroundConfig.sq:backgroundsForState";
                case 16:
                    return "ExpressivePaymentsStickerConfig.sq:stickersForState";
                case 17:
                    return "Instrument.sq:selectDefaultBalanceWithVersion";
                case 18:
                    return "TreehouseAppConfig.sq:forAppName";
                case 19:
                    return "CashActivity.sq:forToken";
                case 20:
                    return "InvestmentActivity.sq:entityColorForPayment";
                case 21:
                    return "Contact.sq:contacts";
                case 22:
                    return "Customer.sq:forIds";
                case 23:
                    return "SyncEntity.sq:selectAllWithValueType";
                case 24:
                    return "LoyaltyMerchant.sq:loyaltyMerchant";
                case 25:
                    return "Offline.sq:hasPendingTransfers";
                case 26:
                    return "PendingPayment.sq:pendingRequest";
                case 27:
                    return "PendingTransfer.sq:pendingTransfer";
                case 28:
                    return "CustomerLimits.sq:limitForAction";
                default:
                    return "CustomerLimits.sq:limitsForActions";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForIdsQuery(LocalTabContentQueries localTabContentQueries, String str, ContextKt$$ExternalSyntheticLambda1 contextKt$$ExternalSyntheticLambda1) {
            super(contextKt$$ExternalSyntheticLambda1);
            this.$r8$classId = 2;
            str.getClass();
            this.this$0 = localTabContentQueries;
            this.token = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ForIdsQuery(TransacterImpl transacterImpl, Object obj, Function1 function1, int i) {
            super(function1);
            this.$r8$classId = i;
            this.this$0 = transacterImpl;
            this.token = obj;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForIdsQuery(LocalFulfillmentConfigurationQueries localFulfillmentConfigurationQueries, String str, CachedPageEventFlow$$ExternalSyntheticLambda0 cachedPageEventFlow$$ExternalSyntheticLambda0) {
            super(cachedPageEventFlow$$ExternalSyntheticLambda0);
            this.$r8$classId = 1;
            str.getClass();
            this.this$0 = localFulfillmentConfigurationQueries;
            this.token = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForIdsQuery(InstrumentQueries instrumentQueries, CustomerLimitsQueries$$ExternalSyntheticLambda1 customerLimitsQueries$$ExternalSyntheticLambda1) {
            super(customerLimitsQueries$$ExternalSyntheticLambda1);
            this.$r8$classId = 28;
            LimitedAction limitedAction = LimitedAction.SELL_CRYPTOCURRENCY;
            this.this$0 = instrumentQueries;
            this.token = limitedAction;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForIdsQuery(InstrumentQueries instrumentQueries, ReleaseState releaseState, ExpressivePaymentsStickerConfigQueries$$ExternalSyntheticLambda0 expressivePaymentsStickerConfigQueries$$ExternalSyntheticLambda0) {
            super(expressivePaymentsStickerConfigQueries$$ExternalSyntheticLambda0);
            this.$r8$classId = 16;
            releaseState.getClass();
            this.this$0 = instrumentQueries;
            this.token = releaseState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForIdsQuery(LocalTabContentQueries localTabContentQueries, String str, RewardQueries$$ExternalSyntheticLambda4 rewardQueries$$ExternalSyntheticLambda4) {
            super(rewardQueries$$ExternalSyntheticLambda4);
            this.$r8$classId = 9;
            str.getClass();
            this.this$0 = localTabContentQueries;
            this.token = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForIdsQuery(RewardQueries rewardQueries, String str, SelectableRewardQueries$$ExternalSyntheticLambda3 selectableRewardQueries$$ExternalSyntheticLambda3) {
            super(selectableRewardQueries$$ExternalSyntheticLambda3);
            this.$r8$classId = 10;
            str.getClass();
            this.this$0 = rewardQueries;
            this.token = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForIdsQuery(LocalTabContentQueries localTabContentQueries, ContextKt$$ExternalSyntheticLambda1 contextKt$$ExternalSyntheticLambda1) {
            super(contextKt$$ExternalSyntheticLambda1);
            this.$r8$classId = 7;
            Placement placement = Placement.MONEYBOT_SAVED_TO_MEMORY_LABEL;
            this.this$0 = localTabContentQueries;
            this.token = placement;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForIdsQuery(LocalTabContentQueries localTabContentQueries, String str, ContextKt$$ExternalSyntheticLambda1 contextKt$$ExternalSyntheticLambda1, byte b) {
            super(contextKt$$ExternalSyntheticLambda1);
            this.$r8$classId = 6;
            str.getClass();
            this.this$0 = localTabContentQueries;
            this.token = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForIdsQuery(LocalTabContentQueries localTabContentQueries, ReleaseState releaseState, ExpressivePaymentsBackgroundConfigQueries$$ExternalSyntheticLambda0 expressivePaymentsBackgroundConfigQueries$$ExternalSyntheticLambda0) {
            super(expressivePaymentsBackgroundConfigQueries$$ExternalSyntheticLambda0);
            this.$r8$classId = 15;
            releaseState.getClass();
            this.this$0 = localTabContentQueries;
            this.token = releaseState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForIdsQuery(LocalTabContentQueries localTabContentQueries, String str, InlineMessageV2Queries$$ExternalSyntheticLambda0 inlineMessageV2Queries$$ExternalSyntheticLambda0) {
            super(inlineMessageV2Queries$$ExternalSyntheticLambda0);
            this.$r8$classId = 4;
            str.getClass();
            this.this$0 = localTabContentQueries;
            this.token = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForIdsQuery(LocalTabContentQueries localTabContentQueries, String str, FullScreenMessageQueries$$ExternalSyntheticLambda5 fullScreenMessageQueries$$ExternalSyntheticLambda5) {
            super(fullScreenMessageQueries$$ExternalSyntheticLambda5);
            this.$r8$classId = 3;
            str.getClass();
            this.this$0 = localTabContentQueries;
            this.token = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForIdsQuery(RewardQueries rewardQueries, Collection collection, RewardQueries$$ExternalSyntheticLambda1 rewardQueries$$ExternalSyntheticLambda1) {
            super(rewardQueries$$ExternalSyntheticLambda1);
            this.$r8$classId = 0;
            collection.getClass();
            this.this$0 = rewardQueries;
            this.token = collection;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForIdsQuery(InstrumentQueries instrumentQueries, String str, PendingTransferQueries$$ExternalSyntheticLambda2 pendingTransferQueries$$ExternalSyntheticLambda2) {
            super(pendingTransferQueries$$ExternalSyntheticLambda2);
            this.$r8$classId = 27;
            str.getClass();
            this.this$0 = instrumentQueries;
            this.token = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForIdsQuery(InstrumentQueries instrumentQueries, String str, PendingPaymentQueries$$ExternalSyntheticLambda0 pendingPaymentQueries$$ExternalSyntheticLambda0) {
            super(pendingPaymentQueries$$ExternalSyntheticLambda0);
            this.$r8$classId = 26;
            str.getClass();
            this.this$0 = instrumentQueries;
            this.token = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForIdsQuery(RewardSlotQueries rewardSlotQueries, Collection collection, CustomerQueries$$ExternalSyntheticLambda7 customerQueries$$ExternalSyntheticLambda7) {
            super(customerQueries$$ExternalSyntheticLambda7);
            this.$r8$classId = 22;
            collection.getClass();
            this.this$0 = rewardSlotQueries;
            this.token = collection;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForIdsQuery(PaymentQueries paymentQueries, String str, CashActivityQueries$$ExternalSyntheticLambda1 cashActivityQueries$$ExternalSyntheticLambda1) {
            super(cashActivityQueries$$ExternalSyntheticLambda1);
            this.$r8$classId = 19;
            str.getClass();
            this.this$0 = paymentQueries;
            this.token = str;
        }
    }
}
