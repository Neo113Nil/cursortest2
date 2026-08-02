package com.squareup.cash.moneybot.backend.real;

import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class LiteMoneybotFlagsHelper implements MoneybotFlagsHelper {
    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final boolean activityListLiveRowsEnabled() {
        return false;
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final boolean automationsHubEnabled() {
        return false;
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final boolean canvasBackgroundEnabled() {
        return false;
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final boolean enableMessagePinning() {
        return false;
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final long loadingDelayMs() {
        return 0L;
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final Flow moneybotEnabled() {
        return new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19);
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final Flow moneybotHomeEnabled() {
        return new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19);
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final boolean moneybotHomeWidgetsEnabled() {
        return false;
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final boolean showDebugOptions() {
        return false;
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final boolean showImageAttachmentButton() {
        return false;
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final boolean singleResponseQuickActionBarEnabled() {
        return false;
    }

    @Override // com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper
    public final boolean slashCommandsEnabled() {
        return false;
    }
}
