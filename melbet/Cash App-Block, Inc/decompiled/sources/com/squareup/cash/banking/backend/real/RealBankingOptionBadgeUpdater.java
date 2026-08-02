package com.squareup.cash.banking.backend.real;

import com.squareup.cash.tax.views.TaxWebAppView;
import com.squareup.protos.cash.unicorn.service.UnicornService;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import papa.PapaEvent;

/* loaded from: classes7.dex */
public final class RealBankingOptionBadgeUpdater {
    public final UnicornService appService;
    public final BufferedChannel optionIds = PapaEvent.Channel$default(25, null, null, 6);

    public RealBankingOptionBadgeUpdater(UnicornService unicornService, CoroutineScope coroutineScope) {
        this.appService = unicornService;
        JobKt.launch$default(coroutineScope, null, null, new TaxWebAppView.AnonymousClass1(this, null, 1), 3);
    }
}
