package com.squareup.cash.account.presenters.settings;

import androidx.compose.runtime.GapComposer;
import app.cash.badging.api.BadgingState;
import com.squareup.cash.account.settings.viewmodels.AccountSettingsRow;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.stablecoin.capability.real.RealStablecoinCapabilityHelper;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class LimitsSetting extends AccountSettingsCapability {
    public final /* synthetic */ int $r8$classId;
    public final RealBitcoinCapabilityProvider bitcoinCapabilityProvider;

    public LimitsSetting(RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, RealStablecoinCapabilityHelper realStablecoinCapabilityHelper) {
        this.$r8$classId = 1;
        this.bitcoinCapabilityProvider = realBitcoinCapabilityProvider;
    }

    @Override // com.squareup.cash.bitcoin.capability.BTCxCapability
    public Object checkAdditionalIsAvailable(Continuation continuation) {
        switch (this.$r8$classId) {
            case 1:
                return Boolean.TRUE;
            default:
                return super.checkAdditionalIsAvailable(continuation);
        }
    }

    @Override // com.squareup.cash.bitcoin.capability.BTCxCapability
    public final RealBitcoinCapabilityProvider getBitcoinCapabilityProvider() {
        int i = this.$r8$classId;
        return this.bitcoinCapabilityProvider;
    }

    @Override // com.squareup.cash.account.presenters.settings.AccountSettingsCapability
    public final AccountSettingsRow getRow(BadgingState badgingState, GapComposer gapComposer) {
        int i = this.$r8$classId;
        badgingState.getClass();
        switch (i) {
            case 0:
                gapComposer.startReplaceGroup(896009668);
                AccountSettingsRow.Limits limits = new AccountSettingsRow.Limits(badgingState.limits > 0);
                gapComposer.end(false);
                return limits;
            case 1:
                gapComposer.startReplaceGroup(941268586);
                gapComposer.end(false);
                return AccountSettingsRow.Documents.INSTANCE;
            case 2:
                gapComposer.startReplaceGroup(1027621194);
                gapComposer.end(false);
                return AccountSettingsRow.Notifications.INSTANCE;
            case 3:
                gapComposer.startReplaceGroup(839546058);
                gapComposer.end(false);
                return AccountSettingsRow.Privacy.INSTANCE;
            default:
                gapComposer.startReplaceGroup(2137430680);
                AccountSettingsRow.Support support = new AccountSettingsRow.Support(badgingState.profileSupport > 0);
                gapComposer.end(false);
                return support;
        }
    }

    public /* synthetic */ LimitsSetting(RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, int i) {
        this.$r8$classId = i;
        this.bitcoinCapabilityProvider = realBitcoinCapabilityProvider;
    }
}
