package com.squareup.cash.boost.db;

import com.squareup.protos.common.Money;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final /* synthetic */ class UserRewardsDataQueries$userRewardsData$2 extends FunctionReferenceImpl implements Function3 {
    public static final UserRewardsDataQueries$userRewardsData$2 INSTANCE = new UserRewardsDataQueries$userRewardsData$2(3, UserRewardsData.class, "<init>", "<init>(ZZLcom/squareup/protos/common/Money;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new UserRewardsData(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Money) obj3);
    }
}
