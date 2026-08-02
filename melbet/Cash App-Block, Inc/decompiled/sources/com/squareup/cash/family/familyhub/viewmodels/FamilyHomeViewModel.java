package com.squareup.cash.family.familyhub.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.protos.franklin.api.FormBlocker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FamilyHomeViewModel {
    public final ArrayList headerAvatars;
    public final List listSections;
    public final FamilyMemberSection membersSection;
    public final FamilyPendingInvitesViewModel pendingInvites;
    public final FamilyPendingRequestsSection pendingRequestsSection;
    public final String toolbarTitle;
    public final FormBlocker.Element.UpsellElement upsellElement;

    public FamilyHomeViewModel(String str, ArrayList arrayList, FamilyPendingRequestsSection familyPendingRequestsSection, FamilyPendingInvitesViewModel familyPendingInvitesViewModel, FamilyMemberSection familyMemberSection, List list, FormBlocker.Element.UpsellElement upsellElement) {
        str.getClass();
        list.getClass();
        this.toolbarTitle = str;
        this.headerAvatars = arrayList;
        this.pendingRequestsSection = familyPendingRequestsSection;
        this.pendingInvites = familyPendingInvitesViewModel;
        this.membersSection = familyMemberSection;
        this.listSections = list;
        this.upsellElement = upsellElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FamilyHomeViewModel)) {
            return false;
        }
        FamilyHomeViewModel familyHomeViewModel = (FamilyHomeViewModel) obj;
        return Intrinsics.areEqual(this.toolbarTitle, familyHomeViewModel.toolbarTitle) && this.headerAvatars.equals(familyHomeViewModel.headerAvatars) && Intrinsics.areEqual(this.pendingRequestsSection, familyHomeViewModel.pendingRequestsSection) && this.pendingInvites.equals(familyHomeViewModel.pendingInvites) && this.membersSection.equals(familyHomeViewModel.membersSection) && Intrinsics.areEqual(this.listSections, familyHomeViewModel.listSections) && Intrinsics.areEqual(this.upsellElement, familyHomeViewModel.upsellElement);
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.headerAvatars, this.toolbarTitle.hashCode() * 31, 31);
        FamilyPendingRequestsSection familyPendingRequestsSection = this.pendingRequestsSection;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((this.membersSection.hashCode() + ((this.pendingInvites.hashCode() + ((m + (familyPendingRequestsSection == null ? 0 : familyPendingRequestsSection.hashCode())) * 31)) * 31)) * 31, 31, this.listSections);
        FormBlocker.Element.UpsellElement upsellElement = this.upsellElement;
        return m2 + (upsellElement != null ? upsellElement.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = CameraState$Type$EnumUnboxingLocalUtility.m(this.headerAvatars, "FamilyHomeViewModel(toolbarTitle=", this.toolbarTitle, ", headerAvatars=", ", pendingRequestsSection=");
        m.append(this.pendingRequestsSection);
        m.append(", pendingInvites=");
        m.append(this.pendingInvites);
        m.append(", membersSection=");
        m.append(this.membersSection);
        m.append(", listSections=");
        m.append(this.listSections);
        m.append(", upsellElement=");
        m.append(this.upsellElement);
        m.append(")");
        return m.toString();
    }
}
