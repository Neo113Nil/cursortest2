package com.squareup.cash.earnings.backend.real;

import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes6.dex */
public final class RealPayerRepository {
    public final PaychecksAppService appService;
    public final CoroutineContext ioDispatcher;

    public RealPayerRepository(PaychecksAppService paychecksAppService, CoroutineContext coroutineContext) {
        this.appService = paychecksAppService;
        this.ioDispatcher = coroutineContext;
    }
}
