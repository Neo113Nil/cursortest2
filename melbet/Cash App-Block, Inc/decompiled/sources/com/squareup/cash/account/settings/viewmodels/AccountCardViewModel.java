package com.squareup.cash.account.settings.viewmodels;

import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.data.profile.Badge;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AccountCardViewModel {
    public final AccountAvatarViewModel avatar;
    public final Badge badge;
    public final String cashtag;
    public final String name;
    public final UiCallbackModel profileUpsells;
    public final AccountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel rewardStatusRow;
    public final boolean showAddQrToHomeScreenButton;
    public final boolean showPhotoToDo;

    public AccountCardViewModel(String str, String str2, Badge badge, AccountAvatarViewModel accountAvatarViewModel, boolean z, UiCallbackModel uiCallbackModel, AccountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel, boolean z2) {
        this.name = str;
        this.cashtag = str2;
        this.badge = badge;
        this.avatar = accountAvatarViewModel;
        this.showPhotoToDo = z;
        this.profileUpsells = uiCallbackModel;
        this.rewardStatusRow = accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel;
        this.showAddQrToHomeScreenButton = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountCardViewModel)) {
            return false;
        }
        AccountCardViewModel accountCardViewModel = (AccountCardViewModel) obj;
        return this.name.equals(accountCardViewModel.name) && this.cashtag.equals(accountCardViewModel.cashtag) && this.badge == accountCardViewModel.badge && this.avatar.equals(accountCardViewModel.avatar) && this.showPhotoToDo == accountCardViewModel.showPhotoToDo && this.profileUpsells.equals(accountCardViewModel.profileUpsells) && Intrinsics.areEqual(this.rewardStatusRow, accountCardViewModel.rewardStatusRow) && this.showAddQrToHomeScreenButton == accountCardViewModel.showAddQrToHomeScreenButton;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.cashtag);
        Badge badge = this.badge;
        int hashCode = (this.profileUpsells.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.avatar.hashCode() + ((m + (badge == null ? 0 : badge.hashCode())) * 31)) * 31, 31, this.showPhotoToDo), 31, true)) * 31;
        AccountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel = this.rewardStatusRow;
        return Boolean.hashCode(this.showAddQrToHomeScreenButton) + ((hashCode + (accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel != null ? accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountCardViewModel(name=", this.name, ", cashtag=", this.cashtag, ", badge=");
        m.append(this.badge);
        m.append(", avatar=");
        m.append(this.avatar);
        m.append(", showPhotoToDo=");
        m.append(this.showPhotoToDo);
        m.append(", showShareButton=true, profileUpsells=");
        m.append(this.profileUpsells);
        m.append(", rewardStatusRow=");
        m.append(this.rewardStatusRow);
        m.append(", showAddQrToHomeScreenButton=");
        m.append(this.showAddQrToHomeScreenButton);
        m.append(")");
        return m.toString();
    }
}
