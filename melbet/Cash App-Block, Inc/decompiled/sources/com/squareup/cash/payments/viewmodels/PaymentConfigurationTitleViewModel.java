package com.squareup.cash.payments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.payments.viewmodels.Size;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaymentConfigurationTitleViewModel implements Parcelable {
    public static final Parcelable.Creator<PaymentConfigurationTitleViewModel> CREATOR = new Size.Creator(7);
    public final boolean leftAligned;
    public final List titles;

    public PaymentConfigurationTitleViewModel(List list, boolean z) {
        list.getClass();
        this.titles = list;
        this.leftAligned = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentConfigurationTitleViewModel)) {
            return false;
        }
        PaymentConfigurationTitleViewModel paymentConfigurationTitleViewModel = (PaymentConfigurationTitleViewModel) obj;
        return Intrinsics.areEqual(this.titles, paymentConfigurationTitleViewModel.titles) && this.leftAligned == paymentConfigurationTitleViewModel.leftAligned;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.leftAligned) + (this.titles.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentConfigurationTitleViewModel(titles=" + this.titles + ", leftAligned=" + this.leftAligned + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.titles, parcel);
        while (m.hasNext()) {
            ((TitleViewModel) m.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.leftAligned ? 1 : 0);
    }

    public final class TitleViewModel implements Parcelable {
        public static final Parcelable.Creator<TitleViewModel> CREATOR = new Size.Creator(9);
        public final String accessibilityActionLabel;
        public final String accessibilityLabel;
        public final TitleTapped action;
        public final String amount;
        public final boolean animationEnabled;
        public final AvatarViewModel avatar;
        public final String preposition;
        public final String title;

        public final class AvatarViewModel implements Parcelable {
            public static final Parcelable.Creator<AvatarViewModel> CREATOR = new Size.Creator(8);
            public final Color accentColor;
            public final Image image;
            public final String monogram;

            public AvatarViewModel(Color color, Image image, String str) {
                this.image = image;
                this.monogram = str;
                this.accentColor = color;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AvatarViewModel)) {
                    return false;
                }
                AvatarViewModel avatarViewModel = (AvatarViewModel) obj;
                return Intrinsics.areEqual(this.image, avatarViewModel.image) && Intrinsics.areEqual(this.monogram, avatarViewModel.monogram) && Intrinsics.areEqual(this.accentColor, avatarViewModel.accentColor);
            }

            public final int hashCode() {
                Image image = this.image;
                int hashCode = (image == null ? 0 : image.hashCode()) * 31;
                String str = this.monogram;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Color color = this.accentColor;
                return hashCode2 + (color != null ? color.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.image, "AvatarViewModel(image=", ", monogram=", this.monogram, ", accentColor=");
                m.append(this.accentColor);
                m.append(")");
                return m.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.image, i);
                parcel.writeString(this.monogram);
                parcel.writeParcelable(this.accentColor, i);
            }
        }

        public TitleViewModel(AvatarViewModel avatarViewModel, String str, String str2, String str3, String str4, String str5, TitleTapped titleTapped, boolean z) {
            str.getClass();
            str3.getClass();
            this.avatar = avatarViewModel;
            this.title = str;
            this.preposition = str2;
            this.accessibilityLabel = str3;
            this.accessibilityActionLabel = str4;
            this.amount = str5;
            this.action = titleTapped;
            this.animationEnabled = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TitleViewModel)) {
                return false;
            }
            TitleViewModel titleViewModel = (TitleViewModel) obj;
            return Intrinsics.areEqual(this.avatar, titleViewModel.avatar) && Intrinsics.areEqual(this.title, titleViewModel.title) && Intrinsics.areEqual(this.preposition, titleViewModel.preposition) && Intrinsics.areEqual(this.accessibilityLabel, titleViewModel.accessibilityLabel) && Intrinsics.areEqual(this.accessibilityActionLabel, titleViewModel.accessibilityActionLabel) && Intrinsics.areEqual(this.amount, titleViewModel.amount) && Intrinsics.areEqual(this.action, titleViewModel.action) && this.animationEnabled == titleViewModel.animationEnabled;
        }

        public final int hashCode() {
            AvatarViewModel avatarViewModel = this.avatar;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((avatarViewModel == null ? 0 : avatarViewModel.hashCode()) * 31, 31, this.title);
            String str = this.preposition;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.accessibilityLabel);
            String str2 = this.accessibilityActionLabel;
            int hashCode = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.amount;
            int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            TitleTapped titleTapped = this.action;
            return Boolean.hashCode(this.animationEnabled) + ((hashCode2 + (titleTapped != null ? titleTapped.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TitleViewModel(avatar=");
            sb.append(this.avatar);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", preposition=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.preposition, ", accessibilityLabel=", this.accessibilityLabel, ", accessibilityActionLabel=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.accessibilityActionLabel, ", amount=", this.amount, ", action=");
            sb.append(this.action);
            sb.append(", animationEnabled=");
            sb.append(this.animationEnabled);
            sb.append(")");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            AvatarViewModel avatarViewModel = this.avatar;
            if (avatarViewModel == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                avatarViewModel.writeToParcel(parcel, i);
            }
            parcel.writeString(this.title);
            parcel.writeString(this.preposition);
            parcel.writeString(this.accessibilityLabel);
            parcel.writeString(this.accessibilityActionLabel);
            parcel.writeString(this.amount);
            parcel.writeParcelable(this.action, i);
            parcel.writeInt(this.animationEnabled ? 1 : 0);
        }

        public /* synthetic */ TitleViewModel(AvatarViewModel avatarViewModel, String str, String str2, String str3, String str4, TitleTapped titleTapped, int i) {
            this(avatarViewModel, str, str2, str3, str4, null, (i & 64) != 0 ? null : titleTapped, true);
        }
    }
}
