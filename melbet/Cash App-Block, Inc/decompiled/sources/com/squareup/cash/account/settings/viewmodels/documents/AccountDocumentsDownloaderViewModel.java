package com.squareup.cash.account.settings.viewmodels.documents;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AccountDocumentsDownloaderViewModel {
    public final String negativeButton;
    public final String title;

    public AccountDocumentsDownloaderViewModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.negativeButton = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountDocumentsDownloaderViewModel)) {
            return false;
        }
        AccountDocumentsDownloaderViewModel accountDocumentsDownloaderViewModel = (AccountDocumentsDownloaderViewModel) obj;
        return Intrinsics.areEqual(this.title, accountDocumentsDownloaderViewModel.title) && Intrinsics.areEqual(this.negativeButton, accountDocumentsDownloaderViewModel.negativeButton);
    }

    public final int hashCode() {
        return this.negativeButton.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("AccountDocumentsDownloaderViewModel(title=", this.title, ", negativeButton=", this.negativeButton, ")");
    }
}
