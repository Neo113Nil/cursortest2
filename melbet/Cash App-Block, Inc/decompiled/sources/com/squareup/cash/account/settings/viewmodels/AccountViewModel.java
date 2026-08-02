package com.squareup.cash.account.settings.viewmodels;

import android.graphics.Bitmap;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AccountViewModel {
    public final AccountFooterViewModel accountFooterViewModel;
    public final AccountInviteButton accountInviteButton;
    public final AccountCardViewModel headerViewModel;
    public final Bitmap qrCodeBitmap;
    public final boolean qrCodeError;
    public final SecurityHubRow securityHubRow;
    public final AccountSettingsViewModel settingsViewModel;
    public final boolean showQrCode;

    public AccountViewModel(AccountCardViewModel accountCardViewModel, AccountSettingsViewModel accountSettingsViewModel, AccountInviteButton accountInviteButton, SecurityHubRow securityHubRow, AccountFooterViewModel accountFooterViewModel, Bitmap bitmap, boolean z, boolean z2) {
        accountInviteButton.getClass();
        this.headerViewModel = accountCardViewModel;
        this.settingsViewModel = accountSettingsViewModel;
        this.accountInviteButton = accountInviteButton;
        this.securityHubRow = securityHubRow;
        this.accountFooterViewModel = accountFooterViewModel;
        this.qrCodeBitmap = bitmap;
        this.showQrCode = z;
        this.qrCodeError = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountViewModel)) {
            return false;
        }
        AccountViewModel accountViewModel = (AccountViewModel) obj;
        AccountStatusViewModel$AccountStatusOk accountStatusViewModel$AccountStatusOk = AccountStatusViewModel$AccountStatusOk.INSTANCE;
        return accountStatusViewModel$AccountStatusOk.equals(accountStatusViewModel$AccountStatusOk) && this.headerViewModel.equals(accountViewModel.headerViewModel) && this.settingsViewModel.equals(accountViewModel.settingsViewModel) && Intrinsics.areEqual(this.accountInviteButton, accountViewModel.accountInviteButton) && this.securityHubRow.equals(accountViewModel.securityHubRow) && this.accountFooterViewModel.equals(accountViewModel.accountFooterViewModel) && Intrinsics.areEqual(this.qrCodeBitmap, accountViewModel.qrCodeBitmap) && this.showQrCode == accountViewModel.showQrCode && this.qrCodeError == accountViewModel.qrCodeError;
    }

    public final int hashCode() {
        int hashCode = (this.accountFooterViewModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.accountInviteButton.hashCode() + ((this.settingsViewModel.hashCode() + ((this.headerViewModel.hashCode() - 1923450937) * 31)) * 31)) * 31, 31, this.securityHubRow.isVisible)) * 31;
        Bitmap bitmap = this.qrCodeBitmap;
        return Boolean.hashCode(this.qrCodeError) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31, this.showQrCode);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountViewModel(accountStatusViewModel=");
        sb.append(AccountStatusViewModel$AccountStatusOk.INSTANCE);
        sb.append(", headerViewModel=");
        sb.append(this.headerViewModel);
        sb.append(", settingsViewModel=");
        sb.append(this.settingsViewModel);
        sb.append(", accountInviteButton=");
        sb.append(this.accountInviteButton);
        sb.append(", securityHubRow=");
        sb.append(this.securityHubRow);
        sb.append(", accountFooterViewModel=");
        sb.append(this.accountFooterViewModel);
        sb.append(", qrCodeBitmap=");
        sb.append(this.qrCodeBitmap);
        sb.append(", showQrCode=");
        sb.append(this.showQrCode);
        sb.append(", qrCodeError=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.qrCodeError, ")");
    }
}
