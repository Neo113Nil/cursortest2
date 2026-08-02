package com.squareup.cash.clientrouting.validation;

import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* loaded from: classes6.dex */
public final class CashAppLiteRouteAllowlistProvider {
    public final ReadonlyStateFlow allowedSpecNames;

    public CashAppLiteRouteAllowlistProvider(AppConfigManager appConfigManager, CoroutineScope coroutineScope) {
        this.allowedSpecNames = FlowKt.stateIn(new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(((RealAppConfigManager) appConfigManager).cashLiteConfig(), 23), coroutineScope, SharingStarted.Companion.Eagerly, null);
    }
}
