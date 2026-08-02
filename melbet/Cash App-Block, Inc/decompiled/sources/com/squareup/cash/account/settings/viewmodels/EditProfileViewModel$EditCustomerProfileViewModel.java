package com.squareup.cash.account.settings.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.profile.viewmodels.ProfileViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class EditProfileViewModel$EditCustomerProfileViewModel {
    public final AccountAvatarViewModel avatar;
    public final String basicInfoDescription;
    public final BusinessUpgradeModel businessUpgradeModel;
    public final boolean canEditPhoto;
    public final String cashtag;
    public final String cashtagSymbol;
    public final EditProfileViewModel$DialogModel dialogModel;
    public final String fullname;
    public final boolean isBusiness;
    public final boolean isManagedAccount;
    public final ProfileViewModel previewModel;
    public final List previewTrustIndicators;
    public final ViewMode viewMode;

    public final class BusinessUpgradeModel {
        public final String buttonText;
        public final boolean showBusinessName;

        public BusinessUpgradeModel(String str, boolean z) {
            str.getClass();
            this.buttonText = str;
            this.showBusinessName = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BusinessUpgradeModel)) {
                return false;
            }
            BusinessUpgradeModel businessUpgradeModel = (BusinessUpgradeModel) obj;
            return Intrinsics.areEqual(this.buttonText, businessUpgradeModel.buttonText) && this.showBusinessName == businessUpgradeModel.showBusinessName;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showBusinessName) + (this.buttonText.hashCode() * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("BusinessUpgradeModel(buttonText=", this.buttonText, ", showBusinessName=", ")", this.showBusinessName);
        }
    }

    public EditProfileViewModel$EditCustomerProfileViewModel(String str, String str2, String str3, AccountAvatarViewModel accountAvatarViewModel, boolean z, boolean z2, boolean z3, BusinessUpgradeModel businessUpgradeModel, String str4, ProfileViewModel profileViewModel, ListBuilder listBuilder, ViewMode viewMode, EditProfileViewModel$DialogModel editProfileViewModel$DialogModel) {
        str4.getClass();
        listBuilder.getClass();
        viewMode.getClass();
        this.fullname = str;
        this.cashtag = str2;
        this.cashtagSymbol = str3;
        this.avatar = accountAvatarViewModel;
        this.canEditPhoto = z;
        this.isManagedAccount = z2;
        this.isBusiness = z3;
        this.businessUpgradeModel = businessUpgradeModel;
        this.basicInfoDescription = str4;
        this.previewModel = profileViewModel;
        this.previewTrustIndicators = listBuilder;
        this.viewMode = viewMode;
        this.dialogModel = editProfileViewModel$DialogModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditProfileViewModel$EditCustomerProfileViewModel)) {
            return false;
        }
        EditProfileViewModel$EditCustomerProfileViewModel editProfileViewModel$EditCustomerProfileViewModel = (EditProfileViewModel$EditCustomerProfileViewModel) obj;
        return Intrinsics.areEqual(this.fullname, editProfileViewModel$EditCustomerProfileViewModel.fullname) && Intrinsics.areEqual(this.cashtag, editProfileViewModel$EditCustomerProfileViewModel.cashtag) && this.cashtagSymbol.equals(editProfileViewModel$EditCustomerProfileViewModel.cashtagSymbol) && this.avatar.equals(editProfileViewModel$EditCustomerProfileViewModel.avatar) && this.canEditPhoto == editProfileViewModel$EditCustomerProfileViewModel.canEditPhoto && this.isManagedAccount == editProfileViewModel$EditCustomerProfileViewModel.isManagedAccount && this.isBusiness == editProfileViewModel$EditCustomerProfileViewModel.isBusiness && Intrinsics.areEqual(this.businessUpgradeModel, editProfileViewModel$EditCustomerProfileViewModel.businessUpgradeModel) && Intrinsics.areEqual(this.basicInfoDescription, editProfileViewModel$EditCustomerProfileViewModel.basicInfoDescription) && this.previewModel.equals(editProfileViewModel$EditCustomerProfileViewModel.previewModel) && Intrinsics.areEqual(this.previewTrustIndicators, editProfileViewModel$EditCustomerProfileViewModel.previewTrustIndicators) && this.viewMode == editProfileViewModel$EditCustomerProfileViewModel.viewMode && Intrinsics.areEqual(this.dialogModel, editProfileViewModel$EditCustomerProfileViewModel.dialogModel);
    }

    public final int hashCode() {
        String str = this.fullname;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cashtag;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.avatar.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.cashtagSymbol)) * 31, 31, this.canEditPhoto), 31, this.isManagedAccount), 31, this.isBusiness);
        BusinessUpgradeModel businessUpgradeModel = this.businessUpgradeModel;
        int hashCode2 = (this.viewMode.hashCode() + Recorder$$ExternalSyntheticOutline2.m((this.previewModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (businessUpgradeModel == null ? 0 : businessUpgradeModel.hashCode())) * 31, 31, this.basicInfoDescription)) * 31, 31, this.previewTrustIndicators)) * 31;
        EditProfileViewModel$DialogModel editProfileViewModel$DialogModel = this.dialogModel;
        return hashCode2 + (editProfileViewModel$DialogModel != null ? editProfileViewModel$DialogModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EditCustomerProfileViewModel(fullname=", this.fullname, ", cashtag=", this.cashtag, ", cashtagSymbol=");
        m.append(this.cashtagSymbol);
        m.append(", avatar=");
        m.append(this.avatar);
        m.append(", canEditPhoto=");
        re$$ExternalSyntheticOutline0.m(m, this.canEditPhoto, ", isManagedAccount=", this.isManagedAccount, ", isBusiness=");
        m.append(this.isBusiness);
        m.append(", businessUpgradeModel=");
        m.append(this.businessUpgradeModel);
        m.append(", basicInfoDescription=");
        m.append(this.basicInfoDescription);
        m.append(", previewModel=");
        m.append(this.previewModel);
        m.append(", previewTrustIndicators=");
        m.append(this.previewTrustIndicators);
        m.append(", viewMode=");
        m.append(this.viewMode);
        m.append(", dialogModel=");
        m.append(this.dialogModel);
        m.append(")");
        return m.toString();
    }
}
