package com.squareup.cash.family.familyhub.viewmodels;

import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SponsorResourcesRowViewModel {
    public final Icon icon;
    public final String title;
    public final String url;

    public SponsorResourcesRowViewModel(Icon icon, String str, String str2) {
        str.getClass();
        this.title = str;
        this.url = str2;
        this.icon = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsorResourcesRowViewModel)) {
            return false;
        }
        SponsorResourcesRowViewModel sponsorResourcesRowViewModel = (SponsorResourcesRowViewModel) obj;
        return Intrinsics.areEqual(this.title, sponsorResourcesRowViewModel.title) && this.url.equals(sponsorResourcesRowViewModel.url) && this.icon.equals(sponsorResourcesRowViewModel.icon);
    }

    public final int hashCode() {
        return this.icon.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.url);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SponsorResourcesRowViewModel(title=", this.title, ", url=", this.url, ", icon=");
        m.append(this.icon);
        m.append(")");
        return m.toString();
    }
}
