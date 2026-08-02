package com.squareup.cash.invitations;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InviteContactsReferralRulesViewModel {
    public final String enableReferralTextFooter;
    public final List enableReferralTextSteps;
    public final String enableReferralTextSubtitle;
    public final String enableReferralTextTitle;
    public final InviteContactsReferralHeaderModel headerImage;

    public InviteContactsReferralRulesViewModel(InviteContactsReferralHeaderModel inviteContactsReferralHeaderModel, String str, String str2, List list, String str3) {
        list.getClass();
        this.headerImage = inviteContactsReferralHeaderModel;
        this.enableReferralTextTitle = str;
        this.enableReferralTextSubtitle = str2;
        this.enableReferralTextSteps = list;
        this.enableReferralTextFooter = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteContactsReferralRulesViewModel)) {
            return false;
        }
        InviteContactsReferralRulesViewModel inviteContactsReferralRulesViewModel = (InviteContactsReferralRulesViewModel) obj;
        return this.headerImage.equals(inviteContactsReferralRulesViewModel.headerImage) && Intrinsics.areEqual(this.enableReferralTextTitle, inviteContactsReferralRulesViewModel.enableReferralTextTitle) && Intrinsics.areEqual(this.enableReferralTextSubtitle, inviteContactsReferralRulesViewModel.enableReferralTextSubtitle) && Intrinsics.areEqual(this.enableReferralTextSteps, inviteContactsReferralRulesViewModel.enableReferralTextSteps) && Intrinsics.areEqual(this.enableReferralTextFooter, inviteContactsReferralRulesViewModel.enableReferralTextFooter);
    }

    public final int hashCode() {
        int hashCode = this.headerImage.hashCode() * 31;
        String str = this.enableReferralTextTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.enableReferralTextSubtitle;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.enableReferralTextSteps);
        String str3 = this.enableReferralTextFooter;
        return m + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InviteContactsReferralRulesViewModel(headerImage=");
        sb.append(this.headerImage);
        sb.append(", enableReferralTextTitle=");
        sb.append(this.enableReferralTextTitle);
        sb.append(", enableReferralTextSubtitle=");
        NavAction$$ExternalSyntheticOutline0.m(this.enableReferralTextSubtitle, ", enableReferralTextSteps=", ", enableReferralTextFooter=", sb, this.enableReferralTextSteps);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.enableReferralTextFooter, ")");
    }
}
