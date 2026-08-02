package com.squareup.cash.account.settings.viewmodels.documents;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AccountDocumentsDownloadOptionsViewModel {
    public final String description;
    public final String title;

    public AccountDocumentsDownloadOptionsViewModel(String str, String str2) {
        this.title = str;
        this.description = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountDocumentsDownloadOptionsViewModel)) {
            return false;
        }
        AccountDocumentsDownloadOptionsViewModel accountDocumentsDownloadOptionsViewModel = (AccountDocumentsDownloadOptionsViewModel) obj;
        return Intrinsics.areEqual(this.title, accountDocumentsDownloadOptionsViewModel.title) && Intrinsics.areEqual(this.description, accountDocumentsDownloadOptionsViewModel.description);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("AccountDocumentsDownloadOptionsViewModel(title=", this.title, ", description=", this.description, ")");
    }
}
