package com.squareup.cash.shopping.sup.backend;

import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SUPWebSession {
    public final InAppBrowserMetadata.EntityInformation entityInformation;
    public final String supToken;
    public final String url;
    public final String userAgent;

    public SUPWebSession(String str, InAppBrowserMetadata.EntityInformation entityInformation, String str2, String str3) {
        this.url = str;
        this.entityInformation = entityInformation;
        this.userAgent = str2;
        this.supToken = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SUPWebSession)) {
            return false;
        }
        SUPWebSession sUPWebSession = (SUPWebSession) obj;
        return Intrinsics.areEqual(this.url, sUPWebSession.url) && Intrinsics.areEqual(this.entityInformation, sUPWebSession.entityInformation) && Intrinsics.areEqual(this.userAgent, sUPWebSession.userAgent) && Intrinsics.areEqual(this.supToken, sUPWebSession.supToken);
    }

    public final int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        InAppBrowserMetadata.EntityInformation entityInformation = this.entityInformation;
        int hashCode2 = (hashCode + (entityInformation == null ? 0 : entityInformation.hashCode())) * 31;
        String str2 = this.userAgent;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.supToken;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SUPWebSession(url=");
        sb.append(this.url);
        sb.append(", entityInformation=");
        sb.append(this.entityInformation);
        sb.append(", userAgent=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.userAgent, ", supToken=", this.supToken, ")");
    }
}
