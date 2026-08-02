package com.squareup.cash.moneybot.backend.api;

import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public interface MoneybotFlagsHelper {
    boolean activityListLiveRowsEnabled();

    boolean automationsHubEnabled();

    boolean canvasBackgroundEnabled();

    boolean enableMessagePinning();

    long loadingDelayMs();

    Flow moneybotEnabled();

    Flow moneybotHomeEnabled();

    boolean moneybotHomeWidgetsEnabled();

    boolean showDebugOptions();

    boolean showImageAttachmentButton();

    boolean singleResponseQuickActionBarEnabled();

    boolean slashCommandsEnabled();
}
