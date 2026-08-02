package com.squareup.cash.investing.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SectionMoreInfoViewModel {
    public final String closeText;
    public final String description;
    public final String title;
    public final String urlText;

    public SectionMoreInfoViewModel(String str, String str2, String str3, String str4) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str4);
        this.title = str;
        this.description = str2;
        this.urlText = str3;
        this.closeText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionMoreInfoViewModel)) {
            return false;
        }
        SectionMoreInfoViewModel sectionMoreInfoViewModel = (SectionMoreInfoViewModel) obj;
        return Intrinsics.areEqual(this.title, sectionMoreInfoViewModel.title) && Intrinsics.areEqual(this.description, sectionMoreInfoViewModel.description) && Intrinsics.areEqual(this.urlText, sectionMoreInfoViewModel.urlText) && Intrinsics.areEqual(this.closeText, sectionMoreInfoViewModel.closeText);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description);
        String str = this.urlText;
        return this.closeText.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SectionMoreInfoViewModel(title=", this.title, ", description=", this.description, ", urlText="), this.urlText, ", closeText=", this.closeText, ")");
    }
}
