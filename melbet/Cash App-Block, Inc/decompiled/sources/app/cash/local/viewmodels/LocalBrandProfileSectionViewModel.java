package app.cash.local.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalBrandProfileSectionViewModel {
    public final LocalBrandProfileSectionContent content;
    public final String title;

    public LocalBrandProfileSectionViewModel(String str, LocalBrandProfileSectionContent localBrandProfileSectionContent) {
        this.title = str;
        this.content = localBrandProfileSectionContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalBrandProfileSectionViewModel)) {
            return false;
        }
        LocalBrandProfileSectionViewModel localBrandProfileSectionViewModel = (LocalBrandProfileSectionViewModel) obj;
        return Intrinsics.areEqual(this.title, localBrandProfileSectionViewModel.title) && this.content.equals(localBrandProfileSectionViewModel.content);
    }

    public final int hashCode() {
        String str = this.title;
        return this.content.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "LocalBrandProfileSectionViewModel(title=" + this.title + ", content=" + this.content + ")";
    }
}
