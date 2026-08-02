package com.squareup.cash.offers.presenters;

import app.cash.local.db.LocalTabContentQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class RealOffersPopupMessageDismisser {
    public final CoroutineContext ioContext;
    public final LocalTabContentQueries popupMessageQueries;
    public final CoroutineScope scope;
    public final AppMessageClientService service;

    public RealOffersPopupMessageDismisser(CashAccountDatabaseImpl cashAccountDatabaseImpl, AppMessageClientService appMessageClientService, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.service = appMessageClientService;
        this.scope = coroutineScope;
        this.ioContext = coroutineContext;
        this.popupMessageQueries = cashAccountDatabaseImpl.popupMessageQueries;
    }
}
