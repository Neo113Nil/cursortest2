package com.squareup.cash.payments.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.payments.screens.NearbyAvatarInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NearbyPerson {
    public final NearbyAvatarInfo avatar;
    public final String cashtag;
    public final String customerToken;
    public final String name;
    public final String nearbySessionToken;

    public NearbyPerson(NearbyAvatarInfo nearbyAvatarInfo, String str, String str2, String str3, String str4) {
        this.avatar = nearbyAvatarInfo;
        this.name = str;
        this.customerToken = str2;
        this.cashtag = str3;
        this.nearbySessionToken = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPerson)) {
            return false;
        }
        NearbyPerson nearbyPerson = (NearbyPerson) obj;
        return this.avatar.equals(nearbyPerson.avatar) && this.name.equals(nearbyPerson.name) && this.customerToken.equals(nearbyPerson.customerToken) && this.cashtag.equals(nearbyPerson.cashtag) && Intrinsics.areEqual(this.nearbySessionToken, nearbyPerson.nearbySessionToken);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.avatar.hashCode() * 31, 31, this.name), 31, this.customerToken), 31, this.cashtag);
        String str = this.nearbySessionToken;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyPerson(avatar=");
        sb.append(this.avatar);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", customerToken=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.customerToken, ", cashtag=", this.cashtag, ", nearbySessionToken=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.nearbySessionToken, ")");
    }
}
