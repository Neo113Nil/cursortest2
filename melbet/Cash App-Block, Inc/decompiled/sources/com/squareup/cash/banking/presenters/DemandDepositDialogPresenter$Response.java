package com.squareup.cash.banking.presenters;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.protos.franklin.api.ClientScenario;

/* loaded from: classes5.dex */
public interface DemandDepositDialogPresenter$Response extends Parcelable {

    public final class Dismiss implements DemandDepositDialogPresenter$Response {
        public static final Dismiss INSTANCE = new Dismiss();
        public static final Parcelable.Creator<Dismiss> CREATOR = new SheetAppMessage.Creator(8);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return -259145995;
        }

        public final String toString() {
            return "Dismiss";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class DoClientScenario implements DemandDepositDialogPresenter$Response {
        public static final Parcelable.Creator<DoClientScenario> CREATOR = new SheetAppMessage.Creator(9);
        public final ClientScenario clientScenario;

        public DoClientScenario(ClientScenario clientScenario) {
            clientScenario.getClass();
            this.clientScenario = clientScenario;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DoClientScenario) && this.clientScenario == ((DoClientScenario) obj).clientScenario;
        }

        public final int hashCode() {
            return this.clientScenario.hashCode();
        }

        public final String toString() {
            return "DoClientScenario(clientScenario=" + this.clientScenario + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.clientScenario.name());
        }
    }
}
