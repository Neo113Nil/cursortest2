package com.squareup.cash.securityhub.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BookletFeatureCardViewModel {
    public final String body;
    public final BookletFeatureCardId id;
    public final String imageUrl;
    public final BookletFeatureCardLinkViewModel link;
    public final String title;

    public BookletFeatureCardViewModel(BookletFeatureCardId bookletFeatureCardId, String str, String str2, String str3, BookletFeatureCardLinkViewModel bookletFeatureCardLinkViewModel) {
        bookletFeatureCardId.getClass();
        str.getClass();
        str2.getClass();
        this.id = bookletFeatureCardId;
        this.title = str;
        this.body = str2;
        this.imageUrl = str3;
        this.link = bookletFeatureCardLinkViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookletFeatureCardViewModel)) {
            return false;
        }
        BookletFeatureCardViewModel bookletFeatureCardViewModel = (BookletFeatureCardViewModel) obj;
        return this.id == bookletFeatureCardViewModel.id && Intrinsics.areEqual(this.title, bookletFeatureCardViewModel.title) && Intrinsics.areEqual(this.body, bookletFeatureCardViewModel.body) && Intrinsics.areEqual(this.imageUrl, bookletFeatureCardViewModel.imageUrl) && Intrinsics.areEqual(this.link, bookletFeatureCardViewModel.link);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title), 31, this.body);
        String str = this.imageUrl;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        BookletFeatureCardLinkViewModel bookletFeatureCardLinkViewModel = this.link;
        return hashCode + (bookletFeatureCardLinkViewModel != null ? bookletFeatureCardLinkViewModel.text.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookletFeatureCardViewModel(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", body=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.body, ", imageUrl=", this.imageUrl, ", link=");
        sb.append(this.link);
        sb.append(")");
        return sb.toString();
    }
}
