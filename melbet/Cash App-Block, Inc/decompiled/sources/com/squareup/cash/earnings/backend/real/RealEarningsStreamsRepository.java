package com.squareup.cash.earnings.backend.real;

import com.squareup.cash.earnings.backend.api.EarningsStreamsResult$Success;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.common.CurrencyCode;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes6.dex */
public final class RealEarningsStreamsRepository {
    public final PaychecksAppService appService;
    public final CoroutineContext ioDispatcher;

    static {
        new EarningsStreamsResult$Success(EmptyList.INSTANCE, CurrencyCode.USD);
    }

    public RealEarningsStreamsRepository(RealEarningsSyncStateRepository realEarningsSyncStateRepository, PaychecksAppService paychecksAppService, CoroutineContext coroutineContext) {
        this.appService = paychecksAppService;
        this.ioDispatcher = coroutineContext;
    }
}
