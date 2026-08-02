package com.squareup.cash.boost.backend;

import androidx.compose.ui.platform.DerivedSize;
import androidx.room.util.DBUtil;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.boost.db.RewardMerchantQueries$RewardForMerchantTokenQuery;
import com.squareup.cash.boost.db.RewardMerchantQueries$merchantNameForRewardToken$2;
import com.squareup.cash.boost.db.RewardQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.cdf.boost.AppPresentation;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.screens.Finish;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ChannelResult;

/* loaded from: classes.dex */
public final class RealBoostRepository {
    public final RealBoostProvider boostProvider;
    public final RealBoostSelector boostSelector;

    public RealBoostRepository(RealBoostProvider realBoostProvider, RealBoostSelector realBoostSelector) {
        this.boostProvider = realBoostProvider;
        this.boostSelector = realBoostSelector;
    }

    public static void selectBoost$default(RealBoostRepository realBoostRepository, Finish finish, String str, DerivedSize.Companion companion, String str2, String str3, String str4, String str5, String str6, AppPresentation appPresentation, MoneyTabUIKt$$ExternalSyntheticLambda5 moneyTabUIKt$$ExternalSyntheticLambda5, BlockersData.MoneybotContext moneybotContext, int i) {
        String str7 = (i & 8) != 0 ? null : str2;
        String str8 = (i & 32) != 0 ? null : str4;
        String str9 = (i & 64) != 0 ? null : str5;
        String str10 = (i & 128) != 0 ? null : str6;
        MoneyTabUIKt$$ExternalSyntheticLambda5 moneyTabUIKt$$ExternalSyntheticLambda52 = (i & 2048) != 0 ? null : moneyTabUIKt$$ExternalSyntheticLambda5;
        BlockersData.MoneybotContext moneybotContext2 = (i & 4096) != 0 ? null : moneybotContext;
        RealBoostSelector realBoostSelector = realBoostRepository.boostSelector;
        if (realBoostSelector.requests.mo1159trySendJP2dKIU(new RealBoostSelector$selectBoost$1(realBoostSelector, finish, str, companion, str7, str3, str8, str9, str10, appPresentation, moneyTabUIKt$$ExternalSyntheticLambda52, moneybotContext2, null)) instanceof ChannelResult.Failed) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
        }
    }

    public final void addBoostMultiSelect(String str, String str2, Function1 function1, BlockersData.MoneybotContext moneybotContext) {
        RealBoostSelector realBoostSelector = this.boostSelector;
        JobKt.launch$default(realBoostSelector.scope, realBoostSelector.ioContext, null, new AndroidSecureStore$read$2(realBoostSelector, str, str2, function1, moneybotContext, (Continuation) null), 2);
    }

    public final RealContactRepository$contacts$$inlined$map$1 getMerchantNameForReward(String str) {
        str.getClass();
        RealBoostProvider realBoostProvider = this.boostProvider;
        SessionQueries sessionQueries = realBoostProvider.rewardMerchantQueries;
        sessionQueries.getClass();
        RewardMerchantQueries$merchantNameForRewardToken$2 rewardMerchantQueries$merchantNameForRewardToken$2 = RewardMerchantQueries$merchantNameForRewardToken$2.INSTANCE;
        return new RealContactRepository$contacts$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new RewardMerchantQueries$RewardForMerchantTokenQuery(sessionQueries, str, new RewardQueries$$ExternalSyntheticLambda4())), realBoostProvider.ioDispatcher), 2);
    }

    public final FlowQuery$mapToList$$inlined$map$1 getMerchantTokensForReward(String str) {
        str.getClass();
        RealBoostProvider realBoostProvider = this.boostProvider;
        SessionQueries sessionQueries = realBoostProvider.rewardMerchantQueries;
        sessionQueries.getClass();
        return DBUtil.mapToList(DBUtil.toFlow(new RewardMerchantQueries$RewardForMerchantTokenQuery(sessionQueries, str, new RewardQueries$$ExternalSyntheticLambda4(11), (byte) 0)), realBoostProvider.ioDispatcher);
    }

    public final CardModelView$iconTexture$$inlined$map$1 getSelectedBoostTokens() {
        return new CardModelView$iconTexture$$inlined$map$1(this.boostProvider.getBoostSlots(true), 16);
    }

    public final void removeBoost(String str, String str2, Function1 function1) {
        RealBoostSelector realBoostSelector = this.boostSelector;
        JobKt.launch$default(realBoostSelector.scope, realBoostSelector.ioContext, null, new RealBoostSelector$removeBoost$1(realBoostSelector, str, str2, function1, null, 0), 2);
    }
}
