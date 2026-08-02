package com.squareup.cash.profile.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SponsoredFamilyMember {
    public final String accountToken;
    public final String cashtag;
    public final String displayName;
    public final boolean notificationsEnabled;
    public boolean notificationsTurnedOn;
    public final Image profilePicture;

    public SponsoredFamilyMember(String str, String str2, String str3, Image image, boolean z, boolean z2) {
        this.accountToken = str;
        this.displayName = str2;
        this.cashtag = str3;
        this.profilePicture = image;
        this.notificationsEnabled = z;
        this.notificationsTurnedOn = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsoredFamilyMember)) {
            return false;
        }
        SponsoredFamilyMember sponsoredFamilyMember = (SponsoredFamilyMember) obj;
        return Intrinsics.areEqual(this.accountToken, sponsoredFamilyMember.accountToken) && Intrinsics.areEqual(this.displayName, sponsoredFamilyMember.displayName) && Intrinsics.areEqual(this.cashtag, sponsoredFamilyMember.cashtag) && Intrinsics.areEqual(this.profilePicture, sponsoredFamilyMember.profilePicture) && this.notificationsEnabled == sponsoredFamilyMember.notificationsEnabled && this.notificationsTurnedOn == sponsoredFamilyMember.notificationsTurnedOn;
    }

    public final int hashCode() {
        String str = this.accountToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cashtag;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Image image = this.profilePicture;
        return Boolean.hashCode(this.notificationsTurnedOn) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (image != null ? image.hashCode() : 0)) * 31, 31, this.notificationsEnabled);
    }

    public final String toString() {
        boolean z = this.notificationsTurnedOn;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SponsoredFamilyMember(accountToken=", this.accountToken, ", displayName=", this.displayName, ", cashtag=");
        m.append(this.cashtag);
        m.append(", profilePicture=");
        m.append(this.profilePicture);
        m.append(", notificationsEnabled=");
        return Request$Priority$EnumUnboxingLocalUtility.m(m, this.notificationsEnabled, ", notificationsTurnedOn=", z, ")");
    }
}
