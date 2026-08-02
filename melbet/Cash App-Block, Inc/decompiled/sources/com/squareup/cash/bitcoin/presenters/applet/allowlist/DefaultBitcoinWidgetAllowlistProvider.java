package com.squareup.cash.bitcoin.presenters.applet.allowlist;

import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.bitcoin.viewmodels.applet.widget.BitcoinWidget;
import dev.zacsweers.metro.internal.Factory;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public final class DefaultBitcoinWidgetAllowlistProvider implements BitcoinWidgetAllowlistProvider {

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new DefaultBitcoinWidgetAllowlistProvider();
        }
    }

    @Override // com.squareup.cash.bitcoin.presenters.applet.allowlist.BitcoinWidgetAllowlistProvider
    public final Flow allowedWidgets() {
        return new AppLockMonitor$special$$inlined$map$2(CollectionsKt.toSet(BitcoinWidget.$ENTRIES), 19);
    }
}
