package com.squareup.cash.bitcoin.viewmodels.applet.boost;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.investingcrypto.viewmodels.ColoredLearnMoreConfigurationModel;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinBoostWidgetViewModel implements BitcoinHomeWidgetViewModel {
    public final String bodyText;
    public final Image image;
    public final String imageUrl;
    public final ColoredLearnMoreConfigurationModel.LinkStyle linkStyle;
    public final String linkText;
    public final String linkUrl;
    public final String titleText;

    public BitcoinBoostWidgetViewModel(Image image, String str, String str2, String str3, String str4, String str5, ColoredLearnMoreConfigurationModel.LinkStyle linkStyle) {
        this.image = image;
        this.imageUrl = str;
        this.titleText = str2;
        this.bodyText = str3;
        this.linkText = str4;
        this.linkUrl = str5;
        this.linkStyle = linkStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinBoostWidgetViewModel)) {
            return false;
        }
        BitcoinBoostWidgetViewModel bitcoinBoostWidgetViewModel = (BitcoinBoostWidgetViewModel) obj;
        return this.image.equals(bitcoinBoostWidgetViewModel.image) && Intrinsics.areEqual(this.imageUrl, bitcoinBoostWidgetViewModel.imageUrl) && Intrinsics.areEqual(this.titleText, bitcoinBoostWidgetViewModel.titleText) && Intrinsics.areEqual(this.bodyText, bitcoinBoostWidgetViewModel.bodyText) && Intrinsics.areEqual(this.linkText, bitcoinBoostWidgetViewModel.linkText) && Intrinsics.areEqual(this.linkUrl, bitcoinBoostWidgetViewModel.linkUrl) && this.linkStyle == bitcoinBoostWidgetViewModel.linkStyle;
    }

    public final int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        String str = this.imageUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.titleText;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bodyText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.linkText;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.linkUrl;
        return this.linkStyle.hashCode() + ((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.image, "BitcoinBoostWidgetViewModel(image=", ", imageUrl=", this.imageUrl, ", titleText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.titleText, ", bodyText=", this.bodyText, ", linkText=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.linkText, ", linkUrl=", this.linkUrl, ", linkStyle=");
        m.append(this.linkStyle);
        m.append(")");
        return m.toString();
    }
}
