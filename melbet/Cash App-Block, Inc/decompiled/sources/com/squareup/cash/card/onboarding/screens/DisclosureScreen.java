package com.squareup.cash.card.onboarding.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;
import com.squareup.cash.screens.Redacted;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DisclosureScreen implements BlockersScreens {
    public static final Parcelable.Creator<DisclosureScreen> CREATOR = new CheckCaptureQuestion.Creator(3);
    public final String acceptButtonText;
    public final BlockersData blockersData;
    public final String cancelDialogCancelText;
    public final String cancelDialogConfirmText;
    public final String cancelDialogText;
    public final String descriptionText;
    public final String footerText;
    public final Redacted headlineText;
    public final List lineItems;
    public final List moreInfoPanelLineItems;
    public final String scrollButtonText;

    public DisclosureScreen(BlockersData blockersData, Redacted redacted, List list, String str, String str2, String str3, List list2, String str4, String str5, String str6, String str7) {
        blockersData.getClass();
        redacted.getClass();
        list.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        list2.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        this.blockersData = blockersData;
        this.headlineText = redacted;
        this.lineItems = list;
        this.descriptionText = str;
        this.scrollButtonText = str2;
        this.acceptButtonText = str3;
        this.moreInfoPanelLineItems = list2;
        this.footerText = str4;
        this.cancelDialogText = str5;
        this.cancelDialogCancelText = str6;
        this.cancelDialogConfirmText = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisclosureScreen)) {
            return false;
        }
        DisclosureScreen disclosureScreen = (DisclosureScreen) obj;
        return Intrinsics.areEqual(this.blockersData, disclosureScreen.blockersData) && Intrinsics.areEqual(this.headlineText, disclosureScreen.headlineText) && Intrinsics.areEqual(this.lineItems, disclosureScreen.lineItems) && Intrinsics.areEqual(this.descriptionText, disclosureScreen.descriptionText) && Intrinsics.areEqual(this.scrollButtonText, disclosureScreen.scrollButtonText) && Intrinsics.areEqual(this.acceptButtonText, disclosureScreen.acceptButtonText) && Intrinsics.areEqual(this.moreInfoPanelLineItems, disclosureScreen.moreInfoPanelLineItems) && Intrinsics.areEqual(this.footerText, disclosureScreen.footerText) && Intrinsics.areEqual(this.cancelDialogText, disclosureScreen.cancelDialogText) && Intrinsics.areEqual(this.cancelDialogCancelText, disclosureScreen.cancelDialogCancelText) && Intrinsics.areEqual(this.cancelDialogConfirmText, disclosureScreen.cancelDialogConfirmText);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.cancelDialogConfirmText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(re$$ExternalSyntheticOutline0.m(this.headlineText, this.blockersData.hashCode() * 31, 31), 31, this.lineItems), 31, this.descriptionText), 31, this.scrollButtonText), 31, this.acceptButtonText), 31, this.moreInfoPanelLineItems), 31, this.footerText), 31, this.cancelDialogText), 31, this.cancelDialogCancelText);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisclosureScreen(blockersData=");
        sb.append(this.blockersData);
        sb.append(", headlineText=");
        sb.append(this.headlineText);
        sb.append(", lineItems=");
        Recorder$$ExternalSyntheticOutline2.m(", descriptionText=", this.descriptionText, ", scrollButtonText=", sb, this.lineItems);
        Boxes$$ExternalSyntheticOutline1.m(sb, this.scrollButtonText, ", acceptButtonText=", this.acceptButtonText, ", moreInfoPanelLineItems=");
        Recorder$$ExternalSyntheticOutline2.m(", footerText=", this.footerText, ", cancelDialogText=", sb, this.moreInfoPanelLineItems);
        Boxes$$ExternalSyntheticOutline1.m(sb, this.cancelDialogText, ", cancelDialogCancelText=", this.cancelDialogCancelText, ", cancelDialogConfirmText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.cancelDialogConfirmText, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.headlineText, i);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.lineItems, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        parcel.writeString(this.descriptionText);
        parcel.writeString(this.scrollButtonText);
        parcel.writeString(this.acceptButtonText);
        Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.moreInfoPanelLineItems, parcel);
        while (m2.hasNext()) {
            parcel.writeParcelable((Parcelable) m2.next(), i);
        }
        parcel.writeString(this.footerText);
        parcel.writeString(this.cancelDialogText);
        parcel.writeString(this.cancelDialogCancelText);
        parcel.writeString(this.cancelDialogConfirmText);
    }
}
