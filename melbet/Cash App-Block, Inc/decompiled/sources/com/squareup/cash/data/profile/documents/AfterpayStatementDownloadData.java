package com.squareup.cash.data.profile.documents;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AfterpayStatementDownloadData {
    public final String displayName;
    public final String downloadMessage;
    public final String fileName;
    public final String url;

    public AfterpayStatementDownloadData(String str, String str2, String str3, String str4) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str4);
        this.downloadMessage = str;
        this.displayName = str2;
        this.fileName = str3;
        this.url = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayStatementDownloadData)) {
            return false;
        }
        AfterpayStatementDownloadData afterpayStatementDownloadData = (AfterpayStatementDownloadData) obj;
        return Intrinsics.areEqual(this.downloadMessage, afterpayStatementDownloadData.downloadMessage) && Intrinsics.areEqual(this.displayName, afterpayStatementDownloadData.displayName) && this.fileName.equals(afterpayStatementDownloadData.fileName) && Intrinsics.areEqual(this.url, afterpayStatementDownloadData.url);
    }

    public final int hashCode() {
        return this.url.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.downloadMessage.hashCode() * 31, 31, this.displayName), 31, this.fileName);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AfterpayStatementDownloadData(downloadMessage=", this.downloadMessage, ", displayName=", this.displayName, ", fileName="), this.fileName, ", url=", this.url, ")");
    }
}
