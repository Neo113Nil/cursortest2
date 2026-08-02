package com.squareup.cash.savings.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.recipients.data.Recipient;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.savings.bespoke_elements.CardImage;

/* loaded from: classes7.dex */
public final class SavingsCard implements Parcelable {
    public static final Parcelable.Creator<SavingsCard> CREATOR = new Recipient.Creator(18);
    public final String body;
    public final Image image;
    public final Button primaryButton;
    public final Button secondaryButton;
    public final String title;

    public final class Button implements Parcelable {
        public static final Parcelable.Creator<Button> CREATOR = new Recipient.Creator(17);
        public final CdfEvent cdfEvent;
        public final String clientRoute;
        public final String text;

        public Button(String str, String str2, CdfEvent cdfEvent) {
            str.getClass();
            str2.getClass();
            this.text = str;
            this.clientRoute = str2;
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
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.clientRoute, button.clientRoute) && Intrinsics.areEqual(this.cdfEvent, button.cdfEvent);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.text.hashCode() * 31, 31, this.clientRoute);
            CdfEvent cdfEvent = this.cdfEvent;
            return m + (cdfEvent == null ? 0 : cdfEvent.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Button(text=", this.text, ", clientRoute=", this.clientRoute, ", cdfEvent=");
            m.append(this.cdfEvent);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.text);
            parcel.writeString(this.clientRoute);
            parcel.writeParcelable(this.cdfEvent, i);
        }
    }

    public interface Image extends Parcelable {

        public final class LocalImage implements Image {
            public static final Parcelable.Creator<LocalImage> CREATOR = new Recipient.Creator(19);
            public final CardImage image;

            public LocalImage(CardImage cardImage) {
                cardImage.getClass();
                this.image = cardImage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalImage) && this.image == ((LocalImage) obj).image;
            }

            public final int hashCode() {
                return this.image.hashCode();
            }

            public final String toString() {
                return "LocalImage(image=" + this.image + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.image.name());
            }
        }

        public final class RemoteImage implements Image {
            public static final Parcelable.Creator<RemoteImage> CREATOR = new Recipient.Creator(20);
            public final com.squareup.protos.cash.ui.Image image;

            public RemoteImage(com.squareup.protos.cash.ui.Image image) {
                image.getClass();
                this.image = image;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RemoteImage) && Intrinsics.areEqual(this.image, ((RemoteImage) obj).image);
            }

            public final int hashCode() {
                return this.image.hashCode();
            }

            public final String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(this.image, "RemoteImage(image=", ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.image, i);
            }
        }
    }

    public SavingsCard(String str, String str2, Image image, Button button, Button button2) {
        str.getClass();
        str2.getClass();
        button.getClass();
        this.title = str;
        this.body = str2;
        this.image = image;
        this.primaryButton = button;
        this.secondaryButton = button2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingsCard)) {
            return false;
        }
        SavingsCard savingsCard = (SavingsCard) obj;
        return Intrinsics.areEqual(this.title, savingsCard.title) && Intrinsics.areEqual(this.body, savingsCard.body) && Intrinsics.areEqual(this.image, savingsCard.image) && Intrinsics.areEqual(this.primaryButton, savingsCard.primaryButton) && Intrinsics.areEqual(this.secondaryButton, savingsCard.secondaryButton);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
        Image image = this.image;
        int hashCode = (this.primaryButton.hashCode() + ((m + (image == null ? 0 : image.hashCode())) * 31)) * 31;
        Button button = this.secondaryButton;
        return hashCode + (button != null ? button.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SavingsCard(title=", this.title, ", body=", this.body, ", image=");
        m.append(this.image);
        m.append(", primaryButton=");
        m.append(this.primaryButton);
        m.append(", secondaryButton=");
        m.append(this.secondaryButton);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.body);
        parcel.writeParcelable(this.image, i);
        this.primaryButton.writeToParcel(parcel, i);
        Button button = this.secondaryButton;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, i);
        }
    }
}
