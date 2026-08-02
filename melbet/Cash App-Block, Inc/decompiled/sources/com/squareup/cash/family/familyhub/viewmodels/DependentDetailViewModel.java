package com.squareup.cash.family.familyhub.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DependentDetailViewModel {
    public final DependentAccessControlsViewModel accessControls;
    public final BadgeName badgeName;
    public final DependentBalancesViewModel balances;
    public final String cashtag;
    public final DependentActivityEmbeddedSectionViewModel recentActivityModel;
    public final boolean showQrCodeButton;
    public final StackedAvatarViewModel.Avatar stackedAvatarViewModel;

    public DependentDetailViewModel(StackedAvatarViewModel.Avatar avatar, BadgeName badgeName, String str, DependentBalancesViewModel dependentBalancesViewModel, DependentAccessControlsViewModel dependentAccessControlsViewModel, DependentActivityEmbeddedSectionViewModel dependentActivityEmbeddedSectionViewModel, boolean z) {
        dependentBalancesViewModel.getClass();
        dependentActivityEmbeddedSectionViewModel.getClass();
        this.stackedAvatarViewModel = avatar;
        this.badgeName = badgeName;
        this.cashtag = str;
        this.balances = dependentBalancesViewModel;
        this.accessControls = dependentAccessControlsViewModel;
        this.recentActivityModel = dependentActivityEmbeddedSectionViewModel;
        this.showQrCodeButton = z;
    }

    public static void copy$default(DependentDetailViewModel dependentDetailViewModel, BadgeName badgeName, DependentBalancesViewModel dependentBalancesViewModel, DependentAccessControlsViewModel dependentAccessControlsViewModel, DependentActivityEmbeddedSectionViewModel dependentActivityEmbeddedSectionViewModel, int i) {
        StackedAvatarViewModel.Avatar avatar = (i & 1) != 0 ? dependentDetailViewModel.stackedAvatarViewModel : null;
        String str = (i & 4) != 0 ? dependentDetailViewModel.cashtag : null;
        if ((i & 8) != 0) {
            dependentBalancesViewModel = dependentDetailViewModel.balances;
        }
        DependentBalancesViewModel dependentBalancesViewModel2 = dependentBalancesViewModel;
        if ((i & 16) != 0) {
            dependentAccessControlsViewModel = dependentDetailViewModel.accessControls;
        }
        DependentAccessControlsViewModel dependentAccessControlsViewModel2 = dependentAccessControlsViewModel;
        if ((i & 32) != 0) {
            dependentActivityEmbeddedSectionViewModel = dependentDetailViewModel.recentActivityModel;
        }
        DependentActivityEmbeddedSectionViewModel dependentActivityEmbeddedSectionViewModel2 = dependentActivityEmbeddedSectionViewModel;
        boolean z = dependentDetailViewModel.showQrCodeButton;
        dependentBalancesViewModel2.getClass();
        dependentActivityEmbeddedSectionViewModel2.getClass();
        new DependentDetailViewModel(avatar, badgeName, str, dependentBalancesViewModel2, dependentAccessControlsViewModel2, dependentActivityEmbeddedSectionViewModel2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentDetailViewModel)) {
            return false;
        }
        DependentDetailViewModel dependentDetailViewModel = (DependentDetailViewModel) obj;
        return Intrinsics.areEqual(this.stackedAvatarViewModel, dependentDetailViewModel.stackedAvatarViewModel) && Intrinsics.areEqual(this.badgeName, dependentDetailViewModel.badgeName) && Intrinsics.areEqual(this.cashtag, dependentDetailViewModel.cashtag) && Intrinsics.areEqual(this.balances, dependentDetailViewModel.balances) && Intrinsics.areEqual(this.accessControls, dependentDetailViewModel.accessControls) && Intrinsics.areEqual(this.recentActivityModel, dependentDetailViewModel.recentActivityModel) && this.showQrCodeButton == dependentDetailViewModel.showQrCodeButton;
    }

    public final int hashCode() {
        StackedAvatarViewModel.Avatar avatar = this.stackedAvatarViewModel;
        int hashCode = (avatar == null ? 0 : avatar.hashCode()) * 31;
        BadgeName badgeName = this.badgeName;
        int hashCode2 = (hashCode + (badgeName == null ? 0 : badgeName.hashCode())) * 31;
        String str = this.cashtag;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.balances.balances);
        DependentAccessControlsViewModel dependentAccessControlsViewModel = this.accessControls;
        return Boolean.hashCode(this.showQrCodeButton) + ((this.recentActivityModel.hashCode() + ((m + (dependentAccessControlsViewModel != null ? dependentAccessControlsViewModel.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DependentDetailViewModel(stackedAvatarViewModel=");
        sb.append(this.stackedAvatarViewModel);
        sb.append(", badgeName=");
        sb.append(this.badgeName);
        sb.append(", cashtag=");
        sb.append(this.cashtag);
        sb.append(", balances=");
        sb.append(this.balances);
        sb.append(", accessControls=");
        sb.append(this.accessControls);
        sb.append(", recentActivityModel=");
        sb.append(this.recentActivityModel);
        sb.append(", showQrCodeButton=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showQrCodeButton, ")");
    }
}
