package com.squareup.cash.account.backend;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/account/backend/PrincipalAccountTokenSomeJson;", "", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PrincipalAccountTokenSomeJson {
    public final String accountToken;
    public final String switchingIdentifier;

    public PrincipalAccountTokenSomeJson(String str, String str2) {
        str.getClass();
        this.accountToken = str;
        this.switchingIdentifier = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrincipalAccountTokenSomeJson)) {
            return false;
        }
        PrincipalAccountTokenSomeJson principalAccountTokenSomeJson = (PrincipalAccountTokenSomeJson) obj;
        return Intrinsics.areEqual(this.accountToken, principalAccountTokenSomeJson.accountToken) && Intrinsics.areEqual(this.switchingIdentifier, principalAccountTokenSomeJson.switchingIdentifier);
    }

    public final int hashCode() {
        int hashCode = this.accountToken.hashCode() * 31;
        String str = this.switchingIdentifier;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("PrincipalAccountTokenSomeJson(accountToken=", this.accountToken, ", switchingIdentifier=", this.switchingIdentifier, ")");
    }
}
