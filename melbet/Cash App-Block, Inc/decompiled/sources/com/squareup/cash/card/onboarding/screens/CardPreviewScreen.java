package com.squareup.cash.card.onboarding.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.api.CardCustomizationBlocker;
import com.squareup.protos.franklin.api.CardPresentationStyle;
import com.squareup.protos.franklin.cards.PaymentMethod;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CardPreviewScreen implements BlockersScreens.ChildBlockersScreens {
    public static final Parcelable.Creator<CardPreviewScreen> CREATOR = new Creator();
    public final String appThemeInformation;
    public final Color appThemeInformationColor;
    public final boolean available;
    public final List availableStamps;
    public final CardStyleScreen backScreen;
    public final BlockersData blockersData;
    public final CardPresentationStyle cardPresentationStyle;
    public final Redacted cashtag;
    public final CardCustomizationBlocker.CardOption.CashtagDisplay cashtagDisplay;
    public final boolean customizationEligible;
    public final String description;
    public final String editPersonalization;
    public final String order;
    public final PaymentMethod paymentMethod;
    public final String personalize;
    public final CardCustomizationBlocker.CardOption preselectedCard;
    public final String sheetDescription;
    public final CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage sheetImage;
    public final String sheetTitle;
    public final String title;

    /* loaded from: classes6.dex */
    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            BlockersData blockersData = (BlockersData) parcel.readParcelable(CardPreviewScreen.class.getClassLoader());
            CardStyleScreen createFromParcel = parcel.readInt() == 0 ? null : CardStyleScreen.CREATOR.createFromParcel(parcel);
            CardCustomizationBlocker.CardOption cardOption = (CardCustomizationBlocker.CardOption) parcel.readParcelable(CardPreviewScreen.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Color color = (Color) parcel.readParcelable(CardPreviewScreen.class.getClassLoader());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            CardCustomizationBlocker.CardOption.CashtagDisplay valueOf = CardCustomizationBlocker.CardOption.CashtagDisplay.valueOf(parcel.readString());
            Redacted redacted = (Redacted) parcel.readParcelable(CardPreviewScreen.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            CardPresentationStyle valueOf2 = CardPresentationStyle.valueOf(parcel.readString());
            boolean z2 = parcel.readInt() != 0;
            String readString7 = parcel.readString();
            PaymentMethod paymentMethod = null;
            boolean z3 = z2;
            String readString8 = parcel.readString();
            CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage valueOf3 = parcel.readInt() == 0 ? null : CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage.valueOf(parcel.readString());
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                paymentMethod = PaymentMethod.valueOf(parcel.readString());
            }
            return new CardPreviewScreen(blockersData, createFromParcel, cardOption, readString, readString2, color, readString3, readString4, readString5, readString6, valueOf, redacted, z, valueOf2, z3, readString7, readString8, valueOf3, createStringArrayList, paymentMethod);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardPreviewScreen[i];
        }
    }

    public CardPreviewScreen(BlockersData blockersData, CardStyleScreen cardStyleScreen, CardCustomizationBlocker.CardOption cardOption, String str, String str2, Color color, String str3, String str4, String str5, String str6, CardCustomizationBlocker.CardOption.CashtagDisplay cashtagDisplay, Redacted redacted, boolean z, CardPresentationStyle cardPresentationStyle, boolean z2, String str7, String str8, CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage localSheetImage, List list, PaymentMethod paymentMethod) {
        blockersData.getClass();
        str.getClass();
        str3.getClass();
        str6.getClass();
        cashtagDisplay.getClass();
        cardPresentationStyle.getClass();
        list.getClass();
        this.blockersData = blockersData;
        this.backScreen = cardStyleScreen;
        this.preselectedCard = cardOption;
        this.title = str;
        this.appThemeInformation = str2;
        this.appThemeInformationColor = color;
        this.description = str3;
        this.personalize = str4;
        this.editPersonalization = str5;
        this.order = str6;
        this.cashtagDisplay = cashtagDisplay;
        this.cashtag = redacted;
        this.customizationEligible = z;
        this.cardPresentationStyle = cardPresentationStyle;
        this.available = z2;
        this.sheetTitle = str7;
        this.sheetDescription = str8;
        this.sheetImage = localSheetImage;
        this.availableStamps = list;
        this.paymentMethod = paymentMethod;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardPreviewScreen)) {
            return false;
        }
        CardPreviewScreen cardPreviewScreen = (CardPreviewScreen) obj;
        return Intrinsics.areEqual(this.blockersData, cardPreviewScreen.blockersData) && Intrinsics.areEqual(this.backScreen, cardPreviewScreen.backScreen) && Intrinsics.areEqual(this.preselectedCard, cardPreviewScreen.preselectedCard) && Intrinsics.areEqual(this.title, cardPreviewScreen.title) && Intrinsics.areEqual(this.appThemeInformation, cardPreviewScreen.appThemeInformation) && Intrinsics.areEqual(this.appThemeInformationColor, cardPreviewScreen.appThemeInformationColor) && Intrinsics.areEqual(this.description, cardPreviewScreen.description) && Intrinsics.areEqual(this.personalize, cardPreviewScreen.personalize) && Intrinsics.areEqual(this.editPersonalization, cardPreviewScreen.editPersonalization) && Intrinsics.areEqual(this.order, cardPreviewScreen.order) && this.cashtagDisplay == cardPreviewScreen.cashtagDisplay && Intrinsics.areEqual(this.cashtag, cardPreviewScreen.cashtag) && this.customizationEligible == cardPreviewScreen.customizationEligible && this.cardPresentationStyle == cardPreviewScreen.cardPresentationStyle && this.available == cardPreviewScreen.available && Intrinsics.areEqual(this.sheetTitle, cardPreviewScreen.sheetTitle) && Intrinsics.areEqual(this.sheetDescription, cardPreviewScreen.sheetDescription) && this.sheetImage == cardPreviewScreen.sheetImage && Intrinsics.areEqual(this.availableStamps, cardPreviewScreen.availableStamps) && this.paymentMethod == cardPreviewScreen.paymentMethod;
    }

    public final CardStyleScreen getBackScreen() {
        return this.backScreen;
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        int hashCode = this.blockersData.hashCode() * 31;
        CardStyleScreen cardStyleScreen = this.backScreen;
        int hashCode2 = (hashCode + (cardStyleScreen == null ? 0 : cardStyleScreen.hashCode())) * 31;
        CardCustomizationBlocker.CardOption cardOption = this.preselectedCard;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (cardOption == null ? 0 : cardOption.hashCode())) * 31, 31, this.title);
        String str = this.appThemeInformation;
        int hashCode3 = (m + (str == null ? 0 : str.hashCode())) * 31;
        Color color = this.appThemeInformationColor;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (color == null ? 0 : color.hashCode())) * 31, 31, this.description);
        String str2 = this.personalize;
        int hashCode4 = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.editPersonalization;
        int hashCode5 = (this.cashtagDisplay.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.order)) * 31;
        Redacted redacted = this.cashtag;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.cardPresentationStyle.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (redacted == null ? 0 : redacted.hashCode())) * 31, 31, this.customizationEligible)) * 31, 31, this.available);
        String str4 = this.sheetTitle;
        int hashCode6 = (m3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sheetDescription;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage localSheetImage = this.sheetImage;
        int m4 = Recorder$$ExternalSyntheticOutline2.m((hashCode7 + (localSheetImage == null ? 0 : localSheetImage.hashCode())) * 31, 31, this.availableStamps);
        PaymentMethod paymentMethod = this.paymentMethod;
        return m4 + (paymentMethod != null ? paymentMethod.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardPreviewScreen(blockersData=");
        sb.append(this.blockersData);
        sb.append(", backScreen=");
        sb.append(this.backScreen);
        sb.append(", preselectedCard=");
        sb.append(this.preselectedCard);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", appThemeInformation=");
        sb.append(this.appThemeInformation);
        sb.append(", appThemeInformationColor=");
        sb.append(this.appThemeInformationColor);
        sb.append(", description=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.description, ", personalize=", this.personalize, ", editPersonalization=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.editPersonalization, ", order=", this.order, ", cashtagDisplay=");
        sb.append(this.cashtagDisplay);
        sb.append(", cashtag=");
        sb.append(this.cashtag);
        sb.append(", customizationEligible=");
        sb.append(this.customizationEligible);
        sb.append(", cardPresentationStyle=");
        sb.append(this.cardPresentationStyle);
        sb.append(", available=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.available, ", sheetTitle=", this.sheetTitle, ", sheetDescription=");
        sb.append(this.sheetDescription);
        sb.append(", sheetImage=");
        sb.append(this.sheetImage);
        sb.append(", availableStamps=");
        sb.append(this.availableStamps);
        sb.append(", paymentMethod=");
        sb.append(this.paymentMethod);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        CardStyleScreen cardStyleScreen = this.backScreen;
        if (cardStyleScreen == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardStyleScreen.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.preselectedCard, i);
        parcel.writeString(this.title);
        parcel.writeString(this.appThemeInformation);
        parcel.writeParcelable(this.appThemeInformationColor, i);
        parcel.writeString(this.description);
        parcel.writeString(this.personalize);
        parcel.writeString(this.editPersonalization);
        parcel.writeString(this.order);
        parcel.writeString(this.cashtagDisplay.name());
        parcel.writeParcelable(this.cashtag, i);
        parcel.writeInt(this.customizationEligible ? 1 : 0);
        parcel.writeString(this.cardPresentationStyle.name());
        parcel.writeInt(this.available ? 1 : 0);
        parcel.writeString(this.sheetTitle);
        parcel.writeString(this.sheetDescription);
        CardCustomizationBlocker.PreviewHalfSheetContent.LocalSheetImage localSheetImage = this.sheetImage;
        if (localSheetImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(localSheetImage.name());
        }
        parcel.writeStringList(this.availableStamps);
        PaymentMethod paymentMethod = this.paymentMethod;
        if (paymentMethod == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(paymentMethod.name());
        }
    }
}
