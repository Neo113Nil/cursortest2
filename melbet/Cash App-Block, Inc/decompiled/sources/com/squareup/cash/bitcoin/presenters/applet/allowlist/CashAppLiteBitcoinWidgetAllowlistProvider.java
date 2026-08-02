package com.squareup.cash.bitcoin.presenters.applet.allowlist;

import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$$inlined$map$1;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public final class CashAppLiteBitcoinWidgetAllowlistProvider implements BitcoinWidgetAllowlistProvider {
    public final AppConfigManager appConfigManager;

    public CashAppLiteBitcoinWidgetAllowlistProvider(AppConfigManager appConfigManager) {
        this.appConfigManager = appConfigManager;
    }

    @Override // com.squareup.cash.bitcoin.presenters.applet.allowlist.BitcoinWidgetAllowlistProvider
    public final Flow allowedWidgets() {
        return new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(((RealAppConfigManager) this.appConfigManager).cashLiteConfig(), this, 28);
    }
}
