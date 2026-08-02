package com.squareup.cash.card.onboarding.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.screens.Redacted;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CardStyleScreen implements BlockersScreens {
    public static final Parcelable.Creator<CardStyleScreen> CREATOR = new CheckCaptureQuestion.Creator(1);
    public final List availableStamps;
    public final BlockersData blockersData;
    public final List cardSections;
    public final Redacted cashtag;
    public final String cashtag_toggle_text;
    public final String customization_prompt_text;
    public final String customization_title_text;
    public final float maximum_ink_coverage;
    public final String return_to_draw_mode_text;
    public final String stamp_added_text;
    public final String style_picker_short_title_text;
    public final String style_picker_title_text;
    public final String too_much_ink_message;

    public CardStyleScreen(BlockersData blockersData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, List list, Redacted redacted, List list2) {
        blockersData.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        list.getClass();
        list2.getClass();
        this.blockersData = blockersData;
        this.style_picker_title_text = str;
        this.style_picker_short_title_text = str2;
        this.customization_prompt_text = str3;
        this.cashtag_toggle_text = str4;
        this.customization_title_text = str5;
        this.stamp_added_text = str6;
        this.return_to_draw_mode_text = str7;
        this.too_much_ink_message = str8;
        this.maximum_ink_coverage = f;
        this.cardSections = list;
        this.cashtag = redacted;
        this.availableStamps = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardStyleScreen)) {
            return false;
        }
        CardStyleScreen cardStyleScreen = (CardStyleScreen) obj;
        return Intrinsics.areEqual(this.blockersData, cardStyleScreen.blockersData) && Intrinsics.areEqual(this.style_picker_title_text, cardStyleScreen.style_picker_title_text) && Intrinsics.areEqual(this.style_picker_short_title_text, cardStyleScreen.style_picker_short_title_text) && Intrinsics.areEqual(this.customization_prompt_text, cardStyleScreen.customization_prompt_text) && Intrinsics.areEqual(this.cashtag_toggle_text, cardStyleScreen.cashtag_toggle_text) && Intrinsics.areEqual(this.customization_title_text, cardStyleScreen.customization_title_text) && Intrinsics.areEqual(this.stamp_added_text, cardStyleScreen.stamp_added_text) && Intrinsics.areEqual(this.return_to_draw_mode_text, cardStyleScreen.return_to_draw_mode_text) && Intrinsics.areEqual(this.too_much_ink_message, cardStyleScreen.too_much_ink_message) && Float.compare(this.maximum_ink_coverage, cardStyleScreen.maximum_ink_coverage) == 0 && Intrinsics.areEqual(this.cardSections, cardStyleScreen.cardSections) && Intrinsics.areEqual(this.cashtag, cardStyleScreen.cashtag) && Intrinsics.areEqual(this.availableStamps, cardStyleScreen.availableStamps);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blockersData.hashCode() * 31, 31, this.style_picker_title_text), 31, this.style_picker_short_title_text), 31, this.customization_prompt_text), 31, this.cashtag_toggle_text), 31, this.customization_title_text), 31, this.stamp_added_text), 31, this.return_to_draw_mode_text);
        String str = this.too_much_ink_message;
        int m2 = Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.maximum_ink_coverage, (m + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.cardSections);
        Redacted redacted = this.cashtag;
        return this.availableStamps.hashCode() + ((m2 + (redacted != null ? redacted.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.blockersData, "CardStyleScreen(blockersData=", ", style_picker_title_text=", this.style_picker_title_text, ", style_picker_short_title_text=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.style_picker_short_title_text, ", customization_prompt_text=", this.customization_prompt_text, ", cashtag_toggle_text=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.cashtag_toggle_text, ", customization_title_text=", this.customization_title_text, ", stamp_added_text=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.stamp_added_text, ", return_to_draw_mode_text=", this.return_to_draw_mode_text, ", too_much_ink_message=");
        m.append(this.too_much_ink_message);
        m.append(", maximum_ink_coverage=");
        m.append(this.maximum_ink_coverage);
        m.append(", cardSections=");
        m.append(this.cardSections);
        m.append(", cashtag=");
        m.append(this.cashtag);
        m.append(", availableStamps=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(m, this.availableStamps, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeString(this.style_picker_title_text);
        parcel.writeString(this.style_picker_short_title_text);
        parcel.writeString(this.customization_prompt_text);
        parcel.writeString(this.cashtag_toggle_text);
        parcel.writeString(this.customization_title_text);
        parcel.writeString(this.stamp_added_text);
        parcel.writeString(this.return_to_draw_mode_text);
        parcel.writeString(this.too_much_ink_message);
        parcel.writeFloat(this.maximum_ink_coverage);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.cardSections, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        parcel.writeParcelable(this.cashtag, i);
        parcel.writeStringList(this.availableStamps);
    }
}
