package com.squareup.cash.portfolio.graphs.viewmodels;

import androidx.compose.ui.text.style.TextIndentKt;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingHomePortfolioHeaderContentModel {
    public final Money rawBalance;
    public final TextIndentKt subtitle;
    public final String title;
    public final TitleColorType titleColorType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class TitleColorType {
        public static final /* synthetic */ TitleColorType[] $VALUES;
        public static final TitleColorType STALE;
        public static final TitleColorType UP_TO_DATE;

        static {
            TitleColorType titleColorType = new TitleColorType("UP_TO_DATE", 0);
            UP_TO_DATE = titleColorType;
            TitleColorType titleColorType2 = new TitleColorType("STALE", 1);
            STALE = titleColorType2;
            $VALUES = new TitleColorType[]{titleColorType, titleColorType2};
        }

        public static TitleColorType valueOf(String str) {
            return (TitleColorType) Enum.valueOf(TitleColorType.class, str);
        }

        public static TitleColorType[] values() {
            return (TitleColorType[]) $VALUES.clone();
        }
    }

    public InvestingHomePortfolioHeaderContentModel(String str, TitleColorType titleColorType, TextIndentKt textIndentKt, Money money) {
        str.getClass();
        this.title = str;
        this.titleColorType = titleColorType;
        this.subtitle = textIndentKt;
        this.rawBalance = money;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingHomePortfolioHeaderContentModel)) {
            return false;
        }
        InvestingHomePortfolioHeaderContentModel investingHomePortfolioHeaderContentModel = (InvestingHomePortfolioHeaderContentModel) obj;
        return Intrinsics.areEqual(this.title, investingHomePortfolioHeaderContentModel.title) && this.titleColorType == investingHomePortfolioHeaderContentModel.titleColorType && Intrinsics.areEqual(this.subtitle, investingHomePortfolioHeaderContentModel.subtitle) && Intrinsics.areEqual(this.rawBalance, investingHomePortfolioHeaderContentModel.rawBalance);
    }

    public final int hashCode() {
        int hashCode = (this.subtitle.hashCode() + ((this.titleColorType.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31;
        Money money = this.rawBalance;
        return hashCode + (money == null ? 0 : money.hashCode());
    }

    public final String toString() {
        return "InvestingHomePortfolioHeaderContentModel(title=" + this.title + ", titleColorType=" + this.titleColorType + ", subtitle=" + this.subtitle + ", rawBalance=" + this.rawBalance + ")";
    }
}
