package com.squareup.cash.family.familyhub.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FamilyPendingRequestsViewModel {
    public final String emptyStateSubtitle;
    public final String emptyStateTitle;
    public final List pendingRequestRows;
    public final String toolbarTitle;

    public FamilyPendingRequestsViewModel(String str, String str2, String str3, ArrayList arrayList) {
        str.getClass();
        arrayList.getClass();
        str2.getClass();
        str3.getClass();
        this.toolbarTitle = str;
        this.pendingRequestRows = arrayList;
        this.emptyStateTitle = str2;
        this.emptyStateSubtitle = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FamilyPendingRequestsViewModel)) {
            return false;
        }
        FamilyPendingRequestsViewModel familyPendingRequestsViewModel = (FamilyPendingRequestsViewModel) obj;
        return Intrinsics.areEqual(this.toolbarTitle, familyPendingRequestsViewModel.toolbarTitle) && Intrinsics.areEqual(this.pendingRequestRows, familyPendingRequestsViewModel.pendingRequestRows) && Intrinsics.areEqual(this.emptyStateTitle, familyPendingRequestsViewModel.emptyStateTitle) && Intrinsics.areEqual(this.emptyStateSubtitle, familyPendingRequestsViewModel.emptyStateSubtitle);
    }

    public final int hashCode() {
        return this.emptyStateSubtitle.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.toolbarTitle.hashCode() * 31, 31, this.pendingRequestRows), 31, this.emptyStateTitle);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("FamilyPendingRequestsViewModel(toolbarTitle=", this.toolbarTitle, ", pendingRequestRows=", ", emptyStateTitle=", this.pendingRequestRows), this.emptyStateTitle, ", emptyStateSubtitle=", this.emptyStateSubtitle, ")");
    }
}
