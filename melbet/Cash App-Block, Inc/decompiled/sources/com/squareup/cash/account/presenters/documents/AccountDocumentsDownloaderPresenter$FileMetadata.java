package com.squareup.cash.account.presenters.documents;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AccountDocumentsDownloaderPresenter$FileMetadata {
    public final String displayName;
    public final String fileName;
    public final String url;

    public AccountDocumentsDownloaderPresenter$FileMetadata(String str, String str2, String str3) {
        str2.getClass();
        this.fileName = str;
        this.displayName = str2;
        this.url = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountDocumentsDownloaderPresenter$FileMetadata)) {
            return false;
        }
        AccountDocumentsDownloaderPresenter$FileMetadata accountDocumentsDownloaderPresenter$FileMetadata = (AccountDocumentsDownloaderPresenter$FileMetadata) obj;
        return this.fileName.equals(accountDocumentsDownloaderPresenter$FileMetadata.fileName) && Intrinsics.areEqual(this.displayName, accountDocumentsDownloaderPresenter$FileMetadata.displayName) && this.url.equals(accountDocumentsDownloaderPresenter$FileMetadata.url);
    }

    public final int hashCode() {
        return this.url.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.fileName.hashCode() * 31, 31, this.displayName);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FileMetadata(fileName=", this.fileName, ", displayName=", this.displayName, ", url="), this.url, ")");
    }
}
