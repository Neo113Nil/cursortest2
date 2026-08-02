package com.squareup.cash.boost.db;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final /* synthetic */ class RewardMerchantQueries$merchantNameForRewardToken$2 extends FunctionReferenceImpl implements Function1 {
    public static final RewardMerchantQueries$merchantNameForRewardToken$2 INSTANCE = new RewardMerchantQueries$merchantNameForRewardToken$2(1, MerchantNameForRewardToken.class, "<init>", "<init>(Ljava/lang/String;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new MerchantNameForRewardToken((String) obj);
    }
}
