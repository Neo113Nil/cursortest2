package com.squareup.cash.blockers.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class FilesetUploadErrorViewModel {
    public final String cancelButtonText;
    public final String message;
    public final boolean showRetryButton;
    public final String title;

    public FilesetUploadErrorViewModel(String str, String str2, String str3, boolean z) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.title = str;
        this.message = str2;
        this.cancelButtonText = str3;
        this.showRetryButton = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilesetUploadErrorViewModel)) {
            return false;
        }
        FilesetUploadErrorViewModel filesetUploadErrorViewModel = (FilesetUploadErrorViewModel) obj;
        return Intrinsics.areEqual(this.title, filesetUploadErrorViewModel.title) && Intrinsics.areEqual(this.message, filesetUploadErrorViewModel.message) && Intrinsics.areEqual(this.cancelButtonText, filesetUploadErrorViewModel.cancelButtonText) && this.showRetryButton == filesetUploadErrorViewModel.showRetryButton;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showRetryButton) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.cancelButtonText);
    }

    public final String toString() {
        return re$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FilesetUploadErrorViewModel(title=", this.title, ", message=", this.message, ", cancelButtonText="), this.cancelButtonText, ", showRetryButton=", this.showRetryButton, ")");
    }
}
