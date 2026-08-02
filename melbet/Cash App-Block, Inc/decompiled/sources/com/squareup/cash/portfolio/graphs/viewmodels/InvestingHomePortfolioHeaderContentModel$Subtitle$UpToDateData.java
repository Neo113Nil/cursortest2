package com.squareup.cash.portfolio.graphs.viewmodels;

import androidx.compose.ui.text.style.TextIndentKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoImage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData extends TextIndentKt {
    public final ColorModel accentColor;
    public final String day;
    public final String percent;
    public final InvestingCryptoImage percentIcon;
    public final String totalAmount;

    public InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData(String str, InvestingCryptoImage investingCryptoImage, String str2, String str3, ColorModel colorModel) {
        this.totalAmount = str;
        this.percentIcon = investingCryptoImage;
        this.percent = str2;
        this.day = str3;
        this.accentColor = colorModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData)) {
            return false;
        }
        InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData = (InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData) obj;
        return Intrinsics.areEqual(this.totalAmount, investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData.totalAmount) && this.percentIcon == investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData.percentIcon && Intrinsics.areEqual(this.percent, investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData.percent) && Intrinsics.areEqual(this.day, investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData.day) && this.accentColor.equals(investingHomePortfolioHeaderContentModel$Subtitle$UpToDateData.accentColor);
    }

    public final int hashCode() {
        String str = this.totalAmount;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        InvestingCryptoImage investingCryptoImage = this.percentIcon;
        int hashCode2 = (hashCode + (investingCryptoImage == null ? 0 : investingCryptoImage.hashCode())) * 31;
        String str2 = this.percent;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.day;
        return this.accentColor.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpToDateData(totalAmount=");
        sb.append(this.totalAmount);
        sb.append(", percentIcon=");
        sb.append(this.percentIcon);
        sb.append(", percent=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.percent, ", day=", this.day, ", accentColor=");
        return SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.accentColor, ")");
    }
}
