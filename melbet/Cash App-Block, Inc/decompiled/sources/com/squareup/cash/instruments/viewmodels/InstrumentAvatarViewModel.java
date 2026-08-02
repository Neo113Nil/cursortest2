package com.squareup.cash.instruments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.instrument.InstrumentType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InstrumentAvatarViewModel implements Parcelable {
    public static final Parcelable.Creator<InstrumentAvatarViewModel> CREATOR = new Instrument.Creator(20);
    public final Image avatar;
    public final boolean enabled;
    public final FallbackIcon fallbackIcon;

    public abstract class FallbackIcon implements Parcelable {

        public final class Add extends FallbackIcon {
            public static final Add INSTANCE = new Add();
            public static final Parcelable.Creator<Add> CREATOR = new Instrument.Creator(21);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Add);
            }

            public final int hashCode() {
                return -608337149;
            }

            public final String toString() {
                return "Add";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class AppIcon extends FallbackIcon {
            public static final AppIcon INSTANCE = new AppIcon();
            public static final Parcelable.Creator<AppIcon> CREATOR = new Instrument.Creator(22);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof AppIcon);
            }

            public final int hashCode() {
                return 11811740;
            }

            public final String toString() {
                return "AppIcon";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class Balance extends FallbackIcon {
            public static final Parcelable.Creator<Balance> CREATOR = new Instrument.Creator(23);
            public final CurrencyCode currencyCode;

            public Balance(CurrencyCode currencyCode) {
                this.currencyCode = currencyCode;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Balance) && this.currencyCode == ((Balance) obj).currencyCode;
            }

            public final int hashCode() {
                CurrencyCode currencyCode = this.currencyCode;
                if (currencyCode == null) {
                    return 0;
                }
                return currencyCode.hashCode();
            }

            public final String toString() {
                return "Balance(currencyCode=" + this.currencyCode + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                CurrencyCode currencyCode = this.currencyCode;
                if (currencyCode == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(currencyCode.name());
                }
            }
        }

        public final class Bank extends FallbackIcon {
            public static final Bank INSTANCE = new Bank();
            public static final Parcelable.Creator<Bank> CREATOR = new Instrument.Creator(24);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Bank);
            }

            public final int hashCode() {
                return -1678555110;
            }

            public final String toString() {
                return "Bank";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class Card extends FallbackIcon {
            public static final Parcelable.Creator<Card> CREATOR = new Instrument.Creator(25);
            public final InstrumentType brand;

            public Card(InstrumentType instrumentType) {
                this.brand = instrumentType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Card) && this.brand == ((Card) obj).brand;
            }

            public final int hashCode() {
                InstrumentType instrumentType = this.brand;
                if (instrumentType == null) {
                    return 0;
                }
                return instrumentType.hashCode();
            }

            public final String toString() {
                return "Card(brand=" + this.brand + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                InstrumentType instrumentType = this.brand;
                if (instrumentType == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(instrumentType.name());
                }
            }
        }

        public final class EmojiIcon extends FallbackIcon {
            public static final Parcelable.Creator<EmojiIcon> CREATOR = new Instrument.Creator(26);
            public final String iconId;

            public EmojiIcon(String str) {
                str.getClass();
                this.iconId = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EmojiIcon) && Intrinsics.areEqual(this.iconId, ((EmojiIcon) obj).iconId);
            }

            public final int hashCode() {
                return this.iconId.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EmojiIcon(iconId=", this.iconId, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.iconId);
            }
        }

        public final class GooglePayIcon extends FallbackIcon {
            public static final GooglePayIcon INSTANCE = new GooglePayIcon();
            public static final Parcelable.Creator<GooglePayIcon> CREATOR = new Instrument.Creator(27);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof GooglePayIcon);
            }

            public final int hashCode() {
                return 833764522;
            }

            public final String toString() {
                return "GooglePayIcon";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }

    public final class Image implements Parcelable {
        public static final Parcelable.Creator<Image> CREATOR = new Instrument.Creator(28);
        public final String darkUrl;
        public final String lightUrl;

        public Image(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.lightUrl = str;
            this.darkUrl = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Image)) {
                return false;
            }
            Image image = (Image) obj;
            return Intrinsics.areEqual(this.lightUrl, image.lightUrl) && Intrinsics.areEqual(this.darkUrl, image.darkUrl);
        }

        public final int hashCode() {
            return this.darkUrl.hashCode() + (this.lightUrl.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Image(lightUrl=", this.lightUrl, ", darkUrl=", this.darkUrl, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.lightUrl);
            parcel.writeString(this.darkUrl);
        }
    }

    public InstrumentAvatarViewModel(Image image, FallbackIcon fallbackIcon, boolean z) {
        fallbackIcon.getClass();
        this.avatar = image;
        this.fallbackIcon = fallbackIcon;
        this.enabled = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentAvatarViewModel)) {
            return false;
        }
        InstrumentAvatarViewModel instrumentAvatarViewModel = (InstrumentAvatarViewModel) obj;
        return Intrinsics.areEqual(this.avatar, instrumentAvatarViewModel.avatar) && Intrinsics.areEqual(this.fallbackIcon, instrumentAvatarViewModel.fallbackIcon) && this.enabled == instrumentAvatarViewModel.enabled;
    }

    public final int hashCode() {
        Image image = this.avatar;
        int hashCode = image == null ? 0 : image.hashCode();
        return Boolean.hashCode(this.enabled) + ((this.fallbackIcon.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstrumentAvatarViewModel(avatar=");
        sb.append(this.avatar);
        sb.append(", fallbackIcon=");
        sb.append(this.fallbackIcon);
        sb.append(", enabled=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.enabled, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Image image = this.avatar;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.fallbackIcon, i);
        parcel.writeInt(this.enabled ? 1 : 0);
    }
}
