package com.squareup.cash.blockers.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.Region;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SsnViewModel {
    public final String hint;
    public final boolean hyphenate;
    public final boolean isLoading;
    public final Region region;
    public final boolean showHelpButton;
    public final String ssn;
    public final int ssnLength;
    public final String title;

    public SsnViewModel(String str, String str2, int i, boolean z, Region region, boolean z2, String str3, boolean z3) {
        str.getClass();
        str2.getClass();
        region.getClass();
        this.title = str;
        this.hint = str2;
        this.ssnLength = i;
        this.hyphenate = z;
        this.region = region;
        this.isLoading = z2;
        this.ssn = str3;
        this.showHelpButton = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SsnViewModel)) {
            return false;
        }
        SsnViewModel ssnViewModel = (SsnViewModel) obj;
        return Intrinsics.areEqual(this.title, ssnViewModel.title) && Intrinsics.areEqual(this.hint, ssnViewModel.hint) && this.ssnLength == ssnViewModel.ssnLength && this.hyphenate == ssnViewModel.hyphenate && this.region == ssnViewModel.region && this.isLoading == ssnViewModel.isLoading && Intrinsics.areEqual(this.ssn, ssnViewModel.ssn) && this.showHelpButton == ssnViewModel.showHelpButton;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.region.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.ssnLength, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.hint), 31), 31, this.hyphenate)) * 31, 31, this.isLoading);
        String str = this.ssn;
        return Boolean.hashCode(this.showHelpButton) + ((m + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SsnViewModel(title=", this.title, ", hint=", this.hint, ", ssnLength=");
        m.append(this.ssnLength);
        m.append(", hyphenate=");
        m.append(this.hyphenate);
        m.append(", region=");
        m.append(this.region);
        m.append(", isLoading=");
        m.append(this.isLoading);
        m.append(", ssn=");
        return re$$ExternalSyntheticOutline0.m(m, this.ssn, ", showHelpButton=", this.showHelpButton, ")");
    }
}
