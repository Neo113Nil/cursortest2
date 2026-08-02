package com.squareup.cash.investing.db;

import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Investing_news_article {
    public final boolean display_in_carousel;
    public final String headline;
    public final NewsKind kind;
    public final String provider;
    public final Image provider_avatar;
    public final Long published_at_millis;
    public final long saved_at_millis;
    public final String url;

    public Investing_news_article(NewsKind newsKind, String str, Image image, String str2, Long l, String str3, boolean z, long j) {
        newsKind.getClass();
        str.getClass();
        image.getClass();
        str2.getClass();
        this.kind = newsKind;
        this.provider = str;
        this.provider_avatar = image;
        this.headline = str2;
        this.published_at_millis = l;
        this.url = str3;
        this.display_in_carousel = z;
        this.saved_at_millis = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Investing_news_article)) {
            return false;
        }
        Investing_news_article investing_news_article = (Investing_news_article) obj;
        return Intrinsics.areEqual(this.kind, investing_news_article.kind) && Intrinsics.areEqual(this.provider, investing_news_article.provider) && Intrinsics.areEqual(this.provider_avatar, investing_news_article.provider_avatar) && Intrinsics.areEqual(this.headline, investing_news_article.headline) && Intrinsics.areEqual(this.published_at_millis, investing_news_article.published_at_millis) && Intrinsics.areEqual(this.url, investing_news_article.url) && this.display_in_carousel == investing_news_article.display_in_carousel && this.saved_at_millis == investing_news_article.saved_at_millis;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.provider_avatar.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.kind.hashCode() * 31, 31, this.provider)) * 31, 31, this.headline);
        Long l = this.published_at_millis;
        int hashCode = (m + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.url;
        return Long.hashCode(this.saved_at_millis) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.display_in_carousel);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Investing_news_article(kind=");
        sb.append(this.kind);
        sb.append(", provider=");
        sb.append(this.provider);
        sb.append(", provider_avatar=");
        sb.append(this.provider_avatar);
        sb.append(", headline=");
        sb.append(this.headline);
        sb.append(", published_at_millis=");
        ViewEvent$State$EnumUnboxingLocalUtility.m(this.published_at_millis, ", url=", this.url, ", display_in_carousel=", sb);
        sb.append(this.display_in_carousel);
        sb.append(", saved_at_millis=");
        sb.append(this.saved_at_millis);
        sb.append(")");
        return sb.toString();
    }
}
