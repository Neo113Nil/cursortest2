package com.squareup.cash.merchant.viewmodels;

import com.squareup.cash.loadable.Loadable;

/* loaded from: classes6.dex */
public final class MerchantProfileContentViewModel {
    public final Loadable body;
    public final MerchantHeaderViewModel header;

    public MerchantProfileContentViewModel(MerchantHeaderViewModel merchantHeaderViewModel, Loadable loadable) {
        this.header = merchantHeaderViewModel;
        this.body = loadable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantProfileContentViewModel)) {
            return false;
        }
        MerchantProfileContentViewModel merchantProfileContentViewModel = (MerchantProfileContentViewModel) obj;
        return this.header.equals(merchantProfileContentViewModel.header) && this.body.equals(merchantProfileContentViewModel.body);
    }

    public final int hashCode() {
        return this.body.hashCode() + (this.header.hashCode() * 31);
    }

    public final String toString() {
        return "MerchantProfileContentViewModel(header=" + this.header + ", body=" + this.body + ")";
    }
}
