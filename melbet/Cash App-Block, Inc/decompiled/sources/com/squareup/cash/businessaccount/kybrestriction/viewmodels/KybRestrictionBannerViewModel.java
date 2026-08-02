package com.squareup.cash.businessaccount.kybrestriction.viewmodels;

import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;

/* loaded from: classes5.dex */
public final class KybRestrictionBannerViewModel {
    public final KybEligibilityWarning.BannerDetail bannerDetail;

    public KybRestrictionBannerViewModel(KybEligibilityWarning.BannerDetail bannerDetail) {
        this.bannerDetail = bannerDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KybRestrictionBannerViewModel) && this.bannerDetail.equals(((KybRestrictionBannerViewModel) obj).bannerDetail);
    }

    public final int hashCode() {
        return this.bannerDetail.hashCode();
    }

    public final String toString() {
        return "KybRestrictionBannerViewModel(bannerDetail=" + this.bannerDetail + ")";
    }
}
