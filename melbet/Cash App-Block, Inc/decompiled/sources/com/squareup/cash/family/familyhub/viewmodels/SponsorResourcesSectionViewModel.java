package com.squareup.cash.family.familyhub.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SponsorResourcesSectionViewModel {
    public final List rows;
    public final String title;

    public SponsorResourcesSectionViewModel(String str, List list) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.rows = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsorResourcesSectionViewModel)) {
            return false;
        }
        SponsorResourcesSectionViewModel sponsorResourcesSectionViewModel = (SponsorResourcesSectionViewModel) obj;
        return Intrinsics.areEqual(this.title, sponsorResourcesSectionViewModel.title) && Intrinsics.areEqual(this.rows, sponsorResourcesSectionViewModel.rows);
    }

    public final int hashCode() {
        return this.rows.hashCode() + (this.title.hashCode() * 961);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("SponsorResourcesSectionViewModel(title=", this.title, ", body=null, rows=", ")", this.rows);
    }
}
