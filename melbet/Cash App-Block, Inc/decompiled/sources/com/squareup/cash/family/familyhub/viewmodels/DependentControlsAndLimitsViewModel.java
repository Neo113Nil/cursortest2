package com.squareup.cash.family.familyhub.viewmodels;

import com.google.android.libraries.places.api.model.zzco;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DependentControlsAndLimitsViewModel {
    public final zzco bitcoinInvestingStatus;
    public final zzco cardControl;
    public final DependentControlsAndLimitsFooterViewModel footer;
    public final boolean isP2pAllowlistEnabled;
    public final zzco paymentsControl;
    public final DependentControlsAndLimitsPrivacySectionModel privacySection;
    public final zzco promotionsStatus;
    public final zzco stockInvestingStatus;
    public final String subtitle;
    public final String title;
    public final String toolbarTitle;

    public DependentControlsAndLimitsViewModel(String str, String str2, String str3, zzco zzcoVar, zzco zzcoVar2, zzco zzcoVar3, zzco zzcoVar4, zzco zzcoVar5, DependentControlsAndLimitsPrivacySectionModel dependentControlsAndLimitsPrivacySectionModel, DependentControlsAndLimitsFooterViewModel dependentControlsAndLimitsFooterViewModel, boolean z) {
        str.getClass();
        str2.getClass();
        this.toolbarTitle = str;
        this.title = str2;
        this.subtitle = str3;
        this.paymentsControl = zzcoVar;
        this.cardControl = zzcoVar2;
        this.stockInvestingStatus = zzcoVar3;
        this.bitcoinInvestingStatus = zzcoVar4;
        this.promotionsStatus = zzcoVar5;
        this.privacySection = dependentControlsAndLimitsPrivacySectionModel;
        this.footer = dependentControlsAndLimitsFooterViewModel;
        this.isP2pAllowlistEnabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentControlsAndLimitsViewModel)) {
            return false;
        }
        DependentControlsAndLimitsViewModel dependentControlsAndLimitsViewModel = (DependentControlsAndLimitsViewModel) obj;
        return Intrinsics.areEqual(this.toolbarTitle, dependentControlsAndLimitsViewModel.toolbarTitle) && Intrinsics.areEqual(this.title, dependentControlsAndLimitsViewModel.title) && Intrinsics.areEqual(this.subtitle, dependentControlsAndLimitsViewModel.subtitle) && this.paymentsControl.equals(dependentControlsAndLimitsViewModel.paymentsControl) && this.cardControl.equals(dependentControlsAndLimitsViewModel.cardControl) && Intrinsics.areEqual(this.stockInvestingStatus, dependentControlsAndLimitsViewModel.stockInvestingStatus) && Intrinsics.areEqual(this.bitcoinInvestingStatus, dependentControlsAndLimitsViewModel.bitcoinInvestingStatus) && this.promotionsStatus.equals(dependentControlsAndLimitsViewModel.promotionsStatus) && Intrinsics.areEqual(this.privacySection, dependentControlsAndLimitsViewModel.privacySection) && this.footer.equals(dependentControlsAndLimitsViewModel.footer) && this.isP2pAllowlistEnabled == dependentControlsAndLimitsViewModel.isP2pAllowlistEnabled;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.toolbarTitle.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int hashCode = (this.cardControl.hashCode() + ((this.paymentsControl.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        zzco zzcoVar = this.stockInvestingStatus;
        int hashCode2 = (hashCode + (zzcoVar == null ? 0 : zzcoVar.hashCode())) * 31;
        zzco zzcoVar2 = this.bitcoinInvestingStatus;
        int hashCode3 = (this.promotionsStatus.hashCode() + ((hashCode2 + (zzcoVar2 == null ? 0 : zzcoVar2.hashCode())) * 31)) * 31;
        DependentControlsAndLimitsPrivacySectionModel dependentControlsAndLimitsPrivacySectionModel = this.privacySection;
        int hashCode4 = dependentControlsAndLimitsPrivacySectionModel != null ? dependentControlsAndLimitsPrivacySectionModel.hashCode() : 0;
        return Boolean.hashCode(this.isP2pAllowlistEnabled) + ((this.footer.hashCode() + ((hashCode3 + hashCode4) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DependentControlsAndLimitsViewModel(toolbarTitle=", this.toolbarTitle, ", title=", this.title, ", subtitle=");
        m.append(this.subtitle);
        m.append(", paymentsControl=");
        m.append(this.paymentsControl);
        m.append(", cardControl=");
        m.append(this.cardControl);
        m.append(", stockInvestingStatus=");
        m.append(this.stockInvestingStatus);
        m.append(", bitcoinInvestingStatus=");
        m.append(this.bitcoinInvestingStatus);
        m.append(", promotionsStatus=");
        m.append(this.promotionsStatus);
        m.append(", privacySection=");
        m.append(this.privacySection);
        m.append(", footer=");
        m.append(this.footer);
        m.append(", isP2pAllowlistEnabled=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isP2pAllowlistEnabled, ")");
    }
}
