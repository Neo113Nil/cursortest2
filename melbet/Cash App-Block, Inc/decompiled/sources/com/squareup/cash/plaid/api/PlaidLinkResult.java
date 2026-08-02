package com.squareup.cash.plaid.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class PlaidLinkResult {

    public final class Exit extends PlaidLinkResult {
        public final Institution institution;

        public Exit(Institution institution) {
            this.institution = institution;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Exit) && this.institution.equals(((Exit) obj).institution);
        }

        public final int hashCode() {
            return this.institution.hashCode();
        }

        public final String toString() {
            return "Exit(institution=" + this.institution + ")";
        }
    }

    public final class Success extends PlaidLinkResult {
        public final Institution institution;
        public final String metadataJson;
        public final String publicToken;

        public Success(String str, Institution institution, String str2) {
            str.getClass();
            str2.getClass();
            this.publicToken = str;
            this.institution = institution;
            this.metadataJson = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(this.publicToken, success.publicToken) && this.institution.equals(success.institution) && Intrinsics.areEqual(this.metadataJson, success.metadataJson);
        }

        public final int hashCode() {
            return this.metadataJson.hashCode() + ((this.institution.hashCode() + (this.publicToken.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(publicToken=");
            sb.append(this.publicToken);
            sb.append(", institution=");
            sb.append(this.institution);
            sb.append(", metadataJson=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.metadataJson, ")");
        }
    }
}
