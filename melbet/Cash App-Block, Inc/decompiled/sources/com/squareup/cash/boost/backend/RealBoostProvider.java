package com.squareup.cash.boost.backend;

import androidx.paging.PageFetcher$flow$1;
import androidx.room.util.DBUtil;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.db.SqlDriver;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.boost.db.RewardQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.boost.db.RewardQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.boost.db.RewardQueries$forId$2;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.boost.db.RewardSlotQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.boost.db.RewardSlotQueries$slots$2;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.network.impl.RealNetworkInfo;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;

/* loaded from: classes.dex */
public final class RealBoostProvider {
    public final SessionQueries activeBoostTokenOverrideQueries;
    public final AndroidClock clock;
    public final CoroutineContext ioDispatcher;
    public final RealNetworkInfo networkInfo;
    public final SessionQueries orderedRewardTokenQueries;
    public final SessionQueries rewardMerchantQueries;
    public final RewardQueries rewardQueries;
    public final RewardQueries selectableRewardQueries;
    public final SessionQueries selectedRewardQueries;
    public final RewardSlotQueries slotQueries;
    public final LocalTabContentQueries userRewardsDataQueries;

    public RealBoostProvider(CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidClock androidClock, RealNetworkInfo realNetworkInfo, CoroutineContext coroutineContext) {
        this.clock = androidClock;
        this.networkInfo = realNetworkInfo;
        this.ioDispatcher = coroutineContext;
        this.slotQueries = cashAccountDatabaseImpl.rewardSlotQueries;
        this.selectedRewardQueries = cashAccountDatabaseImpl.selectedRewardQueries;
        this.selectableRewardQueries = cashAccountDatabaseImpl.selectableRewardQueries;
        this.rewardQueries = cashAccountDatabaseImpl.rewardQueries;
        this.orderedRewardTokenQueries = cashAccountDatabaseImpl.orderedRewardTokenQueries;
        this.rewardMerchantQueries = cashAccountDatabaseImpl.rewardMerchantQueries;
        this.userRewardsDataQueries = cashAccountDatabaseImpl.userRewardsDataQueries;
        this.activeBoostTokenOverrideQueries = cashAccountDatabaseImpl.activeRewardOverrideQueries;
    }

    public final Flow getActiveBoostTokenOverride() {
        SqlDriver sqlDriver = this.activeBoostTokenOverrideQueries.driver;
        RewardQueries$$ExternalSyntheticLambda4 rewardQueries$$ExternalSyntheticLambda4 = new RewardQueries$$ExternalSyntheticLambda4(6);
        sqlDriver.getClass();
        return FlowKt.distinctUntilChanged(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(10), DBUtil.mapToOneOrNull(DBUtil.toFlow(new SimpleQuery(-530766080, new String[]{"activeRewardOverride"}, sqlDriver, "ActiveRewardOverride.sq", "activeOverride", "SELECT reward_token\nFROM activeRewardOverride", rewardQueries$$ExternalSyntheticLambda4)), this.ioDispatcher)));
    }

    public final FlowQuery$mapToList$$inlined$map$1 getBoost(String str) {
        str.getClass();
        RewardQueries rewardQueries = this.rewardQueries;
        rewardQueries.getClass();
        RewardQueries$forId$2 rewardQueries$forId$2 = RewardQueries$forId$2.INSTANCE;
        return DBUtil.mapToOneOrNull(DBUtil.toFlow(new RewardQueries.ForIdQuery(rewardQueries, str, new RewardQueries$$ExternalSyntheticLambda1(rewardQueries, 1))), this.ioDispatcher);
    }

    public final Flow getBoostSlots(boolean z) {
        RewardSlotQueries rewardSlotQueries = this.slotQueries;
        rewardSlotQueries.getClass();
        RewardSlotQueries$slots$2 rewardSlotQueries$slots$2 = RewardSlotQueries$slots$2.INSTANCE;
        SqlDriver sqlDriver = rewardSlotQueries.driver;
        RewardSlotQueries$$ExternalSyntheticLambda0 rewardSlotQueries$$ExternalSyntheticLambda0 = new RewardSlotQueries$$ExternalSyntheticLambda0(rewardSlotQueries);
        sqlDriver.getClass();
        FlowQuery$mapToList$$inlined$map$1 mapToList = DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(85644827, new String[]{"rewardSlot", "reward", "selectedReward"}, sqlDriver, "RewardSlot.sq", "slots", "SELECT rewardSlot.state,\n       rewardSlot.selected_reward_token,\n       reward.token, reward.category, reward.avatars, reward.title, reward.main_text, reward.program_detail_rows, reward.footer_text, reward.boost_detail_rows, reward.boost_attributes, reward.full_title_text, reward.expiration_date_time_ms, reward.activation_date_time_ms, reward.discount_text, reward.reward_selection_state, reward.draggable, reward.affiliate_link_url, reward.user_agent, reward.offerly_token, reward.is_custom_offer, reward.boost_detail_bottom_upsell, reward.redeemable_with_cash_app_pay, reward.redeemable_with_cash_card, reward.app_links\nFROM rewardSlot\nLEFT JOIN selectedReward ON rewardSlot.selected_reward_token = selectedReward.token\nLEFT JOIN reward ON selectedReward.reward_token = reward.token", rewardSlotQueries$$ExternalSyntheticLambda0)), this.ioDispatcher);
        return z ? mapToList : FlowKt.transformLatest(getActiveBoostTokenOverride(), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) null, this, mapToList, 4));
    }

    public final RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 getCategorizedBoosts() {
        SqlDriver sqlDriver = this.orderedRewardTokenQueries.driver;
        RewardQueries$$ExternalSyntheticLambda4 rewardQueries$$ExternalSyntheticLambda4 = new RewardQueries$$ExternalSyntheticLambda4(8);
        sqlDriver.getClass();
        return FlowKt.flatMapConcat(new InteractiveCardView$flingTo$1.AnonymousClass2(this, null, 17), DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(1024521563, new String[]{"orderedRewardToken"}, sqlDriver, "OrderedRewardToken.sq", "selectAll", "SELECT orderedRewardToken.token\nFROM orderedRewardToken", rewardQueries$$ExternalSyntheticLambda4)), this.ioDispatcher));
    }
}
