package com.squareup.cash.account.presenters.settings;

import androidx.compose.runtime.GapComposer;
import app.cash.badging.api.BadgingState;
import com.squareup.cash.account.settings.viewmodels.AccountSettingsRow;
import com.squareup.cash.bitcoin.capability.BTCxCapability;

/* loaded from: classes5.dex */
public abstract class AccountSettingsCapability extends BTCxCapability {
    public abstract AccountSettingsRow getRow(BadgingState badgingState, GapComposer gapComposer);
}
