package com.squareup.cash.afterpayapplet.viewmodels;

import com.squareup.cash.activity.viewmodels.FullScreenActivityViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AfterpayAppletActivityListEmbeddedViewModel {
    public final FullScreenActivityViewModel activityListViewModel;
    public final FooterSection footerSection;

    public AfterpayAppletActivityListEmbeddedViewModel(FullScreenActivityViewModel fullScreenActivityViewModel, FooterSection footerSection) {
        this.activityListViewModel = fullScreenActivityViewModel;
        this.footerSection = footerSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletActivityListEmbeddedViewModel)) {
            return false;
        }
        AfterpayAppletActivityListEmbeddedViewModel afterpayAppletActivityListEmbeddedViewModel = (AfterpayAppletActivityListEmbeddedViewModel) obj;
        return this.activityListViewModel.equals(afterpayAppletActivityListEmbeddedViewModel.activityListViewModel) && Intrinsics.areEqual(this.footerSection, afterpayAppletActivityListEmbeddedViewModel.footerSection);
    }

    public final int hashCode() {
        int hashCode = this.activityListViewModel.hashCode() * 31;
        FooterSection footerSection = this.footerSection;
        return hashCode + (footerSection == null ? 0 : footerSection.hashCode());
    }

    public final String toString() {
        return "AfterpayAppletActivityListEmbeddedViewModel(activityListViewModel=" + this.activityListViewModel + ", footerSection=" + this.footerSection + ")";
    }
}
