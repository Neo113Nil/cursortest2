package com.squareup.cash.profile.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.profile.screens.OpenSourceScreen;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.protos.franklin.investing.resources.StatementType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DocumentsDownloadOptionsScreen extends ProfileScreens.ProfileBottomSheets {
    public static final Parcelable.Creator<DocumentsDownloadOptionsScreen> CREATOR = new OpenSourceScreen.Creator(12);
    public final DocumentsScreen exitScreen;
    public final String key;
    public final StatementType statementType;

    public DocumentsDownloadOptionsScreen(String str, StatementType statementType, DocumentsScreen documentsScreen) {
        str.getClass();
        statementType.getClass();
        documentsScreen.getClass();
        this.key = str;
        this.statementType = statementType;
        this.exitScreen = documentsScreen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentsDownloadOptionsScreen)) {
            return false;
        }
        DocumentsDownloadOptionsScreen documentsDownloadOptionsScreen = (DocumentsDownloadOptionsScreen) obj;
        return Intrinsics.areEqual(this.key, documentsDownloadOptionsScreen.key) && this.statementType == documentsDownloadOptionsScreen.statementType && Intrinsics.areEqual(this.exitScreen, documentsDownloadOptionsScreen.exitScreen);
    }

    public final int hashCode() {
        return this.exitScreen.hashCode() + ((this.statementType.hashCode() + (this.key.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DocumentsDownloadOptionsScreen(key=" + this.key + ", statementType=" + this.statementType + ", exitScreen=" + this.exitScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.key);
        parcel.writeString(this.statementType.name());
        parcel.writeParcelable(this.exitScreen, i);
    }
}
