package com.squareup.cash.boost.db;

import app.cash.local.db.Local_tab_content;
import app.cash.sqldelight.EnumColumnAdapter;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.db2.contacts.Alias$Adapter;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.GetBoostConfigResponse;
import com.squareup.protos.franklin.ui.RewardSelection;
import com.squareup.protos.rewardly.common.RewardSlotState;
import com.squareup.protos.rewardly.ui.AppLinks;
import com.squareup.protos.rewardly.ui.UiBoostAttribute;
import com.squareup.protos.rewardly.ui.UiRewardAvatars;
import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import com.squareup.protos.rewardly.ui.UiRewardSelectionState;

/* loaded from: classes.dex */
public abstract class AdaptersKt {
    public static final Local_tab_content.Adapter boostConfigAdapter;
    public static final Reward$Adapter rewardAdapter;
    public static final BlockersConfig.Adapter rewardSelectionAdapter;
    public static final Alias$Adapter rewardSlotAdapter = new Alias$Adapter(new EnumColumnAdapter(RewardSlotState.values()));
    public static final BlockersConfig.Adapter userRewardsDataAdapter;

    static {
        WireAdapter wireAdapter = new WireAdapter(UiRewardAvatars.ADAPTER);
        WireRepeatedAdapter wireRepeatedAdapter = new WireRepeatedAdapter(UiRewardProgramDetails.DetailRow.ADAPTER, 0);
        WireRepeatedAdapter wireRepeatedAdapter2 = new WireRepeatedAdapter(UiRewardProgramDetails.BoostDetail.ADAPTER, 0);
        WireRepeatedAdapter wireRepeatedAdapter3 = new WireRepeatedAdapter(UiBoostAttribute.ADAPTER, 0);
        WireAdapter wireAdapter2 = new WireAdapter(UiRewardSelectionState.ADAPTER);
        WireAdapter wireAdapter3 = new WireAdapter(UiRewardProgramDetails.BottomUpsell.ADAPTER);
        WireAdapter wireAdapter4 = new WireAdapter(AppLinks.ADAPTER);
        Reward$Adapter reward$Adapter = new Reward$Adapter();
        reward$Adapter.avatarsAdapter = wireAdapter;
        reward$Adapter.program_detail_rowsAdapter = wireRepeatedAdapter;
        reward$Adapter.boost_detail_rowsAdapter = wireRepeatedAdapter2;
        reward$Adapter.boost_attributesAdapter = wireRepeatedAdapter3;
        reward$Adapter.reward_selection_stateAdapter = wireAdapter2;
        reward$Adapter.boost_detail_bottom_upsellAdapter = wireAdapter3;
        reward$Adapter.app_linksAdapter = wireAdapter4;
        rewardAdapter = reward$Adapter;
        rewardSelectionAdapter = new BlockersConfig.Adapter(new WireAdapter(RewardSelection.ADAPTER));
        boostConfigAdapter = new Local_tab_content.Adapter(new WireAdapter(GetBoostConfigResponse.BtcBoostUpsell.ADAPTER));
        userRewardsDataAdapter = new BlockersConfig.Adapter(new WireAdapter(Money.ADAPTER));
    }
}
