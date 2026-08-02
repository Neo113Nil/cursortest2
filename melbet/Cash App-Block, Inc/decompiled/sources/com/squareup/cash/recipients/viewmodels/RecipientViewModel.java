package com.squareup.cash.recipients.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RecipientViewModel implements Parcelable {
    public static final Parcelable.Creator<RecipientViewModel> CREATOR = new Recipient.Creator(13);
    public final Color accentColor;
    public final Avatar avatar;
    public final boolean hasDuplicatePayment;
    public final boolean isBusiness;
    public boolean isSelected;
    public final boolean isVerified;
    public final String listUniqueId;
    public final Character monogram;
    public final Recipient recipient;
    public final boolean showCheckbox;
    public final boolean showInfoButton;
    public final String subtitle;
    public final String title;

    /* loaded from: classes7.dex */
    public interface Avatar extends Parcelable {

        public final class BitcoinAddressAvatar implements Avatar {
            public static final BitcoinAddressAvatar INSTANCE = new BitcoinAddressAvatar();
            public static final Parcelable.Creator<BitcoinAddressAvatar> CREATOR = new Recipient.Creator(9);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof BitcoinAddressAvatar);
            }

            public final int hashCode() {
                return -661691906;
            }

            public final String toString() {
                return "BitcoinAddressAvatar";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class PhotoImageAvatar implements Avatar {
            public static final Parcelable.Creator<PhotoImageAvatar> CREATOR = new Recipient.Creator(10);
            public final Image photoImage;

            public PhotoImageAvatar(Image image) {
                this.photoImage = image;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PhotoImageAvatar) && Intrinsics.areEqual(this.photoImage, ((PhotoImageAvatar) obj).photoImage);
            }

            public final int hashCode() {
                Image image = this.photoImage;
                if (image == null) {
                    return 0;
                }
                return image.hashCode();
            }

            public final String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(this.photoImage, "PhotoImageAvatar(photoImage=", ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.photoImage, i);
            }
        }

        public final class PlaceholderAvatar implements Avatar {
            public static final PlaceholderAvatar INSTANCE = new PlaceholderAvatar();
            public static final Parcelable.Creator<PlaceholderAvatar> CREATOR = new Recipient.Creator(11);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PlaceholderAvatar);
            }

            public final int hashCode() {
                return -2086185219;
            }

            public final String toString() {
                return "PlaceholderAvatar";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public final class StablecoinAvatar implements Avatar {
            public static final StablecoinAvatar INSTANCE = new StablecoinAvatar();
            public static final Parcelable.Creator<StablecoinAvatar> CREATOR = new Recipient.Creator(12);

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof StablecoinAvatar);
            }

            public final int hashCode() {
                return 1484231764;
            }

            public final String toString() {
                return "StablecoinAvatar";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }
    }

    public /* synthetic */ RecipientViewModel(String str, Recipient recipient, String str2, Avatar avatar, Character ch, String str3, boolean z, boolean z2, boolean z3, Color color, boolean z4, int i) {
        this(str, recipient, str2, avatar, (i & 16) != 0 ? null : ch, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? null : color, (i & 1024) != 0 ? true : z4, false, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipientViewModel)) {
            return false;
        }
        RecipientViewModel recipientViewModel = (RecipientViewModel) obj;
        return Intrinsics.areEqual(this.listUniqueId, recipientViewModel.listUniqueId) && Intrinsics.areEqual(this.recipient, recipientViewModel.recipient) && Intrinsics.areEqual(this.title, recipientViewModel.title) && Intrinsics.areEqual(this.avatar, recipientViewModel.avatar) && Intrinsics.areEqual(this.monogram, recipientViewModel.monogram) && Intrinsics.areEqual(this.subtitle, recipientViewModel.subtitle) && this.isSelected == recipientViewModel.isSelected && this.isVerified == recipientViewModel.isVerified && this.isBusiness == recipientViewModel.isBusiness && Intrinsics.areEqual(this.accentColor, recipientViewModel.accentColor) && this.showInfoButton == recipientViewModel.showInfoButton && this.showCheckbox == recipientViewModel.showCheckbox && this.hasDuplicatePayment == recipientViewModel.hasDuplicatePayment;
    }

    public final int hashCode() {
        int hashCode = (this.avatar.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.recipient.hashCode() + (this.listUniqueId.hashCode() * 31)) * 31, 31, this.title)) * 31;
        Character ch = this.monogram;
        int hashCode2 = (hashCode + (ch == null ? 0 : ch.hashCode())) * 31;
        String str = this.subtitle;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isSelected), 31, this.isVerified), 31, this.isBusiness);
        Color color = this.accentColor;
        return Boolean.hashCode(this.hasDuplicatePayment) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (color != null ? color.hashCode() : 0)) * 31, 31, this.showInfoButton), 31, this.showCheckbox);
    }

    public final String toString() {
        boolean z = this.isSelected;
        StringBuilder sb = new StringBuilder("RecipientViewModel(listUniqueId=");
        sb.append(this.listUniqueId);
        sb.append(", recipient=");
        sb.append(this.recipient);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", avatar=");
        sb.append(this.avatar);
        sb.append(", monogram=");
        sb.append(this.monogram);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", isSelected=");
        re$$ExternalSyntheticOutline0.m(sb, z, ", isVerified=", this.isVerified, ", isBusiness=");
        sb.append(this.isBusiness);
        sb.append(", accentColor=");
        sb.append(this.accentColor);
        sb.append(", showInfoButton=");
        re$$ExternalSyntheticOutline0.m(sb, this.showInfoButton, ", showCheckbox=", this.showCheckbox, ", hasDuplicatePayment=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.hasDuplicatePayment, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        char charValue;
        parcel.getClass();
        parcel.writeString(this.listUniqueId);
        parcel.writeParcelable(this.recipient, i);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.avatar, i);
        Character ch = this.monogram;
        if (ch == null) {
            charValue = 0;
        } else {
            parcel.writeInt(1);
            charValue = ch.charValue();
        }
        parcel.writeInt(charValue);
        parcel.writeString(this.subtitle);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeInt(this.isVerified ? 1 : 0);
        parcel.writeInt(this.isBusiness ? 1 : 0);
        parcel.writeParcelable(this.accentColor, i);
        parcel.writeInt(this.showInfoButton ? 1 : 0);
        parcel.writeInt(this.showCheckbox ? 1 : 0);
        parcel.writeInt(this.hasDuplicatePayment ? 1 : 0);
    }

    public RecipientViewModel(String str, Recipient recipient, String str2, Avatar avatar, Character ch, String str3, boolean z, boolean z2, boolean z3, Color color, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        recipient.getClass();
        str2.getClass();
        avatar.getClass();
        this.listUniqueId = str;
        this.recipient = recipient;
        this.title = str2;
        this.avatar = avatar;
        this.monogram = ch;
        this.subtitle = str3;
        this.isSelected = z;
        this.isVerified = z2;
        this.isBusiness = z3;
        this.accentColor = color;
        this.showInfoButton = z4;
        this.showCheckbox = z5;
        this.hasDuplicatePayment = z6;
    }
}
