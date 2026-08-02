package com.squareup.cash.offers.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersGreenStatusViewModel {
    public final String buttonText;
    public final String linkText;
    public final String subtitle;
    public final String title;

    public OffersGreenStatusViewModel(String str, String str2, String str3, String str4) {
        str.getClass();
        str4.getClass();
        this.title = str;
        this.subtitle = str2;
        this.linkText = str3;
        this.buttonText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersGreenStatusViewModel)) {
            return false;
        }
        OffersGreenStatusViewModel offersGreenStatusViewModel = (OffersGreenStatusViewModel) obj;
        return Intrinsics.areEqual(this.title, offersGreenStatusViewModel.title) && this.subtitle.equals(offersGreenStatusViewModel.subtitle) && this.linkText.equals(offersGreenStatusViewModel.linkText) && Intrinsics.areEqual(this.buttonText, offersGreenStatusViewModel.buttonText);
    }

    public final int hashCode() {
        return this.buttonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31, this.linkText);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OffersGreenStatusViewModel(title=", this.title, ", subtitle=", this.subtitle, ", linkText="), this.linkText, ", buttonText=", this.buttonText, ")");
    }
}
