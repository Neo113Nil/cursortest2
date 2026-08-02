package com.squareup.cash.investingcrypto.presenters.news;

import com.squareup.cash.common.viewmodels.ColorModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingCryptoNewsPresenter$NewsKindDetails {
    public final ColorModel accentColor;
    public final String title;

    public InvestingCryptoNewsPresenter$NewsKindDetails(String str, ColorModel colorModel) {
        str.getClass();
        this.title = str;
        this.accentColor = colorModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingCryptoNewsPresenter$NewsKindDetails)) {
            return false;
        }
        InvestingCryptoNewsPresenter$NewsKindDetails investingCryptoNewsPresenter$NewsKindDetails = (InvestingCryptoNewsPresenter$NewsKindDetails) obj;
        return Intrinsics.areEqual(this.title, investingCryptoNewsPresenter$NewsKindDetails.title) && this.accentColor.equals(investingCryptoNewsPresenter$NewsKindDetails.accentColor);
    }

    public final int hashCode() {
        return this.accentColor.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return "NewsKindDetails(title=" + this.title + ", accentColor=" + this.accentColor + ")";
    }
}
