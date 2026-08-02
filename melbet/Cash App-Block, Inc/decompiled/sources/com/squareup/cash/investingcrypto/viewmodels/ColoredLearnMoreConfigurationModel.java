package com.squareup.cash.investingcrypto.viewmodels;

import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.franklin.investing.resources.LearnMoreConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ColoredLearnMoreConfigurationModel {
    public final boolean hasBorder;
    public final LearnMoreConfiguration learnMoreConfiguration;
    public final ColorModel.Investing linkColor;
    public final LinkStyle linkStyle;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LinkStyle {
        public static final /* synthetic */ LinkStyle[] $VALUES;
        public static final LinkStyle PILL_BUTTON;
        public static final LinkStyle TEXT_BUTTON;

        static {
            LinkStyle linkStyle = new LinkStyle("PILL_BUTTON", 0);
            PILL_BUTTON = linkStyle;
            LinkStyle linkStyle2 = new LinkStyle("TEXT_BUTTON", 1);
            TEXT_BUTTON = linkStyle2;
            $VALUES = new LinkStyle[]{linkStyle, linkStyle2};
        }

        public static LinkStyle valueOf(String str) {
            return (LinkStyle) Enum.valueOf(LinkStyle.class, str);
        }

        public static LinkStyle[] values() {
            return (LinkStyle[]) $VALUES.clone();
        }
    }

    public ColoredLearnMoreConfigurationModel(LearnMoreConfiguration learnMoreConfiguration) {
        LinkStyle linkStyle = LinkStyle.TEXT_BUTTON;
        learnMoreConfiguration.getClass();
        this.linkColor = ColorModel.Investing.INSTANCE;
        this.learnMoreConfiguration = learnMoreConfiguration;
        this.linkStyle = linkStyle;
        this.hasBorder = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColoredLearnMoreConfigurationModel)) {
            return false;
        }
        ColoredLearnMoreConfigurationModel coloredLearnMoreConfigurationModel = (ColoredLearnMoreConfigurationModel) obj;
        return Intrinsics.areEqual(this.linkColor, coloredLearnMoreConfigurationModel.linkColor) && Intrinsics.areEqual(this.learnMoreConfiguration, coloredLearnMoreConfigurationModel.learnMoreConfiguration) && this.linkStyle == coloredLearnMoreConfigurationModel.linkStyle && this.hasBorder == coloredLearnMoreConfigurationModel.hasBorder;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(false) * 31;
        this.linkColor.getClass();
        return Boolean.hashCode(this.hasBorder) + ((this.linkStyle.hashCode() + ((this.learnMoreConfiguration.hashCode() + ((677591443 + hashCode) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ColoredLearnMoreConfigurationModel(isBitcoin=false, linkColor=" + this.linkColor + ", learnMoreConfiguration=" + this.learnMoreConfiguration + ", linkStyle=" + this.linkStyle + ", hasBorder=" + this.hasBorder + ")";
    }
}
