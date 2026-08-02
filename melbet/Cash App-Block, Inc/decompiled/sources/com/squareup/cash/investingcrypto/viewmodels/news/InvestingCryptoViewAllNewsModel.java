package com.squareup.cash.investingcrypto.viewmodels.news;

import com.squareup.cash.common.viewmodels.ColorModel;

/* loaded from: classes6.dex */
public final class InvestingCryptoViewAllNewsModel extends InvestingCryptoNewsArticleListItem {
    public final ColorModel accentColor;

    public InvestingCryptoViewAllNewsModel(ColorModel colorModel) {
        this.accentColor = colorModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvestingCryptoViewAllNewsModel) && this.accentColor.equals(((InvestingCryptoViewAllNewsModel) obj).accentColor);
    }

    public final int hashCode() {
        return this.accentColor.hashCode();
    }

    public final String toString() {
        return "InvestingCryptoViewAllNewsModel(accentColor=" + this.accentColor + ")";
    }
}
