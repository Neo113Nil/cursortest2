package com.squareup.cash.card.onboarding;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DisclosureViewModel {
    public final String acceptButtonText;
    public final String descriptionText;
    public final String footerText;
    public final boolean hasFullyScrolled;
    public final String headLineText;
    public final boolean isLoading;
    public final List lineItemList;
    public final List moreInfoPanelLineItems;
    public final String scrollButtonText;

    public DisclosureViewModel(String str, List list, String str2, List list2, String str3, String str4, boolean z, String str5, boolean z2) {
        str.getClass();
        list.getClass();
        str2.getClass();
        list2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.headLineText = str;
        this.lineItemList = list;
        this.descriptionText = str2;
        this.moreInfoPanelLineItems = list2;
        this.footerText = str3;
        this.scrollButtonText = str4;
        this.hasFullyScrolled = z;
        this.acceptButtonText = str5;
        this.isLoading = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisclosureViewModel)) {
            return false;
        }
        DisclosureViewModel disclosureViewModel = (DisclosureViewModel) obj;
        return Intrinsics.areEqual(this.headLineText, disclosureViewModel.headLineText) && Intrinsics.areEqual(this.lineItemList, disclosureViewModel.lineItemList) && Intrinsics.areEqual(this.descriptionText, disclosureViewModel.descriptionText) && Intrinsics.areEqual(this.moreInfoPanelLineItems, disclosureViewModel.moreInfoPanelLineItems) && Intrinsics.areEqual(this.footerText, disclosureViewModel.footerText) && Intrinsics.areEqual(this.scrollButtonText, disclosureViewModel.scrollButtonText) && this.hasFullyScrolled == disclosureViewModel.hasFullyScrolled && Intrinsics.areEqual(this.acceptButtonText, disclosureViewModel.acceptButtonText) && this.isLoading == disclosureViewModel.isLoading;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isLoading) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.headLineText.hashCode() * 31, 31, this.lineItemList), 31, this.descriptionText), 31, this.moreInfoPanelLineItems), 31, this.footerText), 31, this.scrollButtonText), 31, this.hasFullyScrolled), 31, this.acceptButtonText);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("DisclosureViewModel(headLineText=", this.headLineText, ", lineItemList=", ", descriptionText=", this.lineItemList);
        NavAction$$ExternalSyntheticOutline0.m(this.descriptionText, ", moreInfoPanelLineItems=", ", footerText=", m, this.moreInfoPanelLineItems);
        Boxes$$ExternalSyntheticOutline1.m(m, this.footerText, ", scrollButtonText=", this.scrollButtonText, ", hasFullyScrolled=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.hasFullyScrolled, ", acceptButtonText=", this.acceptButtonText, ", isLoading=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isLoading, ")");
    }
}
