package com.squareup.cash.family.familyhub.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FamilyPendingInvitesViewModel {
    public final boolean isVisible;
    public final List rows;
    public final String sectionTitle;

    public FamilyPendingInvitesViewModel(String str, List list, boolean z) {
        str.getClass();
        list.getClass();
        this.isVisible = z;
        this.sectionTitle = str;
        this.rows = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FamilyPendingInvitesViewModel)) {
            return false;
        }
        FamilyPendingInvitesViewModel familyPendingInvitesViewModel = (FamilyPendingInvitesViewModel) obj;
        return this.isVisible == familyPendingInvitesViewModel.isVisible && Intrinsics.areEqual(this.sectionTitle, familyPendingInvitesViewModel.sectionTitle) && Intrinsics.areEqual(this.rows, familyPendingInvitesViewModel.rows);
    }

    public final int hashCode() {
        return this.rows.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.isVisible) * 31, 31, this.sectionTitle);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(NavAction$$ExternalSyntheticOutline0.m("FamilyPendingInvitesViewModel(isVisible=", ", sectionTitle=", this.sectionTitle, ", rows=", this.isVisible), this.rows, ")");
    }
}
