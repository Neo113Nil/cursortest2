package com.squareup.cash.portfolio.graphs.viewmodels;

import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.investing.viewmodels.StockMetric;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes6.dex */
public final class InvestingStockDetailsHeaderViewModel {
    public final ColorModel accentColor;
    public final boolean animateMetricDiff;
    public final LinkScanner avatar;
    public final StockMetric metric;
    public final Subtitle subtitle;
    public final String title;

    public final class Subtitle {
        public final ColorType colorType;
        public final String detail;
        public final String detailDescription;
        public final InvestingCryptoAvatarContentModel$Icon detailIcon;
        public final String subdetail;
        public final InvestingCryptoAvatarContentModel$Icon subdetailIcon;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class ColorType {
            public static final /* synthetic */ ColorType[] $VALUES;
            public static final ColorType ACCENT_COLOR;
            public static final ColorType PRE_IPO;
            public static final ColorType STALE_DATA;

            static {
                ColorType colorType = new ColorType("ACCENT_COLOR", 0);
                ACCENT_COLOR = colorType;
                ColorType colorType2 = new ColorType("STALE_DATA", 1);
                STALE_DATA = colorType2;
                ColorType colorType3 = new ColorType("PRE_IPO", 2);
                PRE_IPO = colorType3;
                $VALUES = new ColorType[]{colorType, colorType2, colorType3};
            }

            public static ColorType valueOf(String str) {
                return (ColorType) Enum.valueOf(ColorType.class, str);
            }

            public static ColorType[] values() {
                return (ColorType[]) $VALUES.clone();
            }
        }

        public Subtitle(InvestingCryptoAvatarContentModel$Icon investingCryptoAvatarContentModel$Icon, String str, String str2, InvestingCryptoAvatarContentModel$Icon investingCryptoAvatarContentModel$Icon2, String str3, ColorType colorType) {
            str.getClass();
            str2.getClass();
            this.detailIcon = investingCryptoAvatarContentModel$Icon;
            this.detail = str;
            this.detailDescription = str2;
            this.subdetailIcon = investingCryptoAvatarContentModel$Icon2;
            this.subdetail = str3;
            this.colorType = colorType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subtitle)) {
                return false;
            }
            Subtitle subtitle = (Subtitle) obj;
            return Intrinsics.areEqual(this.detailIcon, subtitle.detailIcon) && Intrinsics.areEqual(this.detail, subtitle.detail) && Intrinsics.areEqual(this.detailDescription, subtitle.detailDescription) && Intrinsics.areEqual(this.subdetailIcon, subtitle.subdetailIcon) && Intrinsics.areEqual(this.subdetail, subtitle.subdetail) && this.colorType == subtitle.colorType;
        }

        public final int hashCode() {
            InvestingCryptoAvatarContentModel$Icon investingCryptoAvatarContentModel$Icon = this.detailIcon;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((investingCryptoAvatarContentModel$Icon == null ? 0 : investingCryptoAvatarContentModel$Icon.image.hashCode()) * 31, 31, this.detail), 31, this.detailDescription);
            InvestingCryptoAvatarContentModel$Icon investingCryptoAvatarContentModel$Icon2 = this.subdetailIcon;
            int hashCode = (m + (investingCryptoAvatarContentModel$Icon2 == null ? 0 : investingCryptoAvatarContentModel$Icon2.image.hashCode())) * 31;
            String str = this.subdetail;
            return this.colorType.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Subtitle(detailIcon=" + this.detailIcon + ", detail=" + this.detail + ", detailDescription=" + this.detailDescription + ", subdetailIcon=" + this.subdetailIcon + ", subdetail=" + this.subdetail + ", colorType=" + this.colorType + ")";
        }
    }

    public InvestingStockDetailsHeaderViewModel(LinkScanner linkScanner, String str, Subtitle subtitle, ColorModel colorModel, StockMetric stockMetric, boolean z) {
        str.getClass();
        colorModel.getClass();
        this.avatar = linkScanner;
        this.title = str;
        this.subtitle = subtitle;
        this.accentColor = colorModel;
        this.metric = stockMetric;
        this.animateMetricDiff = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingStockDetailsHeaderViewModel)) {
            return false;
        }
        InvestingStockDetailsHeaderViewModel investingStockDetailsHeaderViewModel = (InvestingStockDetailsHeaderViewModel) obj;
        return Intrinsics.areEqual(this.avatar, investingStockDetailsHeaderViewModel.avatar) && Intrinsics.areEqual(this.title, investingStockDetailsHeaderViewModel.title) && Intrinsics.areEqual(this.subtitle, investingStockDetailsHeaderViewModel.subtitle) && Intrinsics.areEqual(this.accentColor, investingStockDetailsHeaderViewModel.accentColor) && Intrinsics.areEqual(this.metric, investingStockDetailsHeaderViewModel.metric) && this.animateMetricDiff == investingStockDetailsHeaderViewModel.animateMetricDiff;
    }

    public final int hashCode() {
        LinkScanner linkScanner = this.avatar;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((linkScanner == null ? 0 : linkScanner.hashCode()) * 31, 31, this.title);
        Subtitle subtitle = this.subtitle;
        int hashCode = (this.accentColor.hashCode() + ((m + (subtitle == null ? 0 : subtitle.hashCode())) * 31)) * 31;
        StockMetric stockMetric = this.metric;
        return Boolean.hashCode(this.animateMetricDiff) + ((hashCode + (stockMetric != null ? stockMetric.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "InvestingStockDetailsHeaderViewModel(avatar=" + this.avatar + ", title=" + this.title + ", subtitle=" + this.subtitle + ", accentColor=" + this.accentColor + ", metric=" + this.metric + ", animateMetricDiff=" + this.animateMetricDiff + ")";
    }
}
