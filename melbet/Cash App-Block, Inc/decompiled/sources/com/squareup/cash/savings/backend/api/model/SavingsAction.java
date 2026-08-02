package com.squareup.cash.savings.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.recipients.data.Recipient;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes7.dex */
public interface SavingsAction extends Parcelable {

    public final class ClientRoute implements SavingsAction {
        public static final Parcelable.Creator<ClientRoute> CREATOR = new Recipient.Creator(15);
        public final CdfEvent cdfEvent;
        public final String route;

        public ClientRoute(String str, CdfEvent cdfEvent) {
            str.getClass();
            this.route = str;
            this.cdfEvent = cdfEvent;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientRoute)) {
                return false;
            }
            ClientRoute clientRoute = (ClientRoute) obj;
            return Intrinsics.areEqual(this.route, clientRoute.route) && Intrinsics.areEqual(this.cdfEvent, clientRoute.cdfEvent);
        }

        public final int hashCode() {
            int hashCode = this.route.hashCode() * 31;
            CdfEvent cdfEvent = this.cdfEvent;
            return hashCode + (cdfEvent == null ? 0 : cdfEvent.hashCode());
        }

        public final String toString() {
            return "ClientRoute(route=" + this.route + ", cdfEvent=" + this.cdfEvent + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.route);
            parcel.writeParcelable(this.cdfEvent, i);
        }
    }

    public final class PresentCard implements SavingsAction {
        public static final Parcelable.Creator<PresentCard> CREATOR = new Recipient.Creator(16);
        public final SavingsCard card;
        public final CdfEvent cdfEvent;

        public PresentCard(SavingsCard savingsCard, CdfEvent cdfEvent) {
            savingsCard.getClass();
            this.card = savingsCard;
            this.cdfEvent = cdfEvent;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PresentCard)) {
                return false;
            }
            PresentCard presentCard = (PresentCard) obj;
            return Intrinsics.areEqual(this.card, presentCard.card) && Intrinsics.areEqual(this.cdfEvent, presentCard.cdfEvent);
        }

        public final int hashCode() {
            int hashCode = this.card.hashCode() * 31;
            CdfEvent cdfEvent = this.cdfEvent;
            return hashCode + (cdfEvent == null ? 0 : cdfEvent.hashCode());
        }

        public final String toString() {
            return "PresentCard(card=" + this.card + ", cdfEvent=" + this.cdfEvent + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.card.writeToParcel(parcel, i);
            parcel.writeParcelable(this.cdfEvent, i);
        }
    }
}
