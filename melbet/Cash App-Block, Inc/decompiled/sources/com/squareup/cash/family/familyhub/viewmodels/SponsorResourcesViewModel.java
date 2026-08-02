package com.squareup.cash.family.familyhub.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SponsorResourcesViewModel {
    public final SponsorResourcesSectionViewModel resourcesSection;
    public final String toolbarTitle;

    public SponsorResourcesViewModel(String str, SponsorResourcesSectionViewModel sponsorResourcesSectionViewModel) {
        str.getClass();
        this.toolbarTitle = str;
        this.resourcesSection = sponsorResourcesSectionViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsorResourcesViewModel)) {
            return false;
        }
        SponsorResourcesViewModel sponsorResourcesViewModel = (SponsorResourcesViewModel) obj;
        return Intrinsics.areEqual(this.toolbarTitle, sponsorResourcesViewModel.toolbarTitle) && this.resourcesSection.equals(sponsorResourcesViewModel.resourcesSection);
    }

    public final int hashCode() {
        return (this.resourcesSection.hashCode() + (this.toolbarTitle.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "SponsorResourcesViewModel(toolbarTitle=" + this.toolbarTitle + ", resourcesSection=" + this.resourcesSection + ", accountClosureSection=null)";
    }
}
