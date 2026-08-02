package com.squareup.cash.data.profile;

import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.ui.FullCashtag;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PublicProfile {
    public final Color accentColor;
    public final Boolean cashtagUrlEnabled;
    public final FullCashtag fullCashtag;
    public final String fullName;
    public final Boolean isVerifiedAccount;
    public final String photoUrl;

    public PublicProfile(String str, String str2, FullCashtag fullCashtag, Boolean bool, Boolean bool2, Color color) {
        this.fullName = str;
        this.photoUrl = str2;
        this.fullCashtag = fullCashtag;
        this.cashtagUrlEnabled = bool;
        this.isVerifiedAccount = bool2;
        this.accentColor = color;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublicProfile)) {
            return false;
        }
        PublicProfile publicProfile = (PublicProfile) obj;
        return Intrinsics.areEqual(this.fullName, publicProfile.fullName) && Intrinsics.areEqual(this.photoUrl, publicProfile.photoUrl) && Intrinsics.areEqual(this.fullCashtag, publicProfile.fullCashtag) && Intrinsics.areEqual(this.cashtagUrlEnabled, publicProfile.cashtagUrlEnabled) && Intrinsics.areEqual(this.isVerifiedAccount, publicProfile.isVerifiedAccount) && this.accentColor.equals(publicProfile.accentColor);
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final int hashCode() {
        String str = this.fullName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.photoUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        FullCashtag fullCashtag = this.fullCashtag;
        int hashCode3 = (hashCode2 + (fullCashtag == null ? 0 : fullCashtag.hashCode())) * 31;
        Boolean bool = this.cashtagUrlEnabled;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isVerifiedAccount;
        return this.accentColor.hashCode() + ((hashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PublicProfile(fullName=", this.fullName, ", photoUrl=", this.photoUrl, ", fullCashtag=");
        m.append(this.fullCashtag);
        m.append(", cashtagUrlEnabled=");
        m.append(this.cashtagUrlEnabled);
        m.append(", isVerifiedAccount=");
        m.append(this.isVerifiedAccount);
        m.append(", accentColor=");
        m.append(this.accentColor);
        m.append(")");
        return m.toString();
    }
}
