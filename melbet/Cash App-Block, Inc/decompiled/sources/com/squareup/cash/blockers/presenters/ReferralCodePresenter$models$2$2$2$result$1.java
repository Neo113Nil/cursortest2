package com.squareup.cash.blockers.presenters;

import app.cash.api.ApiResult;
import com.squareup.cash.blockers.analytics.BlockerResponse;
import com.squareup.protos.franklin.app.ApplyRewardCodeResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ReferralCodePresenter$models$2$2$2$result$1 implements Function1 {
    public static final ReferralCodePresenter$models$2$2$2$result$1 INSTANCE = new ReferralCodePresenter$models$2$2$2$result$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ApiResult.Success success = (ApiResult.Success) obj;
        success.getClass();
        if (Intrinsics.areEqual(((ApplyRewardCodeResponse) success.response).valid, Boolean.TRUE)) {
            return null;
        }
        return new BlockerResponse.Error((String) null, (String) null, 7);
    }
}
