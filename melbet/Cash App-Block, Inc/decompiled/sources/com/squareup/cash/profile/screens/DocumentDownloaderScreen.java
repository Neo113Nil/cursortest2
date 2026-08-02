package com.squareup.cash.profile.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.DialogScreen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.profile.screens.OpenSourceScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface DocumentDownloaderScreen extends DialogScreen {

    public final class DefaultDownloaderScreen extends ProfileScreens implements DocumentDownloaderScreen {
        public static final Parcelable.Creator<DefaultDownloaderScreen> CREATOR = new OpenSourceScreen.Creator(10);
        public final DocumentData documentData;
        public final String downloadMessage;
        public final String negativeButton;

        public DefaultDownloaderScreen(DocumentData documentData, String str, String str2) {
            documentData.getClass();
            this.documentData = documentData;
            this.downloadMessage = str;
            this.negativeButton = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DefaultDownloaderScreen)) {
                return false;
            }
            DefaultDownloaderScreen defaultDownloaderScreen = (DefaultDownloaderScreen) obj;
            return Intrinsics.areEqual(this.documentData, defaultDownloaderScreen.documentData) && Intrinsics.areEqual(this.downloadMessage, defaultDownloaderScreen.downloadMessage) && Intrinsics.areEqual(this.negativeButton, defaultDownloaderScreen.negativeButton);
        }

        @Override // com.squareup.cash.profile.screens.DocumentDownloaderScreen
        public final DocumentData getDocumentData() {
            return this.documentData;
        }

        @Override // com.squareup.cash.profile.screens.DocumentDownloaderScreen
        public final String getDownloadMessage() {
            return this.downloadMessage;
        }

        @Override // com.squareup.cash.profile.screens.DocumentDownloaderScreen
        public final String getNegativeButton() {
            return this.negativeButton;
        }

        public final int hashCode() {
            int hashCode = this.documentData.hashCode() * 31;
            String str = this.downloadMessage;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.negativeButton;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DefaultDownloaderScreen(documentData=");
            sb.append(this.documentData);
            sb.append(", downloadMessage=");
            sb.append(this.downloadMessage);
            sb.append(", negativeButton=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.negativeButton, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.documentData.writeToParcel(parcel, i);
            parcel.writeString(this.downloadMessage);
            parcel.writeString(this.negativeButton);
        }
    }

    public final class DocumentData implements Parcelable {
        public static final Parcelable.Creator<DocumentData> CREATOR = new OpenSourceScreen.Creator(11);
        public final String displayName;
        public final String fileName;
        public final String url;

        public DocumentData(String str, String str2, String str3) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.displayName = str;
            this.fileName = str2;
            this.url = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DocumentData)) {
                return false;
            }
            DocumentData documentData = (DocumentData) obj;
            return Intrinsics.areEqual(this.displayName, documentData.displayName) && Intrinsics.areEqual(this.fileName, documentData.fileName) && Intrinsics.areEqual(this.url, documentData.url);
        }

        public final int hashCode() {
            return this.url.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.displayName.hashCode() * 31, 31, this.fileName);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DocumentData(displayName=", this.displayName, ", fileName=", this.fileName, ", url="), this.url, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.displayName);
            parcel.writeString(this.fileName);
            parcel.writeString(this.url);
        }
    }

    DocumentData getDocumentData();

    String getDownloadMessage();

    String getNegativeButton();

    public final class AccountStatementDownloaderScreen extends ProfileScreens implements DocumentDownloaderScreen {
        public static final Parcelable.Creator<AccountStatementDownloaderScreen> CREATOR = new OpenSourceScreen.Creator(9);
        public final DocumentData documentData;
        public final String downloadMessage;
        public final String negativeButton;
        public final String statementToken;

        public AccountStatementDownloaderScreen(DocumentData documentData, String str, String str2, String str3) {
            str3.getClass();
            this.documentData = documentData;
            this.downloadMessage = str;
            this.negativeButton = str2;
            this.statementToken = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountStatementDownloaderScreen)) {
                return false;
            }
            AccountStatementDownloaderScreen accountStatementDownloaderScreen = (AccountStatementDownloaderScreen) obj;
            return Intrinsics.areEqual(this.documentData, accountStatementDownloaderScreen.documentData) && Intrinsics.areEqual(this.downloadMessage, accountStatementDownloaderScreen.downloadMessage) && Intrinsics.areEqual(this.negativeButton, accountStatementDownloaderScreen.negativeButton) && Intrinsics.areEqual(this.statementToken, accountStatementDownloaderScreen.statementToken);
        }

        @Override // com.squareup.cash.profile.screens.DocumentDownloaderScreen
        public final DocumentData getDocumentData() {
            return this.documentData;
        }

        @Override // com.squareup.cash.profile.screens.DocumentDownloaderScreen
        public final String getDownloadMessage() {
            return this.downloadMessage;
        }

        @Override // com.squareup.cash.profile.screens.DocumentDownloaderScreen
        public final String getNegativeButton() {
            return this.negativeButton;
        }

        public final int hashCode() {
            DocumentData documentData = this.documentData;
            int hashCode = (documentData == null ? 0 : documentData.hashCode()) * 31;
            String str = this.downloadMessage;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.negativeButton;
            return this.statementToken.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AccountStatementDownloaderScreen(documentData=");
            sb.append(this.documentData);
            sb.append(", downloadMessage=");
            sb.append(this.downloadMessage);
            sb.append(", negativeButton=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.negativeButton, ", statementToken=", this.statementToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            DocumentData documentData = this.documentData;
            if (documentData == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                documentData.writeToParcel(parcel, i);
            }
            parcel.writeString(this.downloadMessage);
            parcel.writeString(this.negativeButton);
            parcel.writeString(this.statementToken);
        }

        public /* synthetic */ AccountStatementDownloaderScreen(DocumentData documentData, String str, String str2, int i) {
            this((i & 1) != 0 ? null : documentData, (i & 2) != 0 ? null : str, (String) null, str2);
        }
    }
}
