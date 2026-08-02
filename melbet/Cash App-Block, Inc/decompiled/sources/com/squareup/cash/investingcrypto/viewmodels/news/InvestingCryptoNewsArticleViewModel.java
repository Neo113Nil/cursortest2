package com.squareup.cash.investingcrypto.viewmodels.news;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingCryptoNewsArticleViewModel extends InvestingCryptoNewsArticleListItem {
    public final ColorModel accentColor;
    public final Image avatar;
    public final String headline;
    public final String provider;
    public final String timestamp;
    public final String url;

    public InvestingCryptoNewsArticleViewModel(Image image, String str, String str2, String str3, String str4, ColorModel colorModel) {
        image.getClass();
        str.getClass();
        str2.getClass();
        str4.getClass();
        this.avatar = image;
        this.provider = str;
        this.headline = str2;
        this.timestamp = str3;
        this.url = str4;
        this.accentColor = colorModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingCryptoNewsArticleViewModel)) {
            return false;
        }
        InvestingCryptoNewsArticleViewModel investingCryptoNewsArticleViewModel = (InvestingCryptoNewsArticleViewModel) obj;
        return Intrinsics.areEqual(this.avatar, investingCryptoNewsArticleViewModel.avatar) && Intrinsics.areEqual(this.provider, investingCryptoNewsArticleViewModel.provider) && Intrinsics.areEqual(this.headline, investingCryptoNewsArticleViewModel.headline) && Intrinsics.areEqual(this.timestamp, investingCryptoNewsArticleViewModel.timestamp) && Intrinsics.areEqual(this.url, investingCryptoNewsArticleViewModel.url) && this.accentColor.equals(investingCryptoNewsArticleViewModel.accentColor);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.avatar.hashCode() * 31, 31, this.provider), 31, this.headline);
        String str = this.timestamp;
        return this.accentColor.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.url);
    }

    public final String toString() {
        StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.avatar, "InvestingCryptoNewsArticleViewModel(avatar=", ", provider=", this.provider, ", headline=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.headline, ", timestamp=", this.timestamp, ", url=");
        m.append(this.url);
        m.append(", accentColor=");
        m.append(this.accentColor);
        m.append(")");
        return m.toString();
    }
}
