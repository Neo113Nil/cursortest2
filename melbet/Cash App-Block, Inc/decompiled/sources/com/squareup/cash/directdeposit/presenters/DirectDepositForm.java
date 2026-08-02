package com.squareup.cash.directdeposit.presenters;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.directdeposit.backend.api.PaycheckDepositAllocation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DirectDepositForm implements Parcelable {
    public static final Parcelable.Creator<DirectDepositForm> CREATOR = new Creator(0);
    public final String documentToken;
    public final Uri pdfLocalUri;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    return new DirectDepositForm((Uri) parcel.readParcelable(DirectDepositForm.class.getClassLoader()), parcel.readString());
                default:
                    parcel.getClass();
                    return new DirectDepositUpdateManualFormDetailsPresenter$DirectDepositForm(parcel.readString(), parcel.readString(), (PaycheckDepositAllocation) parcel.readParcelable(DirectDepositUpdateManualFormDetailsPresenter$DirectDepositForm.class.getClassLoader()), parcel.readInt() != 0);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new DirectDepositForm[i];
                default:
                    return new DirectDepositUpdateManualFormDetailsPresenter$DirectDepositForm[i];
            }
        }
    }

    public DirectDepositForm(Uri uri, String str) {
        this.pdfLocalUri = uri;
        this.documentToken = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectDepositForm)) {
            return false;
        }
        DirectDepositForm directDepositForm = (DirectDepositForm) obj;
        return Intrinsics.areEqual(this.pdfLocalUri, directDepositForm.pdfLocalUri) && Intrinsics.areEqual(this.documentToken, directDepositForm.documentToken);
    }

    public final int hashCode() {
        Uri uri = this.pdfLocalUri;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.documentToken;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "DirectDepositForm(pdfLocalUri=" + this.pdfLocalUri + ", documentToken=" + this.documentToken + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.pdfLocalUri, i);
        parcel.writeString(this.documentToken);
    }
}
