package com.squareup.cash.featureflags;

import com.squareup.cash.api.ApiResultCallAdapterFactory$get$resultType$1;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.protos.common.Money;
import java.lang.reflect.Type;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class JsonFeatureFlags$LightningWeeklyDepositLimitAmount extends FeatureFlag$JsonFeatureFlag {
    public static final JsonFeatureFlags$LightningWeeklyDepositLimitAmount INSTANCE = new JsonFeatureFlags$LightningWeeklyDepositLimitAmount(new ApiResultCallAdapterFactory$get$resultType$1(new Type[]{Money.class}, 2), new FeatureFlag$JsonFeatureFlag.Options("default", EmptyList.INSTANCE), "cashclient/crypto_weekly_lightning_deposit_limit_amount");
}
