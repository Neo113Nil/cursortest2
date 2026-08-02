package com.squareup.cash.securityhub.viewmodels;

import com.squareup.cash.securityhub.screens.BookletId;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BookletSummary {
    public final BookletId id;
    public final String imageUrl;
    public final String subtitle;
    public final String title;

    public BookletSummary(BookletId bookletId, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.id = bookletId;
        this.title = str;
        this.subtitle = str2;
        this.imageUrl = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookletSummary)) {
            return false;
        }
        BookletSummary bookletSummary = (BookletSummary) obj;
        return this.id == bookletSummary.id && Intrinsics.areEqual(this.title, bookletSummary.title) && Intrinsics.areEqual(this.subtitle, bookletSummary.subtitle) && Intrinsics.areEqual(this.imageUrl, bookletSummary.imageUrl);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title), 31, this.subtitle);
        String str = this.imageUrl;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookletSummary(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.subtitle, ", imageUrl=", this.imageUrl, ")");
    }
}
