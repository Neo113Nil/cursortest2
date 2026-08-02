package com.squareup.cash.account.settings.viewmodels.documents;

import androidx.appcompat.widget.AppCompatHintHelper;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AccountDocumentsViewEvent$RecordPayload$ViewPdfPayload extends AppCompatHintHelper {
    public final String fileTitle;
    public final String url;

    public AccountDocumentsViewEvent$RecordPayload$ViewPdfPayload(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.url = str;
        this.fileTitle = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountDocumentsViewEvent$RecordPayload$ViewPdfPayload)) {
            return false;
        }
        AccountDocumentsViewEvent$RecordPayload$ViewPdfPayload accountDocumentsViewEvent$RecordPayload$ViewPdfPayload = (AccountDocumentsViewEvent$RecordPayload$ViewPdfPayload) obj;
        return Intrinsics.areEqual(this.url, accountDocumentsViewEvent$RecordPayload$ViewPdfPayload.url) && Intrinsics.areEqual(this.fileTitle, accountDocumentsViewEvent$RecordPayload$ViewPdfPayload.fileTitle);
    }

    public final int hashCode() {
        return this.fileTitle.hashCode() + (this.url.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ViewPdfPayload(url=", this.url, ", fileTitle=", this.fileTitle, ")");
    }
}
