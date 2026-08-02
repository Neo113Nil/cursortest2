package com.squareup.cash.profile.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.squareup.cash.profile.screens.OpenSourceScreen;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.cash.registrar.api.StatementType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class DocumentsScreen extends ProfileScreens {

    /* loaded from: classes7.dex */
    public final class DocumentScreenPayOverTimeDocuments extends DocumentsScreen {
        public static final DocumentScreenPayOverTimeDocuments INSTANCE = new DocumentScreenPayOverTimeDocuments();
        public static final Parcelable.Creator<DocumentScreenPayOverTimeDocuments> CREATOR = new OpenSourceScreen.Creator(13);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes7.dex */
    public final class DocumentsScreenAfterpayStatements extends DocumentsScreen {
        public static final DocumentsScreenAfterpayStatements INSTANCE = new DocumentsScreenAfterpayStatements();
        public static final Parcelable.Creator<DocumentsScreenAfterpayStatements> CREATOR = new OpenSourceScreen.Creator(14);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class DocumentsScreenBitcoinTaxDocument extends DocumentsScreen {
        public static final DocumentsScreenBitcoinTaxDocument INSTANCE = new DocumentsScreenBitcoinTaxDocument();
        public static final Parcelable.Creator<DocumentsScreenBitcoinTaxDocument> CREATOR = new OpenSourceScreen.Creator(15);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes7.dex */
    public final class DocumentsScreenCardFeesDocuments extends DocumentsScreen {
        public static final DocumentsScreenCardFeesDocuments INSTANCE = new DocumentsScreenCardFeesDocuments();
        public static final Parcelable.Creator<DocumentsScreenCardFeesDocuments> CREATOR = new OpenSourceScreen.Creator(16);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes7.dex */
    public final class DocumentsScreenLegalDocument extends DocumentsScreen {
        public static final DocumentsScreenLegalDocument INSTANCE = new DocumentsScreenLegalDocument();
        public static final Parcelable.Creator<DocumentsScreenLegalDocument> CREATOR = new OpenSourceScreen.Creator(18);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public final class DocumentsScreenMultiSavingsAccount extends DocumentsScreen {
        public static final DocumentsScreenMultiSavingsAccount INSTANCE = new DocumentsScreenMultiSavingsAccount();
        public static final Parcelable.Creator<DocumentsScreenMultiSavingsAccount> CREATOR = new OpenSourceScreen.Creator(19);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public final class DocumentsScreenMultiStatementAccount extends DocumentsScreen {
        public static final Parcelable.Creator<DocumentsScreenMultiStatementAccount> CREATOR = new OpenSourceScreen.Creator(20);
        public final boolean syncStatements;

        public DocumentsScreenMultiStatementAccount(boolean z) {
            this.syncStatements = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DocumentsScreenMultiStatementAccount) && this.syncStatements == ((DocumentsScreenMultiStatementAccount) obj).syncStatements;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.syncStatements);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("DocumentsScreenMultiStatementAccount(syncStatements=", ")", this.syncStatements);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.syncStatements ? 1 : 0);
        }
    }

    /* loaded from: classes7.dex */
    public final class DocumentsScreenSavingsTaxDocuments extends DocumentsScreen {
        public static final DocumentsScreenSavingsTaxDocuments INSTANCE = new DocumentsScreenSavingsTaxDocuments();
        public static final Parcelable.Creator<DocumentsScreenSavingsTaxDocuments> CREATOR = new OpenSourceScreen.Creator(21);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public final class DocumentsScreenStatements extends DocumentsScreen {
        public static final Parcelable.Creator<DocumentsScreenStatements> CREATOR = new OpenSourceScreen.Creator(22);
        public final String customerToken;
        public final Redacted displayName;
        public final StatementType statementType;

        public DocumentsScreenStatements(String str, StatementType statementType, Redacted redacted) {
            str.getClass();
            statementType.getClass();
            redacted.getClass();
            this.customerToken = str;
            this.statementType = statementType;
            this.displayName = redacted;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DocumentsScreenStatements)) {
                return false;
            }
            DocumentsScreenStatements documentsScreenStatements = (DocumentsScreenStatements) obj;
            return Intrinsics.areEqual(this.customerToken, documentsScreenStatements.customerToken) && this.statementType == documentsScreenStatements.statementType && Intrinsics.areEqual(this.displayName, documentsScreenStatements.displayName);
        }

        public final int hashCode() {
            return this.displayName.hashCode() + ((this.statementType.hashCode() + (this.customerToken.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "DocumentsScreenStatements(customerToken=" + this.customerToken + ", statementType=" + this.statementType + ", displayName=" + this.displayName + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.customerToken);
            parcel.writeString(this.statementType.name());
            parcel.writeParcelable(this.displayName, i);
        }
    }

    /* loaded from: classes7.dex */
    public final class DocumentsScreenStockDocumentTypeSelection extends DocumentsScreen {
        public static final DocumentsScreenStockDocumentTypeSelection INSTANCE = new DocumentsScreenStockDocumentTypeSelection();
        public static final Parcelable.Creator<DocumentsScreenStockDocumentTypeSelection> CREATOR = new OpenSourceScreen.Creator(23);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class DocumentsScreenStockMonthlyForMonth extends DocumentsScreen {
        public static final Parcelable.Creator<DocumentsScreenStockMonthlyForMonth> CREATOR = new OpenSourceScreen.Creator(24);
        public final int targetYear;

        public DocumentsScreenStockMonthlyForMonth(int i) {
            this.targetYear = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DocumentsScreenStockMonthlyForMonth) && this.targetYear == ((DocumentsScreenStockMonthlyForMonth) obj).targetYear;
        }

        public final int hashCode() {
            return Integer.hashCode(this.targetYear);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.targetYear, "DocumentsScreenStockMonthlyForMonth(targetYear=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.targetYear);
        }
    }

    public final class DocumentsScreenStockMonthlyForYear extends DocumentsScreen {
        public static final DocumentsScreenStockMonthlyForYear INSTANCE = new DocumentsScreenStockMonthlyForYear();
        public static final Parcelable.Creator<DocumentsScreenStockMonthlyForYear> CREATOR = new OpenSourceScreen.Creator(25);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class DocumentsScreenStockTaxDocument extends DocumentsScreen {
        public static final DocumentsScreenStockTaxDocument INSTANCE = new DocumentsScreenStockTaxDocument();
        public static final Parcelable.Creator<DocumentsScreenStockTaxDocument> CREATOR = new OpenSourceScreen.Creator(26);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes7.dex */
    public final class DocumentsScreenWages extends DocumentsScreen {
        public static final DocumentsScreenWages INSTANCE = new DocumentsScreenWages();
        public static final Parcelable.Creator<DocumentsScreenWages> CREATOR = new OpenSourceScreen.Creator(27);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class DocumentsScreenCategory extends DocumentsScreen {
        public static final Parcelable.Creator<DocumentsScreenCategory> CREATOR = new OpenSourceScreen.Creator(17);
        public final String categoryId;

        public DocumentsScreenCategory(String str) {
            this.categoryId = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DocumentsScreenCategory) && Intrinsics.areEqual(this.categoryId, ((DocumentsScreenCategory) obj).categoryId);
        }

        public final String getCategoryId() {
            return this.categoryId;
        }

        public final int hashCode() {
            String str = this.categoryId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DocumentsScreenCategory(categoryId=", this.categoryId, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.categoryId);
        }

        public /* synthetic */ DocumentsScreenCategory() {
            this(null);
        }
    }
}
